package com.wakeup.feature.sport.bean;

import com.wakeup.common.network.entity.sport.SportTypeTotal;
import com.wakeup.commponent.module.data.SportData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportListBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020(0!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&¨\u0006+"}, d2 = {"Lcom/wakeup/feature/sport/bean/SportListBean;", "", "<init>", "()V", "dayNo", "", "getDayNo", "()I", "setDayNo", "(I)V", "totalDistance", "getTotalDistance", "setTotalDistance", "totalTime", "getTotalTime", "setTotalTime", "totalNumber", "getTotalNumber", "setTotalNumber", "totalKcal", "", "getTotalKcal", "()F", "setTotalKcal", "(F)V", "isExpanded", "", "()Z", "setExpanded", "(Z)V", "isTypeExpanded", "setTypeExpanded", "statisticsList", "", "Lcom/wakeup/common/network/entity/sport/SportTypeTotal;", "getStatisticsList", "()Ljava/util/List;", "setStatisticsList", "(Ljava/util/List;)V", "dataList", "Lcom/wakeup/commponent/module/data/SportData;", "getDataList", "setDataList", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportListBean {
    private List<SportData> dataList = new ArrayList();
    private int dayNo;
    private boolean isExpanded;
    private boolean isTypeExpanded;
    private List<SportTypeTotal> statisticsList;
    private int totalDistance;
    private float totalKcal;
    private int totalNumber;
    private int totalTime;

    public final int getDayNo() {
        return this.dayNo;
    }

    public final void setDayNo(int i) {
        this.dayNo = i;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final void setTotalTime(int i) {
        this.totalTime = i;
    }

    public final int getTotalNumber() {
        return this.totalNumber;
    }

    public final void setTotalNumber(int i) {
        this.totalNumber = i;
    }

    public final float getTotalKcal() {
        return this.totalKcal;
    }

    public final void setTotalKcal(float f) {
        this.totalKcal = f;
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    /* renamed from: isTypeExpanded, reason: from getter */
    public final boolean getIsTypeExpanded() {
        return this.isTypeExpanded;
    }

    public final void setTypeExpanded(boolean z) {
        this.isTypeExpanded = z;
    }

    public final List<SportTypeTotal> getStatisticsList() {
        return this.statisticsList;
    }

    public final void setStatisticsList(List<SportTypeTotal> list) {
        this.statisticsList = list;
    }

    public final List<SportData> getDataList() {
        return this.dataList;
    }

    public final void setDataList(List<SportData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }
}
