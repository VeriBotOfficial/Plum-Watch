package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/burypoint/FollowPublisherExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "positionId", "", "pusherId", "pusherType", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPositionId", "()Ljava/lang/String;", "getPusherId", "getPusherType", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FollowPublisherExtendInfo extends BaseExtendInfo {
    private final String positionId;
    private final String pusherId;
    private final String pusherType;

    public final String getPositionId() {
        return this.positionId;
    }

    public final String getPusherId() {
        return this.pusherId;
    }

    public final String getPusherType() {
        return this.pusherType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPublisherExtendInfo(String positionId, String pusherId, String pusherType, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(pusherId, "pusherId");
        Intrinsics.checkNotNullParameter(pusherType, "pusherType");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.positionId = positionId;
        this.pusherId = pusherId;
        this.pusherType = pusherType;
    }
}
