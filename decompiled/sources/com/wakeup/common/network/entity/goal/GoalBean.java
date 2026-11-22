package com.wakeup.common.network.entity.goal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoalBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001b¨\u0006."}, d2 = {"Lcom/wakeup/common/network/entity/goal/GoalBean;", "Ljava/io/Serializable;", "<init>", "()V", "goalType", "", "getGoalType", "()I", "setGoalType", "(I)V", "goalName", "", "getGoalName", "()Ljava/lang/String;", "setGoalName", "(Ljava/lang/String;)V", "goalLocalIcon", "getGoalLocalIcon", "setGoalLocalIcon", "goalColor", "getGoalColor", "setGoalColor", "goalValue", "", "getGoalValue", "()F", "setGoalValue", "(F)V", "status", "getStatus", "setStatus", "keepNum", "getKeepNum", "setKeepNum", "currentValue", "getCurrentValue", "()Ljava/lang/Float;", "setCurrentValue", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "goalUnit", "getGoalUnit", "setGoalUnit", "initialValue", "getInitialValue", "setInitialValue", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoalBean implements Serializable {
    private int goalColor;
    private int goalLocalIcon;
    private int goalType;
    private float goalValue;
    private float initialValue;
    private int keepNum;
    private int status;
    private String goalName = "";
    private Float currentValue = Float.valueOf(0.0f);
    private String goalUnit = "";

    public final int getGoalType() {
        return this.goalType;
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final String getGoalName() {
        return this.goalName;
    }

    public final void setGoalName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goalName = str;
    }

    public final int getGoalLocalIcon() {
        return this.goalLocalIcon;
    }

    public final void setGoalLocalIcon(int i) {
        this.goalLocalIcon = i;
    }

    public final int getGoalColor() {
        return this.goalColor;
    }

    public final void setGoalColor(int i) {
        this.goalColor = i;
    }

    public final float getGoalValue() {
        return this.goalValue;
    }

    public final void setGoalValue(float f) {
        this.goalValue = f;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final int getKeepNum() {
        return this.keepNum;
    }

    public final void setKeepNum(int i) {
        this.keepNum = i;
    }

    public final Float getCurrentValue() {
        return this.currentValue;
    }

    public final void setCurrentValue(Float f) {
        this.currentValue = f;
    }

    public final String getGoalUnit() {
        return this.goalUnit;
    }

    public final void setGoalUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goalUnit = str;
    }

    public final float getInitialValue() {
        return this.initialValue;
    }

    public final void setInitialValue(float f) {
        this.initialValue = f;
    }
}
