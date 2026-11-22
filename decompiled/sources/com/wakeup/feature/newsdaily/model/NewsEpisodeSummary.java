package com.wakeup.feature.newsdaily.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/feature/newsdaily/model/NewsEpisodeSummary;", "", "episodeId", "", "date", "title", "summary", "durationMs", "", "audioUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getEpisodeId", "()Ljava/lang/String;", "getDate", "getTitle", "getSummary", "getDurationMs", "()J", "getAudioUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NewsEpisodeSummary {
    private final String audioUrl;
    private final String date;
    private final long durationMs;
    private final String episodeId;
    private final String summary;
    private final String title;

    public NewsEpisodeSummary() {
        this(null, null, null, null, 0L, null, 63, null);
    }

    public static /* synthetic */ NewsEpisodeSummary copy$default(NewsEpisodeSummary newsEpisodeSummary, String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsEpisodeSummary.episodeId;
        }
        if ((i & 2) != 0) {
            str2 = newsEpisodeSummary.date;
        }
        if ((i & 4) != 0) {
            str3 = newsEpisodeSummary.title;
        }
        if ((i & 8) != 0) {
            str4 = newsEpisodeSummary.summary;
        }
        if ((i & 16) != 0) {
            j = newsEpisodeSummary.durationMs;
        }
        if ((i & 32) != 0) {
            str5 = newsEpisodeSummary.audioUrl;
        }
        String str6 = str5;
        long j2 = j;
        return newsEpisodeSummary.copy(str, str2, str3, str4, j2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEpisodeId() {
        return this.episodeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final NewsEpisodeSummary copy(String episodeId, String date, String title, String summary, long durationMs, String audioUrl) {
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        return new NewsEpisodeSummary(episodeId, date, title, summary, durationMs, audioUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsEpisodeSummary)) {
            return false;
        }
        NewsEpisodeSummary newsEpisodeSummary = (NewsEpisodeSummary) other;
        return Intrinsics.areEqual(this.episodeId, newsEpisodeSummary.episodeId) && Intrinsics.areEqual(this.date, newsEpisodeSummary.date) && Intrinsics.areEqual(this.title, newsEpisodeSummary.title) && Intrinsics.areEqual(this.summary, newsEpisodeSummary.summary) && this.durationMs == newsEpisodeSummary.durationMs && Intrinsics.areEqual(this.audioUrl, newsEpisodeSummary.audioUrl);
    }

    public int hashCode() {
        int hashCode = ((((this.episodeId.hashCode() * 31) + this.date.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.summary;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.durationMs)) * 31;
        String str2 = this.audioUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NewsEpisodeSummary(episodeId=" + this.episodeId + ", date=" + this.date + ", title=" + this.title + ", summary=" + this.summary + ", durationMs=" + this.durationMs + ", audioUrl=" + this.audioUrl + Separators.RPAREN;
    }

    public NewsEpisodeSummary(String episodeId, String date, String title, String str, long j, String str2) {
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        this.episodeId = episodeId;
        this.date = date;
        this.title = title;
        this.summary = str;
        this.durationMs = j;
        this.audioUrl = str2;
    }

    public /* synthetic */ NewsEpisodeSummary(String str, String str2, String str3, String str4, long j, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str5);
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }
}
