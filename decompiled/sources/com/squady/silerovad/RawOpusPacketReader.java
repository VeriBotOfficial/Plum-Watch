package com.squady.silerovad;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.SpeechEvent;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: RawOpusPacketReader.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squady/silerovad/RawOpusPacketReader;", "", "input", "Ljava/io/InputStream;", "packetSizeBytes", "", "(Ljava/io/InputStream;I)V", "packet", "", "<set-?>", "", "presentationTimeUs", "getPresentationTimeUs", "()J", "samplesRead", "read", SpeechEvent.KEY_EVENT_TTS_BUFFER, "Ljava/nio/ByteBuffer;", "Companion", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RawOpusPacketReader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final InputStream input;
    private final byte[] packet;
    private long presentationTimeUs;
    private long samplesRead;

    public RawOpusPacketReader(InputStream input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.input = input;
        if (1 > i || i >= 65537) {
            throw new IllegalArgumentException("packetSizeBytes must be in 1..65536".toString());
        }
        this.packet = new byte[i];
    }

    public final long getPresentationTimeUs() {
        return this.presentationTimeUs;
    }

    public final int read(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = 0;
        while (true) {
            byte[] bArr = this.packet;
            if (i < bArr.length) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException("Opus check interrupted");
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.packet;
                int read = inputStream.read(bArr2, i, bArr2.length - i);
                if (read < 0) {
                    if (i == 0) {
                        return -1;
                    }
                    throw new EOFException("Incomplete raw Opus packet: " + i + " of " + this.packet.length + " bytes");
                }
                if (read == 0) {
                    int read2 = this.input.read();
                    if (read2 < 0) {
                        if (i == 0) {
                            return -1;
                        }
                        throw new EOFException("Incomplete raw Opus packet: " + i + " of " + this.packet.length + " bytes");
                    }
                    this.packet[i] = (byte) read2;
                    i++;
                } else {
                    i += read;
                }
            } else {
                if (bArr.length >= 4 && bArr[0] == 79 && bArr[1] == 103 && bArr[2] == 103 && bArr[3] == 83) {
                    throw new IllegalArgumentException("Ogg container supplied to raw Opus API; use checkOpusFile".toString());
                }
                int durationSamples$silero_vad_release = INSTANCE.durationSamples$silero_vad_release(bArr);
                int remaining = buffer.remaining();
                byte[] bArr3 = this.packet;
                if (remaining < bArr3.length) {
                    throw new IllegalArgumentException("Opus packet exceeds decoder input capacity".toString());
                }
                buffer.put(bArr3);
                long j = this.samplesRead;
                this.presentationTimeUs = (1000000 * j) / OpusUtil.SAMPLE_RATE;
                this.samplesRead = j + durationSamples$silero_vad_release;
                return this.packet.length;
            }
        }
    }

    /* compiled from: RawOpusPacketReader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/squady/silerovad/RawOpusPacketReader$Companion;", "", "()V", "durationSamples", "", "packet", "", "durationSamples$silero_vad_release", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int durationSamples$silero_vad_release(byte[] packet) {
            int i;
            int durationSamples$byte;
            Intrinsics.checkNotNullParameter(packet, "packet");
            int i2 = 1;
            if (packet.length == 0) {
                throw new IllegalArgumentException("Empty Opus packet".toString());
            }
            byte b = packet[0];
            int i3 = b & 255;
            if ((b & 128) != 0) {
                i = (OpusUtil.SAMPLE_RATE << ((i3 >> 3) & 3)) / 400;
            } else if ((b & BuiltinOptions.NonMaxSuppressionV5Options) == 96) {
                i = (b & 8) != 0 ? 960 : 480;
            } else {
                int i4 = (i3 >> 3) & 3;
                i = i4 == 3 ? 2880 : (OpusUtil.SAMPLE_RATE << i4) / 100;
            }
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 1;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = packet.length;
            int i5 = b & 3;
            if (i5 != 0) {
                if (i5 == 1) {
                    if ((intRef2.element - intRef.element) % 2 != 0) {
                        throw new IllegalArgumentException("Invalid two-frame CBR Opus packet".toString());
                    }
                    durationSamples$validSize((intRef2.element - intRef.element) / 2);
                } else if (i5 == 2) {
                    int durationSamples$frameSize = durationSamples$frameSize(intRef, intRef2, packet);
                    durationSamples$validSize(durationSamples$frameSize);
                    durationSamples$validSize((intRef2.element - intRef.element) - durationSamples$frameSize);
                } else {
                    int durationSamples$byte2 = durationSamples$byte(intRef, intRef2, packet);
                    i2 = durationSamples$byte2 & 63;
                    if (i2 <= 0 || i2 * i > 5760) {
                        throw new IllegalArgumentException("Invalid Opus packet duration".toString());
                    }
                    if ((durationSamples$byte2 & 64) != 0) {
                        do {
                            durationSamples$byte = durationSamples$byte(intRef, intRef2, packet);
                            intRef2.element -= durationSamples$byte == 255 ? 254 : durationSamples$byte;
                            if (intRef2.element < intRef.element) {
                                throw new IllegalArgumentException("Invalid Opus padding".toString());
                            }
                        } while (durationSamples$byte == 255);
                    }
                    if ((durationSamples$byte2 & 128) != 0) {
                        int i6 = i2 - 1;
                        int i7 = 0;
                        for (int i8 = 0; i8 < i6; i8++) {
                            int durationSamples$frameSize2 = durationSamples$frameSize(intRef, intRef2, packet);
                            durationSamples$validSize(durationSamples$frameSize2);
                            i7 += durationSamples$frameSize2;
                        }
                        durationSamples$validSize((intRef2.element - intRef.element) - i7);
                    } else {
                        if ((intRef2.element - intRef.element) % i2 != 0) {
                            throw new IllegalArgumentException("Invalid multi-frame CBR Opus packet".toString());
                        }
                        durationSamples$validSize((intRef2.element - intRef.element) / i2);
                    }
                }
                i2 = 2;
            } else {
                durationSamples$validSize(intRef2.element - intRef.element);
            }
            int i9 = i2 * i;
            if (i9 <= 5760) {
                return i9;
            }
            throw new IllegalArgumentException("Opus packet exceeds 120 ms".toString());
        }

        private static final int durationSamples$byte(Ref.IntRef intRef, Ref.IntRef intRef2, byte[] bArr) {
            if (intRef.element >= intRef2.element) {
                throw new IllegalArgumentException("Truncated Opus packet header".toString());
            }
            int i = intRef.element;
            intRef.element = i + 1;
            return bArr[i] & 255;
        }

        private static final int durationSamples$frameSize(Ref.IntRef intRef, Ref.IntRef intRef2, byte[] bArr) {
            int durationSamples$byte = durationSamples$byte(intRef, intRef2, bArr);
            return durationSamples$byte < 252 ? durationSamples$byte : durationSamples$byte + (durationSamples$byte(intRef, intRef2, bArr) * 4);
        }

        private static final void durationSamples$validSize(int i) {
            if (i < 0 || i >= 1276) {
                throw new IllegalArgumentException("Invalid Opus frame size".toString());
            }
        }
    }
}
