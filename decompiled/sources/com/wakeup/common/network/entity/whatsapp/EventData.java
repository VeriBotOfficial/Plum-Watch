package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.livekit.android.dagger.InjectionNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/EventData;", "", "chatId", "", "messageId", "receiptType", "status", "body", "chatName", "chatType", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "msgType", InjectionNames.SENDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getMessageId", "getReceiptType", "getStatus", "getBody", "getChatName", "getChatType", "getDirection", "getMsgType", "getSender", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventData {
    private final String body;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_name")
    private final String chatName;

    @SerializedName("chat_type")
    private final String chatType;
    private final String direction;

    @SerializedName(Constants.MessagePayloadKeys.MSGID_SERVER)
    private final String messageId;

    @SerializedName("msg_type")
    private final String msgType;

    @SerializedName("receipt_type")
    private final String receiptType;
    private final String sender;
    private final String status;

    public EventData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventData.chatId;
        }
        if ((i & 2) != 0) {
            str2 = eventData.messageId;
        }
        if ((i & 4) != 0) {
            str3 = eventData.receiptType;
        }
        if ((i & 8) != 0) {
            str4 = eventData.status;
        }
        if ((i & 16) != 0) {
            str5 = eventData.body;
        }
        if ((i & 32) != 0) {
            str6 = eventData.chatName;
        }
        if ((i & 64) != 0) {
            str7 = eventData.chatType;
        }
        if ((i & 128) != 0) {
            str8 = eventData.direction;
        }
        if ((i & 256) != 0) {
            str9 = eventData.msgType;
        }
        if ((i & 512) != 0) {
            str10 = eventData.sender;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return eventData.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReceiptType() {
        return this.receiptType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChatType() {
        return this.chatType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    public final EventData copy(String chatId, String messageId, String receiptType, String status, String body, String chatName, String chatType, String direction, String msgType, String sender) {
        return new EventData(chatId, messageId, receiptType, status, body, chatName, chatType, direction, msgType, sender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) other;
        return Intrinsics.areEqual(this.chatId, eventData.chatId) && Intrinsics.areEqual(this.messageId, eventData.messageId) && Intrinsics.areEqual(this.receiptType, eventData.receiptType) && Intrinsics.areEqual(this.status, eventData.status) && Intrinsics.areEqual(this.body, eventData.body) && Intrinsics.areEqual(this.chatName, eventData.chatName) && Intrinsics.areEqual(this.chatType, eventData.chatType) && Intrinsics.areEqual(this.direction, eventData.direction) && Intrinsics.areEqual(this.msgType, eventData.msgType) && Intrinsics.areEqual(this.sender, eventData.sender);
    }

    public int hashCode() {
        String str = this.chatId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.messageId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiptType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.body;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chatName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.chatType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.direction;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.msgType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sender;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "EventData(chatId=" + this.chatId + ", messageId=" + this.messageId + ", receiptType=" + this.receiptType + ", status=" + this.status + ", body=" + this.body + ", chatName=" + this.chatName + ", chatType=" + this.chatType + ", direction=" + this.direction + ", msgType=" + this.msgType + ", sender=" + this.sender + Separators.RPAREN;
    }

    public EventData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.chatId = str;
        this.messageId = str2;
        this.receiptType = str3;
        this.status = str4;
        this.body = str5;
        this.chatName = str6;
        this.chatType = str7;
        this.direction = str8;
        this.msgType = str9;
        this.sender = str10;
    }

    public /* synthetic */ EventData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getReceiptType() {
        return this.receiptType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final String getSender() {
        return this.sender;
    }
}
