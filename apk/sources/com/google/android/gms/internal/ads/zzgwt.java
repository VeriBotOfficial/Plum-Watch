package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzgwt extends IOException {
    zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgwt(long j, long j2, int r6, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(r6)))), th);
    }

    zzgwt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
