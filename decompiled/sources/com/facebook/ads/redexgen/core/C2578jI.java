package com.facebook.ads.redexgen.core;

import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.jI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2578jI {
    public static byte[] A03;
    public File A00;
    public RandomAccessFile A01;
    public final L0 A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-90, -25, -7, -90, -22, -17, -7, -23, -90, -23, -25, -23, -18, -21, OtaCommandGenerator.CMD_NOTIFY_STATUS, -42, -33, -30, OtaCommandGenerator.CMD_NOTIFY_STATUS, -45, -33, -35, -32, -36, TransmissionUnpacked.HD_VAL_MAGIC_LB, -28, -39, -33, -34, OtaCommandGenerator.CMD_GET_INFO, -33, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, -33, 34, BuiltinOptions.LessEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 35, -32, -44, BuiltinOptions.ArgMaxOptions, 35, -44, -50, 4, 15, 23, 14, 12, 15, 1, 4, -62, -32, -19, -90, -13, -97, -30, -21, -28, -32, -19, -97, -27, -24, -21, -28, -51, -6, -6, -9, -6, -88, -23, -8, -8, -19, -10, -20, -88, -21, -23, -21, TransmissionUnpacked.HD_VAL_MAGIC_HB, -19, -62, -88, -21, -23, -21, TransmissionUnpacked.HD_VAL_MAGIC_HB, -19, -88, -18, -15, -12, -19, -88, -29, 16, 16, 13, 16, -66, 1, 10, 13, 17, 7, 12, 5, -66, 4, 7, 10, 3, -66, -72, -27, -27, -30, -27, -109, -30, -29, -40, -31, -36, -31, -38, -109, -44, 1, 1, -2, 1, ProtocolBytes.SOF, 1, -12, TransmissionUnpacked.HD_VAL_MAGIC_HB, -13, -8, -3, -10, ProtocolBytes.SOF, -5, -12, -3, -10, 3, -9, ProtocolBytes.SOF, -2, -11, ProtocolBytes.SOF, -11, -8, -5, -12, ProtocolBytes.SOF, -119, -74, -74, -77, -74, BuiltinOptions.SegmentSumOptions, -74, -87, -78, -91, -79, -83, -78, -85, BuiltinOptions.SegmentSumOptions, -86, -83, -80, -87, BuiltinOptions.SegmentSumOptions, PSSSigner.TRAILER_IMPLICIT, -23, -23, -26, -23, -105, -20, -22, -32, -27, -34, -105, -35, -32, -29, -36, -105, -50, -5, -5, -8, -5, -87, 0, -5, -14, -3, -14, -9, TransmissionUnpacked.HD_VAL_MAGIC_HB, -87, -82, -19, -87, -21, 2, -3, -18, -4, -87, -3, -8, -87, -82, -4, -87, -17, -5, -8, -10, -87, -21, -2, -17, -17, -18, -5, -87, 0, -14, -3, -15, -87, -4, -14, 3, -18, -87, -82, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -11, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07() throws C2574jE {
        if (A09()) {
            return;
        }
        A06();
        File file = new File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(48, 9, 95).length()));
        if (!this.A00.renameTo(file)) {
            throw new C2574jE(A00(Opcodes.IF_ACMPNE, 20, 3) + this.A00 + A00(44, 4, 115) + file + A00(14, 16, 47));
        }
        this.A00 = file;
        try {
            this.A01 = new RandomAccessFile(this.A00, A00(256, 1, 61));
        } catch (IOException e) {
            throw new C2574jE(A00(123, 14, 50) + this.A00 + A00(0, 14, 69), e);
        }
    }

    public C2578jI(File file, L0 l0) throws C2574jE {
        try {
            if (l0 != null) {
                this.A02 = l0;
                File directory = file.getParentFile();
                L3.A06(directory);
                boolean exists = file.exists();
                this.A00 = exists ? file : new File(file.getParentFile(), file.getName() + A00(48, 9, 95));
                this.A01 = new RandomAccessFile(this.A00, exists ? A00(256, 1, 61) : A00(257, 2, 66));
                return;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new C2574jE(A00(DeviceFeatures.CONFIG_SLEEP, 17, 54) + file + A00(0, 14, 69), e);
        }
    }

    private boolean A02(File file) {
        return file.getName().endsWith(A00(48, 9, 95));
    }

    public final synchronized int A03() throws C2574jE {
        try {
        } catch (IOException e) {
            throw new C2574jE(A00(137, 29, 78) + this.A00, e);
        }
        return (int) this.A01.length();
    }

    public final File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws C2574jE {
        try {
            this.A01.setLength(0L);
        } catch (IOException e) {
            throw new C2574jE(A00(57, 16, 62), e);
        }
    }

    public final synchronized void A06() throws C2574jE {
        try {
            this.A01.close();
            this.A02.AJg(this.A00);
        } catch (IOException e) {
            throw new C2574jE(A00(104, 19, 93) + this.A00, e);
        }
    }

    public final synchronized void A08(byte[] bArr, int i) throws C2574jE {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i);
            } else {
                throw new C2574jE(A00(73, 31, 71) + this.A00 + A00(30, 14, 126));
            }
        } catch (IOException e) {
            throw new C2574jE(String.format(Locale.US, A00(203, 53, 72), Integer.valueOf(i), this.A01, Integer.valueOf(bArr.length)), e);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}
