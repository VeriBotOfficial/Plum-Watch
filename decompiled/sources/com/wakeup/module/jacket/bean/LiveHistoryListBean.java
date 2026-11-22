package com.wakeup.module.jacket.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveHistoryListBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/wakeup/module/jacket/bean/LiveHistoryListBean;", "", "id", "", "type", "name", "", "time", "", "<init>", "(IILjava/lang/String;J)V", "getId", "()I", "setId", "(I)V", "getType", "setType", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LiveHistoryListBean {
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_VIDEO = 0;
    private int id;
    private String name;
    private long time;
    private int type;

    public static /* synthetic */ LiveHistoryListBean copy$default(LiveHistoryListBean liveHistoryListBean, int i, int i2, String str, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = liveHistoryListBean.id;
        }
        if ((i3 & 2) != 0) {
            i2 = liveHistoryListBean.type;
        }
        if ((i3 & 4) != 0) {
            str = liveHistoryListBean.name;
        }
        if ((i3 & 8) != 0) {
            j = liveHistoryListBean.time;
        }
        String str2 = str;
        return liveHistoryListBean.copy(i, i2, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final LiveHistoryListBean copy(int id2, int type, String name, long time) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LiveHistoryListBean(id2, type, name, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveHistoryListBean)) {
            return false;
        }
        LiveHistoryListBean liveHistoryListBean = (LiveHistoryListBean) other;
        return this.id == liveHistoryListBean.id && this.type == liveHistoryListBean.type && Intrinsics.areEqual(this.name, liveHistoryListBean.name) && this.time == liveHistoryListBean.time;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.type)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "LiveHistoryListBean(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", time=" + this.time + Separators.RPAREN;
    }

    public LiveHistoryListBean(int i, int i2, String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.type = i2;
        this.name = name;
        this.time = j;
    }

    public /* synthetic */ LiveHistoryListBean(int i, int i2, String str, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, str, j);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
