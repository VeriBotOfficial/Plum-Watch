package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes16.dex */
final class aa extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f10052a;
    final /* synthetic */ ad b;

    aa(ad adVar, IBinder iBinder) {
        this.b = adVar;
        this.f10052a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        z zVar;
        List list;
        List list2;
        zVar = this.b.f10054a.j;
        this.b.f10054a.o = (IInterface) zVar.a(this.f10052a);
        ae.r(this.b.f10054a);
        this.b.f10054a.h = false;
        list = this.b.f10054a.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.b.f10054a.e;
        list2.clear();
    }
}
