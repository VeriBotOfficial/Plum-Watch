package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.wakeup.common.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlanDetailContentBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010=\u001a\u00020\u0010H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001a\u0010'\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001a\u0010/\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000bR\"\u00102\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u000103X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR\u0014\u0010;\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\t¨\u0006?"}, d2 = {"Lcom/wakeup/common/network/entity/course/PlanDetailContentBean;", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "<init>", "()V", "exerciseType", "", "getExerciseType", "()I", "setExerciseType", "(I)V", "courseId", "getCourseId", "setCourseId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "planImg", "getPlanImg", "setPlanImg", Constants.BundleKey.GRADE, "getGrade", "setGrade", Constants.BundleKey.KCAL, "getKcal", "setKcal", "min", "getMin", "setMin", a.C0193a.k, "getDay", "setDay", "week", "getWeek", "setWeek", "weekNum", "getWeekNum", "setWeekNum", "status", "getStatus", "setStatus", "isStartTime", "setStartTime", "courseCode", "getCourseCode", "setCourseCode", "childNode", "", "getChildNode", "()Ljava/util/List;", "setChildNode", "(Ljava/util/List;)V", "type", "getType", "setType", "itemType", "getItemType", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanDetailContentBean extends BaseNode implements MultiItemEntity, Serializable {
    public static final int OTHER = 5;
    public static final int REST = -1;
    public static final int UN_START = 2;
    private List<BaseNode> childNode;
    private int courseCode;
    private int courseId;
    private int exerciseType;
    private int grade;
    private int isStartTime;
    private int kcal;
    private int min;
    private int status;
    private int week;
    private int weekNum;
    private String name = "";
    private String planImg = "";
    private String day = "";
    private int type = 5;

    public final int getExerciseType() {
        return this.exerciseType;
    }

    public final void setExerciseType(int i) {
        this.exerciseType = i;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(int i) {
        this.courseId = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getPlanImg() {
        return this.planImg;
    }

    public final void setPlanImg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.planImg = str;
    }

    public final int getGrade() {
        return this.grade;
    }

    public final void setGrade(int i) {
        this.grade = i;
    }

    public final int getKcal() {
        return this.kcal;
    }

    public final void setKcal(int i) {
        this.kcal = i;
    }

    public final int getMin() {
        return this.min;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final String getDay() {
        return this.day;
    }

    public final void setDay(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.day = str;
    }

    public final int getWeek() {
        return this.week;
    }

    public final void setWeek(int i) {
        this.week = i;
    }

    public final int getWeekNum() {
        return this.weekNum;
    }

    public final void setWeekNum(int i) {
        this.weekNum = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    /* renamed from: isStartTime, reason: from getter */
    public final int getIsStartTime() {
        return this.isStartTime;
    }

    public final void setStartTime(int i) {
        this.isStartTime = i;
    }

    public final int getCourseCode() {
        return this.courseCode;
    }

    public final void setCourseCode(int i) {
        this.courseCode = i;
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public List<BaseNode> getChildNode() {
        return this.childNode;
    }

    public void setChildNode(List<BaseNode> list) {
        this.childNode = list;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return "PlanDetailContentBean(exerciseType=" + this.exerciseType + ", courseId=" + this.courseId + ", name='" + this.name + "', planImg='" + this.planImg + "', grade=" + this.grade + ", kcal=" + this.kcal + ", min=" + this.min + ", day='" + this.day + "', week=" + this.week + ", weekNum=" + this.weekNum + ", status=" + this.status + ", childNode=" + getChildNode() + Separators.RPAREN;
    }
}
