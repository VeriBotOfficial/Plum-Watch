package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialGalleryModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/GalleryStyleBean;", "", "name", "", "font", "", "topImage", "middleImage", "bottomImage", "bottomFirmwareModuleId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getFont", "()I", "getTopImage", "getMiddleImage", "getBottomImage", "getBottomFirmwareModuleId", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GalleryStyleBean {
    private final int bottomFirmwareModuleId;
    private final String bottomImage;
    private final int font;
    private boolean isSelect;
    private final String middleImage;
    private final String name;
    private final String topImage;

    public static /* synthetic */ GalleryStyleBean copy$default(GalleryStyleBean galleryStyleBean, String str, int i, String str2, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = galleryStyleBean.name;
        }
        if ((i3 & 2) != 0) {
            i = galleryStyleBean.font;
        }
        if ((i3 & 4) != 0) {
            str2 = galleryStyleBean.topImage;
        }
        if ((i3 & 8) != 0) {
            str3 = galleryStyleBean.middleImage;
        }
        if ((i3 & 16) != 0) {
            str4 = galleryStyleBean.bottomImage;
        }
        if ((i3 & 32) != 0) {
            i2 = galleryStyleBean.bottomFirmwareModuleId;
        }
        String str5 = str4;
        int i4 = i2;
        return galleryStyleBean.copy(str, i, str2, str3, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFont() {
        return this.font;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTopImage() {
        return this.topImage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMiddleImage() {
        return this.middleImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBottomImage() {
        return this.bottomImage;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBottomFirmwareModuleId() {
        return this.bottomFirmwareModuleId;
    }

    public final GalleryStyleBean copy(String name, int font, String topImage, String middleImage, String bottomImage, int bottomFirmwareModuleId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(topImage, "topImage");
        Intrinsics.checkNotNullParameter(middleImage, "middleImage");
        Intrinsics.checkNotNullParameter(bottomImage, "bottomImage");
        return new GalleryStyleBean(name, font, topImage, middleImage, bottomImage, bottomFirmwareModuleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryStyleBean)) {
            return false;
        }
        GalleryStyleBean galleryStyleBean = (GalleryStyleBean) other;
        return Intrinsics.areEqual(this.name, galleryStyleBean.name) && this.font == galleryStyleBean.font && Intrinsics.areEqual(this.topImage, galleryStyleBean.topImage) && Intrinsics.areEqual(this.middleImage, galleryStyleBean.middleImage) && Intrinsics.areEqual(this.bottomImage, galleryStyleBean.bottomImage) && this.bottomFirmwareModuleId == galleryStyleBean.bottomFirmwareModuleId;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + Integer.hashCode(this.font)) * 31) + this.topImage.hashCode()) * 31) + this.middleImage.hashCode()) * 31) + this.bottomImage.hashCode()) * 31) + Integer.hashCode(this.bottomFirmwareModuleId);
    }

    public String toString() {
        return "GalleryStyleBean(name=" + this.name + ", font=" + this.font + ", topImage=" + this.topImage + ", middleImage=" + this.middleImage + ", bottomImage=" + this.bottomImage + ", bottomFirmwareModuleId=" + this.bottomFirmwareModuleId + Separators.RPAREN;
    }

    public GalleryStyleBean(String name, int i, String topImage, String middleImage, String bottomImage, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(topImage, "topImage");
        Intrinsics.checkNotNullParameter(middleImage, "middleImage");
        Intrinsics.checkNotNullParameter(bottomImage, "bottomImage");
        this.name = name;
        this.font = i;
        this.topImage = topImage;
        this.middleImage = middleImage;
        this.bottomImage = bottomImage;
        this.bottomFirmwareModuleId = i2;
    }

    public final String getName() {
        return this.name;
    }

    public final int getFont() {
        return this.font;
    }

    public final String getTopImage() {
        return this.topImage;
    }

    public final String getMiddleImage() {
        return this.middleImage;
    }

    public final String getBottomImage() {
        return this.bottomImage;
    }

    public final int getBottomFirmwareModuleId() {
        return this.bottomFirmwareModuleId;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
