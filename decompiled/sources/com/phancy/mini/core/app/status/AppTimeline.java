package com.phancy.mini.core.app.status;

import kotlin.Metadata;

/* compiled from: AppTimeline.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/phancy/mini/core/app/status/AppTimeline;", "", "()V", "activityCreate", "", "getActivityCreate", "()J", "setActivityCreate", "(J)V", "appHomeBegin", "getAppHomeBegin", "setAppHomeBegin", "appHomeEnd", "getAppHomeEnd", "setAppHomeEnd", "appInfoBegin", "getAppInfoBegin", "setAppInfoBegin", "appInfoEnd", "getAppInfoEnd", "setAppInfoEnd", "appServiceBegin", "getAppServiceBegin", "setAppServiceBegin", "appServiceEnd", "getAppServiceEnd", "setAppServiceEnd", "appStart", "getAppStart", "setAppStart", "appZipBegin", "getAppZipBegin", "setAppZipBegin", "appZipEnd", "getAppZipEnd", "setAppZipEnd", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AppTimeline {
    private volatile long activityCreate;
    private volatile long appHomeBegin;
    private volatile long appHomeEnd;
    private volatile long appInfoBegin;
    private volatile long appInfoEnd;
    private volatile long appServiceBegin;
    private volatile long appServiceEnd;
    private volatile long appStart;
    private volatile long appZipBegin;
    private volatile long appZipEnd;

    public final long getAppStart() {
        return this.appStart;
    }

    public final void setAppStart(long j) {
        this.appStart = j;
    }

    public final long getActivityCreate() {
        return this.activityCreate;
    }

    public final void setActivityCreate(long j) {
        this.activityCreate = j;
    }

    public final long getAppInfoBegin() {
        return this.appInfoBegin;
    }

    public final void setAppInfoBegin(long j) {
        this.appInfoBegin = j;
    }

    public final long getAppInfoEnd() {
        return this.appInfoEnd;
    }

    public final void setAppInfoEnd(long j) {
        this.appInfoEnd = j;
    }

    public final long getAppZipBegin() {
        return this.appZipBegin;
    }

    public final void setAppZipBegin(long j) {
        this.appZipBegin = j;
    }

    public final long getAppZipEnd() {
        return this.appZipEnd;
    }

    public final void setAppZipEnd(long j) {
        this.appZipEnd = j;
    }

    public final long getAppHomeBegin() {
        return this.appHomeBegin;
    }

    public final void setAppHomeBegin(long j) {
        this.appHomeBegin = j;
    }

    public final long getAppServiceBegin() {
        return this.appServiceBegin;
    }

    public final void setAppServiceBegin(long j) {
        this.appServiceBegin = j;
    }

    public final long getAppServiceEnd() {
        return this.appServiceEnd;
    }

    public final void setAppServiceEnd(long j) {
        this.appServiceEnd = j;
    }

    public final long getAppHomeEnd() {
        return this.appHomeEnd;
    }

    public final void setAppHomeEnd(long j) {
        this.appHomeEnd = j;
    }
}
