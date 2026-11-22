package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/plans/model/TasksResponse;", "", "tasks", "", "Lcom/wakeup/feature/plans/model/TaskSummary;", "<init>", "(Ljava/util/List;)V", "getTasks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TasksResponse {
    private final List<TaskSummary> tasks;

    /* JADX WARN: Multi-variable type inference failed */
    public TasksResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TasksResponse copy$default(TasksResponse tasksResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tasksResponse.tasks;
        }
        return tasksResponse.copy(list);
    }

    public final List<TaskSummary> component1() {
        return this.tasks;
    }

    public final TasksResponse copy(List<TaskSummary> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        return new TasksResponse(tasks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TasksResponse) && Intrinsics.areEqual(this.tasks, ((TasksResponse) other).tasks);
    }

    public int hashCode() {
        return this.tasks.hashCode();
    }

    public String toString() {
        return "TasksResponse(tasks=" + this.tasks + Separators.RPAREN;
    }

    public TasksResponse(List<TaskSummary> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.tasks = tasks;
    }

    public /* synthetic */ TasksResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<TaskSummary> getTasks() {
        return this.tasks;
    }
}
