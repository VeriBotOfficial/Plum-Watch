package com.hispark.clouddiag.callback;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtConsoleCallback.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/hispark/clouddiag/callback/AtConsoleEvent;", "", "deviceId", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/hispark/clouddiag/callback/AtConsoleDirection;", "payload", "", "text", "timestamp", "", "<init>", "(Ljava/lang/String;Lcom/hispark/clouddiag/callback/AtConsoleDirection;[BLjava/lang/String;J)V", "getDeviceId", "()Ljava/lang/String;", "getDirection", "()Lcom/hispark/clouddiag/callback/AtConsoleDirection;", "getPayload", "()[B", "getText", "getTimestamp", "()J", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AtConsoleEvent {
    private final String deviceId;
    private final AtConsoleDirection direction;
    private final byte[] payload;
    private final String text;
    private final long timestamp;

    public static /* synthetic */ AtConsoleEvent copy$default(AtConsoleEvent atConsoleEvent, String str, AtConsoleDirection atConsoleDirection, byte[] bArr, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = atConsoleEvent.deviceId;
        }
        if ((i & 2) != 0) {
            atConsoleDirection = atConsoleEvent.direction;
        }
        if ((i & 4) != 0) {
            bArr = atConsoleEvent.payload;
        }
        if ((i & 8) != 0) {
            str2 = atConsoleEvent.text;
        }
        if ((i & 16) != 0) {
            j = atConsoleEvent.timestamp;
        }
        long j2 = j;
        return atConsoleEvent.copy(str, atConsoleDirection, bArr, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final AtConsoleDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final AtConsoleEvent copy(String deviceId, AtConsoleDirection direction, byte[] payload, String text, long timestamp) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(text, "text");
        return new AtConsoleEvent(deviceId, direction, payload, text, timestamp);
    }

    public String toString() {
        return "AtConsoleEvent(deviceId=" + this.deviceId + ", direction=" + this.direction + ", payload=" + Arrays.toString(this.payload) + ", text=" + this.text + ", timestamp=" + this.timestamp + ')';
    }

    public AtConsoleEvent(String deviceId, AtConsoleDirection direction, byte[] payload, String text, long j) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(text, "text");
        this.deviceId = deviceId;
        this.direction = direction;
        this.payload = payload;
        this.text = text;
        this.timestamp = j;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final AtConsoleDirection getDirection() {
        return this.direction;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ AtConsoleEvent(String str, AtConsoleDirection atConsoleDirection, byte[] bArr, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, atConsoleDirection, bArr, str2, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtConsoleEvent)) {
            return false;
        }
        AtConsoleEvent atConsoleEvent = (AtConsoleEvent) other;
        return Intrinsics.areEqual(this.deviceId, atConsoleEvent.deviceId) && this.direction == atConsoleEvent.direction && Arrays.equals(this.payload, atConsoleEvent.payload) && Intrinsics.areEqual(this.text, atConsoleEvent.text) && this.timestamp == atConsoleEvent.timestamp;
    }

    public int hashCode() {
        return (((((((this.deviceId.hashCode() * 31) + this.direction.hashCode()) * 31) + Arrays.hashCode(this.payload)) * 31) + this.text.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }
}
