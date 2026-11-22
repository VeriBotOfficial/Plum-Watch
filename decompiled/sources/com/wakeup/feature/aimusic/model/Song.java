package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Song.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001b¨\u0006-"}, d2 = {"Lcom/wakeup/feature/aimusic/model/Song;", "Ljava/io/Serializable;", "musicId", "", "songName", "songStyle", "songDuration", "", "coverPath", "audioPath", "artist", "Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "isAsmr", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/feature/aimusic/model/ArtistBrief;Z)V", "getMusicId", "()Ljava/lang/String;", "getSongName", "getSongStyle", "getSongDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverPath", "getAudioPath", "getArtist", "()Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "()Z", "artistName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/feature/aimusic/model/ArtistBrief;Z)Lcom/wakeup/feature/aimusic/model/Song;", "equals", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Song implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("artist")
    private final ArtistBrief artist;

    @SerializedName("audio_path")
    private final String audioPath;

    @SerializedName("cover_path")
    private final String coverPath;
    private final boolean isAsmr;

    @SerializedName("music_id")
    private final String musicId;

    @SerializedName("song_duration")
    private final Integer songDuration;

    @SerializedName("song_name")
    private final String songName;

    @SerializedName("song_style")
    private final String songStyle;

    public Song() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ Song copy$default(Song song, String str, String str2, String str3, Integer num, String str4, String str5, ArtistBrief artistBrief, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = song.musicId;
        }
        if ((i & 2) != 0) {
            str2 = song.songName;
        }
        if ((i & 4) != 0) {
            str3 = song.songStyle;
        }
        if ((i & 8) != 0) {
            num = song.songDuration;
        }
        if ((i & 16) != 0) {
            str4 = song.coverPath;
        }
        if ((i & 32) != 0) {
            str5 = song.audioPath;
        }
        if ((i & 64) != 0) {
            artistBrief = song.artist;
        }
        if ((i & 128) != 0) {
            z = song.isAsmr;
        }
        ArtistBrief artistBrief2 = artistBrief;
        boolean z2 = z;
        String str6 = str4;
        String str7 = str5;
        return song.copy(str, str2, str3, num, str6, str7, artistBrief2, z2);
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

    /* renamed from: component7, reason: from getter */
    public final ArtistBrief getArtist() {
        return this.artist;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAsmr() {
        return this.isAsmr;
    }

    public final Song copy(String musicId, String songName, String songStyle, Integer songDuration, String coverPath, String audioPath, ArtistBrief artist, boolean isAsmr) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        Intrinsics.checkNotNullParameter(artist, "artist");
        return new Song(musicId, songName, songStyle, songDuration, coverPath, audioPath, artist, isAsmr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Song)) {
            return false;
        }
        Song song = (Song) other;
        return Intrinsics.areEqual(this.musicId, song.musicId) && Intrinsics.areEqual(this.songName, song.songName) && Intrinsics.areEqual(this.songStyle, song.songStyle) && Intrinsics.areEqual(this.songDuration, song.songDuration) && Intrinsics.areEqual(this.coverPath, song.coverPath) && Intrinsics.areEqual(this.audioPath, song.audioPath) && Intrinsics.areEqual(this.artist, song.artist) && this.isAsmr == song.isAsmr;
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
        return ((((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.artist.hashCode()) * 31) + Boolean.hashCode(this.isAsmr);
    }

    public String toString() {
        return "Song(musicId=" + this.musicId + ", songName=" + this.songName + ", songStyle=" + this.songStyle + ", songDuration=" + this.songDuration + ", coverPath=" + this.coverPath + ", audioPath=" + this.audioPath + ", artist=" + this.artist + ", isAsmr=" + this.isAsmr + Separators.RPAREN;
    }

    public Song(String musicId, String songName, String str, Integer num, String str2, String str3, ArtistBrief artist, boolean z) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        Intrinsics.checkNotNullParameter(artist, "artist");
        this.musicId = musicId;
        this.songName = songName;
        this.songStyle = str;
        this.songDuration = num;
        this.coverPath = str2;
        this.audioPath = str3;
        this.artist = artist;
        this.isAsmr = z;
    }

    public /* synthetic */ Song(String str, String str2, String str3, Integer num, String str4, String str5, ArtistBrief artistBrief, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null, (i & 64) != 0 ? new ArtistBrief(0, null, null, null, null, null, null, null, 255, null) : artistBrief, (i & 128) != 0 ? false : z);
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

    public final ArtistBrief getArtist() {
        return this.artist;
    }

    public final boolean isAsmr() {
        return this.isAsmr;
    }

    public final String artistName() {
        return this.artist.displayName();
    }
}
