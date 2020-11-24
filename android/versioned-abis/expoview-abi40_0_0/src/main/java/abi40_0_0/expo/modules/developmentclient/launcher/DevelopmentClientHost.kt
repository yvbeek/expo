package abi40_0_0.expo.modules.developmentclient.launcher

import android.app.Application
import abi40_0_0.com.facebook.react.ReactNativeHost
import abi40_0_0.com.facebook.react.shell.MainReactPackage
import abi40_0_0.expo.modules.barcodescanner.BarCodeScannerPackage
import abi40_0_0.expo.modules.developmentclient.DevelopmentClientPackage
import abi40_0_0.host.exp.expoview.R
import abi40_0_0.expo.modules.developmentclient.react.injectDebugServerHost
import org.apache.commons.io.IOUtils
import abi40_0_0.org.unimodules.adapters.react.ModuleRegistryAdapter
import abi40_0_0.org.unimodules.adapters.react.ReactModuleRegistryProvider
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class DevelopmentClientHost(
  application: Application,
  private val launcherIp: String?
) : ReactNativeHost(application) {

  init {
    if (useDeveloperSupport) {
      injectDebugServerHost(application.applicationContext, this, launcherIp!!)
    }
  }

  private val mModuleRegistryProvider = ReactModuleRegistryProvider(
    listOf(BarCodeScannerPackage())
  )

  override fun getUseDeveloperSupport() = launcherIp != null

  override fun getPackages() = listOf(
    MainReactPackage(null),
    DevelopmentClientPackage(),
    ModuleRegistryAdapter(mModuleRegistryProvider)
  )

  override fun getJSBundleFile(): String? {
    // React Native needs an actual file path, while the embedded bundle is a 'raw resource' which
    // doesn't have a true file path. So we write it out to a temporary file then return a path
    // to that file.
    val bundle = File(application.cacheDir.absolutePath + "/expo_development_client_android.bundle")
    return try {
      // TODO(nikki): We could cache this? Biasing toward always using latest for now...
      val output = FileOutputStream(bundle)
      val input = application.resources.openRawResource(R.raw.expo_development_client_android)
      IOUtils.copy(input, output)
      output.close()
      bundle.absolutePath
    } catch (e: IOException) {
      null
    }
  }
}
