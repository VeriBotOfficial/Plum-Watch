package com.wakeup.common.network.entity.video;

import java.util.List;
import kotlin.Metadata;

/* compiled from: VideoDialInfoData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoDialInfoData;", "", "dialInfo", "Lcom/wakeup/common/network/entity/video/VideoDialInfoEntity;", "defaultImages", "", "", "defaultName", "expIds", "<init>", "(Lcom/wakeup/common/network/entity/video/VideoDialInfoEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDialInfo", "()Lcom/wakeup/common/network/entity/video/VideoDialInfoEntity;", "getDefaultImages", "()Ljava/util/List;", "getDefaultName", "()Ljava/lang/String;", "getExpIds", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoDialInfoData {
    private final List<String> defaultImages;
    private final String defaultName;
    private final VideoDialInfoEntity dialInfo;
    private final String expIds;

    public VideoDialInfoData(VideoDialInfoEntity videoDialInfoEntity, List<String> list, String str, String str2) {
        this.dialInfo = videoDialInfoEntity;
        this.defaultImages = list;
        this.defaultName = str;
        this.expIds = str2;
    }

    public final VideoDialInfoEntity getDialInfo() {
        return this.dialInfo;
    }

    public final List<String> getDefaultImages() {
        return this.defaultImages;
    }

    public final String getDefaultName() {
        return this.defaultName;
    }

    public final String getExpIds() {
        return this.expIds;
    }
}
