package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/DialLikeExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "dailId", "", "positionID", "", "from", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getDailId", "()Ljava/lang/String;", "getPositionID", "()I", "getFrom", "getConnectionStatus", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialLikeExtendInfo extends BaseExtendInfo {
    private final int connectionStatus;
    private final String dailId;
    private final int from;
    private final int positionID;

    public final String getDailId() {
        return this.dailId;
    }

    public final int getPositionID() {
        return this.positionID;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialLikeExtendInfo(String dailId, int i, int i2, int i3, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(dailId, "dailId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.dailId = dailId;
        this.positionID = i;
        this.from = i2;
        this.connectionStatus = i3;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DialLikeExtendInfo(dailId=" + this.dailId + ", connectionStatus=" + this.connectionStatus + ",positionID=" + this.positionID + ",from=" + this.from + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
