package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class K8 implements Comparable<K8> {
    public final int A00;
    public final C1615Jz A01;

    public K8(int i, C1615Jz c1615Jz) {
        this.A00 = i;
        this.A01 = c1615Jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(K8 k8) {
        return Integer.compare(this.A00, k8.A00);
    }
}
