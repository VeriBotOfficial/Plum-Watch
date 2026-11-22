package com.squady.silerovad;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Looper;
import com.iflytek.cloud.util.AudioDetector;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: SileroVad.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\fJ0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u001e\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0004\u0012\u00020\u00140\u0012H\u0002J$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0012H\u0002J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00132\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J&\u0010'\u001a\u00020(2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010'\u001a\u00020(2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\bH\u0007J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\b\u0010-\u001a\u00020\nH\u0002J\u0011\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u001dH\u0082 J\u0011\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0014H\u0082 J\u0011\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u001dH\u0082 J\u0011\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0013H\u0082 J\u0019\u00105\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0013H\u0082 J\u0010\u00107\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/squady/silerovad/SileroVad;", "", "()V", "FRAME_BYTES", "", "appContext", "Landroid/content/Context;", "ready", "", "bind", "", "context", "bind$silero_vad_release", "checkAudio", "Lcom/squady/silerovad/OpusVadResult;", AudioDetector.THRESHOLD, "", "decode", "Lkotlin/Function1;", "", "", "checkOpus", "setSource", "Landroid/media/MediaExtractor;", "checkOpusFile", "uri", "Landroid/net/Uri;", "speechThreshold", "filePath", "", "checkRawOpus", "opusData", "packetSizeBytes", "channelCount", "checkRawOpusFile", "checkRawOpusInput", "openInput", "Lkotlin/Function0;", "Ljava/io/InputStream;", "createOpusStream", "Lcom/squady/silerovad/OpusVadStream;", "includePcm", "createPcmProcessor", "Lcom/squady/silerovad/PcmVadProcessor;", "createPcmProcessor$silero_vad_release", "ensureReady", "nativeCreateSession", "modelPath", "nativeDestroySession", "session", "nativeInit", "nativeProcessFrame", "pcm16LeMono16k", "nativeProcessSession", "pcm", "processFrame", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SileroVad {
    public static final int FRAME_BYTES = 1024;
    public static final SileroVad INSTANCE = new SileroVad();
    private static volatile Context appContext;
    private static volatile boolean ready;

    @JvmStatic
    public static final OpusVadResult checkOpusFile(Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return checkOpusFile$default(uri, 0.0f, 2, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkOpusFile(String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return checkOpusFile$default(filePath, 0.0f, 2, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpus(byte[] opusData) throws IOException {
        Intrinsics.checkNotNullParameter(opusData, "opusData");
        return checkRawOpus$default(opusData, 0, 0, 0.0f, 14, null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpus(byte[] opusData, int i) throws IOException {
        Intrinsics.checkNotNullParameter(opusData, "opusData");
        return checkRawOpus$default(opusData, i, 0, 0.0f, 12, null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpus(byte[] opusData, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(opusData, "opusData");
        return checkRawOpus$default(opusData, i, i2, 0.0f, 8, null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return checkRawOpusFile$default(uri, 0, 0, 0.0f, 14, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(Uri uri, int i) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return checkRawOpusFile$default(uri, i, 0, 0.0f, 12, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(Uri uri, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return checkRawOpusFile$default(uri, i, i2, 0.0f, 8, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return checkRawOpusFile$default(filePath, 0, 0, 0.0f, 14, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(String filePath, int i) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return checkRawOpusFile$default(filePath, i, 0, 0.0f, 12, (Object) null);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(String filePath, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return checkRawOpusFile$default(filePath, i, i2, 0.0f, 8, (Object) null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream() throws IOException {
        return createOpusStream$default(0, 0, 0.0f, 7, null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int i) throws IOException {
        return createOpusStream$default(i, 0, 0.0f, 6, null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int i, int i2) throws IOException {
        return createOpusStream$default(i, i2, 0.0f, 4, null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int i, int i2, boolean z) throws IOException {
        return createOpusStream$default(i, i2, 0.0f, z, 4, null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int i, boolean z) throws IOException {
        return createOpusStream$default(i, 0, 0.0f, z, 6, null);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(boolean z) throws IOException {
        return createOpusStream$default(0, 0, 0.0f, z, 7, null);
    }

    private final native long nativeCreateSession(String modelPath);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeDestroySession(long session);

    private final native int nativeInit(String modelPath);

    private final native float nativeProcessFrame(byte[] pcm16LeMono16k);

    /* JADX INFO: Access modifiers changed from: private */
    public final native float nativeProcessSession(long session, byte[] pcm);

    private SileroVad() {
    }

    @JvmStatic
    public static final void bind$silero_vad_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        appContext = context.getApplicationContext();
    }

    @JvmStatic
    public static final float processFrame(byte[] pcm16LeMono16k) {
        Intrinsics.checkNotNullParameter(pcm16LeMono16k, "pcm16LeMono16k");
        if (pcm16LeMono16k.length != 1024) {
            throw new IllegalArgumentException("frame must be 1024 bytes".toString());
        }
        SileroVad sileroVad = INSTANCE;
        sileroVad.ensureReady();
        float nativeProcessFrame = sileroVad.nativeProcessFrame(pcm16LeMono16k);
        if (nativeProcessFrame >= 0.0f) {
            return nativeProcessFrame;
        }
        throw new IllegalStateException(("silero_vad_process_frame failed: " + nativeProcessFrame).toString());
    }

    public static /* synthetic */ OpusVadStream createOpusStream$default(int i, int i2, float f, int i3, Object obj) throws IOException {
        if ((i3 & 1) != 0) {
            i = 80;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            f = 0.6f;
        }
        return createOpusStream(i, i2, f);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int packetSizeBytes, int channelCount, float speechThreshold) throws IOException {
        return createOpusStream(packetSizeBytes, channelCount, speechThreshold, false);
    }

    public static /* synthetic */ OpusVadStream createOpusStream$default(int i, int i2, float f, boolean z, int i3, Object obj) throws IOException {
        if ((i3 & 1) != 0) {
            i = 80;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            f = 0.6f;
        }
        return createOpusStream(i, i2, f, z);
    }

    @JvmStatic
    public static final OpusVadStream createOpusStream(int packetSizeBytes, int channelCount, float speechThreshold, boolean includePcm) throws IOException {
        if (1 > packetSizeBytes || packetSizeBytes >= 65537) {
            throw new IllegalArgumentException("packetSizeBytes must be in 1..65536".toString());
        }
        if (1 > channelCount || channelCount >= 3) {
            throw new IllegalArgumentException("channelCount must be 1 or 2".toString());
        }
        if (Float.isInfinite(speechThreshold) || Float.isNaN(speechThreshold) || 0.0f > speechThreshold || speechThreshold > 1.0f) {
            throw new IllegalArgumentException("speechThreshold must be in 0..1".toString());
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("createOpusStream must run on a worker thread".toString());
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Opus stream interrupted");
        }
        SileroVad sileroVad = INSTANCE;
        sileroVad.ensureReady();
        Context context = appContext;
        if (context == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String absolutePath = new File(context.getNoBackupFilesDir(), "silero_vad.onnx").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        final long nativeCreateSession = sileroVad.nativeCreateSession(absolutePath);
        if (nativeCreateSession == 0) {
            throw new IllegalStateException("silero_vad_create failed".toString());
        }
        try {
            return new OpusVadStream(packetSizeBytes, channelCount, speechThreshold, new Function1<byte[], Float>() { // from class: com.squady.silerovad.SileroVad$createOpusStream$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Float invoke(byte[] it) {
                    float nativeProcessSession;
                    Intrinsics.checkNotNullParameter(it, "it");
                    nativeProcessSession = SileroVad.INSTANCE.nativeProcessSession(nativeCreateSession, it);
                    return Float.valueOf(nativeProcessSession);
                }
            }, new Function0<Unit>() { // from class: com.squady.silerovad.SileroVad$createOpusStream$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SileroVad.INSTANCE.nativeDestroySession(nativeCreateSession);
                }
            }, includePcm);
        } catch (Throwable th) {
            INSTANCE.nativeDestroySession(nativeCreateSession);
            throw th;
        }
    }

    public static /* synthetic */ OpusVadResult checkOpusFile$default(String str, float f, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            f = 0.6f;
        }
        return checkOpusFile(str, f);
    }

    @JvmStatic
    public static final OpusVadResult checkOpusFile(final String filePath, float speechThreshold) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String str = filePath;
        if (StringsKt.isBlank(str) || StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Expected a local file path".toString());
        }
        return INSTANCE.checkOpus(speechThreshold, new Function1<MediaExtractor, Unit>() { // from class: com.squady.silerovad.SileroVad$checkOpusFile$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MediaExtractor mediaExtractor) {
                invoke2(mediaExtractor);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(MediaExtractor extractor) {
                Intrinsics.checkNotNullParameter(extractor, "extractor");
                FileInputStream fileInputStream = new FileInputStream(filePath);
                try {
                    extractor.setDataSource(fileInputStream.getFD());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            }
        });
    }

    public static /* synthetic */ OpusVadResult checkOpusFile$default(Uri uri, float f, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            f = 0.6f;
        }
        return checkOpusFile(uri, f);
    }

    @JvmStatic
    public static final OpusVadResult checkOpusFile(final Uri uri, float speechThreshold) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getScheme(), "content") || Intrinsics.areEqual(uri.getScheme(), "file")) {
            return INSTANCE.checkOpus(speechThreshold, new Function1<MediaExtractor, Unit>() { // from class: com.squady.silerovad.SileroVad$checkOpusFile$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaExtractor mediaExtractor) {
                    invoke2(mediaExtractor);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MediaExtractor extractor) {
                    Context context;
                    Intrinsics.checkNotNullParameter(extractor, "extractor");
                    context = SileroVad.appContext;
                    if (context == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    extractor.setDataSource(context, uri, (Map<String, String>) null);
                }
            });
        }
        throw new IllegalArgumentException("Expected a local content/file URI".toString());
    }

    public static /* synthetic */ OpusVadResult checkRawOpusFile$default(String str, int i, int i2, float f, int i3, Object obj) throws IOException {
        if ((i3 & 2) != 0) {
            i = 80;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            f = 0.6f;
        }
        return checkRawOpusFile(str, i, i2, f);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(final String filePath, int packetSizeBytes, int channelCount, float speechThreshold) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String str = filePath;
        if (StringsKt.isBlank(str) || StringsKt.contains$default((CharSequence) str, (CharSequence) "://", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Expected a local file path".toString());
        }
        return INSTANCE.checkRawOpusInput(packetSizeBytes, channelCount, speechThreshold, new Function0<InputStream>() { // from class: com.squady.silerovad.SileroVad$checkRawOpusFile$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InputStream invoke() {
                return new FileInputStream(filePath);
            }
        });
    }

    public static /* synthetic */ OpusVadResult checkRawOpusFile$default(Uri uri, int i, int i2, float f, int i3, Object obj) throws IOException {
        if ((i3 & 2) != 0) {
            i = 80;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            f = 0.6f;
        }
        return checkRawOpusFile(uri, i, i2, f);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpusFile(final Uri uri, int packetSizeBytes, int channelCount, float speechThreshold) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getScheme(), "content") || Intrinsics.areEqual(uri.getScheme(), "file")) {
            return INSTANCE.checkRawOpusInput(packetSizeBytes, channelCount, speechThreshold, new Function0<InputStream>() { // from class: com.squady.silerovad.SileroVad$checkRawOpusFile$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final InputStream invoke() {
                    Context context;
                    context = SileroVad.appContext;
                    if (context == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                        return openInputStream;
                    }
                    throw new IOException("Unable to open raw Opus URI");
                }
            });
        }
        throw new IllegalArgumentException("Expected a local content/file URI".toString());
    }

    public static /* synthetic */ OpusVadResult checkRawOpus$default(byte[] bArr, int i, int i2, float f, int i3, Object obj) throws IOException {
        if ((i3 & 2) != 0) {
            i = 80;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            f = 0.6f;
        }
        return checkRawOpus(bArr, i, i2, f);
    }

    @JvmStatic
    public static final OpusVadResult checkRawOpus(final byte[] opusData, int packetSizeBytes, int channelCount, float speechThreshold) throws IOException {
        Intrinsics.checkNotNullParameter(opusData, "opusData");
        return INSTANCE.checkRawOpusInput(packetSizeBytes, channelCount, speechThreshold, new Function0<InputStream>() { // from class: com.squady.silerovad.SileroVad$checkRawOpus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InputStream invoke() {
                return new ByteArrayInputStream(opusData);
            }
        });
    }

    private final OpusVadResult checkRawOpusInput(final int packetSizeBytes, final int channelCount, float threshold, final Function0<? extends InputStream> openInput) {
        if (1 > packetSizeBytes || packetSizeBytes >= 65537) {
            throw new IllegalArgumentException("packetSizeBytes must be in 1..65536".toString());
        }
        if (1 > channelCount || channelCount >= 3) {
            throw new IllegalArgumentException("channelCount must be 1 or 2".toString());
        }
        return checkAudio(threshold, new Function1<Function1<? super byte[], ? extends Unit>, Long>() { // from class: com.squady.silerovad.SileroVad$checkRawOpusInput$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Function1<? super byte[], ? extends Unit> function1) {
                return invoke2((Function1<? super byte[], Unit>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Long invoke2(Function1<? super byte[], Unit> onFrame) {
                Intrinsics.checkNotNullParameter(onFrame, "onFrame");
                InputStream invoke = openInput.invoke();
                int i = packetSizeBytes;
                int i2 = channelCount;
                try {
                    Long valueOf = Long.valueOf(OpusFileDecoder.INSTANCE.decodeRaw(invoke, i, i2, onFrame));
                    CloseableKt.closeFinally(invoke, null);
                    return valueOf;
                } finally {
                }
            }
        });
    }

    private final OpusVadResult checkOpus(float threshold, final Function1<? super MediaExtractor, Unit> setSource) {
        return checkAudio(threshold, new Function1<Function1<? super byte[], ? extends Unit>, Long>() { // from class: com.squady.silerovad.SileroVad$checkOpus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Long invoke2(Function1<? super byte[], Unit> onFrame) {
                Intrinsics.checkNotNullParameter(onFrame, "onFrame");
                return Long.valueOf(OpusFileDecoder.INSTANCE.decode(setSource, onFrame));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Function1<? super byte[], ? extends Unit> function1) {
                return invoke2((Function1<? super byte[], Unit>) function1);
            }
        });
    }

    private final OpusVadResult checkAudio(final float threshold, Function1<? super Function1<? super byte[], Unit>, Long> decode) {
        if (Float.isInfinite(threshold) || Float.isNaN(threshold) || 0.0f > threshold || threshold > 1.0f) {
            throw new IllegalArgumentException("speechThreshold must be in 0..1".toString());
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Opus checks must run on a worker thread".toString());
        }
        ensureReady();
        Context context = appContext;
        if (context == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String absolutePath = new File(context.getNoBackupFilesDir(), "silero_vad.onnx").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        final long nativeCreateSession = nativeCreateSession(absolutePath);
        if (nativeCreateSession == 0) {
            throw new IllegalStateException("silero_vad_create failed".toString());
        }
        try {
            final Ref.LongRef longRef = new Ref.LongRef();
            final Ref.LongRef longRef2 = new Ref.LongRef();
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            return new OpusVadResult(longRef2.element > 0, floatRef.element, longRef.element, longRef2.element, (decode.invoke(new Function1<byte[], Unit>() { // from class: com.squady.silerovad.SileroVad$checkAudio$samples$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
                    invoke2(bArr);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(byte[] frame) {
                    float nativeProcessSession;
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    nativeProcessSession = SileroVad.INSTANCE.nativeProcessSession(nativeCreateSession, frame);
                    if (Float.isInfinite(nativeProcessSession) || Float.isNaN(nativeProcessSession) || 0.0f > nativeProcessSession || nativeProcessSession > 1.0f) {
                        throw new IllegalStateException(("silero_vad_process failed: " + nativeProcessSession).toString());
                    }
                    longRef.element++;
                    if (nativeProcessSession >= threshold) {
                        longRef2.element++;
                    }
                    Ref.FloatRef floatRef2 = floatRef;
                    floatRef2.element = Math.max(floatRef2.element, nativeProcessSession);
                }
            }).longValue() * 1000) / 16000);
        } finally {
            nativeDestroySession(nativeCreateSession);
        }
    }

    public final PcmVadProcessor createPcmProcessor$silero_vad_release() {
        ensureReady();
        Context context = appContext;
        if (context == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String absolutePath = new File(context.getNoBackupFilesDir(), "silero_vad.onnx").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        final long nativeCreateSession = nativeCreateSession(absolutePath);
        if (nativeCreateSession == 0) {
            throw new IllegalStateException("silero_vad_create failed".toString());
        }
        try {
            return new PcmVadProcessor(new Function1<byte[], Float>() { // from class: com.squady.silerovad.SileroVad$createPcmProcessor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Float invoke(byte[] it) {
                    float nativeProcessSession;
                    Intrinsics.checkNotNullParameter(it, "it");
                    nativeProcessSession = SileroVad.INSTANCE.nativeProcessSession(nativeCreateSession, it);
                    return Float.valueOf(nativeProcessSession);
                }
            }, new Function0<Unit>() { // from class: com.squady.silerovad.SileroVad$createPcmProcessor$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SileroVad.INSTANCE.nativeDestroySession(nativeCreateSession);
                }
            });
        } catch (Throwable th) {
            nativeDestroySession(nativeCreateSession);
            throw th;
        }
    }

    private final void ensureReady() {
        Context context = appContext;
        if (context == null) {
            throw new IllegalStateException("SileroVad not initialized; merge library manifest".toString());
        }
        if (ready) {
            return;
        }
        synchronized (this) {
            if (ready) {
                return;
            }
            File file = new File(context.getNoBackupFilesDir(), "silero_vad.onnx");
            if (!file.exists()) {
                FileOutputStream open = context.getAssets().open("models/silero_vad.onnx");
                try {
                    InputStream inputStream = open;
                    open = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNull(inputStream);
                        ByteStreamsKt.copyTo$default(inputStream, open, 0, 2, null);
                        CloseableKt.closeFinally(open, null);
                        CloseableKt.closeFinally(open, null);
                    } finally {
                    }
                } finally {
                }
            }
            SileroVad sileroVad = INSTANCE;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            if (sileroVad.nativeInit(absolutePath) != 0) {
                throw new IllegalStateException("silero_vad_init failed".toString());
            }
            ready = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    static {
        System.loadLibrary("silero_vad");
    }
}
