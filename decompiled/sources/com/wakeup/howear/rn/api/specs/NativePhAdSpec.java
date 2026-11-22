package com.wakeup.howear.rn.api.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAdSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAd";

    @ReactMethod
    public abstract void getAvailableCount(Promise promise);

    @ReactMethod
    public abstract void pullRefresh(Promise promise);

    @ReactMethod
    public abstract void showRewardAd(Promise promise);

    public NativePhAdSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "PhAd";
    }
}
