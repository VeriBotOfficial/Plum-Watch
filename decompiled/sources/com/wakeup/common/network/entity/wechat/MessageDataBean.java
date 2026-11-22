package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\bHÖ\u0001J\t\u0010>\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010$\"\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006?"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/MessageDataBean;", "", "MsgId", "", "FromUserName", "Lcom/wakeup/common/network/entity/wechat/Msg;", "ToUserName", "MsgType", "", "Content", "Status", "ImgStatus", "ImgBuf", "Lcom/wakeup/common/network/entity/wechat/ImgBuff;", "CreateTime", "MsgSource", "", "PushContent", "NewMsgId", "MsgSeq", "<init>", "(JLcom/wakeup/common/network/entity/wechat/Msg;Lcom/wakeup/common/network/entity/wechat/Msg;ILcom/wakeup/common/network/entity/wechat/Msg;IILcom/wakeup/common/network/entity/wechat/ImgBuff;JLjava/lang/String;Ljava/lang/String;JJ)V", "getMsgId", "()J", "getFromUserName", "()Lcom/wakeup/common/network/entity/wechat/Msg;", "getToUserName", "getMsgType", "()I", "getContent", "getStatus", "getImgStatus", "getImgBuf", "()Lcom/wakeup/common/network/entity/wechat/ImgBuff;", "getCreateTime", "getMsgSource", "()Ljava/lang/String;", "getPushContent", "setPushContent", "(Ljava/lang/String;)V", "getNewMsgId", "getMsgSeq", "getFromWxId", "getToWxId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MessageDataBean {
    private final Msg Content;
    private final long CreateTime;
    private final Msg FromUserName;
    private final ImgBuff ImgBuf;
    private final int ImgStatus;
    private final long MsgId;
    private final long MsgSeq;
    private final String MsgSource;
    private final int MsgType;
    private final long NewMsgId;
    private String PushContent;
    private final int Status;
    private final Msg ToUserName;

    public static /* synthetic */ MessageDataBean copy$default(MessageDataBean messageDataBean, long j, Msg msg, Msg msg2, int i, Msg msg3, int i2, int i3, ImgBuff imgBuff, long j2, String str, String str2, long j3, long j4, int i4, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9 = (i4 & 1) != 0 ? messageDataBean.MsgId : j;
        Msg msg4 = (i4 & 2) != 0 ? messageDataBean.FromUserName : msg;
        Msg msg5 = (i4 & 4) != 0 ? messageDataBean.ToUserName : msg2;
        int i5 = (i4 & 8) != 0 ? messageDataBean.MsgType : i;
        Msg msg6 = (i4 & 16) != 0 ? messageDataBean.Content : msg3;
        int i6 = (i4 & 32) != 0 ? messageDataBean.Status : i2;
        int i7 = (i4 & 64) != 0 ? messageDataBean.ImgStatus : i3;
        ImgBuff imgBuff2 = (i4 & 128) != 0 ? messageDataBean.ImgBuf : imgBuff;
        long j10 = (i4 & 256) != 0 ? messageDataBean.CreateTime : j2;
        String str3 = (i4 & 512) != 0 ? messageDataBean.MsgSource : str;
        String str4 = (i4 & 1024) != 0 ? messageDataBean.PushContent : str2;
        if ((i4 & 2048) != 0) {
            j5 = j9;
            j6 = messageDataBean.NewMsgId;
        } else {
            j5 = j9;
            j6 = j3;
        }
        if ((i4 & 4096) != 0) {
            j8 = j6;
            j7 = messageDataBean.MsgSeq;
        } else {
            j7 = j4;
            j8 = j6;
        }
        return messageDataBean.copy(j5, msg4, msg5, i5, msg6, i6, i7, imgBuff2, j10, str3, str4, j8, j7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMsgId() {
        return this.MsgId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMsgSource() {
        return this.MsgSource;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPushContent() {
        return this.PushContent;
    }

    /* renamed from: component12, reason: from getter */
    public final long getNewMsgId() {
        return this.NewMsgId;
    }

    /* renamed from: component13, reason: from getter */
    public final long getMsgSeq() {
        return this.MsgSeq;
    }

    /* renamed from: component2, reason: from getter */
    public final Msg getFromUserName() {
        return this.FromUserName;
    }

    /* renamed from: component3, reason: from getter */
    public final Msg getToUserName() {
        return this.ToUserName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMsgType() {
        return this.MsgType;
    }

    /* renamed from: component5, reason: from getter */
    public final Msg getContent() {
        return this.Content;
    }

    /* renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.Status;
    }

    /* renamed from: component7, reason: from getter */
    public final int getImgStatus() {
        return this.ImgStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final ImgBuff getImgBuf() {
        return this.ImgBuf;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.CreateTime;
    }

    public final MessageDataBean copy(long MsgId, Msg FromUserName, Msg ToUserName, int MsgType, Msg Content, int Status, int ImgStatus, ImgBuff ImgBuf, long CreateTime, String MsgSource, String PushContent, long NewMsgId, long MsgSeq) {
        Intrinsics.checkNotNullParameter(FromUserName, "FromUserName");
        Intrinsics.checkNotNullParameter(ToUserName, "ToUserName");
        Intrinsics.checkNotNullParameter(Content, "Content");
        Intrinsics.checkNotNullParameter(ImgBuf, "ImgBuf");
        Intrinsics.checkNotNullParameter(MsgSource, "MsgSource");
        return new MessageDataBean(MsgId, FromUserName, ToUserName, MsgType, Content, Status, ImgStatus, ImgBuf, CreateTime, MsgSource, PushContent, NewMsgId, MsgSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDataBean)) {
            return false;
        }
        MessageDataBean messageDataBean = (MessageDataBean) other;
        return this.MsgId == messageDataBean.MsgId && Intrinsics.areEqual(this.FromUserName, messageDataBean.FromUserName) && Intrinsics.areEqual(this.ToUserName, messageDataBean.ToUserName) && this.MsgType == messageDataBean.MsgType && Intrinsics.areEqual(this.Content, messageDataBean.Content) && this.Status == messageDataBean.Status && this.ImgStatus == messageDataBean.ImgStatus && Intrinsics.areEqual(this.ImgBuf, messageDataBean.ImgBuf) && this.CreateTime == messageDataBean.CreateTime && Intrinsics.areEqual(this.MsgSource, messageDataBean.MsgSource) && Intrinsics.areEqual(this.PushContent, messageDataBean.PushContent) && this.NewMsgId == messageDataBean.NewMsgId && this.MsgSeq == messageDataBean.MsgSeq;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Long.hashCode(this.MsgId) * 31) + this.FromUserName.hashCode()) * 31) + this.ToUserName.hashCode()) * 31) + Integer.hashCode(this.MsgType)) * 31) + this.Content.hashCode()) * 31) + Integer.hashCode(this.Status)) * 31) + Integer.hashCode(this.ImgStatus)) * 31) + this.ImgBuf.hashCode()) * 31) + Long.hashCode(this.CreateTime)) * 31) + this.MsgSource.hashCode()) * 31;
        String str = this.PushContent;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.NewMsgId)) * 31) + Long.hashCode(this.MsgSeq);
    }

    public String toString() {
        return "MessageDataBean(MsgId=" + this.MsgId + ", FromUserName=" + this.FromUserName + ", ToUserName=" + this.ToUserName + ", MsgType=" + this.MsgType + ", Content=" + this.Content + ", Status=" + this.Status + ", ImgStatus=" + this.ImgStatus + ", ImgBuf=" + this.ImgBuf + ", CreateTime=" + this.CreateTime + ", MsgSource=" + this.MsgSource + ", PushContent=" + this.PushContent + ", NewMsgId=" + this.NewMsgId + ", MsgSeq=" + this.MsgSeq + Separators.RPAREN;
    }

    public MessageDataBean(long j, Msg FromUserName, Msg ToUserName, int i, Msg Content, int i2, int i3, ImgBuff ImgBuf, long j2, String MsgSource, String str, long j3, long j4) {
        Intrinsics.checkNotNullParameter(FromUserName, "FromUserName");
        Intrinsics.checkNotNullParameter(ToUserName, "ToUserName");
        Intrinsics.checkNotNullParameter(Content, "Content");
        Intrinsics.checkNotNullParameter(ImgBuf, "ImgBuf");
        Intrinsics.checkNotNullParameter(MsgSource, "MsgSource");
        this.MsgId = j;
        this.FromUserName = FromUserName;
        this.ToUserName = ToUserName;
        this.MsgType = i;
        this.Content = Content;
        this.Status = i2;
        this.ImgStatus = i3;
        this.ImgBuf = ImgBuf;
        this.CreateTime = j2;
        this.MsgSource = MsgSource;
        this.PushContent = str;
        this.NewMsgId = j3;
        this.MsgSeq = j4;
    }

    public final long getMsgId() {
        return this.MsgId;
    }

    public final Msg getFromUserName() {
        return this.FromUserName;
    }

    public final Msg getToUserName() {
        return this.ToUserName;
    }

    public final int getMsgType() {
        return this.MsgType;
    }

    public final Msg getContent() {
        return this.Content;
    }

    public final int getStatus() {
        return this.Status;
    }

    public final int getImgStatus() {
        return this.ImgStatus;
    }

    public final ImgBuff getImgBuf() {
        return this.ImgBuf;
    }

    public final long getCreateTime() {
        return this.CreateTime;
    }

    public final String getMsgSource() {
        return this.MsgSource;
    }

    public final String getPushContent() {
        return this.PushContent;
    }

    public final void setPushContent(String str) {
        this.PushContent = str;
    }

    public final long getNewMsgId() {
        return this.NewMsgId;
    }

    public final long getMsgSeq() {
        return this.MsgSeq;
    }

    public final String getFromWxId() {
        return this.FromUserName.getString();
    }

    public final String getToWxId() {
        return this.ToUserName.getString();
    }
}
