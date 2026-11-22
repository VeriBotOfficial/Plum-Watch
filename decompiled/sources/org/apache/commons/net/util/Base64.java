package org.apache.commons.net.util;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;

@Deprecated
/* loaded from: classes8.dex */
public class Base64 {
    static final int CHUNK_SIZE = 76;
    private static final byte PAD = 61;
    private final int lineLength;
    private final byte[] lineSeparator;
    private final boolean urlSafe;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, BuiltinOptions.LogicalAndOptions, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions};

    private static boolean isWhiteSpace(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    private static boolean containsBase64Byte(byte[] bArr) {
        for (byte b : bArr) {
            if (isBase64(b)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return isEmpty(bArr) ? bArr : getDecoder().decode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        return getDecoder().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    private static byte[] encode(byte[] bArr, int i, byte[] bArr2, boolean z) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        if (i > 0) {
            return encodeBase64Chunked(bArr, i, bArr2);
        }
        return z ? encodeBase64URLSafe(bArr) : encodeBase64(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return isEmpty(bArr) ? bArr : getEncoder().encode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return z ? encodeBase64Chunked(bArr) : encodeBase64(bArr, false, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        long encodeLength = getEncodeLength(bArr, z ? 76 : 0, z ? CHUNK_SEPARATOR : NetConstants.EMPTY_BTYE_ARRAY);
        if (encodeLength > i) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodeLength + ") than the specified maxium size of " + i);
        }
        if (z) {
            return encodeBase64Chunked(bArr);
        }
        return z2 ? encodeBase64URLSafe(bArr) : encodeBase64(bArr);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64Chunked(bArr, 76, CHUNK_SEPARATOR);
    }

    private static byte[] encodeBase64Chunked(byte[] bArr, int i, byte[] bArr2) {
        int intExact = Math.toIntExact(getEncodeLength(bArr, i, bArr2));
        byte[] bArr3 = new byte[intExact];
        getMimeEncoder(i, bArr2).encode(bArr, bArr3);
        System.arraycopy(bArr2, 0, bArr3, intExact - bArr2.length, bArr2.length);
        return bArr3;
    }

    public static String encodeBase64String(byte[] bArr) {
        return getMimeEncoder().encodeToString(bArr) + "\r\n";
    }

    public static String encodeBase64String(byte[] bArr, boolean z) {
        return newStringUtf8(encodeBase64(bArr, z));
    }

    public static String encodeBase64StringUnChunked(byte[] bArr) {
        return getEncoder().encodeToString(bArr);
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return getUrlEncoder().withoutPadding().encode(bArr);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return getUrlEncoder().withoutPadding().encodeToString(bArr);
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    private static Base64.Decoder getDecoder() {
        return java.util.Base64.getDecoder();
    }

    static long getEncodeLength(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i / 4) * 4;
        long length = (bArr.length * 4) / 3;
        long j = length % 4;
        if (j != 0) {
            length += 4 - j;
        }
        if (i2 <= 0) {
            return length;
        }
        long j2 = i2;
        boolean z = length % j2 == 0;
        long length2 = length + ((length / j2) * bArr2.length);
        return !z ? length2 + bArr2.length : length2;
    }

    private static Base64.Encoder getEncoder() {
        return java.util.Base64.getEncoder();
    }

    private static Base64.Encoder getMimeEncoder() {
        return java.util.Base64.getMimeEncoder();
    }

    private static Base64.Encoder getMimeEncoder(int i, byte[] bArr) {
        return java.util.Base64.getMimeEncoder(i, bArr);
    }

    private static Base64.Encoder getUrlEncoder() {
        return java.util.Base64.getUrlEncoder();
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        for (byte b : bArr) {
            if (!isBase64(b) && !isWhiteSpace(b)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBase64(byte b) {
        if (b == 61) {
            return true;
        }
        if (b < 0) {
            return false;
        }
        byte[] bArr = DECODE_TABLE;
        return b < bArr.length && bArr[b] != -1;
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private static String newStringUtf8(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static byte[] toIntegerBytes(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInt");
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
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
        this(false);
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        if (bArr == null || z) {
            bArr = NetConstants.EMPTY_BTYE_ARRAY;
            i = 0;
        }
        this.lineLength = i > 0 ? (i / 4) * 4 : 0;
        byte[] bArr2 = new byte[bArr.length];
        this.lineSeparator = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        if (containsBase64Byte(bArr)) {
            throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + newStringUtf8(bArr) + "]");
        }
        this.urlSafe = z;
    }

    public byte[] decode(byte[] bArr) {
        return isEmpty(bArr) ? bArr : getDecoder().decode(bArr);
    }

    public byte[] decode(String str) {
        return getDecoder().decode(str);
    }

    public byte[] encode(byte[] bArr) {
        return encode(bArr, this.lineLength, this.lineSeparator, isUrlSafe());
    }

    public String encodeToString(byte[] bArr) {
        return newStringUtf8(encode(bArr));
    }

    int getLineLength() {
        return this.lineLength;
    }

    byte[] getLineSeparator() {
        return (byte[]) this.lineSeparator.clone();
    }

    public boolean isUrlSafe() {
        return this.urlSafe;
    }
}
