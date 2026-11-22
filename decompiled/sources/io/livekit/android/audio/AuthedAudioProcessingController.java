package io.livekit.android.audio;

import kotlin.Metadata;

/* compiled from: AudioProcessingController.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lio/livekit/android/audio/AuthedAudioProcessingController;", "Lio/livekit/android/audio/AudioProcessingController;", "authenticate", "", "url", "", "token", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthedAudioProcessingController extends AudioProcessingController {
    void authenticate(String url, String token);
}
