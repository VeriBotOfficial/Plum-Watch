package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhBluetoothSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhBluetooth";

    @ReactMethod
    public abstract void cancelConnect(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void cancelFileSync(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void connect(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void connectAudioBluetooth(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getAudioBTState(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getBattery(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getBluetoothAdapterState(Promise promise);

    @ReactMethod
    public abstract void getVolume(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void isConnected(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void openBluetoothAdapter(Promise promise);

    @ReactMethod
    public abstract void setVolume(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startFileSync(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void switchLastDevice(ReadableMap readableMap, Promise promise);

    public NativePhBluetoothSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhBluetooth";
    }
}
