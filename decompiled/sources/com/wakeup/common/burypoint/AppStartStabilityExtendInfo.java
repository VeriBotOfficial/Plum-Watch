package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010.\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016¨\u0006/"}, d2 = {"Lcom/wakeup/common/burypoint/AppStartStabilityExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "duration", "", "splashCost", "splashResumeCost", "loginCost", "loginResumeCost", "adCost", "adResumeCost", "adShowOK", "", "mainCost", "mainResumeCost", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(JJJLjava/lang/Long;Ljava/lang/Long;JJIJJLjava/lang/String;Ljava/lang/String;)V", "getDuration", "()J", "setDuration", "(J)V", "getSplashCost", "setSplashCost", "getSplashResumeCost", "setSplashResumeCost", "getLoginCost", "()Ljava/lang/Long;", "setLoginCost", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLoginResumeCost", "setLoginResumeCost", "getAdCost", "setAdCost", "getAdResumeCost", "setAdResumeCost", "getAdShowOK", "()I", "setAdShowOK", "(I)V", "getMainCost", "setMainCost", "getMainResumeCost", "setMainResumeCost", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppStartStabilityExtendInfo extends BaseExtendInfo {
    private long adCost;
    private long adResumeCost;
    private int adShowOK;
    private long duration;
    private Long loginCost;
    private Long loginResumeCost;
    private long mainCost;
    private long mainResumeCost;
    private long splashCost;
    private long splashResumeCost;

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final long getSplashCost() {
        return this.splashCost;
    }

    public final void setSplashCost(long j) {
        this.splashCost = j;
    }

    public final long getSplashResumeCost() {
        return this.splashResumeCost;
    }

    public final void setSplashResumeCost(long j) {
        this.splashResumeCost = j;
    }

    public final Long getLoginCost() {
        return this.loginCost;
    }

    public final void setLoginCost(Long l) {
        this.loginCost = l;
    }

    public final Long getLoginResumeCost() {
        return this.loginResumeCost;
    }

    public final void setLoginResumeCost(Long l) {
        this.loginResumeCost = l;
    }

    public final long getAdCost() {
        return this.adCost;
    }

    public final void setAdCost(long j) {
        this.adCost = j;
    }

    public final long getAdResumeCost() {
        return this.adResumeCost;
    }

    public final void setAdResumeCost(long j) {
        this.adResumeCost = j;
    }

    public final int getAdShowOK() {
        return this.adShowOK;
    }

    public final void setAdShowOK(int i) {
        this.adShowOK = i;
    }

    public final long getMainCost() {
        return this.mainCost;
    }

    public final void setMainCost(long j) {
        this.mainCost = j;
    }

    public final long getMainResumeCost() {
        return this.mainResumeCost;
    }

    public final void setMainResumeCost(long j) {
        this.mainResumeCost = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStartStabilityExtendInfo(long j, long j2, long j3, Long l, Long l2, long j4, long j5, int i, long j6, long j7, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.duration = j;
        this.splashCost = j2;
        this.splashResumeCost = j3;
        this.loginCost = l;
        this.loginResumeCost = l2;
        this.adCost = j4;
        this.adResumeCost = j5;
        this.adShowOK = i;
        this.mainCost = j6;
        this.mainResumeCost = j7;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "AppStartStabilityExtendInfo(duration=" + this.duration + ",splashCost=" + this.splashCost + ",splashResumeCost=" + this.splashResumeCost + ",loginCost=" + this.loginCost + ",loginResumeCost=" + this.loginResumeCost + ",adCost=" + this.adCost + ",adResumeCost=" + this.adResumeCost + ",adShowOk=" + this.adShowOK + ",mainCost=" + this.mainCost + ",mainResumeCost=" + this.mainResumeCost + ",launchId=" + getLaunchId() + ",sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
