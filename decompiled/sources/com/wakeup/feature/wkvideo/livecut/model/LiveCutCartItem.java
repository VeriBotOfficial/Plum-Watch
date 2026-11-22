package com.wakeup.feature.wkvideo.livecut.model;

import android.gov.nist.core.Separators;
import com.applovin.sdk.AppLovinEventTypes;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutCartItem;", "", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;", Const.SP_KEY_CALL_LOC_COUNT, "", "<init>", "(Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;I)V", "getProduct", "()Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;", "getCount", "()I", "setCount", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutCartItem {
    private int count;
    private final LiveCutProduct product;

    public static /* synthetic */ LiveCutCartItem copy$default(LiveCutCartItem liveCutCartItem, LiveCutProduct liveCutProduct, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveCutProduct = liveCutCartItem.product;
        }
        if ((i2 & 2) != 0) {
            i = liveCutCartItem.count;
        }
        return liveCutCartItem.copy(liveCutProduct, i);
    }

    /* renamed from: component1, reason: from getter */
    public final LiveCutProduct getProduct() {
        return this.product;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final LiveCutCartItem copy(LiveCutProduct product, int count) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new LiveCutCartItem(product, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutCartItem)) {
            return false;
        }
        LiveCutCartItem liveCutCartItem = (LiveCutCartItem) other;
        return Intrinsics.areEqual(this.product, liveCutCartItem.product) && this.count == liveCutCartItem.count;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "LiveCutCartItem(product=" + this.product + ", count=" + this.count + Separators.RPAREN;
    }

    public LiveCutCartItem(LiveCutProduct product, int i) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.product = product;
        this.count = i;
    }

    public final LiveCutProduct getProduct() {
        return this.product;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }
}
