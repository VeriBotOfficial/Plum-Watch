package com.hispark.clouddiag.devicefile;

import com.heytap.mcssdk.constant.b;
import com.hispark.clouddiag.model.DeviceFileCommand;
import com.hispark.clouddiag.model.DeviceFileEntryReport;
import com.hispark.clouddiag.model.DeviceFileStage;
import com.hispark.clouddiag.model.DeviceFileTaskStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeviceFileReporter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0002\u0010\u000eJy\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\u001aJH\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0002\u0010\u001fJ>\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0002\u0010#JT\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0002\u0010&¨\u0006'"}, d2 = {"Lcom/hispark/clouddiag/devicefile/DeviceFileReporter;", "", "reportList", "", b.y, "Lcom/hispark/clouddiag/model/DeviceFileCommand;", "status", "Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;", "files", "", "Lcom/hispark/clouddiag/model/DeviceFileEntryReport;", "errorMsg", "", "errorCode", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportProgress", com.anythink.expressad.foundation.g.g.a.b.aX, "Lcom/hispark/clouddiag/model/DeviceFileStage;", "progress", "", "totalCount", "", "finishedCount", "totalSize", "", "finishedSize", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lcom/hispark/clouddiag/model/DeviceFileStage;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;)Z", "reportDownloadComplete", "fileName", "fileSize", "archiveFormat", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportDeleteComplete", "deletedCount", "failedCount", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportUploadComplete", "filePath", "(Lcom/hispark/clouddiag/model/DeviceFileCommand;Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeviceFileReporter {
    Object reportDeleteComplete(DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, Integer num, Integer num2, String str, Continuation<? super Boolean> continuation);

    Object reportDownloadComplete(DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, String str, Long l, String str2, String str3, Continuation<? super Boolean> continuation);

    Object reportList(DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, List<DeviceFileEntryReport> list, String str, String str2, Continuation<? super Boolean> continuation);

    boolean reportProgress(DeviceFileCommand command, DeviceFileStage stage, Double progress, Integer totalCount, Integer finishedCount, Long totalSize, Long finishedSize, String errorMsg, String errorCode, DeviceFileTaskStatus status);

    Object reportUploadComplete(DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, String str, String str2, Long l, String str3, String str4, Continuation<? super Boolean> continuation);

    /* compiled from: DeviceFileReporter.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object reportList$default(DeviceFileReporter deviceFileReporter, DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, List list, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportList");
            }
            if ((i & 8) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            return deviceFileReporter.reportList(deviceFileCommand, deviceFileTaskStatus, list, str, str2, continuation);
        }

        public static /* synthetic */ boolean reportProgress$default(DeviceFileReporter deviceFileReporter, DeviceFileCommand deviceFileCommand, DeviceFileStage deviceFileStage, Double d, Integer num, Integer num2, Long l, Long l2, String str, String str2, DeviceFileTaskStatus deviceFileTaskStatus, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportProgress");
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                num2 = null;
            }
            if ((i & 32) != 0) {
                l = null;
            }
            if ((i & 64) != 0) {
                l2 = null;
            }
            if ((i & 128) != 0) {
                str = null;
            }
            if ((i & 256) != 0) {
                str2 = null;
            }
            if ((i & 512) != 0) {
                deviceFileTaskStatus = DeviceFileTaskStatus.RUNNING;
            }
            return deviceFileReporter.reportProgress(deviceFileCommand, deviceFileStage, d, num, num2, l, l2, str, str2, deviceFileTaskStatus);
        }

        public static /* synthetic */ Object reportDownloadComplete$default(DeviceFileReporter deviceFileReporter, DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, String str, Long l, String str2, String str3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDownloadComplete");
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            return deviceFileReporter.reportDownloadComplete(deviceFileCommand, deviceFileTaskStatus, str, l, str2, str3, continuation);
        }

        public static /* synthetic */ Object reportDeleteComplete$default(DeviceFileReporter deviceFileReporter, DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, Integer num, Integer num2, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDeleteComplete");
            }
            if ((i & 16) != 0) {
                str = null;
            }
            return deviceFileReporter.reportDeleteComplete(deviceFileCommand, deviceFileTaskStatus, num, num2, str, continuation);
        }

        public static /* synthetic */ Object reportUploadComplete$default(DeviceFileReporter deviceFileReporter, DeviceFileCommand deviceFileCommand, DeviceFileTaskStatus deviceFileTaskStatus, String str, String str2, Long l, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportUploadComplete");
            }
            if ((i & 32) != 0) {
                str3 = null;
            }
            if ((i & 64) != 0) {
                str4 = null;
            }
            return deviceFileReporter.reportUploadComplete(deviceFileCommand, deviceFileTaskStatus, str, str2, l, str3, str4, continuation);
        }
    }
}
