package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2938pf {
    public final InterfaceC2943pk A00;
    public final String A01;
    public final Collection<C2952pu> A02;
    public final Collection<C2952pu> A03;
    public final List<Rect> A04;

    public C2938pf(String str, InterfaceC2943pk interfaceC2943pk, List<Rect> rects, Collection<C2952pu> collection, Collection<C2952pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2943pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
