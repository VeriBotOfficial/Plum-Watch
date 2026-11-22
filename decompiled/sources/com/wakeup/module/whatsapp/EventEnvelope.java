package com.wakeup.module.whatsapp;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.heytap.mcssdk.constant.b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.livekit.android.dagger.InjectionNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: WhatsAppSocket.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0003*+,B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jo\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006-"}, d2 = {"Lcom/wakeup/module/whatsapp/EventEnvelope;", "", b.k, "", "eventType", "cursor", "timestamp", JsonStorageKeyNames.SESSION_ID_KEY, "deviceId", "ownerContext", "Lorg/json/JSONObject;", "data", "raw", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getEventType", "getCursor", "getTimestamp", "getSessionId", "getDeviceId", "getOwnerContext", "()Lorg/json/JSONObject;", "getData", "getRaw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Message", "QuotedMessage", "feature-whatsapp_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EventEnvelope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TYPE_MESSAGE_NEW = "message.new";
    public static final String TYPE_MESSAGE_STATUS_UPDATED = "message.status_updated";
    public static final String TYPE_SESSION_STATE_CHANGED = "session.state_changed";
    private final String cursor;
    private final JSONObject data;
    private final String deviceId;
    private final String eventId;
    private final String eventType;
    private final JSONObject ownerContext;
    private final String raw;
    private final String sessionId;
    private final String timestamp;

    public static /* synthetic */ EventEnvelope copy$default(EventEnvelope eventEnvelope, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, JSONObject jSONObject2, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventEnvelope.eventId;
        }
        if ((i & 2) != 0) {
            str2 = eventEnvelope.eventType;
        }
        if ((i & 4) != 0) {
            str3 = eventEnvelope.cursor;
        }
        if ((i & 8) != 0) {
            str4 = eventEnvelope.timestamp;
        }
        if ((i & 16) != 0) {
            str5 = eventEnvelope.sessionId;
        }
        if ((i & 32) != 0) {
            str6 = eventEnvelope.deviceId;
        }
        if ((i & 64) != 0) {
            jSONObject = eventEnvelope.ownerContext;
        }
        if ((i & 128) != 0) {
            jSONObject2 = eventEnvelope.data;
        }
        if ((i & 256) != 0) {
            str7 = eventEnvelope.raw;
        }
        JSONObject jSONObject3 = jSONObject2;
        String str8 = str7;
        String str9 = str6;
        JSONObject jSONObject4 = jSONObject;
        String str10 = str5;
        String str11 = str3;
        return eventEnvelope.copy(str, str2, str11, str4, str10, str9, jSONObject4, jSONObject3, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component7, reason: from getter */
    public final JSONObject getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component8, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }

    public final EventEnvelope copy(String eventId, String eventType, String cursor, String timestamp, String sessionId, String deviceId, JSONObject ownerContext, JSONObject data, String raw) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new EventEnvelope(eventId, eventType, cursor, timestamp, sessionId, deviceId, ownerContext, data, raw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventEnvelope)) {
            return false;
        }
        EventEnvelope eventEnvelope = (EventEnvelope) other;
        return Intrinsics.areEqual(this.eventId, eventEnvelope.eventId) && Intrinsics.areEqual(this.eventType, eventEnvelope.eventType) && Intrinsics.areEqual(this.cursor, eventEnvelope.cursor) && Intrinsics.areEqual(this.timestamp, eventEnvelope.timestamp) && Intrinsics.areEqual(this.sessionId, eventEnvelope.sessionId) && Intrinsics.areEqual(this.deviceId, eventEnvelope.deviceId) && Intrinsics.areEqual(this.ownerContext, eventEnvelope.ownerContext) && Intrinsics.areEqual(this.data, eventEnvelope.data) && Intrinsics.areEqual(this.raw, eventEnvelope.raw);
    }

    public int hashCode() {
        int hashCode = ((this.eventId.hashCode() * 31) + this.eventType.hashCode()) * 31;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timestamp;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        JSONObject jSONObject = this.ownerContext;
        int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.data;
        return ((hashCode6 + (jSONObject2 != null ? jSONObject2.hashCode() : 0)) * 31) + this.raw.hashCode();
    }

    public String toString() {
        return "EventEnvelope(eventId=" + this.eventId + ", eventType=" + this.eventType + ", cursor=" + this.cursor + ", timestamp=" + this.timestamp + ", sessionId=" + this.sessionId + ", deviceId=" + this.deviceId + ", ownerContext=" + this.ownerContext + ", data=" + this.data + ", raw=" + this.raw + Separators.RPAREN;
    }

    public EventEnvelope(String eventId, String eventType, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, String raw) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.eventId = eventId;
        this.eventType = eventType;
        this.cursor = str;
        this.timestamp = str2;
        this.sessionId = str3;
        this.deviceId = str4;
        this.ownerContext = jSONObject;
        this.data = jSONObject2;
        this.raw = raw;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final JSONObject getOwnerContext() {
        return this.ownerContext;
    }

    public final JSONObject getData() {
        return this.data;
    }

    public final String getRaw() {
        return this.raw;
    }

    /* compiled from: WhatsAppSocket.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/whatsapp/EventEnvelope$Companion;", "", "<init>", "()V", "TYPE_MESSAGE_NEW", "", "TYPE_MESSAGE_STATUS_UPDATED", "TYPE_SESSION_STATE_CHANGED", "parse", "Lcom/wakeup/module/whatsapp/EventEnvelope;", BodyData.TYPE_JSON, "feature-whatsapp_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EventEnvelope parse(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject(json);
            String optString = jSONObject.optString("event_id");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String optString2 = jSONObject.optString(a.C0193a.b);
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            String optString3 = jSONObject.optString("cursor");
            Intrinsics.checkNotNull(optString3);
            if (optString3.length() <= 0) {
                optString3 = null;
            }
            String optString4 = jSONObject.optString("timestamp");
            Intrinsics.checkNotNull(optString4);
            String str = optString4.length() > 0 ? optString4 : null;
            String optString5 = jSONObject.optString("session_id");
            Intrinsics.checkNotNull(optString5);
            String str2 = optString5.length() > 0 ? optString5 : null;
            String optString6 = jSONObject.optString("device_id");
            Intrinsics.checkNotNull(optString6);
            return new EventEnvelope(optString, optString2, optString3, str, str2, optString6.length() > 0 ? optString6 : null, jSONObject.optJSONObject("owner_context"), jSONObject.optJSONObject("data"), json);
        }
    }

    /* compiled from: WhatsAppSocket.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/wakeup/module/whatsapp/EventEnvelope$Message;", "", "body", "", "chatId", "chatName", "chatType", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "messageId", "msgType", InjectionNames.SENDER, "status", "quotedMessage", "Lcom/wakeup/module/whatsapp/EventEnvelope$QuotedMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/module/whatsapp/EventEnvelope$QuotedMessage;)V", "getBody", "()Ljava/lang/String;", "getChatId", "getChatName", "getChatType", "getDirection", "getMessageId", "getMsgType", "getSender", "getStatus", "getQuotedMessage", "()Lcom/wakeup/module/whatsapp/EventEnvelope$QuotedMessage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-whatsapp_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Message {

        @SerializedName("body")
        private final String body;

        @SerializedName("chat_id")
        private final String chatId;

        @SerializedName("chat_name")
        private final String chatName;

        @SerializedName("chat_type")
        private final String chatType;

        @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
        private final String direction;

        @SerializedName(Constants.MessagePayloadKeys.MSGID_SERVER)
        private final String messageId;

        @SerializedName("msg_type")
        private final String msgType;

        @SerializedName("quoted_message")
        private final QuotedMessage quotedMessage;

        @SerializedName(InjectionNames.SENDER)
        private final String sender;

        @SerializedName("status")
        private final String status;

        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, QuotedMessage quotedMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = message.body;
            }
            if ((i & 2) != 0) {
                str2 = message.chatId;
            }
            if ((i & 4) != 0) {
                str3 = message.chatName;
            }
            if ((i & 8) != 0) {
                str4 = message.chatType;
            }
            if ((i & 16) != 0) {
                str5 = message.direction;
            }
            if ((i & 32) != 0) {
                str6 = message.messageId;
            }
            if ((i & 64) != 0) {
                str7 = message.msgType;
            }
            if ((i & 128) != 0) {
                str8 = message.sender;
            }
            if ((i & 256) != 0) {
                str9 = message.status;
            }
            if ((i & 512) != 0) {
                quotedMessage = message.quotedMessage;
            }
            String str10 = str9;
            QuotedMessage quotedMessage2 = quotedMessage;
            String str11 = str7;
            String str12 = str8;
            String str13 = str5;
            String str14 = str6;
            return message.copy(str, str2, str3, str4, str13, str14, str11, str12, str10, quotedMessage2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component10, reason: from getter */
        public final QuotedMessage getQuotedMessage() {
            return this.quotedMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChatName() {
            return this.chatName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getChatType() {
            return this.chatType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMsgType() {
            return this.msgType;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSender() {
            return this.sender;
        }

        /* renamed from: component9, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final Message copy(String body, String chatId, String chatName, String chatType, String direction, String messageId, String msgType, String sender, String status, QuotedMessage quotedMessage) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(chatType, "chatType");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(msgType, "msgType");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Message(body, chatId, chatName, chatType, direction, messageId, msgType, sender, status, quotedMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return Intrinsics.areEqual(this.body, message.body) && Intrinsics.areEqual(this.chatId, message.chatId) && Intrinsics.areEqual(this.chatName, message.chatName) && Intrinsics.areEqual(this.chatType, message.chatType) && Intrinsics.areEqual(this.direction, message.direction) && Intrinsics.areEqual(this.messageId, message.messageId) && Intrinsics.areEqual(this.msgType, message.msgType) && Intrinsics.areEqual(this.sender, message.sender) && Intrinsics.areEqual(this.status, message.status) && Intrinsics.areEqual(this.quotedMessage, message.quotedMessage);
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((this.body.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.chatName.hashCode()) * 31) + this.chatType.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.msgType.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.status.hashCode()) * 31;
            QuotedMessage quotedMessage = this.quotedMessage;
            return hashCode + (quotedMessage == null ? 0 : quotedMessage.hashCode());
        }

        public String toString() {
            return "Message(body=" + this.body + ", chatId=" + this.chatId + ", chatName=" + this.chatName + ", chatType=" + this.chatType + ", direction=" + this.direction + ", messageId=" + this.messageId + ", msgType=" + this.msgType + ", sender=" + this.sender + ", status=" + this.status + ", quotedMessage=" + this.quotedMessage + Separators.RPAREN;
        }

        public Message(String body, String chatId, String chatName, String chatType, String direction, String messageId, String msgType, String sender, String status, QuotedMessage quotedMessage) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intrinsics.checkNotNullParameter(chatType, "chatType");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(msgType, "msgType");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(status, "status");
            this.body = body;
            this.chatId = chatId;
            this.chatName = chatName;
            this.chatType = chatType;
            this.direction = direction;
            this.messageId = messageId;
            this.msgType = msgType;
            this.sender = sender;
            this.status = status;
            this.quotedMessage = quotedMessage;
        }

        public /* synthetic */ Message(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, QuotedMessage quotedMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i & 512) != 0 ? null : quotedMessage);
        }

        public final String getBody() {
            return this.body;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getChatName() {
            return this.chatName;
        }

        public final String getChatType() {
            return this.chatType;
        }

        public final String getDirection() {
            return this.direction;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getMsgType() {
            return this.msgType;
        }

        public final String getSender() {
            return this.sender;
        }

        public final String getStatus() {
            return this.status;
        }

        public final QuotedMessage getQuotedMessage() {
            return this.quotedMessage;
        }
    }

    /* compiled from: WhatsAppSocket.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/whatsapp/EventEnvelope$QuotedMessage;", "", "messageId", "", "body", "msgType", InjectionNames.SENDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "getBody", "getMsgType", "getSender", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-whatsapp_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuotedMessage {

        @SerializedName("body")
        private final String body;

        @SerializedName(Constants.MessagePayloadKeys.MSGID_SERVER)
        private final String messageId;

        @SerializedName("msg_type")
        private final String msgType;

        @SerializedName(InjectionNames.SENDER)
        private final String sender;

        public static /* synthetic */ QuotedMessage copy$default(QuotedMessage quotedMessage, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quotedMessage.messageId;
            }
            if ((i & 2) != 0) {
                str2 = quotedMessage.body;
            }
            if ((i & 4) != 0) {
                str3 = quotedMessage.msgType;
            }
            if ((i & 8) != 0) {
                str4 = quotedMessage.sender;
            }
            return quotedMessage.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMsgType() {
            return this.msgType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSender() {
            return this.sender;
        }

        public final QuotedMessage copy(String messageId, String body, String msgType, String sender) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(msgType, "msgType");
            Intrinsics.checkNotNullParameter(sender, "sender");
            return new QuotedMessage(messageId, body, msgType, sender);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuotedMessage)) {
                return false;
            }
            QuotedMessage quotedMessage = (QuotedMessage) other;
            return Intrinsics.areEqual(this.messageId, quotedMessage.messageId) && Intrinsics.areEqual(this.body, quotedMessage.body) && Intrinsics.areEqual(this.msgType, quotedMessage.msgType) && Intrinsics.areEqual(this.sender, quotedMessage.sender);
        }

        public int hashCode() {
            return (((((this.messageId.hashCode() * 31) + this.body.hashCode()) * 31) + this.msgType.hashCode()) * 31) + this.sender.hashCode();
        }

        public String toString() {
            return "QuotedMessage(messageId=" + this.messageId + ", body=" + this.body + ", msgType=" + this.msgType + ", sender=" + this.sender + Separators.RPAREN;
        }

        public QuotedMessage(String messageId, String body, String msgType, String sender) {
            Intrinsics.checkNotNullParameter(messageId, "messageId");
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(msgType, "msgType");
            Intrinsics.checkNotNullParameter(sender, "sender");
            this.messageId = messageId;
            this.body = body;
            this.msgType = msgType;
            this.sender = sender;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getMsgType() {
            return this.msgType;
        }

        public final String getSender() {
            return this.sender;
        }
    }
}
