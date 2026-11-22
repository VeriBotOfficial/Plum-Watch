package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/burypoint/WindRequestExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "placementId", "", "plat", "extras", "Lcom/wakeup/common/burypoint/WindRequestExtras;", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/burypoint/WindRequestExtras;Ljava/lang/String;Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "getPlat", "setPlat", "getExtras", "()Lcom/wakeup/common/burypoint/WindRequestExtras;", "setExtras", "(Lcom/wakeup/common/burypoint/WindRequestExtras;)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WindRequestExtendInfo extends BaseExtendInfo {
    private WindRequestExtras extras;
    private String placementId;
    private String plat;

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void setPlacementId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placementId = str;
    }

    public final String getPlat() {
        return this.plat;
    }

    public final void setPlat(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.plat = str;
    }

    public final WindRequestExtras getExtras() {
        return this.extras;
    }

    public final void setExtras(WindRequestExtras windRequestExtras) {
        Intrinsics.checkNotNullParameter(windRequestExtras, "<set-?>");
        this.extras = windRequestExtras;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindRequestExtendInfo(String placementId, String plat, WindRequestExtras extras, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(plat, "plat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.placementId = placementId;
        this.plat = plat;
        this.extras = extras;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "WindRequestExtendInfo(extras=" + this.extras + ", plat=" + this.plat + ", placementId=" + this.placementId + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
