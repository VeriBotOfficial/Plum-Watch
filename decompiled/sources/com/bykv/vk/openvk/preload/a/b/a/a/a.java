package com.bykv.vk.openvk.preload.a.b.a.a;

import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f9092a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[Catch: IllegalArgumentException -> 0x01ba, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, IndexOutOfBoundsException -> 0x01be, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:42:0x00ce, B:44:0x00d4, B:46:0x00da, B:47:0x0181, B:52:0x00e4, B:53:0x00fe, B:54:0x00ff, B:57:0x011d, B:59:0x012a, B:62:0x0133, B:64:0x014b, B:67:0x015a, B:68:0x017c, B:70:0x017f, B:71:0x010a, B:72:0x01b2, B:73:0x01b9, B:74:0x00b2, B:75:0x00b5), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2 A[Catch: IllegalArgumentException -> 0x01ba, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, IndexOutOfBoundsException -> 0x01be, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bc, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:42:0x00ce, B:44:0x00d4, B:46:0x00da, B:47:0x0181, B:52:0x00e4, B:53:0x00fe, B:54:0x00ff, B:57:0x011d, B:59:0x012a, B:62:0x0133, B:64:0x014b, B:67:0x015a, B:68:0x017c, B:70:0x017f, B:71:0x010a, B:72:0x01b2, B:73:0x01b9, B:74:0x00b2, B:75:0x00b5), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
