package com.vivo.push.restructure.request;

import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.util.t;

/* compiled from: CommandRequest.java */
/* loaded from: classes2.dex */
public final class b<I extends com.vivo.push.restructure.request.a.a.b, O extends com.vivo.push.restructure.request.a.a.b> {

    /* renamed from: a, reason: collision with root package name */
    private a<I, O> f14132a;
    private c<O> b;
    private long c;

    private b(a<I, O> aVar) {
        this.c = 5000L;
        this.f14132a = aVar;
        if (aVar == null) {
            t.a(8100, "Command object is null, please construct command first");
        }
    }

    private b(a<I, O> aVar, c<O> cVar) {
        this(aVar);
        this.b = cVar;
    }

    public b(a<I, O> aVar, c<O> cVar, long j) {
        this(aVar, cVar);
        this.c = j;
    }

    public final a a() {
        return this.f14132a;
    }

    public final c b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }
}
