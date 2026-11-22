package com.wakeup.feature.health.bodyindex.net;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/net/SleepInputs;", "", "sumDurationMin", "", "awakeMin", "<init>", "(ILjava/lang/Integer;)V", "getSumDurationMin", "()I", "getAwakeMin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/wakeup/feature/health/bodyindex/net/SleepInputs;", "equals", "", "other", "hashCode", "toString", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepInputs {
    public static final int $stable = 0;
    private final Integer awakeMin;
    private final int sumDurationMin;

    public static /* synthetic */ SleepInputs copy$default(SleepInputs sleepInputs, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepInputs.sumDurationMin;
        }
        if ((i2 & 2) != 0) {
            num = sleepInputs.awakeMin;
        }
        return sleepInputs.copy(i, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSumDurationMin() {
        return this.sumDurationMin;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAwakeMin() {
        return this.awakeMin;
    }

    public final SleepInputs copy(int sumDurationMin, Integer awakeMin) {
        return new SleepInputs(sumDurationMin, awakeMin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInputs)) {
            return false;
        }
        SleepInputs sleepInputs = (SleepInputs) other;
        return this.sumDurationMin == sleepInputs.sumDurationMin && Intrinsics.areEqual(this.awakeMin, sleepInputs.awakeMin);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.sumDurationMin) * 31;
        Integer num = this.awakeMin;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "SleepInputs(sumDurationMin=" + this.sumDurationMin + ", awakeMin=" + this.awakeMin + Separators.RPAREN;
    }

    public SleepInputs(int i, Integer num) {
        this.sumDurationMin = i;
        this.awakeMin = num;
    }

    public /* synthetic */ SleepInputs(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num);
    }

    public final int getSumDurationMin() {
        return this.sumDurationMin;
    }

    public final Integer getAwakeMin() {
        return this.awakeMin;
    }
}
