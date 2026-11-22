package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.callback.FileUploadAwareDeviceSender;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/callback/FileTransferAwareDeviceSender;", "Lcom/hispark/clouddiag/callback/FileUploadAwareDeviceSender;", "beginFileTransfer", "Ljava/io/Closeable;", "deviceId", "", "beginFileUpload", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FileTransferAwareDeviceSender extends FileUploadAwareDeviceSender {
    Closeable beginFileTransfer(String deviceId);

    @Override // com.hispark.clouddiag.callback.FileUploadAwareDeviceSender
    Closeable beginFileUpload(String deviceId);

    /* compiled from: DeviceSender.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String getSenderName(FileTransferAwareDeviceSender fileTransferAwareDeviceSender) {
            return FileUploadAwareDeviceSender.DefaultImpls.getSenderName(fileTransferAwareDeviceSender);
        }

        public static boolean sendToDevice(FileTransferAwareDeviceSender fileTransferAwareDeviceSender, String deviceId, String data) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(data, "data");
            return FileUploadAwareDeviceSender.DefaultImpls.sendToDevice(fileTransferAwareDeviceSender, deviceId, data);
        }

        public static Closeable beginFileUpload(FileTransferAwareDeviceSender fileTransferAwareDeviceSender, String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return fileTransferAwareDeviceSender.beginFileTransfer(deviceId);
        }
    }
}
