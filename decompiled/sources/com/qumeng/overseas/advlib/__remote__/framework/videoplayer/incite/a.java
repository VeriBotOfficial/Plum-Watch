package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.incite;

import android.media.MediaPlayer;
import android.view.View;

/* loaded from: classes17.dex */
public interface a {
    View a();

    void a(MediaPlayer mediaPlayer);

    void abandonAudioFocus();

    void b();

    boolean c();

    void d();

    void e();

    long getCurrentPosition();

    boolean isPlaying();

    void replay();

    void seekTo(int i);

    void setMute(boolean z);
}
