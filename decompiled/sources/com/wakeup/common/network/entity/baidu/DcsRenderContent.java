package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsRenderContent;", "", "mediaLengthInMilliseconds", "", "title", "", "titleSubtext1", "titleSubtext2", "art", "Lcom/wakeup/common/network/entity/baidu/SongCoverPicture;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/baidu/SongCoverPicture;)V", "getMediaLengthInMilliseconds", "()J", "getTitle", "()Ljava/lang/String;", "getTitleSubtext1", "getTitleSubtext2", "getArt", "()Lcom/wakeup/common/network/entity/baidu/SongCoverPicture;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsRenderContent {
    private final SongCoverPicture art;
    private final long mediaLengthInMilliseconds;
    private final String title;
    private final String titleSubtext1;
    private final String titleSubtext2;

    public static /* synthetic */ DcsRenderContent copy$default(DcsRenderContent dcsRenderContent, long j, String str, String str2, String str3, SongCoverPicture songCoverPicture, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dcsRenderContent.mediaLengthInMilliseconds;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = dcsRenderContent.title;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = dcsRenderContent.titleSubtext1;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = dcsRenderContent.titleSubtext2;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            songCoverPicture = dcsRenderContent.art;
        }
        return dcsRenderContent.copy(j2, str4, str5, str6, songCoverPicture);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMediaLengthInMilliseconds() {
        return this.mediaLengthInMilliseconds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleSubtext1() {
        return this.titleSubtext1;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitleSubtext2() {
        return this.titleSubtext2;
    }

    /* renamed from: component5, reason: from getter */
    public final SongCoverPicture getArt() {
        return this.art;
    }

    public final DcsRenderContent copy(long mediaLengthInMilliseconds, String title, String titleSubtext1, String titleSubtext2, SongCoverPicture art) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleSubtext1, "titleSubtext1");
        Intrinsics.checkNotNullParameter(titleSubtext2, "titleSubtext2");
        Intrinsics.checkNotNullParameter(art, "art");
        return new DcsRenderContent(mediaLengthInMilliseconds, title, titleSubtext1, titleSubtext2, art);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsRenderContent)) {
            return false;
        }
        DcsRenderContent dcsRenderContent = (DcsRenderContent) other;
        return this.mediaLengthInMilliseconds == dcsRenderContent.mediaLengthInMilliseconds && Intrinsics.areEqual(this.title, dcsRenderContent.title) && Intrinsics.areEqual(this.titleSubtext1, dcsRenderContent.titleSubtext1) && Intrinsics.areEqual(this.titleSubtext2, dcsRenderContent.titleSubtext2) && Intrinsics.areEqual(this.art, dcsRenderContent.art);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.mediaLengthInMilliseconds) * 31) + this.title.hashCode()) * 31) + this.titleSubtext1.hashCode()) * 31) + this.titleSubtext2.hashCode()) * 31) + this.art.hashCode();
    }

    public String toString() {
        return "DcsRenderContent(mediaLengthInMilliseconds=" + this.mediaLengthInMilliseconds + ", title=" + this.title + ", titleSubtext1=" + this.titleSubtext1 + ", titleSubtext2=" + this.titleSubtext2 + ", art=" + this.art + Separators.RPAREN;
    }

    public DcsRenderContent(long j, String title, String titleSubtext1, String titleSubtext2, SongCoverPicture art) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleSubtext1, "titleSubtext1");
        Intrinsics.checkNotNullParameter(titleSubtext2, "titleSubtext2");
        Intrinsics.checkNotNullParameter(art, "art");
        this.mediaLengthInMilliseconds = j;
        this.title = title;
        this.titleSubtext1 = titleSubtext1;
        this.titleSubtext2 = titleSubtext2;
        this.art = art;
    }

    public final long getMediaLengthInMilliseconds() {
        return this.mediaLengthInMilliseconds;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleSubtext1() {
        return this.titleSubtext1;
    }

    public final String getTitleSubtext2() {
        return this.titleSubtext2;
    }

    public final SongCoverPicture getArt() {
        return this.art;
    }
}
