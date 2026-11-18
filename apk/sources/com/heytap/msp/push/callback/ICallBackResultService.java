package com.heytap.msp.push.callback;

/* JADX INFO: loaded from: classes7.dex */
public interface ICallBackResultService {
    void onError(int r1, String str, String str2, String str3);

    void onGetNotificationStatus(int r1, int r2);

    void onGetPushStatus(int r1, int r2);

    void onRegister(int r1, String str, String str2, String str3);

    void onSetPushTime(int r1, String str);

    void onUnRegister(int r1, String str, String str2);
}
