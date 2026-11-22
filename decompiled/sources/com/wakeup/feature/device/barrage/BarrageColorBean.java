package com.wakeup.feature.device.barrage;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BarrageColorBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/device/barrage/BarrageColorBean;", "", "color", "", "check", "", "<init>", "(IZ)V", "getColor", "()I", "setColor", "(I)V", "getCheck", "()Z", "setCheck", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BarrageColorBean {
    private boolean check;
    private int color;

    /* JADX WARN: Multi-variable type inference failed */
    public BarrageColorBean() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ BarrageColorBean copy$default(BarrageColorBean barrageColorBean, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = barrageColorBean.color;
        }
        if ((i2 & 2) != 0) {
            z = barrageColorBean.check;
        }
        return barrageColorBean.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCheck() {
        return this.check;
    }

    public final BarrageColorBean copy(int color, boolean check) {
        return new BarrageColorBean(color, check);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarrageColorBean)) {
            return false;
        }
        BarrageColorBean barrageColorBean = (BarrageColorBean) other;
        return this.color == barrageColorBean.color && this.check == barrageColorBean.check;
    }

    public int hashCode() {
        return (Integer.hashCode(this.color) * 31) + Boolean.hashCode(this.check);
    }

    public String toString() {
        return "BarrageColorBean(color=" + this.color + ", check=" + this.check + Separators.RPAREN;
    }

    public BarrageColorBean(int i, boolean z) {
        this.color = i;
        this.check = z;
    }

    public /* synthetic */ BarrageColorBean(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }

    public final int getColor() {
        return this.color;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final boolean getCheck() {
        return this.check;
    }

    public final void setCheck(boolean z) {
        this.check = z;
    }
}
