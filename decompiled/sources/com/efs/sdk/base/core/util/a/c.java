package com.efs.sdk.base.core.util.a;

import com.efs.sdk.base.http.HttpResponse;

/* loaded from: classes14.dex */
public final class c extends com.efs.sdk.base.core.util.concurrent.d<HttpResponse> {

    /* renamed from: a, reason: collision with root package name */
    public b f9645a;

    c(b bVar) {
        super(bVar);
        this.f9645a = bVar;
    }

    public final HttpResponse b() {
        this.f9645a.e = "post";
        return a();
    }
}
