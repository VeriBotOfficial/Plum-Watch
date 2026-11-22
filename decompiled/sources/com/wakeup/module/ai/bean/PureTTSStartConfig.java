package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TTSBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBE\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/wakeup/module/ai/bean/PureTTSStartConfig;", "", "relatedBusinessFunction", "", "relatedMeetingId", "", "asrLanguageId", "translationLanguageId", "authConfig", "Lcom/wakeup/module/ai/bean/AuthConfig;", "accessMethod", "outputConfig", "Lcom/wakeup/module/ai/bean/PureTTSOutputConfig;", "<init>", "(ILjava/lang/String;IILcom/wakeup/module/ai/bean/AuthConfig;ILcom/wakeup/module/ai/bean/PureTTSOutputConfig;)V", "Lcom/wakeup/module/ai/bean/BusinessFunction;", "(Lcom/wakeup/module/ai/bean/BusinessFunction;Ljava/lang/String;IILcom/wakeup/module/ai/bean/AuthConfig;ILcom/wakeup/module/ai/bean/PureTTSOutputConfig;)V", "getRelatedBusinessFunction", "()I", "getRelatedMeetingId", "()Ljava/lang/String;", "getAsrLanguageId", "getTranslationLanguageId", "getAuthConfig", "()Lcom/wakeup/module/ai/bean/AuthConfig;", "getAccessMethod", "getOutputConfig", "()Lcom/wakeup/module/ai/bean/PureTTSOutputConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PureTTSStartConfig {
    private final int accessMethod;
    private final int asrLanguageId;
    private final AuthConfig authConfig;
    private final PureTTSOutputConfig outputConfig;
    private final int relatedBusinessFunction;
    private final String relatedMeetingId;
    private final int translationLanguageId;

    public static /* synthetic */ PureTTSStartConfig copy$default(PureTTSStartConfig pureTTSStartConfig, int i, String str, int i2, int i3, AuthConfig authConfig, int i4, PureTTSOutputConfig pureTTSOutputConfig, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = pureTTSStartConfig.relatedBusinessFunction;
        }
        if ((i5 & 2) != 0) {
            str = pureTTSStartConfig.relatedMeetingId;
        }
        if ((i5 & 4) != 0) {
            i2 = pureTTSStartConfig.asrLanguageId;
        }
        if ((i5 & 8) != 0) {
            i3 = pureTTSStartConfig.translationLanguageId;
        }
        if ((i5 & 16) != 0) {
            authConfig = pureTTSStartConfig.authConfig;
        }
        if ((i5 & 32) != 0) {
            i4 = pureTTSStartConfig.accessMethod;
        }
        if ((i5 & 64) != 0) {
            pureTTSOutputConfig = pureTTSStartConfig.outputConfig;
        }
        int i6 = i4;
        PureTTSOutputConfig pureTTSOutputConfig2 = pureTTSOutputConfig;
        AuthConfig authConfig2 = authConfig;
        int i7 = i2;
        return pureTTSStartConfig.copy(i, str, i7, i3, authConfig2, i6, pureTTSOutputConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRelatedBusinessFunction() {
        return this.relatedBusinessFunction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRelatedMeetingId() {
        return this.relatedMeetingId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    /* renamed from: component5, reason: from getter */
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAccessMethod() {
        return this.accessMethod;
    }

    /* renamed from: component7, reason: from getter */
    public final PureTTSOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public final PureTTSStartConfig copy(int relatedBusinessFunction, String relatedMeetingId, int asrLanguageId, int translationLanguageId, AuthConfig authConfig, int accessMethod, PureTTSOutputConfig outputConfig) {
        Intrinsics.checkNotNullParameter(relatedMeetingId, "relatedMeetingId");
        Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        Intrinsics.checkNotNullParameter(outputConfig, "outputConfig");
        return new PureTTSStartConfig(relatedBusinessFunction, relatedMeetingId, asrLanguageId, translationLanguageId, authConfig, accessMethod, outputConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PureTTSStartConfig)) {
            return false;
        }
        PureTTSStartConfig pureTTSStartConfig = (PureTTSStartConfig) other;
        return this.relatedBusinessFunction == pureTTSStartConfig.relatedBusinessFunction && Intrinsics.areEqual(this.relatedMeetingId, pureTTSStartConfig.relatedMeetingId) && this.asrLanguageId == pureTTSStartConfig.asrLanguageId && this.translationLanguageId == pureTTSStartConfig.translationLanguageId && Intrinsics.areEqual(this.authConfig, pureTTSStartConfig.authConfig) && this.accessMethod == pureTTSStartConfig.accessMethod && Intrinsics.areEqual(this.outputConfig, pureTTSStartConfig.outputConfig);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.relatedBusinessFunction) * 31) + this.relatedMeetingId.hashCode()) * 31) + Integer.hashCode(this.asrLanguageId)) * 31) + Integer.hashCode(this.translationLanguageId)) * 31) + this.authConfig.hashCode()) * 31) + Integer.hashCode(this.accessMethod)) * 31) + this.outputConfig.hashCode();
    }

    public String toString() {
        return "PureTTSStartConfig(relatedBusinessFunction=" + this.relatedBusinessFunction + ", relatedMeetingId=" + this.relatedMeetingId + ", asrLanguageId=" + this.asrLanguageId + ", translationLanguageId=" + this.translationLanguageId + ", authConfig=" + this.authConfig + ", accessMethod=" + this.accessMethod + ", outputConfig=" + this.outputConfig + Separators.RPAREN;
    }

    public PureTTSStartConfig(int i, String relatedMeetingId, int i2, int i3, AuthConfig authConfig, int i4, PureTTSOutputConfig outputConfig) {
        Intrinsics.checkNotNullParameter(relatedMeetingId, "relatedMeetingId");
        Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        Intrinsics.checkNotNullParameter(outputConfig, "outputConfig");
        this.relatedBusinessFunction = i;
        this.relatedMeetingId = relatedMeetingId;
        this.asrLanguageId = i2;
        this.translationLanguageId = i3;
        this.authConfig = authConfig;
        this.accessMethod = i4;
        this.outputConfig = outputConfig;
    }

    public final int getRelatedBusinessFunction() {
        return this.relatedBusinessFunction;
    }

    public final String getRelatedMeetingId() {
        return this.relatedMeetingId;
    }

    public final int getAsrLanguageId() {
        return this.asrLanguageId;
    }

    public final int getTranslationLanguageId() {
        return this.translationLanguageId;
    }

    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public final int getAccessMethod() {
        return this.accessMethod;
    }

    public /* synthetic */ PureTTSStartConfig(int i, String str, int i2, int i3, AuthConfig authConfig, int i4, PureTTSOutputConfig pureTTSOutputConfig, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, i3, authConfig, (i5 & 32) != 0 ? 1 : i4, (i5 & 64) != 0 ? new PureTTSOutputConfig(0, 0, 0, 0, 0, 0, false, 127, null) : pureTTSOutputConfig);
    }

    public final PureTTSOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public /* synthetic */ PureTTSStartConfig(BusinessFunction businessFunction, String str, int i, int i2, AuthConfig authConfig, int i3, PureTTSOutputConfig pureTTSOutputConfig, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(businessFunction, str, i, i2, authConfig, (i4 & 32) != 0 ? 1 : i3, (i4 & 64) != 0 ? new PureTTSOutputConfig(0, 0, 0, 0, 0, 0, false, 127, null) : pureTTSOutputConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PureTTSStartConfig(BusinessFunction relatedBusinessFunction, String relatedMeetingId, int i, int i2, AuthConfig authConfig, int i3, PureTTSOutputConfig outputConfig) {
        this(relatedBusinessFunction.getValue(), relatedMeetingId, i, i2, authConfig, i3, outputConfig);
        Intrinsics.checkNotNullParameter(relatedBusinessFunction, "relatedBusinessFunction");
        Intrinsics.checkNotNullParameter(relatedMeetingId, "relatedMeetingId");
        Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        Intrinsics.checkNotNullParameter(outputConfig, "outputConfig");
    }
}
