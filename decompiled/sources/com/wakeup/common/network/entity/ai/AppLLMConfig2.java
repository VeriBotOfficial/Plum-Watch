package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLLMConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u001e¨\u00062"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AppLLMConfig2;", "", "system_prompt", "", "tools", "mcp_server_config", "offLineTools", "asrLanguageCode", "ttsVoiceCode", "url", "createTime", "", "asr_chinese_convert", "tts_chinese_convert", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getSystem_prompt", "()Ljava/lang/String;", "getTools", "getMcp_server_config", "getOffLineTools", "getAsrLanguageCode", "getTtsVoiceCode", "getUrl", "getCreateTime", "()J", "setCreateTime", "(J)V", "getAsr_chinese_convert", "setAsr_chinese_convert", "(Ljava/lang/String;)V", "getTts_chinese_convert", "setTts_chinese_convert", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppLLMConfig2 {
    private final String asrLanguageCode;
    private String asr_chinese_convert;
    private long createTime;
    private final String mcp_server_config;
    private final String offLineTools;
    private final String system_prompt;
    private final String tools;
    private final String ttsVoiceCode;
    private String tts_chinese_convert;
    private final String url;

    public static /* synthetic */ AppLLMConfig2 copy$default(AppLLMConfig2 appLLMConfig2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLLMConfig2.system_prompt;
        }
        if ((i & 2) != 0) {
            str2 = appLLMConfig2.tools;
        }
        if ((i & 4) != 0) {
            str3 = appLLMConfig2.mcp_server_config;
        }
        if ((i & 8) != 0) {
            str4 = appLLMConfig2.offLineTools;
        }
        if ((i & 16) != 0) {
            str5 = appLLMConfig2.asrLanguageCode;
        }
        if ((i & 32) != 0) {
            str6 = appLLMConfig2.ttsVoiceCode;
        }
        if ((i & 64) != 0) {
            str7 = appLLMConfig2.url;
        }
        if ((i & 128) != 0) {
            j = appLLMConfig2.createTime;
        }
        if ((i & 256) != 0) {
            str8 = appLLMConfig2.asr_chinese_convert;
        }
        if ((i & 512) != 0) {
            str9 = appLLMConfig2.tts_chinese_convert;
        }
        long j2 = j;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        return appLLMConfig2.copy(str, str2, str14, str12, str13, str10, str11, j2, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSystem_prompt() {
        return this.system_prompt;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTts_chinese_convert() {
        return this.tts_chinese_convert;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTools() {
        return this.tools;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMcp_server_config() {
        return this.mcp_server_config;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOffLineTools() {
        return this.offLineTools;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAsrLanguageCode() {
        return this.asrLanguageCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAsr_chinese_convert() {
        return this.asr_chinese_convert;
    }

    public final AppLLMConfig2 copy(String system_prompt, String tools, String mcp_server_config, String offLineTools, String asrLanguageCode, String ttsVoiceCode, String url, long createTime, String asr_chinese_convert, String tts_chinese_convert) {
        return new AppLLMConfig2(system_prompt, tools, mcp_server_config, offLineTools, asrLanguageCode, ttsVoiceCode, url, createTime, asr_chinese_convert, tts_chinese_convert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppLLMConfig2)) {
            return false;
        }
        AppLLMConfig2 appLLMConfig2 = (AppLLMConfig2) other;
        return Intrinsics.areEqual(this.system_prompt, appLLMConfig2.system_prompt) && Intrinsics.areEqual(this.tools, appLLMConfig2.tools) && Intrinsics.areEqual(this.mcp_server_config, appLLMConfig2.mcp_server_config) && Intrinsics.areEqual(this.offLineTools, appLLMConfig2.offLineTools) && Intrinsics.areEqual(this.asrLanguageCode, appLLMConfig2.asrLanguageCode) && Intrinsics.areEqual(this.ttsVoiceCode, appLLMConfig2.ttsVoiceCode) && Intrinsics.areEqual(this.url, appLLMConfig2.url) && this.createTime == appLLMConfig2.createTime && Intrinsics.areEqual(this.asr_chinese_convert, appLLMConfig2.asr_chinese_convert) && Intrinsics.areEqual(this.tts_chinese_convert, appLLMConfig2.tts_chinese_convert);
    }

    public int hashCode() {
        String str = this.system_prompt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tools;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mcp_server_config;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offLineTools;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.asrLanguageCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ttsVoiceCode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.url;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.createTime)) * 31;
        String str8 = this.asr_chinese_convert;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tts_chinese_convert;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "AppLLMConfig2(system_prompt=" + this.system_prompt + ", tools=" + this.tools + ", mcp_server_config=" + this.mcp_server_config + ", offLineTools=" + this.offLineTools + ", asrLanguageCode=" + this.asrLanguageCode + ", ttsVoiceCode=" + this.ttsVoiceCode + ", url=" + this.url + ", createTime=" + this.createTime + ", asr_chinese_convert=" + this.asr_chinese_convert + ", tts_chinese_convert=" + this.tts_chinese_convert + Separators.RPAREN;
    }

    public AppLLMConfig2(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9) {
        this.system_prompt = str;
        this.tools = str2;
        this.mcp_server_config = str3;
        this.offLineTools = str4;
        this.asrLanguageCode = str5;
        this.ttsVoiceCode = str6;
        this.url = str7;
        this.createTime = j;
        this.asr_chinese_convert = str8;
        this.tts_chinese_convert = str9;
    }

    public final String getSystem_prompt() {
        return this.system_prompt;
    }

    public final String getTools() {
        return this.tools;
    }

    public final String getMcp_server_config() {
        return this.mcp_server_config;
    }

    public final String getOffLineTools() {
        return this.offLineTools;
    }

    public final String getAsrLanguageCode() {
        return this.asrLanguageCode;
    }

    public final String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final String getAsr_chinese_convert() {
        return this.asr_chinese_convert;
    }

    public final void setAsr_chinese_convert(String str) {
        this.asr_chinese_convert = str;
    }

    public final String getTts_chinese_convert() {
        return this.tts_chinese_convert;
    }

    public final void setTts_chinese_convert(String str) {
        this.tts_chinese_convert = str;
    }
}
