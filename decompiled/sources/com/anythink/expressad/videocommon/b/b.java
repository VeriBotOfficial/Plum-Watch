package com.anythink.expressad.videocommon.b;

import com.anythink.core.common.res.b.a;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f5509a;
    private int b;
    private int c;
    private com.anythink.core.common.res.b.a d;

    public b(String str, int i, int i2) {
        this.f5509a = str;
        this.b = i;
        this.c = i2;
        com.anythink.core.common.res.b.a a2 = com.anythink.core.common.res.b.c.a().a(this.f5509a);
        this.d = a2;
        a2.a(new com.anythink.core.common.res.b.b(i, i2, 0L));
    }

    public final void a(a.b bVar) {
        this.d.a(bVar);
    }

    public final void a() {
        this.d.e();
    }

    public final void b() {
        this.d.f();
    }
}
