package com.baidu.vi;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes15.dex */
public class AudioFilePlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediaPlayer f9038a = new MediaPlayer();

    private AudioFilePlayer() {
    }

    private native boolean onErrorOccured(long j, int r3);

    private native void onPlayCompleted(long j);
}
