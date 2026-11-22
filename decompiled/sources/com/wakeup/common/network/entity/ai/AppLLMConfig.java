package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLLMConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/ai/AppLLMConfig;", "", "mcpToken", "", "languageId", "asrLanguageCode", "ttsLanguageCode", "ttsVoiceCode", "url", "prompt_endpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMcpToken", "()Ljava/lang/String;", "getLanguageId", "getAsrLanguageCode", "getTtsLanguageCode", "getTtsVoiceCode", "getUrl", "getPrompt_endpoint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppLLMConfig {
    private final String asrLanguageCode;
    private final String languageId;
    private final String mcpToken;
    private final String prompt_endpoint;
    private final String ttsLanguageCode;
    private final String ttsVoiceCode;
    private final String url;

    public static /* synthetic */ AppLLMConfig copy$default(AppLLMConfig appLLMConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLLMConfig.mcpToken;
        }
        if ((i & 2) != 0) {
            str2 = appLLMConfig.languageId;
        }
        if ((i & 4) != 0) {
            str3 = appLLMConfig.asrLanguageCode;
        }
        if ((i & 8) != 0) {
            str4 = appLLMConfig.ttsLanguageCode;
        }
        if ((i & 16) != 0) {
            str5 = appLLMConfig.ttsVoiceCode;
        }
        if ((i & 32) != 0) {
            str6 = appLLMConfig.url;
        }
        if ((i & 64) != 0) {
            str7 = appLLMConfig.prompt_endpoint;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return appLLMConfig.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMcpToken() {
        return this.mcpToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguageId() {
        return this.languageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAsrLanguageCode() {
        return this.asrLanguageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTtsLanguageCode() {
        return this.ttsLanguageCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPrompt_endpoint() {
        return this.prompt_endpoint;
    }

    public final AppLLMConfig copy(String mcpToken, String languageId, String asrLanguageCode, String ttsLanguageCode, String ttsVoiceCode, String url, String prompt_endpoint) {
        Intrinsics.checkNotNullParameter(mcpToken, "mcpToken");
        Intrinsics.checkNotNullParameter(languageId, "languageId");
        Intrinsics.checkNotNullParameter(asrLanguageCode, "asrLanguageCode");
        Intrinsics.checkNotNullParameter(ttsLanguageCode, "ttsLanguageCode");
        Intrinsics.checkNotNullParameter(ttsVoiceCode, "ttsVoiceCode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prompt_endpoint, "prompt_endpoint");
        return new AppLLMConfig(mcpToken, languageId, asrLanguageCode, ttsLanguageCode, ttsVoiceCode, url, prompt_endpoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppLLMConfig)) {
            return false;
        }
        AppLLMConfig appLLMConfig = (AppLLMConfig) other;
        return Intrinsics.areEqual(this.mcpToken, appLLMConfig.mcpToken) && Intrinsics.areEqual(this.languageId, appLLMConfig.languageId) && Intrinsics.areEqual(this.asrLanguageCode, appLLMConfig.asrLanguageCode) && Intrinsics.areEqual(this.ttsLanguageCode, appLLMConfig.ttsLanguageCode) && Intrinsics.areEqual(this.ttsVoiceCode, appLLMConfig.ttsVoiceCode) && Intrinsics.areEqual(this.url, appLLMConfig.url) && Intrinsics.areEqual(this.prompt_endpoint, appLLMConfig.prompt_endpoint);
    }

    public int hashCode() {
        return (((((((((((this.mcpToken.hashCode() * 31) + this.languageId.hashCode()) * 31) + this.asrLanguageCode.hashCode()) * 31) + this.ttsLanguageCode.hashCode()) * 31) + this.ttsVoiceCode.hashCode()) * 31) + this.url.hashCode()) * 31) + this.prompt_endpoint.hashCode();
    }

    public String toString() {
        return "AppLLMConfig(mcpToken=" + this.mcpToken + ", languageId=" + this.languageId + ", asrLanguageCode=" + this.asrLanguageCode + ", ttsLanguageCode=" + this.ttsLanguageCode + ", ttsVoiceCode=" + this.ttsVoiceCode + ", url=" + this.url + ", prompt_endpoint=" + this.prompt_endpoint + Separators.RPAREN;
    }

    public AppLLMConfig(String mcpToken, String languageId, String asrLanguageCode, String ttsLanguageCode, String ttsVoiceCode, String url, String prompt_endpoint) {
        Intrinsics.checkNotNullParameter(mcpToken, "mcpToken");
        Intrinsics.checkNotNullParameter(languageId, "languageId");
        Intrinsics.checkNotNullParameter(asrLanguageCode, "asrLanguageCode");
        Intrinsics.checkNotNullParameter(ttsLanguageCode, "ttsLanguageCode");
        Intrinsics.checkNotNullParameter(ttsVoiceCode, "ttsVoiceCode");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(prompt_endpoint, "prompt_endpoint");
        this.mcpToken = mcpToken;
        this.languageId = languageId;
        this.asrLanguageCode = asrLanguageCode;
        this.ttsLanguageCode = ttsLanguageCode;
        this.ttsVoiceCode = ttsVoiceCode;
        this.url = url;
        this.prompt_endpoint = prompt_endpoint;
    }

    public final String getMcpToken() {
        return this.mcpToken;
    }

    public final String getLanguageId() {
        return this.languageId;
    }

    public final String getAsrLanguageCode() {
        return this.asrLanguageCode;
    }

    public final String getTtsLanguageCode() {
        return this.ttsLanguageCode;
    }

    public final String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPrompt_endpoint() {
        return this.prompt_endpoint;
    }
}
