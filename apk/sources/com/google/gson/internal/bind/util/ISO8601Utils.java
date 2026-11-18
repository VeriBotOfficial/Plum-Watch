package com.google.gson.internal.bind.util;

import android.gov.nist.core.Separators;
import com.anythink.expressad.foundation.g.a;
import com.yandex.div2.PhoneMasks;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private ISO8601Utils() {
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder("yyyy-MM-ddThh:mm:ss".length() + (z ? ".sss".length() : 0) + (timeZone.getRawOffset() == 0 ? "Z" : "+hh:mm").length());
        padInt(sb, gregorianCalendar.get(1), "yyyy".length());
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, "MM".length());
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), "dd".length());
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), "hh".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), "mm".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), a.ag.length());
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), "sss".length());
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int r10 = offset / 60000;
            int r0 = Math.abs(r10 / 60);
            int r11 = Math.abs(r10 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, r0, "hh".length());
            sb.append(AbstractJsonLexerKt.COLON);
            padInt(sb, r11, "mm".length());
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        int r5;
        int r8;
        int r10;
        int r12;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int r6 = index + 4;
            int r7 = parseInt(str, index, r6);
            if (checkOffset(str, r6, '-')) {
                r6 = index + 5;
            }
            int r9 = r6 + 2;
            int r11 = parseInt(str, r6, r9);
            if (checkOffset(str, r9, '-')) {
                r9 = r6 + 3;
            }
            int r13 = r9 + 2;
            int r14 = parseInt(str, r9, r13);
            boolean zCheckOffset = checkOffset(str, r13, 'T');
            if (!zCheckOffset && str.length() <= r13) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(r7, r11 - 1, r14);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(r13);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int r15 = r9 + 5;
                int r16 = parseInt(str, r9 + 3, r15);
                if (checkOffset(str, r15, AbstractJsonLexerKt.COLON)) {
                    r15 = r9 + 6;
                }
                int r17 = r15 + 2;
                int r18 = parseInt(str, r15, r17);
                if (checkOffset(str, r17, AbstractJsonLexerKt.COLON)) {
                    r17 = r15 + 3;
                }
                if (str.length() <= r17 || (cCharAt = str.charAt(r17)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    r8 = r18;
                    r10 = 0;
                    r12 = 0;
                    r13 = r17;
                    r5 = r16;
                } else {
                    int r19 = r17 + 2;
                    r12 = parseInt(str, r17, r19);
                    if (r12 > 59 && r12 < 63) {
                        r12 = 59;
                    }
                    if (checkOffset(str, r19, '.')) {
                        int r20 = r17 + 3;
                        int r110 = indexOfNonDigit(str, r17 + 4);
                        int r21 = Math.min(r110, r17 + 6);
                        int r111 = parseInt(str, r20, r21);
                        int r22 = r21 - r20;
                        if (r22 == 1) {
                            r111 *= 100;
                        } else if (r22 == 2) {
                            r111 *= 10;
                        }
                        r5 = r16;
                        r13 = r110;
                        r8 = r18;
                        r10 = r111;
                    } else {
                        r5 = r16;
                        r13 = r19;
                        r8 = r18;
                        r10 = 0;
                    }
                }
            } else {
                r5 = 0;
                r8 = 0;
                r10 = 0;
                r12 = 0;
            }
            if (str.length() <= r13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(r13);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = r13 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + Separators.QUOTE);
                }
                String strSubstring = str.substring(r13);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + PhoneMasks.EXTRA_NUMBERS;
                }
                length = r13 + strSubstring.length();
                if (strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    String str2 = "GMT" + strSubstring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                    String str3 = timeZone2.getID();
                    if (!str3.equals(str2) && !str3.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, r7);
            gregorianCalendar2.set(2, r11 - 1);
            gregorianCalendar2.set(5, r14);
            gregorianCalendar2.set(11, r5);
            gregorianCalendar2.set(12, r8);
            gregorianCalendar2.set(13, r12);
            gregorianCalendar2.set(14, r10);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            String str4 = str == null ? null : "\"" + str + '\"';
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str4 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean checkOffset(String str, int r2, char c) {
        return r2 < str.length() && str.charAt(r2) == c;
    }

    private static int parseInt(String str, int r6, int r7) throws NumberFormatException {
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

    private static void padInt(StringBuilder sb, int r2, int r3) {
        String string = Integer.toString(r2);
        for (int length = r3 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int indexOfNonDigit(String str, int r3) {
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
