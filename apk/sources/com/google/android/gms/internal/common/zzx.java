package com.google.android.gms.internal.common;

import android.gov.nist.core.Separators;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzx {
    public static String zza(String str, Object... objArr) {
        int length;
        int r4;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int r0 = 0;
        int r1 = 0;
        while (true) {
            length = objArr.length;
            if (r0 >= length || (r4 = str.indexOf("%s", r1)) == -1) {
                break;
            }
            sb.append((CharSequence) str, r1, r4);
            sb.append(zzb(objArr[r0]));
            r1 = r4 + 2;
            r0++;
        }
        sb.append((CharSequence) str, r1, str.length());
        if (r0 < length) {
            String str2 = " [";
            while (r0 < objArr.length) {
                sb.append(str2);
                sb.append(zzb(objArr[r0]));
                r0++;
                str2 = ", ";
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append(Separators.AT);
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + String.valueOf(name2).length() + 1);
            sb2.append(Separators.LESS_THAN);
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(Separators.GREATER_THAN);
            return sb2.toString();
        }
    }
}
