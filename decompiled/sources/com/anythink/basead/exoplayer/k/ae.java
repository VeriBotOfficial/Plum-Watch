package com.anythink.basead.exoplayer.k;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2667a = 4;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;

    private ae() {
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a2 = a(str2);
        if (a2[0] != -1) {
            sb.append(str2);
            a(sb, a2[1], a2[2]);
            return sb.toString();
        }
        int[] a3 = a(str);
        if (a2[3] == 0) {
            return sb.append((CharSequence) str, 0, a3[3]).append(str2).toString();
        }
        if (a2[2] == 0) {
            return sb.append((CharSequence) str, 0, a3[2]).append(str2).toString();
        }
        int i = a2[1];
        if (i != 0) {
            int i2 = a3[0] + 1;
            sb.append((CharSequence) str, 0, i2).append(str2);
            return a(sb, a2[1] + i2, i2 + a2[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, a3[1]).append(str2);
            int i3 = a3[1];
            return a(sb, i3, a2[2] + i3);
        }
        int i4 = a3[0] + 2;
        int i5 = a3[1];
        if (i4 < i5 && i5 == a3[2]) {
            sb.append((CharSequence) str, 0, i5).append('/').append(str2);
            int i6 = a3[1];
            return a(sb, i6, a2[2] + i6 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, a3[2] - 1);
        int i7 = lastIndexOf == -1 ? a3[1] : lastIndexOf + 1;
        sb.append((CharSequence) str, 0, i7).append(str2);
        return a(sb, a3[1], i7 + a2[2]);
    }

    private static Uri a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    private static String a(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i4 = i3 - i6;
            } else if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                i6 = sb.lastIndexOf("/", i6 - 2) + 1;
                int i8 = i6 > i ? i6 : i;
                sb.delete(i8, i3);
                i4 = i3 - i8;
            } else {
                i6 = i5 + 1;
                i5 = i6;
            }
            i2 -= i4;
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static Uri a(String str, String str2) {
        String a2;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a3 = a(str2);
        if (a3[0] != -1) {
            sb.append(str2);
            a(sb, a3[1], a3[2]);
            a2 = sb.toString();
        } else {
            int[] a4 = a(str);
            if (a3[3] == 0) {
                a2 = sb.append((CharSequence) str, 0, a4[3]).append(str2).toString();
            } else if (a3[2] == 0) {
                a2 = sb.append((CharSequence) str, 0, a4[2]).append(str2).toString();
            } else {
                int i = a3[1];
                if (i != 0) {
                    int i2 = a4[0] + 1;
                    sb.append((CharSequence) str, 0, i2).append(str2);
                    a2 = a(sb, a3[1] + i2, i2 + a3[2]);
                } else if (str2.charAt(i) == '/') {
                    sb.append((CharSequence) str, 0, a4[1]).append(str2);
                    int i3 = a4[1];
                    a2 = a(sb, i3, a3[2] + i3);
                } else {
                    int i4 = a4[0] + 2;
                    int i5 = a4[1];
                    if (i4 < i5 && i5 == a4[2]) {
                        sb.append((CharSequence) str, 0, i5).append('/').append(str2);
                        int i6 = a4[1];
                        a2 = a(sb, i6, a3[2] + i6 + 1);
                    } else {
                        int lastIndexOf = str.lastIndexOf(47, a4[2] - 1);
                        int i7 = lastIndexOf == -1 ? a4[1] : lastIndexOf + 1;
                        sb.append((CharSequence) str, 0, i7).append(str2);
                        a2 = a(sb, a4[1], i7 + a3[2]);
                    }
                }
            }
        }
        return Uri.parse(a2);
    }
}
