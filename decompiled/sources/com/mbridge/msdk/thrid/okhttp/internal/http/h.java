package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.z;
import javax.annotation.Nullable;

/* compiled from: RealResponseBody.java */
/* loaded from: classes17.dex */
public final class h extends z {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f12184a;
    private final long b;
    private final com.mbridge.msdk.thrid.okio.e c;

    public h(@Nullable String str, long j, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f12184a = str;
        this.b = j;
        this.c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long h() {
        return this.b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public com.mbridge.msdk.thrid.okio.e k() {
        return this.c;
    }
}
