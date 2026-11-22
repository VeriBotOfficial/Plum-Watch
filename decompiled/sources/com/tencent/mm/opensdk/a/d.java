package com.tencent.mm.opensdk.a;

import java.util.List;

/* loaded from: classes2.dex */
final class d implements Runnable {
    final /* synthetic */ b F;
    final /* synthetic */ List G;

    d(b bVar, List list) {
        this.F = bVar;
        this.G = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a((List<f>) this.G);
    }
}
