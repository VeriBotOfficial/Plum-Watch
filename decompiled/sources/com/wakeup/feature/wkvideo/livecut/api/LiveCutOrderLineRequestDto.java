package com.wakeup.feature.wkvideo.livecut.api;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceApiModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutOrderLineRequestDto;", "", "productId", "", "clipId", "title", "priceFen", "", "buyPath", Const.SP_KEY_CALL_LOC_COUNT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getProductId", "()Ljava/lang/String;", "getClipId", "getTitle", "getPriceFen", "()I", "getBuyPath", "getCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutOrderLineRequestDto {

    @SerializedName("buyPath")
    private final String buyPath;

    @SerializedName("clipId")
    private final String clipId;

    @SerializedName(Const.SP_KEY_CALL_LOC_COUNT)
    private final int count;

    @SerializedName("priceFen")
    private final int priceFen;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("title")
    private final String title;

    public static /* synthetic */ LiveCutOrderLineRequestDto copy$default(LiveCutOrderLineRequestDto liveCutOrderLineRequestDto, String str, String str2, String str3, int i, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = liveCutOrderLineRequestDto.productId;
        }
        if ((i3 & 2) != 0) {
            str2 = liveCutOrderLineRequestDto.clipId;
        }
        if ((i3 & 4) != 0) {
            str3 = liveCutOrderLineRequestDto.title;
        }
        if ((i3 & 8) != 0) {
            i = liveCutOrderLineRequestDto.priceFen;
        }
        if ((i3 & 16) != 0) {
            str4 = liveCutOrderLineRequestDto.buyPath;
        }
        if ((i3 & 32) != 0) {
            i2 = liveCutOrderLineRequestDto.count;
        }
        String str5 = str4;
        int i4 = i2;
        return liveCutOrderLineRequestDto.copy(str, str2, str3, i, str5, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClipId() {
        return this.clipId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPriceFen() {
        return this.priceFen;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBuyPath() {
        return this.buyPath;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final LiveCutOrderLineRequestDto copy(String productId, String clipId, String title, int priceFen, String buyPath, int count) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        return new LiveCutOrderLineRequestDto(productId, clipId, title, priceFen, buyPath, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutOrderLineRequestDto)) {
            return false;
        }
        LiveCutOrderLineRequestDto liveCutOrderLineRequestDto = (LiveCutOrderLineRequestDto) other;
        return Intrinsics.areEqual(this.productId, liveCutOrderLineRequestDto.productId) && Intrinsics.areEqual(this.clipId, liveCutOrderLineRequestDto.clipId) && Intrinsics.areEqual(this.title, liveCutOrderLineRequestDto.title) && this.priceFen == liveCutOrderLineRequestDto.priceFen && Intrinsics.areEqual(this.buyPath, liveCutOrderLineRequestDto.buyPath) && this.count == liveCutOrderLineRequestDto.count;
    }

    public int hashCode() {
        return (((((((((this.productId.hashCode() * 31) + this.clipId.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.priceFen)) * 31) + this.buyPath.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "LiveCutOrderLineRequestDto(productId=" + this.productId + ", clipId=" + this.clipId + ", title=" + this.title + ", priceFen=" + this.priceFen + ", buyPath=" + this.buyPath + ", count=" + this.count + Separators.RPAREN;
    }

    public LiveCutOrderLineRequestDto(String productId, String clipId, String title, int i, String buyPath, int i2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        this.productId = productId;
        this.clipId = clipId;
        this.title = title;
        this.priceFen = i;
        this.buyPath = buyPath;
        this.count = i2;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getClipId() {
        return this.clipId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getPriceFen() {
        return this.priceFen;
    }

    public final String getBuyPath() {
        return this.buyPath;
    }

    public final int getCount() {
        return this.count;
    }
}
