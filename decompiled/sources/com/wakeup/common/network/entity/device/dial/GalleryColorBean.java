package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialGalleryModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/GalleryColorBean;", "", "name", "", "rgbR", "", "rgbG", "rgbB", "<init>", "(Ljava/lang/String;III)V", "getName", "()Ljava/lang/String;", "getRgbR", "()I", "getRgbG", "getRgbB", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GalleryColorBean {
    private boolean isSelect;
    private final String name;
    private final int rgbB;
    private final int rgbG;
    private final int rgbR;

    public static /* synthetic */ GalleryColorBean copy$default(GalleryColorBean galleryColorBean, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = galleryColorBean.name;
        }
        if ((i4 & 2) != 0) {
            i = galleryColorBean.rgbR;
        }
        if ((i4 & 4) != 0) {
            i2 = galleryColorBean.rgbG;
        }
        if ((i4 & 8) != 0) {
            i3 = galleryColorBean.rgbB;
        }
        return galleryColorBean.copy(str, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRgbR() {
        return this.rgbR;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRgbG() {
        return this.rgbG;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRgbB() {
        return this.rgbB;
    }

    public final GalleryColorBean copy(String name, int rgbR, int rgbG, int rgbB) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GalleryColorBean(name, rgbR, rgbG, rgbB);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryColorBean)) {
            return false;
        }
        GalleryColorBean galleryColorBean = (GalleryColorBean) other;
        return Intrinsics.areEqual(this.name, galleryColorBean.name) && this.rgbR == galleryColorBean.rgbR && this.rgbG == galleryColorBean.rgbG && this.rgbB == galleryColorBean.rgbB;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Integer.hashCode(this.rgbR)) * 31) + Integer.hashCode(this.rgbG)) * 31) + Integer.hashCode(this.rgbB);
    }

    public String toString() {
        return "GalleryColorBean(name=" + this.name + ", rgbR=" + this.rgbR + ", rgbG=" + this.rgbG + ", rgbB=" + this.rgbB + Separators.RPAREN;
    }

    public GalleryColorBean(String name, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.rgbR = i;
        this.rgbG = i2;
        this.rgbB = i3;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRgbR() {
        return this.rgbR;
    }

    public final int getRgbG() {
        return this.rgbG;
    }

    public final int getRgbB() {
        return this.rgbB;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
