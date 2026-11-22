package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.gc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2426gc<K, V> extends OY<K, V> {
    public final /* synthetic */ C2425gb A00;

    public C2426gc(C2425gb c2425gb) {
        this.A00 = c2425gb;
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final int A04() {
        return ((C1719Ob) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.core.OY
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
