package com.anythink.basead.mixad.b;

import android.app.Activity;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes11.dex */
public final class f extends a implements com.anythink.core.common.l.c.a.e {
    private com.anythink.core.common.l.f.a.a b;

    @Override // com.anythink.core.common.l.c.a.e
    public final void a(Activity activity, com.anythink.core.basead.b.c cVar, a.InterfaceC0200a interfaceC0200a) {
        com.anythink.core.common.l.f.a.a aVar = this.b;
        if (aVar != null) {
            aVar.a(activity, cVar, interfaceC0200a);
        }
    }

    @Override // com.anythink.core.common.l.c.a.e
    public final void a(com.anythink.core.common.l.f.a.a aVar) {
        this.b = aVar;
    }
}
