package com.wakeup.feature.device.eq;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EQSettingBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0017\u0010\u0016¨\u0006!"}, d2 = {"Lcom/wakeup/feature/device/eq/EQSettingBean;", "", "id", "", "title", "", "check", "", "isCustom", "<init>", "(ILjava/lang/String;ZZ)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getCheck", "()Z", "setCheck", "(Z)V", "setCustom", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EQSettingBean {
    private boolean check;
    private int id;
    private boolean isCustom;
    private String title;

    public EQSettingBean() {
        this(0, null, false, false, 15, null);
    }

    public static /* synthetic */ EQSettingBean copy$default(EQSettingBean eQSettingBean, int i, String str, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eQSettingBean.id;
        }
        if ((i2 & 2) != 0) {
            str = eQSettingBean.title;
        }
        if ((i2 & 4) != 0) {
            z = eQSettingBean.check;
        }
        if ((i2 & 8) != 0) {
            z2 = eQSettingBean.isCustom;
        }
        return eQSettingBean.copy(i, str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCheck() {
        return this.check;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    public final EQSettingBean copy(int id2, String title, boolean check, boolean isCustom) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new EQSettingBean(id2, title, check, isCustom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EQSettingBean)) {
            return false;
        }
        EQSettingBean eQSettingBean = (EQSettingBean) other;
        return this.id == eQSettingBean.id && Intrinsics.areEqual(this.title, eQSettingBean.title) && this.check == eQSettingBean.check && this.isCustom == eQSettingBean.isCustom;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.check)) * 31) + Boolean.hashCode(this.isCustom);
    }

    public String toString() {
        return "EQSettingBean(id=" + this.id + ", title=" + this.title + ", check=" + this.check + ", isCustom=" + this.isCustom + Separators.RPAREN;
    }

    public EQSettingBean(int i, String title, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i;
        this.title = title;
        this.check = z;
        this.isCustom = z2;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public /* synthetic */ EQSettingBean(int i, String str, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final boolean getCheck() {
        return this.check;
    }

    public final void setCheck(boolean z) {
        this.check = z;
    }

    public final boolean isCustom() {
        return this.isCustom;
    }

    public final void setCustom(boolean z) {
        this.isCustom = z;
    }
}
