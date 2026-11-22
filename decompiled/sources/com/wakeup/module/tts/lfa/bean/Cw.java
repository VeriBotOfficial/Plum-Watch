package com.wakeup.module.tts.lfa.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LfaBeans.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/tts/lfa/bean/Cw;", "", "w", "", "wp", "wc", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getW", "()Ljava/lang/String;", "getWp", "getWc", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Cw {
    private final String w;
    private final float wc;
    private final String wp;

    public static /* synthetic */ Cw copy$default(Cw cw, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cw.w;
        }
        if ((i & 2) != 0) {
            str2 = cw.wp;
        }
        if ((i & 4) != 0) {
            f = cw.wc;
        }
        return cw.copy(str, str2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getW() {
        return this.w;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWp() {
        return this.wp;
    }

    /* renamed from: component3, reason: from getter */
    public final float getWc() {
        return this.wc;
    }

    public final Cw copy(String w, String wp, float wc) {
        Intrinsics.checkNotNullParameter(w, "w");
        Intrinsics.checkNotNullParameter(wp, "wp");
        return new Cw(w, wp, wc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cw)) {
            return false;
        }
        Cw cw = (Cw) other;
        return Intrinsics.areEqual(this.w, cw.w) && Intrinsics.areEqual(this.wp, cw.wp) && Float.compare(this.wc, cw.wc) == 0;
    }

    public int hashCode() {
        return (((this.w.hashCode() * 31) + this.wp.hashCode()) * 31) + Float.hashCode(this.wc);
    }

    public String toString() {
        return "Cw(w=" + this.w + ", wp=" + this.wp + ", wc=" + this.wc + Separators.RPAREN;
    }

    public Cw(String w, String wp, float f) {
        Intrinsics.checkNotNullParameter(w, "w");
        Intrinsics.checkNotNullParameter(wp, "wp");
        this.w = w;
        this.wp = wp;
        this.wc = f;
    }

    public final String getW() {
        return this.w;
    }

    public final String getWp() {
        return this.wp;
    }

    public final float getWc() {
        return this.wc;
    }
}
