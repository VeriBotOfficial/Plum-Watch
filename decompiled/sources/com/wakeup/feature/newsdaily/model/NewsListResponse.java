package com.wakeup.feature.newsdaily.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/newsdaily/model/NewsListResponse;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/wakeup/feature/newsdaily/model/NewsEpisodeSummary;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NewsListResponse {
    private final List<NewsEpisodeSummary> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsListResponse copy$default(NewsListResponse newsListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsListResponse.items;
        }
        return newsListResponse.copy(list);
    }

    public final List<NewsEpisodeSummary> component1() {
        return this.items;
    }

    public final NewsListResponse copy(List<NewsEpisodeSummary> items) {
        return new NewsListResponse(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewsListResponse) && Intrinsics.areEqual(this.items, ((NewsListResponse) other).items);
    }

    public int hashCode() {
        List<NewsEpisodeSummary> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "NewsListResponse(items=" + this.items + Separators.RPAREN;
    }

    public NewsListResponse(List<NewsEpisodeSummary> list) {
        this.items = list;
    }

    public /* synthetic */ NewsListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<NewsEpisodeSummary> getItems() {
        return this.items;
    }
}
