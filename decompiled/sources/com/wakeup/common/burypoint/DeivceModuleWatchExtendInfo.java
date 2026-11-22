package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/burypoint/DeivceModuleWatchExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "watchDialReID", "", "watchDialReName", "watchDialRePosition", "", "expIds", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWatchDialReID", "()Ljava/lang/String;", "setWatchDialReID", "(Ljava/lang/String;)V", "getWatchDialReName", "setWatchDialReName", "getWatchDialRePosition", "()I", "setWatchDialRePosition", "(I)V", "getExpIds", "setExpIds", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeivceModuleWatchExtendInfo extends BaseExtendInfo {
    private String expIds;
    private String watchDialReID;
    private String watchDialReName;
    private int watchDialRePosition;

    public final String getWatchDialReID() {
        return this.watchDialReID;
    }

    public final void setWatchDialReID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.watchDialReID = str;
    }

    public final String getWatchDialReName() {
        return this.watchDialReName;
    }

    public final void setWatchDialReName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.watchDialReName = str;
    }

    public final int getWatchDialRePosition() {
        return this.watchDialRePosition;
    }

    public final void setWatchDialRePosition(int i) {
        this.watchDialRePosition = i;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expIds = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeivceModuleWatchExtendInfo(String watchDialReID, String watchDialReName, int i, String expIds, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(watchDialReID, "watchDialReID");
        Intrinsics.checkNotNullParameter(watchDialReName, "watchDialReName");
        Intrinsics.checkNotNullParameter(expIds, "expIds");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.watchDialReID = watchDialReID;
        this.watchDialReName = watchDialReName;
        this.watchDialRePosition = i;
        this.expIds = expIds;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DeivceModuleWatchExtendInfo(watchDialReID=" + this.watchDialReID + ", watchDialReName=" + this.watchDialReName + ", watchDialRePosition=" + this.watchDialRePosition + ",expIds=" + this.expIds + Separators.RPAREN;
    }
}
