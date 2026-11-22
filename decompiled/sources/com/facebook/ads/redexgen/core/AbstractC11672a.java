package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11672a {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC11672a(AbstractC11672a abstractC11672a) {
        this.A04 = abstractC11672a.A04;
        this.A00 = abstractC11672a.A00;
        this.A01 = abstractC11672a.A01;
        this.A03 = abstractC11672a.A03;
        this.A02 = abstractC11672a.A02;
    }

    public AbstractC11672a(Object obj) {
        this(obj, -1L);
    }

    public AbstractC11672a(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public AbstractC11672a(Object obj, int i, int i2, long j, int i3) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public AbstractC11672a(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC11672a)) {
            return false;
        }
        AbstractC11672a abstractC11672a = (AbstractC11672a) obj;
        return this.A04.equals(abstractC11672a.A04) && this.A00 == abstractC11672a.A00 && this.A01 == abstractC11672a.A01 && this.A03 == abstractC11672a.A03 && this.A02 == abstractC11672a.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
