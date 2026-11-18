package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzaqg extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzaqg(InputStream inputStream, long j) {
        super(inputStream);
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int r0 = super.read();
        if (r0 != -1) {
            this.zzb++;
        }
        return r0;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int r4, int r5) throws IOException {
        int r3 = super.read(bArr, r4, r5);
        if (r3 != -1) {
            this.zzb += (long) r3;
        }
        return r3;
    }
}
