package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScenePlaylist.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/wakeup/feature/aimusic/model/ScenePlaylist;", "", "playlistId", "", "title", "coverPath", "songCount", "", "subscribed", "", "songs", "", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;)V", "getPlaylistId", "()Ljava/lang/String;", "getTitle", "getCoverPath", "getSongCount", "()I", "getSubscribed", "()Z", "getSongs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ScenePlaylist {

    @SerializedName("cover_path")
    private final String coverPath;

    @SerializedName("playlist_id")
    private final String playlistId;

    @SerializedName("song_count")
    private final int songCount;

    @SerializedName("songs")
    private final List<Song> songs;

    @SerializedName("subscribed")
    private final boolean subscribed;

    @SerializedName("title")
    private final String title;

    public ScenePlaylist() {
        this(null, null, null, 0, false, null, 63, null);
    }

    public static /* synthetic */ ScenePlaylist copy$default(ScenePlaylist scenePlaylist, String str, String str2, String str3, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scenePlaylist.playlistId;
        }
        if ((i2 & 2) != 0) {
            str2 = scenePlaylist.title;
        }
        if ((i2 & 4) != 0) {
            str3 = scenePlaylist.coverPath;
        }
        if ((i2 & 8) != 0) {
            i = scenePlaylist.songCount;
        }
        if ((i2 & 16) != 0) {
            z = scenePlaylist.subscribed;
        }
        if ((i2 & 32) != 0) {
            list = scenePlaylist.songs;
        }
        boolean z2 = z;
        List list2 = list;
        return scenePlaylist.copy(str, str2, str3, i, z2, list2);
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
    public final String getCoverPath() {
        return this.coverPath;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSongCount() {
        return this.songCount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final List<Song> component6() {
        return this.songs;
    }

    public final ScenePlaylist copy(String playlistId, String title, String coverPath, int songCount, boolean subscribed, List<Song> songs) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        return new ScenePlaylist(playlistId, title, coverPath, songCount, subscribed, songs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScenePlaylist)) {
            return false;
        }
        ScenePlaylist scenePlaylist = (ScenePlaylist) other;
        return Intrinsics.areEqual(this.playlistId, scenePlaylist.playlistId) && Intrinsics.areEqual(this.title, scenePlaylist.title) && Intrinsics.areEqual(this.coverPath, scenePlaylist.coverPath) && this.songCount == scenePlaylist.songCount && this.subscribed == scenePlaylist.subscribed && Intrinsics.areEqual(this.songs, scenePlaylist.songs);
    }

    public int hashCode() {
        int hashCode = ((this.playlistId.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.coverPath;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.songCount)) * 31) + Boolean.hashCode(this.subscribed)) * 31) + this.songs.hashCode();
    }

    public String toString() {
        return "ScenePlaylist(playlistId=" + this.playlistId + ", title=" + this.title + ", coverPath=" + this.coverPath + ", songCount=" + this.songCount + ", subscribed=" + this.subscribed + ", songs=" + this.songs + Separators.RPAREN;
    }

    public ScenePlaylist(String playlistId, String title, String str, int i, boolean z, List<Song> songs) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        this.playlistId = playlistId;
        this.title = title;
        this.coverPath = str;
        this.songCount = i;
        this.subscribed = z;
        this.songs = songs;
    }

    public /* synthetic */ ScenePlaylist(String str, String str2, String str3, int i, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getPlaylistId() {
        return this.playlistId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final List<Song> getSongs() {
        return this.songs;
    }
}
