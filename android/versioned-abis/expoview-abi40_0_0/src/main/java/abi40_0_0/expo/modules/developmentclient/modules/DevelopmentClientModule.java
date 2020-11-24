package abi40_0_0.expo.modules.developmentclient.modules;

import abi40_0_0.com.facebook.react.bridge.Promise;
import abi40_0_0.com.facebook.react.bridge.ReactApplicationContext;
import abi40_0_0.com.facebook.react.bridge.ReactContextBaseJavaModule;
import abi40_0_0.com.facebook.react.bridge.ReactMethod;
import abi40_0_0.com.facebook.react.bridge.ReadableMap;

import androidx.annotation.NonNull;
import abi40_0_0.expo.modules.developmentclient.DevelopmentClientController;

public class DevelopmentClientModule extends ReactContextBaseJavaModule {
  public DevelopmentClientModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @NonNull
  @Override
  public String getName() {
    return "EXDevelopmentClient";
  }

  @ReactMethod
  public void loadApp(String url, ReadableMap options, final Promise promise) {
    DevelopmentClientController.getInstance().loadApp(url);
    promise.resolve(null);
  }

  @Override
  public boolean hasConstants() {
    return true;
  }
}
