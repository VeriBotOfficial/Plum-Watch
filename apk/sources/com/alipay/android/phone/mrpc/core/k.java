package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f1281a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");
    private static final Pattern b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1282a;
        public int b;
        public int c;

        public a(int r1, int r2, int r3) {
            this.f1282a = r1;
            this.b = r2;
            this.c = r3;
        }
    }

    public static long a(String str) {
        int r1;
        int r3;
        int r14;
        a aVarE;
        int r10;
        int r11;
        int r12;
        Matcher matcher = f1281a.matcher(str);
        if (matcher.find()) {
            r14 = b(matcher.group(1));
            r1 = c(matcher.group(2));
            r3 = d(matcher.group(3));
            aVarE = e(matcher.group(4));
        } else {
            Matcher matcher2 = b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            r1 = c(matcher2.group(1));
            int r0 = b(matcher2.group(2));
            a aVarE2 = e(matcher2.group(3));
            r3 = d(matcher2.group(4));
            r14 = r0;
            aVarE = aVarE2;
        }
        if (r3 >= 2038) {
            r11 = 0;
            r12 = 2038;
            r10 = 1;
        } else {
            r10 = r14;
            r11 = r1;
            r12 = r3;
        }
        Time time = new Time("UTC");
        time.set(aVarE.c, aVarE.b, aVarE.f1282a, r10, r11, r12);
        return time.toMillis(false);
    }

    private static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    private static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int d(String str) {
        if (str.length() == 2) {
            int r0 = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return r0 >= 70 ? r0 + 1900 : r0 + 2000;
        }
        if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        }
        if (str.length() == 4) {
            return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
        }
        return 1970;
    }

    private static a e(String str) {
        int r0 = str.charAt(0) - '0';
        int r1 = 1;
        if (str.charAt(1) != ':') {
            r0 = (r0 * 10) + (str.charAt(1) - '0');
            r1 = 2;
        }
        return new a(r0, ((str.charAt(r1 + 1) - '0') * 10) + (str.charAt(r1 + 2) - '0'), ((str.charAt(r1 + 4) - '0') * 10) + (str.charAt(r1 + 5) - '0'));
    }
}
