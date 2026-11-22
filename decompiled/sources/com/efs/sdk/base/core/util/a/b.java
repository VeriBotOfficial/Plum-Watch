package com.efs.sdk.base.core.util.a;

import android.gov.nist.core.Separators;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;

/* loaded from: classes14.dex */
public final class b implements com.efs.sdk.base.core.util.concurrent.c<HttpResponse> {

    /* renamed from: a, reason: collision with root package name */
    String f9644a;
    Map<String, String> b;
    public byte[] c;
    public File d;
    public String e;
    public Map<String, String> f;
    public boolean g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.c
    public final /* synthetic */ HttpResponse a() {
        String str = this.e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f9644a, this.b);
        }
        if (!str.equals("post")) {
            Log.e("efs.util.http", "request not support method '" + this.e + Separators.QUOTE);
            return null;
        }
        byte[] bArr = this.c;
        if (bArr != null && bArr.length > 0) {
            if (this.g) {
                return HttpEnv.getInstance().getHttpUtil().postAsFile(this.f9644a, this.b, this.c);
            }
            return HttpEnv.getInstance().getHttpUtil().post(this.f9644a, this.b, this.c);
        }
        return HttpEnv.getInstance().getHttpUtil().post(this.f9644a, this.b, this.d);
    }
}
