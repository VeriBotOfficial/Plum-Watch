package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public interface k6 {
    void onCreateSessionFail();

    void onCreateVpasAlgoFail();

    void onPositionSuccess(int r1);

    void onVpasAlgoStatePrint(int r1, int r2, float f);

    void onVpasLocationSuccess();

    void onVpasSendFrame();

    void onVpasTrackingState(int r1);
}
