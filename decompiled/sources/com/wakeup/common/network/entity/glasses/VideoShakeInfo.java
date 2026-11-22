package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoShakeInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/VideoShakeInfo;", "", "code", "", "remark", "createTime", "videoShakeName", "videoShakeUrl", "videoShakeMd5", "videoShakeToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getRemark", "getCreateTime", "getVideoShakeName", "getVideoShakeUrl", "getVideoShakeMd5", "getVideoShakeToken", "saveTimeStamp", "", "getSaveTimeStamp", "()J", "setSaveTimeStamp", "(J)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoShakeInfo {
    private final String code;
    private final String createTime;
    private final String remark;
    private long saveTimeStamp;
    private final String videoShakeMd5;
    private final String videoShakeName;
    private final String videoShakeToken;
    private final String videoShakeUrl;

    public VideoShakeInfo(String code, String remark, String createTime, String videoShakeName, String videoShakeUrl, String videoShakeMd5, String videoShakeToken) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(videoShakeName, "videoShakeName");
        Intrinsics.checkNotNullParameter(videoShakeUrl, "videoShakeUrl");
        Intrinsics.checkNotNullParameter(videoShakeMd5, "videoShakeMd5");
        Intrinsics.checkNotNullParameter(videoShakeToken, "videoShakeToken");
        this.code = code;
        this.remark = remark;
        this.createTime = createTime;
        this.videoShakeName = videoShakeName;
        this.videoShakeUrl = videoShakeUrl;
        this.videoShakeMd5 = videoShakeMd5;
        this.videoShakeToken = videoShakeToken;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getVideoShakeName() {
        return this.videoShakeName;
    }

    public final String getVideoShakeUrl() {
        return this.videoShakeUrl;
    }

    public final String getVideoShakeMd5() {
        return this.videoShakeMd5;
    }

    public final String getVideoShakeToken() {
        return this.videoShakeToken;
    }

    public final long getSaveTimeStamp() {
        return this.saveTimeStamp;
    }

    public final void setSaveTimeStamp(long j) {
        this.saveTimeStamp = j;
    }

    public String toString() {
        return "VideoShakeInfo(code='" + this.code + "', remark='" + this.remark + "', createTime='" + this.createTime + "', videoShakeName='" + this.videoShakeName + "', videoShakeUrl='" + this.videoShakeUrl + "', videoShakeMd5='" + this.videoShakeMd5 + "', videoShakeToken='" + this.videoShakeToken + "', saveTimeStamp=" + this.saveTimeStamp + Separators.RPAREN;
    }
}
