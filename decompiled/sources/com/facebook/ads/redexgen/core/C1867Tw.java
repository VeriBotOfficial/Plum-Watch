package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1867Tw {
    public static byte[] A04;
    public static String[] A05 = {"EPfM4EfRxbpEP9gtrDRMlskxYfXi3EIy", "2RTdQxHpZZ8AiQDKhWe0eMGOKfA6zgcU", "emglrqM7KcB96xrWPAlCT1HSFCX", "BYlHqNK3eo406tIlZNUH5uGyHKGLxPsS", "SGf6K716h04aYOies8bsBexpWYiEkey6", "TSOJfYWCxzAl33AyQiIcTNEFCW2LweGK", "8CMs5hd6IV548hO09SYKxFdjcmyhV", "SdeZw3a81E33UQl"};
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1867Tw A04(File file) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 33));
            if (file.length() < A00()) {
                throw new IOException(String.format(Locale.US, A05(50, 27, 97), Long.valueOf(file.length()), Long.valueOf(A00())));
            }
            long readLong = randomAccessFile.readLong();
            if (readLong != -360011992771067903L) {
                throw new IOException(String.format(Locale.US, A05(180, 27, 45), Long.valueOf(readLong), -360011992771067903L));
            }
            long readLong2 = randomAccessFile.readLong();
            if (A05[4].charAt(13) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "qh47im7POLSb1uwOXceGvb4YvfCz05wk";
            strArr[1] = "3iy4rWBQ3YjawiJr5gwpSuoHtfNura2H";
            if (readLong2 < 0 || readLong2 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                throw new IOException(String.format(Locale.US, A05(77, 40, 27), Long.valueOf(readLong2)));
            }
            if (randomAccessFile.length() < A02((int) readLong2)) {
                throw new IOException(String.format(Locale.US, A05(117, 63, 56), Long.valueOf(readLong2), Long.valueOf(file.length())));
            }
            long[] jArr = new long[(int) readLong2];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = randomAccessFile.readLong();
            }
            return new C1867Tw(randomAccessFile, jArr, randomAccessFile.length());
        } catch (IOException unused) {
            if (0 != 0) {
                A07(null);
            }
            throw new IOException(String.format(Locale.US, A05(26, 24, 114), file.getCanonicalPath()));
        }
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-106, -79, -71, PSSSigner.TRAILER_IMPLICIT, -75, -76, BuiltinOptions.ReadVariableOptions, -60, -65, BuiltinOptions.ReadVariableOptions, -77, -62, -75, -79, -60, -75, BuiltinOptions.ReadVariableOptions, -74, -71, PSSSigner.TRAILER_IMPLICIT, -75, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DynamicUpdateSliceOptions, -61, BuiltinOptions.UnsortedSegmentMaxOptions, -52, -25, -17, -14, -21, -22, -90, -6, -11, -90, -11, -10, -21, -12, -90, -20, -17, -14, -21, -90, -83, -85, -7, -83, -69, -34, -31, -38, -107, -102, -39, -107, -41, -18, -23, -38, -24, -95, -107, -31, -38, -24, -24, -107, -23, -35, -42, -29, -107, -102, -39, BuiltinOptions.DynamicUpdateSliceOptions, -104, -101, -108, BuiltinOptions.SplitVOptions, -109, -108, OtaCommandGenerator.CMD_GET_INFO_TLV, -101, OtaCommandGenerator.CMD_NOTIFY_STATUS, -95, -108, -94, BuiltinOptions.SplitVOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.SplitVOptions, -93, -98, -93, OtaCommandGenerator.CMD_NOTIFY_STATUS, -101, BuiltinOptions.SplitVOptions, -98, -107, BuiltinOptions.SplitVOptions, BuiltinOptions.CosOptions, -109, BuiltinOptions.SplitVOptions, -95, -108, OtaCommandGenerator.CMD_GET_INFO_TLV, -98, -95, -109, BuiltinOptions.SplitVOptions, -94, -101, -98, -93, -94, OtaCommandGenerator.CMD_GET_INFO_TLV, -75, -72, -79, BuiltinOptions.HashtableFindOptions, -80, -79, ProtocolBytes.SOF, -72, -83, -66, -79, -65, BuiltinOptions.HashtableFindOptions, -83, BuiltinOptions.HashtableFindOptions, -64, -69, -64, -83, -72, BuiltinOptions.HashtableFindOptions, -69, -78, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, -80, BuiltinOptions.HashtableFindOptions, -66, -79, ProtocolBytes.SOF, -69, -66, -80, BuiltinOptions.HashtableFindOptions, -65, -72, -69, -64, -65, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableFindOptions, -82, -63, -64, BuiltinOptions.HashtableFindOptions, -69, -70, -72, -59, BuiltinOptions.HashtableFindOptions, -76, -83, -65, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, -80, BuiltinOptions.HashtableFindOptions, -82, -59, -64, -79, -65, -121, -86, -83, -90, BuiltinOptions.ScatterNdOptions, -82, -94, -88, -86, -92, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, -91, BuiltinOptions.ScatterNdOptions, -86, ProtocolBytes.SOF, -76, -75, -90, -94, -91, BuiltinOptions.ScatterNdOptions, -80, -89, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, -91, -78, -59, -61, -49, -46, -60, Byte.MIN_VALUE, -123, -60, Byte.MIN_VALUE, -49, -58, -58, -45, -59, -44, Byte.MIN_VALUE, -55, -45, Byte.MIN_VALUE, -123, -60, -116, Byte.MIN_VALUE, -62, TransmissionUnpacked.HD_VAL_MAGIC_LB, -44, Byte.MIN_VALUE, -46, -59, -61, -49, -46, -60, Byte.MIN_VALUE, -123, -60, Byte.MIN_VALUE, -49, -58, -58, -45, -59, -44, Byte.MIN_VALUE, -55, -45, Byte.MIN_VALUE, -123, -60, -97, -78, -80, PSSSigner.TRAILER_IMPLICIT, -65, -79, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, -79, BuiltinOptions.HashtableImportOptions, PSSSigner.TRAILER_IMPLICIT, -77, -77, -64, -78, -63, BuiltinOptions.HashtableImportOptions, -64, -75, PSSSigner.TRAILER_IMPLICIT, -62, -71, -79, BuiltinOptions.HashtableImportOptions, ProtocolBytes.SOF, -78, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableImportOptions, ProtocolBytes.SOF, -78, -80, -82, -62, -64, -78, BuiltinOptions.HashtableImportOptions, -65, -78, -80, PSSSigner.TRAILER_IMPLICIT, -65, -79, BuiltinOptions.HashtableImportOptions, -80, PSSSigner.TRAILER_IMPLICIT, -62, -69, -63, BuiltinOptions.HashtableImportOptions, -74, -64, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, -79, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableImportOptions, ProtocolBytes.SOF, -62, -63, BuiltinOptions.HashtableImportOptions, -74, -64, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, -79, -37, -18, -20, -8, -5, -19, -87, -82, -19, -87, -4, -3, -22, -5, -3, -4, -87, -22, -3, -87, -8, -17, -17, -4, -18, -3, -87, -82, -19, -75, -87, -21, -2, -3, -87, -17, -14, -11, -18, -87, -4, -14, 3, -18, -87, -14, -4, -87, -82, -19, -63, -44, -46, -34, -31, -45, -113, -97, -113, -34, TransmissionUnpacked.HD_VAL_MAGIC_LB, TransmissionUnpacked.HD_VAL_MAGIC_LB, -30, -44, -29, -113, -44, -25, -33, -44, -46, -29, -44, -45, -113, -48, -29, -113, -108, -45, -113, -47, -28, -29, -113, -40, -30, -113, -48, -29, -113, -108, -45, -89, -84, -88};
    }

    static {
        A06();
    }

    public C1867Tw(RandomAccessFile randomAccessFile, long[] jArr, long j) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j;
        for (int i = 0; i < jArr.length && jArr[i] != 0; i++) {
            this.A00++;
        }
        if (this.A00 > 0) {
            long A01 = A01();
            if (jArr[0] != A01) {
                throw new IOException(String.format(Locale.US, A05(373, 43, 91), Long.valueOf(A01), Long.valueOf(jArr[0])));
            }
        }
        for (int i2 = this.A00; i2 < jArr.length; i2++) {
            if (jArr[i2] != 0) {
                throw new IOException(String.format(Locale.US, A05(257, 66, 57), Integer.valueOf(i2), Integer.valueOf(this.A00), Long.valueOf(jArr[i2])));
            }
        }
        for (int i3 = 1; i3 < this.A00; i3++) {
            if (jArr[i3 - 1] > jArr[i3]) {
                throw new IOException(String.format(Locale.US, A05(207, 50, 76), Integer.valueOf(i3 - 1), Long.valueOf(jArr[i3 - 1]), Integer.valueOf(i3), Long.valueOf(jArr[i3])));
            }
        }
        if (this.A00 > 0 && jArr[this.A00 - 1] > j) {
            throw new IOException(String.format(Locale.US, A05(323, 50, 117), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j)));
        }
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i) {
        return A00() + (i * 8);
    }

    public static C1867Tw A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 33));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C1868Tx.A03);
            randomAccessFile.write(new byte[C1868Tx.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C1867Tw(randomAccessFile, new long[C1868Tx.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 60), file.getCanonicalPath()));
        }
    }

    public static void A07(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
