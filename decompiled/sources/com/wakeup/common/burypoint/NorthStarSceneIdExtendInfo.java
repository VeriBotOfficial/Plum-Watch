package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u0004H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/burypoint/NorthStarSceneIdExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "expIds", "", "", "sceneId", "requestTime", "", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getExpIds", "()Ljava/util/List;", "setExpIds", "(Ljava/util/List;)V", "getSceneId", "()Ljava/lang/String;", "setSceneId", "(Ljava/lang/String;)V", "getRequestTime", "()Ljava/lang/Long;", "setRequestTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NorthStarSceneIdExtendInfo extends BaseExtendInfo {
    private List<String> expIds;
    private Long requestTime;
    private String sceneId;

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

    public final Long getRequestTime() {
        return this.requestTime;
    }

    public final void setRequestTime(Long l) {
        this.requestTime = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NorthStarSceneIdExtendInfo(List<String> list, String str, Long l, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.expIds = list;
        this.sceneId = str;
        this.requestTime = l;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "NorthStarSceneIdExtendInfo(expIds=" + this.expIds + ", requestTime=" + this.requestTime + ",sceneId=" + this.sceneId + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
