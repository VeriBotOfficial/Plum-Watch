package com.wakeup.module.tts.lfa.bean;

import android.gov.nist.core.Separators;
import com.anythink.expressad.f.a.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LfaBeans.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/wakeup/module/tts/lfa/bean/St;", "", b.bI, "", com.alipay.sdk.m.n.b.k, "", "bg", "rl", "ed", "rt", "", "Lcom/wakeup/module/tts/lfa/bean/Rt;", "<init>", "(FIIIILjava/util/List;)V", "getSc", "()F", "getPa", "()I", "getBg", "getRl", "getEd", "getRt", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class St {
    private final int bg;
    private final int ed;
    private final int pa;
    private final int rl;
    private final List<Rt> rt;
    private final float sc;

    public static /* synthetic */ St copy$default(St st, float f, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f = st.sc;
        }
        if ((i5 & 2) != 0) {
            i = st.pa;
        }
        if ((i5 & 4) != 0) {
            i2 = st.bg;
        }
        if ((i5 & 8) != 0) {
            i3 = st.rl;
        }
        if ((i5 & 16) != 0) {
            i4 = st.ed;
        }
        if ((i5 & 32) != 0) {
            list = st.rt;
        }
        int i6 = i4;
        List list2 = list;
        return st.copy(f, i, i2, i3, i6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSc() {
        return this.sc;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPa() {
        return this.pa;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBg() {
        return this.bg;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRl() {
        return this.rl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getEd() {
        return this.ed;
    }

    public final List<Rt> component6() {
        return this.rt;
    }

    public final St copy(float sc, int pa, int bg, int rl, int ed, List<Rt> rt) {
        Intrinsics.checkNotNullParameter(rt, "rt");
        return new St(sc, pa, bg, rl, ed, rt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof St)) {
            return false;
        }
        St st = (St) other;
        return Float.compare(this.sc, st.sc) == 0 && this.pa == st.pa && this.bg == st.bg && this.rl == st.rl && this.ed == st.ed && Intrinsics.areEqual(this.rt, st.rt);
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.sc) * 31) + Integer.hashCode(this.pa)) * 31) + Integer.hashCode(this.bg)) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.ed)) * 31) + this.rt.hashCode();
    }

    public String toString() {
        return "St(sc=" + this.sc + ", pa=" + this.pa + ", bg=" + this.bg + ", rl=" + this.rl + ", ed=" + this.ed + ", rt=" + this.rt + Separators.RPAREN;
    }

    public St(float f, int i, int i2, int i3, int i4, List<Rt> rt) {
        Intrinsics.checkNotNullParameter(rt, "rt");
        this.sc = f;
        this.pa = i;
        this.bg = i2;
        this.rl = i3;
        this.ed = i4;
        this.rt = rt;
    }

    public final float getSc() {
        return this.sc;
    }

    public final int getPa() {
        return this.pa;
    }

    public final int getBg() {
        return this.bg;
    }

    public final int getRl() {
        return this.rl;
    }

    public final int getEd() {
        return this.ed;
    }

    public final List<Rt> getRt() {
        return this.rt;
    }
}
