package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewTypeConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/newtype/sdkcore/NewTypeConfig;", "", "connectionTimeoutMillis", "", "reconnectTimeoutMillis", "reconnectStallTimeoutMillis", "turnProcessingTimeoutMillis", "autoReconnectOnUnexpectedDisconnect", "", "credentialProvider", "Lcom/newtype/sdkcore/NewTypeCredentialProvider;", "<init>", "(JJJJZLcom/newtype/sdkcore/NewTypeCredentialProvider;)V", "getConnectionTimeoutMillis", "()J", "getReconnectTimeoutMillis", "getReconnectStallTimeoutMillis", "getTurnProcessingTimeoutMillis", "getAutoReconnectOnUnexpectedDisconnect", "()Z", "getCredentialProvider", "()Lcom/newtype/sdkcore/NewTypeCredentialProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NewTypeConfig {
    private final boolean autoReconnectOnUnexpectedDisconnect;
    private final long connectionTimeoutMillis;
    private final NewTypeCredentialProvider credentialProvider;
    private final long reconnectStallTimeoutMillis;
    private final long reconnectTimeoutMillis;
    private final long turnProcessingTimeoutMillis;

    public NewTypeConfig() {
        this(0L, 0L, 0L, 0L, false, null, 63, null);
    }

    public static /* synthetic */ NewTypeConfig copy$default(NewTypeConfig newTypeConfig, long j, long j2, long j3, long j4, boolean z, NewTypeCredentialProvider newTypeCredentialProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newTypeConfig.connectionTimeoutMillis;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = newTypeConfig.reconnectTimeoutMillis;
        }
        return newTypeConfig.copy(j5, j2, (i & 4) != 0 ? newTypeConfig.reconnectStallTimeoutMillis : j3, (i & 8) != 0 ? newTypeConfig.turnProcessingTimeoutMillis : j4, (i & 16) != 0 ? newTypeConfig.autoReconnectOnUnexpectedDisconnect : z, (i & 32) != 0 ? newTypeConfig.credentialProvider : newTypeCredentialProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final long getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final long getReconnectTimeoutMillis() {
        return this.reconnectTimeoutMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final long getReconnectStallTimeoutMillis() {
        return this.reconnectStallTimeoutMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTurnProcessingTimeoutMillis() {
        return this.turnProcessingTimeoutMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAutoReconnectOnUnexpectedDisconnect() {
        return this.autoReconnectOnUnexpectedDisconnect;
    }

    /* renamed from: component6, reason: from getter */
    public final NewTypeCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public final NewTypeConfig copy(long connectionTimeoutMillis, long reconnectTimeoutMillis, long reconnectStallTimeoutMillis, long turnProcessingTimeoutMillis, boolean autoReconnectOnUnexpectedDisconnect, NewTypeCredentialProvider credentialProvider) {
        return new NewTypeConfig(connectionTimeoutMillis, reconnectTimeoutMillis, reconnectStallTimeoutMillis, turnProcessingTimeoutMillis, autoReconnectOnUnexpectedDisconnect, credentialProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewTypeConfig)) {
            return false;
        }
        NewTypeConfig newTypeConfig = (NewTypeConfig) other;
        return this.connectionTimeoutMillis == newTypeConfig.connectionTimeoutMillis && this.reconnectTimeoutMillis == newTypeConfig.reconnectTimeoutMillis && this.reconnectStallTimeoutMillis == newTypeConfig.reconnectStallTimeoutMillis && this.turnProcessingTimeoutMillis == newTypeConfig.turnProcessingTimeoutMillis && this.autoReconnectOnUnexpectedDisconnect == newTypeConfig.autoReconnectOnUnexpectedDisconnect && Intrinsics.areEqual(this.credentialProvider, newTypeConfig.credentialProvider);
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.connectionTimeoutMillis) * 31) + Long.hashCode(this.reconnectTimeoutMillis)) * 31) + Long.hashCode(this.reconnectStallTimeoutMillis)) * 31) + Long.hashCode(this.turnProcessingTimeoutMillis)) * 31) + Boolean.hashCode(this.autoReconnectOnUnexpectedDisconnect)) * 31;
        NewTypeCredentialProvider newTypeCredentialProvider = this.credentialProvider;
        return hashCode + (newTypeCredentialProvider == null ? 0 : newTypeCredentialProvider.hashCode());
    }

    public String toString() {
        return "NewTypeConfig(connectionTimeoutMillis=" + this.connectionTimeoutMillis + ", reconnectTimeoutMillis=" + this.reconnectTimeoutMillis + ", reconnectStallTimeoutMillis=" + this.reconnectStallTimeoutMillis + ", turnProcessingTimeoutMillis=" + this.turnProcessingTimeoutMillis + ", autoReconnectOnUnexpectedDisconnect=" + this.autoReconnectOnUnexpectedDisconnect + ", credentialProvider=" + this.credentialProvider + Separators.RPAREN;
    }

    public NewTypeConfig(long j, long j2, long j3, long j4, boolean z, NewTypeCredentialProvider newTypeCredentialProvider) {
        this.connectionTimeoutMillis = j;
        this.reconnectTimeoutMillis = j2;
        this.reconnectStallTimeoutMillis = j3;
        this.turnProcessingTimeoutMillis = j4;
        this.autoReconnectOnUnexpectedDisconnect = z;
        this.credentialProvider = newTypeCredentialProvider;
    }

    public /* synthetic */ NewTypeConfig(long j, long j2, long j3, long j4, boolean z, NewTypeCredentialProvider newTypeCredentialProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 15000L : j, (i & 2) != 0 ? 20000L : j2, (i & 4) != 0 ? 12000L : j3, (i & 8) != 0 ? Const.L_MIN_CGI_REFRESH : j4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : newTypeCredentialProvider);
    }

    public final long getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public final long getReconnectTimeoutMillis() {
        return this.reconnectTimeoutMillis;
    }

    public final long getReconnectStallTimeoutMillis() {
        return this.reconnectStallTimeoutMillis;
    }

    public final long getTurnProcessingTimeoutMillis() {
        return this.turnProcessingTimeoutMillis;
    }

    public final boolean getAutoReconnectOnUnexpectedDisconnect() {
        return this.autoReconnectOnUnexpectedDisconnect;
    }

    public final NewTypeCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }
}
