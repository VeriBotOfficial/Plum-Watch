package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportAlbumInfoBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportAlbumInfoBean;", "", "favoritesName", "", "cover", "summary", Const.SP_KEY_CALL_LOC_COUNT, "", "musicList", "", "Lcom/wakeup/common/network/entity/sport/SportSongInfoBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getFavoritesName", "()Ljava/lang/String;", "setFavoritesName", "(Ljava/lang/String;)V", "getCover", "setCover", "getSummary", "setSummary", "getCount", "()I", "setCount", "(I)V", "getMusicList", "()Ljava/util/List;", "setMusicList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SportAlbumInfoBean {
    private int count;
    private String cover;
    private String favoritesName;
    private List<SportSongInfoBean> musicList;
    private String summary;

    public SportAlbumInfoBean() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ SportAlbumInfoBean copy$default(SportAlbumInfoBean sportAlbumInfoBean, String str, String str2, String str3, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sportAlbumInfoBean.favoritesName;
        }
        if ((i2 & 2) != 0) {
            str2 = sportAlbumInfoBean.cover;
        }
        if ((i2 & 4) != 0) {
            str3 = sportAlbumInfoBean.summary;
        }
        if ((i2 & 8) != 0) {
            i = sportAlbumInfoBean.count;
        }
        if ((i2 & 16) != 0) {
            list = sportAlbumInfoBean.musicList;
        }
        List list2 = list;
        String str4 = str3;
        return sportAlbumInfoBean.copy(str, str2, str4, i, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFavoritesName() {
        return this.favoritesName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<SportSongInfoBean> component5() {
        return this.musicList;
    }

    public final SportAlbumInfoBean copy(String favoritesName, String cover, String summary, int count, List<SportSongInfoBean> musicList) {
        Intrinsics.checkNotNullParameter(favoritesName, "favoritesName");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        return new SportAlbumInfoBean(favoritesName, cover, summary, count, musicList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportAlbumInfoBean)) {
            return false;
        }
        SportAlbumInfoBean sportAlbumInfoBean = (SportAlbumInfoBean) other;
        return Intrinsics.areEqual(this.favoritesName, sportAlbumInfoBean.favoritesName) && Intrinsics.areEqual(this.cover, sportAlbumInfoBean.cover) && Intrinsics.areEqual(this.summary, sportAlbumInfoBean.summary) && this.count == sportAlbumInfoBean.count && Intrinsics.areEqual(this.musicList, sportAlbumInfoBean.musicList);
    }

    public int hashCode() {
        return (((((((this.favoritesName.hashCode() * 31) + this.cover.hashCode()) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.musicList.hashCode();
    }

    public String toString() {
        return "SportAlbumInfoBean(favoritesName=" + this.favoritesName + ", cover=" + this.cover + ", summary=" + this.summary + ", count=" + this.count + ", musicList=" + this.musicList + Separators.RPAREN;
    }

    public SportAlbumInfoBean(String favoritesName, String cover, String summary, int i, List<SportSongInfoBean> musicList) {
        Intrinsics.checkNotNullParameter(favoritesName, "favoritesName");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(musicList, "musicList");
        this.favoritesName = favoritesName;
        this.cover = cover;
        this.summary = summary;
        this.count = i;
        this.musicList = musicList;
    }

    public /* synthetic */ SportAlbumInfoBean(String str, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list);
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

    public final List<SportSongInfoBean> getMusicList() {
        return this.musicList;
    }

    public final void setMusicList(List<SportSongInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.musicList = list;
    }
}
