package expo.interfaces.devmenu

import android.view.View
import abi40_0_0.com.facebook.react.ReactPackage
import abi40_0_0.com.facebook.react.bridge.NativeModule
import abi40_0_0.com.facebook.react.bridge.ReactApplicationContext
import abi40_0_0.com.facebook.react.uimanager.ReactShadowNode
import abi40_0_0.com.facebook.react.uimanager.ViewManager

/**
 * We need this dummy package because otherwise, the react-native auto-linking won't work.
 */
class DevMenuInterfacePackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> = mutableListOf()

  override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()
}
