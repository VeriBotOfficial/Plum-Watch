package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhLogSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhLog";

    @ReactMethod
    public abstract void d(String str, String str2);

    @ReactMethod
    public abstract void e(String str, String str2);

    @ReactMethod
    public abstract void i(String str, String str2);

    @ReactMethod
    public abstract void w(String str, String str2);

    public NativePhLogSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }
}
