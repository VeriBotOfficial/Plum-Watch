package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntegralTask.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/wakeup/common/storage/model/IntegralTask;", "", "id", "", "taskName", "", "taskType", "taskScore", "comparingValue", "isOver", "currentValue", "", "<init>", "(ILjava/lang/String;IIIIF)V", "getId", "()I", "getTaskName", "()Ljava/lang/String;", "getTaskType", "getTaskScore", "getComparingValue", "setOver", "(I)V", "getCurrentValue", "()F", "setCurrentValue", "(F)V", "addCurrentValue", "", "value", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IntegralTask {
    private final int comparingValue;
    private float currentValue;
    private final int id;
    private int isOver;
    private final String taskName;
    private final int taskScore;
    private final int taskType;

    public IntegralTask() {
        this(0, null, 0, 0, 0, 0, 0.0f, 127, null);
    }

    public static /* synthetic */ IntegralTask copy$default(IntegralTask integralTask, int i, String str, int i2, int i3, int i4, int i5, float f, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = integralTask.id;
        }
        if ((i6 & 2) != 0) {
            str = integralTask.taskName;
        }
        if ((i6 & 4) != 0) {
            i2 = integralTask.taskType;
        }
        if ((i6 & 8) != 0) {
            i3 = integralTask.taskScore;
        }
        if ((i6 & 16) != 0) {
            i4 = integralTask.comparingValue;
        }
        if ((i6 & 32) != 0) {
            i5 = integralTask.isOver;
        }
        if ((i6 & 64) != 0) {
            f = integralTask.currentValue;
        }
        int i7 = i5;
        float f2 = f;
        int i8 = i4;
        int i9 = i2;
        return integralTask.copy(i, str, i9, i3, i8, i7, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTaskType() {
        return this.taskType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTaskScore() {
        return this.taskScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getComparingValue() {
        return this.comparingValue;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIsOver() {
        return this.isOver;
    }

    /* renamed from: component7, reason: from getter */
    public final float getCurrentValue() {
        return this.currentValue;
    }

    public final IntegralTask copy(int id2, String taskName, int taskType, int taskScore, int comparingValue, int isOver, float currentValue) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        return new IntegralTask(id2, taskName, taskType, taskScore, comparingValue, isOver, currentValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegralTask)) {
            return false;
        }
        IntegralTask integralTask = (IntegralTask) other;
        return this.id == integralTask.id && Intrinsics.areEqual(this.taskName, integralTask.taskName) && this.taskType == integralTask.taskType && this.taskScore == integralTask.taskScore && this.comparingValue == integralTask.comparingValue && this.isOver == integralTask.isOver && Float.compare(this.currentValue, integralTask.currentValue) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.taskName.hashCode()) * 31) + Integer.hashCode(this.taskType)) * 31) + Integer.hashCode(this.taskScore)) * 31) + Integer.hashCode(this.comparingValue)) * 31) + Integer.hashCode(this.isOver)) * 31) + Float.hashCode(this.currentValue);
    }

    public String toString() {
        return "IntegralTask(id=" + this.id + ", taskName=" + this.taskName + ", taskType=" + this.taskType + ", taskScore=" + this.taskScore + ", comparingValue=" + this.comparingValue + ", isOver=" + this.isOver + ", currentValue=" + this.currentValue + Separators.RPAREN;
    }

    public IntegralTask(int i, String taskName, int i2, int i3, int i4, int i5, float f) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.id = i;
        this.taskName = taskName;
        this.taskType = i2;
        this.taskScore = i3;
        this.comparingValue = i4;
        this.isOver = i5;
        this.currentValue = f;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ IntegralTask(int i, String str, int i2, int i3, int i4, int i5, float f, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (i6 & 64) != 0 ? 0.0f : f);
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final int getTaskScore() {
        return this.taskScore;
    }

    public final int getComparingValue() {
        return this.comparingValue;
    }

    public final int isOver() {
        return this.isOver;
    }

    public final void setOver(int i) {
        this.isOver = i;
    }

    public final float getCurrentValue() {
        return this.currentValue;
    }

    public final void setCurrentValue(float f) {
        this.currentValue = f;
    }

    public final void addCurrentValue(float value) {
        this.currentValue += value;
    }
}
