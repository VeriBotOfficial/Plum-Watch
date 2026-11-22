package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2391g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC1775Qg abstractC1775Qg);

    public abstract boolean A0Y(AbstractC1775Qg abstractC1775Qg);

    public abstract boolean A0Z(AbstractC1775Qg abstractC1775Qg, int i, int i2, int i3, int i4);

    public abstract boolean A0a(AbstractC1775Qg abstractC1775Qg, AbstractC1775Qg abstractC1775Qg2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC1775Qg abstractC1775Qg) {
        return !this.A00 || abstractC1775Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC1775Qg abstractC1775Qg, QJ qj, QJ qj2) {
        if (qj != null && (qj.A01 != qj2.A01 || qj.A03 != qj2.A03)) {
            return A0Z(abstractC1775Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        return A0X(abstractC1775Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC1775Qg abstractC1775Qg, QJ qj, QJ qj2) {
        int i = qj.A01;
        int oldLeft = qj.A03;
        View view = abstractC1775Qg.A0H;
        int oldTop = qj2 == null ? view.getLeft() : qj2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top2 = qj2 == null ? view.getTop() : qj2.A03;
        if (!abstractC1775Qg.A0g() && (i != oldTop || oldLeft != top2)) {
            view.layout(oldTop, top2, view.getWidth() + oldTop, view.getHeight() + top2);
            return A0Z(abstractC1775Qg, i, oldLeft, oldTop, top2);
        }
        return A0Y(abstractC1775Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC1775Qg abstractC1775Qg, QJ qj, QJ qj2) {
        if (qj.A01 != qj2.A01 || qj.A03 != qj2.A03) {
            return A0Z(abstractC1775Qg, qj.A01, qj.A03, qj2.A01, qj2.A03);
        }
        A0U(abstractC1775Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC1775Qg abstractC1775Qg, AbstractC1775Qg abstractC1775Qg2, QJ qj, QJ qj2) {
        int i;
        int i2;
        int i3 = qj.A01;
        int i4 = qj.A03;
        if (abstractC1775Qg2.A0l()) {
            i = qj.A01;
            i2 = qj.A03;
        } else {
            i = qj2.A01;
            i2 = qj2.A03;
        }
        return A0a(abstractC1775Qg, abstractC1775Qg2, i3, i4, i, i2);
    }

    public final void A0T(AbstractC1775Qg abstractC1775Qg) {
        A0K(abstractC1775Qg);
    }

    public final void A0U(AbstractC1775Qg abstractC1775Qg) {
        A0K(abstractC1775Qg);
    }

    public final void A0V(AbstractC1775Qg abstractC1775Qg) {
        A0K(abstractC1775Qg);
    }

    public final void A0W(AbstractC1775Qg abstractC1775Qg, boolean z) {
        A0K(abstractC1775Qg);
    }
}
