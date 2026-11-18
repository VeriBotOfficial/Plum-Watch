package com.mbridge.msdk.video.signal;

/* JADX INFO: compiled from: IJSContainerModule.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f {
    void configurationChanged(int r1, int r2, int r3);

    boolean endCardShowing();

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardShowing();

    void readyStatus(int r1);

    void resizeMiniCard(int r1, int r2, int r3);

    boolean showAlertWebView();

    void showEndcard(int r1);

    void showMiniCard(int r1, int r2, int r3, int r4, int r5);

    void showVideoClickView(int r1);

    void showVideoEndCover();
}
