package com.wakeup.common.network.entity.schedule;

import kotlin.Metadata;

/* compiled from: ScheduleReminderModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/schedule/ScheduleReminderModel;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scheduleId", "getScheduleId", "setScheduleId", "reminderTime", "", "getReminderTime", "()J", "setReminderTime", "(J)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleReminderModel {
    private long reminderTime;
    private Integer id = 0;
    private Integer scheduleId = 0;

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final Integer getScheduleId() {
        return this.scheduleId;
    }

    public final void setScheduleId(Integer num) {
        this.scheduleId = num;
    }

    public final long getReminderTime() {
        return this.reminderTime;
    }

    public final void setReminderTime(long j) {
        this.reminderTime = j;
    }
}
