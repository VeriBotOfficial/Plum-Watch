package io.livekit.android.audio;

import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;

/* compiled from: CommunicationWorkaround.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lio/livekit/android/audio/CommunicationWorkaround;", "", "dispose", "", "onStartPlayout", "onStopPlayout", "start", TimerController.STOP_COMMAND, "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CommunicationWorkaround {
    void dispose();

    void onStartPlayout();

    void onStopPlayout();

    void start();

    void stop();
}
