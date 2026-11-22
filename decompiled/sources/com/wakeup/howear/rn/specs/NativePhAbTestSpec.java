package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAbTestSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAbTest";

    @ReactMethod
    public abstract void getBoolean(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getInt(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getString(ReadableMap readableMap, Promise promise);

    public NativePhAbTestSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhAbTest";
    }
}
