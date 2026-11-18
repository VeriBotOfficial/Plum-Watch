package com.baidu.ar.baidumap;

/* JADX INFO: loaded from: classes16.dex */
public interface MapDuMixListener {
    void onCaseLoadEnd(String str);

    void onCaseLoadStart(String str);

    void onResDownloadFinish(boolean z, int r2, String str);

    void onResDownloadStart(String str);

    void onSoDownloadFinish(boolean z, int r2, String str);

    void onSoDownloadStart(String str);
}
