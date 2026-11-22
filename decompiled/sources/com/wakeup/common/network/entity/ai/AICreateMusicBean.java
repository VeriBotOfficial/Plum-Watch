package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0018HÆ\u0003J\t\u0010N\u001a\u00020\u0018HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\t\u0010Q\u001a\u00020\u001dHÆ\u0003J\u0081\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010S\u001a\u00020\t2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0018HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010(R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010(R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010(R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010(R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006W"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AICreateMusicBean;", "", "id", "", "videoUrl", "audioUrl", "imageUrl", "imageLargeUrl", "isVideoPending", "", "majorModelVersion", "modelName", "isLiked", "userId", "displayName", "handle", "isHandleUpdated", "avatarImageUrl", "isTrashed", "reaction", "createdAt", "status", "title", "playCount", "", "upvoteCount", "isPublic", "makeInstrumental", "metadata", "Lcom/wakeup/common/network/entity/ai/AIMusicMetaData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLcom/wakeup/common/network/entity/ai/AIMusicMetaData;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getVideoUrl", "getAudioUrl", "getImageUrl", "getImageLargeUrl", "()Z", "getMajorModelVersion", "getModelName", "getUserId", "getDisplayName", "getHandle", "getAvatarImageUrl", "getReaction", "getCreatedAt", "getStatus", "getTitle", d.p, "getPlayCount", "()I", "getUpvoteCount", "getMakeInstrumental", "getMetadata", "()Lcom/wakeup/common/network/entity/ai/AIMusicMetaData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AICreateMusicBean {
    private final String audioUrl;
    private final String avatarImageUrl;
    private final String createdAt;
    private final String displayName;
    private final String handle;
    private String id;
    private final String imageLargeUrl;
    private final String imageUrl;
    private final boolean isHandleUpdated;
    private final boolean isLiked;
    private final boolean isPublic;
    private final String isTrashed;
    private final boolean isVideoPending;
    private final String majorModelVersion;
    private final boolean makeInstrumental;
    private final AIMusicMetaData metadata;
    private final String modelName;
    private final int playCount;
    private final String reaction;
    private final String status;
    private String title;
    private final int upvoteCount;
    private final String userId;
    private final String videoUrl;

    public static /* synthetic */ AICreateMusicBean copy$default(AICreateMusicBean aICreateMusicBean, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, boolean z2, String str8, String str9, String str10, boolean z3, String str11, String str12, String str13, String str14, String str15, String str16, int i, int i2, boolean z4, boolean z5, AIMusicMetaData aIMusicMetaData, int i3, Object obj) {
        AIMusicMetaData aIMusicMetaData2;
        boolean z6;
        String str17 = (i3 & 1) != 0 ? aICreateMusicBean.id : str;
        String str18 = (i3 & 2) != 0 ? aICreateMusicBean.videoUrl : str2;
        String str19 = (i3 & 4) != 0 ? aICreateMusicBean.audioUrl : str3;
        String str20 = (i3 & 8) != 0 ? aICreateMusicBean.imageUrl : str4;
        String str21 = (i3 & 16) != 0 ? aICreateMusicBean.imageLargeUrl : str5;
        boolean z7 = (i3 & 32) != 0 ? aICreateMusicBean.isVideoPending : z;
        String str22 = (i3 & 64) != 0 ? aICreateMusicBean.majorModelVersion : str6;
        String str23 = (i3 & 128) != 0 ? aICreateMusicBean.modelName : str7;
        boolean z8 = (i3 & 256) != 0 ? aICreateMusicBean.isLiked : z2;
        String str24 = (i3 & 512) != 0 ? aICreateMusicBean.userId : str8;
        String str25 = (i3 & 1024) != 0 ? aICreateMusicBean.displayName : str9;
        String str26 = (i3 & 2048) != 0 ? aICreateMusicBean.handle : str10;
        boolean z9 = (i3 & 4096) != 0 ? aICreateMusicBean.isHandleUpdated : z3;
        String str27 = (i3 & 8192) != 0 ? aICreateMusicBean.avatarImageUrl : str11;
        String str28 = str17;
        String str29 = (i3 & 16384) != 0 ? aICreateMusicBean.isTrashed : str12;
        String str30 = (i3 & 32768) != 0 ? aICreateMusicBean.reaction : str13;
        String str31 = (i3 & 65536) != 0 ? aICreateMusicBean.createdAt : str14;
        String str32 = (i3 & 131072) != 0 ? aICreateMusicBean.status : str15;
        String str33 = (i3 & 262144) != 0 ? aICreateMusicBean.title : str16;
        int i4 = (i3 & 524288) != 0 ? aICreateMusicBean.playCount : i;
        int i5 = (i3 & 1048576) != 0 ? aICreateMusicBean.upvoteCount : i2;
        boolean z10 = (i3 & 2097152) != 0 ? aICreateMusicBean.isPublic : z4;
        boolean z11 = (i3 & 4194304) != 0 ? aICreateMusicBean.makeInstrumental : z5;
        if ((i3 & 8388608) != 0) {
            z6 = z11;
            aIMusicMetaData2 = aICreateMusicBean.metadata;
        } else {
            aIMusicMetaData2 = aIMusicMetaData;
            z6 = z11;
        }
        return aICreateMusicBean.copy(str28, str18, str19, str20, str21, z7, str22, str23, z8, str24, str25, str26, z9, str27, str29, str30, str31, str32, str33, i4, i5, z10, z6, aIMusicMetaData2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getHandle() {
        return this.handle;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsHandleUpdated() {
        return this.isHandleUpdated;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final String getIsTrashed() {
        return this.isTrashed;
    }

    /* renamed from: component16, reason: from getter */
    public final String getReaction() {
        return this.reaction;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component18, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component20, reason: from getter */
    public final int getPlayCount() {
        return this.playCount;
    }

    /* renamed from: component21, reason: from getter */
    public final int getUpvoteCount() {
        return this.upvoteCount;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getMakeInstrumental() {
        return this.makeInstrumental;
    }

    /* renamed from: component24, reason: from getter */
    public final AIMusicMetaData getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageLargeUrl() {
        return this.imageLargeUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsVideoPending() {
        return this.isVideoPending;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMajorModelVersion() {
        return this.majorModelVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final String getModelName() {
        return this.modelName;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    public final AICreateMusicBean copy(String id2, String videoUrl, String audioUrl, String imageUrl, String imageLargeUrl, boolean isVideoPending, String majorModelVersion, String modelName, boolean isLiked, String userId, String displayName, String handle, boolean isHandleUpdated, String avatarImageUrl, String isTrashed, String reaction, String createdAt, String status, String title, int playCount, int upvoteCount, boolean isPublic, boolean makeInstrumental, AIMusicMetaData metadata) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(majorModelVersion, "majorModelVersion");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(isTrashed, "isTrashed");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new AICreateMusicBean(id2, videoUrl, audioUrl, imageUrl, imageLargeUrl, isVideoPending, majorModelVersion, modelName, isLiked, userId, displayName, handle, isHandleUpdated, avatarImageUrl, isTrashed, reaction, createdAt, status, title, playCount, upvoteCount, isPublic, makeInstrumental, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AICreateMusicBean)) {
            return false;
        }
        AICreateMusicBean aICreateMusicBean = (AICreateMusicBean) other;
        return Intrinsics.areEqual(this.id, aICreateMusicBean.id) && Intrinsics.areEqual(this.videoUrl, aICreateMusicBean.videoUrl) && Intrinsics.areEqual(this.audioUrl, aICreateMusicBean.audioUrl) && Intrinsics.areEqual(this.imageUrl, aICreateMusicBean.imageUrl) && Intrinsics.areEqual(this.imageLargeUrl, aICreateMusicBean.imageLargeUrl) && this.isVideoPending == aICreateMusicBean.isVideoPending && Intrinsics.areEqual(this.majorModelVersion, aICreateMusicBean.majorModelVersion) && Intrinsics.areEqual(this.modelName, aICreateMusicBean.modelName) && this.isLiked == aICreateMusicBean.isLiked && Intrinsics.areEqual(this.userId, aICreateMusicBean.userId) && Intrinsics.areEqual(this.displayName, aICreateMusicBean.displayName) && Intrinsics.areEqual(this.handle, aICreateMusicBean.handle) && this.isHandleUpdated == aICreateMusicBean.isHandleUpdated && Intrinsics.areEqual(this.avatarImageUrl, aICreateMusicBean.avatarImageUrl) && Intrinsics.areEqual(this.isTrashed, aICreateMusicBean.isTrashed) && Intrinsics.areEqual(this.reaction, aICreateMusicBean.reaction) && Intrinsics.areEqual(this.createdAt, aICreateMusicBean.createdAt) && Intrinsics.areEqual(this.status, aICreateMusicBean.status) && Intrinsics.areEqual(this.title, aICreateMusicBean.title) && this.playCount == aICreateMusicBean.playCount && this.upvoteCount == aICreateMusicBean.upvoteCount && this.isPublic == aICreateMusicBean.isPublic && this.makeInstrumental == aICreateMusicBean.makeInstrumental && Intrinsics.areEqual(this.metadata, aICreateMusicBean.metadata);
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.videoUrl.hashCode()) * 31) + this.audioUrl.hashCode()) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageLargeUrl;
        int hashCode3 = (((((((((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isVideoPending)) * 31) + this.majorModelVersion.hashCode()) * 31) + this.modelName.hashCode()) * 31) + Boolean.hashCode(this.isLiked)) * 31) + this.userId.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.handle.hashCode()) * 31) + Boolean.hashCode(this.isHandleUpdated)) * 31) + this.avatarImageUrl.hashCode()) * 31) + this.isTrashed.hashCode()) * 31;
        String str3 = this.reaction;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        String str4 = this.status;
        return ((((((((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.playCount)) * 31) + Integer.hashCode(this.upvoteCount)) * 31) + Boolean.hashCode(this.isPublic)) * 31) + Boolean.hashCode(this.makeInstrumental)) * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "AICreateMusicBean(id=" + this.id + ", videoUrl=" + this.videoUrl + ", audioUrl=" + this.audioUrl + ", imageUrl=" + this.imageUrl + ", imageLargeUrl=" + this.imageLargeUrl + ", isVideoPending=" + this.isVideoPending + ", majorModelVersion=" + this.majorModelVersion + ", modelName=" + this.modelName + ", isLiked=" + this.isLiked + ", userId=" + this.userId + ", displayName=" + this.displayName + ", handle=" + this.handle + ", isHandleUpdated=" + this.isHandleUpdated + ", avatarImageUrl=" + this.avatarImageUrl + ", isTrashed=" + this.isTrashed + ", reaction=" + this.reaction + ", createdAt=" + this.createdAt + ", status=" + this.status + ", title=" + this.title + ", playCount=" + this.playCount + ", upvoteCount=" + this.upvoteCount + ", isPublic=" + this.isPublic + ", makeInstrumental=" + this.makeInstrumental + ", metadata=" + this.metadata + Separators.RPAREN;
    }

    public AICreateMusicBean(String id2, String videoUrl, String audioUrl, String str, String str2, boolean z, String majorModelVersion, String modelName, boolean z2, String userId, String displayName, String handle, boolean z3, String avatarImageUrl, String isTrashed, String str3, String createdAt, String str4, String title, int i, int i2, boolean z4, boolean z5, AIMusicMetaData metadata) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(majorModelVersion, "majorModelVersion");
        Intrinsics.checkNotNullParameter(modelName, "modelName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(isTrashed, "isTrashed");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.id = id2;
        this.videoUrl = videoUrl;
        this.audioUrl = audioUrl;
        this.imageUrl = str;
        this.imageLargeUrl = str2;
        this.isVideoPending = z;
        this.majorModelVersion = majorModelVersion;
        this.modelName = modelName;
        this.isLiked = z2;
        this.userId = userId;
        this.displayName = displayName;
        this.handle = handle;
        this.isHandleUpdated = z3;
        this.avatarImageUrl = avatarImageUrl;
        this.isTrashed = isTrashed;
        this.reaction = str3;
        this.createdAt = createdAt;
        this.status = str4;
        this.title = title;
        this.playCount = i;
        this.upvoteCount = i2;
        this.isPublic = z4;
        this.makeInstrumental = z5;
        this.metadata = metadata;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageLargeUrl() {
        return this.imageLargeUrl;
    }

    public final boolean isVideoPending() {
        return this.isVideoPending;
    }

    public final String getMajorModelVersion() {
        return this.majorModelVersion;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final boolean isHandleUpdated() {
        return this.isHandleUpdated;
    }

    public final String getAvatarImageUrl() {
        return this.avatarImageUrl;
    }

    public final String isTrashed() {
        return this.isTrashed;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final int getUpvoteCount() {
        return this.upvoteCount;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final boolean getMakeInstrumental() {
        return this.makeInstrumental;
    }

    public final AIMusicMetaData getMetadata() {
        return this.metadata;
    }
}
