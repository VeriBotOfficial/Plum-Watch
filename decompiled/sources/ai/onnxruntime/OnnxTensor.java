package ai.onnxruntime;

import ai.onnxruntime.OnnxValue;
import ai.onnxruntime.OrtUtil;
import ai.onnxruntime.TensorInfo;
import ai.onnxruntime.platform.Fp16Conversions;
import android.gov.nist.core.Separators;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Optional;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class OnnxTensor extends OnnxTensorLike {
    private static final Logger logger = Logger.getLogger(OnnxTensor.class.getName());
    private final Buffer buffer;
    private final boolean ownsBuffer;

    private native void close(long j, long j2);

    private static native long createString(long j, long j2, String str) throws OrtException;

    private static native long createStringTensor(long j, long j2, Object[] objArr, long[] jArr) throws OrtException;

    private static native long createTensorFromBuffer(long j, long j2, Buffer buffer, int i, long j3, long[] jArr, int i2) throws OrtException;

    private native boolean getBool(long j, long j2) throws OrtException;

    private native ByteBuffer getBuffer(long j, long j2);

    private native byte getByte(long j, long j2, int i) throws OrtException;

    private native double getDouble(long j, long j2) throws OrtException;

    private native float getFloat(long j, long j2, int i) throws OrtException;

    private native int getInt(long j, long j2, int i) throws OrtException;

    private native long getLong(long j, long j2, int i) throws OrtException;

    private native short getShort(long j, long j2, int i) throws OrtException;

    private native String getString(long j, long j2) throws OrtException;

    private native void getStringArray(long j, long j2, String[] strArr) throws OrtException;

    OnnxTensor(long j, long j2, TensorInfo tensorInfo) {
        this(j, j2, tensorInfo, null, false);
    }

    OnnxTensor(long j, long j2, TensorInfo tensorInfo, Buffer buffer, boolean z) {
        super(j, j2, tensorInfo);
        this.buffer = buffer;
        this.ownsBuffer = z;
    }

    public boolean ownsBuffer() {
        return this.ownsBuffer;
    }

    public Optional<Buffer> getBufferRef() {
        return Optional.ofNullable(duplicate(this.buffer));
    }

    private static Buffer duplicate(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return ((ByteBuffer) buffer).duplicate().order(ByteOrder.nativeOrder());
        }
        if (buffer instanceof ShortBuffer) {
            return ((ShortBuffer) buffer).duplicate();
        }
        if (buffer instanceof IntBuffer) {
            return ((IntBuffer) buffer).duplicate();
        }
        if (buffer instanceof LongBuffer) {
            return ((LongBuffer) buffer).duplicate();
        }
        if (buffer instanceof FloatBuffer) {
            return ((FloatBuffer) buffer).duplicate();
        }
        if (buffer instanceof DoubleBuffer) {
            return ((DoubleBuffer) buffer).duplicate();
        }
        throw new IllegalStateException("Unknown buffer type " + buffer.getClass());
    }

    /* renamed from: ai.onnxruntime.OnnxTensor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxJavaType;

        static {
            int[] iArr = new int[OnnxJavaType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxJavaType = iArr;
            try {
                iArr[OnnxJavaType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BFLOAT16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.FLOAT16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT16.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
    
        if ((r4 instanceof java.nio.ByteBuffer) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.nio.Buffer castBuffer(java.nio.Buffer r4) {
        /*
            r3 = this;
            int[] r0 = ai.onnxruntime.OnnxTensor.AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType
            ai.onnxruntime.TensorInfo r1 = r3.info
            ai.onnxruntime.OnnxJavaType r1 = r1.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L8b;
                case 2: goto L7b;
                case 3: goto L76;
                case 4: goto L76;
                case 5: goto L76;
                case 6: goto L5c;
                case 7: goto L42;
                case 8: goto L32;
                case 9: goto L22;
                case 10: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L9b
        L11:
            boolean r0 = r4 instanceof java.nio.LongBuffer
            if (r0 == 0) goto L17
            goto L8f
        L17:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.LongBuffer r4 = r4.asLongBuffer()
            return r4
        L22:
            boolean r0 = r4 instanceof java.nio.IntBuffer
            if (r0 == 0) goto L27
            goto L8f
        L27:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.IntBuffer r4 = r4.asIntBuffer()
            return r4
        L32:
            boolean r0 = r4 instanceof java.nio.ShortBuffer
            if (r0 == 0) goto L37
            goto L8f
        L37:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.ShortBuffer r4 = r4.asShortBuffer()
            return r4
        L42:
            boolean r0 = r4 instanceof java.nio.ShortBuffer
            if (r0 == 0) goto L4d
            java.nio.ShortBuffer r4 = (java.nio.ShortBuffer) r4
            java.nio.FloatBuffer r4 = ai.onnxruntime.platform.Fp16Conversions.convertFp16BufferToFloatBuffer(r4)
            return r4
        L4d:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.ShortBuffer r4 = r4.asShortBuffer()
            java.nio.FloatBuffer r4 = ai.onnxruntime.platform.Fp16Conversions.convertFp16BufferToFloatBuffer(r4)
            return r4
        L5c:
            boolean r0 = r4 instanceof java.nio.ShortBuffer
            if (r0 == 0) goto L67
            java.nio.ShortBuffer r4 = (java.nio.ShortBuffer) r4
            java.nio.FloatBuffer r4 = ai.onnxruntime.platform.Fp16Conversions.convertBf16BufferToFloatBuffer(r4)
            return r4
        L67:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.ShortBuffer r4 = r4.asShortBuffer()
            java.nio.FloatBuffer r4 = ai.onnxruntime.platform.Fp16Conversions.convertBf16BufferToFloatBuffer(r4)
            return r4
        L76:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            goto L8f
        L7b:
            boolean r0 = r4 instanceof java.nio.DoubleBuffer
            if (r0 == 0) goto L80
            goto L8f
        L80:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.DoubleBuffer r4 = r4.asDoubleBuffer()
            return r4
        L8b:
            boolean r0 = r4 instanceof java.nio.FloatBuffer
            if (r0 == 0) goto L90
        L8f:
            return r4
        L90:
            boolean r0 = r4 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L9b
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            java.nio.FloatBuffer r4 = r4.asFloatBuffer()
            return r4
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid buffer type for cast operation, found "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " expected something convertible to "
            java.lang.StringBuilder r4 = r4.append(r1)
            ai.onnxruntime.TensorInfo r1 = r3.info
            ai.onnxruntime.OnnxJavaType r1 = r1.type
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.onnxruntime.OnnxTensor.castBuffer(java.nio.Buffer):java.nio.Buffer");
    }

    @Override // ai.onnxruntime.OnnxValue
    public OnnxValue.OnnxValueType getType() {
        return OnnxValue.OnnxValueType.ONNX_TYPE_TENSOR;
    }

    @Override // ai.onnxruntime.OnnxValue
    public Object getValue() throws OrtException {
        Buffer castBuffer;
        checkClosed();
        if (this.info.isScalar()) {
            switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[this.info.type.ordinal()]) {
                case 1:
                    return Float.valueOf(getFloat(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value));
                case 2:
                    return Double.valueOf(getDouble(OnnxRuntime.ortApiHandle, this.nativeHandle));
                case 3:
                    return Boolean.valueOf(getBool(OnnxRuntime.ortApiHandle, this.nativeHandle));
                case 4:
                case 5:
                    return Byte.valueOf(getByte(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value));
                case 6:
                    return Float.valueOf(Fp16Conversions.bf16ToFloat(getShort(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value)));
                case 7:
                    return Float.valueOf(Fp16Conversions.fp16ToFloat(getShort(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value)));
                case 8:
                    return Short.valueOf(getShort(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value));
                case 9:
                    return Integer.valueOf(getInt(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value));
                case 10:
                    return Long.valueOf(getLong(OnnxRuntime.ortApiHandle, this.nativeHandle, this.info.onnxType.value));
                case 11:
                    return getString(OnnxRuntime.ortApiHandle, this.nativeHandle);
                default:
                    throw new OrtException("Extracting the value of an invalid Tensor.");
            }
        }
        Object makeCarrier = this.info.makeCarrier();
        if (this.info.getNumElements() > 0) {
            if (this.info.type == OnnxJavaType.STRING) {
                String[] strArr = (String[]) makeCarrier;
                getStringArray(OnnxRuntime.ortApiHandle, this.nativeHandle, strArr);
                if (this.info.shape.length != 1) {
                    return OrtUtil.reshape(strArr, this.info.shape);
                }
            } else {
                Buffer buffer = this.buffer;
                if (buffer == null) {
                    castBuffer = castBuffer(getBuffer());
                } else {
                    castBuffer = castBuffer(duplicate(buffer));
                }
                OrtUtil.fillArrayFromBuffer(this.info, castBuffer, 0, makeCarrier);
            }
        }
        return makeCarrier;
    }

    public String toString() {
        return "OnnxTensor(info=" + this.info.toString() + ",closed=" + this.closed + Separators.RPAREN;
    }

    @Override // ai.onnxruntime.OnnxValue, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.closed) {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        } else {
            logger.warning("Closing an already closed tensor.");
        }
    }

    public ByteBuffer getByteBuffer() {
        checkClosed();
        if (this.info.type == OnnxJavaType.STRING) {
            return null;
        }
        ByteBuffer buffer = getBuffer();
        ByteBuffer order = ByteBuffer.allocate(buffer.capacity()).order(ByteOrder.nativeOrder());
        order.put(buffer);
        order.rewind();
        return order;
    }

    public FloatBuffer getFloatBuffer() {
        checkClosed();
        if (this.info.type == OnnxJavaType.FLOAT) {
            FloatBuffer asFloatBuffer = getBuffer().asFloatBuffer();
            FloatBuffer allocate = FloatBuffer.allocate(asFloatBuffer.capacity());
            allocate.put(asFloatBuffer);
            allocate.rewind();
            return allocate;
        }
        if (this.info.type == OnnxJavaType.FLOAT16) {
            return Fp16Conversions.convertFp16BufferToFloatBuffer(getBuffer().asShortBuffer());
        }
        if (this.info.type == OnnxJavaType.BFLOAT16) {
            return Fp16Conversions.convertBf16BufferToFloatBuffer(getBuffer().asShortBuffer());
        }
        return null;
    }

    public DoubleBuffer getDoubleBuffer() {
        checkClosed();
        if (this.info.type != OnnxJavaType.DOUBLE) {
            return null;
        }
        DoubleBuffer asDoubleBuffer = getBuffer().asDoubleBuffer();
        DoubleBuffer allocate = DoubleBuffer.allocate(asDoubleBuffer.capacity());
        allocate.put(asDoubleBuffer);
        allocate.rewind();
        return allocate;
    }

    public ShortBuffer getShortBuffer() {
        checkClosed();
        if (this.info.type != OnnxJavaType.INT16 && this.info.type != OnnxJavaType.FLOAT16 && this.info.type != OnnxJavaType.BFLOAT16) {
            return null;
        }
        ShortBuffer asShortBuffer = getBuffer().asShortBuffer();
        ShortBuffer allocate = ShortBuffer.allocate(asShortBuffer.capacity());
        allocate.put(asShortBuffer);
        allocate.rewind();
        return allocate;
    }

    public IntBuffer getIntBuffer() {
        checkClosed();
        if (this.info.type != OnnxJavaType.INT32) {
            return null;
        }
        IntBuffer asIntBuffer = getBuffer().asIntBuffer();
        IntBuffer allocate = IntBuffer.allocate(asIntBuffer.capacity());
        allocate.put(asIntBuffer);
        allocate.rewind();
        return allocate;
    }

    public LongBuffer getLongBuffer() {
        checkClosed();
        if (this.info.type != OnnxJavaType.INT64) {
            return null;
        }
        LongBuffer asLongBuffer = getBuffer().asLongBuffer();
        LongBuffer allocate = LongBuffer.allocate(asLongBuffer.capacity());
        allocate.put(asLongBuffer);
        allocate.rewind();
        return allocate;
    }

    private ByteBuffer getBuffer() {
        return getBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder());
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, Object obj) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, obj);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, Object obj) throws OrtException {
        Buffer convertArrayToBuffer;
        if (!ortAllocator.isClosed()) {
            TensorInfo constructFromJavaArray = TensorInfo.constructFromJavaArray(obj);
            if (constructFromJavaArray.type == OnnxJavaType.STRING) {
                if (constructFromJavaArray.shape.length == 0) {
                    return new OnnxTensor(createString(OnnxRuntime.ortApiHandle, ortAllocator.handle, (String) obj), ortAllocator.handle, constructFromJavaArray);
                }
                return new OnnxTensor(createStringTensor(OnnxRuntime.ortApiHandle, ortAllocator.handle, OrtUtil.flattenString(obj), constructFromJavaArray.shape), ortAllocator.handle, constructFromJavaArray);
            }
            if (constructFromJavaArray.shape.length == 0) {
                convertArrayToBuffer = OrtUtil.convertBoxedPrimitiveToBuffer(constructFromJavaArray.type, obj);
                if (convertArrayToBuffer == null) {
                    throw new OrtException("Failed to convert a boxed primitive to an array, this is an error with the ORT Java API, please report this message & stack trace. JavaType = " + constructFromJavaArray.type + ", object = " + obj);
                }
            } else {
                convertArrayToBuffer = OrtUtil.convertArrayToBuffer(constructFromJavaArray, obj);
            }
            Buffer buffer = convertArrayToBuffer;
            return new OnnxTensor(createTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, buffer, 0, constructFromJavaArray.type.size * constructFromJavaArray.numElements, constructFromJavaArray.shape, constructFromJavaArray.onnxType.value), ortAllocator.handle, constructFromJavaArray, buffer, true);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor with a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, String[] strArr, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, strArr, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, String[] strArr, long[] jArr) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return new OnnxTensor(createStringTensor(OnnxRuntime.ortApiHandle, ortAllocator.handle, strArr, jArr), ortAllocator.handle, new TensorInfo(jArr, OnnxJavaType.STRING, TensorInfo.OnnxTensorType.ONNX_TENSOR_ELEMENT_DATA_TYPE_STRING));
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, FloatBuffer floatBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, floatBuffer, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, FloatBuffer floatBuffer, long[] jArr) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return createTensor(OnnxJavaType.FLOAT, ortAllocator, floatBuffer, jArr);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, DoubleBuffer doubleBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, doubleBuffer, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, DoubleBuffer doubleBuffer, long[] jArr) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return createTensor(OnnxJavaType.DOUBLE, ortAllocator, doubleBuffer, jArr);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, ByteBuffer byteBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, byteBuffer, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, ByteBuffer byteBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortAllocator, byteBuffer, jArr, OnnxJavaType.INT8);
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, ByteBuffer byteBuffer, long[] jArr, OnnxJavaType onnxJavaType) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, byteBuffer, jArr, onnxJavaType);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, ByteBuffer byteBuffer, long[] jArr, OnnxJavaType onnxJavaType) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return createTensor(onnxJavaType, ortAllocator, byteBuffer, jArr);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, ShortBuffer shortBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, shortBuffer, jArr, OnnxJavaType.INT16);
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, ShortBuffer shortBuffer, long[] jArr, OnnxJavaType onnxJavaType) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, shortBuffer, jArr, onnxJavaType);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, ShortBuffer shortBuffer, long[] jArr, OnnxJavaType onnxJavaType) throws OrtException {
        if (!ortAllocator.isClosed()) {
            if (onnxJavaType == OnnxJavaType.BFLOAT16 || onnxJavaType == OnnxJavaType.FLOAT16 || onnxJavaType == OnnxJavaType.INT16) {
                return createTensor(onnxJavaType, ortAllocator, shortBuffer, jArr);
            }
            throw new IllegalArgumentException("Only int16, float16 or bfloat16 tensors can be created from ShortBuffer.");
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, IntBuffer intBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, intBuffer, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, IntBuffer intBuffer, long[] jArr) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return createTensor(OnnxJavaType.INT32, ortAllocator, intBuffer, jArr);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    public static OnnxTensor createTensor(OrtEnvironment ortEnvironment, LongBuffer longBuffer, long[] jArr) throws OrtException {
        return createTensor(ortEnvironment, ortEnvironment.defaultAllocator, longBuffer, jArr);
    }

    static OnnxTensor createTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, LongBuffer longBuffer, long[] jArr) throws OrtException {
        if (!ortAllocator.isClosed()) {
            return createTensor(OnnxJavaType.INT64, ortAllocator, longBuffer, jArr);
        }
        throw new IllegalStateException("Trying to create an OnnxTensor on a closed OrtAllocator.");
    }

    private static OnnxTensor createTensor(OnnxJavaType onnxJavaType, OrtAllocator ortAllocator, Buffer buffer, long[] jArr) throws OrtException {
        OrtUtil.BufferTuple prepareBuffer = OrtUtil.prepareBuffer(buffer, onnxJavaType);
        TensorInfo constructFromBuffer = TensorInfo.constructFromBuffer(prepareBuffer.data, jArr, onnxJavaType);
        return new OnnxTensor(createTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, prepareBuffer.data, prepareBuffer.pos, prepareBuffer.byteSize, jArr, constructFromBuffer.onnxType.value), ortAllocator.handle, constructFromBuffer, prepareBuffer.data, prepareBuffer.isCopy);
    }
}
