package com.wakeup.common.network.entity.healthwarning;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthWarningSendBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/wakeup/common/network/entity/healthwarning/HealthWarningSendBean;", "", "appTime", "", "hearthType", "", "locale", "", "warnInfo", "warnTime", "warnTye", "warnValue", "", "<init>", "(JILjava/lang/String;Ljava/lang/String;JIF)V", "getAppTime", "()J", "setAppTime", "(J)V", "getHearthType", "()I", "getLocale", "()Ljava/lang/String;", "getWarnInfo", "setWarnInfo", "(Ljava/lang/String;)V", "getWarnTime", "setWarnTime", "getWarnTye", "setWarnTye", "(I)V", "getWarnValue", "()F", "setWarnValue", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthWarningSendBean {
    private long appTime;
    private final int hearthType;
    private final String locale;
    private String warnInfo;
    private long warnTime;
    private int warnTye;
    private float warnValue;

    public static /* synthetic */ HealthWarningSendBean copy$default(HealthWarningSendBean healthWarningSendBean, long j, int i, String str, String str2, long j2, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = healthWarningSendBean.appTime;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            i = healthWarningSendBean.hearthType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = healthWarningSendBean.locale;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = healthWarningSendBean.warnInfo;
        }
        return healthWarningSendBean.copy(j3, i4, str3, str2, (i3 & 16) != 0 ? healthWarningSendBean.warnTime : j2, (i3 & 32) != 0 ? healthWarningSendBean.warnTye : i2, (i3 & 64) != 0 ? healthWarningSendBean.warnValue : f);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppTime() {
        return this.appTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHearthType() {
        return this.hearthType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWarnInfo() {
        return this.warnInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final long getWarnTime() {
        return this.warnTime;
    }

    /* renamed from: component6, reason: from getter */
    public final int getWarnTye() {
        return this.warnTye;
    }

    /* renamed from: component7, reason: from getter */
    public final float getWarnValue() {
        return this.warnValue;
    }

    public final HealthWarningSendBean copy(long appTime, int hearthType, String locale, String warnInfo, long warnTime, int warnTye, float warnValue) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(warnInfo, "warnInfo");
        return new HealthWarningSendBean(appTime, hearthType, locale, warnInfo, warnTime, warnTye, warnValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthWarningSendBean)) {
            return false;
        }
        HealthWarningSendBean healthWarningSendBean = (HealthWarningSendBean) other;
        return this.appTime == healthWarningSendBean.appTime && this.hearthType == healthWarningSendBean.hearthType && Intrinsics.areEqual(this.locale, healthWarningSendBean.locale) && Intrinsics.areEqual(this.warnInfo, healthWarningSendBean.warnInfo) && this.warnTime == healthWarningSendBean.warnTime && this.warnTye == healthWarningSendBean.warnTye && Float.compare(this.warnValue, healthWarningSendBean.warnValue) == 0;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.appTime) * 31) + Integer.hashCode(this.hearthType)) * 31) + this.locale.hashCode()) * 31) + this.warnInfo.hashCode()) * 31) + Long.hashCode(this.warnTime)) * 31) + Integer.hashCode(this.warnTye)) * 31) + Float.hashCode(this.warnValue);
    }

    public String toString() {
        return "HealthWarningSendBean(appTime=" + this.appTime + ", hearthType=" + this.hearthType + ", locale=" + this.locale + ", warnInfo=" + this.warnInfo + ", warnTime=" + this.warnTime + ", warnTye=" + this.warnTye + ", warnValue=" + this.warnValue + Separators.RPAREN;
    }

    public HealthWarningSendBean(long j, int i, String locale, String warnInfo, long j2, int i2, float f) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(warnInfo, "warnInfo");
        this.appTime = j;
        this.hearthType = i;
        this.locale = locale;
        this.warnInfo = warnInfo;
        this.warnTime = j2;
        this.warnTye = i2;
        this.warnValue = f;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final void setAppTime(long j) {
        this.appTime = j;
    }

    public final int getHearthType() {
        return this.hearthType;
    }

    public final String getLocale() {
        return this.locale;
    }

    public /* synthetic */ HealthWarningSendBean(long j, int i, String str, String str2, long j2, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, (i3 & 8) != 0 ? "" : str2, j2, i2, f);
    }

    public final String getWarnInfo() {
        return this.warnInfo;
    }

    public final void setWarnInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.warnInfo = str;
    }

    public final long getWarnTime() {
        return this.warnTime;
    }

    public final void setWarnTime(long j) {
        this.warnTime = j;
    }

    public final int getWarnTye() {
        return this.warnTye;
    }

    public final void setWarnTye(int i) {
        this.warnTye = i;
    }

    public final float getWarnValue() {
        return this.warnValue;
    }

    public final void setWarnValue(float f) {
        this.warnValue = f;
    }
}
