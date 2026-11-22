package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/burypoint/EquipmentPageTitleExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "titleName", "", "expIds", "from", "", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getTitleName", "()Ljava/lang/String;", "setTitleName", "(Ljava/lang/String;)V", "getExpIds", "setExpIds", "getFrom", "()Ljava/lang/Integer;", "setFrom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConnectionStatus", "()I", "setConnectionStatus", "(I)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EquipmentPageTitleExtendInfo extends BaseExtendInfo {
    private int connectionStatus;
    private String expIds;
    private Integer from;
    private String titleName;

    public final String getTitleName() {
        return this.titleName;
    }

    public final void setTitleName(String str) {
        this.titleName = str;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(String str) {
        this.expIds = str;
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
    public EquipmentPageTitleExtendInfo(String str, String str2, Integer num, int i, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.titleName = str;
        this.expIds = str2;
        this.from = num;
        this.connectionStatus = i;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "EquipmentPageTitleExtendInfo(titleName=" + this.titleName + ",from=" + this.from + ",expIds=" + this.expIds + ",connectionStatus=" + this.connectionStatus + Separators.RPAREN;
    }
}
