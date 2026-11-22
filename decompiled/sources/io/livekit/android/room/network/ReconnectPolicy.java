package io.livekit.android.room.network;

import kotlin.Metadata;
import kotlin.time.Duration;

/* compiled from: ReconnectPolicy.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/network/ReconnectPolicy;", "", "getNextRetryDelay", "Lkotlin/time/Duration;", "context", "Lio/livekit/android/room/network/ReconnectContext;", "getNextRetryDelay-LV8wdWc", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ReconnectPolicy {
    /* renamed from: getNextRetryDelay-LV8wdWc */
    Duration mo13893getNextRetryDelayLV8wdWc(ReconnectContext context);
}
