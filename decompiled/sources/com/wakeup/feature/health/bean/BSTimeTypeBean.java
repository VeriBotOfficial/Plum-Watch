package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BSTimeTypeBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/health/bean/BSTimeTypeBean;", "", "type", "", "typeString", "", "isSelected", "", "<init>", "(ILjava/lang/String;Z)V", "getType", "()I", "getTypeString", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BSTimeTypeBean {
    public static final int $stable = 8;
    private boolean isSelected;
    private final int type;
    private final String typeString;

    public static /* synthetic */ BSTimeTypeBean copy$default(BSTimeTypeBean bSTimeTypeBean, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bSTimeTypeBean.type;
        }
        if ((i2 & 2) != 0) {
            str = bSTimeTypeBean.typeString;
        }
        if ((i2 & 4) != 0) {
            z = bSTimeTypeBean.isSelected;
        }
        return bSTimeTypeBean.copy(i, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTypeString() {
        return this.typeString;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final BSTimeTypeBean copy(int type, String typeString, boolean isSelected) {
        Intrinsics.checkNotNullParameter(typeString, "typeString");
        return new BSTimeTypeBean(type, typeString, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BSTimeTypeBean)) {
            return false;
        }
        BSTimeTypeBean bSTimeTypeBean = (BSTimeTypeBean) other;
        return this.type == bSTimeTypeBean.type && Intrinsics.areEqual(this.typeString, bSTimeTypeBean.typeString) && this.isSelected == bSTimeTypeBean.isSelected;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + this.typeString.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "BSTimeTypeBean(type=" + this.type + ", typeString=" + this.typeString + ", isSelected=" + this.isSelected + Separators.RPAREN;
    }

    public BSTimeTypeBean(int i, String typeString, boolean z) {
        Intrinsics.checkNotNullParameter(typeString, "typeString");
        this.type = i;
        this.typeString = typeString;
        this.isSelected = z;
    }

    public /* synthetic */ BSTimeTypeBean(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    public final int getType() {
        return this.type;
    }

    public final String getTypeString() {
        return this.typeString;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
