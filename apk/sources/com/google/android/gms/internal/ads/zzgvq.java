package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzgvq extends FilterInputStream {
    private int zza;

    zzgvq(InputStream inputStream, int r2) {
        super(inputStream);
        this.zza = r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int r0 = super.read();
        if (r0 >= 0) {
            this.zza--;
        }
        return r0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int r3 = (int) super.skip(Math.min(j, this.zza));
        if (r3 >= 0) {
            this.zza -= r3;
        }
        return r3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int r3, int r4) throws IOException {
        int r0 = this.zza;
        if (r0 <= 0) {
            return -1;
        }
        int r2 = super.read(bArr, r3, Math.min(r4, r0));
        if (r2 >= 0) {
            this.zza -= r2;
        }
        return r2;
    }
}
