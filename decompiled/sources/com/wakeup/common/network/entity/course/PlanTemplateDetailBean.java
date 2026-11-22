package com.wakeup.common.network.entity.course;

import com.anythink.core.common.e.a;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: PlanTemplateDetailBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/course/PlanTemplateDetailBean;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()I", "modelId", "getModelId", a.C0193a.k, "getDay", "taskName", "", "getTaskName", "()Ljava/lang/String;", "exerciseType", "getExerciseType", "courseId", "getCourseId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanTemplateDetailBean implements Serializable {
    private final int courseId;
    private final int day;
    private final int exerciseType;
    private final int id;
    private final int modelId;
    private final String taskName = "";

    public final int getId() {
        return this.id;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final int getCourseId() {
        return this.courseId;
    }
}
