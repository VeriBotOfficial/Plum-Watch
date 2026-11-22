package com.wakeup.feature.health.sleep;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wakeup.common.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepDetailUi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\tHÆ\u0003J\t\u0010W\u001a\u00020 HÆ\u0003J\u0085\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001J\u0013\u0010X\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u0003HÖ\u0001J\t\u0010[\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006\\"}, d2 = {"Lcom/wakeup/feature/health/sleep/SleepDetailUi;", "", "tab", "", "hasData", "", a.C0193a.l, Constants.BundleKey.MINUTE, "dateLabel", "", "showTimeline", "fallDate", "fallClock", "wakeDate", "wakeClock", "segments", "", "Lcom/wakeup/feature/health/sleep/SleepSegment;", "bars", "Lcom/wakeup/feature/health/sleep/SleepBar;", "showScore", FirebaseAnalytics.Param.SCORE, "beatText", "copy", "deepMin", "lightMin", "awakeMin", "deepPercent", "lightPercent", "awakePercent", "nightStatus", "nightStatusColor", "", "<init>", "(IZIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZILjava/lang/String;Ljava/lang/String;IIIIIILjava/lang/String;J)V", "getTab", "()I", "getHasData", "()Z", "getHour", "getMinute", "getDateLabel", "()Ljava/lang/String;", "getShowTimeline", "getFallDate", "getFallClock", "getWakeDate", "getWakeClock", "getSegments", "()Ljava/util/List;", "getBars", "getShowScore", "getScore", "getBeatText", "getCopy", "getDeepMin", "getLightMin", "getAwakeMin", "getDeepPercent", "getLightPercent", "getAwakePercent", "getNightStatus", "getNightStatusColor", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "equals", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepDetailUi {
    public static final int $stable = 8;
    private final int awakeMin;
    private final int awakePercent;
    private final List<SleepBar> bars;
    private final String beatText;
    private final String copy;
    private final String dateLabel;
    private final int deepMin;
    private final int deepPercent;
    private final String fallClock;
    private final String fallDate;
    private final boolean hasData;
    private final int hour;
    private final int lightMin;
    private final int lightPercent;
    private final int minute;
    private final String nightStatus;
    private final long nightStatusColor;
    private final int score;
    private final List<SleepSegment> segments;
    private final boolean showScore;
    private final boolean showTimeline;
    private final int tab;
    private final String wakeClock;
    private final String wakeDate;

    public SleepDetailUi() {
        this(0, false, 0, 0, null, false, null, null, null, null, null, null, false, 0, null, null, 0, 0, 0, 0, 0, 0, null, 0L, 16777215, null);
    }

    public static /* synthetic */ SleepDetailUi copy$default(SleepDetailUi sleepDetailUi, int i, boolean z, int i2, int i3, String str, boolean z2, String str2, String str3, String str4, String str5, List list, List list2, boolean z3, int i4, String str6, String str7, int i5, int i6, int i7, int i8, int i9, int i10, String str8, long j, int i11, Object obj) {
        long j2;
        String str9;
        String str10;
        int i12 = (i11 & 1) != 0 ? sleepDetailUi.tab : i;
        boolean z4 = (i11 & 2) != 0 ? sleepDetailUi.hasData : z;
        int i13 = (i11 & 4) != 0 ? sleepDetailUi.hour : i2;
        int i14 = (i11 & 8) != 0 ? sleepDetailUi.minute : i3;
        String str11 = (i11 & 16) != 0 ? sleepDetailUi.dateLabel : str;
        boolean z5 = (i11 & 32) != 0 ? sleepDetailUi.showTimeline : z2;
        String str12 = (i11 & 64) != 0 ? sleepDetailUi.fallDate : str2;
        String str13 = (i11 & 128) != 0 ? sleepDetailUi.fallClock : str3;
        String str14 = (i11 & 256) != 0 ? sleepDetailUi.wakeDate : str4;
        String str15 = (i11 & 512) != 0 ? sleepDetailUi.wakeClock : str5;
        List list3 = (i11 & 1024) != 0 ? sleepDetailUi.segments : list;
        List list4 = (i11 & 2048) != 0 ? sleepDetailUi.bars : list2;
        boolean z6 = (i11 & 4096) != 0 ? sleepDetailUi.showScore : z3;
        int i15 = (i11 & 8192) != 0 ? sleepDetailUi.score : i4;
        int i16 = i12;
        String str16 = (i11 & 16384) != 0 ? sleepDetailUi.beatText : str6;
        String str17 = (i11 & 32768) != 0 ? sleepDetailUi.copy : str7;
        int i17 = (i11 & 65536) != 0 ? sleepDetailUi.deepMin : i5;
        int i18 = (i11 & 131072) != 0 ? sleepDetailUi.lightMin : i6;
        int i19 = (i11 & 262144) != 0 ? sleepDetailUi.awakeMin : i7;
        int i20 = (i11 & 524288) != 0 ? sleepDetailUi.deepPercent : i8;
        int i21 = (i11 & 1048576) != 0 ? sleepDetailUi.lightPercent : i9;
        int i22 = (i11 & 2097152) != 0 ? sleepDetailUi.awakePercent : i10;
        String str18 = (i11 & 4194304) != 0 ? sleepDetailUi.nightStatus : str8;
        if ((i11 & 8388608) != 0) {
            str10 = str16;
            str9 = str18;
            j2 = sleepDetailUi.nightStatusColor;
        } else {
            j2 = j;
            str9 = str18;
            str10 = str16;
        }
        return sleepDetailUi.copy(i16, z4, i13, i14, str11, z5, str12, str13, str14, str15, list3, list4, z6, i15, str10, str17, i17, i18, i19, i20, i21, i22, str9, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTab() {
        return this.tab;
    }

    /* renamed from: component10, reason: from getter */
    public final String getWakeClock() {
        return this.wakeClock;
    }

    public final List<SleepSegment> component11() {
        return this.segments;
    }

    public final List<SleepBar> component12() {
        return this.bars;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowScore() {
        return this.showScore;
    }

    /* renamed from: component14, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component15, reason: from getter */
    public final String getBeatText() {
        return this.beatText;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCopy() {
        return this.copy;
    }

    /* renamed from: component17, reason: from getter */
    public final int getDeepMin() {
        return this.deepMin;
    }

    /* renamed from: component18, reason: from getter */
    public final int getLightMin() {
        return this.lightMin;
    }

    /* renamed from: component19, reason: from getter */
    public final int getAwakeMin() {
        return this.awakeMin;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* renamed from: component20, reason: from getter */
    public final int getDeepPercent() {
        return this.deepPercent;
    }

    /* renamed from: component21, reason: from getter */
    public final int getLightPercent() {
        return this.lightPercent;
    }

    /* renamed from: component22, reason: from getter */
    public final int getAwakePercent() {
        return this.awakePercent;
    }

    /* renamed from: component23, reason: from getter */
    public final String getNightStatus() {
        return this.nightStatus;
    }

    /* renamed from: component24, reason: from getter */
    public final long getNightStatusColor() {
        return this.nightStatusColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowTimeline() {
        return this.showTimeline;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFallDate() {
        return this.fallDate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFallClock() {
        return this.fallClock;
    }

    /* renamed from: component9, reason: from getter */
    public final String getWakeDate() {
        return this.wakeDate;
    }

    public final SleepDetailUi copy(int tab, boolean hasData, int hour, int minute, String dateLabel, boolean showTimeline, String fallDate, String fallClock, String wakeDate, String wakeClock, List<SleepSegment> segments, List<SleepBar> bars, boolean showScore, int score, String beatText, String copy, int deepMin, int lightMin, int awakeMin, int deepPercent, int lightPercent, int awakePercent, String nightStatus, long nightStatusColor) {
        Intrinsics.checkNotNullParameter(dateLabel, "dateLabel");
        Intrinsics.checkNotNullParameter(fallDate, "fallDate");
        Intrinsics.checkNotNullParameter(fallClock, "fallClock");
        Intrinsics.checkNotNullParameter(wakeDate, "wakeDate");
        Intrinsics.checkNotNullParameter(wakeClock, "wakeClock");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(bars, "bars");
        Intrinsics.checkNotNullParameter(beatText, "beatText");
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(nightStatus, "nightStatus");
        return new SleepDetailUi(tab, hasData, hour, minute, dateLabel, showTimeline, fallDate, fallClock, wakeDate, wakeClock, segments, bars, showScore, score, beatText, copy, deepMin, lightMin, awakeMin, deepPercent, lightPercent, awakePercent, nightStatus, nightStatusColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetailUi)) {
            return false;
        }
        SleepDetailUi sleepDetailUi = (SleepDetailUi) other;
        return this.tab == sleepDetailUi.tab && this.hasData == sleepDetailUi.hasData && this.hour == sleepDetailUi.hour && this.minute == sleepDetailUi.minute && Intrinsics.areEqual(this.dateLabel, sleepDetailUi.dateLabel) && this.showTimeline == sleepDetailUi.showTimeline && Intrinsics.areEqual(this.fallDate, sleepDetailUi.fallDate) && Intrinsics.areEqual(this.fallClock, sleepDetailUi.fallClock) && Intrinsics.areEqual(this.wakeDate, sleepDetailUi.wakeDate) && Intrinsics.areEqual(this.wakeClock, sleepDetailUi.wakeClock) && Intrinsics.areEqual(this.segments, sleepDetailUi.segments) && Intrinsics.areEqual(this.bars, sleepDetailUi.bars) && this.showScore == sleepDetailUi.showScore && this.score == sleepDetailUi.score && Intrinsics.areEqual(this.beatText, sleepDetailUi.beatText) && Intrinsics.areEqual(this.copy, sleepDetailUi.copy) && this.deepMin == sleepDetailUi.deepMin && this.lightMin == sleepDetailUi.lightMin && this.awakeMin == sleepDetailUi.awakeMin && this.deepPercent == sleepDetailUi.deepPercent && this.lightPercent == sleepDetailUi.lightPercent && this.awakePercent == sleepDetailUi.awakePercent && Intrinsics.areEqual(this.nightStatus, sleepDetailUi.nightStatus) && this.nightStatusColor == sleepDetailUi.nightStatusColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.tab) * 31) + Boolean.hashCode(this.hasData)) * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.minute)) * 31) + this.dateLabel.hashCode()) * 31) + Boolean.hashCode(this.showTimeline)) * 31) + this.fallDate.hashCode()) * 31) + this.fallClock.hashCode()) * 31) + this.wakeDate.hashCode()) * 31) + this.wakeClock.hashCode()) * 31) + this.segments.hashCode()) * 31) + this.bars.hashCode()) * 31) + Boolean.hashCode(this.showScore)) * 31) + Integer.hashCode(this.score)) * 31) + this.beatText.hashCode()) * 31) + this.copy.hashCode()) * 31) + Integer.hashCode(this.deepMin)) * 31) + Integer.hashCode(this.lightMin)) * 31) + Integer.hashCode(this.awakeMin)) * 31) + Integer.hashCode(this.deepPercent)) * 31) + Integer.hashCode(this.lightPercent)) * 31) + Integer.hashCode(this.awakePercent)) * 31) + this.nightStatus.hashCode()) * 31) + Long.hashCode(this.nightStatusColor);
    }

    public String toString() {
        return "SleepDetailUi(tab=" + this.tab + ", hasData=" + this.hasData + ", hour=" + this.hour + ", minute=" + this.minute + ", dateLabel=" + this.dateLabel + ", showTimeline=" + this.showTimeline + ", fallDate=" + this.fallDate + ", fallClock=" + this.fallClock + ", wakeDate=" + this.wakeDate + ", wakeClock=" + this.wakeClock + ", segments=" + this.segments + ", bars=" + this.bars + ", showScore=" + this.showScore + ", score=" + this.score + ", beatText=" + this.beatText + ", copy=" + this.copy + ", deepMin=" + this.deepMin + ", lightMin=" + this.lightMin + ", awakeMin=" + this.awakeMin + ", deepPercent=" + this.deepPercent + ", lightPercent=" + this.lightPercent + ", awakePercent=" + this.awakePercent + ", nightStatus=" + this.nightStatus + ", nightStatusColor=" + this.nightStatusColor + Separators.RPAREN;
    }

    public SleepDetailUi(int i, boolean z, int i2, int i3, String dateLabel, boolean z2, String fallDate, String fallClock, String wakeDate, String wakeClock, List<SleepSegment> segments, List<SleepBar> bars, boolean z3, int i4, String beatText, String copy, int i5, int i6, int i7, int i8, int i9, int i10, String nightStatus, long j) {
        Intrinsics.checkNotNullParameter(dateLabel, "dateLabel");
        Intrinsics.checkNotNullParameter(fallDate, "fallDate");
        Intrinsics.checkNotNullParameter(fallClock, "fallClock");
        Intrinsics.checkNotNullParameter(wakeDate, "wakeDate");
        Intrinsics.checkNotNullParameter(wakeClock, "wakeClock");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(bars, "bars");
        Intrinsics.checkNotNullParameter(beatText, "beatText");
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(nightStatus, "nightStatus");
        this.tab = i;
        this.hasData = z;
        this.hour = i2;
        this.minute = i3;
        this.dateLabel = dateLabel;
        this.showTimeline = z2;
        this.fallDate = fallDate;
        this.fallClock = fallClock;
        this.wakeDate = wakeDate;
        this.wakeClock = wakeClock;
        this.segments = segments;
        this.bars = bars;
        this.showScore = z3;
        this.score = i4;
        this.beatText = beatText;
        this.copy = copy;
        this.deepMin = i5;
        this.lightMin = i6;
        this.awakeMin = i7;
        this.deepPercent = i8;
        this.lightPercent = i9;
        this.awakePercent = i10;
        this.nightStatus = nightStatus;
        this.nightStatusColor = j;
    }

    public /* synthetic */ SleepDetailUi(int i, boolean z, int i2, int i3, String str, boolean z2, String str2, String str3, String str4, String str5, List list, List list2, boolean z3, int i4, String str6, String str7, int i5, int i6, int i7, int i8, int i9, int i10, String str8, long j, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? false : z, (i11 & 4) != 0 ? 0 : i2, (i11 & 8) != 0 ? 0 : i3, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? true : z2, (i11 & 64) != 0 ? "" : str2, (i11 & 128) != 0 ? "" : str3, (i11 & 256) != 0 ? "" : str4, (i11 & 512) != 0 ? "" : str5, (i11 & 1024) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 4096) == 0 ? z3 : true, (i11 & 8192) != 0 ? 0 : i4, (i11 & 16384) != 0 ? "" : str6, (i11 & 32768) != 0 ? "" : str7, (i11 & 65536) != 0 ? 0 : i5, (i11 & 131072) != 0 ? 0 : i6, (i11 & 262144) != 0 ? 0 : i7, (i11 & 524288) != 0 ? 0 : i8, (i11 & 1048576) != 0 ? 0 : i9, (i11 & 2097152) != 0 ? 0 : i10, (i11 & 4194304) == 0 ? str8 : "", (i11 & 8388608) != 0 ? 4285911661L : j);
    }

    public final int getTab() {
        return this.tab;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final String getDateLabel() {
        return this.dateLabel;
    }

    public final boolean getShowTimeline() {
        return this.showTimeline;
    }

    public final String getFallDate() {
        return this.fallDate;
    }

    public final String getFallClock() {
        return this.fallClock;
    }

    public final String getWakeDate() {
        return this.wakeDate;
    }

    public final String getWakeClock() {
        return this.wakeClock;
    }

    public final List<SleepSegment> getSegments() {
        return this.segments;
    }

    public final List<SleepBar> getBars() {
        return this.bars;
    }

    public final boolean getShowScore() {
        return this.showScore;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getBeatText() {
        return this.beatText;
    }

    public final String getCopy() {
        return this.copy;
    }

    public final int getDeepMin() {
        return this.deepMin;
    }

    public final int getLightMin() {
        return this.lightMin;
    }

    public final int getAwakeMin() {
        return this.awakeMin;
    }

    public final int getDeepPercent() {
        return this.deepPercent;
    }

    public final int getLightPercent() {
        return this.lightPercent;
    }

    public final int getAwakePercent() {
        return this.awakePercent;
    }

    public final String getNightStatus() {
        return this.nightStatus;
    }

    public final long getNightStatusColor() {
        return this.nightStatusColor;
    }
}
