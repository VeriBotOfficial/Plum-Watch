package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzcdp extends zzfr implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzgd zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcdp(String str, zzgy zzgyVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzcdo(this);
        this.zzr = new HashSet();
        zzcw.zzc(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzgyVar != null) {
            zzf(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r2 == r16) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0237 A[Catch: IOException -> 0x0286, TryCatch #2 {IOException -> 0x0286, blocks: (B:3:0x000e, B:4:0x0026, B:6:0x002c, B:8:0x0036, B:9:0x0043, B:10:0x005b, B:12:0x0061, B:19:0x0085, B:21:0x009f, B:22:0x00b1, B:23:0x00b6, B:25:0x00bf, B:26:0x00c6, B:40:0x00ed, B:102:0x022c, B:104:0x0237, B:106:0x0248, B:112:0x0251, B:113:0x0260, B:116:0x0267, B:117:0x026e, B:121:0x026f, B:122:0x0285), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[Catch: IOException -> 0x0286, TryCatch #2 {IOException -> 0x0286, blocks: (B:3:0x000e, B:4:0x0026, B:6:0x002c, B:8:0x0036, B:9:0x0043, B:10:0x005b, B:12:0x0061, B:19:0x0085, B:21:0x009f, B:22:0x00b1, B:23:0x00b6, B:25:0x00bf, B:26:0x00c6, B:40:0x00ed, B:102:0x022c, B:104:0x0237, B:106:0x0248, B:112:0x0251, B:113:0x0260, B:116:0x0267, B:117:0x026e, B:121:0x026f, B:122:0x0285), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgd r21) throws com.google.android.gms.internal.ads.zzgp {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.zzb(com.google.android.gms.internal.ads.zzgd):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            if (this.zzj != null) {
                int i = zzei.zza;
                try {
                    this.zzj.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzm(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        zzb.set(bArr2);
                        break;
                    }
                    int read = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzg(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.zzj.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzgp(e, this.zzh, 2000, 2);
        }
    }
}
