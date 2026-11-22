package com.wakeup.common.utils.binary;

import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    protected final byte PAD;
    private final int chunkSeparatorLength;
    private final CodecPolicy decodingPolicy;
    private final int encodedBlockSize;
    protected final int lineLength;
    protected final byte pad;
    private final int unencodedBlockSize;
    protected static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
    static final byte[] CHUNK_SEPARATOR = {13, 10};

    protected static boolean isWhiteSpace(final byte byteToCheck) {
        return byteToCheck == 9 || byteToCheck == 10 || byteToCheck == 13 || byteToCheck == 32;
    }

    abstract void decode(byte[] pArray, int i, int length, Context context);

    abstract void encode(byte[] pArray, int i, int length, Context context);

    protected int getDefaultBufferSize() {
        return 8192;
    }

    protected abstract boolean isInAlphabet(byte value);

    static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        Context() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos));
        }
    }

    private static int compareUnsigned(final int x, final int y) {
        return Integer.compare(x - 2147483648, y - 2147483648);
    }

    private static int createPositiveCapacity(final int minCapacity) {
        if (minCapacity >= 0) {
            return minCapacity > MAX_BUFFER_SIZE ? minCapacity : MAX_BUFFER_SIZE;
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (minCapacity & BodyPartID.bodyIdMax));
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) CHUNK_SEPARATOR.clone();
    }

    private static byte[] resizeBuffer(final Context context, final int minCapacity) {
        int length = context.buffer.length * 2;
        if (compareUnsigned(length, minCapacity) < 0) {
            length = minCapacity;
        }
        if (compareUnsigned(length, MAX_BUFFER_SIZE) > 0) {
            length = createPositiveCapacity(minCapacity);
        }
        byte[] bArr = new byte[length];
        System.arraycopy(context.buffer, 0, bArr, 0, context.buffer.length);
        context.buffer = bArr;
        return bArr;
    }

    protected BaseNCodec(final int unencodedBlockSize, final int encodedBlockSize, final int lineLength, final int chunkSeparatorLength) {
        this(unencodedBlockSize, encodedBlockSize, lineLength, chunkSeparatorLength, (byte) 61);
    }

    protected BaseNCodec(final int unencodedBlockSize, final int encodedBlockSize, final int lineLength, final int chunkSeparatorLength, final byte pad) {
        this(unencodedBlockSize, encodedBlockSize, lineLength, chunkSeparatorLength, pad, DECODING_POLICY_DEFAULT);
    }

    protected BaseNCodec(final int unencodedBlockSize, final int encodedBlockSize, final int lineLength, final int chunkSeparatorLength, final byte pad, final CodecPolicy decodingPolicy) {
        this.PAD = (byte) 61;
        this.unencodedBlockSize = unencodedBlockSize;
        this.encodedBlockSize = encodedBlockSize;
        this.lineLength = (lineLength <= 0 || chunkSeparatorLength <= 0) ? 0 : (lineLength / encodedBlockSize) * encodedBlockSize;
        this.chunkSeparatorLength = chunkSeparatorLength;
        this.pad = pad;
        this.decodingPolicy = (CodecPolicy) Objects.requireNonNull(decodingPolicy, "codecPolicy");
    }

    int available(final Context context) {
        if (context.buffer != null) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    protected boolean containsAlphabetOrPad(final byte[] arrayOctet) {
        if (arrayOctet == null) {
            return false;
        }
        for (byte b : arrayOctet) {
            if (this.pad == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.wakeup.common.utils.binary.BinaryDecoder
    public byte[] decode(final byte[] pArray) {
        if (pArray == null || pArray.length == 0) {
            return pArray;
        }
        Context context = new Context();
        decode(pArray, 0, pArray.length, context);
        decode(pArray, 0, -1, context);
        int i = context.pos;
        byte[] bArr = new byte[i];
        readResults(bArr, 0, i, context);
        return bArr;
    }

    @Override // com.wakeup.common.utils.binary.Decoder
    public Object decode(final Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(final String pArray) {
        return decode(StringUtils.getBytesUtf8(pArray));
    }

    @Override // com.wakeup.common.utils.binary.BinaryEncoder
    public byte[] encode(final byte[] pArray) {
        return (pArray == null || pArray.length == 0) ? pArray : encode(pArray, 0, pArray.length);
    }

    public byte[] encode(final byte[] pArray, final int offset, final int length) {
        if (pArray == null || pArray.length == 0) {
            return pArray;
        }
        Context context = new Context();
        encode(pArray, offset, length, context);
        encode(pArray, offset, -1, context);
        int i = context.pos - context.readPos;
        byte[] bArr = new byte[i];
        readResults(bArr, 0, i, context);
        return bArr;
    }

    @Override // com.wakeup.common.utils.binary.Encoder
    public Object encode(final Object obj) throws EncoderException {
        if (!(obj instanceof byte[])) {
            throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
        }
        return encode((byte[]) obj);
    }

    public String encodeAsString(final byte[] pArray) {
        return StringUtils.newStringUtf8(encode(pArray));
    }

    public String encodeToString(final byte[] pArray) {
        return StringUtils.newStringUtf8(encode(pArray));
    }

    protected byte[] ensureBufferSize(final int size, final Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[Math.max(size, getDefaultBufferSize())];
            context.pos = 0;
            context.readPos = 0;
        } else if ((context.pos + size) - context.buffer.length > 0) {
            return resizeBuffer(context, context.pos + size);
        }
        return context.buffer;
    }

    public CodecPolicy getCodecPolicy() {
        return this.decodingPolicy;
    }

    public long getEncodedLength(final byte[] pArray) {
        int length = pArray.length;
        int i = this.unencodedBlockSize;
        long j = (((length + i) - 1) / i) * this.encodedBlockSize;
        int i2 = this.lineLength;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.chunkSeparatorLength) : j;
    }

    boolean hasData(final Context context) {
        return context.buffer != null;
    }

    public boolean isInAlphabet(final byte[] arrayOctet, final boolean allowWSPad) {
        for (byte b : arrayOctet) {
            if (!isInAlphabet(b) && (!allowWSPad || (b != this.pad && !isWhiteSpace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isInAlphabet(final String basen) {
        return isInAlphabet(StringUtils.getBytesUtf8(basen), true);
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    int readResults(final byte[] b, final int bPos, final int bAvail, final Context context) {
        if (context.buffer == null) {
            return context.eof ? -1 : 0;
        }
        int min = Math.min(available(context), bAvail);
        System.arraycopy(context.buffer, context.readPos, b, bPos, min);
        context.readPos += min;
        if (context.readPos >= context.pos) {
            context.buffer = null;
        }
        return min;
    }
}
