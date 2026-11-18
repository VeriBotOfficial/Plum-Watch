package com.baidu.ar.baidumap;

/* JADX INFO: loaded from: classes16.dex */
public interface CaseDownloadListener {
    void onDownloadFinish(boolean z, String str, String str2, int r4, String str3);

    void onDownloadProgress(int r1, String str);

    void onRefused();
}
