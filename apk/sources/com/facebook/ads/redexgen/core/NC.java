package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NC {
    public static byte[] A01;
    public static final /* synthetic */ NC[] A02;
    public static final NC A03;
    public static final NC A04;
    public static final NC A05;
    public final String A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, ProtocolBytes.SOF, -79, -92, -94, OtaCommandGenerator.CMD_OTA_INFO, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 101);
        A05 = new NC(strA01, 0, strA01);
        String strA02 = A01(13, 14, 98);
        A04 = new NC(strA02, 1, strA02);
        String strA03 = A01(0, 13, 12);
        A03 = new NC(strA03, 2, strA03);
        A02 = A03();
    }

    public NC(String str, int r2, String str2) {
        super(str, r2);
        this.A00 = str2;
    }

    public static NC A00(String str) {
        for (NC nc : values()) {
            if (nc.A00.equalsIgnoreCase(str)) {
                return nc;
            }
        }
        return A03;
    }

    public static /* synthetic */ NC[] A03() {
        return new NC[]{A05, A04, A03};
    }

    public static NC valueOf(String str) {
        return (NC) Enum.valueOf(NC.class, str);
    }

    public static NC[] values() {
        return (NC[]) A02.clone();
    }
}
