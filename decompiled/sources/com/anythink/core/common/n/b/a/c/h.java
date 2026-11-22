package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.x;

/* loaded from: classes12.dex */
public final class h extends ag {

    /* renamed from: a, reason: collision with root package name */
    private final String f4091a;
    private final long b;
    private final com.anythink.core.common.n.c.e c;

    public h(String str, long j, com.anythink.core.common.n.c.e eVar) {
        this.f4091a = str;
        this.b = j;
        this.c = eVar;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final x a() {
        String str = this.f4091a;
        if (str != null) {
            return x.b(str);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final long b() {
        return this.b;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final com.anythink.core.common.n.c.e c() {
        return this.c;
    }
}
