package com.google.android.gms.internal.consent_sdk;

import android.gov.nist.core.Separators;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzdp {
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
            String str = obj.getClass().getName() + Separators.AT + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e);
            return Separators.LESS_THAN + str + " threw " + e.getClass().getName() + Separators.GREATER_THAN;
        }
    }
}
