package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1617Kb {
    public final int A00;
    public final String A01;
    public final List<C1616Ka> A02;
    public final byte[] A03;

    public C1617Kb(int i, String str, List<C1616Ka> list, byte[] bArr) {
        List<C1616Ka> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
