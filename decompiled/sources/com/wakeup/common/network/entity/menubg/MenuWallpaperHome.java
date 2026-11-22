package com.wakeup.common.network.entity.menubg;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuWallpaperHome.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/menubg/MenuWallpaperHome;", "", "styleId", "", "styleName", "", "voList", "", "Lcom/wakeup/common/network/entity/menubg/MenuWallpaperEntity;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getStyleId", "()I", "getStyleName", "()Ljava/lang/String;", "getVoList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenuWallpaperHome {
    private final int styleId;
    private final String styleName;
    private final List<MenuWallpaperEntity> voList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuWallpaperHome copy$default(MenuWallpaperHome menuWallpaperHome, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menuWallpaperHome.styleId;
        }
        if ((i2 & 2) != 0) {
            str = menuWallpaperHome.styleName;
        }
        if ((i2 & 4) != 0) {
            list = menuWallpaperHome.voList;
        }
        return menuWallpaperHome.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStyleId() {
        return this.styleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStyleName() {
        return this.styleName;
    }

    public final List<MenuWallpaperEntity> component3() {
        return this.voList;
    }

    public final MenuWallpaperHome copy(int styleId, String styleName, List<MenuWallpaperEntity> voList) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(voList, "voList");
        return new MenuWallpaperHome(styleId, styleName, voList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuWallpaperHome)) {
            return false;
        }
        MenuWallpaperHome menuWallpaperHome = (MenuWallpaperHome) other;
        return this.styleId == menuWallpaperHome.styleId && Intrinsics.areEqual(this.styleName, menuWallpaperHome.styleName) && Intrinsics.areEqual(this.voList, menuWallpaperHome.voList);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.styleId) * 31) + this.styleName.hashCode()) * 31) + this.voList.hashCode();
    }

    public String toString() {
        return "MenuWallpaperHome(styleId=" + this.styleId + ", styleName=" + this.styleName + ", voList=" + this.voList + Separators.RPAREN;
    }

    public MenuWallpaperHome(int i, String styleName, List<MenuWallpaperEntity> voList) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(voList, "voList");
        this.styleId = i;
        this.styleName = styleName;
        this.voList = voList;
    }

    public final int getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final List<MenuWallpaperEntity> getVoList() {
        return this.voList;
    }
}
