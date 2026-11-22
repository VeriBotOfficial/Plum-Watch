package com.wakeup.module.ai.appllm.task;

import com.baidu.platform.comapi.map.MapController;
import com.phancy.mini.core.api.ApiError;
import com.yandex.div.core.timer.TimerController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: AppLLMTask.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tJ\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0013J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/ai/appllm/task/AppLLMTask;", "", "payload", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getPayload", "()Lorg/json/JSONObject;", "TAG", "", "getTAG", "()Ljava/lang/String;", "execute", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interrupt", "", "taskComplete", "buildTTS", "", "text", "outStr", "buildStop", "buildLLM", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AppLLMTask {
    private final String TAG;
    private final JSONObject payload;

    public abstract Object execute(Continuation<? super Unit> continuation);

    public abstract boolean interrupt();

    public abstract boolean taskComplete();

    public AppLLMTask(JSONObject payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
        this.TAG = "AppLLM";
    }

    protected final JSONObject getPayload() {
        return this.payload;
    }

    protected final String getTAG() {
        return this.TAG;
    }

    public final Map<String, Object> buildTTS(String text, String outStr) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(outStr, "outStr");
        return MapsKt.mapOf(TuplesKt.to("type", "conversation.item.create"), TuplesKt.to(MapController.ITEM_LAYER_TAG, MapsKt.mapOf(TuplesKt.to("type", "function_call_output"), TuplesKt.to("call_id", this.payload.optString("call_id")), TuplesKt.to("output", outStr), TuplesKt.to("is_error", false), TuplesKt.to("control", MapsKt.mapOf(TuplesKt.to(DOMConstants.ATTR_MODE, "tts"))), TuplesKt.to("payload", MapsKt.mapOf(TuplesKt.to("tts_text", text))))));
    }

    public final Map<String, Object> buildStop() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiError.ERROR_MSG_OK, true);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return MapsKt.mapOf(TuplesKt.to("type", "conversation.item.create"), TuplesKt.to(MapController.ITEM_LAYER_TAG, MapsKt.mapOf(TuplesKt.to("type", "function_call_output"), TuplesKt.to("call_id", this.payload.optString("call_id")), TuplesKt.to("output", jSONObject2), TuplesKt.to("is_error", false), TuplesKt.to("control", MapsKt.mapOf(TuplesKt.to(DOMConstants.ATTR_MODE, TimerController.STOP_COMMAND))))));
    }

    public final Map<String, Object> buildLLM() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("support", false);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return MapsKt.mapOf(TuplesKt.to("type", "conversation.item.create"), TuplesKt.to(MapController.ITEM_LAYER_TAG, MapsKt.mapOf(TuplesKt.to("type", "function_call_output"), TuplesKt.to("call_id", this.payload.optString("call_id")), TuplesKt.to("output", jSONObject2), TuplesKt.to("is_error", false), TuplesKt.to("control", MapsKt.mapOf(TuplesKt.to(DOMConstants.ATTR_MODE, "llm"))))));
    }
}
