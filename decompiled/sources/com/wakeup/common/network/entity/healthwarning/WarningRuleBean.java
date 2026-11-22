package com.wakeup.common.network.entity.healthwarning;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthWarnningRuleBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lcom/wakeup/common/network/entity/healthwarning/WarningRuleBean;", "", "ruleName", "", "ruleType", "", "maxWarnVal", "", "minWarnVal", "duration", "times", "<init>", "(Ljava/lang/String;IFFII)V", "getRuleName", "()Ljava/lang/String;", "getRuleType", "()I", "setRuleType", "(I)V", "getMaxWarnVal", "()F", "getMinWarnVal", "getDuration", "setDuration", "getTimes", "setTimes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WarningRuleBean {
    private int duration;
    private final float maxWarnVal;
    private final float minWarnVal;
    private final String ruleName;
    private int ruleType;
    private int times;

    public static /* synthetic */ WarningRuleBean copy$default(WarningRuleBean warningRuleBean, String str, int i, float f, float f2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = warningRuleBean.ruleName;
        }
        if ((i4 & 2) != 0) {
            i = warningRuleBean.ruleType;
        }
        if ((i4 & 4) != 0) {
            f = warningRuleBean.maxWarnVal;
        }
        if ((i4 & 8) != 0) {
            f2 = warningRuleBean.minWarnVal;
        }
        if ((i4 & 16) != 0) {
            i2 = warningRuleBean.duration;
        }
        if ((i4 & 32) != 0) {
            i3 = warningRuleBean.times;
        }
        int i5 = i2;
        int i6 = i3;
        return warningRuleBean.copy(str, i, f, f2, i5, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRuleName() {
        return this.ruleName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRuleType() {
        return this.ruleType;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMaxWarnVal() {
        return this.maxWarnVal;
    }

    /* renamed from: component4, reason: from getter */
    public final float getMinWarnVal() {
        return this.minWarnVal;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTimes() {
        return this.times;
    }

    public final WarningRuleBean copy(String ruleName, int ruleType, float maxWarnVal, float minWarnVal, int duration, int times) {
        Intrinsics.checkNotNullParameter(ruleName, "ruleName");
        return new WarningRuleBean(ruleName, ruleType, maxWarnVal, minWarnVal, duration, times);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningRuleBean)) {
            return false;
        }
        WarningRuleBean warningRuleBean = (WarningRuleBean) other;
        return Intrinsics.areEqual(this.ruleName, warningRuleBean.ruleName) && this.ruleType == warningRuleBean.ruleType && Float.compare(this.maxWarnVal, warningRuleBean.maxWarnVal) == 0 && Float.compare(this.minWarnVal, warningRuleBean.minWarnVal) == 0 && this.duration == warningRuleBean.duration && this.times == warningRuleBean.times;
    }

    public int hashCode() {
        return (((((((((this.ruleName.hashCode() * 31) + Integer.hashCode(this.ruleType)) * 31) + Float.hashCode(this.maxWarnVal)) * 31) + Float.hashCode(this.minWarnVal)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.times);
    }

    public String toString() {
        return "WarningRuleBean(ruleName=" + this.ruleName + ", ruleType=" + this.ruleType + ", maxWarnVal=" + this.maxWarnVal + ", minWarnVal=" + this.minWarnVal + ", duration=" + this.duration + ", times=" + this.times + Separators.RPAREN;
    }

    public WarningRuleBean(String ruleName, int i, float f, float f2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(ruleName, "ruleName");
        this.ruleName = ruleName;
        this.ruleType = i;
        this.maxWarnVal = f;
        this.minWarnVal = f2;
        this.duration = i2;
        this.times = i3;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final int getRuleType() {
        return this.ruleType;
    }

    public final void setRuleType(int i) {
        this.ruleType = i;
    }

    public final float getMaxWarnVal() {
        return this.maxWarnVal;
    }

    public final float getMinWarnVal() {
        return this.minWarnVal;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final int getTimes() {
        return this.times;
    }

    public final void setTimes(int i) {
        this.times = i;
    }
}
