package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendTagSongs.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/aimusic/model/RecommendTagSongs;", "", "tagId", "", "title", "songCount", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getTagId", "()Ljava/lang/String;", "getTitle", "getSongCount", "()I", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecommendTagSongs {

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Song> items;

    @SerializedName("song_count")
    private final int songCount;

    @SerializedName("tag_id")
    private final String tagId;

    @SerializedName("title")
    private final String title;

    public RecommendTagSongs() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendTagSongs copy$default(RecommendTagSongs recommendTagSongs, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendTagSongs.tagId;
        }
        if ((i2 & 2) != 0) {
            str2 = recommendTagSongs.title;
        }
        if ((i2 & 4) != 0) {
            i = recommendTagSongs.songCount;
        }
        if ((i2 & 8) != 0) {
            list = recommendTagSongs.items;
        }
        return recommendTagSongs.copy(str, str2, i, list);
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
    public final int getSongCount() {
        return this.songCount;
    }

    public final List<Song> component4() {
        return this.items;
    }

    public final RecommendTagSongs copy(String tagId, String title, int songCount, List<Song> items) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new RecommendTagSongs(tagId, title, songCount, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendTagSongs)) {
            return false;
        }
        RecommendTagSongs recommendTagSongs = (RecommendTagSongs) other;
        return Intrinsics.areEqual(this.tagId, recommendTagSongs.tagId) && Intrinsics.areEqual(this.title, recommendTagSongs.title) && this.songCount == recommendTagSongs.songCount && Intrinsics.areEqual(this.items, recommendTagSongs.items);
    }

    public int hashCode() {
        return (((((this.tagId.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.songCount)) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "RecommendTagSongs(tagId=" + this.tagId + ", title=" + this.title + ", songCount=" + this.songCount + ", items=" + this.items + Separators.RPAREN;
    }

    public RecommendTagSongs(String tagId, String title, int i, List<Song> items) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.tagId = tagId;
        this.title = title;
        this.songCount = i;
        this.items = items;
    }

    public /* synthetic */ RecommendTagSongs(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final List<Song> getItems() {
        return this.items;
    }
}
