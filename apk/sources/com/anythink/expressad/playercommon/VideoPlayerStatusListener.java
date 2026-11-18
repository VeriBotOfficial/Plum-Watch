package com.anythink.expressad.playercommon;

/* JADX INFO: loaded from: classes16.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int r1, int r2);

    void onPlayProgressMS(int r1, int r2);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int r1);

    void onVideoDownloadResume();
}
