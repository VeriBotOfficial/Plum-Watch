package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/FeedAdExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "plat", "", "adName", "adId", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlat", "()Ljava/lang/String;", "setPlat", "(Ljava/lang/String;)V", "getAdName", "setAdName", "getAdId", "setAdId", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FeedAdExtendInfo extends BaseExtendInfo {
    private String adId;
    private String adName;
    private String plat;

    public final String getPlat() {
        return this.plat;
    }

    public final void setPlat(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.plat = str;
    }

    public final String getAdName() {
        return this.adName;
    }

    public final void setAdName(String str) {
        this.adName = str;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final void setAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedAdExtendInfo(String plat, String str, String adId, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(plat, "plat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.plat = plat;
        this.adName = str;
        this.adId = adId;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "FeedAdExtendInfo(adName=" + this.adName + ", plat=" + this.plat + ", adId=" + this.adId + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
