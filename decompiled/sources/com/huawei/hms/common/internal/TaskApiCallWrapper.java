package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.TaskCompletionSource;

/* loaded from: classes14.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f10311a;
    private final TaskCompletionSource<TResult> b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, TaskCompletionSource<TResult> taskCompletionSource) {
        super(1);
        this.f10311a = taskApiCall;
        this.b = taskCompletionSource;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f10311a;
    }

    public TaskCompletionSource<TResult> getTaskCompletionSource() {
        return this.b;
    }
}
