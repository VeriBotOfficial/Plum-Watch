package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchResult.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/aimusic/model/SearchResult;", "", "keyword", "", "artists", "", "Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "songs", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getKeyword", "()Ljava/lang/String;", "getArtists", "()Ljava/util/List;", "getSongs", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SearchResult {

    @SerializedName("artists")
    private final List<ArtistBrief> artists;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName("songs")
    private final List<Song> songs;

    public SearchResult() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResult.keyword;
        }
        if ((i & 2) != 0) {
            list = searchResult.artists;
        }
        if ((i & 4) != 0) {
            list2 = searchResult.songs;
        }
        return searchResult.copy(str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    public final List<ArtistBrief> component2() {
        return this.artists;
    }

    public final List<Song> component3() {
        return this.songs;
    }

    public final SearchResult copy(String keyword, List<ArtistBrief> artists, List<Song> songs) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(artists, "artists");
        Intrinsics.checkNotNullParameter(songs, "songs");
        return new SearchResult(keyword, artists, songs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) other;
        return Intrinsics.areEqual(this.keyword, searchResult.keyword) && Intrinsics.areEqual(this.artists, searchResult.artists) && Intrinsics.areEqual(this.songs, searchResult.songs);
    }

    public int hashCode() {
        return (((this.keyword.hashCode() * 31) + this.artists.hashCode()) * 31) + this.songs.hashCode();
    }

    public String toString() {
        return "SearchResult(keyword=" + this.keyword + ", artists=" + this.artists + ", songs=" + this.songs + Separators.RPAREN;
    }

    public SearchResult(String keyword, List<ArtistBrief> artists, List<Song> songs) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(artists, "artists");
        Intrinsics.checkNotNullParameter(songs, "songs");
        this.keyword = keyword;
        this.artists = artists;
        this.songs = songs;
    }

    public /* synthetic */ SearchResult(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final List<ArtistBrief> getArtists() {
        return this.artists;
    }

    public final List<Song> getSongs() {
        return this.songs;
    }
}
