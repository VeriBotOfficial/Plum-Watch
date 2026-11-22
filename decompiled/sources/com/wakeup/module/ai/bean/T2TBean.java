package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: T2TBeans.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/wakeup/module/ai/bean/T2TBean;", "", "status", "", "index", "message", "", "Lcom/wakeup/module/ai/bean/T2TMsg;", "<init>", "(IILjava/util/List;)V", "getStatus", "()I", "getIndex", "getMessage", "()Ljava/util/List;", "finish_reason", "", "getFinish_reason", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class T2TBean {
    private final String finish_reason;
    private final int index;
    private final List<T2TMsg> message;
    private final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ T2TBean copy$default(T2TBean t2TBean, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = t2TBean.status;
        }
        if ((i3 & 2) != 0) {
            i2 = t2TBean.index;
        }
        if ((i3 & 4) != 0) {
            list = t2TBean.message;
        }
        return t2TBean.copy(i, i2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final List<T2TMsg> component3() {
        return this.message;
    }

    public final T2TBean copy(int status, int index, List<T2TMsg> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new T2TBean(status, index, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof T2TBean)) {
            return false;
        }
        T2TBean t2TBean = (T2TBean) other;
        return this.status == t2TBean.status && this.index == t2TBean.index && Intrinsics.areEqual(this.message, t2TBean.message);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + Integer.hashCode(this.index)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "T2TBean(status=" + this.status + ", index=" + this.index + ", message=" + this.message + Separators.RPAREN;
    }

    public T2TBean(int i, int i2, List<T2TMsg> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = i;
        this.index = i2;
        this.message = message;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<T2TMsg> getMessage() {
        return this.message;
    }

    public final String getFinish_reason() {
        return this.finish_reason;
    }
}
