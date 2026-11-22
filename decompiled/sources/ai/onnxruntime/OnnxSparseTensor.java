package ai.onnxruntime;

import ai.onnxruntime.OnnxValue;
import ai.onnxruntime.OrtUtil;
import ai.onnxruntime.platform.Fp16Conversions;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class OnnxSparseTensor extends OnnxTensorLike {
    private static final Logger logger = Logger.getLogger(OnnxSparseTensor.class.getName());
    private final Buffer indices;
    private final LongBuffer innerIndices;
    private final SparseTensorType sparseTensorType;
    private final Buffer values;

    private native void close(long j, long j2);

    private static native long createCSRCSparseTensorFromBuffer(long j, long j2, Buffer buffer, int i, long j3, Buffer buffer2, int i2, long j4, Buffer buffer3, int i3, long[] jArr, long[] jArr2, int i4) throws OrtException;

    private static native long createSparseTensorFromBuffer(long j, long j2, Buffer buffer, int i, long j3, Buffer buffer2, int i2, long[] jArr, long[] jArr2, long[] jArr3, int i3, int i4) throws OrtException;

    private native ByteBuffer getIndicesBuffer(long j, long j2);

    private native long[] getIndicesShape(long j, long j2);

    private native ByteBuffer getInnerIndicesBuffer(long j, long j2);

    private native long[] getInnerIndicesShape(long j, long j2);

    private native ByteBuffer getValuesBuffer(long j, long j2);

    private native long[] getValuesShape(long j, long j2);

    OnnxSparseTensor(long j, long j2, int i, TensorInfo tensorInfo) {
        this(j, j2, SparseTensorType.mapFromInt(i), tensorInfo, null, null, null);
    }

    OnnxSparseTensor(long j, long j2, SparseTensorType sparseTensorType, TensorInfo tensorInfo, Buffer buffer, Buffer buffer2) {
        this(j, j2, sparseTensorType, tensorInfo, buffer, null, buffer2);
    }

    OnnxSparseTensor(long j, long j2, SparseTensorType sparseTensorType, TensorInfo tensorInfo, Buffer buffer, LongBuffer longBuffer, Buffer buffer2) {
        super(j, j2, tensorInfo);
        this.sparseTensorType = sparseTensorType;
        this.indices = buffer;
        this.innerIndices = longBuffer;
        this.values = buffer2;
    }

    public static <T extends Buffer> OnnxSparseTensor createSparseTensor(OrtEnvironment ortEnvironment, SparseTensor<T> sparseTensor) throws OrtException {
        return createSparseTensor(ortEnvironment, ortEnvironment.defaultAllocator, sparseTensor);
    }

    static <T extends Buffer> OnnxSparseTensor createSparseTensor(OrtEnvironment ortEnvironment, OrtAllocator ortAllocator, SparseTensor<T> sparseTensor) throws OrtException {
        if (!ortAllocator.isClosed()) {
            TensorInfo constructFromSparseTensor = TensorInfo.constructFromSparseTensor(sparseTensor);
            OnnxJavaType indicesType = sparseTensor.getIndicesType();
            OrtUtil.BufferTuple prepareBuffer = OrtUtil.prepareBuffer(sparseTensor.getIndices(), indicesType);
            OrtUtil.BufferTuple prepareBuffer2 = OrtUtil.prepareBuffer(sparseTensor.getValues(), constructFromSparseTensor.type);
            if (!(prepareBuffer.data instanceof LongBuffer) && !(prepareBuffer.data instanceof IntBuffer)) {
                throw new IllegalStateException("Unexpected type of indices buffer, found " + prepareBuffer.data.getClass() + ", expected IntBuffer or LongBuffer");
            }
            int i = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[sparseTensor.getSparsityType().ordinal()];
            if (i == 1 || i == 2) {
                return new OnnxSparseTensor(createSparseTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, prepareBuffer.data, prepareBuffer.pos, prepareBuffer.size, prepareBuffer2.data, prepareBuffer2.pos, constructFromSparseTensor.shape, sparseTensor.getIndicesShape(), sparseTensor.getValuesShape(), constructFromSparseTensor.onnxType.value, sparseTensor.getSparsityType().value), ortAllocator.handle, sparseTensor.getSparsityType(), constructFromSparseTensor, prepareBuffer.data, prepareBuffer2.data);
            }
            if (i == 3) {
                OrtUtil.BufferTuple prepareBuffer3 = OrtUtil.prepareBuffer(((CSRCTensor) sparseTensor).getInnerIndices(), indicesType);
                return new OnnxSparseTensor(createCSRCSparseTensorFromBuffer(OnnxRuntime.ortApiHandle, ortAllocator.handle, prepareBuffer.data, prepareBuffer.pos, prepareBuffer.size, prepareBuffer3.data, prepareBuffer3.pos, prepareBuffer3.size, prepareBuffer2.data, prepareBuffer2.pos, constructFromSparseTensor.shape, sparseTensor.getValuesShape(), constructFromSparseTensor.onnxType.value), ortAllocator.handle, sparseTensor.getSparsityType(), constructFromSparseTensor, prepareBuffer.data, (LongBuffer) prepareBuffer3.data, prepareBuffer2.data);
            }
            throw new IllegalArgumentException("Cannot create an UNDEFINED sparse tensor.");
        }
        throw new IllegalStateException("Trying to create an OnnxSparseTensor on a closed OrtAllocator.");
    }

    @Override // ai.onnxruntime.OnnxValue
    public OnnxValue.OnnxValueType getType() {
        return OnnxValue.OnnxValueType.ONNX_TYPE_SPARSETENSOR;
    }

    @Override // ai.onnxruntime.OnnxValue
    public SparseTensor<? extends Buffer> getValue() throws OrtException {
        checkClosed();
        Buffer valuesBuffer = getValuesBuffer();
        long[] indicesShape = getIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
        int i = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[this.sparseTensorType.ordinal()];
        if (i == 1) {
            return new COOTensor((LongBuffer) getIndicesBuffer(), indicesShape, valuesBuffer, this.info.shape, this.info.type, valuesBuffer.remaining());
        }
        if (i == 2) {
            return new BlockSparseTensor((IntBuffer) getIndicesBuffer(), indicesShape, valuesBuffer, getValuesShape(OnnxRuntime.ortApiHandle, this.nativeHandle), this.info.shape, this.info.type, valuesBuffer.remaining());
        }
        if (i == 3) {
            return new CSRCTensor((LongBuffer) getIndicesBuffer(), getInnerIndicesBuffer(), valuesBuffer, this.info.shape, this.info.type, valuesBuffer.remaining());
        }
        throw new IllegalStateException("Undefined sparsity type in this sparse tensor.");
    }

    @Override // ai.onnxruntime.OnnxValue, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.closed) {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        } else {
            logger.warning("Closing an already closed OnnxSparseTensor.");
        }
    }

    public SparseTensorType getSparseTensorType() {
        return this.sparseTensorType;
    }

    public Buffer getIndicesBuffer() {
        checkClosed();
        int i = AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[this.sparseTensorType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                IntBuffer asIntBuffer = getIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asIntBuffer();
                IntBuffer allocate = IntBuffer.allocate(asIntBuffer.capacity());
                allocate.put(asIntBuffer);
                allocate.rewind();
                return allocate;
            }
            if (i != 3) {
                throw new IllegalStateException("UNDEFINED sparse tensor type.");
            }
        }
        LongBuffer asLongBuffer = getIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asLongBuffer();
        LongBuffer allocate2 = LongBuffer.allocate(asLongBuffer.capacity());
        allocate2.put(asLongBuffer);
        allocate2.rewind();
        return allocate2;
    }

    public LongBuffer getInnerIndicesBuffer() {
        checkClosed();
        if (this.sparseTensorType == SparseTensorType.CSRC) {
            LongBuffer asLongBuffer = getInnerIndicesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder()).asLongBuffer();
            LongBuffer allocate = LongBuffer.allocate(asLongBuffer.capacity());
            allocate.put(asLongBuffer);
            allocate.rewind();
            return allocate;
        }
        throw new IllegalStateException("Inner indices are only available for CSRC sparse tensors, this sparse tensor is " + this.sparseTensorType);
    }

    public Buffer getValuesBuffer() {
        checkClosed();
        ByteBuffer order = getValuesBuffer(OnnxRuntime.ortApiHandle, this.nativeHandle).order(ByteOrder.nativeOrder());
        switch (AnonymousClass1.$SwitchMap$ai$onnxruntime$OnnxJavaType[this.info.type.ordinal()]) {
            case 1:
                FloatBuffer asFloatBuffer = order.asFloatBuffer();
                FloatBuffer allocate = FloatBuffer.allocate(asFloatBuffer.capacity());
                allocate.put(asFloatBuffer);
                allocate.rewind();
                return allocate;
            case 2:
                return Fp16Conversions.convertFp16BufferToFloatBuffer(order.asShortBuffer());
            case 3:
                return Fp16Conversions.convertBf16BufferToFloatBuffer(order.asShortBuffer());
            case 4:
                DoubleBuffer asDoubleBuffer = order.asDoubleBuffer();
                DoubleBuffer allocate2 = DoubleBuffer.allocate(asDoubleBuffer.capacity());
                allocate2.put(asDoubleBuffer);
                allocate2.rewind();
                return allocate2;
            case 5:
                ShortBuffer asShortBuffer = order.asShortBuffer();
                ShortBuffer allocate3 = ShortBuffer.allocate(asShortBuffer.capacity());
                allocate3.put(asShortBuffer);
                allocate3.rewind();
                return allocate3;
            case 6:
                IntBuffer asIntBuffer = order.asIntBuffer();
                IntBuffer allocate4 = IntBuffer.allocate(asIntBuffer.capacity());
                allocate4.put(asIntBuffer);
                allocate4.rewind();
                return allocate4;
            case 7:
                LongBuffer asLongBuffer = order.asLongBuffer();
                LongBuffer allocate5 = LongBuffer.allocate(asLongBuffer.capacity());
                allocate5.put(asLongBuffer);
                allocate5.rewind();
                return allocate5;
            case 8:
            case 9:
            case 10:
                ByteBuffer allocate6 = ByteBuffer.allocate(order.capacity());
                allocate6.put(order);
                allocate6.rewind();
                return allocate6;
            case 11:
                throw new IllegalStateException("Unsupported data type String");
            default:
                throw new IllegalStateException("Unsupported data type");
        }
    }

    /* renamed from: ai.onnxruntime.OnnxSparseTensor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxJavaType;
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType;

        static {
            int[] iArr = new int[OnnxJavaType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxJavaType = iArr;
            try {
                iArr[OnnxJavaType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.FLOAT16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BFLOAT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.INT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxJavaType[OnnxJavaType.UINT8.ordinal()] = 10;
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
            int[] iArr2 = new int[SparseTensorType.values().length];
            $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType = iArr2;
            try {
                iArr2[SparseTensorType.COO.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.BLOCK_SPARSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.CSRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OnnxSparseTensor$SparseTensorType[SparseTensorType.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public long[] getIndicesShape() {
        checkClosed();
        return getIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
    }

    public long[] getInnerIndicesShape() {
        checkClosed();
        if (this.sparseTensorType == SparseTensorType.CSRC) {
            return getInnerIndicesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
        }
        throw new IllegalStateException("Inner indices are only available for CSRC sparse tensors, this sparse tensor is " + this.sparseTensorType);
    }

    public long[] getValuesShape() {
        checkClosed();
        return getValuesShape(OnnxRuntime.ortApiHandle, this.nativeHandle);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType, still in use, count: 1, list:
      (r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType) from 0x0030: FILLED_NEW_ARRAY 
      (r0v0 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r1v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r3v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r0v0 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
      (r5v1 ai.onnxruntime.OnnxSparseTensor$SparseTensorType)
     A[WRAPPED] (LINE:594) elemType: ai.onnxruntime.OnnxSparseTensor$SparseTensorType
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class SparseTensorType {
        UNDEFINED(0),
        COO(1),
        CSRC(2),
        BLOCK_SPARSE(4);

        private static final SparseTensorType[] values;
        public final int value;

        public static SparseTensorType valueOf(String str) {
            return (SparseTensorType) Enum.valueOf(SparseTensorType.class, str);
        }

        public static SparseTensorType[] values() {
            return (SparseTensorType[]) $VALUES.clone();
        }

        static {
            SparseTensorType sparseTensorType = UNDEFINED;
            values = new SparseTensorType[]{sparseTensorType, r1, r3, sparseTensorType, r5};
        }

        private SparseTensorType(int i) {
            this.value = i;
        }

        public static SparseTensorType mapFromInt(int i) {
            if (i > 0) {
                SparseTensorType[] sparseTensorTypeArr = values;
                if (i < sparseTensorTypeArr.length) {
                    return sparseTensorTypeArr[i];
                }
            }
            return UNDEFINED;
        }
    }

    public static abstract class SparseTensor<T extends Buffer> {
        private final long[] denseShape;
        final T indices;
        private final long[] indicesShape;
        private final long numNonZero;
        private final OnnxJavaType type;
        final Buffer values;
        private final long[] valuesShape;

        public abstract OnnxJavaType getIndicesType();

        public abstract SparseTensorType getSparsityType();

        SparseTensor(T t, long[] jArr, Buffer buffer, long[] jArr2, long[] jArr3, OnnxJavaType onnxJavaType, long j) {
            this.indices = t;
            this.indicesShape = jArr;
            this.values = buffer;
            this.valuesShape = jArr2;
            this.denseShape = jArr3;
            this.type = onnxJavaType;
            this.numNonZero = j;
            if (buffer.remaining() != j) {
                throw new IllegalArgumentException("Expected numNonZero and data.remaining to be equal, found " + j + " and " + buffer.remaining() + " respectively");
            }
            if (onnxJavaType == OnnxJavaType.STRING) {
                throw new IllegalArgumentException("String SparseTensors are not supported.");
            }
        }

        public long[] getDenseShape() {
            return this.denseShape;
        }

        public OnnxJavaType getType() {
            return this.type;
        }

        public long getNumNonZeroElements() {
            return this.numNonZero;
        }

        public T getIndices() {
            return this.indices;
        }

        public Buffer getValues() {
            return this.values;
        }

        public long[] getValuesShape() {
            return this.valuesShape;
        }

        public long[] getIndicesShape() {
            return this.indicesShape;
        }
    }

    public static final class COOTensor extends SparseTensor<LongBuffer> {
        public COOTensor(LongBuffer longBuffer, long[] jArr, Buffer buffer, long[] jArr2, OnnxJavaType onnxJavaType, long j) {
            super(longBuffer, jArr, buffer, new long[]{j}, jArr2, onnxJavaType, j);
            if (jArr.length > 2 || jArr.length == 0 || jArr[0] != j) {
                throw new IllegalArgumentException("Invalid indices shape, expected [numNonZero, dimension] or [numNonZero] found " + Arrays.toString(jArr));
            }
            long elementCount = OrtUtil.elementCount(jArr);
            if (elementCount != longBuffer.remaining()) {
                throw new IllegalArgumentException("Unexpected number of indices found in buffer, expected " + elementCount + " found " + longBuffer.remaining());
            }
            if (buffer.remaining() != j) {
                throw new IllegalArgumentException("Expected data.remaining() - " + buffer.remaining() + " to equal numNonZero - " + j);
            }
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT64;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.COO;
        }
    }

    public static final class CSRCTensor extends SparseTensor<LongBuffer> {
        private final LongBuffer innerIndices;

        public CSRCTensor(LongBuffer longBuffer, LongBuffer longBuffer2, Buffer buffer, long[] jArr, OnnxJavaType onnxJavaType, long j) {
            super(longBuffer, new long[]{longBuffer.remaining()}, buffer, new long[]{j}, jArr, onnxJavaType, j);
            this.innerIndices = longBuffer2;
            long j2 = jArr[0] + 1;
            if (longBuffer.remaining() != j2) {
                throw new IllegalArgumentException("Outer indices should be equal to the number of rows + 1 in the dense shape, found " + longBuffer.remaining() + ", expected " + j2);
            }
            if (longBuffer2.remaining() != j) {
                throw new IllegalArgumentException("Inner indices should be equal to the number of non-zero elements, found " + longBuffer2.remaining() + ", expected " + j);
            }
        }

        public long[] getInnerIndicesShape() {
            return new long[]{this.innerIndices.remaining()};
        }

        public LongBuffer getInnerIndices() {
            return this.innerIndices;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT64;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.CSRC;
        }
    }

    public static final class BlockSparseTensor extends SparseTensor<IntBuffer> {
        public BlockSparseTensor(IntBuffer intBuffer, long[] jArr, Buffer buffer, long[] jArr2, long[] jArr3, OnnxJavaType onnxJavaType, long j) {
            super(intBuffer, jArr, buffer, jArr2, jArr3, onnxJavaType, j);
            if (OrtUtil.elementCount(jArr2) != j) {
                throw new IllegalArgumentException("Expected " + j + " entries in the data shape, found " + Arrays.toString(jArr2));
            }
            if (j != buffer.remaining()) {
                throw new IllegalArgumentException("Expected " + j + " elements in the data buffer, found " + buffer.remaining());
            }
            if (OrtUtil.elementCount(jArr) != intBuffer.remaining()) {
                throw new IllegalArgumentException("Expected " + OrtUtil.elementCount(jArr) + " elements in the indices buffer, found " + intBuffer.remaining());
            }
            if (jArr2.length < 3) {
                throw new IllegalArgumentException("Expected [numBlocks, blockSize, blockSize] or larger, but data shape was " + Arrays.toString(jArr2));
            }
            if (jArr.length < 2) {
                throw new IllegalArgumentException("Expected [numBlocks, coordinates] or larger, but indices shape was " + Arrays.toString(jArr));
            }
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public OnnxJavaType getIndicesType() {
            return OnnxJavaType.INT32;
        }

        @Override // ai.onnxruntime.OnnxSparseTensor.SparseTensor
        public SparseTensorType getSparsityType() {
            return SparseTensorType.BLOCK_SPARSE;
        }
    }
}
