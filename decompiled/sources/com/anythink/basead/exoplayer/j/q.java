package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.s;

/* loaded from: classes11.dex */
public final class q extends s.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2648a;
    private final aa<? super h> b;
    private final int c;
    private final int d;
    private final boolean e;

    public q(String str) {
        this(str, null);
    }

    public q(String str, aa<? super h> aaVar) {
        this(str, aaVar, (byte) 0);
    }

    private q(String str, aa<? super h> aaVar, byte b) {
        this.f2648a = str;
        this.b = aaVar;
        this.c = 8000;
        this.d = 8000;
        this.e = false;
    }

    private p b(s.f fVar) {
        return new p(this.f2648a, null, this.b, this.c, this.d, this.e, fVar);
    }

    @Override // com.anythink.basead.exoplayer.j.s.a
    protected final /* synthetic */ s a(s.f fVar) {
        return new p(this.f2648a, null, this.b, this.c, this.d, this.e, fVar);
    }
}
