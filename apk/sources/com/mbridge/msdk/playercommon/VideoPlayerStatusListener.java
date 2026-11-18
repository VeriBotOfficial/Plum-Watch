package com.mbridge.msdk.playercommon;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoPlayerStatusListener {
    void onBufferingEnd();

    void onBufferingStart(String str);

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);

    void onPlayProgress(int r1, int r2);

    void onPlayProgressMS(int r1, int r2);

    void onPlaySetDataSourceError(String str);

    void onPlayStarted(int r1);
}
