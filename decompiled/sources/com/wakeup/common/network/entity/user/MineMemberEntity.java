package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MineMemberEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/user/MineMemberEntity;", "", "icon", "", "title", "", "isNew", "", "jumpType", "<init>", "(ILjava/lang/String;ZI)V", "getIcon", "()I", "getTitle", "()Ljava/lang/String;", "()Z", "getJumpType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MineMemberEntity {
    public static final int JUMP_TYPE_CODE = 4;
    public static final int JUMP_TYPE_DIAL = 2;
    public static final int JUMP_TYPE_POINT = 0;
    public static final int JUMP_TYPE_VIP_H5 = 1;
    public static final int JUMP_TYPE_WARGING = 3;
    private final int icon;
    private final boolean isNew;
    private final int jumpType;
    private final String title;

    public static /* synthetic */ MineMemberEntity copy$default(MineMemberEntity mineMemberEntity, int i, String str, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mineMemberEntity.icon;
        }
        if ((i3 & 2) != 0) {
            str = mineMemberEntity.title;
        }
        if ((i3 & 4) != 0) {
            z = mineMemberEntity.isNew;
        }
        if ((i3 & 8) != 0) {
            i2 = mineMemberEntity.jumpType;
        }
        return mineMemberEntity.copy(i, str, z, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* renamed from: component4, reason: from getter */
    public final int getJumpType() {
        return this.jumpType;
    }

    public final MineMemberEntity copy(int icon, String title, boolean isNew, int jumpType) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MineMemberEntity(icon, title, isNew, jumpType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MineMemberEntity)) {
            return false;
        }
        MineMemberEntity mineMemberEntity = (MineMemberEntity) other;
        return this.icon == mineMemberEntity.icon && Intrinsics.areEqual(this.title, mineMemberEntity.title) && this.isNew == mineMemberEntity.isNew && this.jumpType == mineMemberEntity.jumpType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isNew)) * 31) + Integer.hashCode(this.jumpType);
    }

    public String toString() {
        return "MineMemberEntity(icon=" + this.icon + ", title=" + this.title + ", isNew=" + this.isNew + ", jumpType=" + this.jumpType + Separators.RPAREN;
    }

    public MineMemberEntity(int i, String title, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = i;
        this.title = title;
        this.isNew = z;
        this.jumpType = i2;
    }

    public /* synthetic */ MineMemberEntity(int i, String str, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i3 & 4) != 0 ? false : z, i2);
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final int getJumpType() {
        return this.jumpType;
    }
}
