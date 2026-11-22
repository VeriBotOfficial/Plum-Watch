package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/burypoint/AppExitExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "exit_reason", "", "launch_duration", "", "session_duration", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getExit_reason", "()Ljava/lang/String;", "getLaunch_duration", "()J", "getSession_duration", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppExitExtendInfo extends BaseExtendInfo {
    private final String exit_reason;
    private final long launch_duration;
    private final long session_duration;

    public final String getExit_reason() {
        return this.exit_reason;
    }

    public final long getLaunch_duration() {
        return this.launch_duration;
    }

    public final long getSession_duration() {
        return this.session_duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppExitExtendInfo(String exit_reason, long j, long j2, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(exit_reason, "exit_reason");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.exit_reason = exit_reason;
        this.launch_duration = j;
        this.session_duration = j2;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "AppExitExtendInfo(exit_reason='" + this.exit_reason + "', launch_duration='" + this.launch_duration + "', session_duration='" + this.session_duration + "', launchId='" + getLaunchId() + "', sessionId='" + getSessionId() + "')";
    }
}
