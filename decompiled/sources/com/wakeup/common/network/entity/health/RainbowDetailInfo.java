package com.wakeup.common.network.entity.health;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RainbowDetailInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/health/RainbowDetailInfo;", "", "<init>", "()V", "lastWeekData", "", "getLastWeekData", "()I", "setLastWeekData", "(I)V", "currentData", "getCurrentData", "setCurrentData", "dataList", "", "Lcom/wakeup/common/network/entity/health/RainbowDetailInfo$ListBean;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "ListBean", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RainbowDetailInfo {
    private int currentData;
    private List<ListBean> dataList = new ArrayList();
    private int lastWeekData;

    public final int getLastWeekData() {
        return this.lastWeekData;
    }

    public final void setLastWeekData(int i) {
        this.lastWeekData = i;
    }

    public final int getCurrentData() {
        return this.currentData;
    }

    public final void setCurrentData(int i) {
        this.currentData = i;
    }

    public final List<ListBean> getDataList() {
        return this.dataList;
    }

    public final void setDataList(List<ListBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    /* compiled from: RainbowDetailInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/health/RainbowDetailInfo$ListBean;", "", "<init>", "()V", "x", "", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ListBean {
        private int x;
        private int y;

        public final int getX() {
            return this.x;
        }

        public final void setX(int i) {
            this.x = i;
        }

        public final int getY() {
            return this.y;
        }

        public final void setY(int i) {
            this.y = i;
        }
    }
}
