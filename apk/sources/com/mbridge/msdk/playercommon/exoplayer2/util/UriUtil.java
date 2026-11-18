package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    private static int[] getUriIndices(String str) {
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

    private static String removeDotSegments(StringBuilder sb, int r8, int r9) {
        int r3;
        int r0;
        if (r8 >= r9) {
            return sb.toString();
        }
        if (sb.charAt(r8) == '/') {
            r8++;
        }
        int r1 = r8;
        int r2 = r1;
        while (r1 <= r9) {
            if (r1 == r9) {
                r3 = r1;
            } else if (sb.charAt(r1) == '/') {
                r3 = r1 + 1;
            } else {
                r1++;
            }
            int r4 = r2 + 1;
            if (r1 == r4 && sb.charAt(r2) == '.') {
                sb.delete(r2, r3);
                r9 -= r3 - r2;
            } else {
                if (r1 == r2 + 2 && sb.charAt(r2) == '.' && sb.charAt(r4) == '.') {
                    r0 = sb.lastIndexOf("/", r2 - 2) + 1;
                    int r5 = r0 > r8 ? r0 : r8;
                    sb.delete(r5, r3);
                    r9 -= r3 - r5;
                } else {
                    r0 = r1 + 1;
                }
                r2 = r0;
            }
            r1 = r2;
        }
        return sb.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
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

    public static String resolve(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb.append(str2);
            removeDotSegments(sb, uriIndices[1], uriIndices[2]);
            return sb.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            return sb.append((CharSequence) str, 0, uriIndices2[3]).append(str2).toString();
        }
        if (uriIndices[2] == 0) {
            return sb.append((CharSequence) str, 0, uriIndices2[2]).append(str2).toString();
        }
        int r7 = uriIndices[1];
        if (r7 != 0) {
            int r3 = uriIndices2[0] + 1;
            sb.append((CharSequence) str, 0, r3).append(str2);
            return removeDotSegments(sb, uriIndices[1] + r3, r3 + uriIndices[2]);
        }
        if (str2.charAt(r7) == '/') {
            sb.append((CharSequence) str, 0, uriIndices2[1]).append(str2);
            int r10 = uriIndices2[1];
            return removeDotSegments(sb, r10, uriIndices[2] + r10);
        }
        int r8 = uriIndices2[0] + 2;
        int r9 = uriIndices2[1];
        if (r8 < r9 && r9 == uriIndices2[2]) {
            sb.append((CharSequence) str, 0, r9).append('/').append(str2);
            int r11 = uriIndices2[1];
            return removeDotSegments(sb, r11, uriIndices[2] + r11 + 1);
        }
        int r12 = str.lastIndexOf(47, uriIndices2[2] - 1);
        int r4 = r12 == -1 ? uriIndices2[1] : r12 + 1;
        sb.append((CharSequence) str, 0, r4).append(str2);
        return removeDotSegments(sb, uriIndices2[1], r4 + uriIndices[2]);
    }

    public static Uri resolveToUri(String str, String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
