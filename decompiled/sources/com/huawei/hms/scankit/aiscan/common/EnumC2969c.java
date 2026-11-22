package com.huawei.hms.scankit.aiscan.common;

import com.autonavi.aps.amapapi.config.Const;
import com.google.zxing.common.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.CharEncoding;

/* compiled from: CharacterSetECI.java */
/* renamed from: com.huawei.hms.scankit.aiscan.common.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC2969c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, CharEncoding.UTF_16BE, "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, StringUtils.GB2312, "EUC_CN", Const.STR_APS_ENCODE),
    EUC_KR(30, "EUC-KR");

    private static final Map<Integer, EnumC2969c> B = new HashMap();
    private static final Map<String, EnumC2969c> C = new HashMap();
    private final int[] E;
    private final String[] F;

    static {
        for (EnumC2969c enumC2969c : values()) {
            for (int i : enumC2969c.E) {
                B.put(Integer.valueOf(i), enumC2969c);
            }
            C.put(enumC2969c.name(), enumC2969c);
            for (String str : enumC2969c.F) {
                C.put(str, enumC2969c);
            }
        }
    }

    EnumC2969c(int i) {
        this(new int[]{i}, new String[0]);
    }

    public int a() {
        return this.E[0];
    }

    EnumC2969c(int i, String... strArr) {
        this.E = new int[]{i};
        this.F = strArr;
    }

    public static EnumC2969c a(int i) throws C2967a {
        if (i < 0 || i >= 900) {
            throw C2967a.a();
        }
        return B.get(Integer.valueOf(i));
    }

    public static EnumC2969c a(String str) {
        return C.get(str);
    }

    EnumC2969c(int[] iArr, String... strArr) {
        this.E = iArr;
        this.F = strArr;
    }
}
