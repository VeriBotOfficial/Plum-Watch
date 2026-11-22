package com.anythink.basead.mixad.b;

/* loaded from: classes11.dex */
public final class g extends a implements com.anythink.core.common.l.c.a.f {
    private com.anythink.core.common.l.b.a.a b;

    @Override // com.anythink.core.common.l.c.a.f
    public final com.anythink.core.common.l.e.a.c a() {
        try {
            if (this.f2889a != null) {
                return this.f2889a.a();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.l.c.a.f
    public final com.anythink.core.common.l.b.a.c b() {
        com.anythink.core.common.l.b.a.a aVar = this.b;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.l.c.a.f
    public final void a(com.anythink.core.common.l.b.a.a aVar) {
        this.b = aVar;
    }
}
