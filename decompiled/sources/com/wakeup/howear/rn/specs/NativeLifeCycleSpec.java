package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativeLifeCycleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhLifeCycle";

    @ReactMethod
    public abstract void rnContainerLifeCycle(String str);

    public NativeLifeCycleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }
}
