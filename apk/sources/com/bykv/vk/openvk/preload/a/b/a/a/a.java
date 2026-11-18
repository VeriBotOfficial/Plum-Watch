package com.bykv.vk.openvk.preload.a.b.a.a;

import android.gov.nist.core.Separators;
import com.yandex.div2.PhoneMasks;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ISO8601Utils.java */
/* JADX INFO: loaded from: classes15.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f9094a = TimeZone.getTimeZone("UTC");

    public static Date a(String str, ParsePosition parsePosition) throws ParseException {
        int r0;
        int r9;
        int r13;
        int r15;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int r3 = index + 4;
            int r4 = a(str, index, r3);
            if (a(str, r3, '-')) {
                r3 = index + 5;
            }
            int r1 = r3 + 2;
            int r6 = a(str, r3, r1);
            if (a(str, r1, '-')) {
                r1 = r3 + 3;
            }
            int r5 = r1 + 2;
            int r8 = a(str, r1, r5);
            boolean zA = a(str, r5, 'T');
            if (!zA && str.length() <= r5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(r4, r6 - 1, r8);
                parsePosition.setIndex(r5);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int r10 = r1 + 5;
                int r7 = a(str, r1 + 3, r10);
                if (a(str, r10, AbstractJsonLexerKt.COLON)) {
                    r10 = r1 + 6;
                }
                int r2 = r10 + 2;
                int r16 = a(str, r10, r2);
                if (a(str, r2, AbstractJsonLexerKt.COLON)) {
                    r2 = r10 + 3;
                }
                if (str.length() <= r2 || (cCharAt = str.charAt(r2)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    r9 = r16;
                    r13 = 0;
                    r15 = 0;
                    r5 = r2;
                    r0 = r7;
                } else {
                    int r11 = r2 + 2;
                    r15 = a(str, r2, r11);
                    if (r15 > 59 && r15 < 63) {
                        r15 = 59;
                    }
                    if (a(str, r11, '.')) {
                        int r12 = r2 + 3;
                        int r14 = a(str, r2 + 4);
                        int r17 = Math.min(r14, r2 + 6);
                        int r18 = a(str, r12, r17);
                        int r19 = r17 - r12;
                        if (r19 == 1) {
                            r18 *= 100;
                        } else if (r19 == 2) {
                            r18 *= 10;
                        }
                        r0 = r7;
                        r5 = r14;
                        r9 = r16;
                        r13 = r18;
                    } else {
                        r0 = r7;
                        r5 = r11;
                        r9 = r16;
                        r13 = 0;
                    }
                }
            } else {
                r0 = 0;
                r9 = 0;
                r13 = 0;
                r15 = 0;
            }
            if (str.length() <= r5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(r5);
            if (cCharAt2 == 'Z') {
                timeZone = f9094a;
                length = r5 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + Separators.QUOTE);
                }
                String strSubstring = str.substring(r5);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + PhoneMasks.EXTRA_NUMBERS;
                }
                length = r5 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f9094a;
                } else {
                    String strConcat = "GMT".concat(String.valueOf(strSubstring));
                    TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                    String str2 = timeZone2.getID();
                    if (!str2.equals(strConcat) && !str2.replace(":", "").equals(strConcat)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, r4);
            gregorianCalendar2.set(2, r6 - 1);
            gregorianCalendar2.set(5, r8);
            gregorianCalendar2.set(11, r0);
            gregorianCalendar2.set(12, r9);
            gregorianCalendar2.set(13, r15);
            gregorianCalendar2.set(14, r13);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException e) {
            String str3 = str == null ? null : "\"" + str + '\"';
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean a(String str, int r2, char c) {
        return r2 < str.length() && str.charAt(r2) == c;
    }

    private static int a(String str, int r6, int r7) throws NumberFormatException {
        int r3;
        int r2;
        if (r6 < 0 || r7 > str.length() || r6 > r7) {
            throw new NumberFormatException(str);
        }
        if (r6 < r7) {
            r2 = r6 + 1;
            int r4 = Character.digit(str.charAt(r6), 10);
            if (r4 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(r6, r7));
            }
            r3 = -r4;
        } else {
            r3 = 0;
            r2 = r6;
        }
        while (r2 < r7) {
            int r5 = r2 + 1;
            int r8 = Character.digit(str.charAt(r2), 10);
            if (r8 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(r6, r7));
            }
            r3 = (r3 * 10) - r8;
            r2 = r5;
        }
        return -r3;
    }

    private static int a(String str, int r3) {
        while (r3 < str.length()) {
            char cCharAt = str.charAt(r3);
            if (cCharAt < '0' || cCharAt > '9') {
                return r3;
            }
            r3++;
        }
        return str.length();
    }
}
