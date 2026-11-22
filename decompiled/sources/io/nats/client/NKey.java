package io.nats.client;

import android.gov.nist.javax.sip.parser.TokenTypes;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.iflytek.cloud.ErrorCode;
import io.agora.rtc2.internal.RtcEngineEvent;
import io.nats.client.support.Encoding;
import io.nats.client.support.RandomUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.UShort;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

/* loaded from: classes6.dex */
public class NKey {
    private static final int ED25519_PRIVATE_KEYSIZE = 64;
    private static final int ED25519_PUBLIC_KEYSIZE = 32;
    private static final int ED25519_SEED_SIZE = 32;
    static final int PREFIX_BYTE_ACCOUNT = 0;
    static final int PREFIX_BYTE_CLUSTER = 16;
    static final int PREFIX_BYTE_OPERATOR = 112;
    static final int PREFIX_BYTE_PRIVATE = 120;
    private static final int PREFIX_BYTE_SEED = 144;
    static final int PREFIX_BYTE_SERVER = 104;
    static final int PREFIX_BYTE_USER = 160;
    private char[] privateKeyAsSeed;
    private char[] publicKey;
    private Type type;
    private static final EdDSANamedCurveSpec ed25519 = EdDSANamedCurveTable.getByName("Ed25519");
    private static final int[] crc16table = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935, 4657, 528, 12915, 8786, 21173, 17044, 29431, 25302, 37689, 33560, 45947, 41818, 54205, 50076, 62463, 58334, 9314, 13379, 1056, 5121, 25830, 29895, 17572, 21637, 42346, 46411, 34088, 38153, 58862, 62927, 50604, 54669, 13907, 9842, 5649, 1584, 30423, 26358, 22165, 18100, 46939, 42874, 38681, 34616, 63455, 59390, 55197, 51132, 18628, 22757, 26758, 30887, TokenTypes.AUTHENTICATION_INFO, 6241, 10242, 14371, 51660, 55789, 59790, 63919, 35144, 39273, 43274, 47403, 23285, 19156, 31415, 27286, 6769, 2640, 14899, 10770, 56317, 52188, 64447, 60318, 39801, 35672, 47931, 43802, 27814, 31879, 19684, 23749, 11298, 15363, 3168, 7233, 60846, 64911, 52716, 56781, 44330, 48395, 36200, 40265, 32407, 28342, 24277, 20212, 15891, 11826, 7761, 3696, 65439, 61374, 57309, 53244, 48923, 44858, 40793, 36728, 37256, 33193, 45514, 41451, 53516, 49453, 61774, 57711, 4224, 161, 12482, 8419, 20484, 16421, 28742, 24679, 33721, 37784, 41979, 46042, 49981, 54044, 58239, 62302, 689, 4752, 8947, RtcEngineEvent.EvtType.EVT_RTC_STATS, 16949, 21012, 25207, 29270, 46570, 42443, 38312, 34185, 62830, 58703, 54572, 50445, 13538, 9411, 5280, 1153, 29798, 25671, 21540, 17413, 42971, 47098, 34713, 38840, 59231, 63358, 50973, 55100, 9939, RtcEngineEvent.EvtType.EVT_VIDEO_RENDERING_TRACING_RESULT, 1681, 5808, 26199, 30326, 17941, 22068, 55628, 51565, 63758, 59695, 39368, 35305, 47498, 43435, 22596, 18533, 30726, 26663, 6336, 2273, 14466, ErrorCode.MSP_ERROR_DB_INVALID_USER, 52093, 56156, 60223, 64286, 35833, 39896, 43963, 48026, 19061, ErrorCode.ERROR_AITALK_RESULT_ERROR, 27191, 31254, GLMapStaticValue.AM_PARAMETERNAME_RENDER_COMPLETE, 6864, 10931, 14994, 64814, 60687, 56684, 52557, 48554, 44427, 40424, 36297, 31782, 27655, 23652, 19525, 15522, 11395, 7392, 3265, 61215, 65342, 53085, 57212, 44955, 49082, 36825, 40952, 28183, 32310, 20053, 24180, 11923, 16050, 3793, 7920};

    private static boolean checkValidPublicPrefixByte(int i) {
        return i == 0 || i == 16 || i == 104 || i == 112 || i == 160;
    }

    public enum Type {
        USER(160),
        ACCOUNT(0),
        SERVER(104),
        OPERATOR(112),
        CLUSTER(16),
        PRIVATE(120);

        private final int prefix;

        Type(int i) {
            this.prefix = i;
        }

        public static Type fromPrefix(int i) {
            if (i == 0) {
                return ACCOUNT;
            }
            if (i == 104) {
                return SERVER;
            }
            if (i == 160) {
                return USER;
            }
            if (i == 16) {
                return CLUSTER;
            }
            if (i == 120) {
                return ACCOUNT;
            }
            if (i == 112) {
                return OPERATOR;
            }
            throw new IllegalArgumentException("Unknown prefix");
        }
    }

    static int crc16(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i = crc16table[((i >> 8) ^ (b & 255)) & 255] ^ ((i << 8) & 65535);
        }
        return i;
    }

    static char[] removePaddingAndClear(char[] cArr) {
        int length = cArr.length - 1;
        while (length >= 0 && cArr[length] == '=') {
            length--;
        }
        int i = length + 1;
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, i);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = 0;
        }
        return cArr2;
    }

    static char[] encode(Type type, byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(type.prefix);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort((short) crc16(byteArrayOutputStream.toByteArray())).array());
        return removePaddingAndClear(Encoding.base32Encode(byteArrayOutputStream.toByteArray()));
    }

    static char[] encodeSeed(Type type, byte[] bArr) throws IOException {
        if (bArr.length == 64 || bArr.length == 32) {
            int i = (type.prefix >> 5) | 144;
            int i2 = (type.prefix & 31) << 3;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort((short) crc16(byteArrayOutputStream.toByteArray())).array());
            return removePaddingAndClear(Encoding.base32Encode(byteArrayOutputStream.toByteArray()));
        }
        throw new IllegalArgumentException("Source is not the correct size for an ED25519 seed");
    }

    static byte[] decode(char[] cArr) {
        byte[] base32Decode = Encoding.base32Decode(cArr);
        if (base32Decode == null || base32Decode.length < 4) {
            throw new IllegalArgumentException("Invalid encoding for source string");
        }
        byte[] copyOfRange = Arrays.copyOfRange(base32Decode, base32Decode.length - 2, base32Decode.length);
        byte[] copyOfRange2 = Arrays.copyOfRange(base32Decode, 0, base32Decode.length - 2);
        if (crc16(copyOfRange2) == (ByteBuffer.wrap(copyOfRange).order(ByteOrder.LITTLE_ENDIAN).getShort() & UShort.MAX_VALUE)) {
            return copyOfRange2;
        }
        throw new IllegalArgumentException("CRC is invalid");
    }

    static byte[] decode(Type type, char[] cArr, boolean z) {
        byte[] decode = decode(cArr);
        byte[] copyOfRange = Arrays.copyOfRange(decode, 1, decode.length);
        if (Type.fromPrefix(decode[0] & 255) == type) {
            return copyOfRange;
        }
        if (z) {
            return null;
        }
        throw new IllegalArgumentException("Unexpected type");
    }

    static DecodedSeed decodeSeed(char[] cArr) {
        byte[] decode = decode(cArr);
        byte b = decode[0];
        int i = b & 248;
        int i2 = ((b & 7) << 5) | ((decode[1] & 248) >> 3);
        if (i != 144) {
            throw new IllegalArgumentException("Invalid encoding");
        }
        if (!checkValidPublicPrefixByte(i2)) {
            throw new IllegalArgumentException("Invalid encoded prefix byte");
        }
        byte[] copyOfRange = Arrays.copyOfRange(decode, 2, decode.length);
        DecodedSeed decodedSeed = new DecodedSeed();
        decodedSeed.prefix = i2;
        decodedSeed.bytes = copyOfRange;
        return decodedSeed;
    }

    private static NKey createPair(Type type, SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        if (secureRandom == null) {
            secureRandom = RandomUtils.SRAND;
        }
        byte[] bArr = new byte[ed25519.getCurve().getField().getb() / 8];
        secureRandom.nextBytes(bArr);
        return createPair(type, bArr);
    }

    private static NKey createPair(Type type, byte[] bArr) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        EdDSANamedCurveSpec edDSANamedCurveSpec = ed25519;
        byte[] abyte = new EdDSAPublicKey(new EdDSAPublicKeySpec(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(bArr, edDSANamedCurveSpec)).getA(), edDSANamedCurveSpec)).getAbyte();
        byte[] bArr2 = new byte[abyte.length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(abyte, 0, bArr2, bArr.length, abyte.length);
        return new NKey(type, null, encodeSeed(type, bArr2));
    }

    public static NKey createAccount(SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        return createPair(Type.ACCOUNT, secureRandom);
    }

    public static NKey createCluster(SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        return createPair(Type.CLUSTER, secureRandom);
    }

    public static NKey createOperator(SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        return createPair(Type.OPERATOR, secureRandom);
    }

    public static NKey createServer(SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        return createPair(Type.SERVER, secureRandom);
    }

    public static NKey createUser(SecureRandom secureRandom) throws IOException, NoSuchProviderException, NoSuchAlgorithmException {
        return createPair(Type.USER, secureRandom);
    }

    public static NKey fromPublicKey(char[] cArr) {
        int i = decode(cArr)[0] & 255;
        if (!checkValidPublicPrefixByte(i)) {
            throw new IllegalArgumentException("Not a valid public NKey");
        }
        return new NKey(Type.fromPrefix(i), cArr, null);
    }

    public static NKey fromSeed(char[] cArr) {
        DecodedSeed decodeSeed = decodeSeed(cArr);
        if (decodeSeed.bytes.length == 64) {
            return new NKey(Type.fromPrefix(decodeSeed.prefix), null, cArr);
        }
        try {
            return createPair(Type.fromPrefix(decodeSeed.prefix), decodeSeed.bytes);
        } catch (Exception e) {
            throw new IllegalArgumentException("Bad seed value", e);
        }
    }

    public static boolean isValidPublicAccountKey(char[] cArr) {
        return decode(Type.ACCOUNT, cArr, true) != null;
    }

    public static boolean isValidPublicClusterKey(char[] cArr) {
        return decode(Type.CLUSTER, cArr, true) != null;
    }

    public static boolean isValidPublicOperatorKey(char[] cArr) {
        return decode(Type.OPERATOR, cArr, true) != null;
    }

    public static boolean isValidPublicServerKey(char[] cArr) {
        return decode(Type.SERVER, cArr, true) != null;
    }

    public static boolean isValidPublicUserKey(char[] cArr) {
        return decode(Type.USER, cArr, true) != null;
    }

    private NKey(Type type, char[] cArr, char[] cArr2) {
        this.type = type;
        this.privateKeyAsSeed = cArr2;
        this.publicKey = cArr;
    }

    public void clear() {
        char[] cArr;
        if (this.privateKeyAsSeed != null) {
            int i = 0;
            while (true) {
                cArr = this.privateKeyAsSeed;
                if (i >= cArr.length) {
                    break;
                }
                cArr[i] = (char) (RandomUtils.PRAND.nextInt(26) + 97);
                i++;
            }
            Arrays.fill(cArr, (char) 0);
        }
        if (this.publicKey == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = this.publicKey;
            if (i2 < cArr2.length) {
                cArr2[i2] = (char) (RandomUtils.PRAND.nextInt(26) + 97);
                i2++;
            } else {
                Arrays.fill(cArr2, (char) 0);
                return;
            }
        }
    }

    public char[] getSeed() {
        char[] cArr = this.privateKeyAsSeed;
        if (cArr == null) {
            throw new IllegalStateException("Public-only NKey");
        }
        DecodedSeed decodeSeed = decodeSeed(cArr);
        byte[] bArr = new byte[32];
        System.arraycopy(decodeSeed.bytes, 0, bArr, 0, 32);
        try {
            return encodeSeed(Type.fromPrefix(decodeSeed.prefix), bArr);
        } catch (Exception e) {
            throw new IllegalStateException("Unable to create seed.", e);
        }
    }

    public char[] getPublicKey() throws GeneralSecurityException, IOException {
        char[] cArr = this.publicKey;
        if (cArr != null) {
            return cArr;
        }
        return encode(this.type, ((EdDSAPublicKey) getKeyPair().getPublic()).getAbyte());
    }

    public char[] getPrivateKey() throws GeneralSecurityException, IOException {
        char[] cArr = this.privateKeyAsSeed;
        if (cArr == null) {
            throw new IllegalStateException("Public-only NKey");
        }
        return encode(Type.PRIVATE, decodeSeed(cArr).bytes);
    }

    public KeyPair getKeyPair() throws GeneralSecurityException, IOException {
        char[] cArr = this.privateKeyAsSeed;
        if (cArr == null) {
            throw new IllegalStateException("Public-only NKey");
        }
        DecodedSeed decodeSeed = decodeSeed(cArr);
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        System.arraycopy(decodeSeed.bytes, 0, bArr, 0, 32);
        System.arraycopy(decodeSeed.bytes, 32, bArr2, 0, 32);
        EdDSANamedCurveSpec edDSANamedCurveSpec = ed25519;
        return new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(bArr2, edDSANamedCurveSpec)), new EdDSAPrivateKey(new EdDSAPrivateKeySpec(bArr, edDSANamedCurveSpec)));
    }

    public Type getType() {
        return this.type;
    }

    public byte[] sign(byte[] bArr) throws GeneralSecurityException, IOException {
        EdDSAEngine edDSAEngine = new EdDSAEngine(MessageDigest.getInstance(ed25519.getHashAlgorithm()));
        edDSAEngine.initSign(getKeyPair().getPrivate());
        edDSAEngine.update(bArr);
        return edDSAEngine.sign();
    }

    public boolean verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, IOException {
        PublicKey edDSAPublicKey;
        EdDSANamedCurveSpec edDSANamedCurveSpec = ed25519;
        EdDSAEngine edDSAEngine = new EdDSAEngine(MessageDigest.getInstance(edDSANamedCurveSpec.getHashAlgorithm()));
        if (this.privateKeyAsSeed != null) {
            edDSAPublicKey = getKeyPair().getPublic();
        } else {
            edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(decode(this.type, getPublicKey(), false), edDSANamedCurveSpec));
        }
        edDSAEngine.initVerify(edDSAPublicKey);
        edDSAEngine.update(bArr);
        return edDSAEngine.verify(bArr2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NKey)) {
            return false;
        }
        NKey nKey = (NKey) obj;
        if (this.type != nKey.type) {
            return false;
        }
        char[] cArr = this.privateKeyAsSeed;
        if (cArr == null) {
            return Arrays.equals(this.publicKey, nKey.publicKey);
        }
        return Arrays.equals(cArr, nKey.privateKeyAsSeed);
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = 527 + this.type.prefix;
        char[] cArr = this.privateKeyAsSeed;
        if (cArr == null) {
            i = i2 * 31;
            hashCode = Arrays.hashCode(this.publicKey);
        } else {
            i = i2 * 31;
            hashCode = Arrays.hashCode(cArr);
        }
        return i + hashCode;
    }
}
