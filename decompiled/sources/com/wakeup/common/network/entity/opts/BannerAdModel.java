package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerAdModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J1\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u001c¨\u0006*"}, d2 = {"Lcom/wakeup/common/network/entity/opts/BannerAdModel;", "", "pageStyle", "", SocialConstants.PARAM_IMG_URL, "", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "name", "<init>", "(ILjava/lang/String;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/String;)V", "getPageStyle", "()I", "getImg", "()Ljava/lang/String;", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "getName", "id", "getId", "setId", "(I)V", Constants.SORT, "getSort", "setSort", "title", "getTitle", d.p, "(Ljava/lang/String;)V", "productId", "getProductId", "setProductId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerAdModel {
    private int id;
    private final String img;
    private final OptsJumpModel jumpVo;
    private final String name;
    private final int pageStyle;
    private String productId;
    private int sort;
    private String title;

    public static /* synthetic */ BannerAdModel copy$default(BannerAdModel bannerAdModel, int i, String str, OptsJumpModel optsJumpModel, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bannerAdModel.pageStyle;
        }
        if ((i2 & 2) != 0) {
            str = bannerAdModel.img;
        }
        if ((i2 & 4) != 0) {
            optsJumpModel = bannerAdModel.jumpVo;
        }
        if ((i2 & 8) != 0) {
            str2 = bannerAdModel.name;
        }
        return bannerAdModel.copy(i, str, optsJumpModel, str2);
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
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final BannerAdModel copy(int pageStyle, String img, OptsJumpModel jumpVo, String name) {
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BannerAdModel(pageStyle, img, jumpVo, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerAdModel)) {
            return false;
        }
        BannerAdModel bannerAdModel = (BannerAdModel) other;
        return this.pageStyle == bannerAdModel.pageStyle && Intrinsics.areEqual(this.img, bannerAdModel.img) && Intrinsics.areEqual(this.jumpVo, bannerAdModel.jumpVo) && Intrinsics.areEqual(this.name, bannerAdModel.name);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.pageStyle) * 31) + this.img.hashCode()) * 31) + this.jumpVo.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "BannerAdModel(pageStyle=" + this.pageStyle + ", img=" + this.img + ", jumpVo=" + this.jumpVo + ", name=" + this.name + Separators.RPAREN;
    }

    public BannerAdModel(int i, String img, OptsJumpModel jumpVo, String name) {
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        Intrinsics.checkNotNullParameter(name, "name");
        this.pageStyle = i;
        this.img = img;
        this.jumpVo = jumpVo;
        this.name = name;
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

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public /* synthetic */ BannerAdModel(int i, String str, OptsJumpModel optsJumpModel, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, optsJumpModel, (i2 & 8) != 0 ? "" : str2);
    }

    public final String getName() {
        return this.name;
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
