package com.wakeup.commponent.module.h5.api;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDashboardRepository.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JN\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"com/wakeup/commponent/module/h5/api/HealthDashboardRepository$buildJumpJson$Dim", "", "key", "", "value", "", "label", "unit", "fmt", "Lkotlin/Function1;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getKey", "()Ljava/lang/String;", "getValue", "()I", "getLabel", "getUnit", "getFmt", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/wakeup/commponent/module/h5/api/HealthDashboardRepository$buildJumpJson$Dim;", "equals", "", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthDashboardRepository$buildJumpJson$Dim {
    private final Function1<Integer, String> fmt;
    private final String key;
    private final String label;
    private final String unit;
    private final int value;

    public static /* synthetic */ HealthDashboardRepository$buildJumpJson$Dim copy$default(HealthDashboardRepository$buildJumpJson$Dim healthDashboardRepository$buildJumpJson$Dim, String str, int i, String str2, String str3, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = healthDashboardRepository$buildJumpJson$Dim.key;
        }
        if ((i2 & 2) != 0) {
            i = healthDashboardRepository$buildJumpJson$Dim.value;
        }
        if ((i2 & 4) != 0) {
            str2 = healthDashboardRepository$buildJumpJson$Dim.label;
        }
        if ((i2 & 8) != 0) {
            str3 = healthDashboardRepository$buildJumpJson$Dim.unit;
        }
        if ((i2 & 16) != 0) {
            function1 = healthDashboardRepository$buildJumpJson$Dim.fmt;
        }
        Function1 function12 = function1;
        String str4 = str2;
        return healthDashboardRepository$buildJumpJson$Dim.copy(str, i, str4, str3, function12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final Function1<Integer, String> component5() {
        return this.fmt;
    }

    public final HealthDashboardRepository$buildJumpJson$Dim copy(String key, int value, String label, String unit, Function1<? super Integer, String> fmt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new HealthDashboardRepository$buildJumpJson$Dim(key, value, label, unit, fmt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDashboardRepository$buildJumpJson$Dim)) {
            return false;
        }
        HealthDashboardRepository$buildJumpJson$Dim healthDashboardRepository$buildJumpJson$Dim = (HealthDashboardRepository$buildJumpJson$Dim) other;
        return Intrinsics.areEqual(this.key, healthDashboardRepository$buildJumpJson$Dim.key) && this.value == healthDashboardRepository$buildJumpJson$Dim.value && Intrinsics.areEqual(this.label, healthDashboardRepository$buildJumpJson$Dim.label) && Intrinsics.areEqual(this.unit, healthDashboardRepository$buildJumpJson$Dim.unit) && Intrinsics.areEqual(this.fmt, healthDashboardRepository$buildJumpJson$Dim.fmt);
    }

    public int hashCode() {
        int hashCode = ((((((this.key.hashCode() * 31) + Integer.hashCode(this.value)) * 31) + this.label.hashCode()) * 31) + this.unit.hashCode()) * 31;
        Function1<Integer, String> function1 = this.fmt;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public String toString() {
        return "Dim(key=" + this.key + ", value=" + this.value + ", label=" + this.label + ", unit=" + this.unit + ", fmt=" + this.fmt + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDashboardRepository$buildJumpJson$Dim(String key, int i, String label, String unit, Function1<? super Integer, String> function1) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.key = key;
        this.value = i;
        this.label = label;
        this.unit = unit;
        this.fmt = function1;
    }

    public /* synthetic */ HealthDashboardRepository$buildJumpJson$Dim(String str, int i, String str2, String str3, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? null : function1);
    }

    public final Function1<Integer, String> getFmt() {
        return this.fmt;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }
}
