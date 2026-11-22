package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhBuryPointSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhBuryPoint";

    @ReactMethod
    public abstract void reportEvent(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void reportImmediately(ReadableMap readableMap, Promise promise);

    public NativePhBuryPointSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhBuryPoint";
    }
}
