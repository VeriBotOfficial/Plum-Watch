package com.wakeup.common.network.entity.schedule;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.heytap.mcssdk.constant.b;
import com.umeng.analytics.AnalyticsConfig;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ScheduleModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002BE\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010I\u001a\u00020\u0004H\u0016R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001e\u00106\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001e\u00109\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001e\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001e\u0010B\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0018\"\u0004\bF\u0010\u001aR\u0014\u0010G\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010&¨\u0006J"}, d2 = {"Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "title", "", "remark", AnalyticsConfig.RTD_START_TIME, "", "endTime", "source", "", "allDay", "dayNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIII)V", "()V", "id", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "systemScheduleId", "getSystemScheduleId", "()Ljava/lang/String;", "setSystemScheduleId", "(Ljava/lang/String;)V", "getTitle", d.p, "getRemark", "setRemark", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getSource", "()I", "setSource", "(I)V", "getAllDay", "setAllDay", "getDayNo", "setDayNo", "reminderList", "", "getReminderList", "()Ljava/util/List;", "setReminderList", "(Ljava/util/List;)V", b.p, "getRule", "setRule", "startInventedTime", "getStartInventedTime", "setStartInventedTime", "endInventedTime", "getEndInventedTime", "setEndInventedTime", "isHoliday", "", "()Ljava/lang/Boolean;", "setHoliday", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isNotify", "setNotify", "mac", "getMac", "setMac", "itemType", "getItemType", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleModel implements MultiItemEntity, Serializable {
    private int allDay;
    private int dayNo;
    private Long endInventedTime;
    private long endTime;
    private Long id;
    private Boolean isHoliday;
    private Boolean isNotify;
    private String mac;
    private String remark;
    private List<Long> reminderList;
    private String rule;
    private int source;
    private Long startInventedTime;
    private long startTime;
    private String systemScheduleId;
    private String title;

    public final Long getId() {
        return this.id;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final String getSystemScheduleId() {
        return this.systemScheduleId;
    }

    public final void setSystemScheduleId(String str) {
        this.systemScheduleId = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final int getSource() {
        return this.source;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final int getAllDay() {
        return this.allDay;
    }

    public final void setAllDay(int i) {
        this.allDay = i;
    }

    public final int getDayNo() {
        return this.dayNo;
    }

    public final void setDayNo(int i) {
        this.dayNo = i;
    }

    public final List<Long> getReminderList() {
        return this.reminderList;
    }

    public final void setReminderList(List<Long> list) {
        this.reminderList = list;
    }

    public final String getRule() {
        return this.rule;
    }

    public final void setRule(String str) {
        this.rule = str;
    }

    public final Long getStartInventedTime() {
        return this.startInventedTime;
    }

    public final void setStartInventedTime(Long l) {
        this.startInventedTime = l;
    }

    public final Long getEndInventedTime() {
        return this.endInventedTime;
    }

    public final void setEndInventedTime(Long l) {
        this.endInventedTime = l;
    }

    /* renamed from: isHoliday, reason: from getter */
    public final Boolean getIsHoliday() {
        return this.isHoliday;
    }

    public final void setHoliday(Boolean bool) {
        this.isHoliday = bool;
    }

    /* renamed from: isNotify, reason: from getter */
    public final Boolean getIsNotify() {
        return this.isNotify;
    }

    public final void setNotify(Boolean bool) {
        this.isNotify = bool;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    public ScheduleModel(String str, String str2, long j, long j2, int i, int i2, int i3) {
        this.title = str;
        this.remark = str2;
        this.startTime = j;
        this.endTime = j2;
        this.source = i;
        this.allDay = i2;
        this.dayNo = i3;
    }

    public ScheduleModel() {
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.allDay;
    }

    public String toString() {
        return "ScheduleModel(id=" + this.id + ", systemScheduleId=" + this.systemScheduleId + ", title=" + this.title + ", remark=" + this.remark + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", source=" + this.source + ", allDay=" + this.allDay + ", dayNo=" + this.dayNo + ", reminderList=" + this.reminderList + ", rule=" + this.rule + ", mac=" + this.mac + Separators.RPAREN;
    }
}
