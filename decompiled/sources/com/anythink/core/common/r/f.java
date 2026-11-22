package com.anythink.core.common.r;

/* loaded from: classes12.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final int f4272a = 16;
    private final h b;
    private final a c;

    public f(h hVar, a aVar) {
        this.b = hVar;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.f4272a, this.b);
        }
    }
}
