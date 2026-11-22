package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/wakeup/module/ai/bean/StartConfig;", "", "fromLanguageId", "", "toLanguageId", "authConfig", "Lcom/wakeup/module/ai/bean/AuthConfig;", "sentenceIndex", "", "accessMethod", "audioConfig", "Lcom/wakeup/module/ai/bean/AudioConfig;", "<init>", "(IILcom/wakeup/module/ai/bean/AuthConfig;JILcom/wakeup/module/ai/bean/AudioConfig;)V", "getFromLanguageId", "()I", "getToLanguageId", "getAuthConfig", "()Lcom/wakeup/module/ai/bean/AuthConfig;", "getSentenceIndex", "()J", "getAccessMethod", "getAudioConfig", "()Lcom/wakeup/module/ai/bean/AudioConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StartConfig {
    private final int accessMethod;
    private final AudioConfig audioConfig;
    private final AuthConfig authConfig;
    private final int fromLanguageId;
    private final long sentenceIndex;
    private final int toLanguageId;

    public static /* synthetic */ StartConfig copy$default(StartConfig startConfig, int i, int i2, AuthConfig authConfig, long j, int i3, AudioConfig audioConfig, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = startConfig.fromLanguageId;
        }
        if ((i4 & 2) != 0) {
            i2 = startConfig.toLanguageId;
        }
        if ((i4 & 4) != 0) {
            authConfig = startConfig.authConfig;
        }
        if ((i4 & 8) != 0) {
            j = startConfig.sentenceIndex;
        }
        if ((i4 & 16) != 0) {
            i3 = startConfig.accessMethod;
        }
        if ((i4 & 32) != 0) {
            audioConfig = startConfig.audioConfig;
        }
        long j2 = j;
        AuthConfig authConfig2 = authConfig;
        return startConfig.copy(i, i2, authConfig2, j2, i3, audioConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFromLanguageId() {
        return this.fromLanguageId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getToLanguageId() {
        return this.toLanguageId;
    }

    /* renamed from: component3, reason: from getter */
    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAccessMethod() {
        return this.accessMethod;
    }

    /* renamed from: component6, reason: from getter */
    public final AudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public final StartConfig copy(int fromLanguageId, int toLanguageId, AuthConfig authConfig, long sentenceIndex, int accessMethod, AudioConfig audioConfig) {
        Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        return new StartConfig(fromLanguageId, toLanguageId, authConfig, sentenceIndex, accessMethod, audioConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartConfig)) {
            return false;
        }
        StartConfig startConfig = (StartConfig) other;
        return this.fromLanguageId == startConfig.fromLanguageId && this.toLanguageId == startConfig.toLanguageId && Intrinsics.areEqual(this.authConfig, startConfig.authConfig) && this.sentenceIndex == startConfig.sentenceIndex && this.accessMethod == startConfig.accessMethod && Intrinsics.areEqual(this.audioConfig, startConfig.audioConfig);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.fromLanguageId) * 31) + Integer.hashCode(this.toLanguageId)) * 31) + this.authConfig.hashCode()) * 31) + Long.hashCode(this.sentenceIndex)) * 31) + Integer.hashCode(this.accessMethod)) * 31) + this.audioConfig.hashCode();
    }

    public String toString() {
        return "StartConfig(fromLanguageId=" + this.fromLanguageId + ", toLanguageId=" + this.toLanguageId + ", authConfig=" + this.authConfig + ", sentenceIndex=" + this.sentenceIndex + ", accessMethod=" + this.accessMethod + ", audioConfig=" + this.audioConfig + Separators.RPAREN;
    }

    public StartConfig(int i, int i2, AuthConfig authConfig, long j, int i3, AudioConfig audioConfig) {
        Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        this.fromLanguageId = i;
        this.toLanguageId = i2;
        this.authConfig = authConfig;
        this.sentenceIndex = j;
        this.accessMethod = i3;
        this.audioConfig = audioConfig;
    }

    public final int getFromLanguageId() {
        return this.fromLanguageId;
    }

    public final int getToLanguageId() {
        return this.toLanguageId;
    }

    public final AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public final long getSentenceIndex() {
        return this.sentenceIndex;
    }

    public final int getAccessMethod() {
        return this.accessMethod;
    }

    public /* synthetic */ StartConfig(int i, int i2, AuthConfig authConfig, long j, int i3, AudioConfig audioConfig, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, authConfig, (i4 & 8) != 0 ? 1L : j, (i4 & 16) != 0 ? 1 : i3, (i4 & 32) != 0 ? new AudioConfig(0, 0, 0, 0, 0, 0, 0, false, 0, 511, null) : audioConfig);
    }

    public final AudioConfig getAudioConfig() {
        return this.audioConfig;
    }
}
