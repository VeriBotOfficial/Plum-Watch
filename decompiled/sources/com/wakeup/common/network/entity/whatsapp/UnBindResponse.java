package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/UnBindResponse;", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "success", "", "<init>", "(Ljava/lang/String;Z)V", "getSessionId", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnBindResponse {

    @SerializedName("session_id")
    private final String sessionId;
    private final boolean success;

    public static /* synthetic */ UnBindResponse copy$default(UnBindResponse unBindResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unBindResponse.sessionId;
        }
        if ((i & 2) != 0) {
            z = unBindResponse.success;
        }
        return unBindResponse.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final UnBindResponse copy(String sessionId, boolean success) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new UnBindResponse(sessionId, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnBindResponse)) {
            return false;
        }
        UnBindResponse unBindResponse = (UnBindResponse) other;
        return Intrinsics.areEqual(this.sessionId, unBindResponse.sessionId) && this.success == unBindResponse.success;
    }

    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "UnBindResponse(sessionId=" + this.sessionId + ", success=" + this.success + Separators.RPAREN;
    }

    public UnBindResponse(String sessionId, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.success = z;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
