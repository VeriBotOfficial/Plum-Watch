package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/burypoint/HomePageBannerExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "bannerId", "", "bannerJumpType", "bannerJumpLink", "bannerExtend", "bannerSort", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerId", "()Ljava/lang/String;", "getBannerJumpType", "getBannerJumpLink", "getBannerExtend", "getBannerSort", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomePageBannerExtendInfo extends BaseExtendInfo {
    private final String bannerExtend;
    private final String bannerId;
    private final String bannerJumpLink;
    private final String bannerJumpType;
    private final String bannerSort;

    public final String getBannerId() {
        return this.bannerId;
    }

    public final String getBannerJumpType() {
        return this.bannerJumpType;
    }

    public final String getBannerJumpLink() {
        return this.bannerJumpLink;
    }

    public final String getBannerExtend() {
        return this.bannerExtend;
    }

    public final String getBannerSort() {
        return this.bannerSort;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageBannerExtendInfo(String bannerId, String bannerJumpType, String bannerJumpLink, String bannerExtend, String bannerSort, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        Intrinsics.checkNotNullParameter(bannerJumpType, "bannerJumpType");
        Intrinsics.checkNotNullParameter(bannerJumpLink, "bannerJumpLink");
        Intrinsics.checkNotNullParameter(bannerExtend, "bannerExtend");
        Intrinsics.checkNotNullParameter(bannerSort, "bannerSort");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.bannerId = bannerId;
        this.bannerJumpType = bannerJumpType;
        this.bannerJumpLink = bannerJumpLink;
        this.bannerExtend = bannerExtend;
        this.bannerSort = bannerSort;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "HomePageBannerExtendInfo(bannerId=" + this.bannerId + ", bannerJumpType=" + this.bannerJumpType + ", bannerJumpLink=" + this.bannerJumpLink + ", bannerExtend=" + this.bannerExtend + ", bannerSort=" + this.bannerSort + " launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
