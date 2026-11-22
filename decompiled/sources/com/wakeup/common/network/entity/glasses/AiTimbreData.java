package com.wakeup.common.network.entity.glasses;

import kotlin.Metadata;

/* compiled from: AiTimbreData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000bR\u0014\u0010\"\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000b¨\u0006&"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/AiTimbreData;", "", "<init>", "()V", "id", "", "getId", "()I", "appLanguageCode", "", "getAppLanguageCode", "()Ljava/lang/String;", "languageId", "getLanguageId", "appLanguageZhName", "getAppLanguageZhName", "appLanguageEnName", "getAppLanguageEnName", "ttsVoiceName", "getTtsVoiceName", "ttsVoiceCode", "getTtsVoiceCode", "voiceImageUrl", "getVoiceImageUrl", "useFlag", "", "getUseFlag", "()Z", "timbreType", "getTimbreType", "ttsLanguageName", "getTtsLanguageName", "ttsLanguageCode", "getTtsLanguageCode", "ttsVoiceType", "getTtsVoiceType", "ttsVoiceTypeName", "getTtsVoiceTypeName", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AiTimbreData {
    private final int id;
    private final int languageId;
    private final int ttsVoiceType;
    private final boolean useFlag;
    private final String appLanguageCode = "";
    private final String appLanguageZhName = "";
    private final String appLanguageEnName = "";
    private final String ttsVoiceName = "";
    private final String ttsVoiceCode = "";
    private final String voiceImageUrl = "";
    private final int timbreType = 1;
    private final String ttsLanguageName = "";
    private final String ttsLanguageCode = "";
    private final String ttsVoiceTypeName = "";

    public final int getId() {
        return this.id;
    }

    public final String getAppLanguageCode() {
        return this.appLanguageCode;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final String getAppLanguageZhName() {
        return this.appLanguageZhName;
    }

    public final String getAppLanguageEnName() {
        return this.appLanguageEnName;
    }

    public final String getTtsVoiceName() {
        return this.ttsVoiceName;
    }

    public final String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public final String getVoiceImageUrl() {
        return this.voiceImageUrl;
    }

    public final boolean getUseFlag() {
        return this.useFlag;
    }

    public final int getTimbreType() {
        return this.timbreType;
    }

    public final String getTtsLanguageName() {
        return this.ttsLanguageName;
    }

    public final String getTtsLanguageCode() {
        return this.ttsLanguageCode;
    }

    public final int getTtsVoiceType() {
        return this.ttsVoiceType;
    }

    public final String getTtsVoiceTypeName() {
        return this.ttsVoiceTypeName;
    }
}
