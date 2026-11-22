package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
class zzgwg extends zzgwf {
    protected final byte[] zza;

    zzgwg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwj) || zzd() != ((zzgwj) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgwg)) {
            return obj.equals(this);
        }
        zzgwg zzgwgVar = (zzgwg) obj;
        int zzr = zzr();
        int zzr2 = zzgwgVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgwgVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    final boolean zzg(zzgwj zzgwjVar, int i, int i2) {
        if (i2 > zzgwjVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgwjVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgwjVar.zzd());
        }
        if (!(zzgwjVar instanceof zzgwg)) {
            return zzgwjVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgwg zzgwgVar = (zzgwg) zzgwjVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgwgVar.zza;
        int zzc = zzc() + i2;
        int zzc2 = zzc();
        int zzc3 = zzgwgVar.zzc() + i;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final int zzi(int i, int i2, int i3) {
        return zzgye.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzhat.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        return zzq == 0 ? zzgwj.zzb : new zzgwd(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        return zzgwp.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    final void zzo(zzgwa zzgwaVar) throws IOException {
        zzgwaVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int zzc = zzc();
        return zzhat.zzi(this.zza, zzc, zzd() + zzc);
    }
}
