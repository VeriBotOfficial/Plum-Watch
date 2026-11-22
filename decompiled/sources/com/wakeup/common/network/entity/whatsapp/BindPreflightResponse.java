package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/BindPreflightResponse;", "", "canStartBind", "", "deviceId", "", "ownerContext", "Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "reasonCode", "recommendedAction", "voicePolicy", "Lcom/wakeup/common/network/entity/whatsapp/VoicePolicy;", "<init>", "(ZLjava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/whatsapp/VoicePolicy;)V", "getCanStartBind", "()Z", "getDeviceId", "()Ljava/lang/String;", "getOwnerContext", "()Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "getReasonCode", "getRecommendedAction", "getVoicePolicy", "()Lcom/wakeup/common/network/entity/whatsapp/VoicePolicy;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BindPreflightResponse {

    @SerializedName("can_start_bind")
    private final boolean canStartBind;

    @SerializedName("device_id")
    private final String deviceId;

    @SerializedName("owner_context")
    private final OwnerContext ownerContext;

    @SerializedName("reason_code")
    private final String reasonCode;

    @SerializedName("recommended_action")
    private final String recommendedAction;

    @SerializedName("voice_policy")
    private final VoicePolicy voicePolicy;

    public static /* synthetic */ BindPreflightResponse copy$default(BindPreflightResponse bindPreflightResponse, boolean z, String str, OwnerContext ownerContext, String str2, String str3, VoicePolicy voicePolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bindPreflightResponse.canStartBind;
        }
        if ((i & 2) != 0) {
            str = bindPreflightResponse.deviceId;
        }
        if ((i & 4) != 0) {
            ownerContext = bindPreflightResponse.ownerContext;
        }
        if ((i & 8) != 0) {
            str2 = bindPreflightResponse.reasonCode;
        }
        if ((i & 16) != 0) {
            str3 = bindPreflightResponse.recommendedAction;
        }
        if ((i & 32) != 0) {
            voicePolicy = bindPreflightResponse.voicePolicy;
        }
        String str4 = str3;
        VoicePolicy voicePolicy2 = voicePolicy;
        return bindPreflightResponse.copy(z, str, ownerContext, str2, str4, voicePolicy2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanStartBind() {
        return this.canStartBind;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReasonCode() {
        return this.reasonCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRecommendedAction() {
        return this.recommendedAction;
    }

    /* renamed from: component6, reason: from getter */
    public final VoicePolicy getVoicePolicy() {
        return this.voicePolicy;
    }

    public final BindPreflightResponse copy(boolean canStartBind, String deviceId, OwnerContext ownerContext, String reasonCode, String recommendedAction, VoicePolicy voicePolicy) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(recommendedAction, "recommendedAction");
        Intrinsics.checkNotNullParameter(voicePolicy, "voicePolicy");
        return new BindPreflightResponse(canStartBind, deviceId, ownerContext, reasonCode, recommendedAction, voicePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindPreflightResponse)) {
            return false;
        }
        BindPreflightResponse bindPreflightResponse = (BindPreflightResponse) other;
        return this.canStartBind == bindPreflightResponse.canStartBind && Intrinsics.areEqual(this.deviceId, bindPreflightResponse.deviceId) && Intrinsics.areEqual(this.ownerContext, bindPreflightResponse.ownerContext) && Intrinsics.areEqual(this.reasonCode, bindPreflightResponse.reasonCode) && Intrinsics.areEqual(this.recommendedAction, bindPreflightResponse.recommendedAction) && Intrinsics.areEqual(this.voicePolicy, bindPreflightResponse.voicePolicy);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.canStartBind) * 31) + this.deviceId.hashCode()) * 31) + this.ownerContext.hashCode()) * 31) + this.reasonCode.hashCode()) * 31) + this.recommendedAction.hashCode()) * 31) + this.voicePolicy.hashCode();
    }

    public String toString() {
        return "BindPreflightResponse(canStartBind=" + this.canStartBind + ", deviceId=" + this.deviceId + ", ownerContext=" + this.ownerContext + ", reasonCode=" + this.reasonCode + ", recommendedAction=" + this.recommendedAction + ", voicePolicy=" + this.voicePolicy + Separators.RPAREN;
    }

    public BindPreflightResponse(boolean z, String deviceId, OwnerContext ownerContext, String reasonCode, String recommendedAction, VoicePolicy voicePolicy) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ownerContext, "ownerContext");
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        Intrinsics.checkNotNullParameter(recommendedAction, "recommendedAction");
        Intrinsics.checkNotNullParameter(voicePolicy, "voicePolicy");
        this.canStartBind = z;
        this.deviceId = deviceId;
        this.ownerContext = ownerContext;
        this.reasonCode = reasonCode;
        this.recommendedAction = recommendedAction;
        this.voicePolicy = voicePolicy;
    }

    public final boolean getCanStartBind() {
        return this.canStartBind;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final OwnerContext getOwnerContext() {
        return this.ownerContext;
    }

    public final String getReasonCode() {
        return this.reasonCode;
    }

    public final String getRecommendedAction() {
        return this.recommendedAction;
    }

    public final VoicePolicy getVoicePolicy() {
        return this.voicePolicy;
    }
}
