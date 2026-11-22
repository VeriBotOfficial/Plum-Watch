package com.sifli.siflicore.util;

import com.sifli.siflicore.log.SFLog;

/* loaded from: classes14.dex */
public class UnzipHelper {
    private static final String TAG = "UnzipHelper";
    private IFileUnzipCallback callback;

    public void unzipAsync(final String str, final String str2, IFileUnzipCallback iFileUnzipCallback) {
        SFLog.i(TAG, "unzipAsync zipFilePath=%s,outputDir=%s", str, str2);
        this.callback = iFileUnzipCallback;
        new Thread(new Runnable() { // from class: com.sifli.siflicore.util.UnzipHelper.1
            @Override // java.lang.Runnable
            public void run() {
                UnzipHelper.this.callUnzip(str, str2);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callUnzip(String str, String str2) {
        SFLog.i(TAG, "callUnzip");
        this.callback.onComplete(FileUtil.unzipFileToDir(str, str2));
    }
}
