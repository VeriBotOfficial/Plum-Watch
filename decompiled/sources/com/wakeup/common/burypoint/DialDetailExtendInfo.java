package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/burypoint/DialDetailExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "dailId", "", "from", "", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getDailId", "()Ljava/lang/String;", "getFrom", "()I", "getConnectionStatus", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialDetailExtendInfo extends BaseExtendInfo {
    private final int connectionStatus;
    private final String dailId;
    private final int from;

    public final String getDailId() {
        return this.dailId;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialDetailExtendInfo(String dailId, int i, int i2, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(dailId, "dailId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.dailId = dailId;
        this.from = i;
        this.connectionStatus = i2;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DialClassifysExtendInfo(dailId=" + this.dailId + ", connectionStatus=" + this.connectionStatus + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
