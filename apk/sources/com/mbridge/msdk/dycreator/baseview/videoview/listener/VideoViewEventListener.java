package com.mbridge.msdk.dycreator.baseview.videoview.listener;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoViewEventListener {
    void onBufferingEnd();

    void onBufferingFail(String str);

    void onBufferingStart();

    void onPlayCompleted();

    void onPlayProgress(int r1, int r2);

    void onPlayStart(String str);

    void onPlayerError(int r1, String str);
}
