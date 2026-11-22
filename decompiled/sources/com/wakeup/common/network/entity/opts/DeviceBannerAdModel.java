package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import com.wakeup.common.storage.model.FunctionComponentJumpInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceBannerAdModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J'\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001a¨\u0006'"}, d2 = {"Lcom/wakeup/common/network/entity/opts/DeviceBannerAdModel;", "", "pageStyle", "", SocialConstants.PARAM_IMG_URL, "", "jumpVo", "Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "<init>", "(ILjava/lang/String;Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;)V", "getPageStyle", "()I", "getImg", "()Ljava/lang/String;", "getJumpVo", "()Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "id", "getId", "setId", "(I)V", Constants.SORT, "getSort", "setSort", "title", "getTitle", d.p, "(Ljava/lang/String;)V", "productId", "getProductId", "setProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceBannerAdModel {
    private int id;
    private final String img;
    private final FunctionComponentJumpInfo jumpVo;
    private final int pageStyle;
    private String productId;
    private int sort;
    private String title;

    public static /* synthetic */ DeviceBannerAdModel copy$default(DeviceBannerAdModel deviceBannerAdModel, int i, String str, FunctionComponentJumpInfo functionComponentJumpInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceBannerAdModel.pageStyle;
        }
        if ((i2 & 2) != 0) {
            str = deviceBannerAdModel.img;
        }
        if ((i2 & 4) != 0) {
            functionComponentJumpInfo = deviceBannerAdModel.jumpVo;
        }
        return deviceBannerAdModel.copy(i, str, functionComponentJumpInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPageStyle() {
        return this.pageStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component3, reason: from getter */
    public final FunctionComponentJumpInfo getJumpVo() {
        return this.jumpVo;
    }

    public final DeviceBannerAdModel copy(int pageStyle, String img, FunctionComponentJumpInfo jumpVo) {
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new DeviceBannerAdModel(pageStyle, img, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBannerAdModel)) {
            return false;
        }
        DeviceBannerAdModel deviceBannerAdModel = (DeviceBannerAdModel) other;
        return this.pageStyle == deviceBannerAdModel.pageStyle && Intrinsics.areEqual(this.img, deviceBannerAdModel.img) && Intrinsics.areEqual(this.jumpVo, deviceBannerAdModel.jumpVo);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.pageStyle) * 31) + this.img.hashCode()) * 31) + this.jumpVo.hashCode();
    }

    public String toString() {
        return "DeviceBannerAdModel(pageStyle=" + this.pageStyle + ", img=" + this.img + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public DeviceBannerAdModel(int i, String img, FunctionComponentJumpInfo jumpVo) {
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.pageStyle = i;
        this.img = img;
        this.jumpVo = jumpVo;
        this.id = -1;
        this.sort = -1;
        this.title = "";
        this.productId = "";
    }

    public final int getPageStyle() {
        return this.pageStyle;
    }

    public final String getImg() {
        return this.img;
    }

    public final FunctionComponentJumpInfo getJumpVo() {
        return this.jumpVo;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final int getSort() {
        return this.sort;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }
}
