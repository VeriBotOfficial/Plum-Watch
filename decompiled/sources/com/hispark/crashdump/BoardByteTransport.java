package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/hispark/crashdump/BoardByteTransport;", "", "beginSession", "", "deviceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endSession", "reason", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "isConnected", "", "connectionState", "Lkotlinx/coroutines/flow/Flow;", "send", "data", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incoming", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardByteTransport {
    Object beginSession(String str, Continuation<? super Unit> continuation);

    Flow<Boolean> connectionState(String deviceId);

    void endSession(String deviceId, String reason);

    Flow<byte[]> incoming(String deviceId);

    boolean isConnected(String deviceId);

    BoardLinkType linkType(String deviceId);

    Object send(String str, byte[] bArr, Continuation<? super Boolean> continuation);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void endSession(BoardByteTransport boardByteTransport, String deviceId, String reason) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(reason, "reason");
        }

        public static boolean isConnected(BoardByteTransport boardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return true;
        }

        public static BoardLinkType linkType(BoardByteTransport boardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return null;
        }

        public static Object beginSession(BoardByteTransport boardByteTransport, String str, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static Flow<Boolean> connectionState(BoardByteTransport boardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return FlowKt.emptyFlow();
        }
    }
}
