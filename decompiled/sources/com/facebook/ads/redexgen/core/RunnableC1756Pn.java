package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1756Pn implements Runnable {
    public final /* synthetic */ C12786j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1756Pn(C12786j c12786j, ArrayList arrayList) {
        this.A00 = c12786j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C1765Pw c1765Pw = (C1765Pw) it.next();
            this.A00.A0e(c1765Pw.A04, c1765Pw.A00, c1765Pw.A01, c1765Pw.A02, c1765Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
