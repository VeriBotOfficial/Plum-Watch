package com.baidu.ar.dumixhuman.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.ar.dumixhuman.util.casedownload.OnCaseDownloadListener;
import com.baidu.ar.h;
import com.baidu.ar.j4;
import com.baidu.ar.t1;
import com.baidu.ar.v1;
import java.io.File;

/* loaded from: classes12.dex */
public class BARCaseResourceController {
    public static BARCaseResourceController b;

    /* renamed from: a, reason: collision with root package name */
    public v1 f6894a;
    public OnCaseDownloadListener onCaseDownloadListener;

    public class a implements t1 {

        /* renamed from: a, reason: collision with root package name */
        public BARCaseResourceController f6895a;

        public a(BARCaseResourceController bARCaseResourceController, BARCaseResourceController bARCaseResourceController2) {
            this.f6895a = bARCaseResourceController2;
        }

        @Override // com.baidu.ar.t1
        public void onDownloadFinish(boolean z, String str, String str2, int i, String str3) {
            h.b("onDownloadFinish:" + z);
            BARCaseResourceController bARCaseResourceController = this.f6895a;
            if (bARCaseResourceController != null) {
                bARCaseResourceController.a(z);
            }
        }

        @Override // com.baidu.ar.t1
        public void onDownloadProgress(int i, String str) {
            BARCaseResourceController bARCaseResourceController = this.f6895a;
            if (bARCaseResourceController != null) {
                bARCaseResourceController.a(i);
            }
        }

        @Override // com.baidu.ar.t1
        public void onRefused() {
        }
    }

    public BARCaseResourceController(Context context) {
        if (this.f6894a == null) {
            this.f6894a = new v1(context);
        }
        this.f6894a.a(new a(this, this));
    }

    public static synchronized BARCaseResourceController getInstance(Context context) {
        BARCaseResourceController bARCaseResourceController;
        synchronized (BARCaseResourceController.class) {
            if (b == null) {
                b = new BARCaseResourceController(context);
            }
            bARCaseResourceController = b;
        }
        return bARCaseResourceController;
    }

    public final void a(int i) {
        OnCaseDownloadListener onCaseDownloadListener = this.onCaseDownloadListener;
        if (onCaseDownloadListener != null) {
            onCaseDownloadListener.onDownloadProgress(i);
        }
    }

    public final void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                a(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public final void a(boolean z) {
        OnCaseDownloadListener onCaseDownloadListener = this.onCaseDownloadListener;
        if (onCaseDownloadListener != null) {
            onCaseDownloadListener.onDownloadResult(z);
        }
    }

    public void cancelAllDownLoadArCase() {
        v1 v1Var = this.f6894a;
        if (v1Var != null) {
            v1Var.a();
        }
    }

    public void cancelDownLoadArCase(String str) {
        if (this.f6894a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f6894a.a(str);
    }

    public void clearAllCache(Context context) {
        a(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            a(context.getExternalFilesDir(""));
            a(context.getFilesDir());
        }
    }

    public void clearArKeyCache(String str) {
        if (this.f6894a == null || TextUtils.isEmpty(str)) {
            return;
        }
        a(new File(this.f6894a.c(str)));
    }

    public void downloadARCase(String str) {
        if (this.f6894a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f6894a.a(str);
        this.f6894a.b(str);
    }

    public String getCasePath(String str) {
        if (this.f6894a != null && !TextUtils.isEmpty(str)) {
            String c = this.f6894a.c(str);
            if (!TextUtils.isEmpty(c) && j4.a(new File(c))) {
                h.c("BARCaseResourceController", "getCasePath : " + c);
                return c;
            }
        }
        h.c("BARCaseResourceController", "getCasePath empty");
        return "";
    }

    public void release() {
        v1 v1Var = this.f6894a;
        if (v1Var != null) {
            v1Var.b();
        }
        b = null;
    }

    public void setOnCaseDownloadListener(OnCaseDownloadListener onCaseDownloadListener) {
        this.onCaseDownloadListener = onCaseDownloadListener;
    }
}
