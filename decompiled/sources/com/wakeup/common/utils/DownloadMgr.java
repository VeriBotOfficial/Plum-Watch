package com.wakeup.common.utils;

import android.os.Handler;
import android.os.Looper;
import com.liulishuo.filedownloader.FileDownloader;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DownloadMgr.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/utils/DownloadMgr;", "", "<init>", "()V", "STATE_PROGRESS", "", "STATE_SUCCESS", "STATE_FAIL", "TAG", "", "handler", "Landroid/os/Handler;", "mCallback", "Lcom/wakeup/common/base/BaseCallback;", "isDownloading", "", "isDownloading$annotations", "()Z", "setDownloading", "(Z)V", "download", "", "url", "filePath", "callback", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadMgr {
    public static final int STATE_FAIL = -1;
    public static final int STATE_PROGRESS = 0;
    public static final int STATE_SUCCESS = 1;
    private static final String TAG = "DownloadMgr";
    private static boolean isDownloading;
    private static BaseCallback<Integer> mCallback;
    public static final DownloadMgr INSTANCE = new DownloadMgr();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    @JvmStatic
    public static /* synthetic */ void isDownloading$annotations() {
    }

    private DownloadMgr() {
    }

    public static final boolean isDownloading() {
        return isDownloading;
    }

    public static final void setDownloading(boolean z) {
        isDownloading = z;
    }

    @JvmStatic
    public static final void download(String url, String filePath, BaseCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LogUtils.i(TAG, "start download url: " + url + "   filePath: " + filePath);
        mCallback = callback;
        isDownloading = true;
        handler.post(new Runnable() { // from class: com.wakeup.common.utils.DownloadMgr$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DownloadMgr.download$lambda$0();
            }
        });
        FileDownloader.getImpl().create(url).setPath(filePath).setListener(new DownloadMgr$download$2()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void download$lambda$0() {
        BaseCallback<Integer> baseCallback = mCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, 0);
        }
    }
}
