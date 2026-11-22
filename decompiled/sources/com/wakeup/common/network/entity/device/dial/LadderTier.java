package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderDiscountModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/LadderTier;", "", "level", "", FirebaseAnalytics.Param.DISCOUNT, "", "price", "label", "", "<init>", "(IDDLjava/lang/String;)V", "getLevel", "()I", "getDiscount", "()D", "getPrice", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LadderTier {
    private final double discount;
    private final String label;
    private final int level;
    private final double price;

    public LadderTier() {
        this(0, 0.0d, 0.0d, null, 15, null);
    }

    public static /* synthetic */ LadderTier copy$default(LadderTier ladderTier, int i, double d, double d2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ladderTier.level;
        }
        if ((i2 & 2) != 0) {
            d = ladderTier.discount;
        }
        if ((i2 & 4) != 0) {
            d2 = ladderTier.price;
        }
        if ((i2 & 8) != 0) {
            str = ladderTier.label;
        }
        String str2 = str;
        return ladderTier.copy(i, d, d2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final double getDiscount() {
        return this.discount;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final LadderTier copy(int level, double discount, double price, String label) {
        return new LadderTier(level, discount, price, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderTier)) {
            return false;
        }
        LadderTier ladderTier = (LadderTier) other;
        return this.level == ladderTier.level && Double.compare(this.discount, ladderTier.discount) == 0 && Double.compare(this.price, ladderTier.price) == 0 && Intrinsics.areEqual(this.label, ladderTier.label);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.level) * 31) + Double.hashCode(this.discount)) * 31) + Double.hashCode(this.price)) * 31;
        String str = this.label;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LadderTier(level=" + this.level + ", discount=" + this.discount + ", price=" + this.price + ", label=" + this.label + Separators.RPAREN;
    }

    public LadderTier(int i, double d, double d2, String str) {
        this.level = i;
        this.discount = d;
        this.price = d2;
        this.label = str;
    }

    public /* synthetic */ LadderTier(int i, double d, double d2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? null : str);
    }

    public final int getLevel() {
        return this.level;
    }

    public final double getDiscount() {
        return this.discount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getLabel() {
        return this.label;
    }
}
