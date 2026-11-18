package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC18912a {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC18912a(AbstractC18912a abstractC18912a) {
        this.A04 = abstractC18912a.A04;
        this.A00 = abstractC18912a.A00;
        this.A01 = abstractC18912a.A01;
        this.A03 = abstractC18912a.A03;
        this.A02 = abstractC18912a.A02;
    }

    public AbstractC18912a(Object obj) {
        this(obj, -1L);
    }

    public AbstractC18912a(Object obj, int r9, int r10, long j) {
        this(obj, r9, r10, j, -1);
    }

    public AbstractC18912a(Object obj, int r2, int r3, long j, int r6) {
        this.A04 = obj;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = j;
        this.A02 = r6;
    }

    public AbstractC18912a(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC18912a)) {
            return false;
        }
        AbstractC18912a abstractC18912a = (AbstractC18912a) obj;
        return this.A04.equals(abstractC18912a.A04) && this.A00 == abstractC18912a.A00 && this.A01 == abstractC18912a.A01 && this.A03 == abstractC18912a.A03 && this.A02 == abstractC18912a.A02;
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
