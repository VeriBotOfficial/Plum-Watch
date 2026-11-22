package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/DeviceBinding;", "", "bound", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "state", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBound", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSessionId", "()Ljava/lang/String;", "getState", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/whatsapp/DeviceBinding;", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceBinding {

    @SerializedName("bound")
    private final Boolean bound;

    @SerializedName("session_id")
    private final String sessionId;

    @SerializedName("state")
    private final String state;

    public DeviceBinding() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DeviceBinding copy$default(DeviceBinding deviceBinding, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = deviceBinding.bound;
        }
        if ((i & 2) != 0) {
            str = deviceBinding.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = deviceBinding.state;
        }
        return deviceBinding.copy(bool, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getBound() {
        return this.bound;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final DeviceBinding copy(Boolean bound, String sessionId, String state) {
        return new DeviceBinding(bound, sessionId, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBinding)) {
            return false;
        }
        DeviceBinding deviceBinding = (DeviceBinding) other;
        return Intrinsics.areEqual(this.bound, deviceBinding.bound) && Intrinsics.areEqual(this.sessionId, deviceBinding.sessionId) && Intrinsics.areEqual(this.state, deviceBinding.state);
    }

    public int hashCode() {
        Boolean bool = this.bound;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.sessionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.state;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceBinding(bound=" + this.bound + ", sessionId=" + this.sessionId + ", state=" + this.state + Separators.RPAREN;
    }

    public DeviceBinding(Boolean bool, String str, String str2) {
        this.bound = bool;
        this.sessionId = str;
        this.state = str2;
    }

    public /* synthetic */ DeviceBinding(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final Boolean getBound() {
        return this.bound;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getState() {
        return this.state;
    }
}
