package com.google.android.recaptcha.internal;

import android.gov.nist.core.Separators;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzid {
    static void zza(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + Separators.LPAREN + j + ", " + j2 + Separators.RPAREN);
    }

    static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
