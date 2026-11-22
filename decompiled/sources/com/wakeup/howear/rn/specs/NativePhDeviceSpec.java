package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhDeviceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhDevice";

    @ReactMethod
    public abstract void deleteDevice(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void endRecordAudio(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void endRecordVideo(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getDeviceList(Promise promise);

    @ReactMethod
    public abstract void getHealthDataCard(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getHealthDataDetail(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void requestDeviceMediaStatus(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void resetDevice(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void saveDeviceData(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startRecordAudio(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startRecordVideo(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void syncHealthData(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void takePhoto(ReadableMap readableMap, Promise promise);

    public NativePhDeviceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhDevice";
    }
}
