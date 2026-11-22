package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/HealthIndexDay;", "", "dayNo", "", "recovery", "Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "strain", "syncLabel", "", "syncClock", "<init>", "(ILcom/wakeup/feature/health/bodyindex/net/ScoreItem;Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;Ljava/lang/String;Ljava/lang/String;)V", "getDayNo", "()I", "getRecovery", "()Lcom/wakeup/feature/health/bodyindex/net/ScoreItem;", "getStrain", "getSyncLabel", "()Ljava/lang/String;", "getSyncClock", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthIndexDay {
    public static final int $stable = 0;
    private final int dayNo;
    private final ScoreItem recovery;
    private final ScoreItem strain;
    private final String syncClock;
    private final String syncLabel;

    public static /* synthetic */ HealthIndexDay copy$default(HealthIndexDay healthIndexDay, int i, ScoreItem scoreItem, ScoreItem scoreItem2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthIndexDay.dayNo;
        }
        if ((i2 & 2) != 0) {
            scoreItem = healthIndexDay.recovery;
        }
        if ((i2 & 4) != 0) {
            scoreItem2 = healthIndexDay.strain;
        }
        if ((i2 & 8) != 0) {
            str = healthIndexDay.syncLabel;
        }
        if ((i2 & 16) != 0) {
            str2 = healthIndexDay.syncClock;
        }
        String str3 = str2;
        ScoreItem scoreItem3 = scoreItem2;
        return healthIndexDay.copy(i, scoreItem, scoreItem3, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDayNo() {
        return this.dayNo;
    }

    /* renamed from: component2, reason: from getter */
    public final ScoreItem getRecovery() {
        return this.recovery;
    }

    /* renamed from: component3, reason: from getter */
    public final ScoreItem getStrain() {
        return this.strain;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSyncLabel() {
        return this.syncLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSyncClock() {
        return this.syncClock;
    }

    public final HealthIndexDay copy(int dayNo, ScoreItem recovery, ScoreItem strain, String syncLabel, String syncClock) {
        Intrinsics.checkNotNullParameter(syncLabel, "syncLabel");
        return new HealthIndexDay(dayNo, recovery, strain, syncLabel, syncClock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIndexDay)) {
            return false;
        }
        HealthIndexDay healthIndexDay = (HealthIndexDay) other;
        return this.dayNo == healthIndexDay.dayNo && Intrinsics.areEqual(this.recovery, healthIndexDay.recovery) && Intrinsics.areEqual(this.strain, healthIndexDay.strain) && Intrinsics.areEqual(this.syncLabel, healthIndexDay.syncLabel) && Intrinsics.areEqual(this.syncClock, healthIndexDay.syncClock);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.dayNo) * 31;
        ScoreItem scoreItem = this.recovery;
        int hashCode2 = (hashCode + (scoreItem == null ? 0 : scoreItem.hashCode())) * 31;
        ScoreItem scoreItem2 = this.strain;
        int hashCode3 = (((hashCode2 + (scoreItem2 == null ? 0 : scoreItem2.hashCode())) * 31) + this.syncLabel.hashCode()) * 31;
        String str = this.syncClock;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HealthIndexDay(dayNo=" + this.dayNo + ", recovery=" + this.recovery + ", strain=" + this.strain + ", syncLabel=" + this.syncLabel + ", syncClock=" + this.syncClock + Separators.RPAREN;
    }

    public HealthIndexDay(int i, ScoreItem scoreItem, ScoreItem scoreItem2, String syncLabel, String str) {
        Intrinsics.checkNotNullParameter(syncLabel, "syncLabel");
        this.dayNo = i;
        this.recovery = scoreItem;
        this.strain = scoreItem2;
        this.syncLabel = syncLabel;
        this.syncClock = str;
    }

    public /* synthetic */ HealthIndexDay(int i, ScoreItem scoreItem, ScoreItem scoreItem2, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, scoreItem, scoreItem2, str, (i2 & 16) != 0 ? null : str2);
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    public final ScoreItem getRecovery() {
        return this.recovery;
    }

    public final ScoreItem getStrain() {
        return this.strain;
    }

    public final String getSyncLabel() {
        return this.syncLabel;
    }

    public final String getSyncClock() {
        return this.syncClock;
    }
}
