package com.wakeup.common.network.entity.healthwarning;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthWaringHistoryBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/wakeup/common/network/entity/healthwarning/HealthWaringHistoryBean;", "", "hearthType", "", "warnInfo", "", "warnTime", "", "warnType", "warnValue", "", "<init>", "(ILjava/lang/String;JIF)V", "getHearthType", "()I", "setHearthType", "(I)V", "getWarnInfo", "()Ljava/lang/String;", "setWarnInfo", "(Ljava/lang/String;)V", "getWarnTime", "()J", "setWarnTime", "(J)V", "getWarnType", "setWarnType", "getWarnValue", "()F", "setWarnValue", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthWaringHistoryBean {
    private int hearthType;
    private String warnInfo;
    private long warnTime;
    private int warnType;
    private float warnValue;

    public static /* synthetic */ HealthWaringHistoryBean copy$default(HealthWaringHistoryBean healthWaringHistoryBean, int i, String str, long j, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = healthWaringHistoryBean.hearthType;
        }
        if ((i3 & 2) != 0) {
            str = healthWaringHistoryBean.warnInfo;
        }
        if ((i3 & 4) != 0) {
            j = healthWaringHistoryBean.warnTime;
        }
        if ((i3 & 8) != 0) {
            i2 = healthWaringHistoryBean.warnType;
        }
        if ((i3 & 16) != 0) {
            f = healthWaringHistoryBean.warnValue;
        }
        long j2 = j;
        return healthWaringHistoryBean.copy(i, str, j2, i2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHearthType() {
        return this.hearthType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWarnInfo() {
        return this.warnInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final long getWarnTime() {
        return this.warnTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWarnType() {
        return this.warnType;
    }

    /* renamed from: component5, reason: from getter */
    public final float getWarnValue() {
        return this.warnValue;
    }

    public final HealthWaringHistoryBean copy(int hearthType, String warnInfo, long warnTime, int warnType, float warnValue) {
        Intrinsics.checkNotNullParameter(warnInfo, "warnInfo");
        return new HealthWaringHistoryBean(hearthType, warnInfo, warnTime, warnType, warnValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthWaringHistoryBean)) {
            return false;
        }
        HealthWaringHistoryBean healthWaringHistoryBean = (HealthWaringHistoryBean) other;
        return this.hearthType == healthWaringHistoryBean.hearthType && Intrinsics.areEqual(this.warnInfo, healthWaringHistoryBean.warnInfo) && this.warnTime == healthWaringHistoryBean.warnTime && this.warnType == healthWaringHistoryBean.warnType && Float.compare(this.warnValue, healthWaringHistoryBean.warnValue) == 0;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.hearthType) * 31) + this.warnInfo.hashCode()) * 31) + Long.hashCode(this.warnTime)) * 31) + Integer.hashCode(this.warnType)) * 31) + Float.hashCode(this.warnValue);
    }

    public String toString() {
        return "HealthWaringHistoryBean(hearthType=" + this.hearthType + ", warnInfo=" + this.warnInfo + ", warnTime=" + this.warnTime + ", warnType=" + this.warnType + ", warnValue=" + this.warnValue + Separators.RPAREN;
    }

    public HealthWaringHistoryBean(int i, String warnInfo, long j, int i2, float f) {
        Intrinsics.checkNotNullParameter(warnInfo, "warnInfo");
        this.hearthType = i;
        this.warnInfo = warnInfo;
        this.warnTime = j;
        this.warnType = i2;
        this.warnValue = f;
    }

    public final int getHearthType() {
        return this.hearthType;
    }

    public final void setHearthType(int i) {
        this.hearthType = i;
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

    public final int getWarnType() {
        return this.warnType;
    }

    public final void setWarnType(int i) {
        this.warnType = i;
    }

    public final float getWarnValue() {
        return this.warnValue;
    }

    public final void setWarnValue(float f) {
        this.warnValue = f;
    }
}
