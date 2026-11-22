package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018JZ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/wechat/SendMsgBean;", "", "code", "", "msg", "toWxid", "createTime", "", RemoteMessageConst.MSGID, "", "newMsgId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getMsg", "getToWxid", "getCreateTime", "()J", "getMsgId", "()I", "getNewMsgId", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/Integer;)Lcom/wakeup/common/network/entity/wechat/SendMsgBean;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SendMsgBean {
    private final String code;
    private final long createTime;
    private final String msg;
    private final int msgId;
    private final long newMsgId;
    private final String toWxid;
    private final Integer type;

    public static /* synthetic */ SendMsgBean copy$default(SendMsgBean sendMsgBean, String str, String str2, String str3, long j, int i, long j2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendMsgBean.code;
        }
        if ((i2 & 2) != 0) {
            str2 = sendMsgBean.msg;
        }
        if ((i2 & 4) != 0) {
            str3 = sendMsgBean.toWxid;
        }
        if ((i2 & 8) != 0) {
            j = sendMsgBean.createTime;
        }
        if ((i2 & 16) != 0) {
            i = sendMsgBean.msgId;
        }
        if ((i2 & 32) != 0) {
            j2 = sendMsgBean.newMsgId;
        }
        if ((i2 & 64) != 0) {
            num = sendMsgBean.type;
        }
        int i3 = i;
        long j3 = j;
        String str4 = str3;
        return sendMsgBean.copy(str, str2, str4, j3, i3, j2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final String getToWxid() {
        return this.toWxid;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMsgId() {
        return this.msgId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getNewMsgId() {
        return this.newMsgId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    public final SendMsgBean copy(String code, String msg, String toWxid, long createTime, int msgId, long newMsgId, Integer type) {
        Intrinsics.checkNotNullParameter(toWxid, "toWxid");
        return new SendMsgBean(code, msg, toWxid, createTime, msgId, newMsgId, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMsgBean)) {
            return false;
        }
        SendMsgBean sendMsgBean = (SendMsgBean) other;
        return Intrinsics.areEqual(this.code, sendMsgBean.code) && Intrinsics.areEqual(this.msg, sendMsgBean.msg) && Intrinsics.areEqual(this.toWxid, sendMsgBean.toWxid) && this.createTime == sendMsgBean.createTime && this.msgId == sendMsgBean.msgId && this.newMsgId == sendMsgBean.newMsgId && Intrinsics.areEqual(this.type, sendMsgBean.type);
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int hashCode2 = (((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.toWxid.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.msgId)) * 31) + Long.hashCode(this.newMsgId)) * 31;
        Integer num = this.type;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SendMsgBean(code=" + this.code + ", msg=" + this.msg + ", toWxid=" + this.toWxid + ", createTime=" + this.createTime + ", msgId=" + this.msgId + ", newMsgId=" + this.newMsgId + ", type=" + this.type + Separators.RPAREN;
    }

    public SendMsgBean(String str, String str2, String toWxid, long j, int i, long j2, Integer num) {
        Intrinsics.checkNotNullParameter(toWxid, "toWxid");
        this.code = str;
        this.msg = str2;
        this.toWxid = toWxid;
        this.createTime = j;
        this.msgId = i;
        this.newMsgId = j2;
        this.type = num;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getToWxid() {
        return this.toWxid;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getMsgId() {
        return this.msgId;
    }

    public final long getNewMsgId() {
        return this.newMsgId;
    }

    public final Integer getType() {
        return this.type;
    }
}
