package com.wakeup.feature.device.dial.bean;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* compiled from: DiyNumOrder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/device/dial/bean/DiyNumOrder;", "", TokenNames.R, "", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "B", "font", "func", "<init>", "(IIIII)V", "getR", "()I", "getG", "getB", "getFont", "getFunc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiyNumOrder {
    private final int B;
    private final int G;
    private final int R;
    private final int font;
    private final int func;

    public static /* synthetic */ DiyNumOrder copy$default(DiyNumOrder diyNumOrder, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = diyNumOrder.R;
        }
        if ((i6 & 2) != 0) {
            i2 = diyNumOrder.G;
        }
        if ((i6 & 4) != 0) {
            i3 = diyNumOrder.B;
        }
        if ((i6 & 8) != 0) {
            i4 = diyNumOrder.font;
        }
        if ((i6 & 16) != 0) {
            i5 = diyNumOrder.func;
        }
        int i7 = i5;
        int i8 = i3;
        return diyNumOrder.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* renamed from: component2, reason: from getter */
    public final int getG() {
        return this.G;
    }

    /* renamed from: component3, reason: from getter */
    public final int getB() {
        return this.B;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFont() {
        return this.font;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFunc() {
        return this.func;
    }

    public final DiyNumOrder copy(int R, int G, int B, int font, int func) {
        return new DiyNumOrder(R, G, B, font, func);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiyNumOrder)) {
            return false;
        }
        DiyNumOrder diyNumOrder = (DiyNumOrder) other;
        return this.R == diyNumOrder.R && this.G == diyNumOrder.G && this.B == diyNumOrder.B && this.font == diyNumOrder.font && this.func == diyNumOrder.func;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.R) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.B)) * 31) + Integer.hashCode(this.font)) * 31) + Integer.hashCode(this.func);
    }

    public String toString() {
        return "DiyNumOrder(R=" + this.R + ", G=" + this.G + ", B=" + this.B + ", font=" + this.font + ", func=" + this.func + Separators.RPAREN;
    }

    public DiyNumOrder(int i, int i2, int i3, int i4, int i5) {
        this.R = i;
        this.G = i2;
        this.B = i3;
        this.font = i4;
        this.func = i5;
    }

    public final int getB() {
        return this.B;
    }

    public final int getG() {
        return this.G;
    }

    public final int getR() {
        return this.R;
    }

    public final int getFont() {
        return this.font;
    }

    public final int getFunc() {
        return this.func;
    }
}
