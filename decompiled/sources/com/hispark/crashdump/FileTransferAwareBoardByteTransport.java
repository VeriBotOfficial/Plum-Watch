package com.hispark.crashdump;

import com.hispark.crashdump.FileUploadAwareBoardByteTransport;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/hispark/crashdump/FileTransferAwareBoardByteTransport;", "Lcom/hispark/crashdump/FileUploadAwareBoardByteTransport;", "beginFileTransfer", "Ljava/io/Closeable;", "deviceId", "", "beginFileUpload", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FileTransferAwareBoardByteTransport extends FileUploadAwareBoardByteTransport {
    Closeable beginFileTransfer(String deviceId);

    @Override // com.hispark.crashdump.FileUploadAwareBoardByteTransport
    Closeable beginFileUpload(String deviceId);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object beginSession(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String str, Continuation<? super Unit> continuation) {
            Object beginSession = FileUploadAwareBoardByteTransport.DefaultImpls.beginSession(fileTransferAwareBoardByteTransport, str, continuation);
            return beginSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? beginSession : Unit.INSTANCE;
        }

        public static Flow<Boolean> connectionState(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return FileUploadAwareBoardByteTransport.DefaultImpls.connectionState(fileTransferAwareBoardByteTransport, deviceId);
        }

        public static void endSession(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String deviceId, String reason) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(reason, "reason");
            FileUploadAwareBoardByteTransport.DefaultImpls.endSession(fileTransferAwareBoardByteTransport, deviceId, reason);
        }

        public static boolean isConnected(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return FileUploadAwareBoardByteTransport.DefaultImpls.isConnected(fileTransferAwareBoardByteTransport, deviceId);
        }

        public static BoardLinkType linkType(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return FileUploadAwareBoardByteTransport.DefaultImpls.linkType(fileTransferAwareBoardByteTransport, deviceId);
        }

        public static Closeable beginFileUpload(FileTransferAwareBoardByteTransport fileTransferAwareBoardByteTransport, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return fileTransferAwareBoardByteTransport.beginFileTransfer(deviceId);
        }
    }
}
