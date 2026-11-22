package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAppManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAppManager";

    @ReactMethod
    public abstract void checkAppUpdate(Promise promise);

    @ReactMethod
    public abstract void getAppConfig(Promise promise);

    @ReactMethod
    public abstract void getNetworkStatus(Promise promise);

    public NativePhAppManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhAppManager";
    }
}
