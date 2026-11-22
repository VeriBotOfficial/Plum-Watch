package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentCard.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/aimusic/model/RecentCard;", "", "source", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSource", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "isRecent", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecentCard {
    public static final String SOURCE_RECENT = "recent";
    public static final String SOURCE_WEEKLY_HOT = "weekly_hot";

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Song> items;

    @SerializedName("source")
    private final String source;

    /* JADX WARN: Multi-variable type inference failed */
    public RecentCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentCard copy$default(RecentCard recentCard, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentCard.source;
        }
        if ((i & 2) != 0) {
            list = recentCard.items;
        }
        return recentCard.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<Song> component2() {
        return this.items;
    }

    public final RecentCard copy(String source, List<Song> items) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(items, "items");
        return new RecentCard(source, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentCard)) {
            return false;
        }
        RecentCard recentCard = (RecentCard) other;
        return Intrinsics.areEqual(this.source, recentCard.source) && Intrinsics.areEqual(this.items, recentCard.items);
    }

    public int hashCode() {
        return (this.source.hashCode() * 31) + this.items.hashCode();
    }

    public String toString() {
        return "RecentCard(source=" + this.source + ", items=" + this.items + Separators.RPAREN;
    }

    public RecentCard(String source, List<Song> items) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(items, "items");
        this.source = source;
        this.items = items;
    }

    public /* synthetic */ RecentCard(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SOURCE_WEEKLY_HOT : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getSource() {
        return this.source;
    }

    public final List<Song> getItems() {
        return this.items;
    }

    public final boolean isRecent() {
        return Intrinsics.areEqual(this.source, SOURCE_RECENT);
    }
}
