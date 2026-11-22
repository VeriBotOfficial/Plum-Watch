package com.wakeup.module.tts.lfa.bean;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LfaBeans.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/tts/lfa/bean/Ws;", "", "cw", "", "Lcom/wakeup/module/tts/lfa/bean/Cw;", "wb", "", "we", "<init>", "(Ljava/util/List;II)V", "getCw", "()Ljava/util/List;", "getWb", "()I", "getWe", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Ws {
    private final List<Cw> cw;
    private final int wb;
    private final int we;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ws copy$default(Ws ws, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = ws.cw;
        }
        if ((i3 & 2) != 0) {
            i = ws.wb;
        }
        if ((i3 & 4) != 0) {
            i2 = ws.we;
        }
        return ws.copy(list, i, i2);
    }

    public final List<Cw> component1() {
        return this.cw;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWb() {
        return this.wb;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWe() {
        return this.we;
    }

    public final Ws copy(List<Cw> cw, int wb, int we) {
        Intrinsics.checkNotNullParameter(cw, "cw");
        return new Ws(cw, wb, we);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ws)) {
            return false;
        }
        Ws ws = (Ws) other;
        return Intrinsics.areEqual(this.cw, ws.cw) && this.wb == ws.wb && this.we == ws.we;
    }

    public int hashCode() {
        return (((this.cw.hashCode() * 31) + Integer.hashCode(this.wb)) * 31) + Integer.hashCode(this.we);
    }

    public String toString() {
        return "Ws(cw=" + this.cw + ", wb=" + this.wb + ", we=" + this.we + Separators.RPAREN;
    }

    public Ws(List<Cw> cw, int i, int i2) {
        Intrinsics.checkNotNullParameter(cw, "cw");
        this.cw = cw;
        this.wb = i;
        this.we = i2;
    }

    public final List<Cw> getCw() {
        return this.cw;
    }

    public final int getWb() {
        return this.wb;
    }

    public final int getWe() {
        return this.we;
    }
}
