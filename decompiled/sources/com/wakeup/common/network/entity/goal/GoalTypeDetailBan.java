package com.wakeup.common.network.entity.goal;

import com.anythink.core.common.e.a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GoalTypeDetailBan.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan;", "", "<init>", "()V", "goalInfo", "Lcom/wakeup/common/network/entity/goal/GoalBean;", "getGoalInfo", "()Lcom/wakeup/common/network/entity/goal/GoalBean;", "setGoalInfo", "(Lcom/wakeup/common/network/entity/goal/GoalBean;)V", "cumulativeCheckIn", "", "getCumulativeCheckIn", "()I", "setCumulativeCheckIn", "(I)V", "continuousClockIn", "getContinuousClockIn", "setContinuousClockIn", "calender", "", "Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan$CalendarItem;", "getCalender", "()Ljava/util/List;", "setCalender", "(Ljava/util/List;)V", "CalendarItem", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoalTypeDetailBan {
    private List<CalendarItem> calender;
    private int continuousClockIn;
    private int cumulativeCheckIn;
    private GoalBean goalInfo;

    public final GoalBean getGoalInfo() {
        return this.goalInfo;
    }

    public final void setGoalInfo(GoalBean goalBean) {
        this.goalInfo = goalBean;
    }

    public final int getCumulativeCheckIn() {
        return this.cumulativeCheckIn;
    }

    public final void setCumulativeCheckIn(int i) {
        this.cumulativeCheckIn = i;
    }

    public final int getContinuousClockIn() {
        return this.continuousClockIn;
    }

    public final void setContinuousClockIn(int i) {
        this.continuousClockIn = i;
    }

    public final List<CalendarItem> getCalender() {
        return this.calender;
    }

    public final void setCalender(List<CalendarItem> list) {
        this.calender = list;
    }

    /* compiled from: GoalTypeDetailBan.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan$CalendarItem;", "", "<init>", "()V", "monthIndex", "", "getMonthIndex", "()I", "setMonthIndex", "(I)V", "list", "", "Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan$CalendarItem$CalendarDetail;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "CalendarDetail", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CalendarItem {
        private List<CalendarDetail> list;
        private int monthIndex;

        public final int getMonthIndex() {
            return this.monthIndex;
        }

        public final void setMonthIndex(int i) {
            this.monthIndex = i;
        }

        public final List<CalendarDetail> getList() {
            return this.list;
        }

        public final void setList(List<CalendarDetail> list) {
            this.list = list;
        }

        /* compiled from: GoalTypeDetailBan.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan$CalendarItem$CalendarDetail;", "", "<init>", "()V", a.C0193a.k, "", "getDay", "()I", "setDay", "(I)V", "signFlag", "getSignFlag", "setSignFlag", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CalendarDetail {
            private int day;
            private int signFlag;

            public final int getDay() {
                return this.day;
            }

            public final void setDay(int i) {
                this.day = i;
            }

            public final int getSignFlag() {
                return this.signFlag;
            }

            public final void setSignFlag(int i) {
                this.signFlag = i;
            }
        }
    }
}
