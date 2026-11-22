package com.google.android.gms.internal.ads;

import android.gov.nist.core.Separators;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzaqx extends zzhec implements Closeable {
    static {
        zzhej.zzb(zzaqx.class);
    }

    public zzaqx(zzhed zzhedVar, zzaqw zzaqwVar) throws IOException {
        zze(zzhedVar, zzhedVar.zzc(), zzaqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhec, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
