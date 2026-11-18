package com.huawei.secure.android.common.anonymization;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String[] a(String[] strArr, String[] strArr2) {
        if (strArr.length <= 0) {
            return strArr2.length <= 0 ? new String[0] : strArr2;
        }
        if (strArr2.length <= 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String[] b(String str, String[] strArr) {
        return a(new String[]{str}, strArr);
    }

    public static String[] b(String str, char c) {
        if (str == null) {
            return new String[0];
        }
        if (str.length() <= 0) {
            return new String[]{str};
        }
        int r3 = 1;
        for (int r1 = 0; r1 < str.length(); r1++) {
            if (str.charAt(r1) == c) {
                r3++;
            }
        }
        if (r3 <= 1) {
            return new String[]{str};
        }
        String[] strArr = new String[r3];
        StringBuilder sb = new StringBuilder(str.length());
        int r5 = 0;
        for (int r4 = 0; r4 < str.length() && r5 < r3; r4++) {
            char cCharAt = str.charAt(r4);
            if (cCharAt == c) {
                strArr[r5] = sb.toString();
                sb.setLength(0);
                r5++;
            } else {
                sb.append(cCharAt);
            }
        }
        strArr[r5] = sb.toString();
        return strArr;
    }

    public static String[] a(String[] strArr, String str) {
        return a(strArr, new String[]{str});
    }

    public static String[] a(String str, int r3, int r4) {
        String[] strArrA = a(str, r3);
        return b(a(strArrA, 0), a(a(strArrA, 1), r4 - r3));
    }

    public static String[] a(String str, int r3, int r4, int r5) {
        String[] strArrA = a(str, r3);
        return b(a(strArrA, 0), a(a(strArrA, 1), r4 - r3, r5 - r3));
    }

    public static String[] a(String str, int... r9) {
        if (str == null) {
            return new String[]{""};
        }
        if (str.length() > 1 && r9.length > 0) {
            if (r9.length <= 1) {
                return a(str, r9[0]);
            }
            int r2 = r9[0];
            int length = r9.length - 1;
            int[] r4 = new int[length];
            int r5 = 0;
            while (r5 < length) {
                int r6 = r5 + 1;
                r4[r5] = r9[r6] - r2;
                r5 = r6;
            }
            String[] strArrA = a(str, r2);
            return b(a(strArrA, 0), a(a(strArrA, 1), r4));
        }
        return new String[]{str};
    }

    public static String[] a(String str, int r6) {
        if (str == null) {
            return new String[]{"", ""};
        }
        if (r6 >= 0 && r6 <= str.length()) {
            return new String[]{str.substring(0, r6), str.substring(r6)};
        }
        return new String[]{str, ""};
    }

    public static String a(String str, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int r1 = 1; r1 < strArr.length; r1++) {
            if (strArr[r1] != null) {
                sb.append(str).append(strArr[r1]);
            }
        }
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        if (str == null || str.length() <= 0 || str2.length() <= 0 || str3.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[str.length()];
        char cCharAt = str3.charAt(str3.length() - 1);
        for (int r2 = 0; r2 < charArray.length; r2++) {
            char c = charArray[r2];
            int r4 = str2.lastIndexOf(c);
            if (r4 < 0) {
                cArr[r2] = c;
            } else {
                cArr[r2] = r4 >= str3.length() ? cCharAt : str3.charAt(r4);
            }
        }
        return new String(cArr);
    }

    public static String a(String[] strArr, int r3) {
        return (strArr == null || strArr.length <= 0 || r3 < 0 || r3 >= strArr.length) ? "" : strArr[r3];
    }

    public static String a(String str, char c) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        int length = str.length();
        char[] cArr = new char[length];
        for (int r1 = 0; r1 < length; r1++) {
            cArr[r1] = c;
        }
        return new String(cArr);
    }

    public static int a(String str, char c, int r4) {
        int length = str.length() - 1;
        while (length >= 0 && (str.charAt(length) != c || (r4 = r4 - 1) > 0)) {
            length--;
        }
        return length;
    }
}
