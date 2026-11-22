package com.tencent.open.a;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private Response f13624a;
    private String b = null;
    private int c;
    private int d;
    private int e;

    d(Response response, int i) {
        this.f13624a = response;
        this.d = i;
        this.c = response.code();
        ResponseBody body = this.f13624a.body();
        if (body != null) {
            this.e = (int) body.getContentLength();
        } else {
            this.e = 0;
        }
    }

    @Override // com.tencent.open.a.g
    public String a() throws IOException {
        if (this.b == null) {
            ResponseBody body = this.f13624a.body();
            if (body != null) {
                this.b = body.string();
            }
            if (this.b == null) {
                this.b = "";
            }
        }
        return this.b;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.e;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.d;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('@').append(hashCode()).append(this.b).append(this.c).append(this.d).append(this.e);
        return sb.toString();
    }
}
