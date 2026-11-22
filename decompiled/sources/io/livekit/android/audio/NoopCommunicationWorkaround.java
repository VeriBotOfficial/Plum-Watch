package io.livekit.android.audio;

import com.yandex.div.core.timer.TimerController;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommunicationWorkaround.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lio/livekit/android/audio/NoopCommunicationWorkaround;", "Lio/livekit/android/audio/CommunicationWorkaround;", "()V", "dispose", "", "onStartPlayout", "onStopPlayout", "start", TimerController.STOP_COMMAND, "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoopCommunicationWorkaround implements CommunicationWorkaround {
    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void dispose() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStartPlayout() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void onStopPlayout() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void start() {
    }

    @Override // io.livekit.android.audio.CommunicationWorkaround
    public void stop() {
    }

    @Inject
    public NoopCommunicationWorkaround() {
    }
}
