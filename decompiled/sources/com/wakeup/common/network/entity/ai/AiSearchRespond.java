package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSearchBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0001HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiSearchRespond;", "", "conversationId", "", "messageId", "parentId", "contentType", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "getMessageId", "setMessageId", "getParentId", "setParentId", "getContentType", "setContentType", "getMessage", "()Ljava/lang/Object;", "setMessage", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiSearchRespond {
    private String contentType;
    private String conversationId;
    private Object message;
    private String messageId;
    private String parentId;

    public static /* synthetic */ AiSearchRespond copy$default(AiSearchRespond aiSearchRespond, String str, String str2, String str3, String str4, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aiSearchRespond.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = aiSearchRespond.messageId;
        }
        if ((i & 4) != 0) {
            str3 = aiSearchRespond.parentId;
        }
        if ((i & 8) != 0) {
            str4 = aiSearchRespond.contentType;
        }
        if ((i & 16) != 0) {
            obj = aiSearchRespond.message;
        }
        Object obj3 = obj;
        String str5 = str3;
        return aiSearchRespond.copy(str, str2, str5, str4, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getMessage() {
        return this.message;
    }

    public final AiSearchRespond copy(String conversationId, String messageId, String parentId, String contentType, Object message) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(message, "message");
        return new AiSearchRespond(conversationId, messageId, parentId, contentType, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSearchRespond)) {
            return false;
        }
        AiSearchRespond aiSearchRespond = (AiSearchRespond) other;
        return Intrinsics.areEqual(this.conversationId, aiSearchRespond.conversationId) && Intrinsics.areEqual(this.messageId, aiSearchRespond.messageId) && Intrinsics.areEqual(this.parentId, aiSearchRespond.parentId) && Intrinsics.areEqual(this.contentType, aiSearchRespond.contentType) && Intrinsics.areEqual(this.message, aiSearchRespond.message);
    }

    public int hashCode() {
        return (((((((this.conversationId.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "AiSearchRespond(conversationId=" + this.conversationId + ", messageId=" + this.messageId + ", parentId=" + this.parentId + ", contentType=" + this.contentType + ", message=" + this.message + Separators.RPAREN;
    }

    public AiSearchRespond(String conversationId, String messageId, String parentId, String contentType, Object message) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(message, "message");
        this.conversationId = conversationId;
        this.messageId = messageId;
        this.parentId = parentId;
        this.contentType = contentType;
        this.message = message;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final void setConversationId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationId = str;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.messageId = str;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final void setParentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.parentId = str;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final void setContentType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentType = str;
    }

    public final Object getMessage() {
        return this.message;
    }

    public final void setMessage(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.message = obj;
    }
}
