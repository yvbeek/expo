package abi40_0_0.expo.modules.developmentclient

import abi40_0_0.com.facebook.react.ReactPackage
import abi40_0_0.com.facebook.react.bridge.NativeModule
import abi40_0_0.com.facebook.react.bridge.ReactApplicationContext
import abi40_0_0.com.facebook.react.uimanager.ViewManager
import abi40_0_0.expo.modules.developmentclient.modules.DevelopmentClientDevMenuExtensions
import abi40_0_0.expo.modules.developmentclient.modules.DevelopmentClientModule

class DevelopmentClientPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
    listOf(
      DevelopmentClientModule(reactContext),
      DevelopmentClientDevMenuExtensions(reactContext)
    )

  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> = emptyList()
}
