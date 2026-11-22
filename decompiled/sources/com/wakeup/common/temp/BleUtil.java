package com.wakeup.common.temp;

import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import androidx.media3.session.CommandButton;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.blankj.utilcode.util.ArrayUtils;
import com.blankj.utilcode.util.CloseUtils;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.FileUtils;
import com.wakeup.common.utils.HexUtils;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import io.livekit.android.room.RTCEngine;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: classes2.dex */
public class BleUtil {
    private static final int DEFAULT_PACKET_SIZE = 20;
    private static final String TAG = "BleUtil";
    private static int[] CRC_TABLE = {0, 49345, 49537, 320, 49921, 960, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, 2560, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, BmLocated.HALF_LEFT_TOP, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, RTCEngine.MAX_DATA_PACKET_SIZE, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, ErrorCode.MSP_ERROR_AUTH_NO_LICENSE, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, CommandButton.ICON_REPEAT_ONE, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, PcmAudioUtil.PCM_BYTES_PER_SEC, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, Imgcodecs.IMWRITE_TIFF_COMPRESSION_IT8MP, 16448};
    private static final char[] DIGITS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String subString(String content) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = content.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            String substring = content.substring(i, i2);
            if (stringBuffer.toString().getBytes().length + substring.getBytes().length <= 321) {
                stringBuffer.append(substring);
                i = i2;
            } else {
                stringBuffer.append("...");
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static int getAge(Date birthDay) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.before(birthDay)) {
            return 0;
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(birthDay);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = i - i4;
        return i2 <= i5 ? (i2 != i5 || i3 < calendar.get(5)) ? i6 - 1 : i6 : i6;
    }

    public static byte[] hexTobytes(String hex) {
        int i = 0;
        if (hex.length() < 1) {
            return new byte[0];
        }
        byte[] bArr = new byte[hex.length() / 2];
        int i2 = 0;
        while (i < hex.length()) {
            int i3 = i + 2;
            bArr[i2] = (byte) Integer.parseInt(hex.substring(i, i3), 16);
            i2++;
            i = i3;
        }
        return bArr;
    }

