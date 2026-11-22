package com.wakeup.common.network.entity.aigc;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeikeAigc.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/aigc/SubmitBean;", "", "style", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "getContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubmitBean {
    private final String content;
    private final String style;

    public static /* synthetic */ SubmitBean copy$default(SubmitBean submitBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitBean.style;
        }
        if ((i & 2) != 0) {
            str2 = submitBean.content;
        }
        return submitBean.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final SubmitBean copy(String style, String content) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(content, "content");
        return new SubmitBean(style, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitBean)) {
            return false;
        }
        SubmitBean submitBean = (SubmitBean) other;
        return Intrinsics.areEqual(this.style, submitBean.style) && Intrinsics.areEqual(this.content, submitBean.content);
    }

    public int hashCode() {
        return (this.style.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        return "SubmitBean(style=" + this.style + ", content=" + this.content + Separators.RPAREN;
    }

    public SubmitBean(String style, String content) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(content, "content");
        this.style = style;
        this.content = content;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getContent() {
        return this.content;
    }
}
