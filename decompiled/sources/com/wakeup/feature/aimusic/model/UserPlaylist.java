package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserPlaylist.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u0006J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006)"}, d2 = {"Lcom/wakeup/feature/aimusic/model/UserPlaylist;", "Ljava/io/Serializable;", "playlistId", "", "title", "coverRes", "", "coverPath", "songs", "", "Lcom/wakeup/feature/aimusic/model/Song;", "isLikedList", "", "listedSongCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZI)V", "getPlaylistId", "()Ljava/lang/String;", "getTitle", "getCoverRes", "()I", "getCoverPath", "getSongs", "()Ljava/util/List;", "()Z", "getListedSongCount", "songCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserPlaylist implements Serializable {
    public static final String ID_LIKED = "default";
    private static final long serialVersionUID = 1;
    private final String coverPath;
    private final int coverRes;
    private final boolean isLikedList;
    private final int listedSongCount;
    private final String playlistId;
    private final List<Song> songs;
    private final String title;

    public UserPlaylist() {
        this(null, null, 0, null, null, false, 0, 127, null);
    }

    public static /* synthetic */ UserPlaylist copy$default(UserPlaylist userPlaylist, String str, String str2, int i, String str3, List list, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = userPlaylist.playlistId;
        }
        if ((i3 & 2) != 0) {
            str2 = userPlaylist.title;
        }
        if ((i3 & 4) != 0) {
            i = userPlaylist.coverRes;
        }
        if ((i3 & 8) != 0) {
            str3 = userPlaylist.coverPath;
        }
        if ((i3 & 16) != 0) {
            list = userPlaylist.songs;
        }
        if ((i3 & 32) != 0) {
            z = userPlaylist.isLikedList;
        }
        if ((i3 & 64) != 0) {
            i2 = userPlaylist.listedSongCount;
        }
        boolean z2 = z;
        int i4 = i2;
        List list2 = list;
        int i5 = i;
        return userPlaylist.copy(str, str2, i5, str3, list2, z2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaylistId() {
        return this.playlistId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCoverRes() {
        return this.coverRes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverPath() {
        return this.coverPath;
    }

    public final List<Song> component5() {
        return this.songs;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLikedList() {
        return this.isLikedList;
    }

    /* renamed from: component7, reason: from getter */
    public final int getListedSongCount() {
        return this.listedSongCount;
    }

    public final UserPlaylist copy(String playlistId, String title, int coverRes, String coverPath, List<Song> songs, boolean isLikedList, int listedSongCount) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        return new UserPlaylist(playlistId, title, coverRes, coverPath, songs, isLikedList, listedSongCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPlaylist)) {
            return false;
        }
        UserPlaylist userPlaylist = (UserPlaylist) other;
        return Intrinsics.areEqual(this.playlistId, userPlaylist.playlistId) && Intrinsics.areEqual(this.title, userPlaylist.title) && this.coverRes == userPlaylist.coverRes && Intrinsics.areEqual(this.coverPath, userPlaylist.coverPath) && Intrinsics.areEqual(this.songs, userPlaylist.songs) && this.isLikedList == userPlaylist.isLikedList && this.listedSongCount == userPlaylist.listedSongCount;
    }

    public int hashCode() {
        int hashCode = ((((this.playlistId.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.coverRes)) * 31;
        String str = this.coverPath;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.songs.hashCode()) * 31) + Boolean.hashCode(this.isLikedList)) * 31) + Integer.hashCode(this.listedSongCount);
    }

    public String toString() {
        return "UserPlaylist(playlistId=" + this.playlistId + ", title=" + this.title + ", coverRes=" + this.coverRes + ", coverPath=" + this.coverPath + ", songs=" + this.songs + ", isLikedList=" + this.isLikedList + ", listedSongCount=" + this.listedSongCount + Separators.RPAREN;
    }

    public UserPlaylist(String playlistId, String title, int i, String str, List<Song> songs, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        this.playlistId = playlistId;
        this.title = title;
        this.coverRes = i;
        this.coverPath = str;
        this.songs = songs;
        this.isLikedList = z;
        this.listedSongCount = i2;
    }

    public /* synthetic */ UserPlaylist(String str, String str2, int i, String str3, List list, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? 0 : i2);
    }

    public final String getPlaylistId() {
        return this.playlistId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCoverRes() {
        return this.coverRes;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final List<Song> getSongs() {
        return this.songs;
    }

    public final boolean isLikedList() {
        return this.isLikedList;
    }

    public final int getListedSongCount() {
        return this.listedSongCount;
    }

    public final int songCount() {
        return !this.songs.isEmpty() ? this.songs.size() : this.listedSongCount;
    }
}
