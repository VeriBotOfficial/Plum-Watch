package com.wakeup.feature.plans.model;

import android.gov.nist.core.Separators;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/plans/model/ChatRequest;", "", "message", "", "messageId", ApiConstants.STREAM, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getMessageId", "getStream", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatRequest {
    private final String message;
    private final String messageId;
    private final boolean stream;

    public static /* synthetic */ ChatRequest copy$default(ChatRequest chatRequest, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatRequest.message;
        }
        if ((i & 2) != 0) {
            str2 = chatRequest.messageId;
        }
        if ((i & 4) != 0) {
            z = chatRequest.stream;
        }
        return chatRequest.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getStream() {
        return this.stream;
    }

    public final ChatRequest copy(String message, String messageId, boolean stream) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new ChatRequest(message, messageId, stream);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatRequest)) {
            return false;
        }
        ChatRequest chatRequest = (ChatRequest) other;
        return Intrinsics.areEqual(this.message, chatRequest.message) && Intrinsics.areEqual(this.messageId, chatRequest.messageId) && this.stream == chatRequest.stream;
    }

    public int hashCode() {
        return (((this.message.hashCode() * 31) + this.messageId.hashCode()) * 31) + Boolean.hashCode(this.stream);
    }

    public String toString() {
        return "ChatRequest(message=" + this.message + ", messageId=" + this.messageId + ", stream=" + this.stream + Separators.RPAREN;
    }

    public ChatRequest(String message, String messageId, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.message = message;
        this.messageId = messageId;
        this.stream = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ ChatRequest(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean getStream() {
        return this.stream;
    }
}
