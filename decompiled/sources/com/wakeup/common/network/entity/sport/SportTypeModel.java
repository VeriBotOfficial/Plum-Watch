package com.wakeup.common.network.entity.sport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportTypeModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportTypeModel;", "", "<init>", "()V", "sportTypeId", "", "getSportTypeId", "()I", "setSportTypeId", "(I)V", "typeName", "", "getTypeName", "()Ljava/lang/String;", "setTypeName", "(Ljava/lang/String;)V", "categoryName", "getCategoryName", "setCategoryName", "categoryId", "getCategoryId", "setCategoryId", "icon", "getIcon", "setIcon", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportTypeModel {
    private int categoryId;
    private int sportTypeId;
    private String typeName = "";
    private String categoryName = "";
    private String icon = "";

    public final int getSportTypeId() {
        return this.sportTypeId;
    }

    public final void setSportTypeId(int i) {
        this.sportTypeId = i;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final void setTypeName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeName = str;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final void setCategoryName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryName = str;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }
}
