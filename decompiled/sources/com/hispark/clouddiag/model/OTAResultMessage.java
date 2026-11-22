package com.hispark.clouddiag.model;

import androidx.core.provider.FontsContractCompat;
import com.anythink.core.common.e.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OTAMessage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006'"}, d2 = {"Lcom/hispark/clouddiag/model/OTAResultMessage;", "", "objectDeviceId", "", "serviceId", "resultCode", "", "progress", "description", "eventTime", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getObjectDeviceId", "()Ljava/lang/String;", "getServiceId", "getResultCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgress", "()I", "getDescription", "getEventTime", "getTaskId", "toJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/hispark/clouddiag/model/OTAResultMessage;", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OTAResultMessage {
    private final String description;
    private final String eventTime;
    private final String objectDeviceId;
    private final int progress;
    private final Integer resultCode;
    private final String serviceId;
    private final String taskId;

    public static /* synthetic */ OTAResultMessage copy$default(OTAResultMessage oTAResultMessage, String str, String str2, Integer num, int i, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oTAResultMessage.objectDeviceId;
        }
        if ((i2 & 2) != 0) {
            str2 = oTAResultMessage.serviceId;
        }
        if ((i2 & 4) != 0) {
            num = oTAResultMessage.resultCode;
        }
        if ((i2 & 8) != 0) {
            i = oTAResultMessage.progress;
        }
        if ((i2 & 16) != 0) {
            str3 = oTAResultMessage.description;
        }
        if ((i2 & 32) != 0) {
            str4 = oTAResultMessage.eventTime;
        }
        if ((i2 & 64) != 0) {
            str5 = oTAResultMessage.taskId;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Integer num2 = num;
        return oTAResultMessage.copy(str, str2, num2, i, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEventTime() {
        return this.eventTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public final OTAResultMessage copy(String objectDeviceId, String serviceId, Integer resultCode, int progress, String description, String eventTime, String taskId) {
        Intrinsics.checkNotNullParameter(objectDeviceId, "objectDeviceId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        return new OTAResultMessage(objectDeviceId, serviceId, resultCode, progress, description, eventTime, taskId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTAResultMessage)) {
            return false;
        }
        OTAResultMessage oTAResultMessage = (OTAResultMessage) other;
        return Intrinsics.areEqual(this.objectDeviceId, oTAResultMessage.objectDeviceId) && Intrinsics.areEqual(this.serviceId, oTAResultMessage.serviceId) && Intrinsics.areEqual(this.resultCode, oTAResultMessage.resultCode) && this.progress == oTAResultMessage.progress && Intrinsics.areEqual(this.description, oTAResultMessage.description) && Intrinsics.areEqual(this.eventTime, oTAResultMessage.eventTime) && Intrinsics.areEqual(this.taskId, oTAResultMessage.taskId);
    }

    public int hashCode() {
        int hashCode = ((this.objectDeviceId.hashCode() * 31) + this.serviceId.hashCode()) * 31;
        Integer num = this.resultCode;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.progress)) * 31) + this.description.hashCode()) * 31) + this.eventTime.hashCode()) * 31;
        String str = this.taskId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "OTAResultMessage(objectDeviceId=" + this.objectDeviceId + ", serviceId=" + this.serviceId + ", resultCode=" + this.resultCode + ", progress=" + this.progress + ", description=" + this.description + ", eventTime=" + this.eventTime + ", taskId=" + this.taskId + ')';
    }

    public OTAResultMessage(String objectDeviceId, String serviceId, Integer num, int i, String description, String eventTime, String str) {
        Intrinsics.checkNotNullParameter(objectDeviceId, "objectDeviceId");
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.objectDeviceId = objectDeviceId;
        this.serviceId = serviceId;
        this.resultCode = num;
        this.progress = i;
        this.description = description;
        this.eventTime = eventTime;
        this.taskId = str;
    }

    public /* synthetic */ OTAResultMessage(String str, String str2, Integer num, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : num, i, str3, str4, (i2 & 64) != 0 ? null : str5);
    }

    public final String getObjectDeviceId() {
        return this.objectDeviceId;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventTime() {
        return this.eventTime;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String toJson() {
        JSONObject put = new JSONObject().put("progress", this.progress).put("description", this.description);
        String str = this.taskId;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                put.put("task_id", str);
            }
        }
        Integer num = this.resultCode;
        if (num != null) {
            put.put(FontsContractCompat.Columns.RESULT_CODE, num.intValue());
        }
        String jSONObject = new JSONObject().put("object_device_id", this.objectDeviceId).put("services", new JSONArray().put(new JSONObject().put("service_id", this.serviceId).put(a.C0193a.b, OTAMessage.EVENT_TYPE_PROGRESS_REPORT).put("event_time", this.eventTime).put("paras", put))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
