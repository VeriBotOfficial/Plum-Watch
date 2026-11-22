package com.amap.api.col.p0003sl;

import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import java.util.Random;

/* compiled from: RandomUtil.java */
/* loaded from: classes11.dex */
public class p4 {
    public static String a() {
        Random random = new Random();
        int nextInt = random.nextInt(10);
        Locale locale = Locale.US;
        String format = String.format(locale, "%05d", Integer.valueOf(nextInt));
        int nextInt2 = random.nextInt(10);
        int nextInt3 = random.nextInt(100);
        return new a("0123456789", nextInt3).a(nextInt2, format) + String.format(locale, "%01d", Integer.valueOf(nextInt2)) + String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(nextInt3));
    }

    /* compiled from: RandomUtil.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f1827a;

        public a(String str, int i) {
            this.f1827a = a(str, i, str.length());
        }

        public int a(int i) {
            return (int) (((i * 1103515245) + 12345) & 2147483647L);
        }

        public String a(String str, int i, int i2) {
            StringBuffer stringBuffer = new StringBuffer(str);
            int length = str.length();
            for (int i3 = 0; i3 < i2; i3++) {
                int a2 = a(i);
                int i4 = a2 % length;
                i = a(a2);
                int i5 = i % length;
                char charAt = stringBuffer.charAt(i4);
                stringBuffer.setCharAt(i4, stringBuffer.charAt(i5));
                stringBuffer.setCharAt(i5, charAt);
            }
            return stringBuffer.toString();
        }

        public String a(int i, String str) {
            StringBuilder sb = new StringBuilder();
            int length = this.f1827a.length();
            int length2 = str.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char charAt = str.charAt(i2);
                this.f1827a.length();
                int indexOf = this.f1827a.indexOf(charAt);
                if (indexOf < 0) {
                    break;
                }
                this.f1827a.length();
                sb.append(this.f1827a.charAt(((indexOf + i) + i2) % length));
            }
            if (sb.length() == length2) {
                return sb.toString();
            }
            return null;
        }
    }
}
