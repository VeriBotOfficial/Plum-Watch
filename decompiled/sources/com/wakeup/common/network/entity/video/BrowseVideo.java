package com.wakeup.common.network.entity.video;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BrowseVideo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/video/BrowseVideo;", "", "userId", "", "categoryId", "browseStopTime", "", "expIds", "traceId", "sceneId", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getCategoryId", "setCategoryId", "getBrowseStopTime", "()I", "setBrowseStopTime", "(I)V", "getExpIds", "setExpIds", "getTraceId", "setTraceId", "getSceneId", "setSceneId", "getItemId", "setItemId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrowseVideo {
    private int browseStopTime;
    private String categoryId;
    private String expIds;
    private String itemId;
    private String sceneId;
    private String traceId;
    private String userId;

    public BrowseVideo(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.userId = str;
        this.categoryId = str2;
        this.browseStopTime = i;
        this.expIds = str3;
        this.traceId = str4;
        this.sceneId = str5;
        this.itemId = str6;
    }

    public /* synthetic */ BrowseVideo(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, str3, str4, str5, str6);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final int getBrowseStopTime() {
        return this.browseStopTime;
    }

    public final void setBrowseStopTime(int i) {
        this.browseStopTime = i;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final void setExpIds(String str) {
        this.expIds = str;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final void setTraceId(String str) {
        this.traceId = str;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final void setSceneId(String str) {
        this.sceneId = str;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }
}
