package com.hispark.crashdump.protocol;

import android.gov.nist.javax.sip.parser.TokenTypes;
import androidx.core.view.InputDeviceCompat;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.iflytek.cloud.ErrorCode;
import io.agora.rtc2.internal.RtcEngineEvent;
import io.nats.client.support.ApiConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nJ\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/hispark/crashdump/protocol/ProtocolBytes;", "", "<init>", "()V", "SOF", "", "CTRL", "crc16Tab", "", "crc16", "", "data", "intToLittleBytes", "value", "", "shortToLittleBytes", "", "littleInt", ApiConstants.BYTES, "offset", "littleUnsignedShort", "bitString", "", "byte", "bitStringToByte", "bits", "byteToHexString", "uploadFrame", "lenValue", "deletePathPayload", "path", "rev", "fileType", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProtocolBytes {
    public static final byte CTRL = 3;
    public static final byte SOF = -81;
    public static final ProtocolBytes INSTANCE = new ProtocolBytes();
    private static final int[] crc16Tab = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935, 4657, 528, 12915, 8786, 21173, 17044, 29431, 25302, 37689, 33560, 45947, 41818, 54205, 50076, 62463, 58334, 9314, 13379, 1056, 5121, 25830, 29895, 17572, 21637, 42346, 46411, 34088, 38153, 58862, 62927, 50604, 54669, 13907, 9842, 5649, 1584, 30423, 26358, 22165, 18100, 46939, 42874, 38681, 34616, 63455, 59390, 55197, 51132, 18628, 22757, 26758, 30887, TokenTypes.AUTHENTICATION_INFO, 6241, 10242, 14371, 51660, 55789, 59790, 63919, 35144, 39273, 43274, 47403, 23285, 19156, 31415, 27286, 6769, 2640, 14899, 10770, 56317, 52188, 64447, 60318, 39801, 35672, 47931, 43802, 27814, 31879, 19684, 23749, 11298, 15363, 3168, 7233, 60846, 64911, 52716, 56781, 44330, 48395, 36200, 40265, 32407, 28342, 24277, 20212, 15891, 11826, 7761, 3696, 65439, 61374, 57309, 53244, 48923, 44858, 40793, 36728, 37256, 33193, 45514, 41451, 53516, 49453, 61774, 57711, 4224, 161, 12482, 8419, 20484, 16421, 28742, 24679, 33721, 37784, 41979, 46042, 49981, 54044, 58239, 62302, 689, 4752, 8947, RtcEngineEvent.EvtType.EVT_RTC_STATS, 16949, 21012, 25207, 29270, 46570, 42443, 38312, 34185, 62830, 58703, 54572, 50445, 13538, 9411, 5280, 1153, 29798, 25671, 21540, 17413, 42971, 47098, 34713, 38840, 59231, 63358, 50973, 55100, 9939, RtcEngineEvent.EvtType.EVT_VIDEO_RENDERING_TRACING_RESULT, 1681, 5808, 26199, 30326, 17941, 22068, 55628, 51565, 63758, 59695, 39368, 35305, 47498, 43435, 22596, 18533, 30726, 26663, 6336, 2273, 14466, ErrorCode.MSP_ERROR_DB_INVALID_USER, 52093, 56156, 60223, 64286, 35833, 39896, 43963, 48026, 19061, ErrorCode.ERROR_AITALK_RESULT_ERROR, 27191, 31254, GLMapStaticValue.AM_PARAMETERNAME_RENDER_COMPLETE, 6864, 10931, 14994, 64814, 60687, 56684, 52557, 48554, 44427, 40424, 36297, 31782, 27655, 23652, 19525, 15522, 11395, 7392, 3265, 61215, 65342, 53085, 57212, 44955, 49082, 36825, 40952, 28183, 32310, 20053, 24180, 11923, 16050, 3793, 7920};

    private ProtocolBytes() {
    }

    public final byte[] intToLittleBytes(int value) {
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(value).array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public final byte[] shortToLittleBytes(short value) {
        byte[] array = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort(value).array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public static /* synthetic */ int littleInt$default(ProtocolBytes protocolBytes, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return protocolBytes.littleInt(bArr, i);
    }

    public final int littleInt(byte[] bytes, int offset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return ((bytes[offset + 3] & 255) << 24) | (bytes[offset] & 255) | ((bytes[offset + 1] & 255) << 8) | ((bytes[offset + 2] & 255) << 16);
    }

    public static /* synthetic */ int littleUnsignedShort$default(ProtocolBytes protocolBytes, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return protocolBytes.littleUnsignedShort(bArr, i);
    }

    public final int littleUnsignedShort(byte[] bytes, int offset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return ((bytes[offset + 1] & 255) << 8) | (bytes[offset] & 255);
    }

    public final String bitString(byte r4) {
        StringBuilder sb = new StringBuilder(8);
        for (int i = 7; -1 < i; i--) {
            sb.append((r4 >>> i) & 1);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final byte bitStringToByte(String bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        if (bits.length() != 4 && bits.length() != 8) {
            return (byte) 0;
        }
        int parseInt = Integer.parseInt(bits, CharsKt.checkRadix(2));
        return (bits.length() == 8 && bits.charAt(0) == '1') ? (byte) (parseInt + InputDeviceCompat.SOURCE_ANY) : (byte) parseInt;
    }

    public final String byteToHexString(byte r3) {
        String num = Integer.toString(r3 & 255, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return StringsKt.padStart(num, 2, '0');
    }

    public final byte[] uploadFrame(byte[] lenValue) {
        Intrinsics.checkNotNullParameter(lenValue, "lenValue");
        byte[] crc16 = crc16(lenValue);
        byte[] shortToLittleBytes = shortToLittleBytes((short) (lenValue.length + crc16.length));
        int length = lenValue.length + 4 + crc16.length;
        byte[] bArr = new byte[length];
        bArr[0] = SOF;
        bArr[1] = 3;
        System.arraycopy(shortToLittleBytes, 0, bArr, 2, shortToLittleBytes.length);
        System.arraycopy(lenValue, 0, bArr, 4, lenValue.length);
        System.arraycopy(crc16, 0, bArr, length - crc16.length, crc16.length);
        return bArr;
    }

    public final byte[] deletePathPayload(String path, byte rev, byte fileType) {
        Intrinsics.checkNotNullParameter(path, "path");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = path.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        byte[] array = ByteBuffer.allocate(length + 5).order(ByteOrder.LITTLE_ENDIAN).putShort((short) (length + 1)).put(rev).put(fileType).put(bytes).put((byte) 0).array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public final byte[] crc16(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = 0;
        for (byte b : data) {
            i = crc16Tab[((i >>> 8) ^ b) & 255] ^ (i << 8);
        }
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >>> 8)};
    }
}
