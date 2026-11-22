package com.wakeup.module.play;

import android.media.MediaPlayer;
import android.util.Log;
import kotlin.Metadata;

/* compiled from: MusicService.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"safeReset", "", "Landroid/media/MediaPlayer;", "module-play_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MusicServiceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void safeReset(MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.reset();
        } catch (IllegalStateException e) {
            Log.e("MediaPlayer", "reset() failed: invalid state", e);
        }
    }
}
