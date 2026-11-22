package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArtistSongItem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006("}, d2 = {"Lcom/wakeup/feature/aimusic/model/ArtistSongItem;", "Ljava/io/Serializable;", "musicId", "", "songName", "songStyle", "songDuration", "", "coverPath", "audioPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getMusicId", "()Ljava/lang/String;", "getSongName", "getSongStyle", "getSongDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverPath", "getAudioPath", "toSong", "Lcom/wakeup/feature/aimusic/model/Song;", "artist", "Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/feature/aimusic/model/ArtistSongItem;", "equals", "", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ArtistSongItem implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("audio_path")
    private final String audioPath;

    @SerializedName("cover_path")
    private final String coverPath;

    @SerializedName("music_id")
    private final String musicId;

    @SerializedName("song_duration")
    private final Integer songDuration;

    @SerializedName("song_name")
    private final String songName;

    @SerializedName("song_style")
    private final String songStyle;

    public ArtistSongItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ArtistSongItem copy$default(ArtistSongItem artistSongItem, String str, String str2, String str3, Integer num, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artistSongItem.musicId;
        }
        if ((i & 2) != 0) {
            str2 = artistSongItem.songName;
        }
        if ((i & 4) != 0) {
            str3 = artistSongItem.songStyle;
        }
        if ((i & 8) != 0) {
            num = artistSongItem.songDuration;
        }
        if ((i & 16) != 0) {
            str4 = artistSongItem.coverPath;
        }
        if ((i & 32) != 0) {
            str5 = artistSongItem.audioPath;
        }
        String str6 = str4;
        String str7 = str5;
        return artistSongItem.copy(str, str2, str3, num, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMusicId() {
        return this.musicId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSongName() {
        return this.songName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSongStyle() {
        return this.songStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSongDuration() {
        return this.songDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCoverPath() {
        return this.coverPath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAudioPath() {
        return this.audioPath;
    }

    public final ArtistSongItem copy(String musicId, String songName, String songStyle, Integer songDuration, String coverPath, String audioPath) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        return new ArtistSongItem(musicId, songName, songStyle, songDuration, coverPath, audioPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtistSongItem)) {
            return false;
        }
        ArtistSongItem artistSongItem = (ArtistSongItem) other;
        return Intrinsics.areEqual(this.musicId, artistSongItem.musicId) && Intrinsics.areEqual(this.songName, artistSongItem.songName) && Intrinsics.areEqual(this.songStyle, artistSongItem.songStyle) && Intrinsics.areEqual(this.songDuration, artistSongItem.songDuration) && Intrinsics.areEqual(this.coverPath, artistSongItem.coverPath) && Intrinsics.areEqual(this.audioPath, artistSongItem.audioPath);
    }

    public int hashCode() {
        int hashCode = ((this.musicId.hashCode() * 31) + this.songName.hashCode()) * 31;
        String str = this.songStyle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.songDuration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.coverPath;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audioPath;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ArtistSongItem(musicId=" + this.musicId + ", songName=" + this.songName + ", songStyle=" + this.songStyle + ", songDuration=" + this.songDuration + ", coverPath=" + this.coverPath + ", audioPath=" + this.audioPath + Separators.RPAREN;
    }

    public ArtistSongItem(String musicId, String songName, String str, Integer num, String str2, String str3) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        this.musicId = musicId;
        this.songName = songName;
        this.songStyle = str;
        this.songDuration = num;
        this.coverPath = str2;
        this.audioPath = str3;
    }

    public /* synthetic */ ArtistSongItem(String str, String str2, String str3, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getSongName() {
        return this.songName;
    }

    public final String getSongStyle() {
        return this.songStyle;
    }

    public final Integer getSongDuration() {
        return this.songDuration;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final Song toSong(ArtistBrief artist) {
        Intrinsics.checkNotNullParameter(artist, "artist");
        return new Song(this.musicId, this.songName, this.songStyle, this.songDuration, this.coverPath, this.audioPath, artist, false, 128, null);
    }
}
