package com.facebook.ads.redexgen.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C13429i extends AbstractC1375Ap<String, List<String>> {
    public final Map<String, List<String>> A00;

    public C13429i(Map<String, List<String>> headers) {
        this.A00 = headers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final List<String> get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    public static /* synthetic */ boolean A01(String str) {
        return str != null;
    }

    public static /* synthetic */ boolean A02(Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2756mP
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> A03() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final boolean containsValue(Object obj) {
        return A06(obj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final Set<Map.Entry<String, List<String>>> entrySet() {
        return AbstractC2908ou.A07(super.entrySet(), new InterfaceC2571jB() { // from class: com.facebook.ads.redexgen.X.ni
            @Override // com.facebook.ads.redexgen.core.InterfaceC2571jB
            public final boolean A44(Object obj) {
                return C13429i.A02((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && A07(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return A04();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final Set<String> keySet() {
        return AbstractC2908ou.A07(super.keySet(), new InterfaceC2571jB() { // from class: com.facebook.ads.redexgen.X.nj
            @Override // com.facebook.ads.redexgen.core.InterfaceC2571jB
            public final boolean A44(Object obj) {
                return C13429i.A01((String) obj);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1375Ap, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
