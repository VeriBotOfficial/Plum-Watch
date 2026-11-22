package com.anythink.core.common.t;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4343a = "TimeOutHandlerImpl";
    private static volatile d b;
    private final Handler d = com.anythink.core.common.v.b.b.a().a(12);
    private final Handler c = new Handler(Looper.getMainLooper());

    public static a a() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    private d() {
    }

    private Handler a(boolean z) {
        return z ? this.c : this.d;
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar) {
        a(bVar, 3000L, true);
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar, long j, boolean z) {
        Handler a2 = a(z);
        if (a2 == null) {
            return;
        }
        a2.postDelayed(bVar, j);
    }

    @Override // com.anythink.core.common.t.a
    public final void b(b bVar) {
        Handler handler = this.c;
        if (handler != null && bVar != null) {
            handler.removeCallbacks(bVar);
        }
        Handler handler2 = this.d;
        if (handler2 == null || bVar == null) {
            return;
        }
        handler2.removeCallbacks(bVar);
    }
}
