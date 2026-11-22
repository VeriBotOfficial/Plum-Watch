package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAccountSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAccount";

    @ReactMethod
    public abstract void getToken(Promise promise);

    @ReactMethod
    public abstract void getUserInfo(Promise promise);

    @ReactMethod
    public abstract void userLogin(Promise promise);

    public NativePhAccountSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhAccount";
    }
}
