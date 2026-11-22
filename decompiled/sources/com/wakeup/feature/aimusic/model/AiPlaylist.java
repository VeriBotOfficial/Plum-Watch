package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPlaylist.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u0006J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001b¨\u0006,"}, d2 = {"Lcom/wakeup/feature/aimusic/model/AiPlaylist;", "Ljava/io/Serializable;", "playlistId", "", "title", "coverRes", "", "coverPath", "songs", "", "Lcom/wakeup/feature/aimusic/model/Song;", "listedSongCount", "subscribed", "", "isAsmr", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;IZZ)V", "getPlaylistId", "()Ljava/lang/String;", "getTitle", "getCoverRes", "()I", "getCoverPath", "getSongs", "()Ljava/util/List;", "getListedSongCount", "getSubscribed", "()Z", "songCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiPlaylist implements Serializable {
    private static final long serialVersionUID = 1;
    private final String coverPath;
    private final int coverRes;
    private final boolean isAsmr;
    private final int listedSongCount;
    private final String playlistId;
    private final List<Song> songs;
    private final boolean subscribed;
    private final String title;

    public AiPlaylist() {
        this(null, null, 0, null, null, 0, false, false, 255, null);
    }

    public static /* synthetic */ AiPlaylist copy$default(AiPlaylist aiPlaylist, String str, String str2, int i, String str3, List list, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = aiPlaylist.playlistId;
        }
        if ((i3 & 2) != 0) {
            str2 = aiPlaylist.title;
        }
        if ((i3 & 4) != 0) {
            i = aiPlaylist.coverRes;
        }
        if ((i3 & 8) != 0) {
            str3 = aiPlaylist.coverPath;
        }
        if ((i3 & 16) != 0) {
            list = aiPlaylist.songs;
        }
        if ((i3 & 32) != 0) {
            i2 = aiPlaylist.listedSongCount;
        }
        if ((i3 & 64) != 0) {
            z = aiPlaylist.subscribed;
        }
        if ((i3 & 128) != 0) {
            z2 = aiPlaylist.isAsmr;
        }
        boolean z3 = z;
        boolean z4 = z2;
        List list2 = list;
        int i4 = i2;
        return aiPlaylist.copy(str, str2, i, str3, list2, i4, z3, z4);
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
    public final int getListedSongCount() {
        return this.listedSongCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSubscribed() {
        return this.subscribed;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAsmr() {
        return this.isAsmr;
    }

    public final AiPlaylist copy(String playlistId, String title, int coverRes, String coverPath, List<Song> songs, int listedSongCount, boolean subscribed, boolean isAsmr) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        return new AiPlaylist(playlistId, title, coverRes, coverPath, songs, listedSongCount, subscribed, isAsmr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiPlaylist)) {
            return false;
        }
        AiPlaylist aiPlaylist = (AiPlaylist) other;
        return Intrinsics.areEqual(this.playlistId, aiPlaylist.playlistId) && Intrinsics.areEqual(this.title, aiPlaylist.title) && this.coverRes == aiPlaylist.coverRes && Intrinsics.areEqual(this.coverPath, aiPlaylist.coverPath) && Intrinsics.areEqual(this.songs, aiPlaylist.songs) && this.listedSongCount == aiPlaylist.listedSongCount && this.subscribed == aiPlaylist.subscribed && this.isAsmr == aiPlaylist.isAsmr;
    }

    public int hashCode() {
        int hashCode = ((((this.playlistId.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.coverRes)) * 31;
        String str = this.coverPath;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.songs.hashCode()) * 31) + Integer.hashCode(this.listedSongCount)) * 31) + Boolean.hashCode(this.subscribed)) * 31) + Boolean.hashCode(this.isAsmr);
    }

    public String toString() {
        return "AiPlaylist(playlistId=" + this.playlistId + ", title=" + this.title + ", coverRes=" + this.coverRes + ", coverPath=" + this.coverPath + ", songs=" + this.songs + ", listedSongCount=" + this.listedSongCount + ", subscribed=" + this.subscribed + ", isAsmr=" + this.isAsmr + Separators.RPAREN;
    }

    public AiPlaylist(String playlistId, String title, int i, String str, List<Song> songs, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(songs, "songs");
        this.playlistId = playlistId;
        this.title = title;
        this.coverRes = i;
        this.coverPath = str;
        this.songs = songs;
        this.listedSongCount = i2;
        this.subscribed = z;
        this.isAsmr = z2;
    }

    public /* synthetic */ AiPlaylist(String str, String str2, int i, String str3, List list, int i2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? false : z2);
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

    public final int getListedSongCount() {
        return this.listedSongCount;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final boolean isAsmr() {
        return this.isAsmr;
    }

    public final int songCount() {
        return !this.songs.isEmpty() ? this.songs.size() : this.listedSongCount;
    }
}
