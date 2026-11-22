package com.wakeup.howear;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.burypoint.BaseExtendInfo;
import com.wakeup.howear.push.PushLaunchMarker;
import com.yandex.div.core.DivActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/howear/AdRequestExtraInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "placementId", "", "plat", "extras", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "getPlat", "setPlat", "getExtras", "setExtras", "launchSource", "getLaunchSource", "setLaunchSource", DivActionHandler.DivActionReason.TRIGGER, "getTrigger", "setTrigger", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdRequestExtraInfo extends BaseExtendInfo {
    private String extras;
    private String launchSource;
    private String placementId;
    private String plat;
    private String trigger;

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

    public final String getExtras() {
        return this.extras;
    }

    public final void setExtras(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extras = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRequestExtraInfo(String placementId, String plat, String extras, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(plat, "plat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.placementId = placementId;
        this.plat = plat;
        this.extras = extras;
        this.launchSource = PushLaunchMarker.getLaunchSource();
    }

    public final String getLaunchSource() {
        return this.launchSource;
    }

    public final void setLaunchSource(String str) {
        this.launchSource = str;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final void setTrigger(String str) {
        this.trigger = str;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "WindLoadExtendInfo(extras=" + this.extras + ", plat=" + this.plat + ", placementId=" + this.placementId + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + ", launchSource=" + this.launchSource + ", trigger=" + this.trigger + Separators.RPAREN;
    }
}
