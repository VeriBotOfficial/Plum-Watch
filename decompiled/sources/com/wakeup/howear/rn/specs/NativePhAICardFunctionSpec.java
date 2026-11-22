package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAICardFunctionSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAICardFunction";

    @ReactMethod
    public abstract void checkAICardRecordingStatus(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void closeAICardRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getAICardData(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getAICardFileList(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getAICardInfo(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void openAICardRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void pauseAICardRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void removeAICardFile(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void restoreAICardRecording(ReadableMap readableMap, Promise promise);

    public NativePhAICardFunctionSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }
}
