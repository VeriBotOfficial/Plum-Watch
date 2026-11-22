package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeMarketEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/device/ThemeMarketEntity;", "", "type", "", "name", "", "icon", "<init>", "(ILjava/lang/String;I)V", "getType", "()I", "getName", "()Ljava/lang/String;", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ThemeMarketEntity {
    private final int icon;
    private final String name;
    private final int type;

    public static /* synthetic */ ThemeMarketEntity copy$default(ThemeMarketEntity themeMarketEntity, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = themeMarketEntity.type;
        }
        if ((i3 & 2) != 0) {
            str = themeMarketEntity.name;
        }
        if ((i3 & 4) != 0) {
            i2 = themeMarketEntity.icon;
        }
        return themeMarketEntity.copy(i, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public final ThemeMarketEntity copy(int type, String name, int icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThemeMarketEntity(type, name, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeMarketEntity)) {
            return false;
        }
        ThemeMarketEntity themeMarketEntity = (ThemeMarketEntity) other;
        return this.type == themeMarketEntity.type && Intrinsics.areEqual(this.name, themeMarketEntity.name) && this.icon == themeMarketEntity.icon;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.icon);
    }

    public String toString() {
        return "ThemeMarketEntity(type=" + this.type + ", name=" + this.name + ", icon=" + this.icon + Separators.RPAREN;
    }

    public ThemeMarketEntity(int i, String name, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i;
        this.name = name;
        this.icon = i2;
    }

    public final int getType() {
        return this.type;
    }

    public final String getName() {
        return this.name;
    }

    public final int getIcon() {
        return this.icon;
    }
}
