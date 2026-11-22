package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportSongInfoBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\u008b\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\nHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%¨\u0006G"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportSongInfoBean;", "", "musicId", "", "musicName", "", "singer", "cover", "filePath", "memberEnable", "", "source", "duration", "summary", "style", "label", "playNumber", "showed", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;II)V", "getMusicId", "()J", "setMusicId", "(J)V", "getMusicName", "()Ljava/lang/String;", "setMusicName", "(Ljava/lang/String;)V", "getSinger", "setSinger", "getCover", "setCover", "getFilePath", "setFilePath", "getMemberEnable", "()I", "setMemberEnable", "(I)V", "getSource", "setSource", "getDuration", "setDuration", "getSummary", "setSummary", "getStyle", "setStyle", "getLabel", "setLabel", "getPlayNumber", "setPlayNumber", "getShowed", "setShowed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SportSongInfoBean {
    private String cover;
    private int duration;
    private String filePath;
    private String label;
    private int memberEnable;
    private long musicId;
    private String musicName;
    private int playNumber;
    private int showed;
    private String singer;
    private String source;
    private int style;
    private String summary;

    public SportSongInfoBean() {
        this(0L, null, null, null, null, 0, null, 0, null, 0, null, 0, 0, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMusicId() {
        return this.musicId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component12, reason: from getter */
    public final int getPlayNumber() {
        return this.playNumber;
    }

    /* renamed from: component13, reason: from getter */
    public final int getShowed() {
        return this.showed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMusicName() {
        return this.musicName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSinger() {
        return this.singer;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMemberEnable() {
        return this.memberEnable;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final SportSongInfoBean copy(long musicId, String musicName, String singer, String cover, String filePath, int memberEnable, String source, int duration, String summary, int style, String label, int playNumber, int showed) {
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(label, "label");
        return new SportSongInfoBean(musicId, musicName, singer, cover, filePath, memberEnable, source, duration, summary, style, label, playNumber, showed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportSongInfoBean)) {
            return false;
        }
        SportSongInfoBean sportSongInfoBean = (SportSongInfoBean) other;
        return this.musicId == sportSongInfoBean.musicId && Intrinsics.areEqual(this.musicName, sportSongInfoBean.musicName) && Intrinsics.areEqual(this.singer, sportSongInfoBean.singer) && Intrinsics.areEqual(this.cover, sportSongInfoBean.cover) && Intrinsics.areEqual(this.filePath, sportSongInfoBean.filePath) && this.memberEnable == sportSongInfoBean.memberEnable && Intrinsics.areEqual(this.source, sportSongInfoBean.source) && this.duration == sportSongInfoBean.duration && Intrinsics.areEqual(this.summary, sportSongInfoBean.summary) && this.style == sportSongInfoBean.style && Intrinsics.areEqual(this.label, sportSongInfoBean.label) && this.playNumber == sportSongInfoBean.playNumber && this.showed == sportSongInfoBean.showed;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.musicId) * 31) + this.musicName.hashCode()) * 31) + this.singer.hashCode()) * 31) + this.cover.hashCode()) * 31) + this.filePath.hashCode()) * 31) + Integer.hashCode(this.memberEnable)) * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.style)) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.playNumber)) * 31) + Integer.hashCode(this.showed);
    }

    public String toString() {
        return "SportSongInfoBean(musicId=" + this.musicId + ", musicName=" + this.musicName + ", singer=" + this.singer + ", cover=" + this.cover + ", filePath=" + this.filePath + ", memberEnable=" + this.memberEnable + ", source=" + this.source + ", duration=" + this.duration + ", summary=" + this.summary + ", style=" + this.style + ", label=" + this.label + ", playNumber=" + this.playNumber + ", showed=" + this.showed + Separators.RPAREN;
    }

    public SportSongInfoBean(long j, String musicName, String singer, String cover, String filePath, int i, String source, int i2, String summary, int i3, String label, int i4, int i5) {
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(label, "label");
        this.musicId = j;
        this.musicName = musicName;
        this.singer = singer;
        this.cover = cover;
        this.filePath = filePath;
        this.memberEnable = i;
        this.source = source;
        this.duration = i2;
        this.summary = summary;
        this.style = i3;
        this.label = label;
        this.playNumber = i4;
        this.showed = i5;
    }

    public /* synthetic */ SportSongInfoBean(long j, String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, String str7, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? "" : str5, (i6 & 128) != 0 ? 0 : i2, (i6 & 256) != 0 ? "" : str6, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) == 0 ? str7 : "", (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? 0 : i5);
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final void setMusicId(long j) {
        this.musicId = j;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final void setMusicName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.musicName = str;
    }

    public final String getSinger() {
        return this.singer;
    }

    public final void setSinger(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.singer = str;
    }

    public final String getCover() {
        return this.cover;
    }

    public final void setCover(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cover = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filePath = str;
    }

    public final int getMemberEnable() {
        return this.memberEnable;
    }

    public final void setMemberEnable(int i) {
        this.memberEnable = i;
    }

    public final String getSource() {
        return this.source;
    }

    public final void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summary = str;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final String getLabel() {
        return this.label;
    }

    public final void setLabel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.label = str;
    }

    public final int getPlayNumber() {
        return this.playNumber;
    }

    public final void setPlayNumber(int i) {
        this.playNumber = i;
    }

    public final int getShowed() {
        return this.showed;
    }

    public final void setShowed(int i) {
        this.showed = i;
    }
}
