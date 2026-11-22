package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/SendMessageResponse;", "", "createdAt", "", "deliveryStatus", "messageId", "status", "waMsgId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getDeliveryStatus", "getMessageId", "getStatus", "getWaMsgId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SendMessageResponse {

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("delivery_status")
    private final String deliveryStatus;

    @SerializedName(Constants.MessagePayloadKeys.MSGID_SERVER)
    private final String messageId;
    private final String status;

    @SerializedName("wa_msg_id")
    private final String waMsgId;

    public static /* synthetic */ SendMessageResponse copy$default(SendMessageResponse sendMessageResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageResponse.createdAt;
        }
        if ((i & 2) != 0) {
            str2 = sendMessageResponse.deliveryStatus;
        }
        if ((i & 4) != 0) {
            str3 = sendMessageResponse.messageId;
        }
        if ((i & 8) != 0) {
            str4 = sendMessageResponse.status;
        }
        if ((i & 16) != 0) {
            str5 = sendMessageResponse.waMsgId;
        }
        String str6 = str5;
        String str7 = str3;
        return sendMessageResponse.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWaMsgId() {
        return this.waMsgId;
    }

    public final SendMessageResponse copy(String createdAt, String deliveryStatus, String messageId, String status, String waMsgId) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(waMsgId, "waMsgId");
        return new SendMessageResponse(createdAt, deliveryStatus, messageId, status, waMsgId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageResponse)) {
            return false;
        }
        SendMessageResponse sendMessageResponse = (SendMessageResponse) other;
        return Intrinsics.areEqual(this.createdAt, sendMessageResponse.createdAt) && Intrinsics.areEqual(this.deliveryStatus, sendMessageResponse.deliveryStatus) && Intrinsics.areEqual(this.messageId, sendMessageResponse.messageId) && Intrinsics.areEqual(this.status, sendMessageResponse.status) && Intrinsics.areEqual(this.waMsgId, sendMessageResponse.waMsgId);
    }

    public int hashCode() {
        return (((((((this.createdAt.hashCode() * 31) + this.deliveryStatus.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.waMsgId.hashCode();
    }

    public String toString() {
        return "SendMessageResponse(createdAt=" + this.createdAt + ", deliveryStatus=" + this.deliveryStatus + ", messageId=" + this.messageId + ", status=" + this.status + ", waMsgId=" + this.waMsgId + Separators.RPAREN;
    }

    public SendMessageResponse(String createdAt, String deliveryStatus, String messageId, String status, String waMsgId) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(deliveryStatus, "deliveryStatus");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(waMsgId, "waMsgId");
        this.createdAt = createdAt;
        this.deliveryStatus = deliveryStatus;
        this.messageId = messageId;
        this.status = status;
        this.waMsgId = waMsgId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getWaMsgId() {
        return this.waMsgId;
    }
}
