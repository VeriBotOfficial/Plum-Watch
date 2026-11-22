package com.hispark.clouddiag.manager;

import com.anythink.core.common.e.a;
import com.iflytek.cloud.SpeechUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CloudAtCommand.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/manager/CloudAtMqttPayloads;", "", "<init>", "()V", "response", "", "originalObjectDeviceId", "taskId", SpeechUtility.TAG_RESOURCE_RET, "errorCode", "errorMsg", "eventTime", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CloudAtMqttPayloads {
    public static final CloudAtMqttPayloads INSTANCE = new CloudAtMqttPayloads();

    private CloudAtMqttPayloads() {
    }

    public final String response(String originalObjectDeviceId, String taskId, String ret, String errorCode, String errorMsg, String eventTime) {
        Intrinsics.checkNotNullParameter(originalObjectDeviceId, "originalObjectDeviceId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(ret, "ret");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        JSONObject put = new JSONObject().put(SpeechUtility.TAG_RESOURCE_RET, ret);
        String str = errorCode;
        if (str != null && !StringsKt.isBlank(str)) {
            put.put("errorCode", errorCode);
        }
        String str2 = errorMsg;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            put.put("errorMsg", errorMsg);
        }
        String jSONObject = new JSONObject().put("services", new JSONArray().put(new JSONObject().put(a.C0193a.b, "cmd_response").put("service_id", "$cmd").put("paras", new JSONObject().put("task_ext_info", put).put("task_id", taskId)).put("event_time", eventTime))).put("object_device_id", originalObjectDeviceId).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
