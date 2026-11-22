package com.wakeup.common.network.entity.schedule;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleDateModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/schedule/ScheduleDateModel;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "<init>", "()V", "isAllDay", "", "()Z", "setAllDay", "(Z)V", Constants.BundleKey.TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "detailList", "", "Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "getDetailList", "()Ljava/util/List;", "setDetailList", "(Ljava/util/List;)V", "itemType", "", "getItemType", "()I", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleDateModel implements MultiItemEntity {
    private List<ScheduleModel> detailList = new ArrayList();
    private boolean isAllDay;
    private long timeStamp;

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType */
    public int getType() {
        return 0;
    }

    /* renamed from: isAllDay, reason: from getter */
    public final boolean getIsAllDay() {
        return this.isAllDay;
    }

    public final void setAllDay(boolean z) {
        this.isAllDay = z;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final List<ScheduleModel> getDetailList() {
        return this.detailList;
    }

    public final void setDetailList(List<ScheduleModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.detailList = list;
    }
}
