package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes2.dex */
public interface WebLoadListener {
    void onFailed(String str, int r2, int r3, int r4, String str2, String str3);

    void onProgress(String str, int r2, int r3, int r4, String str2, String str3);

    void onSucess(String str, int r2, int r3, int r4, String str2, String str3);
}
