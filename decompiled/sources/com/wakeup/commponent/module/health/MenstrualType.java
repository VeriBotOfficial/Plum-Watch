package com.wakeup.commponent.module.health;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: MenstrualType.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/commponent/module/health/MenstrualType;", "", "type", "", "diffDay", "time", "", "<init>", "(IIJ)V", "getType", "()I", "getDiffDay", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenstrualType {
    public static final int TYPE_MENSTRUAL = 1;
    public static final int TYPE_PREGNANT = 2;
    public static final int TYPE_SECURITY = 3;
    private final int diffDay;
    private final long time;
    private final int type;

    public static /* synthetic */ MenstrualType copy$default(MenstrualType menstrualType, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menstrualType.type;
        }
        if ((i3 & 2) != 0) {
            i2 = menstrualType.diffDay;
        }
        if ((i3 & 4) != 0) {
            j = menstrualType.time;
        }
        return menstrualType.copy(i, i2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDiffDay() {
        return this.diffDay;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final MenstrualType copy(int type, int diffDay, long time) {
        return new MenstrualType(type, diffDay, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualType)) {
            return false;
        }
        MenstrualType menstrualType = (MenstrualType) other;
        return this.type == menstrualType.type && this.diffDay == menstrualType.diffDay && this.time == menstrualType.time;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.diffDay)) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "MenstrualType(type=" + this.type + ", diffDay=" + this.diffDay + ", time=" + this.time + Separators.RPAREN;
    }

    public MenstrualType(int i, int i2, long j) {
        this.type = i;
        this.diffDay = i2;
        this.time = j;
    }

    public final int getType() {
        return this.type;
    }

    public final int getDiffDay() {
        return this.diffDay;
    }

    public final long getTime() {
        return this.time;
    }
}
