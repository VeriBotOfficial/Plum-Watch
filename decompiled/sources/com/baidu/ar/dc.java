package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.bean.ARCaseBundleInfo;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.io.File;

/* loaded from: classes12.dex */
public class dc extends e0<String, Void> {
    public ARCaseBundleInfo i;
    public String j;
    public m1 k;
    public IProgressCallback l;

    public dc(ARCaseBundleInfo aRCaseBundleInfo, String str, m1 m1Var, IProgressCallback iProgressCallback) {
        this.i = aRCaseBundleInfo;
        this.j = str;
        this.k = m1Var;
        this.l = iProgressCallback;
    }

    public final String a(gc gcVar) {
        StringBuilder append;
        String str;
        String parent = new File(this.i.caseDir).getParent();
        if ("gzip".equalsIgnoreCase(gcVar.c)) {
            str = String.format("/temp/%s.zip", gcVar.b);
            append = new StringBuilder().append(parent);
        } else {
            if (!InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY.equalsIgnoreCase(gcVar.c)) {
                return null;
            }
            append = new StringBuilder().append(parent).append(File.separator);
            str = gcVar.f6949a;
        }
        return append.append(str).toString();
    }

    @Override // com.baidu.ar.e0
    public void a(String str, ICallbackWith<Void> iCallbackWith, IError iError) {
        if (TextUtils.isEmpty(str)) {
            iError.onError(2, "res url is not exists", null);
            return;
        }
        if ("local".equals(str)) {
            iCallbackWith.run(null);
            return;
        }
        gc a2 = this.k.a(this.j);
        if (a2 == null) {
            iError.onError(2, "res is not exists", null);
            return;
        }
        String a3 = a(a2);
        if (a3 == null) {
            iError.onError(2, "未知的资源encoding", null);
            return;
        }
        Downloader downloader = new Downloader(str);
        try {
            int fileSize = downloader.getFileSize();
            if (!a(a3, a2, fileSize)) {
                try {
                    downloader.download(a3, this.l);
                    if (!a(a3, a2, fileSize)) {
                        iError.onError(2, "download fail", null);
                        return;
                    }
                } catch (Exception e) {
                    iError.onError(2, e.getMessage(), e);
                    return;
                }
            }
            iCallbackWith.run(null);
        } catch (HttpException e2) {
            iError.onError(2, e2.getMessage(), e2);
        }
    }

    public final boolean a(String str, gc gcVar, int i) {
        File file = new File(str);
        if (!file.exists() || file.length() != i) {
            return false;
        }
        if ("gzip".equalsIgnoreCase(gcVar.c)) {
            return af.a(new File(str), new File(this.i.caseDir).getParentFile());
        }
        return true;
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }
}
