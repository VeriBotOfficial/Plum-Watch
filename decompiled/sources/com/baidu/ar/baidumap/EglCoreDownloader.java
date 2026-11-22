package com.baidu.ar.baidumap;

import android.content.Context;
import com.baidu.ar.DuMixController;
import com.baidu.ar.ab;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.b9;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.h;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.marker.MarkerErrorCode;
import com.baidu.ar.remoteres.IDuMixResLoadTask;
import com.baidu.ar.v5;
import java.io.File;

/* loaded from: classes12.dex */
public class EglCoreDownloader {
    public static volatile EglCoreDownloader b;

    /* renamed from: a, reason: collision with root package name */
    public v5 f6812a;

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f6813a;

        public a(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f6813a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            DownloadListener downloadListener = this.f6813a;
            if (downloadListener != null) {
                downloadListener.onDownloadComplete(true);
            }
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f6814a;

        public b(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f6814a = downloadListener;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i, int i2) {
            DownloadListener downloadListener = this.f6814a;
            if (downloadListener != null) {
                if (i == 0) {
                    downloadListener.onDownloadStart(true);
                } else {
                    downloadListener.onDownloadProcess((int) ((i / i2) * 100.0f));
                }
            }
        }
    }

    public class c implements ICallbackWith<IDuMixResLoadTask> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f6815a;

        public c(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f6815a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(IDuMixResLoadTask iDuMixResLoadTask) {
            DownloadListener downloadListener = this.f6815a;
            if (downloadListener != null) {
                downloadListener.onDownloadError(MarkerErrorCode.ERROR_DOWNLOAD_SO, iDuMixResLoadTask.getError());
            }
        }
    }

    public EglCoreDownloader(Context context) {
        v5 v5Var = (v5) ab.a("com.baidu.ar.remoteres.EglCoreManager");
        this.f6812a = v5Var;
        if (v5Var != null) {
            v5Var.setup(context);
        }
    }

    public static EglCoreDownloader getInstance(Context context) {
        if (b == null) {
            synchronized (EglCoreDownloader.class) {
                if (b == null) {
                    b = new EglCoreDownloader(context);
                }
            }
        }
        return b;
    }

    public final boolean a(Context context) {
        if (!ab.a("com.baidu.ar.remoteres.RemoteResLoader", context.getClassLoader())) {
            return true;
        }
        File file = new File(DuMixController.getSoDownLoadDir(context), "libdumixar.so");
        return file.exists() && file.length() > 0;
    }

    public void download(DownloadListener downloadListener) {
        v5 v5Var = this.f6812a;
        if (v5Var != null) {
            v5Var.prepareEglCore(new a(this, downloadListener), new b(this, downloadListener), new c(this, downloadListener));
        } else if (downloadListener != null) {
            downloadListener.onDownloadComplete(true);
        }
    }

    public boolean engineFileExists(Context context) {
        if (context == null) {
            return false;
        }
        return a(context);
    }

    public void release() {
        v5 v5Var = this.f6812a;
        if (v5Var != null) {
            v5Var.release();
            this.f6812a = null;
        }
        b = null;
    }

    public void setDownloadSoBusinessTag(BusinessSoType businessSoType) {
        v5 v5Var = this.f6812a;
        if (v5Var != null) {
            v5Var.setBusinessTag(businessSoType.getBusiness());
        }
    }

    public boolean soIsReady() {
        v5 v5Var;
        boolean isEngineCreated = ARPEngine.isEngineCreated();
        boolean c2 = b9.b().c();
        h.a("EglCoreDownloader", "isEngineCreated:" + isEngineCreated + " isDumixSDKCreated:" + c2);
        if (isEngineCreated || c2 || (v5Var = this.f6812a) == null) {
            return false;
        }
        return v5Var.isSoDownloadSuccess();
    }
}
