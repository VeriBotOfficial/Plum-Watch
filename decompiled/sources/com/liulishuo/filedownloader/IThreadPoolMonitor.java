package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.model.FileDownloadModel;

/* loaded from: classes17.dex */
public interface IThreadPoolMonitor {
    int findRunningTaskIdBySameTempPath(String str, int i);

    boolean isDownloading(FileDownloadModel fileDownloadModel);
}
