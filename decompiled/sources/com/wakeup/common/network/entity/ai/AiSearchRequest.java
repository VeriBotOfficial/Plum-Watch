package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSearchBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiSearchRequest;", "", "conversationId", "", "query", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "getQuery", "setQuery", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiSearchRequest {
    private String conversationId;
    private String query;

    public static /* synthetic */ AiSearchRequest copy$default(AiSearchRequest aiSearchRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiSearchRequest.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = aiSearchRequest.query;
        }
        return aiSearchRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final AiSearchRequest copy(String conversationId, String query) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(query, "query");
        return new AiSearchRequest(conversationId, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSearchRequest)) {
            return false;
        }
        AiSearchRequest aiSearchRequest = (AiSearchRequest) other;
        return Intrinsics.areEqual(this.conversationId, aiSearchRequest.conversationId) && Intrinsics.areEqual(this.query, aiSearchRequest.query);
    }

    public int hashCode() {
        return (this.conversationId.hashCode() * 31) + this.query.hashCode();
    }

    public String toString() {
        return "AiSearchRequest(conversationId=" + this.conversationId + ", query=" + this.query + Separators.RPAREN;
    }

    public AiSearchRequest(String conversationId, String query) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(query, "query");
        this.conversationId = conversationId;
        this.query = query;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final void setConversationId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationId = str;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setQuery(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.query = str;
    }
}
