package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
final class zzf {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb = null;
        int r2 = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            int r3 = matcher.start();
            int r4 = r3;
            while (r4 >= 0 && str.charAt(r4) == '\\') {
                r4--;
            }
            if ((r3 - r4) % 2 != 0) {
                int r5 = Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((CharSequence) str, r2, matcher.start());
                if (r5 == 92) {
                    sb.append("\\\\");
                } else {
                    sb.append(Character.toChars(r5));
                }
                r2 = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (r2 < matcher.regionEnd()) {
            sb.append((CharSequence) str, r2, matcher.regionEnd());
        }
        return sb.toString();
    }
}
