package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/burypoint/VideoAdExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "adAppid", "", "adId", "adName", "adPosition", "secenId", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdAppid", "()Ljava/lang/String;", "getAdId", "getAdName", "getAdPosition", "getSecenId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoAdExtendInfo extends BaseExtendInfo {
    private final String adAppid;
    private final String adId;
    private final String adName;
    private final String adPosition;
    private final String secenId;

    public final String getAdAppid() {
        return this.adAppid;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getAdName() {
        return this.adName;
    }

    public final String getAdPosition() {
        return this.adPosition;
    }

    public final String getSecenId() {
        return this.secenId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAdExtendInfo(String adAppid, String adId, String adName, String adPosition, String secenId, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(adAppid, "adAppid");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adName, "adName");
        Intrinsics.checkNotNullParameter(adPosition, "adPosition");
        Intrinsics.checkNotNullParameter(secenId, "secenId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.adAppid = adAppid;
        this.adId = adId;
        this.adName = adName;
        this.adPosition = adPosition;
        this.secenId = secenId;
    }
}
