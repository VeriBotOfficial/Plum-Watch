package com.wakeup.common.utils;

import android.javax.sip.header.SubscriptionStateHeader;
import android.os.Handler;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.FileDownloadListener;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;

/* compiled from: DownloadMgr.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\"\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0010"}, d2 = {"com/wakeup/common/utils/DownloadMgr$download$2", "Lcom/liulishuo/filedownloader/FileDownloadListener;", SubscriptionStateHeader.PENDING, "", "task", "Lcom/liulishuo/filedownloader/BaseDownloadTask;", "soFarBytes", "", "totalBytes", "progress", "completed", "paused", "error", "e", "", "warn", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadMgr$download$2 extends FileDownloadListener {
    DownloadMgr$download$2() {
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void pending(BaseDownloadTask task, int soFarBytes, int totalBytes) {
        LogUtils.i("DownloadMgr", SubscriptionStateHeader.PENDING);
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void progress(BaseDownloadTask task, int soFarBytes, int totalBytes) {
        Handler handler;
        final long j = (soFarBytes * 100) / totalBytes;
        LogUtils.i("DownloadMgr", "download progress: " + j);
        handler = DownloadMgr.handler;
        handler.post(new Runnable() { // from class: com.wakeup.common.utils.DownloadMgr$download$2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DownloadMgr$download$2.progress$lambda$0(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void progress$lambda$0(long j) {
        BaseCallback baseCallback;
        baseCallback = DownloadMgr.mCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, Integer.valueOf((int) j));
        }
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void completed(BaseDownloadTask task) {
        Handler handler;
        LogUtils.i("DownloadMgr", "download completed");
        DownloadMgr.setDownloading(false);
        handler = DownloadMgr.handler;
        handler.post(new Runnable() { // from class: com.wakeup.common.utils.DownloadMgr$download$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DownloadMgr$download$2.completed$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void completed$lambda$1() {
        BaseCallback baseCallback;
        baseCallback = DownloadMgr.mCallback;
        if (baseCallback != null) {
            baseCallback.callback(1, 100);
        }
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void paused(BaseDownloadTask task, int soFarBytes, int totalBytes) {
        LogUtils.i("DownloadMgr", "paused");
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void error(BaseDownloadTask task, Throwable e) {
        Handler handler;
        LogUtils.i("DownloadMgr", "download error: " + (e != null ? e.getMessage() : null));
        DownloadMgr.setDownloading(false);
        handler = DownloadMgr.handler;
        handler.post(new Runnable() { // from class: com.wakeup.common.utils.DownloadMgr$download$2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadMgr$download$2.error$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void error$lambda$2() {
        BaseCallback baseCallback;
        baseCallback = DownloadMgr.mCallback;
        if (baseCallback != null) {
            baseCallback.callback(-1, 0);
        }
    }

    @Override // com.liulishuo.filedownloader.FileDownloadListener
    protected void warn(BaseDownloadTask task) {
        LogUtils.i("DownloadMgr", "warn");
    }
}
