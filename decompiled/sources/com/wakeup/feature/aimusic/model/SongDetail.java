package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SongDetail.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u0096\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lcom/wakeup/feature/aimusic/model/SongDetail;", "", "musicId", "", "songName", "songStyle", "songLanguage", "songDuration", "", "songTheme", "lyrics", "coverPath", "audioPath", "lrcPath", "favorited", "", "artist", "Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/wakeup/feature/aimusic/model/ArtistBrief;)V", "getMusicId", "()Ljava/lang/String;", "getSongName", "getSongStyle", "getSongLanguage", "getSongDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSongTheme", "getLyrics", "getCoverPath", "getAudioPath", "getLrcPath", "getFavorited", "()Z", "getArtist", "()Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/wakeup/feature/aimusic/model/ArtistBrief;)Lcom/wakeup/feature/aimusic/model/SongDetail;", "equals", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SongDetail {

    @SerializedName("artist")
    private final ArtistBrief artist;

    @SerializedName("audio_path")
    private final String audioPath;

    @SerializedName("cover_path")
    private final String coverPath;

    @SerializedName("favorited")
    private final boolean favorited;

    @SerializedName("lrc_path")
    private final String lrcPath;

    @SerializedName("lyrics")
    private final String lyrics;

    @SerializedName("music_id")
    private final String musicId;

    @SerializedName("song_duration")
    private final Integer songDuration;

    @SerializedName("song_language")
    private final String songLanguage;

    @SerializedName("song_name")
    private final String songName;

    @SerializedName("song_style")
    private final String songStyle;

    @SerializedName("song_theme")
    private final String songTheme;

    public SongDetail() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    public static /* synthetic */ SongDetail copy$default(SongDetail songDetail, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, boolean z, ArtistBrief artistBrief, int i, Object obj) {
        if ((i & 1) != 0) {
            str = songDetail.musicId;
        }
        if ((i & 2) != 0) {
            str2 = songDetail.songName;
        }
        if ((i & 4) != 0) {
            str3 = songDetail.songStyle;
        }
        if ((i & 8) != 0) {
            str4 = songDetail.songLanguage;
        }
        if ((i & 16) != 0) {
            num = songDetail.songDuration;
        }
        if ((i & 32) != 0) {
            str5 = songDetail.songTheme;
        }
        if ((i & 64) != 0) {
            str6 = songDetail.lyrics;
        }
        if ((i & 128) != 0) {
            str7 = songDetail.coverPath;
        }
        if ((i & 256) != 0) {
            str8 = songDetail.audioPath;
        }
        if ((i & 512) != 0) {
            str9 = songDetail.lrcPath;
        }
        if ((i & 1024) != 0) {
            z = songDetail.favorited;
        }
        if ((i & 2048) != 0) {
            artistBrief = songDetail.artist;
        }
        boolean z2 = z;
        ArtistBrief artistBrief2 = artistBrief;
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        Integer num2 = num;
        String str14 = str5;
        return songDetail.copy(str, str2, str3, str4, num2, str14, str12, str13, str10, str11, z2, artistBrief2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMusicId() {
        return this.musicId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLrcPath() {
        return this.lrcPath;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getFavorited() {
        return this.favorited;
    }

    /* renamed from: component12, reason: from getter */
    public final ArtistBrief getArtist() {
        return this.artist;
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
    public final String getSongLanguage() {
        return this.songLanguage;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSongDuration() {
        return this.songDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSongTheme() {
        return this.songTheme;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLyrics() {
        return this.lyrics;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCoverPath() {
        return this.coverPath;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAudioPath() {
        return this.audioPath;
    }

    public final SongDetail copy(String musicId, String songName, String songStyle, String songLanguage, Integer songDuration, String songTheme, String lyrics, String coverPath, String audioPath, String lrcPath, boolean favorited, ArtistBrief artist) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        Intrinsics.checkNotNullParameter(artist, "artist");
        return new SongDetail(musicId, songName, songStyle, songLanguage, songDuration, songTheme, lyrics, coverPath, audioPath, lrcPath, favorited, artist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SongDetail)) {
            return false;
        }
        SongDetail songDetail = (SongDetail) other;
        return Intrinsics.areEqual(this.musicId, songDetail.musicId) && Intrinsics.areEqual(this.songName, songDetail.songName) && Intrinsics.areEqual(this.songStyle, songDetail.songStyle) && Intrinsics.areEqual(this.songLanguage, songDetail.songLanguage) && Intrinsics.areEqual(this.songDuration, songDetail.songDuration) && Intrinsics.areEqual(this.songTheme, songDetail.songTheme) && Intrinsics.areEqual(this.lyrics, songDetail.lyrics) && Intrinsics.areEqual(this.coverPath, songDetail.coverPath) && Intrinsics.areEqual(this.audioPath, songDetail.audioPath) && Intrinsics.areEqual(this.lrcPath, songDetail.lrcPath) && this.favorited == songDetail.favorited && Intrinsics.areEqual(this.artist, songDetail.artist);
    }

    public int hashCode() {
        int hashCode = ((this.musicId.hashCode() * 31) + this.songName.hashCode()) * 31;
        String str = this.songStyle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.songLanguage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.songDuration;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.songTheme;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lyrics;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.coverPath;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.audioPath;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lrcPath;
        return ((((hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.favorited)) * 31) + this.artist.hashCode();
    }

    public String toString() {
        return "SongDetail(musicId=" + this.musicId + ", songName=" + this.songName + ", songStyle=" + this.songStyle + ", songLanguage=" + this.songLanguage + ", songDuration=" + this.songDuration + ", songTheme=" + this.songTheme + ", lyrics=" + this.lyrics + ", coverPath=" + this.coverPath + ", audioPath=" + this.audioPath + ", lrcPath=" + this.lrcPath + ", favorited=" + this.favorited + ", artist=" + this.artist + Separators.RPAREN;
    }

    public SongDetail(String musicId, String songName, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, boolean z, ArtistBrief artist) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        Intrinsics.checkNotNullParameter(songName, "songName");
        Intrinsics.checkNotNullParameter(artist, "artist");
        this.musicId = musicId;
        this.songName = songName;
        this.songStyle = str;
        this.songLanguage = str2;
        this.songDuration = num;
        this.songTheme = str3;
        this.lyrics = str4;
        this.coverPath = str5;
        this.audioPath = str6;
        this.lrcPath = str7;
        this.favorited = z;
        this.artist = artist;
    }

    public /* synthetic */ SongDetail(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, boolean z, ArtistBrief artistBrief, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? new ArtistBrief(0, null, null, null, null, null, null, null, 255, null) : artistBrief);
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

    public final String getSongLanguage() {
        return this.songLanguage;
    }

    public final Integer getSongDuration() {
        return this.songDuration;
    }

    public final String getSongTheme() {
        return this.songTheme;
    }

    public final String getLyrics() {
        return this.lyrics;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getLrcPath() {
        return this.lrcPath;
    }

    public final boolean getFavorited() {
        return this.favorited;
    }

    public final ArtistBrief getArtist() {
        return this.artist;
    }
}
