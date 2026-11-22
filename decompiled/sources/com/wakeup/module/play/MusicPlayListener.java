package com.wakeup.module.play;

import kotlin.Metadata;

/* compiled from: MusicPlayListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/play/MusicPlayListener;", "", "onProgressChange", "", "progress", "", "duration", "onMusicPlayStateChange", "isPlay", "", "musicId", "", "onPrepared", "onCompletion", "module-play_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MusicPlayListener {
    void onCompletion();

    void onMusicPlayStateChange(boolean isPlay, long musicId);

    void onPrepared();

    void onProgressChange(int progress, int duration);
}
