package com.wakeup.module.jacket.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/wakeup/module/jacket/bean/TransBean;", "Ljava/io/Serializable;", "id", "", "sourceLan", "transLan", "createTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getSourceLan", "getTransLan", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransBean implements Serializable {
    private final long createTime;
    private final String id;
    private final String sourceLan;
    private final String transLan;

    public static /* synthetic */ TransBean copy$default(TransBean transBean, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transBean.id;
        }
        if ((i & 2) != 0) {
            str2 = transBean.sourceLan;
        }
        if ((i & 4) != 0) {
            str3 = transBean.transLan;
        }
        if ((i & 8) != 0) {
            j = transBean.createTime;
        }
        String str4 = str3;
        return transBean.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceLan() {
        return this.sourceLan;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransLan() {
        return this.transLan;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final TransBean copy(String id2, String sourceLan, String transLan, long createTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(sourceLan, "sourceLan");
        Intrinsics.checkNotNullParameter(transLan, "transLan");
        return new TransBean(id2, sourceLan, transLan, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransBean)) {
            return false;
        }
        TransBean transBean = (TransBean) other;
        return Intrinsics.areEqual(this.id, transBean.id) && Intrinsics.areEqual(this.sourceLan, transBean.sourceLan) && Intrinsics.areEqual(this.transLan, transBean.transLan) && this.createTime == transBean.createTime;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.sourceLan.hashCode()) * 31) + this.transLan.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "TransBean(id=" + this.id + ", sourceLan=" + this.sourceLan + ", transLan=" + this.transLan + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public TransBean(String id2, String sourceLan, String transLan, long j) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(sourceLan, "sourceLan");
        Intrinsics.checkNotNullParameter(transLan, "transLan");
        this.id = id2;
        this.sourceLan = sourceLan;
        this.transLan = transLan;
        this.createTime = j;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSourceLan() {
        return this.sourceLan;
    }

    public final String getTransLan() {
        return this.transLan;
    }

    public final long getCreateTime() {
        return this.createTime;
    }
}
