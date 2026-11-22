package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlanDetailTitleBean.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010'\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001c¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/course/PlanDetailTitleBean;", "Lcom/chad/library/adapter/base/entity/node/BaseExpandNode;", "Ljava/io/Serializable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", a.C0193a.k, "getDay", "setDay", "week", "", "getWeek", "()I", "setWeek", "(I)V", "isStartTime", "setStartTime", "exercisePlanDetailsVOList", "", "Lcom/wakeup/common/network/entity/course/PlanDetailContentBean;", "getExercisePlanDetailsVOList", "()Ljava/util/List;", "setExercisePlanDetailsVOList", "(Ljava/util/List;)V", "status", "", "getStatus", "()Z", "setStatus", "(Z)V", "childNode", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "getChildNode", "setChildNode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanDetailTitleBean extends BaseExpandNode implements Serializable {
    private List<PlanDetailContentBean> exercisePlanDetailsVOList;
    private int isStartTime;
    private boolean status;
    private int week;
    private String name = "";
    private String day = "";
    private List<BaseNode> childNode = new ArrayList();

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
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

    /* renamed from: isStartTime, reason: from getter */
    public final int getIsStartTime() {
        return this.isStartTime;
    }

    public final void setStartTime(int i) {
        this.isStartTime = i;
    }

    public final List<PlanDetailContentBean> getExercisePlanDetailsVOList() {
        return this.exercisePlanDetailsVOList;
    }

    public final void setExercisePlanDetailsVOList(List<PlanDetailContentBean> list) {
        this.exercisePlanDetailsVOList = list;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public List<BaseNode> getChildNode() {
        return this.childNode;
    }

    public void setChildNode(List<BaseNode> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.childNode = list;
    }

    public String toString() {
        return "PlanDetailTitleBean(name='" + this.name + "', day='" + this.day + "', week=" + this.week + ", status=" + this.status + ", childNode=" + getChildNode() + Separators.RPAREN;
    }
}
