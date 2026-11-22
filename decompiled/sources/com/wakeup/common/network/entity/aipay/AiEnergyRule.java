package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyRule;", "", "ruleContentType", "", "chargeType", "chargeUnit", "chargeUnitPrice", "<init>", "(IIII)V", "getRuleContentType", "()I", "getChargeType", "getChargeUnit", "getChargeUnitPrice", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyRule {
    private final int chargeType;
    private final int chargeUnit;
    private final int chargeUnitPrice;
    private final int ruleContentType;

    public static /* synthetic */ AiEnergyRule copy$default(AiEnergyRule aiEnergyRule, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aiEnergyRule.ruleContentType;
        }
        if ((i5 & 2) != 0) {
            i2 = aiEnergyRule.chargeType;
        }
        if ((i5 & 4) != 0) {
            i3 = aiEnergyRule.chargeUnit;
        }
        if ((i5 & 8) != 0) {
            i4 = aiEnergyRule.chargeUnitPrice;
        }
        return aiEnergyRule.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChargeType() {
        return this.chargeType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChargeUnit() {
        return this.chargeUnit;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChargeUnitPrice() {
        return this.chargeUnitPrice;
    }

    public final AiEnergyRule copy(int ruleContentType, int chargeType, int chargeUnit, int chargeUnitPrice) {
        return new AiEnergyRule(ruleContentType, chargeType, chargeUnit, chargeUnitPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEnergyRule)) {
            return false;
        }
        AiEnergyRule aiEnergyRule = (AiEnergyRule) other;
        return this.ruleContentType == aiEnergyRule.ruleContentType && this.chargeType == aiEnergyRule.chargeType && this.chargeUnit == aiEnergyRule.chargeUnit && this.chargeUnitPrice == aiEnergyRule.chargeUnitPrice;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.ruleContentType) * 31) + Integer.hashCode(this.chargeType)) * 31) + Integer.hashCode(this.chargeUnit)) * 31) + Integer.hashCode(this.chargeUnitPrice);
    }

    public String toString() {
        return "AiEnergyRule(ruleContentType=" + this.ruleContentType + ", chargeType=" + this.chargeType + ", chargeUnit=" + this.chargeUnit + ", chargeUnitPrice=" + this.chargeUnitPrice + Separators.RPAREN;
    }

    public AiEnergyRule(int i, int i2, int i3, int i4) {
        this.ruleContentType = i;
        this.chargeType = i2;
        this.chargeUnit = i3;
        this.chargeUnitPrice = i4;
    }

    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    public final int getChargeType() {
        return this.chargeType;
    }

    public final int getChargeUnit() {
        return this.chargeUnit;
    }

    public final int getChargeUnitPrice() {
        return this.chargeUnitPrice;
    }
}
