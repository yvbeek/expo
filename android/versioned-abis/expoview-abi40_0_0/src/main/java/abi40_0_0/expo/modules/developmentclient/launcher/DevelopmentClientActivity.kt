package abi40_0_0.expo.modules.developmentclient.launcher

import abi40_0_0.com.facebook.react.ReactActivity
import abi40_0_0.com.facebook.react.ReactActivityDelegate
import abi40_0_0.expo.modules.developmentclient.DevelopmentClientController

class DevelopmentClientActivity : ReactActivity() {
  override fun getMainComponentName() = "main"

  override fun createReactActivityDelegate(): ReactActivityDelegate {
    return object : ReactActivityDelegate(this, mainComponentName) {
      override fun getReactNativeHost() = DevelopmentClientController.instance.devClientHost
    }
  }
}
