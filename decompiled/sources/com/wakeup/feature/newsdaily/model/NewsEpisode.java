package com.wakeup.feature.newsdaily.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsModels.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jg\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/wakeup/feature/newsdaily/model/NewsEpisode;", "", "episodeId", "", "date", "title", "summary", "body", "durationMs", "", "audioUrl", "transcript", "", "Lcom/wakeup/feature/newsdaily/model/TranscriptLine;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getEpisodeId", "()Ljava/lang/String;", "getDate", "getTitle", "getSummary", "getBody", "getDurationMs", "()J", "getAudioUrl", "getTranscript", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NewsEpisode {
    private final String audioUrl;
    private final String body;
    private final String date;
    private final long durationMs;
    private final String episodeId;
    private final String summary;
    private final String title;
    private final List<TranscriptLine> transcript;

    public NewsEpisode() {
        this(null, null, null, null, null, 0L, null, null, 255, null);
    }

    public static /* synthetic */ NewsEpisode copy$default(NewsEpisode newsEpisode, String str, String str2, String str3, String str4, String str5, long j, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsEpisode.episodeId;
        }
        if ((i & 2) != 0) {
            str2 = newsEpisode.date;
        }
        if ((i & 4) != 0) {
            str3 = newsEpisode.title;
        }
        if ((i & 8) != 0) {
            str4 = newsEpisode.summary;
        }
        if ((i & 16) != 0) {
            str5 = newsEpisode.body;
        }
        if ((i & 32) != 0) {
            j = newsEpisode.durationMs;
        }
        if ((i & 64) != 0) {
            str6 = newsEpisode.audioUrl;
        }
        if ((i & 128) != 0) {
            list = newsEpisode.transcript;
        }
        long j2 = j;
        String str7 = str4;
        String str8 = str5;
        String str9 = str3;
        return newsEpisode.copy(str, str2, str9, str7, str8, j2, str6, list);
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
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final List<TranscriptLine> component8() {
        return this.transcript;
    }

    public final NewsEpisode copy(String episodeId, String date, String title, String summary, String body, long durationMs, String audioUrl, List<TranscriptLine> transcript) {
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        return new NewsEpisode(episodeId, date, title, summary, body, durationMs, audioUrl, transcript);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsEpisode)) {
            return false;
        }
        NewsEpisode newsEpisode = (NewsEpisode) other;
        return Intrinsics.areEqual(this.episodeId, newsEpisode.episodeId) && Intrinsics.areEqual(this.date, newsEpisode.date) && Intrinsics.areEqual(this.title, newsEpisode.title) && Intrinsics.areEqual(this.summary, newsEpisode.summary) && Intrinsics.areEqual(this.body, newsEpisode.body) && this.durationMs == newsEpisode.durationMs && Intrinsics.areEqual(this.audioUrl, newsEpisode.audioUrl) && Intrinsics.areEqual(this.transcript, newsEpisode.transcript);
    }

    public int hashCode() {
        int hashCode = ((((this.episodeId.hashCode() * 31) + this.date.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.summary;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.durationMs)) * 31;
        String str3 = this.audioUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<TranscriptLine> list = this.transcript;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "NewsEpisode(episodeId=" + this.episodeId + ", date=" + this.date + ", title=" + this.title + ", summary=" + this.summary + ", body=" + this.body + ", durationMs=" + this.durationMs + ", audioUrl=" + this.audioUrl + ", transcript=" + this.transcript + Separators.RPAREN;
    }

    public NewsEpisode(String episodeId, String date, String title, String str, String str2, long j, String str3, List<TranscriptLine> list) {
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        this.episodeId = episodeId;
        this.date = date;
        this.title = title;
        this.summary = str;
        this.body = str2;
        this.durationMs = j;
        this.audioUrl = str3;
        this.transcript = list;
    }

    public /* synthetic */ NewsEpisode(String str, String str2, String str3, String str4, String str5, long j, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list);
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

    public final String getBody() {
        return this.body;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final List<TranscriptLine> getTranscript() {
        return this.transcript;
    }
}
