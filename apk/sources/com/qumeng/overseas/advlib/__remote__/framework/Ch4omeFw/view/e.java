package com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.view;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface e {
    void onCh4omeRequestFinish();

    void onDownloadFileFailed(Bundle bundle);

    void onDownloadFileFinish(Bundle bundle);

    void onDownloadFileProgress(Bundle bundle);

    void onDownloadFileStart(Bundle bundle);

    void onLoadBegin(String str);

    void onLoadFail();

    void onLoadFinish(String str, String str2);

    void onProgressChanged(int r1);

    void onTitleAvailable(String str);

    void showSuperviseDialog(Bundle bundle);
}
