package com.wakeup.common.network.entity.xunfei;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XunfeiLfaRsp.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/xunfei/XFBaseRsp;", "T", "", "code", "", "descInfo", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getDescInfo", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/wakeup/common/network/entity/xunfei/XFBaseRsp;", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XFBaseRsp<T> {
    private final String code;
    private final T content;
    private final String descInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XFBaseRsp copy$default(XFBaseRsp xFBaseRsp, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = xFBaseRsp.code;
        }
        if ((i & 2) != 0) {
            str2 = xFBaseRsp.descInfo;
        }
        if ((i & 4) != 0) {
            obj = xFBaseRsp.content;
        }
        return xFBaseRsp.copy(str, str2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescInfo() {
        return this.descInfo;
    }

    public final T component3() {
        return this.content;
    }

    public final XFBaseRsp<T> copy(String code, String descInfo, T content) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(descInfo, "descInfo");
        return new XFBaseRsp<>(code, descInfo, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XFBaseRsp)) {
            return false;
        }
        XFBaseRsp xFBaseRsp = (XFBaseRsp) other;
        return Intrinsics.areEqual(this.code, xFBaseRsp.code) && Intrinsics.areEqual(this.descInfo, xFBaseRsp.descInfo) && Intrinsics.areEqual(this.content, xFBaseRsp.content);
    }

    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.descInfo.hashCode()) * 31;
        T t = this.content;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "XFBaseRsp(code=" + this.code + ", descInfo=" + this.descInfo + ", content=" + this.content + Separators.RPAREN;
    }

    public XFBaseRsp(String code, String descInfo, T t) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(descInfo, "descInfo");
        this.code = code;
        this.descInfo = descInfo;
        this.content = t;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescInfo() {
        return this.descInfo;
    }

    public final T getContent() {
        return this.content;
    }
}
