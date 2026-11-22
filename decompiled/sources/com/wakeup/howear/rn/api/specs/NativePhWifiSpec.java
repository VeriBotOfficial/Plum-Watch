package com.wakeup.howear.rn.api.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhWifiSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhWifi";

    @ReactMethod
    public abstract void getShareNetworkState(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void isConnect(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void reconnectWifi(ReadableMap readableMap, Promise promise);

    public NativePhWifiSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhWifi";
    }
}
