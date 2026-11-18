package com.amap.api.col.p0003sl;

import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: compiled from: RandomUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class p4 {
    public static String a() {
        Random random = new Random();
        int r2 = random.nextInt(10);
        Locale locale = Locale.US;
        String str = String.format(locale, "%05d", Integer.valueOf(r2));
        int r1 = random.nextInt(10);
        int r0 = random.nextInt(100);
        return new a("0123456789", r0).a(r1, str) + String.format(locale, "%01d", Integer.valueOf(r1)) + String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(r0));
    }

    /* JADX INFO: compiled from: RandomUtil.java */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1827a;

        public a(String str, int r3) {
            this.f1827a = a(str, r3, str.length());
        }

        public int a(int r5) {
            return (int) (((((long) r5) * ((long) 1103515245)) + ((long) 12345)) & 2147483647L);
        }

        public String a(String str, int r8, int r9) {
            StringBuffer stringBuffer = new StringBuffer(str);
            int length = str.length();
            for (int r1 = 0; r1 < r9; r1++) {
                int r10 = a(r8);
                int r2 = r10 % length;
                r8 = a(r10);
                int r3 = r8 % length;
                char cCharAt = stringBuffer.charAt(r2);
                stringBuffer.setCharAt(r2, stringBuffer.charAt(r3));
                stringBuffer.setCharAt(r3, cCharAt);
            }
            return stringBuffer.toString();
        }

        public String a(int r7, String str) {
            StringBuilder sb = new StringBuilder();
            int length = this.f1827a.length();
            int length2 = str.length();
            for (int r3 = 0; r3 < length2; r3++) {
                char cCharAt = str.charAt(r3);
                this.f1827a.length();
                int r4 = this.f1827a.indexOf(cCharAt);
                if (r4 < 0) {
                    break;
                }
                this.f1827a.length();
                sb.append(this.f1827a.charAt(((r4 + r7) + r3) % length));
            }
            if (sb.length() == length2) {
                return sb.toString();
            }
            return null;
        }
    }
}
