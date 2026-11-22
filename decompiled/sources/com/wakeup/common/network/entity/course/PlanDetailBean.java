package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlanDetailBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/course/PlanDetailBean;", "Ljava/io/Serializable;", "weekNum", "", "remindTime", "", AnalyticsConfig.RTD_START_TIME, "", "isExistPlan", "exercisePlanWeekDetailsVOList", "", "Lcom/wakeup/common/network/entity/course/PlanDetailTitleBean;", "<init>", "(ILjava/lang/String;JILjava/util/List;)V", "getWeekNum", "()I", "setWeekNum", "(I)V", "getRemindTime", "()Ljava/lang/String;", "setRemindTime", "(Ljava/lang/String;)V", "getStartTime", "()J", "getExercisePlanWeekDetailsVOList", "()Ljava/util/List;", "setExercisePlanWeekDetailsVOList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlanDetailBean implements Serializable {
    private List<PlanDetailTitleBean> exercisePlanWeekDetailsVOList;
    private final int isExistPlan;
    private String remindTime;
    private final long startTime;
    private int weekNum;

    public static /* synthetic */ PlanDetailBean copy$default(PlanDetailBean planDetailBean, int i, String str, long j, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = planDetailBean.weekNum;
        }
        if ((i3 & 2) != 0) {
            str = planDetailBean.remindTime;
        }
        if ((i3 & 4) != 0) {
            j = planDetailBean.startTime;
        }
        if ((i3 & 8) != 0) {
            i2 = planDetailBean.isExistPlan;
        }
        if ((i3 & 16) != 0) {
            list = planDetailBean.exercisePlanWeekDetailsVOList;
        }
        long j2 = j;
        return planDetailBean.copy(i, str, j2, i2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWeekNum() {
        return this.weekNum;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRemindTime() {
        return this.remindTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIsExistPlan() {
        return this.isExistPlan;
    }

    public final List<PlanDetailTitleBean> component5() {
        return this.exercisePlanWeekDetailsVOList;
    }

    public final PlanDetailBean copy(int weekNum, String remindTime, long startTime, int isExistPlan, List<PlanDetailTitleBean> exercisePlanWeekDetailsVOList) {
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        Intrinsics.checkNotNullParameter(exercisePlanWeekDetailsVOList, "exercisePlanWeekDetailsVOList");
        return new PlanDetailBean(weekNum, remindTime, startTime, isExistPlan, exercisePlanWeekDetailsVOList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanDetailBean)) {
            return false;
        }
        PlanDetailBean planDetailBean = (PlanDetailBean) other;
        return this.weekNum == planDetailBean.weekNum && Intrinsics.areEqual(this.remindTime, planDetailBean.remindTime) && this.startTime == planDetailBean.startTime && this.isExistPlan == planDetailBean.isExistPlan && Intrinsics.areEqual(this.exercisePlanWeekDetailsVOList, planDetailBean.exercisePlanWeekDetailsVOList);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.weekNum) * 31) + this.remindTime.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Integer.hashCode(this.isExistPlan)) * 31) + this.exercisePlanWeekDetailsVOList.hashCode();
    }

    public String toString() {
        return "PlanDetailBean(weekNum=" + this.weekNum + ", remindTime=" + this.remindTime + ", startTime=" + this.startTime + ", isExistPlan=" + this.isExistPlan + ", exercisePlanWeekDetailsVOList=" + this.exercisePlanWeekDetailsVOList + Separators.RPAREN;
    }

    public PlanDetailBean(int i, String remindTime, long j, int i2, List<PlanDetailTitleBean> exercisePlanWeekDetailsVOList) {
        Intrinsics.checkNotNullParameter(remindTime, "remindTime");
        Intrinsics.checkNotNullParameter(exercisePlanWeekDetailsVOList, "exercisePlanWeekDetailsVOList");
        this.weekNum = i;
        this.remindTime = remindTime;
        this.startTime = j;
        this.isExistPlan = i2;
        this.exercisePlanWeekDetailsVOList = exercisePlanWeekDetailsVOList;
    }

    public final int getWeekNum() {
        return this.weekNum;
    }

    public final void setWeekNum(int i) {
        this.weekNum = i;
    }

    public /* synthetic */ PlanDetailBean(int i, String str, long j, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, j, i2, list);
    }

    public final String getRemindTime() {
        return this.remindTime;
    }

    public final void setRemindTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remindTime = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int isExistPlan() {
        return this.isExistPlan;
    }

    public final List<PlanDetailTitleBean> getExercisePlanWeekDetailsVOList() {
        return this.exercisePlanWeekDetailsVOList;
    }

    public final void setExercisePlanWeekDetailsVOList(List<PlanDetailTitleBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.exercisePlanWeekDetailsVOList = list;
    }
}
