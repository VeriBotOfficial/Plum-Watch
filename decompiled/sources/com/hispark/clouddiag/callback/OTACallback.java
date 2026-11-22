package com.hispark.clouddiag.callback;

import com.hispark.clouddiag.model.OTAMessage;
import com.hispark.clouddiag.model.OTAProgress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OTACallback.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J,\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Lcom/hispark/clouddiag/callback/OTACallback;", "", "onOTARequestReceived", "", "otaMessage", "Lcom/hispark/clouddiag/model/OTAMessage;", "onOTAProgressUpdated", "", "progress", "Lcom/hispark/clouddiag/model/OTAProgress;", "onOTACompleted", "taskId", "", "deviceId", "success", "errorMessage", "onOTAFailed", "errorCode", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OTACallback {
    void onOTACompleted(String taskId, String deviceId, boolean success, String errorMessage);

    void onOTAFailed(String taskId, String deviceId, int errorCode, String errorMessage);

    void onOTAProgressUpdated(OTAProgress progress);

    boolean onOTARequestReceived(OTAMessage otaMessage);

    /* compiled from: OTACallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onOTACompleted(OTACallback oTACallback, String taskId, String deviceId, boolean z, String str) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        }

        public static void onOTAFailed(OTACallback oTACallback, String str, String deviceId, int i, String errorMessage) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        }

        public static void onOTAProgressUpdated(OTACallback oTACallback, OTAProgress progress) {
            Intrinsics.checkNotNullParameter(progress, "progress");
        }

        public static boolean onOTARequestReceived(OTACallback oTACallback, OTAMessage otaMessage) {
            Intrinsics.checkNotNullParameter(otaMessage, "otaMessage");
            return false;
        }

        public static /* synthetic */ void onOTACompleted$default(OTACallback oTACallback, String str, String str2, boolean z, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onOTACompleted");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            oTACallback.onOTACompleted(str, str2, z, str3);
        }
    }
}
