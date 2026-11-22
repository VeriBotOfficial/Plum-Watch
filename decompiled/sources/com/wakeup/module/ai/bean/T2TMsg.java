package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: T2TBeans.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/bean/T2TMsg;", "", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class T2TMsg {
    private final String content;

    public static /* synthetic */ T2TMsg copy$default(T2TMsg t2TMsg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = t2TMsg.content;
        }
        return t2TMsg.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final T2TMsg copy(String content) {
        return new T2TMsg(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof T2TMsg) && Intrinsics.areEqual(this.content, ((T2TMsg) other).content);
    }

    public int hashCode() {
        String str = this.content;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "T2TMsg(content=" + this.content + Separators.RPAREN;
    }

    public T2TMsg(String str) {
        this.content = str;
    }

    public final String getContent() {
        return this.content;
    }
}
