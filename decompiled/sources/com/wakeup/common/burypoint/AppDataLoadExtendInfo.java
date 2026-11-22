package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/wakeup/common/burypoint/AppDataLoadExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "load_time", "", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getLoad_time", "()J", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppDataLoadExtendInfo extends BaseExtendInfo {
    private final long load_time;

    public final long getLoad_time() {
        return this.load_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDataLoadExtendInfo(long j, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.load_time = j;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "AppDataLoadExtendInfo(load_time='" + this.load_time + "', launchId='" + getLaunchId() + "', sessionId='" + getSessionId() + "')";
    }
}
