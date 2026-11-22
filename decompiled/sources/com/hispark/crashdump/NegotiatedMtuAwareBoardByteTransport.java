package com.hispark.crashdump;

import com.hispark.crashdump.BoardByteTransport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/hispark/crashdump/NegotiatedMtuAwareBoardByteTransport;", "Lcom/hispark/crashdump/BoardByteTransport;", "supportsNegotiatedMtu", "", "deviceId", "", "negotiatedMtu", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface NegotiatedMtuAwareBoardByteTransport extends BoardByteTransport {
    Integer negotiatedMtu(String deviceId);

    boolean supportsNegotiatedMtu(String deviceId);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean supportsNegotiatedMtu(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return true;
        }

        public static Object beginSession(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String str, Continuation<? super Unit> continuation) {
            Object beginSession = BoardByteTransport.DefaultImpls.beginSession(negotiatedMtuAwareBoardByteTransport, str, continuation);
            return beginSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? beginSession : Unit.INSTANCE;
        }

        public static Flow<Boolean> connectionState(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.connectionState(negotiatedMtuAwareBoardByteTransport, deviceId);
        }

        public static void endSession(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String deviceId, String reason) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            BoardByteTransport.DefaultImpls.endSession(negotiatedMtuAwareBoardByteTransport, deviceId, reason);
        }

        public static boolean isConnected(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.isConnected(negotiatedMtuAwareBoardByteTransport, deviceId);
        }

        public static BoardLinkType linkType(NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.linkType(negotiatedMtuAwareBoardByteTransport, deviceId);
        }
    }
}
