package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/burypoint/HealthReportExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "source", "", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getSource", "()I", "setSource", "(I)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthReportExtendInfo extends BaseExtendInfo {
    private int source;

    public final int getSource() {
        return this.source;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthReportExtendInfo(int i, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.source = i;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "HealthReportExtendInfo(source=" + this.source + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
