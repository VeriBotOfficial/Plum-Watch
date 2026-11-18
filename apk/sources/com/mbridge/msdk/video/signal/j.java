package com.mbridge.msdk.video.signal;

/* JADX INFO: compiled from: IJSVideoModule.java */
/* JADX INFO: loaded from: classes2.dex */
public interface j {
    void alertWebViewShowed();

    void closeVideoOperate(int r1, int r2);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int r1);

    boolean isH5Canvas();

    void notifyCloseBtn(int r1);

    void progressBarOperate(int r1);

    void progressOperate(int r1, int r2);

    void setCover(boolean z);

    void setMiniEndCardState(boolean z);

    void setScaleFitXY(int r1);

    void setVisible(int r1);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9);

    void soundOperate(int r1, int r2);

    void soundOperate(int r1, int r2, String str);

    void videoOperate(int r1);
}
