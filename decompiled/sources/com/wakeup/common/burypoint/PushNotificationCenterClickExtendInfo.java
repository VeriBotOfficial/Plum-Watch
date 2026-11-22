package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/PushNotificationCenterClickExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "pushId", "", "pushTitle", "pushType", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPushId", "()Ljava/lang/String;", "setPushId", "(Ljava/lang/String;)V", "getPushTitle", "setPushTitle", "getPushType", "setPushType", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PushNotificationCenterClickExtendInfo extends BaseExtendInfo {
    private String pushId;
    private String pushTitle;
    private String pushType;

    public final String getPushId() {
        return this.pushId;
    }

    public final void setPushId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pushId = str;
    }

    public final String getPushTitle() {
        return this.pushTitle;
    }

    public final void setPushTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pushTitle = str;
    }

    public final String getPushType() {
        return this.pushType;
    }

    public final void setPushType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pushType = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationCenterClickExtendInfo(String pushId, String pushTitle, String pushType, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(pushTitle, "pushTitle");
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.pushId = pushId;
        this.pushTitle = pushTitle;
        this.pushType = pushType;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "PushNotificationCenterClickExtendInfo(pushId=" + this.pushId + ", pushTitle=" + this.pushTitle + ", pushType=" + this.pushType + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
