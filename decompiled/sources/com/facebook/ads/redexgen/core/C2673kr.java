package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.kr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2673kr implements I9 {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public I8 A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<I6> A05 = new ArrayDeque<>();
    public final IE A04 = new IE();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{BuiltinOptions.SelectV2Options, -121, -113, BuiltinOptions.ATan2Options, -123, -126, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.RightShiftOptions, -123, BuiltinOptions.RightShiftOptions, -122, BuiltinOptions.RightShiftOptions, -121, -115, BuiltinOptions.ArgMinOptions, -115, OtaCommandGenerator.CMD_GET_INFO_TLV, -119, BuiltinOptions.RightShiftOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.HardSwishOptions, Byte.MIN_VALUE, -120, BuiltinOptions.BucketizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, -127, BuiltinOptions.BucketizeOptions, -122, BuiltinOptions.SparseToDenseOptions, -123, BuiltinOptions.SignOptions, -116, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SparseToDenseOptions, -78, -41, -33, -54, TransmissionUnpacked.HD_VAL_MAGIC_LB, -46, -51, -119, -46, -41, -35, -50, -48, -50, -37, -119, -36, -46, -29, -50, -93, -119, -61, -28, -30, -39, -34, -41, OtaCommandGenerator.CMD_NOTIFY_STATUS, TransmissionUnpacked.HD_VAL_MAGIC_LB, -36, TransmissionUnpacked.HD_VAL_MAGIC_LB, -35, TransmissionUnpacked.HD_VAL_MAGIC_LB, -34, -28, OtaCommandGenerator.CMD_NOTIFY_STATUS, -29, -39, -22, TransmissionUnpacked.HD_VAL_MAGIC_LB, -86, OtaCommandGenerator.CMD_NOTIFY_STATUS};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC2694lN interfaceC2694lN, int i) throws IOException {
        long A02 = A02(interfaceC2694lN, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC2694lN interfaceC2694lN) throws IOException {
        interfaceC2694lN.AI1();
        while (true) {
            interfaceC2694lN.AG9(this.A06, 0, 4);
            int A00 = IE.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) IE.A01(this.A06, A00, false);
                if (this.A03.AAN(A01)) {
                    interfaceC2694lN.AJJ(A00);
                    return A01;
                }
            }
            interfaceC2694lN.AJJ(1);
        }
    }

    private long A02(InterfaceC2694lN interfaceC2694lN, int i) throws IOException {
        interfaceC2694lN.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    public static String A04(InterfaceC2694lN interfaceC2694lN, int i) throws IOException {
        if (i == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i];
        interfaceC2694lN.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.core.I9
    public final void AA5(I8 i8) {
        this.A03 = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        r12.A03.AJZ(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015b, code lost:
    
        throw com.facebook.ads.redexgen.core.C11732i.A01(A03(63, 21, 97) + r12.A02, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    @Override // com.facebook.ads.redexgen.core.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AGe(com.facebook.ads.redexgen.core.InterfaceC2694lN r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2673kr.AGe(com.facebook.ads.redexgen.X.lN):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.I9
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
