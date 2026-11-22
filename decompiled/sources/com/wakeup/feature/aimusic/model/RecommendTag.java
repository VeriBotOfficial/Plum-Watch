package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendTagSongs.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/aimusic/model/RecommendTag;", "", "tagId", "", "title", "themeKey", "songCount", "", "createTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getTagId", "()Ljava/lang/String;", "getTitle", "getThemeKey", "getSongCount", "()I", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecommendTag {

    @SerializedName("create_time")
    private final String createTime;

    @SerializedName("song_count")
    private final int songCount;

    @SerializedName("tag_id")
    private final String tagId;

    @SerializedName("theme_key")
    private final String themeKey;

    @SerializedName("title")
    private final String title;

    public RecommendTag() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ RecommendTag copy$default(RecommendTag recommendTag, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendTag.tagId;
        }
        if ((i2 & 2) != 0) {
            str2 = recommendTag.title;
        }
        if ((i2 & 4) != 0) {
            str3 = recommendTag.themeKey;
        }
        if ((i2 & 8) != 0) {
            i = recommendTag.songCount;
        }
        if ((i2 & 16) != 0) {
            str4 = recommendTag.createTime;
        }
        String str5 = str4;
        String str6 = str3;
        return recommendTag.copy(str, str2, str6, i, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getThemeKey() {
        return this.themeKey;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSongCount() {
        return this.songCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    public final RecommendTag copy(String tagId, String title, String themeKey, int songCount, String createTime) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(themeKey, "themeKey");
        return new RecommendTag(tagId, title, themeKey, songCount, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendTag)) {
            return false;
        }
        RecommendTag recommendTag = (RecommendTag) other;
        return Intrinsics.areEqual(this.tagId, recommendTag.tagId) && Intrinsics.areEqual(this.title, recommendTag.title) && Intrinsics.areEqual(this.themeKey, recommendTag.themeKey) && this.songCount == recommendTag.songCount && Intrinsics.areEqual(this.createTime, recommendTag.createTime);
    }

    public int hashCode() {
        int hashCode = ((((((this.tagId.hashCode() * 31) + this.title.hashCode()) * 31) + this.themeKey.hashCode()) * 31) + Integer.hashCode(this.songCount)) * 31;
        String str = this.createTime;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecommendTag(tagId=" + this.tagId + ", title=" + this.title + ", themeKey=" + this.themeKey + ", songCount=" + this.songCount + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public RecommendTag(String tagId, String title, String themeKey, int i, String str) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(themeKey, "themeKey");
        this.tagId = tagId;
        this.title = title;
        this.themeKey = themeKey;
        this.songCount = i;
        this.createTime = str;
    }

    public /* synthetic */ RecommendTag(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4);
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getThemeKey() {
        return this.themeKey;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final String getCreateTime() {
        return this.createTime;
    }
}
