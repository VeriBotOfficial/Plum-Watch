package io.livekit.android.room.track;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.iflytek.cloud.SpeechConstant;
import com.tencent.open.SocialConstants;
import com.wakeup.common.burypoint.BuryPointPageId;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.RtpReceiver;

/* compiled from: RemoteAudioTrack.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B-\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/track/RemoteAudioTrack;", "Lio/livekit/android/room/track/AudioTrack;", "name", "", "rtcTrack", "Llivekit/org/webrtc/AudioTrack;", SocialConstants.PARAM_RECEIVER, "Llivekit/org/webrtc/RtpReceiver;", "rtcThreadToken", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "(Ljava/lang/String;Llivekit/org/webrtc/AudioTrack;Llivekit/org/webrtc/RtpReceiver;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "getReceiver$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpReceiver;", "addSink", "", "sink", "Llivekit/org/webrtc/AudioTrackSink;", "removeSink", NativeAdvancedJsUtils.h, SpeechConstant.VOLUME, "", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoteAudioTrack extends AudioTrack {
    private final RtpReceiver receiver;

    /* compiled from: RemoteAudioTrack.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lio/livekit/android/room/track/RemoteAudioTrack$Factory;", "", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lio/livekit/android/room/track/RemoteAudioTrack;", "name", "", "rtcTrack", "Llivekit/org/webrtc/AudioTrack;", SocialConstants.PARAM_RECEIVER, "Llivekit/org/webrtc/RtpReceiver;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        RemoteAudioTrack create(String name, livekit.org.webrtc.AudioTrack rtcTrack, RtpReceiver receiver);
    }

    /* renamed from: getReceiver$livekit_android_sdk_release, reason: from getter */
    public final RtpReceiver getReceiver() {
        return this.receiver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public RemoteAudioTrack(@Assisted String name, @Assisted livekit.org.webrtc.AudioTrack rtcTrack, @Assisted RtpReceiver receiver, RTCThreadToken rtcThreadToken) {
        super(name, rtcTrack, rtcThreadToken);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rtcTrack, "rtcTrack");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(rtcThreadToken, "rtcThreadToken");
        this.receiver = receiver;
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void addSink(final AudioTrackSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        final RemoteAudioTrack remoteAudioTrack = this;
        final Unit unit = Unit.INSTANCE;
        if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
            return;
        }
        final RTCThreadToken rtcThreadToken = remoteAudioTrack.getRtcThreadToken();
        if (rtcThreadToken.isDisposed()) {
            return;
        }
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.startsWith$default(name, RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false, 2, (Object) null)) {
            if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                return;
            }
            remoteAudioTrack.getRtcTrack();
            getRtcTrack().addSink(sink);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$addSink$$inlined$withRTCTrack$livekit_android_sdk_release$1
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Unit] */
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                if (RTCThreadToken.this.isDisposed()) {
                    return null;
                }
                if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                    return unit;
                }
                remoteAudioTrack.getRtcTrack();
                this.getRtcTrack().addSink(sink);
                return Unit.INSTANCE;
            }
        }).get();
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void removeSink(final AudioTrackSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        final RemoteAudioTrack remoteAudioTrack = this;
        final Unit unit = Unit.INSTANCE;
        if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
            return;
        }
        final RTCThreadToken rtcThreadToken = remoteAudioTrack.getRtcThreadToken();
        if (rtcThreadToken.isDisposed()) {
            return;
        }
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.startsWith$default(name, RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false, 2, (Object) null)) {
            if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                return;
            }
            remoteAudioTrack.getRtcTrack();
            getRtcTrack().removeSink(sink);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$removeSink$$inlined$withRTCTrack$livekit_android_sdk_release$1
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Unit] */
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                if (RTCThreadToken.this.isDisposed()) {
                    return null;
                }
                if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                    return unit;
                }
                remoteAudioTrack.getRtcTrack();
                this.getRtcTrack().removeSink(sink);
                return Unit.INSTANCE;
            }
        }).get();
    }

    public final void setVolume(final double volume) {
        final RemoteAudioTrack remoteAudioTrack = this;
        final Unit unit = Unit.INSTANCE;
        if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
            return;
        }
        final RTCThreadToken rtcThreadToken = remoteAudioTrack.getRtcThreadToken();
        if (rtcThreadToken.isDisposed()) {
            return;
        }
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.startsWith$default(name, RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false, 2, (Object) null)) {
            if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                return;
            }
            remoteAudioTrack.getRtcTrack();
            getRtcTrack().setVolume(volume);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$setVolume$$inlined$withRTCTrack$livekit_android_sdk_release$1
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Unit] */
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                if (RTCThreadToken.this.isDisposed()) {
                    return null;
                }
                if (remoteAudioTrack.isDisposed$livekit_android_sdk_release()) {
                    return unit;
                }
                remoteAudioTrack.getRtcTrack();
                this.getRtcTrack().setVolume(volume);
                return Unit.INSTANCE;
            }
        }).get();
    }
}
