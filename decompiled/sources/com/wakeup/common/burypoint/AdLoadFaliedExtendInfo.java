package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/AdLoadFaliedExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "placementId", "", "plat", "errorDescription", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "getPlat", "setPlat", "getErrorDescription", "setErrorDescription", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdLoadFaliedExtendInfo extends BaseExtendInfo {
    private String errorDescription;
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

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final void setErrorDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorDescription = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLoadFaliedExtendInfo(String placementId, String plat, String errorDescription, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(plat, "plat");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.placementId = placementId;
        this.plat = plat;
        this.errorDescription = errorDescription;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "AdLoadFaliedExtendInfo(plat=" + this.plat + ", placementId=" + this.placementId + ", errorDescription=" + this.errorDescription + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
