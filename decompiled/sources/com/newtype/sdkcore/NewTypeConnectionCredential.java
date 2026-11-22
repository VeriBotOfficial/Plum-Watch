package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/newtype/sdkcore/NewTypeConnectionCredential;", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "roomName", "connectionUrl", "connectionToken", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "expiresIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getSessionId", "()Ljava/lang/String;", "getRoomName", "getConnectionUrl", "getConnectionToken", "getIdentity", "getExpiresIn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/newtype/sdkcore/NewTypeConnectionCredential;", "equals", "", "other", "hashCode", "", "toString", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NewTypeConnectionCredential {
    private final String connectionToken;
    private final String connectionUrl;
    private final Long expiresIn;
    private final String identity;
    private final String roomName;
    private final String sessionId;

    public static /* synthetic */ NewTypeConnectionCredential copy$default(NewTypeConnectionCredential newTypeConnectionCredential, String str, String str2, String str3, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newTypeConnectionCredential.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = newTypeConnectionCredential.roomName;
        }
        if ((i & 4) != 0) {
            str3 = newTypeConnectionCredential.connectionUrl;
        }
        if ((i & 8) != 0) {
            str4 = newTypeConnectionCredential.connectionToken;
        }
        if ((i & 16) != 0) {
            str5 = newTypeConnectionCredential.identity;
        }
        if ((i & 32) != 0) {
            l = newTypeConnectionCredential.expiresIn;
        }
        String str6 = str5;
        Long l2 = l;
        return newTypeConnectionCredential.copy(str, str2, str3, str4, str6, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConnectionToken() {
        return this.connectionToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIdentity() {
        return this.identity;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getExpiresIn() {
        return this.expiresIn;
    }

    public final NewTypeConnectionCredential copy(String sessionId, String roomName, String connectionUrl, String connectionToken, String identity, Long expiresIn) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(connectionUrl, "connectionUrl");
        Intrinsics.checkNotNullParameter(connectionToken, "connectionToken");
        Intrinsics.checkNotNullParameter(identity, "identity");
        return new NewTypeConnectionCredential(sessionId, roomName, connectionUrl, connectionToken, identity, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewTypeConnectionCredential)) {
            return false;
        }
        NewTypeConnectionCredential newTypeConnectionCredential = (NewTypeConnectionCredential) other;
        return Intrinsics.areEqual(this.sessionId, newTypeConnectionCredential.sessionId) && Intrinsics.areEqual(this.roomName, newTypeConnectionCredential.roomName) && Intrinsics.areEqual(this.connectionUrl, newTypeConnectionCredential.connectionUrl) && Intrinsics.areEqual(this.connectionToken, newTypeConnectionCredential.connectionToken) && Intrinsics.areEqual(this.identity, newTypeConnectionCredential.identity) && Intrinsics.areEqual(this.expiresIn, newTypeConnectionCredential.expiresIn);
    }

    public int hashCode() {
        int hashCode = ((((((((this.sessionId.hashCode() * 31) + this.roomName.hashCode()) * 31) + this.connectionUrl.hashCode()) * 31) + this.connectionToken.hashCode()) * 31) + this.identity.hashCode()) * 31;
        Long l = this.expiresIn;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "NewTypeConnectionCredential(sessionId=" + this.sessionId + ", roomName=" + this.roomName + ", connectionUrl=" + this.connectionUrl + ", connectionToken=" + this.connectionToken + ", identity=" + this.identity + ", expiresIn=" + this.expiresIn + Separators.RPAREN;
    }

    public NewTypeConnectionCredential(String sessionId, String roomName, String connectionUrl, String connectionToken, String identity, Long l) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(connectionUrl, "connectionUrl");
        Intrinsics.checkNotNullParameter(connectionToken, "connectionToken");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.sessionId = sessionId;
        this.roomName = roomName;
        this.connectionUrl = connectionUrl;
        this.connectionToken = connectionToken;
        this.identity = identity;
        this.expiresIn = l;
    }

    public /* synthetic */ NewTypeConnectionCredential(String str, String str2, String str3, String str4, String str5, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : l);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getConnectionUrl() {
        return this.connectionUrl;
    }

    public final String getConnectionToken() {
        return this.connectionToken;
    }

    public final String getIdentity() {
        return this.identity;
    }

    public final Long getExpiresIn() {
        return this.expiresIn;
    }
}
