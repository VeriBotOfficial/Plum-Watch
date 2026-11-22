package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrainPlanCalendarBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/course/TrainPlanCalendarBean;", "", "type", "", "content", "", "planTyp", Constants.BundleKey.TIMESTAMP, "", "<init>", "(ILjava/lang/String;IJ)V", "getType", "()I", "setType", "(I)V", "getContent", "()Ljava/lang/String;", "getPlanTyp", "getTimeStamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TrainPlanCalendarBean {
    private final String content;
    private final int planTyp;
    private final long timeStamp;
    private int type;

    public static /* synthetic */ TrainPlanCalendarBean copy$default(TrainPlanCalendarBean trainPlanCalendarBean, int i, String str, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = trainPlanCalendarBean.type;
        }
        if ((i3 & 2) != 0) {
            str = trainPlanCalendarBean.content;
        }
        if ((i3 & 4) != 0) {
            i2 = trainPlanCalendarBean.planTyp;
        }
        if ((i3 & 8) != 0) {
            j = trainPlanCalendarBean.timeStamp;
        }
        int i4 = i2;
        return trainPlanCalendarBean.copy(i, str, i4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPlanTyp() {
        return this.planTyp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final TrainPlanCalendarBean copy(int type, String content, int planTyp, long timeStamp) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new TrainPlanCalendarBean(type, content, planTyp, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainPlanCalendarBean)) {
            return false;
        }
        TrainPlanCalendarBean trainPlanCalendarBean = (TrainPlanCalendarBean) other;
        return this.type == trainPlanCalendarBean.type && Intrinsics.areEqual(this.content, trainPlanCalendarBean.content) && this.planTyp == trainPlanCalendarBean.planTyp && this.timeStamp == trainPlanCalendarBean.timeStamp;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.planTyp)) * 31) + Long.hashCode(this.timeStamp);
    }

    public String toString() {
        return "TrainPlanCalendarBean(type=" + this.type + ", content=" + this.content + ", planTyp=" + this.planTyp + ", timeStamp=" + this.timeStamp + Separators.RPAREN;
    }

    public TrainPlanCalendarBean(int i, String content, int i2, long j) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = i;
        this.content = content;
        this.planTyp = i2;
        this.timeStamp = j;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getPlanTyp() {
        return this.planTyp;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }
}
