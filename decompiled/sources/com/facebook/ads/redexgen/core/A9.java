package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public class A9 implements InterfaceC2947pp {
    public final /* synthetic */ A8 A00;

    public A9(A8 a8) {
        this.A00 = a8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2947pp
    public final void AF8() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC2947pp interfaceC2947pp;
        InterfaceC2947pp interfaceC2947pp2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC2947pp = this.A00.A01;
        if (interfaceC2947pp != null) {
            interfaceC2947pp2 = this.A00.A01;
            interfaceC2947pp2.AF8();
        }
    }
}
