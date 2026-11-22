package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/wakeup/module/ai/bean/AuthConfig;", "", "token", "", RemoteMessageConst.Notification.CHANNEL_ID, "", "productId", "modelType", "clientType", "ruleContentType", "deviceCode", "deviceSnCode", "<init>", "(Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getChannelId", "()I", "getProductId", "getModelType", "getClientType", "getRuleContentType", "getDeviceCode", "getDeviceSnCode", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AuthConfig {
    private final int channelId;
    private final int clientType;
    private final String deviceCode;
    private final String deviceSnCode;
    private final int modelType;
    private final int productId;
    private final int ruleContentType;
    private final String token;

    public static /* synthetic */ AuthConfig copy$default(AuthConfig authConfig, String str, int i, int i2, int i3, int i4, int i5, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = authConfig.token;
        }
        if ((i6 & 2) != 0) {
            i = authConfig.channelId;
        }
        if ((i6 & 4) != 0) {
            i2 = authConfig.productId;
        }
        if ((i6 & 8) != 0) {
            i3 = authConfig.modelType;
        }
        if ((i6 & 16) != 0) {
            i4 = authConfig.clientType;
        }
        if ((i6 & 32) != 0) {
            i5 = authConfig.ruleContentType;
        }
        if ((i6 & 64) != 0) {
            str2 = authConfig.deviceCode;
        }
        if ((i6 & 128) != 0) {
            str3 = authConfig.deviceSnCode;
        }
        String str4 = str2;
        String str5 = str3;
        int i7 = i4;
        int i8 = i5;
        return authConfig.copy(str, i, i2, i3, i7, i8, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChannelId() {
        return this.channelId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getModelType() {
        return this.modelType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getClientType() {
        return this.clientType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceCode() {
        return this.deviceCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDeviceSnCode() {
        return this.deviceSnCode;
    }

    public final AuthConfig copy(String token, int channelId, int productId, int modelType, int clientType, int ruleContentType, String deviceCode, String deviceSnCode) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
        return new AuthConfig(token, channelId, productId, modelType, clientType, ruleContentType, deviceCode, deviceSnCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthConfig)) {
            return false;
        }
        AuthConfig authConfig = (AuthConfig) other;
        return Intrinsics.areEqual(this.token, authConfig.token) && this.channelId == authConfig.channelId && this.productId == authConfig.productId && this.modelType == authConfig.modelType && this.clientType == authConfig.clientType && this.ruleContentType == authConfig.ruleContentType && Intrinsics.areEqual(this.deviceCode, authConfig.deviceCode) && Intrinsics.areEqual(this.deviceSnCode, authConfig.deviceSnCode);
    }

    public int hashCode() {
        return (((((((((((((this.token.hashCode() * 31) + Integer.hashCode(this.channelId)) * 31) + Integer.hashCode(this.productId)) * 31) + Integer.hashCode(this.modelType)) * 31) + Integer.hashCode(this.clientType)) * 31) + Integer.hashCode(this.ruleContentType)) * 31) + this.deviceCode.hashCode()) * 31) + this.deviceSnCode.hashCode();
    }

    public String toString() {
        return "AuthConfig(token=" + this.token + ", channelId=" + this.channelId + ", productId=" + this.productId + ", modelType=" + this.modelType + ", clientType=" + this.clientType + ", ruleContentType=" + this.ruleContentType + ", deviceCode=" + this.deviceCode + ", deviceSnCode=" + this.deviceSnCode + Separators.RPAREN;
    }

    public AuthConfig(String token, int i, int i2, int i3, int i4, int i5, String deviceCode, String deviceSnCode) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(deviceCode, "deviceCode");
        Intrinsics.checkNotNullParameter(deviceSnCode, "deviceSnCode");
        this.token = token;
        this.channelId = i;
        this.productId = i2;
        this.modelType = i3;
        this.clientType = i4;
        this.ruleContentType = i5;
        this.deviceCode = deviceCode;
        this.deviceSnCode = deviceSnCode;
    }

    public final String getToken() {
        return this.token;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getModelType() {
        return this.modelType;
    }

    public final int getClientType() {
        return this.clientType;
    }

    public final int getRuleContentType() {
        return this.ruleContentType;
    }

    public final String getDeviceCode() {
        return this.deviceCode;
    }

    public final String getDeviceSnCode() {
        return this.deviceSnCode;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.token);
        jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, this.channelId);
        jSONObject.put("productId", this.productId);
        jSONObject.put("modelType", this.modelType);
        jSONObject.put("clientType", this.clientType);
        jSONObject.put("ruleContentType", this.ruleContentType);
        jSONObject.put("deviceCode", this.deviceCode);
        jSONObject.put("deviceSnCode", this.deviceSnCode);
        return jSONObject;
    }
}
