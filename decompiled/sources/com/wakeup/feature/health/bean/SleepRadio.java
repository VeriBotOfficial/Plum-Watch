package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepRadio.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/wakeup/feature/health/bean/SleepRadio;", "", "isDay", "", "sleepType", "", "titleValue", "desc", "", "showMore", "<init>", "(ZIILjava/lang/String;Z)V", "()Z", "setDay", "(Z)V", "getSleepType", "()I", "getTitleValue", "getDesc", "()Ljava/lang/String;", "getShowMore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepRadio {
    public static final int $stable = 8;
    private final String desc;
    private boolean isDay;
    private final boolean showMore;
    private final int sleepType;
    private final int titleValue;

    public static /* synthetic */ SleepRadio copy$default(SleepRadio sleepRadio, boolean z, int i, int i2, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = sleepRadio.isDay;
        }
        if ((i3 & 2) != 0) {
            i = sleepRadio.sleepType;
        }
        if ((i3 & 4) != 0) {
            i2 = sleepRadio.titleValue;
        }
        if ((i3 & 8) != 0) {
            str = sleepRadio.desc;
        }
        if ((i3 & 16) != 0) {
            z2 = sleepRadio.showMore;
        }
        boolean z3 = z2;
        int i4 = i2;
        return sleepRadio.copy(z, i, i4, str, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSleepType() {
        return this.sleepType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTitleValue() {
        return this.titleValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowMore() {
        return this.showMore;
    }

    public final SleepRadio copy(boolean isDay, int sleepType, int titleValue, String desc, boolean showMore) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new SleepRadio(isDay, sleepType, titleValue, desc, showMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRadio)) {
            return false;
        }
        SleepRadio sleepRadio = (SleepRadio) other;
        return this.isDay == sleepRadio.isDay && this.sleepType == sleepRadio.sleepType && this.titleValue == sleepRadio.titleValue && Intrinsics.areEqual(this.desc, sleepRadio.desc) && this.showMore == sleepRadio.showMore;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isDay) * 31) + Integer.hashCode(this.sleepType)) * 31) + Integer.hashCode(this.titleValue)) * 31) + this.desc.hashCode()) * 31) + Boolean.hashCode(this.showMore);
    }

    public String toString() {
        return "SleepRadio(isDay=" + this.isDay + ", sleepType=" + this.sleepType + ", titleValue=" + this.titleValue + ", desc=" + this.desc + ", showMore=" + this.showMore + Separators.RPAREN;
    }

    public SleepRadio(boolean z, int i, int i2, String desc, boolean z2) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.isDay = z;
        this.sleepType = i;
        this.titleValue = i2;
        this.desc = desc;
        this.showMore = z2;
    }

    public /* synthetic */ SleepRadio(boolean z, int i, int i2, String str, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, i2, str, (i3 & 16) != 0 ? true : z2);
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final void setDay(boolean z) {
        this.isDay = z;
    }

    public final int getSleepType() {
        return this.sleepType;
    }

    public final int getTitleValue() {
        return this.titleValue;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getShowMore() {
        return this.showMore;
    }
}
