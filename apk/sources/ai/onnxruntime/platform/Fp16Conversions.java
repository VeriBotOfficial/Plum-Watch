package ai.onnxruntime.platform;

import androidx.compose.ui.layout.LayoutKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.logging.Logger;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class Fp16Conversions {
    private static final Logger logger = Logger.getLogger(Fp16Conversions.class.getName());

    private Fp16Conversions() {
    }

    public static ShortBuffer convertFloatBufferToFp16Buffer(FloatBuffer floatBuffer) {
        int r0 = floatBuffer.position();
        int r1 = floatBuffer.remaining();
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(r1 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int r3 = 0; r3 < r1; r3++) {
            shortBufferAsShortBuffer.put(r3, floatToFp16(floatBuffer.get(r3 + r0)));
        }
        return shortBufferAsShortBuffer;
    }

    public static FloatBuffer convertFp16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int r0 = shortBuffer.position();
        int r1 = shortBuffer.remaining();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(r1 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int r3 = 0; r3 < r1; r3++) {
            floatBufferAsFloatBuffer.put(r3, fp16ToFloat(shortBuffer.get(r3 + r0)));
        }
        return floatBufferAsFloatBuffer;
    }

    public static ShortBuffer convertFloatBufferToBf16Buffer(FloatBuffer floatBuffer) {
        int r0 = floatBuffer.position();
        int r1 = floatBuffer.remaining();
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(r1 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (int r3 = 0; r3 < r1; r3++) {
            shortBufferAsShortBuffer.put(r3, floatToBf16(floatBuffer.get(r3 + r0)));
        }
        return shortBufferAsShortBuffer;
    }

    public static FloatBuffer convertBf16BufferToFloatBuffer(ShortBuffer shortBuffer) {
        int r0 = shortBuffer.position();
        int r1 = shortBuffer.remaining();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(r1 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int r3 = 0; r3 < r1; r3++) {
            floatBufferAsFloatBuffer.put(r3, bf16ToFloat(shortBuffer.get(r3 + r0)));
        }
        return floatBufferAsFloatBuffer;
    }

    public static float fp16ToFloat(short s) {
        return mlasFp16ToFloat(s);
    }

    public static short floatToFp16(float f) {
        return mlasFloatToFp16(f);
    }

    public static float mlasFp16ToFloat(short s) {
        int r0 = (s & ShortCompanionObject.MAX_VALUE) << 13;
        int r2 = r0 & 260046848;
        int r3 = 939524096 + r0;
        if (r2 == 260046848) {
            r3 = r0 + 1879048192;
        } else if (r2 == 0) {
            r3 = Float.floatToIntBits(Float.intBitsToFloat(r0 + 947912704) - Float.intBitsToFloat(947912704));
        }
        return Float.intBitsToFloat(((s & ShortCompanionObject.MIN_VALUE) << 16) | r3);
    }

    public static short mlasFloatToFp16(float f) {
        int r3;
        short s;
        int r4 = Float.floatToIntBits(f);
        int r0 = Float.floatToIntBits(Float.POSITIVE_INFINITY);
        int r1 = Integer.MIN_VALUE & r4;
        int r5 = r4 ^ r1;
        if (r5 >= 1199570944) {
            s = r5 > r0 ? (short) 32256 : (short) 31744;
        } else {
            if (r5 < 947912704) {
                r3 = Float.floatToIntBits(Float.intBitsToFloat(r5) + Float.intBitsToFloat(1056964608)) - 1056964608;
            } else {
                r3 = ((r5 - 939520001) + ((r5 >> 13) & 1)) >> 13;
            }
            s = (short) r3;
        }
        return (short) (s | ((short) (r1 >> 16)));
    }

    public static float bf16ToFloat(short s) {
        return Float.intBitsToFloat(s << 16);
    }

    public static short floatToBf16(float f) {
        int r1 = Float.floatToIntBits(f);
        return (short) ((r1 + (((r1 >> 16) & 1) + LayoutKt.LargeDimension)) >> 16);
    }
}
