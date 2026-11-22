package com.tencent.open.a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private String f13623a;
    private int b;
    private int c;
    private int d;
    private String e;
    private Map<String, List<String>> f = new HashMap();

    public c(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        Map<String, List<String>> headerFields;
        this.f13623a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f.putAll(headerFields);
    }

    @Override // com.tencent.open.a.g
    public String a() {
        return this.f13623a;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.b;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.c;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('@').append(hashCode()).append("\ncontent = [").append(this.f13623a).append("]\nresponseSize = ").append(this.b).append("\nrequestSize = ").append(this.c).append("\nresultCode = ").append(this.d).append("\nerrorMsg = ").append(this.e);
        return sb.toString();
    }
}
