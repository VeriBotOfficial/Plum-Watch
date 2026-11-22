package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/burypoint/DialClassExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "ClassifyID", "", "ClassifyName", "expIds", "from", "", "connectionStatus", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;)V", "getClassifyID", "()Ljava/lang/String;", "getClassifyName", "getExpIds", "setExpIds", "(Ljava/lang/String;)V", "getFrom", "()Ljava/lang/Integer;", "setFrom", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConnectionStatus", "()I", "setConnectionStatus", "(I)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DialClassExtendInfo extends BaseExtendInfo {
    private final String ClassifyID;
    private final String ClassifyName;
    private int connectionStatus;
    private String expIds;
    private Integer from;

    public final String getClassifyID() {
        return this.ClassifyID;
    }

    public final String getClassifyName() {
        return this.ClassifyName;
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
    public DialClassExtendInfo(String str, String str2, String str3, Integer num, int i, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.ClassifyID = str;
        this.ClassifyName = str2;
        this.expIds = str3;
        this.from = num;
        this.connectionStatus = i;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "DialClassExtendInfo(ClassifyID=" + this.ClassifyID + ", ClassifyName=" + this.ClassifyName + ", connectionStatus=" + this.connectionStatus + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
