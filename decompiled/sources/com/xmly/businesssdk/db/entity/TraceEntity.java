package com.xmly.businesssdk.db.entity;

import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraceEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lcom/xmly/businesssdk/db/entity/TraceEntity;", "", "id", "", "eventJson", "", "eventType", "timestamp", "retryCount", "", "(JLjava/lang/String;Ljava/lang/String;JI)V", "getEventJson", "()Ljava/lang/String;", "getEventType", "getId", "()J", "getRetryCount", "()I", "setRetryCount", "(I)V", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TraceEntity {
    private final String eventJson;
    private final String eventType;
    private final long id;
    private int retryCount;
    private final long timestamp;

    public TraceEntity(long j, String eventJson, String eventType, long j2, int i) {
        Intrinsics.checkNotNullParameter(eventJson, "eventJson");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.id = j;
        this.eventJson = eventJson;
        this.eventType = eventType;
        this.timestamp = j2;
        this.retryCount = i;
    }

    public static /* synthetic */ TraceEntity copy$default(TraceEntity traceEntity, long j, String str, String str2, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = traceEntity.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = traceEntity.eventJson;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = traceEntity.eventType;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            j2 = traceEntity.timestamp;
        }
        long j4 = j2;
        if ((i2 & 16) != 0) {
            i = traceEntity.retryCount;
        }
        return traceEntity.copy(j3, str3, str4, j4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventJson() {
        return this.eventJson;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    public final TraceEntity copy(long id2, String eventJson, String eventType, long timestamp, int retryCount) {
        Intrinsics.checkNotNullParameter(eventJson, "eventJson");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new TraceEntity(id2, eventJson, eventType, timestamp, retryCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TraceEntity)) {
            return false;
        }
        TraceEntity traceEntity = (TraceEntity) other;
        return this.id == traceEntity.id && Intrinsics.areEqual(this.eventJson, traceEntity.eventJson) && Intrinsics.areEqual(this.eventType, traceEntity.eventType) && this.timestamp == traceEntity.timestamp && this.retryCount == traceEntity.retryCount;
    }

    public final String getEventJson() {
        return this.eventJson;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Integer.hashCode(this.retryCount) + a.a(this.timestamp, com.xmly.businesssdk.config.a.a(this.eventType, com.xmly.businesssdk.config.a.a(this.eventJson, Long.hashCode(this.id) * 31, 31), 31), 31);
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public String toString() {
        return c.a("TraceEntity(id=").append(this.id).append(", eventJson=").append(this.eventJson).append(", eventType=").append(this.eventType).append(", timestamp=").append(this.timestamp).append(", retryCount=").append(this.retryCount).append(')').toString();
    }

    public /* synthetic */ TraceEntity(long j, String str, String str2, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, str2, j2, (i2 & 16) != 0 ? 0 : i);
    }
}
