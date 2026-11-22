package com.wakeup.common.network.entity.oral;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/oral/SessionInfo;", "", "session", "Lcom/wakeup/common/network/entity/oral/Session;", "userToken", "Lcom/wakeup/common/network/entity/oral/UserToken;", "<init>", "(Lcom/wakeup/common/network/entity/oral/Session;Lcom/wakeup/common/network/entity/oral/UserToken;)V", "getSession", "()Lcom/wakeup/common/network/entity/oral/Session;", "getUserToken", "()Lcom/wakeup/common/network/entity/oral/UserToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionInfo {
    private final Session session;
    private final UserToken userToken;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, Session session, UserToken userToken, int i, Object obj) {
        if ((i & 1) != 0) {
            session = sessionInfo.session;
        }
        if ((i & 2) != 0) {
            userToken = sessionInfo.userToken;
        }
        return sessionInfo.copy(session, userToken);
    }

    /* renamed from: component1, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* renamed from: component2, reason: from getter */
    public final UserToken getUserToken() {
        return this.userToken;
    }

    public final SessionInfo copy(Session session, UserToken userToken) {
        return new SessionInfo(session, userToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return Intrinsics.areEqual(this.session, sessionInfo.session) && Intrinsics.areEqual(this.userToken, sessionInfo.userToken);
    }

    public int hashCode() {
        Session session = this.session;
        int hashCode = (session == null ? 0 : session.hashCode()) * 31;
        UserToken userToken = this.userToken;
        return hashCode + (userToken != null ? userToken.hashCode() : 0);
    }

    public String toString() {
        return "SessionInfo(session=" + this.session + ", userToken=" + this.userToken + Separators.RPAREN;
    }

    public SessionInfo(Session session, UserToken userToken) {
        this.session = session;
        this.userToken = userToken;
    }

    public /* synthetic */ SessionInfo(Session session, UserToken userToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : session, (i & 2) != 0 ? null : userToken);
    }

    public final Session getSession() {
        return this.session;
    }

    public final UserToken getUserToken() {
        return this.userToken;
    }
}
