package com.baidu.vi;

import android.media.MediaPlayer;

/* loaded from: classes13.dex */
public class AudioFilePlayer {

    /* renamed from: a, reason: collision with root package name */
    private MediaPlayer f9038a = new MediaPlayer();

    private AudioFilePlayer() {
    }

    private native boolean onErrorOccured(long j, int i);

    private native void onPlayCompleted(long j);
}
