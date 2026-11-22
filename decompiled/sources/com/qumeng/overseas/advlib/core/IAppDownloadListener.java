package com.qumeng.overseas.advlib.core;

/* loaded from: classes17.dex */
public interface IAppDownloadListener {
    void onDownloadActive(long j, long j2, String str);

    void onDownloadCompleted(String str);

    void onDownloadFailed();

    void onDownloadPaused(long j, long j2, String str);

    void onIdle();

    void onInstalled(String str);
}
