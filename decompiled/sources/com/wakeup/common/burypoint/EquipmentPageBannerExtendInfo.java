package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/burypoint/EquipmentPageBannerExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "bannerID", "", "bannerName", "expIds", "from", "", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getBannerID", "()Ljava/lang/String;", "getBannerName", "getExpIds", "getFrom", "()Ljava/lang/Integer;", "setFrom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConnectionStatus", "()I", "setConnectionStatus", "(I)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EquipmentPageBannerExtendInfo extends BaseExtendInfo {
    private final String bannerID;
    private final String bannerName;
    private int connectionStatus;
    private final String expIds;
    private Integer from;

    public final String getBannerID() {
        return this.bannerID;
    }

    public final String getBannerName() {
        return this.bannerName;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final void setFrom(Integer num) {
        this.from = num;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    public final void setConnectionStatus(int i) {
        this.connectionStatus = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentPageBannerExtendInfo(String bannerID, String bannerName, String str, Integer num, int i, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(bannerID, "bannerID");
        Intrinsics.checkNotNullParameter(bannerName, "bannerName");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.bannerID = bannerID;
        this.bannerName = bannerName;
        this.expIds = str;
        this.from = num;
        this.connectionStatus = i;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "EquipmentPageBannerExtendInfo(bannerID=" + this.bannerID + ",bannerName=" + this.bannerName + ",expIds=" + this.expIds + ",from=" + this.from + ",connectionStatus=" + this.connectionStatus + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
