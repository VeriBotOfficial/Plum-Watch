package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoHistoryEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoHistoryEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "layoutType", "", "title", "", "data", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "(ILjava/lang/String;Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "getLayoutType", "()I", "setLayoutType", "(I)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getData", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "setData", "(Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "itemType", "getItemType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoHistoryEntity implements MultiItemEntity {
    public static final int LAYOUT_NORMAL = 0;
    public static final int LAYOUT_TITLE = 1;
    private VideoEntity data;
    private int layoutType;
    private String title;

    public static /* synthetic */ VideoHistoryEntity copy$default(VideoHistoryEntity videoHistoryEntity, int i, String str, VideoEntity videoEntity, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoHistoryEntity.layoutType;
        }
        if ((i2 & 2) != 0) {
            str = videoHistoryEntity.title;
        }
        if ((i2 & 4) != 0) {
            videoEntity = videoHistoryEntity.data;
        }
        return videoHistoryEntity.copy(i, str, videoEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLayoutType() {
        return this.layoutType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final VideoEntity getData() {
        return this.data;
    }

    public final VideoHistoryEntity copy(int layoutType, String title, VideoEntity data) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        return new VideoHistoryEntity(layoutType, title, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoHistoryEntity)) {
            return false;
        }
        VideoHistoryEntity videoHistoryEntity = (VideoHistoryEntity) other;
        return this.layoutType == videoHistoryEntity.layoutType && Intrinsics.areEqual(this.title, videoHistoryEntity.title) && Intrinsics.areEqual(this.data, videoHistoryEntity.data);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.layoutType) * 31) + this.title.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "VideoHistoryEntity(layoutType=" + this.layoutType + ", title=" + this.title + ", data=" + this.data + Separators.RPAREN;
    }

    public VideoHistoryEntity(int i, String title, VideoEntity data) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        this.layoutType = i;
        this.title = title;
        this.data = data;
    }

    public /* synthetic */ VideoHistoryEntity(int i, String str, VideoEntity videoEntity, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, videoEntity);
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final void setLayoutType(int i) {
        this.layoutType = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final VideoEntity getData() {
        return this.data;
    }

    public final void setData(VideoEntity videoEntity) {
        Intrinsics.checkNotNullParameter(videoEntity, "<set-?>");
        this.data = videoEntity;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType */
    public int getType() {
        return this.layoutType;
    }
}
