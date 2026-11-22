package com.wakeup.feature.wkvideo.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WKVideoViewModelBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/RecentShow;", "", "itemId", "", "actionTime", "", "duration", "<init>", "(Ljava/lang/String;JJ)V", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "getActionTime", "()J", "setActionTime", "(J)V", "getDuration", "setDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecentShow {
    private long actionTime;
    private long duration;
    private String itemId;

    public static /* synthetic */ RecentShow copy$default(RecentShow recentShow, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentShow.itemId;
        }
        if ((i & 2) != 0) {
            j = recentShow.actionTime;
        }
        if ((i & 4) != 0) {
            j2 = recentShow.duration;
        }
        return recentShow.copy(str, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getActionTime() {
        return this.actionTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final RecentShow copy(String itemId, long actionTime, long duration) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new RecentShow(itemId, actionTime, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentShow)) {
            return false;
        }
        RecentShow recentShow = (RecentShow) other;
        return Intrinsics.areEqual(this.itemId, recentShow.itemId) && this.actionTime == recentShow.actionTime && this.duration == recentShow.duration;
    }

    public int hashCode() {
        return (((this.itemId.hashCode() * 31) + Long.hashCode(this.actionTime)) * 31) + Long.hashCode(this.duration);
    }

    public String toString() {
        return "RecentShow(itemId=" + this.itemId + ", actionTime=" + this.actionTime + ", duration=" + this.duration + Separators.RPAREN;
    }

    public RecentShow(String itemId, long j, long j2) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.itemId = itemId;
        this.actionTime = j;
        this.duration = j2;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final void setItemId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemId = str;
    }

    public final long getActionTime() {
        return this.actionTime;
    }

    public final void setActionTime(long j) {
        this.actionTime = j;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }
}
