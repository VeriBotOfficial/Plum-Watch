package com.wakeup.feature.plans.data;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.wakeup.feature.plans.model.BadgeResponse;
import com.wakeup.feature.plans.model.ChatRequest;
import com.wakeup.feature.plans.model.CreateTaskRequest;
import com.wakeup.feature.plans.model.DebugRunResponse;
import com.wakeup.feature.plans.model.PlanMessage;
import com.wakeup.feature.plans.model.ReadRequest;
import com.wakeup.feature.plans.model.TaskDetail;
import com.wakeup.feature.plans.model.TaskMeta;
import com.wakeup.feature.plans.model.UpdateTaskRequest;
import com.wakeup.feature.plans.network.PlansApi;
import com.wakeup.feature.plans.network.PlansService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: PlansRepository.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0086@¢\u0006\u0002\u0010\nJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J(\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u001e\u0010(\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006."}, d2 = {"Lcom/wakeup/feature/plans/data/PlansRepository;", "", "<init>", "()V", "api", "Lcom/wakeup/feature/plans/network/PlansService;", "getApi", "()Lcom/wakeup/feature/plans/network/PlansService;", "getBadge", "Lcom/wakeup/feature/plans/model/BadgeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemplates", "", "Lcom/wakeup/feature/plans/model/PlanTemplate;", "getTasks", "Lcom/wakeup/feature/plans/model/TaskSummary;", "createTask", "Lcom/wakeup/feature/plans/model/TaskMeta;", HiAnalyticsConstant.Direction.REQUEST, "Lcom/wakeup/feature/plans/model/CreateTaskRequest;", "(Lcom/wakeup/feature/plans/model/CreateTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTask", "Lcom/wakeup/feature/plans/model/TaskDetail;", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTask", "Lcom/wakeup/feature/plans/model/UpdateTaskRequest;", "(Ljava/lang/String;Lcom/wakeup/feature/plans/model/UpdateTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pauseTask", "resumeTask", "deleteTask", "", "testTask", "Lcom/wakeup/feature/plans/model/PlanMessage;", "chatTask", "message", "anchorMessageId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readTask", "readMessage", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", "debugRun", "Lcom/wakeup/feature/plans/model/DebugRunResponse;", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlansRepository {
    public static final PlansRepository INSTANCE = new PlansRepository();

    private PlansRepository() {
    }

    private final PlansService getApi() {
        return PlansApi.INSTANCE.getService();
    }

    public final Object getBadge(Continuation<? super BadgeResponse> continuation) {
        return getApi().getBadge(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTemplates(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.feature.plans.model.PlanTemplate>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.wakeup.feature.plans.data.PlansRepository$getTemplates$1
            if (r0 == 0) goto L14
            r0 = r5
            com.wakeup.feature.plans.data.PlansRepository$getTemplates$1 r0 = (com.wakeup.feature.plans.data.PlansRepository$getTemplates$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.wakeup.feature.plans.data.PlansRepository$getTemplates$1 r0 = new com.wakeup.feature.plans.data.PlansRepository$getTemplates$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.wakeup.feature.plans.network.PlansService r5 = r4.getApi()
            r0.label = r3
            java.lang.Object r5 = r5.getTemplates(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.wakeup.feature.plans.model.TemplatesResponse r5 = (com.wakeup.feature.plans.model.TemplatesResponse) r5
            java.util.List r5 = r5.getTemplates()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.plans.data.PlansRepository.getTemplates(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTasks(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.feature.plans.model.TaskSummary>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.wakeup.feature.plans.data.PlansRepository$getTasks$1
            if (r0 == 0) goto L14
            r0 = r5
            com.wakeup.feature.plans.data.PlansRepository$getTasks$1 r0 = (com.wakeup.feature.plans.data.PlansRepository$getTasks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.wakeup.feature.plans.data.PlansRepository$getTasks$1 r0 = new com.wakeup.feature.plans.data.PlansRepository$getTasks$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.wakeup.feature.plans.network.PlansService r5 = r4.getApi()
            r0.label = r3
            java.lang.Object r5 = r5.getTasks(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.wakeup.feature.plans.model.TasksResponse r5 = (com.wakeup.feature.plans.model.TasksResponse) r5
            java.util.List r5 = r5.getTasks()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.plans.data.PlansRepository.getTasks(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object createTask(CreateTaskRequest createTaskRequest, Continuation<? super TaskMeta> continuation) {
        return getApi().createTask(createTaskRequest, continuation);
    }

    public final Object getTask(String str, Continuation<? super TaskDetail> continuation) {
        return getApi().getTask(str, continuation);
    }

    public final Object updateTask(String str, UpdateTaskRequest updateTaskRequest, Continuation<? super TaskMeta> continuation) {
        return getApi().updateTask(str, updateTaskRequest, continuation);
    }

    public final Object pauseTask(String str, Continuation<? super TaskMeta> continuation) {
        return getApi().pauseTask(str, PlansApi.INSTANCE.getEmptyBody(), continuation);
    }

    public final Object resumeTask(String str, Continuation<? super TaskMeta> continuation) {
        return getApi().resumeTask(str, PlansApi.INSTANCE.getEmptyBody(), continuation);
    }

    public final Object deleteTask(String str, Continuation<? super Unit> continuation) {
        Object deleteTask = getApi().deleteTask(str, continuation);
        return deleteTask == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteTask : Unit.INSTANCE;
    }

    public final Object testTask(String str, Continuation<? super PlanMessage> continuation) {
        return getApi().testTask(str, PlansApi.INSTANCE.getEmptyBody(), continuation);
    }

    public static /* synthetic */ Object chatTask$default(PlansRepository plansRepository, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return plansRepository.chatTask(str, str2, str3, continuation);
    }

    public final Object chatTask(String str, String str2, String str3, Continuation<? super PlanMessage> continuation) {
        return getApi().chatTask(str, new ChatRequest(str2, str3, false, 4, null), continuation);
    }

    public final Object readTask(String str, Continuation<? super Unit> continuation) {
        Object readTask = getApi().readTask(str, new ReadRequest(null, 1, null), continuation);
        return readTask == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readTask : Unit.INSTANCE;
    }

    public final Object readMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object readTask = getApi().readTask(str, new ReadRequest(str2), continuation);
        return readTask == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? readTask : Unit.INSTANCE;
    }

    public final Object deleteMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object deleteMessage = getApi().deleteMessage(str, str2, continuation);
        return deleteMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteMessage : Unit.INSTANCE;
    }

    public final Object debugRun(CreateTaskRequest createTaskRequest, Continuation<? super DebugRunResponse> continuation) {
        return getApi().debugRun(createTaskRequest, continuation);
    }
}
