package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0097\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/DeviceStatusResponse;", "", "binding", "", "bindingId", "canStartBind", "", "cooldown", "deviceBinding", "Lcom/wakeup/common/network/entity/whatsapp/DeviceBinding;", "deviceId", "ownerContext", "Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", TypedValues.CycleType.S_WAVE_PHASE, "reasonCode", "recommendedAction", "serverTime", "session", "Lcom/wakeup/common/network/entity/whatsapp/Session;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/DeviceBinding;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/Session;)V", "getBinding", "()Ljava/lang/String;", "getBindingId", "getCanStartBind", "()Z", "getCooldown", "getDeviceBinding", "()Lcom/wakeup/common/network/entity/whatsapp/DeviceBinding;", "getDeviceId", "getOwnerContext", "()Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "getPhase", "getReasonCode", "getRecommendedAction", "getServerTime", "getSession", "()Lcom/wakeup/common/network/entity/whatsapp/Session;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceStatusResponse {

    @SerializedName("binding")
    private final String binding;

    @SerializedName("binding_id")
    private final String bindingId;

    @SerializedName("can_start_bind")
    private final boolean canStartBind;

    @SerializedName("cooldown")
    private final String cooldown;

    @SerializedName("device_binding")
    private final DeviceBinding deviceBinding;

    @SerializedName("device_id")
    private final String deviceId;

    @SerializedName("owner_context")
    private final OwnerContext ownerContext;

    @SerializedName(TypedValues.CycleType.S_WAVE_PHASE)
    private final String phase;

    @SerializedName("reason_code")
    private final String reasonCode;

    @SerializedName("recommended_action")
    private final String recommendedAction;

    @SerializedName("server_time")
    private final String serverTime;

    @SerializedName("session")
    private final Session session;

    public static /* synthetic */ DeviceStatusResponse copy$default(DeviceStatusResponse deviceStatusResponse, String str, String str2, boolean z, String str3, DeviceBinding deviceBinding, String str4, OwnerContext ownerContext, String str5, String str6, String str7, String str8, Session session, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceStatusResponse.binding;
        }
        if ((i & 2) != 0) {
            str2 = deviceStatusResponse.bindingId;
        }
        if ((i & 4) != 0) {
            z = deviceStatusResponse.canStartBind;
        }
        if ((i & 8) != 0) {
            str3 = deviceStatusResponse.cooldown;
        }
        if ((i & 16) != 0) {
            deviceBinding = deviceStatusResponse.deviceBinding;
        }
        if ((i & 32) != 0) {
            str4 = deviceStatusResponse.deviceId;
        }
        if ((i & 64) != 0) {
            ownerContext = deviceStatusResponse.ownerContext;
        }
        if ((i & 128) != 0) {
            str5 = deviceStatusResponse.phase;
        }
        if ((i & 256) != 0) {
            str6 = deviceStatusResponse.reasonCode;
        }
        if ((i & 512) != 0) {
            str7 = deviceStatusResponse.recommendedAction;
        }
        if ((i & 1024) != 0) {
            str8 = deviceStatusResponse.serverTime;
        }
        if ((i & 2048) != 0) {
            session = deviceStatusResponse.session;
        }
        String str9 = str8;
        Session session2 = session;
        String str10 = str6;
        String str11 = str7;
        OwnerContext ownerContext2 = ownerContext;
        String str12 = str5;
        DeviceBinding deviceBinding2 = deviceBinding;
        String str13 = str4;
        return deviceStatusResponse.copy(str, str2, z, str3, deviceBinding2, str13, ownerContext2, str12, str10, str11, str9, session2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBinding() {
        return this.binding;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRecommendedAction() {
        return this.recommendedAction;
    }

    /* renamed from: component11, reason: from getter */
    public final String getServerTime() {
        return this.serverTime;
    }

    /* renamed from: component12, reason: from getter */
    public final Session getSession() {
        return this.session;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanStartBind() {
        return this.canStartBind;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCooldown() {
        return this.cooldown;
    }

    /* renamed from: component5, reason: from getter */
    public final DeviceBinding getDeviceBinding() {
        return this.deviceBinding;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component7, reason: from getter */
    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhase() {
        return this.phase;
    }

    /* renamed from: component9, reason: from getter */
    public final String getReasonCode() {
        return this.reasonCode;
    }

    public final DeviceStatusResponse copy(String binding, String bindingId, boolean canStartBind, String cooldown, DeviceBinding deviceBinding, String deviceId, OwnerContext ownerContext, String phase, String reasonCode, String recommendedAction, String serverTime, Session session) {
        return new DeviceStatusResponse(binding, bindingId, canStartBind, cooldown, deviceBinding, deviceId, ownerContext, phase, reasonCode, recommendedAction, serverTime, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatusResponse)) {
            return false;
        }
        DeviceStatusResponse deviceStatusResponse = (DeviceStatusResponse) other;
        return Intrinsics.areEqual(this.binding, deviceStatusResponse.binding) && Intrinsics.areEqual(this.bindingId, deviceStatusResponse.bindingId) && this.canStartBind == deviceStatusResponse.canStartBind && Intrinsics.areEqual(this.cooldown, deviceStatusResponse.cooldown) && Intrinsics.areEqual(this.deviceBinding, deviceStatusResponse.deviceBinding) && Intrinsics.areEqual(this.deviceId, deviceStatusResponse.deviceId) && Intrinsics.areEqual(this.ownerContext, deviceStatusResponse.ownerContext) && Intrinsics.areEqual(this.phase, deviceStatusResponse.phase) && Intrinsics.areEqual(this.reasonCode, deviceStatusResponse.reasonCode) && Intrinsics.areEqual(this.recommendedAction, deviceStatusResponse.recommendedAction) && Intrinsics.areEqual(this.serverTime, deviceStatusResponse.serverTime) && Intrinsics.areEqual(this.session, deviceStatusResponse.session);
    }

    public int hashCode() {
        String str = this.binding;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bindingId;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.canStartBind)) * 31;
        String str3 = this.cooldown;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeviceBinding deviceBinding = this.deviceBinding;
        int hashCode4 = (hashCode3 + (deviceBinding == null ? 0 : deviceBinding.hashCode())) * 31;
        String str4 = this.deviceId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OwnerContext ownerContext = this.ownerContext;
        int hashCode6 = (hashCode5 + (ownerContext == null ? 0 : ownerContext.hashCode())) * 31;
        String str5 = this.phase;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reasonCode;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.recommendedAction;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.serverTime;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Session session = this.session;
        return hashCode10 + (session != null ? session.hashCode() : 0);
    }

    public String toString() {
        return "DeviceStatusResponse(binding=" + this.binding + ", bindingId=" + this.bindingId + ", canStartBind=" + this.canStartBind + ", cooldown=" + this.cooldown + ", deviceBinding=" + this.deviceBinding + ", deviceId=" + this.deviceId + ", ownerContext=" + this.ownerContext + ", phase=" + this.phase + ", reasonCode=" + this.reasonCode + ", recommendedAction=" + this.recommendedAction + ", serverTime=" + this.serverTime + ", session=" + this.session + Separators.RPAREN;
    }

    public DeviceStatusResponse(String str, String str2, boolean z, String str3, DeviceBinding deviceBinding, String str4, OwnerContext ownerContext, String str5, String str6, String str7, String str8, Session session) {
        this.binding = str;
        this.bindingId = str2;
        this.canStartBind = z;
        this.cooldown = str3;
        this.deviceBinding = deviceBinding;
        this.deviceId = str4;
        this.ownerContext = ownerContext;
        this.phase = str5;
        this.reasonCode = str6;
        this.recommendedAction = str7;
        this.serverTime = str8;
        this.session = session;
    }

    public /* synthetic */ DeviceStatusResponse(String str, String str2, boolean z, String str3, DeviceBinding deviceBinding, String str4, OwnerContext ownerContext, String str5, String str6, String str7, String str8, Session session, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, z, str3, (i & 16) != 0 ? null : deviceBinding, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : ownerContext, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : session);
    }

    public final String getBinding() {
        return this.binding;
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final boolean getCanStartBind() {
        return this.canStartBind;
    }

    public final String getCooldown() {
        return this.cooldown;
    }

    public final DeviceBinding getDeviceBinding() {
        return this.deviceBinding;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    public final String getPhase() {
        return this.phase;
    }

    public final String getReasonCode() {
        return this.reasonCode;
    }

    public final String getRecommendedAction() {
        return this.recommendedAction;
    }

    public final String getServerTime() {
        return this.serverTime;
    }

    public final Session getSession() {
        return this.session;
    }
}
