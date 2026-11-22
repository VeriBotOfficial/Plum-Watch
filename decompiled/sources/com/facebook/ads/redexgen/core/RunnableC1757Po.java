package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1757Po implements Runnable {
    public final /* synthetic */ C12786j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1757Po(C12786j c12786j, ArrayList arrayList) {
        this.A00 = c12786j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C1764Pv change = (C1764Pv) it.next();
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
