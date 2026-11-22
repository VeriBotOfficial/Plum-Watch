package io.agora.musiccontentcenter;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class Music {
    public ClimaxSegment[] climaxSegments;
    public int durationS;
    public int[] lyricTypes;
    public MvProperty[] mvProperties;
    public String name;
    public int pitchType;
    public String poster;
    public String releaseTime;
    public String singer;
    public long songCode;
    public int type;

    public Music() {
    }

    public Music(long songCode, String name, String singer, String poster, String releaseTime, int type, int pitchType, int durationS, int[] lyricTypes, MvProperty[] mvProperties, ClimaxSegment[] climaxSegments) {
        this.songCode = songCode;
        this.name = name;
        this.singer = singer;
        this.poster = poster;
        this.releaseTime = releaseTime;
        this.type = type;
        this.pitchType = pitchType;
        this.durationS = durationS;
        this.lyricTypes = lyricTypes;
        this.mvProperties = mvProperties;
        this.climaxSegments = climaxSegments;
    }

    public ClimaxSegment[] getClimaxSegments() {
        return this.climaxSegments;
    }

    public int getDurationS() {
        return this.durationS;
    }

    public int[] getLyricTypes() {
        return this.lyricTypes;
    }

    public MvProperty[] getMvProperties() {
        return this.mvProperties;
    }

    public String getName() {
        return this.name;
    }

    public int getPitchType() {
        return this.pitchType;
    }

    public String getPoster() {
        return this.poster;
    }

    public String getReleaseTime() {
        return this.releaseTime;
    }

    public String getSinger() {
        return this.singer;
    }

    public long getSongCode() {
        return this.songCode;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "Music{songCode=" + this.songCode + ", name='" + this.name + "', singer='" + this.singer + "', poster='" + this.poster + "', releaseTime='" + this.releaseTime + "', type=" + this.type + ", pitchType=" + this.pitchType + ", durationS=" + this.durationS + ", lyricTypes=" + Arrays.toString(this.lyricTypes) + ", mvProperties=" + Arrays.toString(this.mvProperties) + ", climaxSegments=" + Arrays.toString(this.climaxSegments) + AbstractJsonLexerKt.END_OBJ;
    }
}
