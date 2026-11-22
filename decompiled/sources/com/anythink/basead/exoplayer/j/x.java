package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes11.dex */
public final class x implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f2658a;
    private final com.anythink.basead.exoplayer.k.v b;
    private final int c;

    private x(h.a aVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f2658a = aVar;
        this.b = vVar;
        this.c = i;
    }

    private w b() {
        return new w(this.f2658a.a(), this.b, this.c);
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new w(this.f2658a.a(), this.b, this.c);
    }
}
