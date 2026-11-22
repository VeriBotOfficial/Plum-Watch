package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerGameModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/opts/BannerGameItemModel;", "", "id", "", "imageUrl", "", "imageCode", "imageDesc", "jumpUrl", "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getImageUrl", "()Ljava/lang/String;", "getImageCode", "getImageDesc", "getJumpUrl", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerGameItemModel {
    private final int id;
    private final String imageCode;
    private final String imageDesc;
    private final String imageUrl;
    private final String jumpUrl;
    private final String type;

    public static /* synthetic */ BannerGameItemModel copy$default(BannerGameItemModel bannerGameItemModel, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bannerGameItemModel.id;
        }
        if ((i2 & 2) != 0) {
            str = bannerGameItemModel.imageUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = bannerGameItemModel.imageCode;
        }
        if ((i2 & 8) != 0) {
            str3 = bannerGameItemModel.imageDesc;
        }
        if ((i2 & 16) != 0) {
            str4 = bannerGameItemModel.jumpUrl;
        }
        if ((i2 & 32) != 0) {
            str5 = bannerGameItemModel.type;
        }
        String str6 = str4;
        String str7 = str5;
        return bannerGameItemModel.copy(i, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageCode() {
        return this.imageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageDesc() {
        return this.imageDesc;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final BannerGameItemModel copy(int id2, String imageUrl, String imageCode, String imageDesc, String jumpUrl, String type) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageCode, "imageCode");
        Intrinsics.checkNotNullParameter(imageDesc, "imageDesc");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BannerGameItemModel(id2, imageUrl, imageCode, imageDesc, jumpUrl, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerGameItemModel)) {
            return false;
        }
        BannerGameItemModel bannerGameItemModel = (BannerGameItemModel) other;
        return this.id == bannerGameItemModel.id && Intrinsics.areEqual(this.imageUrl, bannerGameItemModel.imageUrl) && Intrinsics.areEqual(this.imageCode, bannerGameItemModel.imageCode) && Intrinsics.areEqual(this.imageDesc, bannerGameItemModel.imageDesc) && Intrinsics.areEqual(this.jumpUrl, bannerGameItemModel.jumpUrl) && Intrinsics.areEqual(this.type, bannerGameItemModel.type);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.id) * 31) + this.imageUrl.hashCode()) * 31) + this.imageCode.hashCode()) * 31) + this.imageDesc.hashCode()) * 31;
        String str = this.jumpUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BannerGameItemModel(id=" + this.id + ", imageUrl=" + this.imageUrl + ", imageCode=" + this.imageCode + ", imageDesc=" + this.imageDesc + ", jumpUrl=" + this.jumpUrl + ", type=" + this.type + Separators.RPAREN;
    }

    public BannerGameItemModel(int i, String imageUrl, String imageCode, String imageDesc, String str, String type) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageCode, "imageCode");
        Intrinsics.checkNotNullParameter(imageDesc, "imageDesc");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = i;
        this.imageUrl = imageUrl;
        this.imageCode = imageCode;
        this.imageDesc = imageDesc;
        this.jumpUrl = str;
        this.type = type;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageCode() {
        return this.imageCode;
    }

    public final String getImageDesc() {
        return this.imageDesc;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getType() {
        return this.type;
    }
}
