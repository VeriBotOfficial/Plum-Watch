package com.bytedance.adsdk.ugeno.sg;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes13.dex */
public class fxn {

    /* renamed from: com.bytedance.adsdk.ugeno.sg.fxn$fxn, reason: collision with other inner class name */
    public static class C0463fxn {
        public GradientDrawable.Orientation fxn;
        public float[] gff;
        public int[] kg;
    }

    public static int fxn(String str) {
        return fxn(str, -16777216);
    }

    public static int fxn(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i2 = 1; i2 < charArray.length; i2++) {
                    sb.append(charArray[i2]).append(charArray[i2]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] split = str.substring(str.indexOf(Separators.LPAREN) + 1, str.indexOf(Separators.RPAREN)).split(",");
            if (split != null && split.length == 4) {
                return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
            }
        }
        return i;
    }

    public static C0463fxn kg(String str) {
        int indexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String substring = str.substring(str.indexOf(Separators.LPAREN) + 1, str.lastIndexOf(Separators.RPAREN));
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            int fxn = fxn(substring, '%');
            int indexOf2 = substring.indexOf(",");
            String substring2 = substring.substring(0, indexOf2);
            C0463fxn c0463fxn = new C0463fxn();
            c0463fxn.fxn = hm(substring2);
            String substring3 = substring.substring(indexOf2 + 1);
            int[] iArr = new int[fxn];
            float[] fArr = new float[fxn];
            for (int i = 0; i < fxn; i++) {
                int indexOf3 = substring3.indexOf(Separators.PERCENT);
                String trim = substring3.substring(0, indexOf3 + 1).trim();
                if (trim.contains("rgba")) {
                    indexOf = trim.indexOf(Separators.RPAREN);
                } else {
                    indexOf = trim.indexOf(" ");
                }
                int i2 = indexOf + 1;
                iArr[i] = fxn(trim.substring(0, i2).trim());
                fArr[i] = gff.fxn(trim.substring(i2, trim.indexOf(Separators.PERCENT)).trim(), 0.0f) / 100.0f;
                int i3 = indexOf3 + 2;
                if (substring3.length() <= i3) {
                    break;
                }
                substring3 = substring3.substring(i3);
            }
            if (fxn < 2) {
                return null;
            }
            c0463fxn.kg = iArr;
            c0463fxn.gff = fArr;
            return c0463fxn;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int fxn(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    public static boolean gff(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation hm(String str) {
        int parseInt;
        try {
            if (str.contains("deg")) {
                parseInt = Integer.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                parseInt = Integer.parseInt(str);
            }
            if (parseInt == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (parseInt == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (parseInt == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int fxn(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & 16777215) | (i2 << 24);
    }
}
