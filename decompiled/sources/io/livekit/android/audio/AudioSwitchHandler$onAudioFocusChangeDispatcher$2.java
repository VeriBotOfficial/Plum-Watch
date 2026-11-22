package io.livekit.android.audio;

import android.media.AudioManager;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: AudioSwitchHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AudioSwitchHandler$onAudioFocusChangeDispatcher$2 extends Lambda implements Function0<AudioManager.OnAudioFocusChangeListener> {
    final /* synthetic */ AudioSwitchHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioSwitchHandler$onAudioFocusChangeDispatcher$2(AudioSwitchHandler audioSwitchHandler) {
        super(0);
        this.this$0 = audioSwitchHandler;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AudioManager.OnAudioFocusChangeListener invoke() {
        final AudioSwitchHandler audioSwitchHandler = this.this$0;
        return new AudioManager.OnAudioFocusChangeListener() { // from class: io.livekit.android.audio.AudioSwitchHandler$onAudioFocusChangeDispatcher$2$$ExternalSyntheticLambda0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                AudioSwitchHandler$onAudioFocusChangeDispatcher$2.invoke$lambda$1(AudioSwitchHandler.this, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AudioSwitchHandler this$0, int i) {
        Set set;
        Set set2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this$0.getOnAudioFocusChangeListener();
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
        set = this$0.onAudioFocusChangeListeners;
        Intrinsics.checkNotNullExpressionValue(set, "access$getOnAudioFocusChangeListeners$p(...)");
        synchronized (set) {
            set2 = this$0.onAudioFocusChangeListeners;
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                ((AudioManager.OnAudioFocusChangeListener) it.next()).onAudioFocusChange(i);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
