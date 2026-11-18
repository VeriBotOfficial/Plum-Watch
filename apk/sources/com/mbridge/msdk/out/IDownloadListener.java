package com.mbridge.msdk.out;

/* JADX INFO: loaded from: classes2.dex */
public interface IDownloadListener {
    void onEnd(int r1, int r2, String str);

    void onProgressUpdate(int r1);

    void onStart();

    void onStatus(int r1);
}
