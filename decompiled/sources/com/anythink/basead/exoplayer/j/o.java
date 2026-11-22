package com.anythink.basead.exoplayer.j;

import android.content.Context;
import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes11.dex */
public final class o implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2645a;
    private final aa<? super h> b;
    private final h.a c;

    public o(Context context, String str) {
        this(context, str, (aa<? super h>) null);
    }

    private o(Context context, String str, aa<? super h> aaVar) {
        this(context, aaVar, new q(str, aaVar));
    }

    private o(Context context, aa<? super h> aaVar, h.a aVar) {
        this.f2645a = context.getApplicationContext();
        this.b = aaVar;
        this.c = aVar;
    }

    private n b() {
        return new n(this.f2645a, this.b, this.c.a());
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new n(this.f2645a, this.b, this.c.a());
    }
}
