package io.livekit.android;

import android.media.AudioAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveKitOverrides.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/AudioType;", "", "audioMode", "", "audioAttributes", "Landroid/media/AudioAttributes;", "audioStreamType", "(ILandroid/media/AudioAttributes;I)V", "getAudioAttributes", "()Landroid/media/AudioAttributes;", "getAudioMode", "()I", "getAudioStreamType", "CallAudioType", "CustomAudioType", "MediaAudioType", "Lio/livekit/android/AudioType$CallAudioType;", "Lio/livekit/android/AudioType$CustomAudioType;", "Lio/livekit/android/AudioType$MediaAudioType;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AudioType {
    private final AudioAttributes audioAttributes;
    private final int audioMode;
    private final int audioStreamType;

    public /* synthetic */ AudioType(int i, AudioAttributes audioAttributes, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, audioAttributes, i2);
    }

    private AudioType(int i, AudioAttributes audioAttributes, int i2) {
        this.audioMode = i;
        this.audioAttributes = audioAttributes;
        this.audioStreamType = i2;
    }

    public final int getAudioMode() {
        return this.audioMode;
    }

    public final AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    public final int getAudioStreamType() {
        return this.audioStreamType;
    }

    /* compiled from: LiveKitOverrides.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/AudioType$MediaAudioType;", "Lio/livekit/android/AudioType;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MediaAudioType extends AudioType {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MediaAudioType() {
            /*
                r4 = this;
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 1
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                r1 = 0
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                android.media.AudioAttributes r0 = r0.build()
                java.lang.String r2 = "build(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                r2 = 3
                r3 = 0
                r4.<init>(r1, r0, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.AudioType.MediaAudioType.<init>():void");
        }
    }

    /* compiled from: LiveKitOverrides.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/AudioType$CallAudioType;", "Lio/livekit/android/AudioType;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallAudioType extends AudioType {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CallAudioType() {
            /*
                r4 = this;
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                r1 = 2
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                r1 = 1
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                android.media.AudioAttributes r0 = r0.build()
                java.lang.String r1 = "build(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r1 = 0
                r2 = 0
                r3 = 3
                r4.<init>(r3, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.AudioType.CallAudioType.<init>():void");
        }
    }

    /* compiled from: LiveKitOverrides.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/AudioType$CustomAudioType;", "Lio/livekit/android/AudioType;", "audioMode", "", "audioAttributes", "Landroid/media/AudioAttributes;", "audioStreamType", "(ILandroid/media/AudioAttributes;I)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CustomAudioType extends AudioType {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAudioType(int i, AudioAttributes audioAttributes, int i2) {
            super(i, audioAttributes, i2, null);
            Intrinsics.checkNotNullParameter(audioAttributes, "audioAttributes");
        }
    }
}
