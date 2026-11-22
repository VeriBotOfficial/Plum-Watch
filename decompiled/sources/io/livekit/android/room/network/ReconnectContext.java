package io.livekit.android.room.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;

/* compiled from: ReconnectPolicy.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/network/ReconnectContext;", "", "retryCount", "", "elapsedTime", "Lkotlin/time/Duration;", "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getElapsedTime-UwyO8pc", "()J", "J", "getRetryCount", "()I", "component1", "component2", "component2-UwyO8pc", "copy", "copy-HG0u8IE", "(IJ)Lio/livekit/android/room/network/ReconnectContext;", "equals", "", "other", "hashCode", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReconnectContext {
    private final long elapsedTime;
    private final int retryCount;

    public /* synthetic */ ReconnectContext(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j);
    }

    /* renamed from: copy-HG0u8IE$default, reason: not valid java name */
    public static /* synthetic */ ReconnectContext m13896copyHG0u8IE$default(ReconnectContext reconnectContext, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reconnectContext.retryCount;
        }
        if ((i2 & 2) != 0) {
            j = reconnectContext.elapsedTime;
        }
        return reconnectContext.m13898copyHG0u8IE(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getElapsedTime() {
        return this.elapsedTime;
    }

    /* renamed from: copy-HG0u8IE, reason: not valid java name */
    public final ReconnectContext m13898copyHG0u8IE(int retryCount, long elapsedTime) {
        return new ReconnectContext(retryCount, elapsedTime, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReconnectContext)) {
            return false;
        }
        ReconnectContext reconnectContext = (ReconnectContext) other;
        return this.retryCount == reconnectContext.retryCount && Duration.m15407equalsimpl0(this.elapsedTime, reconnectContext.elapsedTime);
    }

    public int hashCode() {
        return (Integer.hashCode(this.retryCount) * 31) + Duration.m15423hashCodeimpl(this.elapsedTime);
    }

    public String toString() {
        return "ReconnectContext(retryCount=" + this.retryCount + ", elapsedTime=" + ((Object) Duration.m15442toStringimpl(this.elapsedTime)) + ')';
    }

    private ReconnectContext(int i, long j) {
        this.retryCount = i;
        this.elapsedTime = j;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: getElapsedTime-UwyO8pc, reason: not valid java name */
    public final long m13899getElapsedTimeUwyO8pc() {
        return this.elapsedTime;
    }
}
