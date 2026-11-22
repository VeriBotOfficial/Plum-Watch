package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.baidumap.CaseStateListener;

/* loaded from: classes12.dex */
public class ARResourceDownloader {

    /* renamed from: a, reason: collision with root package name */
    public com.baidu.ar.baidumap.a f6728a;
    public OnARResourceDownloadListener onARResourceDownloadListener;

    public class a implements CaseStateListener {

        /* renamed from: a, reason: collision with root package name */
        public ARResourceDownloader f6729a;

        public a(ARResourceDownloader aRResourceDownloader, ARResourceDownloader aRResourceDownloader2) {
            this.f6729a = aRResourceDownloader2;
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseCreated(boolean z, String str, String str2) {
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseDestroy() {
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadFinish(boolean z, String str, String str2, int i, String str3) {
            h.b("onDownloadFinish:" + z);
            ARResourceDownloader aRResourceDownloader = this.f6729a;
            if (aRResourceDownloader != null) {
                aRResourceDownloader.a(z);
            }
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadProgress(int i, String str) {
            h.b("onDownloadProgress:" + i);
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onRefused() {
        }
    }

    public ARResourceDownloader(Context context) {
        if (this.f6728a == null) {
            this.f6728a = new com.baidu.ar.baidumap.a(context);
        }
        this.f6728a.a(new a(this, this));
    }

    public final void a(boolean z) {
        OnARResourceDownloadListener onARResourceDownloadListener = this.onARResourceDownloadListener;
        if (onARResourceDownloadListener != null) {
            onARResourceDownloadListener.onDownloadResult(z);
        }
    }

    public void downloadARResource(String str) {
        if (this.f6728a == null || TextUtils.isEmpty(str)) {
            return;
        }
        h.a("ARResourceDownloader::downloadARResource");
    }

    public void release() {
        if (this.f6728a != null) {
            h.a("ARResourceDownloader::release");
        }
    }

    public void setOnARResourceDownloadListener(OnARResourceDownloadListener onARResourceDownloadListener) {
        this.onARResourceDownloadListener = onARResourceDownloadListener;
    }
}
