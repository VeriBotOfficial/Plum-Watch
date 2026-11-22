package com.wakeup.feature.wkvideo.livecut.model;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.video.VideoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutItem.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutItem;", "", "clipId", "", "title", "videoUrl", "coverUrl", "buyPath", "sourceVideo", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "buyButtonText", "cartTitle", "cartSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/video/VideoEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClipId", "()Ljava/lang/String;", "getTitle", "getVideoUrl", "getCoverUrl", "getBuyPath", "getSourceVideo", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "getBuyButtonText", "getCartTitle", "getCartSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutItem {
    private final String buyButtonText;
    private final String buyPath;
    private final String cartSubtitle;
    private final String cartTitle;
    private final String clipId;
    private final String coverUrl;
    private final VideoEntity sourceVideo;
    private final String title;
    private final String videoUrl;

    public static /* synthetic */ LiveCutItem copy$default(LiveCutItem liveCutItem, String str, String str2, String str3, String str4, String str5, VideoEntity videoEntity, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveCutItem.clipId;
        }
        if ((i & 2) != 0) {
            str2 = liveCutItem.title;
        }
        if ((i & 4) != 0) {
            str3 = liveCutItem.videoUrl;
        }
        if ((i & 8) != 0) {
            str4 = liveCutItem.coverUrl;
        }
        if ((i & 16) != 0) {
            str5 = liveCutItem.buyPath;
        }
        if ((i & 32) != 0) {
            videoEntity = liveCutItem.sourceVideo;
        }
        if ((i & 64) != 0) {
            str6 = liveCutItem.buyButtonText;
        }
        if ((i & 128) != 0) {
            str7 = liveCutItem.cartTitle;
        }
        if ((i & 256) != 0) {
            str8 = liveCutItem.cartSubtitle;
        }
        String str9 = str7;
        String str10 = str8;
        VideoEntity videoEntity2 = videoEntity;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return liveCutItem.copy(str, str2, str13, str4, str12, videoEntity2, str11, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClipId() {
        return this.clipId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBuyPath() {
        return this.buyPath;
    }

    /* renamed from: component6, reason: from getter */
    public final VideoEntity getSourceVideo() {
        return this.sourceVideo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBuyButtonText() {
        return this.buyButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCartTitle() {
        return this.cartTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCartSubtitle() {
        return this.cartSubtitle;
    }

    public final LiveCutItem copy(String clipId, String title, String videoUrl, String coverUrl, String buyPath, VideoEntity sourceVideo, String buyButtonText, String cartTitle, String cartSubtitle) {
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        Intrinsics.checkNotNullParameter(sourceVideo, "sourceVideo");
        Intrinsics.checkNotNullParameter(buyButtonText, "buyButtonText");
        Intrinsics.checkNotNullParameter(cartTitle, "cartTitle");
        Intrinsics.checkNotNullParameter(cartSubtitle, "cartSubtitle");
        return new LiveCutItem(clipId, title, videoUrl, coverUrl, buyPath, sourceVideo, buyButtonText, cartTitle, cartSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutItem)) {
            return false;
        }
        LiveCutItem liveCutItem = (LiveCutItem) other;
        return Intrinsics.areEqual(this.clipId, liveCutItem.clipId) && Intrinsics.areEqual(this.title, liveCutItem.title) && Intrinsics.areEqual(this.videoUrl, liveCutItem.videoUrl) && Intrinsics.areEqual(this.coverUrl, liveCutItem.coverUrl) && Intrinsics.areEqual(this.buyPath, liveCutItem.buyPath) && Intrinsics.areEqual(this.sourceVideo, liveCutItem.sourceVideo) && Intrinsics.areEqual(this.buyButtonText, liveCutItem.buyButtonText) && Intrinsics.areEqual(this.cartTitle, liveCutItem.cartTitle) && Intrinsics.areEqual(this.cartSubtitle, liveCutItem.cartSubtitle);
    }

    public int hashCode() {
        return (((((((((((((((this.clipId.hashCode() * 31) + this.title.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.coverUrl.hashCode()) * 31) + this.buyPath.hashCode()) * 31) + this.sourceVideo.hashCode()) * 31) + this.buyButtonText.hashCode()) * 31) + this.cartTitle.hashCode()) * 31) + this.cartSubtitle.hashCode();
    }

    public String toString() {
        return "LiveCutItem(clipId=" + this.clipId + ", title=" + this.title + ", videoUrl=" + this.videoUrl + ", coverUrl=" + this.coverUrl + ", buyPath=" + this.buyPath + ", sourceVideo=" + this.sourceVideo + ", buyButtonText=" + this.buyButtonText + ", cartTitle=" + this.cartTitle + ", cartSubtitle=" + this.cartSubtitle + Separators.RPAREN;
    }

    public LiveCutItem(String clipId, String title, String videoUrl, String coverUrl, String buyPath, VideoEntity sourceVideo, String buyButtonText, String cartTitle, String cartSubtitle) {
        Intrinsics.checkNotNullParameter(clipId, "clipId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(buyPath, "buyPath");
        Intrinsics.checkNotNullParameter(sourceVideo, "sourceVideo");
        Intrinsics.checkNotNullParameter(buyButtonText, "buyButtonText");
        Intrinsics.checkNotNullParameter(cartTitle, "cartTitle");
        Intrinsics.checkNotNullParameter(cartSubtitle, "cartSubtitle");
        this.clipId = clipId;
        this.title = title;
        this.videoUrl = videoUrl;
        this.coverUrl = coverUrl;
        this.buyPath = buyPath;
        this.sourceVideo = sourceVideo;
        this.buyButtonText = buyButtonText;
        this.cartTitle = cartTitle;
        this.cartSubtitle = cartSubtitle;
    }

    public final String getClipId() {
        return this.clipId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getBuyPath() {
        return this.buyPath;
    }

    public final VideoEntity getSourceVideo() {
        return this.sourceVideo;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ LiveCutItem(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.wakeup.common.network.entity.video.VideoEntity r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto Lb
            java.lang.String r1 = "去购买"
            r9 = r1
            goto Ld
        Lb:
            r9 = r19
        Ld:
            r1 = r0 & 128(0x80, float:1.8E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L15
            r10 = r2
            goto L17
        L15:
            r10 = r20
        L17:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L27
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2 = r12
            goto L33
        L27:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L33:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.livecut.model.LiveCutItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.wakeup.common.network.entity.video.VideoEntity, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBuyButtonText() {
        return this.buyButtonText;
    }

    public final String getCartTitle() {
        return this.cartTitle;
    }

    public final String getCartSubtitle() {
        return this.cartSubtitle;
    }
}
