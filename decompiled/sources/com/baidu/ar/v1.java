package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.content.ContentCloud;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.ihttp.IProgressCallback;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public ContentCloud f7253a;
    public t1 b;
    public c c;
    public ConcurrentHashMap<String, ICancellable> d = new ConcurrentHashMap<>();

    public class a implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7254a;

        public a(String str) {
            this.f7254a = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            v1.this.d.remove(iARCaseInfo.getARKey());
            if (v1.this.c != null) {
                v1.this.c.a(iARCaseInfo);
            }
            if (v1.this.b != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    v1.this.b.onRefused();
                } else {
                    v1.this.b.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
                }
            }
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i, String str) {
            if (v1.this.b != null) {
                v1.this.b.onDownloadFinish(false, this.f7254a, null, i, str);
            }
            v1.this.d.remove(this.f7254a);
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7255a;

        public b(String str) {
            this.f7255a = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i, int i2) {
            if (v1.this.b != null) {
                v1.this.b.onDownloadProgress(i2 != 0 ? (i * 100) / i2 : 100, this.f7255a);
            }
        }
    }

    public interface c {
        void a(IARCaseInfo iARCaseInfo);
    }

    public v1(Context context) {
        this.f7253a = new ContentCloud(context);
    }

    public void a() {
        Iterator<Map.Entry<String, ICancellable>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
        }
        this.d.clear();
    }

    public void a(t1 t1Var) {
        this.b = t1Var;
    }

    public void a(String str) {
        ICancellable iCancellable = this.d.get(str);
        if (iCancellable != null) {
            iCancellable.cancel();
            this.d.remove(str);
        }
    }

    public void b() {
        this.b = null;
        a();
        this.f7253a.release();
        this.f7253a = null;
    }

    public void b(String str) {
        if (this.f7253a == null) {
            return;
        }
        h.c("CaseDownloader", "start downloading case,arkey:" + str);
        this.d.put(str, this.f7253a.downloadCase(str, new a(str), new b(str)));
    }

    public String c(String str) {
        ContentCloud contentCloud = this.f7253a;
        if (contentCloud != null) {
            return contentCloud.getCasePath(str);
        }
        return null;
    }
}
