package com.baidu.ar.baidumap;

/* JADX INFO: loaded from: classes16.dex */
public interface DownloadListener {
    void onDownloadComplete(boolean z);

    void onDownloadError(int r1, String str);

    void onDownloadProcess(int r1);

    void onDownloadStart(boolean z);
}
