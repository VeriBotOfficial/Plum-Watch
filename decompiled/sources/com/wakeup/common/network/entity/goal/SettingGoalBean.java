package com.wakeup.common.network.entity.goal;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingGoalBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0001HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/goal/SettingGoalBean;", "", "goalType", "", "goalValue", "currentValue", "<init>", "(ILjava/lang/Object;Ljava/lang/Object;)V", "getGoalType", "()I", "setGoalType", "(I)V", "getGoalValue", "()Ljava/lang/Object;", "setGoalValue", "(Ljava/lang/Object;)V", "getCurrentValue", "setCurrentValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SettingGoalBean {
    private Object currentValue;
    private int goalType;
    private Object goalValue;

    public static /* synthetic */ SettingGoalBean copy$default(SettingGoalBean settingGoalBean, int i, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            i = settingGoalBean.goalType;
        }
        if ((i2 & 2) != 0) {
            obj = settingGoalBean.goalValue;
        }
        if ((i2 & 4) != 0) {
            obj2 = settingGoalBean.currentValue;
        }
        return settingGoalBean.copy(i, obj, obj2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGoalType() {
        return this.goalType;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getGoalValue() {
        return this.goalValue;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getCurrentValue() {
        return this.currentValue;
    }

    public final SettingGoalBean copy(int goalType, Object goalValue, Object currentValue) {
        Intrinsics.checkNotNullParameter(goalValue, "goalValue");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        return new SettingGoalBean(goalType, goalValue, currentValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingGoalBean)) {
            return false;
        }
        SettingGoalBean settingGoalBean = (SettingGoalBean) other;
        return this.goalType == settingGoalBean.goalType && Intrinsics.areEqual(this.goalValue, settingGoalBean.goalValue) && Intrinsics.areEqual(this.currentValue, settingGoalBean.currentValue);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.goalType) * 31) + this.goalValue.hashCode()) * 31) + this.currentValue.hashCode();
    }

    public String toString() {
        return "SettingGoalBean(goalType=" + this.goalType + ", goalValue=" + this.goalValue + ", currentValue=" + this.currentValue + Separators.RPAREN;
    }

    public SettingGoalBean(int i, Object goalValue, Object currentValue) {
        Intrinsics.checkNotNullParameter(goalValue, "goalValue");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        this.goalType = i;
        this.goalValue = goalValue;
        this.currentValue = currentValue;
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final Object getGoalValue() {
        return this.goalValue;
    }

    public final void setGoalValue(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.goalValue = obj;
    }

    public final Object getCurrentValue() {
        return this.currentValue;
    }

    public final void setCurrentValue(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.currentValue = obj;
    }
}
