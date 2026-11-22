package com.xmly.businesssdk.service;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioOperationResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/service/AudioOperationResult;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioOperationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int code;
    private final String message;

    /* compiled from: AudioOperationResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/xmly/businesssdk/service/AudioOperationResult$Companion;", "", "()V", "error", "Lcom/xmly/businesssdk/service/AudioOperationResult;", "code", "", "message", "", "nextSuccess", "pageLoadSuccess", "operation", "prevSuccess", "success", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AudioOperationResult success$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "操作成功";
            }
            return companion.success(str);
        }

        public final AudioOperationResult error(int code, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AudioOperationResult(code, message);
        }

        public final AudioOperationResult nextSuccess() {
            return success("播放下一首成功");
        }

        public final AudioOperationResult pageLoadSuccess(String operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return success(operation + "翻页成功");
        }

        public final AudioOperationResult prevSuccess() {
            return success("播放上一首成功");
        }

        public final AudioOperationResult success(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AudioOperationResult(0, message);
        }
    }

    public AudioOperationResult(int i, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public static /* synthetic */ AudioOperationResult copy$default(AudioOperationResult audioOperationResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = audioOperationResult.code;
        }
        if ((i2 & 2) != 0) {
            str = audioOperationResult.message;
        }
        return audioOperationResult.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AudioOperationResult copy(int code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new AudioOperationResult(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioOperationResult)) {
            return false;
        }
        AudioOperationResult audioOperationResult = (AudioOperationResult) other;
        return this.code == audioOperationResult.code && Intrinsics.areEqual(this.message, audioOperationResult.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("AudioOperationResult(code=").append(this.code).append(", message="), this.message, ')');
    }
}
