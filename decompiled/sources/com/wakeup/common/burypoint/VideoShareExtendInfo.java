package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/burypoint/VideoShareExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "itemId", "", "area", "traceId", "sceneId", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getArea", "getTraceId", "getSceneId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoShareExtendInfo extends BaseExtendInfo {
    private final String area;
    private final String itemId;
    private final String sceneId;
    private final String traceId;

    public final String getItemId() {
        return this.itemId;
    }

    public final String getArea() {
        return this.area;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoShareExtendInfo(String itemId, String area, String traceId, String sceneId, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(sceneId, "sceneId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.itemId = itemId;
        this.area = area;
        this.traceId = traceId;
        this.sceneId = sceneId;
    }
}
