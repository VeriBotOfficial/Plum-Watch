package com.wakeup.common.network.entity;

import android.gov.nist.core.Separators;
import com.heytap.mcssdk.constant.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrainEntityBean.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/network/entity/TrainEntityBean;", "", "<init>", "()V", "RequestAddTrainPlanBean", "SaveSportMovementBean", "SaveCustomPlanBean", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrainEntityBean {
    public static final TrainEntityBean INSTANCE = new TrainEntityBean();

    private TrainEntityBean() {
    }

    /* compiled from: TrainEntityBean.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/TrainEntityBean$RequestAddTrainPlanBean;", "", b.s, "", "runningList", "", "", "courseList", "remindTime", "", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getStartDate", "()J", "setStartDate", "(J)V", "getRunningList", "()Ljava/util/List;", "getCourseList", "getRemindTime", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestAddTrainPlanBean {
        private final List<Integer> courseList;
        private final String remindTime;
        private final List<Integer> runningList;
        private long startDate;

        public static /* synthetic */ RequestAddTrainPlanBean copy$default(RequestAddTrainPlanBean requestAddTrainPlanBean, long j, List list, List list2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = requestAddTrainPlanBean.startDate;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                list = requestAddTrainPlanBean.runningList;
            }
            List list3 = list;
            if ((i & 4) != 0) {
                list2 = requestAddTrainPlanBean.courseList;
            }
            List list4 = list2;
            if ((i & 8) != 0) {
                str = requestAddTrainPlanBean.remindTime;
            }
            return requestAddTrainPlanBean.copy(j2, list3, list4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartDate() {
            return this.startDate;
        }

        public final List<Integer> component2() {
            return this.runningList;
        }

        public final List<Integer> component3() {
            return this.courseList;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRemindTime() {
            return this.remindTime;
        }

        public final RequestAddTrainPlanBean copy(long startDate, List<Integer> runningList, List<Integer> courseList, String remindTime) {
            Intrinsics.checkNotNullParameter(runningList, "runningList");
            Intrinsics.checkNotNullParameter(courseList, "courseList");
            Intrinsics.checkNotNullParameter(remindTime, "remindTime");
            return new RequestAddTrainPlanBean(startDate, runningList, courseList, remindTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestAddTrainPlanBean)) {
                return false;
            }
            RequestAddTrainPlanBean requestAddTrainPlanBean = (RequestAddTrainPlanBean) other;
            return this.startDate == requestAddTrainPlanBean.startDate && Intrinsics.areEqual(this.runningList, requestAddTrainPlanBean.runningList) && Intrinsics.areEqual(this.courseList, requestAddTrainPlanBean.courseList) && Intrinsics.areEqual(this.remindTime, requestAddTrainPlanBean.remindTime);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.startDate) * 31) + this.runningList.hashCode()) * 31) + this.courseList.hashCode()) * 31) + this.remindTime.hashCode();
        }

        public String toString() {
            return "RequestAddTrainPlanBean(startDate=" + this.startDate + ", runningList=" + this.runningList + ", courseList=" + this.courseList + ", remindTime=" + this.remindTime + Separators.RPAREN;
        }

        public RequestAddTrainPlanBean(long j, List<Integer> runningList, List<Integer> courseList, String remindTime) {
            Intrinsics.checkNotNullParameter(runningList, "runningList");
            Intrinsics.checkNotNullParameter(courseList, "courseList");
            Intrinsics.checkNotNullParameter(remindTime, "remindTime");
            this.startDate = j;
            this.runningList = runningList;
            this.courseList = courseList;
            this.remindTime = remindTime;
        }

        public final long getStartDate() {
            return this.startDate;
        }

        public final void setStartDate(long j) {
            this.startDate = j;
        }

        public final List<Integer> getRunningList() {
            return this.runningList;
        }

        public final List<Integer> getCourseList() {
            return this.courseList;
        }

        public final String getRemindTime() {
            return this.remindTime;
        }
    }

    /* compiled from: TrainEntityBean.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u009c\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006?"}, d2 = {"Lcom/wakeup/common/network/entity/TrainEntityBean$SaveSportMovementBean;", "", "userId", "", "courseId", "", "courseType", "courseActionId", "name", "", "avgHeartRate", "keyword", "saveType", "actionCount", "motionDuration", "fromType", "appTime", "consumeKcal", "", "createTime", "<init>", "(IJIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIJIJDJ)V", "getUserId", "()I", "getCourseId", "()J", "getCourseType", "getCourseActionId", "getName", "()Ljava/lang/String;", "getAvgHeartRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKeyword", "getSaveType", "getActionCount", "getMotionDuration", "getFromType", "getAppTime", "getConsumeKcal", "()D", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(IJIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIJIJDJ)Lcom/wakeup/common/network/entity/TrainEntityBean$SaveSportMovementBean;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveSportMovementBean {
        private final int actionCount;
        private final long appTime;
        private final Integer avgHeartRate;
        private final double consumeKcal;
        private final int courseActionId;
        private final long courseId;
        private final int courseType;
        private final long createTime;
        private final int fromType;
        private final String keyword;
        private final long motionDuration;
        private final String name;
        private final int saveType;
        private final int userId;

        public static /* synthetic */ SaveSportMovementBean copy$default(SaveSportMovementBean saveSportMovementBean, int i, long j, int i2, int i3, String str, Integer num, String str2, int i4, int i5, long j2, int i6, long j3, double d, long j4, int i7, Object obj) {
            long j5;
            long j6;
            long j7;
            double d2;
            int i8 = (i7 & 1) != 0 ? saveSportMovementBean.userId : i;
            long j8 = (i7 & 2) != 0 ? saveSportMovementBean.courseId : j;
            int i9 = (i7 & 4) != 0 ? saveSportMovementBean.courseType : i2;
            int i10 = (i7 & 8) != 0 ? saveSportMovementBean.courseActionId : i3;
            String str3 = (i7 & 16) != 0 ? saveSportMovementBean.name : str;
            Integer num2 = (i7 & 32) != 0 ? saveSportMovementBean.avgHeartRate : num;
            String str4 = (i7 & 64) != 0 ? saveSportMovementBean.keyword : str2;
            int i11 = (i7 & 128) != 0 ? saveSportMovementBean.saveType : i4;
            int i12 = (i7 & 256) != 0 ? saveSportMovementBean.actionCount : i5;
            long j9 = (i7 & 512) != 0 ? saveSportMovementBean.motionDuration : j2;
            int i13 = (i7 & 1024) != 0 ? saveSportMovementBean.fromType : i6;
            int i14 = i8;
            if ((i7 & 2048) != 0) {
                j5 = j8;
                j6 = saveSportMovementBean.appTime;
            } else {
                j5 = j8;
                j6 = j3;
            }
            long j10 = j6;
            double d3 = (i7 & 4096) != 0 ? saveSportMovementBean.consumeKcal : d;
            if ((i7 & 8192) != 0) {
                d2 = d3;
                j7 = saveSportMovementBean.createTime;
            } else {
                j7 = j4;
                d2 = d3;
            }
            return saveSportMovementBean.copy(i14, j5, i9, i10, str3, num2, str4, i11, i12, j9, i13, j10, d2, j7);
        }

        /* renamed from: component1, reason: from getter */
        public final int getUserId() {
            return this.userId;
        }

        /* renamed from: component10, reason: from getter */
        public final long getMotionDuration() {
            return this.motionDuration;
        }

        /* renamed from: component11, reason: from getter */
        public final int getFromType() {
            return this.fromType;
        }

        /* renamed from: component12, reason: from getter */
        public final long getAppTime() {
            return this.appTime;
        }

        /* renamed from: component13, reason: from getter */
        public final double getConsumeKcal() {
            return this.consumeKcal;
        }

        /* renamed from: component14, reason: from getter */
        public final long getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCourseId() {
            return this.courseId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCourseType() {
            return this.courseType;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCourseActionId() {
            return this.courseActionId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getAvgHeartRate() {
            return this.avgHeartRate;
        }

        /* renamed from: component7, reason: from getter */
        public final String getKeyword() {
            return this.keyword;
        }

        /* renamed from: component8, reason: from getter */
        public final int getSaveType() {
            return this.saveType;
        }

        /* renamed from: component9, reason: from getter */
        public final int getActionCount() {
            return this.actionCount;
        }

        public final SaveSportMovementBean copy(int userId, long courseId, int courseType, int courseActionId, String name, Integer avgHeartRate, String keyword, int saveType, int actionCount, long motionDuration, int fromType, long appTime, double consumeKcal, long createTime) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            return new SaveSportMovementBean(userId, courseId, courseType, courseActionId, name, avgHeartRate, keyword, saveType, actionCount, motionDuration, fromType, appTime, consumeKcal, createTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveSportMovementBean)) {
                return false;
            }
            SaveSportMovementBean saveSportMovementBean = (SaveSportMovementBean) other;
            return this.userId == saveSportMovementBean.userId && this.courseId == saveSportMovementBean.courseId && this.courseType == saveSportMovementBean.courseType && this.courseActionId == saveSportMovementBean.courseActionId && Intrinsics.areEqual(this.name, saveSportMovementBean.name) && Intrinsics.areEqual(this.avgHeartRate, saveSportMovementBean.avgHeartRate) && Intrinsics.areEqual(this.keyword, saveSportMovementBean.keyword) && this.saveType == saveSportMovementBean.saveType && this.actionCount == saveSportMovementBean.actionCount && this.motionDuration == saveSportMovementBean.motionDuration && this.fromType == saveSportMovementBean.fromType && this.appTime == saveSportMovementBean.appTime && Double.compare(this.consumeKcal, saveSportMovementBean.consumeKcal) == 0 && this.createTime == saveSportMovementBean.createTime;
        }

        public int hashCode() {
            int hashCode = ((((((((Integer.hashCode(this.userId) * 31) + Long.hashCode(this.courseId)) * 31) + Integer.hashCode(this.courseType)) * 31) + Integer.hashCode(this.courseActionId)) * 31) + this.name.hashCode()) * 31;
            Integer num = this.avgHeartRate;
            return ((((((((((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.keyword.hashCode()) * 31) + Integer.hashCode(this.saveType)) * 31) + Integer.hashCode(this.actionCount)) * 31) + Long.hashCode(this.motionDuration)) * 31) + Integer.hashCode(this.fromType)) * 31) + Long.hashCode(this.appTime)) * 31) + Double.hashCode(this.consumeKcal)) * 31) + Long.hashCode(this.createTime);
        }

        public String toString() {
            return "SaveSportMovementBean(userId=" + this.userId + ", courseId=" + this.courseId + ", courseType=" + this.courseType + ", courseActionId=" + this.courseActionId + ", name=" + this.name + ", avgHeartRate=" + this.avgHeartRate + ", keyword=" + this.keyword + ", saveType=" + this.saveType + ", actionCount=" + this.actionCount + ", motionDuration=" + this.motionDuration + ", fromType=" + this.fromType + ", appTime=" + this.appTime + ", consumeKcal=" + this.consumeKcal + ", createTime=" + this.createTime + Separators.RPAREN;
        }

        public SaveSportMovementBean(int i, long j, int i2, int i3, String name, Integer num, String keyword, int i4, int i5, long j2, int i6, long j3, double d, long j4) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            this.userId = i;
            this.courseId = j;
            this.courseType = i2;
            this.courseActionId = i3;
            this.name = name;
            this.avgHeartRate = num;
            this.keyword = keyword;
            this.saveType = i4;
            this.actionCount = i5;
            this.motionDuration = j2;
            this.fromType = i6;
            this.appTime = j3;
            this.consumeKcal = d;
            this.createTime = j4;
        }

        public /* synthetic */ SaveSportMovementBean(int i, long j, int i2, int i3, String str, Integer num, String str2, int i4, int i5, long j2, int i6, long j3, double d, long j4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j, i2, i3, str, (i7 & 32) != 0 ? null : num, str2, i4, i5, j2, i6, j3, d, j4);
        }

        public final int getUserId() {
            return this.userId;
        }

        public final long getCourseId() {
            return this.courseId;
        }

        public final int getCourseType() {
            return this.courseType;
        }

        public final int getCourseActionId() {
            return this.courseActionId;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getAvgHeartRate() {
            return this.avgHeartRate;
        }

        public final String getKeyword() {
            return this.keyword;
        }

        public final int getSaveType() {
            return this.saveType;
        }

        public final int getActionCount() {
            return this.actionCount;
        }

        public final long getMotionDuration() {
            return this.motionDuration;
        }

        public final int getFromType() {
            return this.fromType;
        }

        public final long getAppTime() {
            return this.appTime;
        }

        public final double getConsumeKcal() {
            return this.consumeKcal;
        }

        public final long getCreateTime() {
            return this.createTime;
        }
    }

    /* compiled from: TrainEntityBean.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/TrainEntityBean$SaveCustomPlanBean;", "", b.s, "", "remindTime", "", "planModelId", "", "dayList", "", "<init>", "(JLjava/lang/String;ILjava/util/List;)V", "getStartDate", "()J", "getRemindTime", "()Ljava/lang/String;", "getPlanModelId", "()I", "getDayList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveCustomPlanBean {
        private final List<Long> dayList;
        private final int planModelId;
        private final String remindTime;
        private final long startDate;

        public static /* synthetic */ SaveCustomPlanBean copy$default(SaveCustomPlanBean saveCustomPlanBean, long j, String str, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = saveCustomPlanBean.startDate;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                str = saveCustomPlanBean.remindTime;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                i = saveCustomPlanBean.planModelId;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                list = saveCustomPlanBean.dayList;
            }
            return saveCustomPlanBean.copy(j2, str2, i3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStartDate() {
            return this.startDate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRemindTime() {
            return this.remindTime;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPlanModelId() {
            return this.planModelId;
        }

        public final List<Long> component4() {
            return this.dayList;
        }

        public final SaveCustomPlanBean copy(long startDate, String remindTime, int planModelId, List<Long> dayList) {
            Intrinsics.checkNotNullParameter(remindTime, "remindTime");
            Intrinsics.checkNotNullParameter(dayList, "dayList");
            return new SaveCustomPlanBean(startDate, remindTime, planModelId, dayList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveCustomPlanBean)) {
                return false;
            }
            SaveCustomPlanBean saveCustomPlanBean = (SaveCustomPlanBean) other;
            return this.startDate == saveCustomPlanBean.startDate && Intrinsics.areEqual(this.remindTime, saveCustomPlanBean.remindTime) && this.planModelId == saveCustomPlanBean.planModelId && Intrinsics.areEqual(this.dayList, saveCustomPlanBean.dayList);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.startDate) * 31) + this.remindTime.hashCode()) * 31) + Integer.hashCode(this.planModelId)) * 31) + this.dayList.hashCode();
        }

        public String toString() {
            return "SaveCustomPlanBean(startDate=" + this.startDate + ", remindTime=" + this.remindTime + ", planModelId=" + this.planModelId + ", dayList=" + this.dayList + Separators.RPAREN;
        }

        public SaveCustomPlanBean(long j, String remindTime, int i, List<Long> dayList) {
            Intrinsics.checkNotNullParameter(remindTime, "remindTime");
            Intrinsics.checkNotNullParameter(dayList, "dayList");
            this.startDate = j;
            this.remindTime = remindTime;
            this.planModelId = i;
            this.dayList = dayList;
        }

        public final long getStartDate() {
            return this.startDate;
        }

        public final String getRemindTime() {
            return this.remindTime;
        }

        public final int getPlanModelId() {
            return this.planModelId;
        }

        public final List<Long> getDayList() {
            return this.dayList;
        }
    }
}
