package com.reactnativeimageresizer;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes17.dex */
public abstract class NativeImageResizerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageResizer";

    @ReactMethod
    public abstract void createResizedImage(String str, double d, double d2, String str2, double d3, String str3, boolean z, @Nullable Double d4, @Nullable String str4, @Nullable Boolean bool, Promise promise);

    public NativeImageResizerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ImageResizer";
    }
}
