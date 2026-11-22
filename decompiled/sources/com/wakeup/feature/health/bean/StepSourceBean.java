package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepSourceBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/health/bean/StepSourceBean;", "", "stepType", "", "stepName", "", "<init>", "(ILjava/lang/String;)V", "getStepType", "()I", "getStepName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StepSourceBean {
    public static final int $stable = 0;
    private final String stepName;
    private final int stepType;

    public static /* synthetic */ StepSourceBean copy$default(StepSourceBean stepSourceBean, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stepSourceBean.stepType;
        }
        if ((i2 & 2) != 0) {
            str = stepSourceBean.stepName;
        }
        return stepSourceBean.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStepType() {
        return this.stepType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }

    public final StepSourceBean copy(int stepType, String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        return new StepSourceBean(stepType, stepName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepSourceBean)) {
            return false;
        }
        StepSourceBean stepSourceBean = (StepSourceBean) other;
        return this.stepType == stepSourceBean.stepType && Intrinsics.areEqual(this.stepName, stepSourceBean.stepName);
    }

    public int hashCode() {
        return (Integer.hashCode(this.stepType) * 31) + this.stepName.hashCode();
    }

    public String toString() {
        return "StepSourceBean(stepType=" + this.stepType + ", stepName=" + this.stepName + Separators.RPAREN;
    }

    public StepSourceBean(int i, String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.stepType = i;
        this.stepName = stepName;
    }

    public final int getStepType() {
        return this.stepType;
    }

    public final String getStepName() {
        return this.stepName;
    }
}
