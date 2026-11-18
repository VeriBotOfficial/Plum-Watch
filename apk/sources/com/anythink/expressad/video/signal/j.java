package com.anythink.expressad.video.signal;

/* JADX INFO: loaded from: classes16.dex */
public interface j {
    public static final int m_ = 1;
    public static final int n_ = 2;
    public static final int o = 1;
    public static final int o_ = 3;
    public static final int p = 2;
    public static final int p_ = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5503q = 1;
    public static final int q_ = 5;
    public static final int r = 2;
    public static final int r_ = 6;
    public static final int s = 0;
    public static final int s_ = 0;
    public static final int t = 1;
    public static final int t_ = 1;
    public static final int u_ = 1;
    public static final int v_ = 2;
    public static final int w_ = 1;
    public static final int x_ = 2;
    public static final int y_ = -1;

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

    void setInstallDialogState(boolean z);

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
