package com.wakeup.common.network.entity.menubg;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuWallpaperStyle.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/menubg/MenuWallpaperStyle;", "", "styleId", "", "styleName", "", "icon", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getStyleId", "()I", "getStyleName", "()Ljava/lang/String;", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenuWallpaperStyle {
    private final String icon;
    private final int styleId;
    private final String styleName;

    public static /* synthetic */ MenuWallpaperStyle copy$default(MenuWallpaperStyle menuWallpaperStyle, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menuWallpaperStyle.styleId;
        }
        if ((i2 & 2) != 0) {
            str = menuWallpaperStyle.styleName;
        }
        if ((i2 & 4) != 0) {
            str2 = menuWallpaperStyle.icon;
        }
        return menuWallpaperStyle.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStyleId() {
        return this.styleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStyleName() {
        return this.styleName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final MenuWallpaperStyle copy(int styleId, String styleName, String icon) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new MenuWallpaperStyle(styleId, styleName, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuWallpaperStyle)) {
            return false;
        }
        MenuWallpaperStyle menuWallpaperStyle = (MenuWallpaperStyle) other;
        return this.styleId == menuWallpaperStyle.styleId && Intrinsics.areEqual(this.styleName, menuWallpaperStyle.styleName) && Intrinsics.areEqual(this.icon, menuWallpaperStyle.icon);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.styleId) * 31) + this.styleName.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "MenuWallpaperStyle(styleId=" + this.styleId + ", styleName=" + this.styleName + ", icon=" + this.icon + Separators.RPAREN;
    }

    public MenuWallpaperStyle(int i, String styleName, String icon) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.styleId = i;
        this.styleName = styleName;
        this.icon = icon;
    }

    public final int getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getIcon() {
        return this.icon;
    }
}
