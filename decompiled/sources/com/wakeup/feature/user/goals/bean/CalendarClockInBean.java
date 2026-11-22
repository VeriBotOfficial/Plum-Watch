package com.wakeup.feature.user.goals.bean;

import com.anythink.core.common.e.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CalendarClockInBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/user/goals/bean/CalendarClockInBean;", "", "<init>", "()V", a.C0193a.j, "", "getMonth", "()J", "setMonth", "(J)V", "detailList", "", "Lcom/wakeup/feature/user/goals/bean/CalendarClockInDetailBean;", "getDetailList", "()Ljava/util/List;", "setDetailList", "(Ljava/util/List;)V", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarClockInBean {
    private List<CalendarClockInDetailBean> detailList = new ArrayList();
    private long month;

    public final long getMonth() {
        return this.month;
    }

    public final void setMonth(long j) {
        this.month = j;
    }

    public final List<CalendarClockInDetailBean> getDetailList() {
        return this.detailList;
    }

    public final void setDetailList(List<CalendarClockInDetailBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.detailList = list;
    }
}
