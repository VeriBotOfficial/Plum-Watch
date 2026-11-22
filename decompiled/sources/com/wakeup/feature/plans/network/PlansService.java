package com.wakeup.feature.plans.network;

import com.wakeup.feature.plans.model.BadgeResponse;
import com.wakeup.feature.plans.model.ChatRequest;
import com.wakeup.feature.plans.model.CreateTaskRequest;
import com.wakeup.feature.plans.model.DebugRunResponse;
import com.wakeup.feature.plans.model.PlanMessage;
import com.wakeup.feature.plans.model.ReadRequest;
import com.wakeup.feature.plans.model.TaskDetail;
import com.wakeup.feature.plans.model.TaskMeta;
import com.wakeup.feature.plans.model.TasksResponse;
import com.wakeup.feature.plans.model.TemplatesResponse;
import com.wakeup.feature.plans.model.UpdateTaskRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* compiled from: PlansService.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\"\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u001b2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\"\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010%\u001a\u00020\u0011H§@¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020(2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006)"}, d2 = {"Lcom/wakeup/feature/plans/network/PlansService;", "", "getBadge", "Lcom/wakeup/feature/plans/model/BadgeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemplates", "Lcom/wakeup/feature/plans/model/TemplatesResponse;", "getTasks", "Lcom/wakeup/feature/plans/model/TasksResponse;", "createTask", "Lcom/wakeup/feature/plans/model/TaskMeta;", "body", "Lcom/wakeup/feature/plans/model/CreateTaskRequest;", "(Lcom/wakeup/feature/plans/model/CreateTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTask", "Lcom/wakeup/feature/plans/model/TaskDetail;", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTask", "Lcom/wakeup/feature/plans/model/UpdateTaskRequest;", "(Ljava/lang/String;Lcom/wakeup/feature/plans/model/UpdateTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pauseTask", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeTask", "deleteTask", "", "testTask", "Lcom/wakeup/feature/plans/model/PlanMessage;", "chatTask", "Lcom/wakeup/feature/plans/model/ChatRequest;", "(Ljava/lang/String;Lcom/wakeup/feature/plans/model/ChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readTask", "Lcom/wakeup/feature/plans/model/ReadRequest;", "(Ljava/lang/String;Lcom/wakeup/feature/plans/model/ReadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "debugRun", "Lcom/wakeup/feature/plans/model/DebugRunResponse;", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlansService {
    @POST("tasks/{taskId}/chat")
    Object chatTask(@Path("taskId") String str, @Body ChatRequest chatRequest, Continuation<? super PlanMessage> continuation);

    @POST("tasks")
    Object createTask(@Body CreateTaskRequest createTaskRequest, Continuation<? super TaskMeta> continuation);

    @POST("debug/run")
    Object debugRun(@Body CreateTaskRequest createTaskRequest, Continuation<? super DebugRunResponse> continuation);

    @DELETE("tasks/{taskId}/messages/{messageId}")
    Object deleteMessage(@Path("taskId") String str, @Path("messageId") String str2, Continuation<? super Unit> continuation);

    @DELETE("tasks/{taskId}")
    Object deleteTask(@Path("taskId") String str, Continuation<? super Unit> continuation);

    @GET("badge")
    Object getBadge(Continuation<? super BadgeResponse> continuation);

    @GET("tasks/{taskId}")
    Object getTask(@Path("taskId") String str, Continuation<? super TaskDetail> continuation);

    @GET("tasks")
    Object getTasks(Continuation<? super TasksResponse> continuation);

    @GET("templates")
    Object getTemplates(Continuation<? super TemplatesResponse> continuation);

    @POST("tasks/{taskId}/pause")
    Object pauseTask(@Path("taskId") String str, @Body RequestBody requestBody, Continuation<? super TaskMeta> continuation);

    @POST("tasks/{taskId}/read")
    Object readTask(@Path("taskId") String str, @Body ReadRequest readRequest, Continuation<? super Unit> continuation);

    @POST("tasks/{taskId}/resume")
    Object resumeTask(@Path("taskId") String str, @Body RequestBody requestBody, Continuation<? super TaskMeta> continuation);

    @POST("tasks/{taskId}/test")
    Object testTask(@Path("taskId") String str, @Body RequestBody requestBody, Continuation<? super PlanMessage> continuation);

    @PUT("tasks/{taskId}")
    Object updateTask(@Path("taskId") String str, @Body UpdateTaskRequest updateTaskRequest, Continuation<? super TaskMeta> continuation);
}
