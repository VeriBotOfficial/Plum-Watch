package com.wakeup.feature.wkvideo.livecut.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;", "", "productId", "", "clipId", "title", "priceFen", "", "buyPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getClipId", "getTitle", "getPriceFen", "()I", "getBuyPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutProduct {
    private final String buyPath;
    private final String clipId;
    private final int priceFen;
    private final String productId;
    private final String title;

    public static /* synthetic */ LiveCutProduct copy$default(LiveCutProduct liveCutProduct, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveCutProduct.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = liveCutProduct.clipId;
        }
        if ((i2 & 4) != 0) {
            str3 = liveCutProduct.title;
        }
        if ((i2 & 8) != 0) {
            i = liveCutProduct.priceFen;
        }
        if ((i2 & 16) != 0) {
            str4 = liveCutProduct.buyPath;
        }
        String str5 = str4;
        String str6 = str3;
        return liveCutProduct.copy(str, str2, str6, i, str5);
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

    public final LiveCutProduct copy(String productId, String clipId, String title, int priceFen, String buyPath) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        return new LiveCutProduct(productId, clipId, title, priceFen, buyPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutProduct)) {
            return false;
        }
        LiveCutProduct liveCutProduct = (LiveCutProduct) other;
        return Intrinsics.areEqual(this.productId, liveCutProduct.productId) && Intrinsics.areEqual(this.clipId, liveCutProduct.clipId) && Intrinsics.areEqual(this.title, liveCutProduct.title) && this.priceFen == liveCutProduct.priceFen && Intrinsics.areEqual(this.buyPath, liveCutProduct.buyPath);
    }

    public int hashCode() {
        return (((((((this.productId.hashCode() * 31) + this.clipId.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.priceFen)) * 31) + this.buyPath.hashCode();
    }

    public String toString() {
        return "LiveCutProduct(productId=" + this.productId + ", clipId=" + this.clipId + ", title=" + this.title + ", priceFen=" + this.priceFen + ", buyPath=" + this.buyPath + Separators.RPAREN;
    }

    public LiveCutProduct(String productId, String clipId, String title, int i, String buyPath) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        this.productId = productId;
        this.clipId = clipId;
        this.title = title;
        this.priceFen = i;
        this.buyPath = buyPath;
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
}
