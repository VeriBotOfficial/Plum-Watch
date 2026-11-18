package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC3044fO {
    public static byte[] A01;
    public static String[] A02 = {"4MR", "ox3", "IUsSI7rcrCx1ERgKd0rYF5wqQshT9MFY", "XMpLbdKCI8ptDt9BVBTjCKDwrbbZ39Yk", "reDnu4iC6gOf", "58W6JAylc1sA", "T5hdxNMEH3a8tXz2YdYKh9bF2ZTD6zRG", "CM8HCV1eVyulF3snUIL5CjajvzNLA86A"};
    public static final /* synthetic */ EnumC3044fO[] A03;
    public static final EnumC3044fO A04;
    public static final EnumC3044fO A05;
    public String A00;

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "zM61rMpjrvDScug74JUjCxPutIg5FxhC";
            strArr2[7] = "TMGBJitMUu1pxt90KbWrvOLR2BVfJ6J0";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] - r6) - 11);
            r7++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-86, -83, -80, -80, -104, -109, -121, -124, -105, -120, -116, -113, OtaCommandGenerator.CMD_GET_INFO_TLV, OtaCommandGenerator.CMD_GET_INFO_TLV, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
        A04 = new EnumC3044fO(A00(0, 4, 89), 0, A00(10, 4, 27));
        A05 = new EnumC3044fO(A00(4, 6, 56), 1, A00(14, 6, 40));
        A03 = A02();
    }

    public EnumC3044fO(String str, int r2, String str2) {
        super(str, r2);
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC3044fO[] A02() {
        EnumC3044fO[] enumC3044fOArr = new EnumC3044fO[2];
        enumC3044fOArr[0] = A04;
        EnumC3044fO enumC3044fO = A05;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[2] = "lJSENTz9psORZi9A2zDcPU2PQxg7yytN";
        enumC3044fOArr[1] = enumC3044fO;
        return enumC3044fOArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC3044fO valueOf(String str) {
        return (EnumC3044fO) Enum.valueOf(EnumC3044fO.class, str);
    }

    public static EnumC3044fO[] values() {
        return (EnumC3044fO[]) A03.clone();
    }
}
