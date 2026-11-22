package com.wakeup.howear.rn.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public abstract class NativePhAudioSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "PhAudio";

    @ReactMethod
    public abstract void getAudioDuration(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getPlaybackState(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void getRecordingState(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void pausePlayback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void pauseRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void resumePlayback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void resumeRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void seekTo(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void setPlaybackRate(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startPlayback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void startRecording(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void stopPlayback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void stopRecording(ReadableMap readableMap, Promise promise);

    public NativePhAudioSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }
}
