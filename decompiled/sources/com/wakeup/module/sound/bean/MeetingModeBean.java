package com.wakeup.module.sound.bean;

import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingModeBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/wakeup/module/sound/bean/MeetingModeBean;", "", "<init>", "()V", "id", "", "getId", "()I", "setId", "(I)V", "title", "", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "duration", "getDuration", "setDuration", "text", "getText", "setText", "summaryText", "getSummaryText", "setSummaryText", "meetTheme", "getMeetTheme", "setMeetTheme", "meetPerson", "getMeetPerson", "setMeetPerson", "meetAddress", "getMeetAddress", "setMeetAddress", "feature-sound_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MeetingModeBean {
    private int duration;
    private int id;
    private long time;
    private String title = "";
    private String text = "";
    private String summaryText = "";
    private String meetTheme = "";
    private String meetPerson = "";
    private String meetAddress = "";

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final void setSummaryText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summaryText = str;
    }

    public final String getMeetTheme() {
        return this.meetTheme;
    }

    public final void setMeetTheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetTheme = str;
    }

    public final String getMeetPerson() {
        return this.meetPerson;
    }

    public final void setMeetPerson(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetPerson = str;
    }

    public final String getMeetAddress() {
        return this.meetAddress;
    }

    public final void setMeetAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetAddress = str;
    }
}
