package com.anythink.basead.exoplayer.k;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f2670a = 4;
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
        int[] r1 = a(str2);
        if (r1[0] != -1) {
            sb.append(str2);
            a(sb, r1[1], r1[2]);
            return sb.toString();
        }
        int[] r3 = a(str);
        if (r1[3] == 0) {
            return sb.append((CharSequence) str, 0, r3[3]).append(str2).toString();
        }
        if (r1[2] == 0) {
            return sb.append((CharSequence) str, 0, r3[2]).append(str2).toString();
        }
        int r7 = r1[1];
        if (r7 != 0) {
            int r4 = r3[0] + 1;
            sb.append((CharSequence) str, 0, r4).append(str2);
            return a(sb, r1[1] + r4, r4 + r1[2]);
        }
        if (str2.charAt(r7) == '/') {
            sb.append((CharSequence) str, 0, r3[1]).append(str2);
            int r10 = r3[1];
            return a(sb, r10, r1[2] + r10);
        }
        int r8 = r3[0] + 2;
        int r9 = r3[1];
        if (r8 < r9 && r9 == r3[2]) {
            sb.append((CharSequence) str, 0, r9).append('/').append(str2);
            int r11 = r3[1];
            return a(sb, r11, r1[2] + r11 + 1);
        }
        int r12 = str.lastIndexOf(47, r3[2] - 1);
        int r5 = r12 == -1 ? r3[1] : r12 + 1;
        sb.append((CharSequence) str, 0, r5).append(str2);
        return a(sb, r3[1], r5 + r1[2]);
    }

    private static Uri a(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    private static String a(StringBuilder sb, int r8, int r9) {
        int r3;
        int r4;
        if (r8 >= r9) {
            return sb.toString();
        }
        if (sb.charAt(r8) == '/') {
            r8++;
        }
        int r0 = r8;
        int r2 = r0;
        while (r0 <= r9) {
            if (r0 == r9) {
                r3 = r0;
            } else if (sb.charAt(r0) == '/') {
                r3 = r0 + 1;
            } else {
                r0++;
            }
            int r5 = r2 + 1;
            if (r0 == r5 && sb.charAt(r2) == '.') {
                sb.delete(r2, r3);
                r4 = r3 - r2;
            } else {
                if (r0 == r2 + 2 && sb.charAt(r2) == '.' && sb.charAt(r5) == '.') {
                    r2 = sb.lastIndexOf("/", r2 - 2) + 1;
                    int r1 = r2 > r8 ? r2 : r8;
                    sb.delete(r1, r3);
                    r4 = r3 - r1;
                } else {
                    r2 = r0 + 1;
                }
                r0 = r2;
            }
            r9 -= r4;
            r0 = r2;
        }
        return sb.toString();
    }

    private static int[] a(String str) {
        int r9;
        int[] r0 = new int[4];
        if (TextUtils.isEmpty(str)) {
            r0[0] = -1;
            return r0;
        }
        int length = str.length();
        int r4 = str.indexOf(35);
        if (r4 != -1) {
            length = r4;
        }
        int r5 = str.indexOf(63);
        if (r5 == -1 || r5 > length) {
            r5 = length;
        }
        int r6 = str.indexOf(47);
        if (r6 == -1 || r6 > r5) {
            r6 = r5;
        }
        int r7 = str.indexOf(58);
        if (r7 > r6) {
            r7 = -1;
        }
        int r8 = r7 + 2;
        if (r8 < r5 && str.charAt(r7 + 1) == '/' && str.charAt(r8) == '/') {
            r9 = str.indexOf(47, r7 + 3);
            if (r9 == -1 || r9 > r5) {
                r9 = r5;
            }
        } else {
            r9 = r7 + 1;
        }
        r0[0] = r7;
        r0[1] = r9;
        r0[2] = r5;
        r0[3] = length;
        return r0;
    }

    private static Uri a(String str, String str2) {
        String strA;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] r1 = a(str2);
        if (r1[0] != -1) {
            sb.append(str2);
            a(sb, r1[1], r1[2]);
            strA = sb.toString();
        } else {
            int[] r3 = a(str);
            if (r1[3] == 0) {
                strA = sb.append((CharSequence) str, 0, r3[3]).append(str2).toString();
            } else if (r1[2] == 0) {
                strA = sb.append((CharSequence) str, 0, r3[2]).append(str2).toString();
            } else {
                int r7 = r1[1];
                if (r7 != 0) {
                    int r4 = r3[0] + 1;
                    sb.append((CharSequence) str, 0, r4).append(str2);
                    strA = a(sb, r1[1] + r4, r4 + r1[2]);
                } else if (str2.charAt(r7) == '/') {
                    sb.append((CharSequence) str, 0, r3[1]).append(str2);
                    int r10 = r3[1];
                    strA = a(sb, r10, r1[2] + r10);
                } else {
                    int r8 = r3[0] + 2;
                    int r9 = r3[1];
                    if (r8 < r9 && r9 == r3[2]) {
                        sb.append((CharSequence) str, 0, r9).append('/').append(str2);
                        int r11 = r3[1];
                        strA = a(sb, r11, r1[2] + r11 + 1);
                    } else {
                        int r12 = str.lastIndexOf(47, r3[2] - 1);
                        int r5 = r12 == -1 ? r3[1] : r12 + 1;
                        sb.append((CharSequence) str, 0, r5).append(str2);
                        strA = a(sb, r3[1], r5 + r1[2]);
                    }
                }
            }
        }
        return Uri.parse(strA);
    }
}
