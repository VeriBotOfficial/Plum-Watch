package com.baidu.ar.baidumap;

import android.content.Context;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.content.ContentCloud;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.x1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ContentCloud f6821a;
    public CaseStateListener b;
    public e c;
    public ConcurrentHashMap<String, ICancellable> d = new ConcurrentHashMap<>();

    /* renamed from: com.baidu.ar.baidumap.a$a, reason: collision with other inner class name */
    public class C0326a implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6822a;

        public C0326a(String str) {
            this.f6822a = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            a.this.d.remove(iARCaseInfo.getARKey());
            if (a.this.c != null) {
                a.this.c.a(iARCaseInfo);
            }
            if (a.this.b != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    a.this.b.onRefused();
                } else {
                    a.this.b.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
                }
            }
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i, String str) {
            if (a.this.b != null) {
                a.this.b.onDownloadFinish(false, this.f6822a, null, i, str);
            }
            a.this.d.remove(this.f6822a);
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6823a;

        public b(String str) {
            this.f6823a = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i, int i2) {
            if (a.this.b != null) {
                a.this.b.onDownloadProgress(i2 != 0 ? (i * 100) / i2 : 100, this.f6823a);
            }
        }
    }

    public class c implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CaseDownloadListener f6824a;
        public final /* synthetic */ String b;

        public c(CaseDownloadListener caseDownloadListener, String str) {
            this.f6824a = caseDownloadListener;
            this.b = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            if (this.f6824a != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    a.this.b.onRefused();
                    return;
                }
                this.f6824a.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
            }
            a.this.d.remove(iARCaseInfo.getARKey());
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i, String str) {
            CaseDownloadListener caseDownloadListener = this.f6824a;
            if (caseDownloadListener != null) {
                caseDownloadListener.onDownloadFinish(false, this.b, null, i, str);
            }
            a.this.d.remove(this.b);
        }
    }

    public class d implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CaseDownloadListener f6825a;
        public final /* synthetic */ String b;

        public d(a aVar, CaseDownloadListener caseDownloadListener, String str) {
            this.f6825a = caseDownloadListener;
            this.b = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i, int i2) {
            CaseDownloadListener caseDownloadListener = this.f6825a;
            if (caseDownloadListener != null) {
                caseDownloadListener.onDownloadProgress(i2 != 0 ? (i * 100) / i2 : 100, this.b);
            }
        }
    }

    public interface e {
        void a(IARCaseInfo iARCaseInfo);
    }

    public a(Context context) {
        this.f6821a = new ContentCloud(context);
    }

    public void a() {
        Iterator<Map.Entry<String, ICancellable>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
        }
        this.d.clear();
    }

    public void a(CaseStateListener caseStateListener) {
        this.b = caseStateListener;
    }

    public void a(e eVar) {
        this.c = eVar;
    }

    public void a(String str) {
        ICancellable iCancellable = this.d.get(str);
        if (iCancellable != null) {
            iCancellable.cancel();
            this.d.remove(str);
        }
    }

    public void a(String str, CaseDownloadListener caseDownloadListener) {
        this.d.put(str, this.f6821a.downloadCase(str, new c(caseDownloadListener, str), new d(this, caseDownloadListener, str)));
    }

    public void a(String str, x1 x1Var) {
        this.f6821a.checkCaseUpdate(str, x1Var);
    }

    public void b() {
        this.b = null;
        a();
        this.f6821a.release();
        this.f6821a = null;
    }

    public void b(String str) {
        this.d.put(str, this.f6821a.downloadCase(str, new C0326a(str), new b(str)));
    }
}
