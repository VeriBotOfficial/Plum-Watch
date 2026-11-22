package com.hispark.crashdump;

import com.hispark.crashdump.BoardByteTransport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/hispark/crashdump/ResultAwareBoardByteTransport;", "Lcom/hispark/crashdump/BoardByteTransport;", "sendResult", "Lcom/hispark/crashdump/BoardByteSendResult;", "deviceId", "", "data", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ResultAwareBoardByteTransport extends BoardByteTransport {
    Object sendResult(String str, byte[] bArr, Continuation<? super BoardByteSendResult> continuation);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object beginSession(ResultAwareBoardByteTransport resultAwareBoardByteTransport, String str, Continuation<? super Unit> continuation) {
            Object beginSession = BoardByteTransport.DefaultImpls.beginSession(resultAwareBoardByteTransport, str, continuation);
            return beginSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? beginSession : Unit.INSTANCE;
        }

        public static Flow<Boolean> connectionState(ResultAwareBoardByteTransport resultAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.connectionState(resultAwareBoardByteTransport, deviceId);
        }

        public static void endSession(ResultAwareBoardByteTransport resultAwareBoardByteTransport, String deviceId, String reason) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            BoardByteTransport.DefaultImpls.endSession(resultAwareBoardByteTransport, deviceId, reason);
        }

        public static boolean isConnected(ResultAwareBoardByteTransport resultAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.isConnected(resultAwareBoardByteTransport, deviceId);
        }

        public static BoardLinkType linkType(ResultAwareBoardByteTransport resultAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.linkType(resultAwareBoardByteTransport, deviceId);
        }
    }
}
