package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/burypoint/ViewRenderStabilityExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "cost", "", "cacheCost", "requestCost", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(JJJLjava/lang/String;Ljava/lang/String;)V", "getCost", "()J", "setCost", "(J)V", "getCacheCost", "setCacheCost", "getRequestCost", "setRequestCost", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewRenderStabilityExtendInfo extends BaseExtendInfo {
    private long cacheCost;
    private long cost;
    private long requestCost;

    public final long getCost() {
        return this.cost;
    }

    public final void setCost(long j) {
        this.cost = j;
    }

    public final long getCacheCost() {
        return this.cacheCost;
    }

    public final void setCacheCost(long j) {
        this.cacheCost = j;
    }

    public final long getRequestCost() {
        return this.requestCost;
    }

    public final void setRequestCost(long j) {
        this.requestCost = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewRenderStabilityExtendInfo(long j, long j2, long j3, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.cost = j;
        this.cacheCost = j2;
        this.requestCost = j3;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "ViewRenderStabilityExtendInfo(cost=" + this.cost + ", cacheCost=" + this.cacheCost + ", requestCost=" + this.requestCost + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
