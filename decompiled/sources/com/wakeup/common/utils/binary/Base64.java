package com.wakeup.common.utils.binary;

import com.wakeup.common.utils.binary.BaseNCodec;
import java.math.BigInteger;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes2.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    private static final byte[] STANDARD_ENCODE_TABLE = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, BuiltinOptions.LogicalAndOptions, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions};

    public static byte[] decodeBase64(final byte[] base64Data) {
        return new Base64().decode(base64Data);
    }

    public static byte[] decodeBase64(final String base64String) {
        return new Base64().decode(base64String);
    }

    public static BigInteger decodeInteger(final byte[] pArray) {
        return new BigInteger(1, decodeBase64(pArray));
    }

    public static byte[] encodeBase64(final byte[] binaryData) {
        return encodeBase64(binaryData, false);
    }

    public static byte[] encodeBase64(final byte[] binaryData, final boolean isChunked) {
        return encodeBase64(binaryData, isChunked, false);
    }

    public static byte[] encodeBase64(final byte[] binaryData, final boolean isChunked, final boolean urlSafe) {
        return encodeBase64(binaryData, isChunked, urlSafe, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(final byte[] binaryData, final boolean isChunked, final boolean urlSafe, final int maxResultSize) {
        if (binaryData == null || binaryData.length == 0) {
            return binaryData;
        }
        Base64 base64 = isChunked ? new Base64(urlSafe) : new Base64(0, CHUNK_SEPARATOR, urlSafe);
        long encodedLength = base64.getEncodedLength(binaryData);
        if (encodedLength > maxResultSize) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + maxResultSize);
        }
        return base64.encode(binaryData);
    }

    public static byte[] encodeBase64Chunked(final byte[] binaryData) {
        return encodeBase64(binaryData, true);
    }

    public static String encodeBase64String(final byte[] binaryData) {
        return StringUtils.newStringUsAscii(encodeBase64(binaryData, false));
    }

    public static byte[] encodeBase64URLSafe(final byte[] binaryData) {
        return encodeBase64(binaryData, false, true);
    }

    public static String encodeBase64URLSafeString(final byte[] binaryData) {
        return StringUtils.newStringUsAscii(encodeBase64(binaryData, false, true));
    }

    public static byte[] encodeInteger(final BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInteger");
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    @Deprecated
    public static boolean isArrayByteBase64(final byte[] arrayOctet) {
        return isBase64(arrayOctet);
    }

    public static boolean isBase64(final byte octet) {
        if (octet == 61) {
            return true;
        }
        if (octet < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return octet < bArr.length && bArr[octet] != -1;
    }

    public static boolean isBase64(final byte[] arrayOctet) {
        for (int i = 0; i < arrayOctet.length; i++) {
            if (!isBase64(arrayOctet[i]) && !isWhiteSpace(arrayOctet[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBase64(final String base64) {
        return isBase64(StringUtils.getBytesUtf8(base64));
    }

    static byte[] toIntegerBytes(final BigInteger bigInt) {
        int bitLength = ((bigInt.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInt.toByteArray();
        int i = 1;
        if (bigInt.bitLength() % 8 != 0 && (bigInt.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInt.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    public Base64() {
        this(0);
    }

    public Base64(final boolean urlSafe) {
        this(76, CHUNK_SEPARATOR, urlSafe);
    }

    public Base64(final int lineLength) {
        this(lineLength, CHUNK_SEPARATOR);
    }

    public Base64(final int lineLength, final byte[] lineSeparator) {
        this(lineLength, lineSeparator, false);
    }

    public Base64(final int lineLength, final byte[] lineSeparator, final boolean urlSafe) {
        this(lineLength, lineSeparator, urlSafe, DECODING_POLICY_DEFAULT);
    }

    public Base64(final int lineLength, final byte[] lineSeparator, final boolean urlSafe, final CodecPolicy decodingPolicy) {
        super(3, 4, lineLength, lineSeparator == null ? 0 : lineSeparator.length, (byte) 61, decodingPolicy);
        this.decodeTable = DECODE_TABLE;
        if (lineSeparator != null) {
            if (containsAlphabetOrPad(lineSeparator)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + StringUtils.newStringUtf8(lineSeparator) + "]");
            }
            if (lineLength > 0) {
                this.encodeSize = lineSeparator.length + 4;
                byte[] bArr = new byte[lineSeparator.length];
                this.lineSeparator = bArr;
                System.arraycopy(lineSeparator, 0, bArr, 0, lineSeparator.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = urlSafe ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    @Override // com.wakeup.common.utils.binary.BaseNCodec
    void decode(final byte[] in, int inPos, final int inAvail, final BaseNCodec.Context context) {
        byte b;
        if (context.eof) {
            return;
        }
        if (inAvail < 0) {
            context.eof = true;
        }
        int i = 0;
        while (true) {
            if (i >= inAvail) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i2 = inPos + 1;
            byte b2 = in[inPos];
            if (b2 == this.pad) {
                context.eof = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b2 < bArr.length && (b = bArr[b2]) >= 0) {
                    context.modulus = (context.modulus + 1) % 4;
                    context.ibitWorkArea = (context.ibitWorkArea << 6) + b;
                    if (context.modulus == 0) {
                        int i3 = context.pos;
                        context.pos = i3 + 1;
                        ensureBufferSize[i3] = (byte) ((context.ibitWorkArea >> 16) & 255);
                        int i4 = context.pos;
                        context.pos = i4 + 1;
                        ensureBufferSize[i4] = (byte) ((context.ibitWorkArea >> 8) & 255);
                        int i5 = context.pos;
                        context.pos = i5 + 1;
                        ensureBufferSize[i5] = (byte) (context.ibitWorkArea & 255);
                    }
                }
            }
            i++;
            inPos = i2;
        }
        if (!context.eof || context.modulus == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
        int i6 = context.modulus;
        if (i6 == 1) {
            validateTrailingCharacter();
            return;
        }
        if (i6 == 2) {
            validateCharacter(15, context);
            context.ibitWorkArea >>= 4;
            int i7 = context.pos;
            context.pos = i7 + 1;
            ensureBufferSize2[i7] = (byte) (context.ibitWorkArea & 255);
            return;
        }
        if (i6 == 3) {
            validateCharacter(3, context);
            context.ibitWorkArea >>= 2;
            int i8 = context.pos;
            context.pos = i8 + 1;
            ensureBufferSize2[i8] = (byte) ((context.ibitWorkArea >> 8) & 255);
            int i9 = context.pos;
            context.pos = i9 + 1;
            ensureBufferSize2[i9] = (byte) (context.ibitWorkArea & 255);
            return;
        }
        throw new IllegalStateException("Impossible modulus " + context.modulus);
    }

    @Override // com.wakeup.common.utils.binary.BaseNCodec
    void encode(final byte[] in, int inPos, final int inAvail, final BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (inAvail >= 0) {
            int i = 0;
            while (i < inAvail) {
                byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
                context.modulus = (context.modulus + 1) % 3;
                int i2 = inPos + 1;
                int i3 = in[inPos];
                if (i3 < 0) {
                    i3 += 256;
                }
                context.ibitWorkArea = (context.ibitWorkArea << 8) + i3;
                if (context.modulus == 0) {
                    int i4 = context.pos;
                    context.pos = i4 + 1;
                    ensureBufferSize[i4] = this.encodeTable[(context.ibitWorkArea >> 18) & 63];
                    int i5 = context.pos;
                    context.pos = i5 + 1;
                    ensureBufferSize[i5] = this.encodeTable[(context.ibitWorkArea >> 12) & 63];
                    int i6 = context.pos;
                    context.pos = i6 + 1;
                    ensureBufferSize[i6] = this.encodeTable[(context.ibitWorkArea >> 6) & 63];
                    int i7 = context.pos;
                    context.pos = i7 + 1;
                    ensureBufferSize[i7] = this.encodeTable[context.ibitWorkArea & 63];
                    context.currentLinePos += 4;
                    if (this.lineLength > 0 && this.lineLength <= context.currentLinePos) {
                        System.arraycopy(this.lineSeparator, 0, ensureBufferSize, context.pos, this.lineSeparator.length);
                        context.pos += this.lineSeparator.length;
                        context.currentLinePos = 0;
                    }
                }
                i++;
                inPos = i2;
            }
            return;
        }
        context.eof = true;
        if (context.modulus == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
        int i8 = context.pos;
        int i9 = context.modulus;
        if (i9 != 0) {
            if (i9 == 1) {
                int i10 = context.pos;
                context.pos = i10 + 1;
                ensureBufferSize2[i10] = this.encodeTable[(context.ibitWorkArea >> 2) & 63];
                int i11 = context.pos;
                context.pos = i11 + 1;
                ensureBufferSize2[i11] = this.encodeTable[(context.ibitWorkArea << 4) & 63];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i12 = context.pos;
                    context.pos = i12 + 1;
                    ensureBufferSize2[i12] = this.pad;
                    int i13 = context.pos;
                    context.pos = i13 + 1;
                    ensureBufferSize2[i13] = this.pad;
                }
            } else if (i9 == 2) {
                int i14 = context.pos;
                context.pos = i14 + 1;
                ensureBufferSize2[i14] = this.encodeTable[(context.ibitWorkArea >> 10) & 63];
                int i15 = context.pos;
                context.pos = i15 + 1;
                ensureBufferSize2[i15] = this.encodeTable[(context.ibitWorkArea >> 4) & 63];
                int i16 = context.pos;
                context.pos = i16 + 1;
                ensureBufferSize2[i16] = this.encodeTable[(context.ibitWorkArea << 2) & 63];
                if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                    int i17 = context.pos;
                    context.pos = i17 + 1;
                    ensureBufferSize2[i17] = this.pad;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + context.modulus);
            }
        }
        context.currentLinePos += context.pos - i8;
        if (this.lineLength <= 0 || context.currentLinePos <= 0) {
            return;
        }
        System.arraycopy(this.lineSeparator, 0, ensureBufferSize2, context.pos, this.lineSeparator.length);
        context.pos += this.lineSeparator.length;
    }

    @Override // com.wakeup.common.utils.binary.BaseNCodec
    protected boolean isInAlphabet(final byte octet) {
        if (octet < 0) {
            return false;
        }
        byte[] bArr = this.decodeTable;
        return octet < bArr.length && bArr[octet] != -1;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    private void validateCharacter(final int emptyBitsMask, final BaseNCodec.Context context) {
        if (isStrictDecoding() && (emptyBitsMask & context.ibitWorkArea) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void validateTrailingCharacter() {
        if (isStrictDecoding()) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
        }
    }
}
