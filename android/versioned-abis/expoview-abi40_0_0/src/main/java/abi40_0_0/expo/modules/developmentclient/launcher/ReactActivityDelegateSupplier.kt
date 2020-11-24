package abi40_0_0.expo.modules.developmentclient.launcher

import abi40_0_0.com.facebook.react.ReactActivityDelegate

@FunctionalInterface
interface ReactActivityDelegateSupplier {
  fun get(): ReactActivityDelegate
}
