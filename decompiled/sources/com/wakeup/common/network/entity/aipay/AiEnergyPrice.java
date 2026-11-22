package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyPrice;", "", "id", "", "orderPrice", "", "price", "ruleCurrency", "<init>", "(IDII)V", "getId", "()I", "getOrderPrice", "()D", "getPrice", "getRuleCurrency", "isSelected", "", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyPrice {
    private final int id;
    private boolean isSelected;
    private final double orderPrice;
    private final int price;
    private final int ruleCurrency;

    public static /* synthetic */ AiEnergyPrice copy$default(AiEnergyPrice aiEnergyPrice, int i, double d, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = aiEnergyPrice.id;
        }
        if ((i4 & 2) != 0) {
            d = aiEnergyPrice.orderPrice;
        }
        if ((i4 & 4) != 0) {
            i2 = aiEnergyPrice.price;
        }
        if ((i4 & 8) != 0) {
            i3 = aiEnergyPrice.ruleCurrency;
        }
        return aiEnergyPrice.copy(i, d, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getOrderPrice() {
        return this.orderPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRuleCurrency() {
        return this.ruleCurrency;
    }

    public final AiEnergyPrice copy(int id2, double orderPrice, int price, int ruleCurrency) {
        return new AiEnergyPrice(id2, orderPrice, price, ruleCurrency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEnergyPrice)) {
            return false;
        }
        AiEnergyPrice aiEnergyPrice = (AiEnergyPrice) other;
        return this.id == aiEnergyPrice.id && Double.compare(this.orderPrice, aiEnergyPrice.orderPrice) == 0 && this.price == aiEnergyPrice.price && this.ruleCurrency == aiEnergyPrice.ruleCurrency;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + Double.hashCode(this.orderPrice)) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.ruleCurrency);
    }

    public String toString() {
        return "AiEnergyPrice(id=" + this.id + ", orderPrice=" + this.orderPrice + ", price=" + this.price + ", ruleCurrency=" + this.ruleCurrency + Separators.RPAREN;
    }

    public AiEnergyPrice(int i, double d, int i2, int i3) {
        this.id = i;
        this.orderPrice = d;
        this.price = i2;
        this.ruleCurrency = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final double getOrderPrice() {
        return this.orderPrice;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getRuleCurrency() {
        return this.ruleCurrency;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
