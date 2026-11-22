package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiMemberPackage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/user/AiMemberPackage;", "", "aiMemberPackageType", "", "period", "", "aiMemberPackageName", "originalPrice", "", "discountPrice", "currencyType", "firstMonthPrice", "<init>", "(Ljava/lang/String;ILjava/lang/String;FFIF)V", "getAiMemberPackageType", "()Ljava/lang/String;", "getPeriod", "()I", "getAiMemberPackageName", "getOriginalPrice", "()F", "getDiscountPrice", "getCurrencyType", "getFirstMonthPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiMemberPackage {
    private final String aiMemberPackageName;
    private final String aiMemberPackageType;
    private final int currencyType;
    private final float discountPrice;
    private final float firstMonthPrice;
    private final float originalPrice;
    private final int period;

    public AiMemberPackage() {
        this(null, 0, null, 0.0f, 0.0f, 0, 0.0f, 127, null);
    }

    public static /* synthetic */ AiMemberPackage copy$default(AiMemberPackage aiMemberPackage, String str, int i, String str2, float f, float f2, int i2, float f3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = aiMemberPackage.aiMemberPackageType;
        }
        if ((i3 & 2) != 0) {
            i = aiMemberPackage.period;
        }
        if ((i3 & 4) != 0) {
            str2 = aiMemberPackage.aiMemberPackageName;
        }
        if ((i3 & 8) != 0) {
            f = aiMemberPackage.originalPrice;
        }
        if ((i3 & 16) != 0) {
            f2 = aiMemberPackage.discountPrice;
        }
        if ((i3 & 32) != 0) {
            i2 = aiMemberPackage.currencyType;
        }
        if ((i3 & 64) != 0) {
            f3 = aiMemberPackage.firstMonthPrice;
        }
        int i4 = i2;
        float f4 = f3;
        float f5 = f2;
        String str3 = str2;
        return aiMemberPackage.copy(str, i, str3, f, f5, i4, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAiMemberPackageType() {
        return this.aiMemberPackageType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAiMemberPackageName() {
        return this.aiMemberPackageName;
    }

    /* renamed from: component4, reason: from getter */
    public final float getOriginalPrice() {
        return this.originalPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final float getDiscountPrice() {
        return this.discountPrice;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCurrencyType() {
        return this.currencyType;
    }

    /* renamed from: component7, reason: from getter */
    public final float getFirstMonthPrice() {
        return this.firstMonthPrice;
    }

    public final AiMemberPackage copy(String aiMemberPackageType, int period, String aiMemberPackageName, float originalPrice, float discountPrice, int currencyType, float firstMonthPrice) {
        Intrinsics.checkNotNullParameter(aiMemberPackageType, "aiMemberPackageType");
        Intrinsics.checkNotNullParameter(aiMemberPackageName, "aiMemberPackageName");
        return new AiMemberPackage(aiMemberPackageType, period, aiMemberPackageName, originalPrice, discountPrice, currencyType, firstMonthPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiMemberPackage)) {
            return false;
        }
        AiMemberPackage aiMemberPackage = (AiMemberPackage) other;
        return Intrinsics.areEqual(this.aiMemberPackageType, aiMemberPackage.aiMemberPackageType) && this.period == aiMemberPackage.period && Intrinsics.areEqual(this.aiMemberPackageName, aiMemberPackage.aiMemberPackageName) && Float.compare(this.originalPrice, aiMemberPackage.originalPrice) == 0 && Float.compare(this.discountPrice, aiMemberPackage.discountPrice) == 0 && this.currencyType == aiMemberPackage.currencyType && Float.compare(this.firstMonthPrice, aiMemberPackage.firstMonthPrice) == 0;
    }

    public int hashCode() {
        return (((((((((((this.aiMemberPackageType.hashCode() * 31) + Integer.hashCode(this.period)) * 31) + this.aiMemberPackageName.hashCode()) * 31) + Float.hashCode(this.originalPrice)) * 31) + Float.hashCode(this.discountPrice)) * 31) + Integer.hashCode(this.currencyType)) * 31) + Float.hashCode(this.firstMonthPrice);
    }

    public String toString() {
        return "AiMemberPackage(aiMemberPackageType=" + this.aiMemberPackageType + ", period=" + this.period + ", aiMemberPackageName=" + this.aiMemberPackageName + ", originalPrice=" + this.originalPrice + ", discountPrice=" + this.discountPrice + ", currencyType=" + this.currencyType + ", firstMonthPrice=" + this.firstMonthPrice + Separators.RPAREN;
    }

    public AiMemberPackage(String aiMemberPackageType, int i, String aiMemberPackageName, float f, float f2, int i2, float f3) {
        Intrinsics.checkNotNullParameter(aiMemberPackageType, "aiMemberPackageType");
        Intrinsics.checkNotNullParameter(aiMemberPackageName, "aiMemberPackageName");
        this.aiMemberPackageType = aiMemberPackageType;
        this.period = i;
        this.aiMemberPackageName = aiMemberPackageName;
        this.originalPrice = f;
        this.discountPrice = f2;
        this.currencyType = i2;
        this.firstMonthPrice = f3;
    }

    public /* synthetic */ AiMemberPackage(String str, int i, String str2, float f, float f2, int i2, float f3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? 0.0f : f2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? 0.0f : f3);
    }

    public final String getAiMemberPackageType() {
        return this.aiMemberPackageType;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final String getAiMemberPackageName() {
        return this.aiMemberPackageName;
    }

    public final float getOriginalPrice() {
        return this.originalPrice;
    }

    public final float getDiscountPrice() {
        return this.discountPrice;
    }

    public final int getCurrencyType() {
        return this.currencyType;
    }

    public final float getFirstMonthPrice() {
        return this.firstMonthPrice;
    }
}
