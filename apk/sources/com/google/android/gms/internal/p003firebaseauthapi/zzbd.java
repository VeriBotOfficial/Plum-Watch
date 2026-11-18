package com.google.android.gms.internal.p003firebaseauthapi;

import android.gov.nist.core.Separators;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzbd {
    static void zza(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new ArithmeticException("overflow: " + str + Separators.LPAREN + j + ", " + j2 + Separators.RPAREN);
        }
    }
}
