package com.hispark.crashdump;

import com.hispark.crashdump.BoardByteTransport;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/hispark/crashdump/FileUploadAwareBoardByteTransport;", "Lcom/hispark/crashdump/BoardByteTransport;", "beginFileUpload", "Ljava/io/Closeable;", "deviceId", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FileUploadAwareBoardByteTransport extends BoardByteTransport {
    Closeable beginFileUpload(String deviceId);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object beginSession(FileUploadAwareBoardByteTransport fileUploadAwareBoardByteTransport, String str, Continuation<? super Unit> continuation) {
            Object beginSession = BoardByteTransport.DefaultImpls.beginSession(fileUploadAwareBoardByteTransport, str, continuation);
            return beginSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? beginSession : Unit.INSTANCE;
        }

        public static Flow<Boolean> connectionState(FileUploadAwareBoardByteTransport fileUploadAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.connectionState(fileUploadAwareBoardByteTransport, deviceId);
        }

        public static void endSession(FileUploadAwareBoardByteTransport fileUploadAwareBoardByteTransport, String deviceId, String reason) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            BoardByteTransport.DefaultImpls.endSession(fileUploadAwareBoardByteTransport, deviceId, reason);
        }

        public static boolean isConnected(FileUploadAwareBoardByteTransport fileUploadAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.isConnected(fileUploadAwareBoardByteTransport, deviceId);
        }

        public static BoardLinkType linkType(FileUploadAwareBoardByteTransport fileUploadAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return BoardByteTransport.DefaultImpls.linkType(fileUploadAwareBoardByteTransport, deviceId);
        }
    }
}
