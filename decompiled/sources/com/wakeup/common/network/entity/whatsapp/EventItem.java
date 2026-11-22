package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.google.gson.annotations.SerializedName;
import com.heytap.mcssdk.constant.b;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/EventItem;", "", b.k, "", "eventType", "timestamp", JsonStorageKeyNames.SESSION_ID_KEY, "deviceId", "ownerContext", "Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "cursor", "data", "Lcom/wakeup/common/network/entity/whatsapp/EventData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/EventData;)V", "getEventId", "()Ljava/lang/String;", "getEventType", "getTimestamp", "getSessionId", "getDeviceId", "getOwnerContext", "()Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "getCursor", "getData", "()Lcom/wakeup/common/network/entity/whatsapp/EventData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventItem {
    private final String cursor;
    private final EventData data;

    @SerializedName("device_id")
    private final String deviceId;

    @SerializedName("event_id")
    private final String eventId;

    @SerializedName(a.C0193a.b)
    private final String eventType;

    @SerializedName("owner_context")
    private final OwnerContext ownerContext;

    @SerializedName("session_id")
    private final String sessionId;
    private final String timestamp;

    public static /* synthetic */ EventItem copy$default(EventItem eventItem, String str, String str2, String str3, String str4, String str5, OwnerContext ownerContext, String str6, EventData eventData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventItem.eventId;
        }
        if ((i & 2) != 0) {
            str2 = eventItem.eventType;
        }
        if ((i & 4) != 0) {
            str3 = eventItem.timestamp;
        }
        if ((i & 8) != 0) {
            str4 = eventItem.sessionId;
        }
        if ((i & 16) != 0) {
            str5 = eventItem.deviceId;
        }
        if ((i & 32) != 0) {
            ownerContext = eventItem.ownerContext;
        }
        if ((i & 64) != 0) {
            str6 = eventItem.cursor;
        }
        if ((i & 128) != 0) {
            eventData = eventItem.data;
        }
        String str7 = str6;
        EventData eventData2 = eventData;
        String str8 = str5;
        OwnerContext ownerContext2 = ownerContext;
        return eventItem.copy(str, str2, str3, str4, str8, ownerContext2, str7, eventData2);
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
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component8, reason: from getter */
    public final EventData getData() {
        return this.data;
    }

    public final EventItem copy(String eventId, String eventType, String timestamp, String sessionId, String deviceId, OwnerContext ownerContext, String cursor, EventData data) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new EventItem(eventId, eventType, timestamp, sessionId, deviceId, ownerContext, cursor, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventItem)) {
            return false;
        }
        EventItem eventItem = (EventItem) other;
        return Intrinsics.areEqual(this.eventId, eventItem.eventId) && Intrinsics.areEqual(this.eventType, eventItem.eventType) && Intrinsics.areEqual(this.timestamp, eventItem.timestamp) && Intrinsics.areEqual(this.sessionId, eventItem.sessionId) && Intrinsics.areEqual(this.deviceId, eventItem.deviceId) && Intrinsics.areEqual(this.ownerContext, eventItem.ownerContext) && Intrinsics.areEqual(this.cursor, eventItem.cursor) && Intrinsics.areEqual(this.data, eventItem.data);
    }

    public int hashCode() {
        return (((((((((((((this.eventId.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.ownerContext.hashCode()) * 31) + this.cursor.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "EventItem(eventId=" + this.eventId + ", eventType=" + this.eventType + ", timestamp=" + this.timestamp + ", sessionId=" + this.sessionId + ", deviceId=" + this.deviceId + ", ownerContext=" + this.ownerContext + ", cursor=" + this.cursor + ", data=" + this.data + Separators.RPAREN;
    }

    public EventItem(String eventId, String eventType, String timestamp, String sessionId, String deviceId, OwnerContext ownerContext, String cursor, EventData data) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(data, "data");
        this.eventId = eventId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.sessionId = sessionId;
        this.deviceId = deviceId;
        this.ownerContext = ownerContext;
        this.cursor = cursor;
        this.data = data;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventType() {
        return this.eventType;
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

    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final EventData getData() {
        return this.data;
    }
}
