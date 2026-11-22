package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/burypoint/DialClassifysExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "ClassifyID", "", "watchDialReID", "watchDialReName", "watchDialRePosition", "", "from", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getClassifyID", "()Ljava/lang/String;", "getWatchDialReID", "getWatchDialReName", "getWatchDialRePosition", "()I", "getFrom", "getConnectionStatus", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialClassifysExtendInfo extends BaseExtendInfo {
    private final String ClassifyID;
    private final int connectionStatus;
    private final int from;
    private final String watchDialReID;
    private final String watchDialReName;
    private final int watchDialRePosition;

    public final String getClassifyID() {
        return this.ClassifyID;
    }

    public final String getWatchDialReID() {
        return this.watchDialReID;
    }

    public final String getWatchDialReName() {
        return this.watchDialReName;
    }

    public final int getWatchDialRePosition() {
        return this.watchDialRePosition;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialClassifysExtendInfo(String ClassifyID, String watchDialReID, String watchDialReName, int i, int i2, int i3, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(ClassifyID, "ClassifyID");
        Intrinsics.checkNotNullParameter(watchDialReID, "watchDialReID");
        Intrinsics.checkNotNullParameter(watchDialReName, "watchDialReName");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.ClassifyID = ClassifyID;
        this.watchDialReID = watchDialReID;
        this.watchDialReName = watchDialReName;
        this.watchDialRePosition = i;
        this.from = i2;
        this.connectionStatus = i3;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DialClassifysExtendInfo(ClassifyID=" + this.ClassifyID + ", watchDialReID=" + this.watchDialReID + ", watchDialReName=" + this.watchDialReName + ",watchDialRePosition=" + this.watchDialRePosition + ",from=" + this.from + ",connectionStatus=" + this.connectionStatus + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
