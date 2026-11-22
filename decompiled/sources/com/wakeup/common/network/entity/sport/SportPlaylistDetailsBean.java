package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportPlaylistDetailsBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003JO\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006/"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportPlaylistDetailsBean;", "", "favoritesId", "", "favoritesName", "", "cover", "summary", Const.SP_KEY_CALL_LOC_COUNT, "", "locale", "musicList", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getFavoritesId", "()J", "setFavoritesId", "(J)V", "getFavoritesName", "()Ljava/lang/String;", "setFavoritesName", "(Ljava/lang/String;)V", "getCover", "setCover", "getSummary", "setSummary", "getCount", "()I", "setCount", "(I)V", "getLocale", "setLocale", "getMusicList", "setMusicList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SportPlaylistDetailsBean {
    private int count;
    private String cover;
    private long favoritesId;
    private String favoritesName;
    private String locale;
    private String musicList;
    private String summary;

    public SportPlaylistDetailsBean() {
        this(0L, null, null, null, 0, null, null, 127, null);
    }

    public static /* synthetic */ SportPlaylistDetailsBean copy$default(SportPlaylistDetailsBean sportPlaylistDetailsBean, long j, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = sportPlaylistDetailsBean.favoritesId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = sportPlaylistDetailsBean.favoritesName;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = sportPlaylistDetailsBean.cover;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = sportPlaylistDetailsBean.summary;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            i = sportPlaylistDetailsBean.count;
        }
        return sportPlaylistDetailsBean.copy(j2, str6, str7, str8, i, (i2 & 32) != 0 ? sportPlaylistDetailsBean.locale : str4, (i2 & 64) != 0 ? sportPlaylistDetailsBean.musicList : str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFavoritesId() {
        return this.favoritesId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFavoritesName() {
        return this.favoritesName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMusicList() {
        return this.musicList;
    }

    public final SportPlaylistDetailsBean copy(long favoritesId, String favoritesName, String cover, String summary, int count, String locale, String musicList) {
        Intrinsics.checkNotNullParameter(favoritesName, "favoritesName");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        return new SportPlaylistDetailsBean(favoritesId, favoritesName, cover, summary, count, locale, musicList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportPlaylistDetailsBean)) {
            return false;
        }
        SportPlaylistDetailsBean sportPlaylistDetailsBean = (SportPlaylistDetailsBean) other;
        return this.favoritesId == sportPlaylistDetailsBean.favoritesId && Intrinsics.areEqual(this.favoritesName, sportPlaylistDetailsBean.favoritesName) && Intrinsics.areEqual(this.cover, sportPlaylistDetailsBean.cover) && Intrinsics.areEqual(this.summary, sportPlaylistDetailsBean.summary) && this.count == sportPlaylistDetailsBean.count && Intrinsics.areEqual(this.locale, sportPlaylistDetailsBean.locale) && Intrinsics.areEqual(this.musicList, sportPlaylistDetailsBean.musicList);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.favoritesId) * 31) + this.favoritesName.hashCode()) * 31) + this.cover.hashCode()) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.locale.hashCode()) * 31) + this.musicList.hashCode();
    }

    public String toString() {
        return "SportPlaylistDetailsBean(favoritesId=" + this.favoritesId + ", favoritesName=" + this.favoritesName + ", cover=" + this.cover + ", summary=" + this.summary + ", count=" + this.count + ", locale=" + this.locale + ", musicList=" + this.musicList + Separators.RPAREN;
    }

    public SportPlaylistDetailsBean(long j, String favoritesName, String cover, String summary, int i, String locale, String musicList) {
        Intrinsics.checkNotNullParameter(favoritesName, "favoritesName");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        this.favoritesId = j;
        this.favoritesName = favoritesName;
        this.cover = cover;
        this.summary = summary;
        this.count = i;
        this.locale = locale;
        this.musicList = musicList;
    }

    public /* synthetic */ SportPlaylistDetailsBean(long j, String str, String str2, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5);
    }

    public final long getFavoritesId() {
        return this.favoritesId;
    }

    public final void setFavoritesId(long j) {
        this.favoritesId = j;
    }

    public final String getFavoritesName() {
        return this.favoritesName;
    }

    public final void setFavoritesName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.favoritesName = str;
    }

    public final String getCover() {
        return this.cover;
    }

    public final void setCover(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cover = str;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summary = str;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final void setLocale(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locale = str;
    }

    public final String getMusicList() {
        return this.musicList;
    }

    public final void setMusicList(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.musicList = str;
    }
}