    public static String bytesToHexStr(byte[] bytes) {
        StringBuilder sb = new StringBuilder("");
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        for (byte b : bytes) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(" 0" + hexString);
            } else {
                sb.append(" " + hexString);
            }
        }
        return sb.toString();
    }

    public static String byteToBit(byte b) {
        StringBuilder sb = new StringBuilder();
        sb.append((b >> 7) & 1);
        sb.append((b >> 6) & 1);
        sb.append((b >> 5) & 1);
        sb.append((b >> 4) & 1);
        sb.append((b >> 3) & 1);
        sb.append((b >> 2) & 1);
        sb.append((b >> 1) & 1);
        sb.append(b & 1);
        return sb.toString();
    }

    public static List<Integer> bytesToArrayList(byte[] bytes) {
        ArrayList arrayList = new ArrayList();
        for (byte b : bytes) {
            arrayList.add(Integer.valueOf(b & 255));
        }
        return arrayList;
    }

    public static short byte2Short(byte[] buf) {
        if (buf == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (buf.length > 2) {
            throw new IllegalArgumentException("byte array size > 2 !");
        }
        short s = 0;
        for (byte b : buf) {
            s = (short) (((short) (s << 8)) | (b & 255));
        }
        return s;
    }

    public static long byte2Long(byte[] buf) {
        if (buf == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        long j = 0;
        for (byte b : buf) {
            j = (j << 8) | (b & 255);
        }
        return j;
    }

    public static byte[] subBytes(byte[] bytes, int begin, int length) {
        if (length <= 0) {
            length = bytes.length;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(bytes, begin, bArr, 0, length);
        return bArr;
    }

    public static int crcTable(byte[] bytes) {
        int i = 65535;
        for (byte b : bytes) {
            i = CRC_TABLE[(i ^ b) & 255] ^ (i >>> 8);
        }
        return i;
    }

    public static int crcFile(File file) {
        int i = 65535;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 524288);
            try {
                try {
                    byte[] bArr = new byte[524288];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 524288);
                        if (read == -1) {
                            break;
                        }
                        for (int i2 = 0; i2 < read; i2++) {
                            i = CRC_TABLE[(bArr[i2] ^ i) & 255] ^ (i >>> 8);
                        }
                    }
                    CloseUtils.closeIO(bufferedInputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                    CloseUtils.closeIO(bufferedInputStream);
                }
            } catch (Throwable th) {
                CloseUtils.closeIO(bufferedInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return i;
    }

    public static int crcFiles(List<File> files) {
        Iterator<File> it = files.iterator();
        int i = 65535;
        while (it.hasNext()) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(it.next()), 524288);
                try {
                    try {
                        byte[] bArr = new byte[524288];
                        while (true) {
                            int read = bufferedInputStream.read(bArr, 0, 524288);
                            if (read == -1) {
                                break;
                            }
                            for (int i2 = 0; i2 < read; i2++) {
                                i = CRC_TABLE[(bArr[i2] ^ i) & 255] ^ (i >>> 8);
                            }
                        }
                        CloseUtils.closeIO(bufferedInputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                        CloseUtils.closeIO(bufferedInputStream);
                    }
                } catch (Throwable th) {
                    CloseUtils.closeIO(bufferedInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return i;
    }

    public static int crcFilePath(String path) {
        return crcFile(new File(path));
    }

    public static byte[] addBytes(byte[] array1, byte[] array2) {
        if (array1 == null && array2 == null) {
            return new byte[0];
        }
        if (array1 == null) {
            return array2;
        }
        if (array2 == null) {
            return array1;
        }
        byte[] bArr = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, bArr, 0, array1.length);
        System.arraycopy(array2, 0, bArr, array1.length, array2.length);
        return bArr;
    }

    public static int hex2Ten(String hex) {
        if (TextUtils.isEmpty(hex)) {
            return 0;
        }
        return Integer.valueOf(hex, 16).intValue();
    }

    public static byte bit2Byte(String bitStr) {
        int parseInt;
        if (bitStr == null) {
            return (byte) 0;
        }
        int length = bitStr.length();
        if (length != 4 && length != 8) {
            return (byte) 0;
        }
        if (length == 8) {
            if (bitStr.charAt(0) == '0') {
                parseInt = Integer.parseInt(bitStr, 2);
            } else {
                parseInt = Integer.parseInt(bitStr, 2) + InputDeviceCompat.SOURCE_ANY;
            }
        } else {
            parseInt = Integer.parseInt(bitStr, 2);
        }
        return (byte) parseInt;
    }

    public static String toHex(String str) {
        byte[] bytes = str.getBytes();
        char[] cArr = new char[bytes.length << 1];
        int i = 0;
        for (byte b : bytes) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS_HEX;
            cArr[i] = cArr2[(b & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String toUnicode(String str) {
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String hexString = Integer.toHexString(charAt >>> '\b');
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
            String hexString2 = Integer.toHexString(charAt & 255);
            if (hexString2.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString2);
        }
        return new String(stringBuffer);
    }

    public static int byteArrayToInt(byte[] bytes) {
        return (bytes[3] & 255) | ((bytes[0] & 255) << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8);
    }

    public static Long byteArrayToLong(byte[] bytes) {
        return Long.valueOf(((bytes[0] & 255) << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8) | (bytes[3] & 255));
    }

    public static int byteArrayToIntX(byte[] bytes) {
        String[] split = bytesToHexStr(bytes).split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        ArrayUtils.reverse(split);
        for (String str : split) {
            stringBuffer.append(str);
        }
        return byteArrayToInt(hexTobytes(stringBuffer.toString()));
    }

    public static byte[] longToBytes(long value) {
        return ByteBuffer.allocate(8).putLong(value).array();
    }

    public static String computeBtMac(String mac) {
        String str = "";
        try {
            String[] split = mac.split(":");
            String intToHex = HexUtils.intToHex(byte2Short(HexUtils.toByteArray(split[split.length - 1])) ^ 85);
            if (intToHex.length() == 1) {
                intToHex = "0" + intToHex;
            }
            LogUtils.i(TAG, "computeBtMac: " + intToHex);
            split[split.length - 1] = intToHex;
            for (int i = 0; i < split.length; i++) {
                str = str + split[i];
                if (i < split.length - 1) {
                    str = str + ":";
                }
            }
        } catch (Exception unused) {
            LogUtils.i(TAG, "computeBtMac error");
        }
        LogUtils.i(TAG, "newMac: " + str);
        return str;
    }

    public static byte[] handleMessageBytes(byte[] bytes) {
        return handleMessageBytes(bytes, 20);
    }

    public static byte[] handleMessageBytes(byte[] bytes, int mtu) {
        if (bytes != null && bytes.length != 0) {
            if (mtu <= 1) {
                mtu = 20;
            }
            List<Integer> bytesToArrayList = bytesToArrayList(bytes);
            if ((bytesToArrayList.get(0).intValue() == 171 || bytesToArrayList.get(0).intValue() == 234 || bytesToArrayList.get(0).intValue() == 196) && bytes.length > mtu) {
                int i = mtu - 1;
                int length = (((bytes.length - mtu) + i) - 1) / i;
                byte[] bArr = new byte[bytes.length + length];
                System.arraycopy(bytes, 0, bArr, 0, mtu);
                int i2 = mtu;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = (i3 * i) + mtu;
                    int min = Math.min(i, bytes.length - i4);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) i3;
                    System.arraycopy(bytes, i4, bArr, i5, min);
                    i2 = i5 + min;
                }
                return bArr;
            }
        }
        return bytes;
    }

    public static Queue<byte[]> splitByte(byte[] data, int count) {
        int round;
        byte[] bArr;
        if (count > 20) {
            LogUtils.w(TAG, "Be careful: split count beyond 20! Ensure MTU higher than 23!");
        }
        LinkedList linkedList = new LinkedList();
        if (data.length % count == 0) {
            round = data.length / count;
        } else {
            round = Math.round((data.length / count) + 1);
        }
        if (round > 0) {
            for (int i = 0; i < round; i++) {
                if (round == 1 || i == round - 1) {
                    int length = data.length % count == 0 ? count : data.length % count;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(data, i * count, bArr2, 0, length);
                    bArr = bArr2;
                } else {
                    bArr = new byte[count];
                    System.arraycopy(data, i * count, bArr, 0, count);
                }
                linkedList.offer(bArr);
            }
        }
        return linkedList;
    }

    public static int bytesToInt(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return 0;
        }
        if (bytes.length > 4) {
            return Integer.MAX_VALUE;
        }
        int i = 0;
        for (byte b : bytes) {
            i = (i << 8) | (b & 255);
        }
        return i;
    }

    public static List<byte[]> sub1024(String path) throws Exception {
        byte[] fileToByte = FileUtils.fileToByte(path);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < fileToByte.length) {
            int length = i + 1024 > fileToByte.length ? fileToByte.length - i : 1024;
            arrayList.add(subBytes(fileToByte, i, length));
            i += length;
        }
        return arrayList;
    }

    public static byte[] subMtu(int mtu, byte[] byte1024) {
        byte[] bArr = {ProtocolBytes.SOF};
        byte[] bArr2 = new byte[0];
        int i = 0;
        int i2 = 0;
        while (i < byte1024.length) {
            byte[] short2byte = short2byte((short) i2);
            int i3 = mtu - 5;
            if (i + i3 > byte1024.length) {
                i3 = byte1024.length - i;
            }
            if (i < 0) {
                i = 0;
            }
            byte[] subBytes = subBytes(byte1024, i, i3);
            bArr2 = addBytes(addBytes(addBytes(addBytes(bArr2, bArr), short2byte((short) (subBytes.length + 5))), short2byte), subBytes);
            i += i3;
            i2++;
        }
        return bArr2;
    }

    public static byte[] intToBytes(int value) {
        return new byte[]{(byte) ((value >> 24) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 8) & 255), (byte) (value & 255)};
    }

    public static byte[] longToBytes2(long value) {
        return new byte[]{(byte) ((value >> 24) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 8) & 255), (byte) (value & 255)};
    }

    public static byte[] short2byte(short s) {
        byte[] bArr = new byte[2];
        int i = 0;
        while (i < 2) {
            int i2 = i + 1;
            bArr[i] = (byte) ((s >> (16 - (i2 * 8))) & 255);
            i = i2;
        }
        return bArr;
    }

    public static double bytesToDouble(byte[] bytes) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j |= (bytes[i] & 255) << (i * 8);
        }
        return Double.longBitsToDouble(j);
    }

    public static byte[] doubleToBytes(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((doubleToRawLongBits >> (i * 8)) & 255);
        }
        return bArr;
    }
}
