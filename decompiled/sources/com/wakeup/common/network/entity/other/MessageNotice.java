package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageNotice.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/other/MessageNotice;", "", "isShow", "", "title", "", "<init>", "(ILjava/lang/String;)V", "()I", "setShow", "(I)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageNotice {
    private int isShow;
    private String title;

    public static /* synthetic */ MessageNotice copy$default(MessageNotice messageNotice, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageNotice.isShow;
        }
        if ((i2 & 2) != 0) {
            str = messageNotice.title;
        }
        return messageNotice.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIsShow() {
        return this.isShow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MessageNotice copy(int isShow, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MessageNotice(isShow, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageNotice)) {
            return false;
        }
        MessageNotice messageNotice = (MessageNotice) other;
        return this.isShow == messageNotice.isShow && Intrinsics.areEqual(this.title, messageNotice.title);
    }

    public int hashCode() {
        return (Integer.hashCode(this.isShow) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "MessageNotice(isShow=" + this.isShow + ", title=" + this.title + Separators.RPAREN;
    }

    public MessageNotice(int i, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.isShow = i;
        this.title = title;
    }

    public final int isShow() {
        return this.isShow;
    }

    public final void setShow(int i) {
        this.isShow = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
