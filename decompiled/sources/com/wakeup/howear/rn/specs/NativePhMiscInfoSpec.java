package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhMiscInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhMiscInfo";

    @ReactMethod
    public abstract void getComponentData(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getDeviceVersionInfo(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getHealthData(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getHomeHotSearch(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getHomeTabHeight(Promise promise);

    @ReactMethod
    public abstract void getMessagePushStatus(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startSmartGlassesRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void stopSmartGlassesRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void switchDevice(ReadableMap readableMap, Promise promise);

    public NativePhMiscInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhMiscInfo";
    }
}
