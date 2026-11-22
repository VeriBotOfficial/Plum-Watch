package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/burypoint/MineModuleMedalClickExtentInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "medalId", "", "medalName", "", "area", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getMedalId", "()I", "setMedalId", "(I)V", "getMedalName", "()Ljava/lang/String;", "setMedalName", "(Ljava/lang/String;)V", "getArea", "setArea", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MineModuleMedalClickExtentInfo extends BaseExtendInfo {
    private int area;
    private int medalId;
    private String medalName;

    public final int getMedalId() {
        return this.medalId;
    }

    public final void setMedalId(int i) {
        this.medalId = i;
    }

    public final String getMedalName() {
        return this.medalName;
    }

    public final void setMedalName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalName = str;
    }

    public final int getArea() {
        return this.area;
    }

    public final void setArea(int i) {
        this.area = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineModuleMedalClickExtentInfo(int i, String medalName, int i2, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(medalName, "medalName");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.medalId = i;
        this.medalName = medalName;
        this.area = i2;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "MineModuleMedalClickExtentInfo(medalId=" + this.medalId + ", medalName=" + this.medalName + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
