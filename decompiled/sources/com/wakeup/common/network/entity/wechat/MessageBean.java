package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/MessageBean;", "", "TypeName", "", "Appid", "Wxid", "Data", "Lcom/wakeup/common/network/entity/wechat/MessageDataBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/wechat/MessageDataBean;)V", "getTypeName", "()Ljava/lang/String;", "getAppid", "getWxid", "getData", "()Lcom/wakeup/common/network/entity/wechat/MessageDataBean;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageBean {
    private final String Appid;
    private final MessageDataBean Data;
    private final String TypeName;
    private final String Wxid;

    public static /* synthetic */ MessageBean copy$default(MessageBean messageBean, String str, String str2, String str3, MessageDataBean messageDataBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageBean.TypeName;
        }
        if ((i & 2) != 0) {
            str2 = messageBean.Appid;
        }
        if ((i & 4) != 0) {
            str3 = messageBean.Wxid;
        }
        if ((i & 8) != 0) {
            messageDataBean = messageBean.Data;
        }
        return messageBean.copy(str, str2, str3, messageDataBean);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeName() {
        return this.TypeName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppid() {
        return this.Appid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWxid() {
        return this.Wxid;
    }

    /* renamed from: component4, reason: from getter */
    public final MessageDataBean getData() {
        return this.Data;
    }

    public final MessageBean copy(String TypeName, String Appid, String Wxid, MessageDataBean Data) {
        Intrinsics.checkNotNullParameter(TypeName, "TypeName");
        Intrinsics.checkNotNullParameter(Appid, "Appid");
        Intrinsics.checkNotNullParameter(Wxid, "Wxid");
        return new MessageBean(TypeName, Appid, Wxid, Data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBean)) {
            return false;
        }
        MessageBean messageBean = (MessageBean) other;
        return Intrinsics.areEqual(this.TypeName, messageBean.TypeName) && Intrinsics.areEqual(this.Appid, messageBean.Appid) && Intrinsics.areEqual(this.Wxid, messageBean.Wxid) && Intrinsics.areEqual(this.Data, messageBean.Data);
    }

    public int hashCode() {
        int hashCode = ((((this.TypeName.hashCode() * 31) + this.Appid.hashCode()) * 31) + this.Wxid.hashCode()) * 31;
        MessageDataBean messageDataBean = this.Data;
        return hashCode + (messageDataBean == null ? 0 : messageDataBean.hashCode());
    }

    public String toString() {
        return "MessageBean(TypeName=" + this.TypeName + ", Appid=" + this.Appid + ", Wxid=" + this.Wxid + ", Data=" + this.Data + Separators.RPAREN;
    }

    public MessageBean(String TypeName, String Appid, String Wxid, MessageDataBean messageDataBean) {
        Intrinsics.checkNotNullParameter(TypeName, "TypeName");
        Intrinsics.checkNotNullParameter(Appid, "Appid");
        Intrinsics.checkNotNullParameter(Wxid, "Wxid");
        this.TypeName = TypeName;
        this.Appid = Appid;
        this.Wxid = Wxid;
        this.Data = messageDataBean;
    }

    public final String getTypeName() {
        return this.TypeName;
    }

    public final String getAppid() {
        return this.Appid;
    }

    public final String getWxid() {
        return this.Wxid;
    }

    public final MessageDataBean getData() {
        return this.Data;
    }
}
