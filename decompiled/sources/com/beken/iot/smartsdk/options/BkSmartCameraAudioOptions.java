package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.callback.OnAudioCallback;
import com.beken.iot.smartsdk.callback.OnAudioDataCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BkSmartCameraAudioOptions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraAudioOptions;", "", "builder", "Lcom/beken/iot/smartsdk/options/BkSmartCameraAudioOptions$Builder;", "(Lcom/beken/iot/smartsdk/options/BkSmartCameraAudioOptions$Builder;)V", "aceEnable", "", "getAceEnable", "()I", "boardSpeakerType", "getBoardSpeakerType", "onAudioCallback", "Lcom/beken/iot/smartsdk/callback/OnAudioCallback;", "getOnAudioCallback", "()Lcom/beken/iot/smartsdk/callback/OnAudioCallback;", "onAudioDataCallback", "Lcom/beken/iot/smartsdk/callback/OnAudioDataCallback;", "getOnAudioDataCallback", "()Lcom/beken/iot/smartsdk/callback/OnAudioDataCallback;", "playerFormat", "getPlayerFormat", "playerSampleRate", "getPlayerSampleRate", "recorderFormat", "getRecorderFormat", "recorderSampleRate", "getRecorderSampleRate", "toString", "", "Builder", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BkSmartCameraAudioOptions {
    private final int aceEnable;
    private final int boardSpeakerType;
    private final OnAudioCallback onAudioCallback;
    private final OnAudioDataCallback onAudioDataCallback;
    private final int playerFormat;
    private final int playerSampleRate;
    private final int recorderFormat;
    private final int recorderSampleRate;

    public BkSmartCameraAudioOptions(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.aceEnable = builder.getAceEnable() ? 1 : 0;
        this.playerFormat = builder.getPlayerFormat().getFormat();
        this.playerSampleRate = builder.getPlayerSampleRate().getRate();
        this.recorderFormat = builder.getRecorderFormat().getFormat();
        this.recorderSampleRate = builder.getRecorderSampleRate().getRate();
        this.boardSpeakerType = builder.getBoardSpeakerType().getType();
        this.onAudioCallback = builder.getOnAudioCallback();
        this.onAudioDataCallback = builder.getOnAudioDataCallback();
    }

    public final int getAceEnable() {
        return this.aceEnable;
    }

    public final int getPlayerFormat() {
        return this.playerFormat;
    }

    public final int getPlayerSampleRate() {
        return this.playerSampleRate;
    }

    public final int getRecorderFormat() {
        return this.recorderFormat;
    }

    public final int getRecorderSampleRate() {
        return this.recorderSampleRate;
    }

    public final int getBoardSpeakerType() {
        return this.boardSpeakerType;
    }

    public final OnAudioCallback getOnAudioCallback() {
        return this.onAudioCallback;
    }

    public final OnAudioDataCallback getOnAudioDataCallback() {
        return this.onAudioDataCallback;
    }

    /* compiled from: BkSmartCameraAudioOptions.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/beken/iot/smartsdk/options/BkSmartCameraAudioOptions$Builder;", "", "()V", "aceEnable", "", "boardSpeakerType", "Lcom/beken/iot/smartsdk/options/BoardSpeakerType;", "onAudioCallback", "Lcom/beken/iot/smartsdk/callback/OnAudioCallback;", "onAudioDataCallback", "Lcom/beken/iot/smartsdk/callback/OnAudioDataCallback;", "playerFormat", "Lcom/beken/iot/smartsdk/options/AudioFormat;", "playerSampleRate", "Lcom/beken/iot/smartsdk/options/AudioRate;", "recorderFormat", "recorderSampleRate", "build", "Lcom/beken/iot/smartsdk/options/BkSmartCameraAudioOptions;", "getAceEnable", "getAudioCallback", "getAudioDataCallback", "getBoardSpeakerType", "getPlayerFormat", "getPlayerSampleRate", "getRecorderFormat", "getRecorderSampleRate", "setAceEnable", "setAudioDataCallback", "callback", "setBoardSpeakerType", "setOnAudioCallback", "setPlayerFormat", "setPlayerSampleRate", "setRecorderFormat", "setRecorderSampleRate", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private OnAudioCallback onAudioCallback;
        private OnAudioDataCallback onAudioDataCallback;
        private boolean aceEnable = true;
        private AudioFormat playerFormat = AudioFormat.G711A;
        private AudioRate playerSampleRate = AudioRate.RATE_8K;
        private AudioFormat recorderFormat = AudioFormat.G711A;
        private AudioRate recorderSampleRate = AudioRate.RATE_8K;
        private BoardSpeakerType boardSpeakerType = BoardSpeakerType.ONBOARD;

        public final boolean getAceEnable() {
            return this.aceEnable;
        }

        public final Builder setAceEnable(boolean aceEnable) {
            this.aceEnable = aceEnable;
            return this;
        }

        public final AudioFormat getPlayerFormat() {
            return this.playerFormat;
        }

        public final Builder setPlayerFormat(AudioFormat playerFormat) {
            Intrinsics.checkNotNullParameter(playerFormat, "playerFormat");
            this.playerFormat = playerFormat;
            return this;
        }

        public final AudioRate getPlayerSampleRate() {
            return this.playerSampleRate;
        }

        public final Builder setPlayerSampleRate(AudioRate playerSampleRate) {
            Intrinsics.checkNotNullParameter(playerSampleRate, "playerSampleRate");
            this.playerSampleRate = playerSampleRate;
            return this;
        }

        public final AudioFormat getRecorderFormat() {
            return this.recorderFormat;
        }

        public final Builder setRecorderFormat(AudioFormat recorderFormat) {
            Intrinsics.checkNotNullParameter(recorderFormat, "recorderFormat");
            this.recorderFormat = recorderFormat;
            return this;
        }

        public final AudioRate getRecorderSampleRate() {
            return this.recorderSampleRate;
        }

        public final Builder setRecorderSampleRate(AudioRate recorderSampleRate) {
            Intrinsics.checkNotNullParameter(recorderSampleRate, "recorderSampleRate");
            this.recorderSampleRate = recorderSampleRate;
            return this;
        }

        public final BoardSpeakerType getBoardSpeakerType() {
            return this.boardSpeakerType;
        }

        public final Builder setBoardSpeakerType(BoardSpeakerType boardSpeakerType) {
            Intrinsics.checkNotNullParameter(boardSpeakerType, "boardSpeakerType");
            this.boardSpeakerType = boardSpeakerType;
            return this;
        }

        public final Builder setOnAudioCallback(OnAudioCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.onAudioCallback = callback;
            return this;
        }

        /* renamed from: getAudioCallback, reason: from getter */
        public final OnAudioCallback getOnAudioCallback() {
            return this.onAudioCallback;
        }

        public final Builder setAudioDataCallback(OnAudioDataCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.onAudioDataCallback = callback;
            return this;
        }

        /* renamed from: getAudioDataCallback, reason: from getter */
        public final OnAudioDataCallback getOnAudioDataCallback() {
            return this.onAudioDataCallback;
        }

        public final BkSmartCameraAudioOptions build() {
            return new BkSmartCameraAudioOptions(this);
        }
    }

    public String toString() {
        return "BkSmartCameraAudioOptions(aceEnable=" + this.aceEnable + ", playerFormat=" + this.playerFormat + ", playerSampleRate=" + this.playerSampleRate + ", recorderFormat=" + this.recorderFormat + ", recorderSampleRate=" + this.recorderSampleRate + ", boardSpeakerType=" + this.boardSpeakerType + ", onAudioCallback=" + this.onAudioCallback + ", onAudioDataCallback=" + this.onAudioDataCallback + ')';
    }
}
