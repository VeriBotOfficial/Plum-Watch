package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GlassesKeyDefineBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesKeyDefineBean;", "", "keyFunc", "", "isSelect", "", "<init>", "(IZ)V", "getKeyFunc", "()I", "()Z", "setSelect", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesKeyDefineBean {
    private boolean isSelect;
    private final int keyFunc;

    public static /* synthetic */ GlassesKeyDefineBean copy$default(GlassesKeyDefineBean glassesKeyDefineBean, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = glassesKeyDefineBean.keyFunc;
        }
        if ((i2 & 2) != 0) {
            z = glassesKeyDefineBean.isSelect;
        }
        return glassesKeyDefineBean.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getKeyFunc() {
        return this.keyFunc;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final GlassesKeyDefineBean copy(int keyFunc, boolean isSelect) {
        return new GlassesKeyDefineBean(keyFunc, isSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesKeyDefineBean)) {
            return false;
        }
        GlassesKeyDefineBean glassesKeyDefineBean = (GlassesKeyDefineBean) other;
        return this.keyFunc == glassesKeyDefineBean.keyFunc && this.isSelect == glassesKeyDefineBean.isSelect;
    }

    public int hashCode() {
        return (Integer.hashCode(this.keyFunc) * 31) + Boolean.hashCode(this.isSelect);
    }

    public String toString() {
        return "GlassesKeyDefineBean(keyFunc=" + this.keyFunc + ", isSelect=" + this.isSelect + Separators.RPAREN;
    }

    public GlassesKeyDefineBean(int i, boolean z) {
        this.keyFunc = i;
        this.isSelect = z;
    }

    public /* synthetic */ GlassesKeyDefineBean(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    public final int getKeyFunc() {
        return this.keyFunc;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
