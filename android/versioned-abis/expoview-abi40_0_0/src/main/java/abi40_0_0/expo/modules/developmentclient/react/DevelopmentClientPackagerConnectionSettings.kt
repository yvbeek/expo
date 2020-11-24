package abi40_0_0.expo.modules.developmentclient.react

import android.content.Context
import abi40_0_0.com.facebook.react.packagerconnection.PackagerConnectionSettings

class DevelopmentClientPackagerConnectionSettings(
  context: Context,
  private var serverIp: String
) : PackagerConnectionSettings(context) {
  override fun getDebugServerHost() = serverIp

  override fun setDebugServerHost(host: String) = Unit
}
