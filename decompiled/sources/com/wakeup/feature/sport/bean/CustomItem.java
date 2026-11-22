package com.wakeup.feature.sport.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/wakeup/feature/sport/bean/CustomItem;", "", "imgUrl", "", "imgResId", "", "label", "type", "isCheck", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;IZ)V", "getImgUrl", "()Ljava/lang/String;", "getImgResId", "()I", "getLabel", "getType", "setType", "(I)V", "()Z", "setCheck", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomItem {
    private final int imgResId;
    private final String imgUrl;
    private boolean isCheck;
    private final String label;
    private int type;

    public CustomItem() {
        this(null, 0, null, 0, false, 31, null);
    }

    public static /* synthetic */ CustomItem copy$default(CustomItem customItem, String str, int i, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = customItem.imgUrl;
        }
        if ((i3 & 2) != 0) {
            i = customItem.imgResId;
        }
        if ((i3 & 4) != 0) {
            str2 = customItem.label;
        }
        if ((i3 & 8) != 0) {
            i2 = customItem.type;
        }
        if ((i3 & 16) != 0) {
            z = customItem.isCheck;
        }
        boolean z2 = z;
        String str3 = str2;
        return customItem.copy(str, i, str3, i2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImgResId() {
        return this.imgResId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    public final CustomItem copy(String imgUrl, int imgResId, String label, int type, boolean isCheck) {
        return new CustomItem(imgUrl, imgResId, label, type, isCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomItem)) {
            return false;
        }
        CustomItem customItem = (CustomItem) other;
        return Intrinsics.areEqual(this.imgUrl, customItem.imgUrl) && this.imgResId == customItem.imgResId && Intrinsics.areEqual(this.label, customItem.label) && this.type == customItem.type && this.isCheck == customItem.isCheck;
    }

    public int hashCode() {
        String str = this.imgUrl;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.imgResId)) * 31;
        String str2 = this.label;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Boolean.hashCode(this.isCheck);
    }

    public String toString() {
        return "CustomItem(imgUrl=" + this.imgUrl + ", imgResId=" + this.imgResId + ", label=" + this.label + ", type=" + this.type + ", isCheck=" + this.isCheck + Separators.RPAREN;
    }

    public CustomItem(String str, int i, String str2, int i2, boolean z) {
        this.imgUrl = str;
        this.imgResId = i;
        this.label = str2;
        this.type = i2;
        this.isCheck = z;
    }

    public /* synthetic */ CustomItem(String str, int i, String str2, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? false : z);
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final int getImgResId() {
        return this.imgResId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }
}
