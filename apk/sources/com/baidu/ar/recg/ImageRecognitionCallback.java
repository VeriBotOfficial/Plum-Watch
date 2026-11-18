package com.baidu.ar.recg;

/* JADX INFO: loaded from: classes16.dex */
public interface ImageRecognitionCallback {
    void onFeatureDBInit(boolean z);

    void onFeatureDownloadStart();

    void onRecognizeResult(boolean z, String str, String str2);

    void onResourceDownload(boolean z);

    void onResourceRequest(boolean z, int r2, String str);

    void onSoLoadDownloadStart();

    void onSoLoadState(boolean z);
}
