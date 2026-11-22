package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.wakeup.feature.aimusic.util.CoverUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AsmrPlaylist.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/wakeup/feature/aimusic/model/AsmrPlaylist;", "", "playlistId", "", "title", "coverPath", "thumbnailPath", "itemCount", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/aimusic/model/AsmrItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getPlaylistId", "()Ljava/lang/String;", "getTitle", "getCoverPath", "getThumbnailPath", "getItemCount", "()I", "getItems", "()Ljava/util/List;", "displayCoverPath", "toAiPlaylist", "Lcom/wakeup/feature/aimusic/model/AiPlaylist;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsmrPlaylist {

    @SerializedName("cover_path")
    private final String coverPath;

    @SerializedName("item_count")
    private final int itemCount;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<AsmrItem> items;

    @SerializedName("playlist_id")
    private final String playlistId;

    @SerializedName("thumbnail_path")
    private final String thumbnailPath;

    @SerializedName("title")
    private final String title;

    public AsmrPlaylist() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ AsmrPlaylist copy$default(AsmrPlaylist asmrPlaylist, String str, String str2, String str3, String str4, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = asmrPlaylist.playlistId;
        }
        if ((i2 & 2) != 0) {
            str2 = asmrPlaylist.title;
        }
        if ((i2 & 4) != 0) {
            str3 = asmrPlaylist.coverPath;
        }
        if ((i2 & 8) != 0) {
            str4 = asmrPlaylist.thumbnailPath;
        }
        if ((i2 & 16) != 0) {
            i = asmrPlaylist.itemCount;
        }
        if ((i2 & 32) != 0) {
            list = asmrPlaylist.items;
        }
        int i3 = i;
        List list2 = list;
        return asmrPlaylist.copy(str, str2, str3, str4, i3, list2);
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
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    /* renamed from: component5, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    public final List<AsmrItem> component6() {
        return this.items;
    }

    public final AsmrPlaylist copy(String playlistId, String title, String coverPath, String thumbnailPath, int itemCount, List<AsmrItem> items) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new AsmrPlaylist(playlistId, title, coverPath, thumbnailPath, itemCount, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsmrPlaylist)) {
            return false;
        }
        AsmrPlaylist asmrPlaylist = (AsmrPlaylist) other;
        return Intrinsics.areEqual(this.playlistId, asmrPlaylist.playlistId) && Intrinsics.areEqual(this.title, asmrPlaylist.title) && Intrinsics.areEqual(this.coverPath, asmrPlaylist.coverPath) && Intrinsics.areEqual(this.thumbnailPath, asmrPlaylist.thumbnailPath) && this.itemCount == asmrPlaylist.itemCount && Intrinsics.areEqual(this.items, asmrPlaylist.items);
    }

    public int hashCode() {
        int hashCode = ((this.playlistId.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.coverPath;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbnailPath;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.itemCount)) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "AsmrPlaylist(playlistId=" + this.playlistId + ", title=" + this.title + ", coverPath=" + this.coverPath + ", thumbnailPath=" + this.thumbnailPath + ", itemCount=" + this.itemCount + ", items=" + this.items + Separators.RPAREN;
    }

    public AsmrPlaylist(String playlistId, String title, String str, String str2, int i, List<AsmrItem> items) {
        Intrinsics.checkNotNullParameter(playlistId, "playlistId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.playlistId = playlistId;
        this.title = title;
        this.coverPath = str;
        this.thumbnailPath = str2;
        this.itemCount = i;
        this.items = items;
    }

    public /* synthetic */ AsmrPlaylist(String str, String str2, String str3, String str4, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list);
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

    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    public final List<AsmrItem> getItems() {
        return this.items;
    }

    public final String displayCoverPath() {
        String str = this.thumbnailPath;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = this.coverPath;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return str2;
    }

    public final AiPlaylist toAiPlaylist() {
        String str = this.playlistId;
        String str2 = this.title;
        int gradientFor = CoverUtils.INSTANCE.gradientFor(this.playlistId);
        String displayCoverPath = displayCoverPath();
        List<AsmrItem> list = this.items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AsmrItem) it.next()).toSong());
        }
        return new AiPlaylist(str, str2, gradientFor, displayCoverPath, arrayList, this.itemCount, false, true, 64, null);
    }
}
