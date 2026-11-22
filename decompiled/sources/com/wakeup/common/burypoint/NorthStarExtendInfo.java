package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001c\u001a\u00020\u0004H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/burypoint/NorthStarExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "expIds", "", "", "sceneId", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, RnBuryPointApi.KEY_ACTION_NAME, "requestTime", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getExpIds", "()Ljava/util/List;", "setExpIds", "(Ljava/util/List;)V", "getSceneId", "()Ljava/lang/String;", "setSceneId", "(Ljava/lang/String;)V", "getActionName", "setActionName", "getRequestTime", "()Ljava/lang/Long;", "setRequestTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NorthStarExtendInfo extends BaseExtendInfo {
    private String actionName;
    private List<String> expIds;
    private Long requestTime;
    private String sceneId;

    public /* synthetic */ NorthStarExtendInfo(List list, String str, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l);
    }

    public final List<String> getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(List<String> list) {
        this.expIds = list;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final void setSceneId(String str) {
        this.sceneId = str;
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final Long getRequestTime() {
        return this.requestTime;
    }

    public final void setRequestTime(Long l) {
        this.requestTime = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NorthStarExtendInfo(List<String> list, String str, String launchId, String sessionId, String str2, Long l) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.expIds = list;
        this.sceneId = str;
        this.actionName = str2;
        this.requestTime = l;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "NorthStarExtendInfo(expIds=" + this.expIds + ", sceneId=" + this.sceneId + ",launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + ", actionName=" + this.actionName + ", requestTime=" + this.requestTime + Separators.RPAREN;
    }
}
