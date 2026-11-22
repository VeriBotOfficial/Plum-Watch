package com.wakeup.feature.wkvideo.cache;

import com.danikula.videocache.HttpProxyCacheServer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class PreloadTask implements Runnable {
    private static final String TAG = "PreloadTask";
    private static final List<String> blackList = new ArrayList();
    public HttpProxyCacheServer mCacheServer;
    private boolean mIsCanceled;
    private boolean mIsExecuted;
    public int mPosition;
    public String mRawUrl;

    @Override // java.lang.Runnable
    public void run() {
        if (!this.mIsCanceled) {
            start();
        }
        this.mIsExecuted = false;
        this.mIsCanceled = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void start() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.cache.PreloadTask.start():void");
    }

    public void executeOn(ExecutorService executorService) {
        if (this.mIsExecuted) {
            return;
        }
        this.mIsExecuted = true;
        executorService.submit(this);
    }

    public void cancel() {
        if (this.mIsExecuted) {
            this.mIsCanceled = true;
        }
    }
}
