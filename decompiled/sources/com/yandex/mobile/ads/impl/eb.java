package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.yandex.mobile.ads.impl.xc2;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eb {
    public static xc2 c(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new xc2(a(throwable), throwable);
    }

    private static xc2.a a(Throwable th) {
        if (th instanceof ExoPlaybackException) {
            xc2.a b = b(th);
            if (b != null) {
                return b;
            }
            Throwable cause = th.getCause();
            xc2.a a2 = cause != null ? a(cause) : null;
            return a2 == null ? xc2.a.D : a2;
        }
        if (th instanceof ExoTimeoutException) {
            return xc2.a.i;
        }
        if (th instanceof IllegalSeekPositionException) {
            return xc2.a.j;
        }
        if (th instanceof MediaCodecUtil.DecoderQueryException) {
            return xc2.a.k;
        }
        if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
            return xc2.a.l;
        }
        if (th instanceof MediaCodecVideoDecoderException) {
            xc2.a b2 = b(th);
            return b2 == null ? xc2.a.m : b2;
        }
        if (th instanceof BehindLiveWindowException) {
            return xc2.a.n;
        }
        if (th instanceof MediaCodec.CryptoException) {
            return xc2.a.o;
        }
        if (th instanceof DrmSession.DrmSessionException) {
            Throwable cause2 = ((DrmSession.DrmSessionException) th).getCause();
            return cause2 == null ? xc2.a.f17327q : ((cause2 instanceof MediaDrmResetException) || (cause2 instanceof ResourceBusyException)) ? xc2.a.p : ((cause2 instanceof MediaCodec.CryptoException) || (cause2 instanceof KeysExpiredException)) ? xc2.a.o : xc2.a.f17327q;
        }
        if (th instanceof HttpDataSource.CleartextNotPermittedException) {
            return xc2.a.r;
        }
        if (!(th instanceof HttpDataSource.InvalidResponseCodeException)) {
            return th instanceof HttpDataSource.HttpDataSourceException ? ((HttpDataSource.HttpDataSourceException) th).getCause() instanceof SSLHandshakeException ? xc2.a.w : xc2.a.x : th instanceof ParserException ? xc2.a.y : th instanceof Loader.UnexpectedLoaderException ? xc2.a.z : ((th instanceof AudioSink.ConfigurationException) || (th instanceof AudioSink.InitializationException) || (th instanceof DefaultAudioSink.InvalidAudioTrackTimestampException)) ? xc2.a.A : th instanceof SubtitleDecoderException ? xc2.a.B : ((th instanceof Cache.CacheException) || (th instanceof CacheDataSink.CacheDataSinkException)) ? xc2.a.C : xc2.a.D;
        }
        int i = ((HttpDataSource.InvalidResponseCodeException) th).responseCode;
        return i != 401 ? i != 403 ? i != 404 ? xc2.a.v : xc2.a.u : xc2.a.t : xc2.a.s;
    }

    private static xc2.a b(Throwable th) {
        boolean z;
        Throwable cause = th.getCause();
        if (cause != null && (((z = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && Intrinsics.areEqual(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (Intrinsics.areEqual(methodName, "native_dequeueOutputBuffer")) {
                    return xc2.a.b;
                }
                if (Intrinsics.areEqual(methodName, "native_dequeueInputBuffer")) {
                    return xc2.a.c;
                }
                if (Intrinsics.areEqual(methodName, "native_stop")) {
                    return xc2.a.d;
                }
                if (Intrinsics.areEqual(methodName, "native_setSurface")) {
                    return xc2.a.e;
                }
                if (Intrinsics.areEqual(methodName, "releaseOutputBuffer")) {
                    return xc2.a.f;
                }
                if (Intrinsics.areEqual(methodName, "native_queueSecureInputBuffer")) {
                    return xc2.a.g;
                }
                if (z) {
                    return xc2.a.h;
                }
            }
        }
        return null;
    }
}
