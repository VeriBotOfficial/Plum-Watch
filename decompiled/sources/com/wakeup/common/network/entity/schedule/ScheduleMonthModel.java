package com.wakeup.common.network.entity.schedule;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleMonthModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/schedule/ScheduleMonthModel;", "", "<init>", "()V", "x", "", "getX", "()I", "setX", "(I)V", "fullDaySchedule", "", "Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "getFullDaySchedule", "()Ljava/util/List;", "setFullDaySchedule", "(Ljava/util/List;)V", "reminderSchedule", "getReminderSchedule", "setReminderSchedule", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleMonthModel {
    private List<ScheduleModel> fullDaySchedule = new ArrayList();
    private List<ScheduleModel> reminderSchedule = new ArrayList();
    private int x;

    public final int getX() {
        return this.x;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final List<ScheduleModel> getFullDaySchedule() {
        return this.fullDaySchedule;
    }

    public final void setFullDaySchedule(List<ScheduleModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.fullDaySchedule = list;
    }

    public final List<ScheduleModel> getReminderSchedule() {
        return this.reminderSchedule;
    }

    public final void setReminderSchedule(List<ScheduleModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.reminderSchedule = list;
    }

    public String toString() {
        return "ScheduleMonthModel(x=" + this.x + ", fullDaySchedule=" + this.fullDaySchedule + ", reminderSchedule=" + this.reminderSchedule + Separators.RPAREN;
    }
}
