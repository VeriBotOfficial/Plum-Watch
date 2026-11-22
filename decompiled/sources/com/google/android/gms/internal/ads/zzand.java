package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzand implements zzany {
    private final zzamj zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(zzamj zzamjVar) {
        this.zza = zzamjVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzdy zzdyVar, byte[] bArr, int i) {
        int min = Math.min(zzdyVar.zzb(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzM(min);
        } else {
            zzdyVar.zzH(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdyVar, int i) throws zzbc {
        int i2;
        int i3;
        long j;
        long j2;
        zzcw.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        zzdo.zzf("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.zza.zzc(zzdyVar.zze() == 0);
                } else {
                    zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i8 = i;
        while (zzdyVar.zzb() > 0) {
            int i9 = this.zzc;
            if (i9 == 0) {
                i2 = i5;
                zzdyVar.zzM(zzdyVar.zzb());
            } else if (i9 != 1) {
                if (i9 != i5) {
                    int zzb = zzdyVar.zzb();
                    int i10 = this.zzj;
                    int i11 = i10 == i4 ? 0 : zzb - i10;
                    if (i11 > 0) {
                        zzb -= i11;
                        zzdyVar.zzK(zzdyVar.zzd() + zzb);
                    }
                    this.zza.zza(zzdyVar);
                    int i12 = this.zzj;
                    if (i12 != i4) {
                        int i13 = i12 - zzb;
                        this.zzj = i13;
                        if (i13 == 0) {
                            this.zza.zzc(false);
                            zze(1);
                        }
                    }
                } else {
                    if (zzf(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzdyVar, null, this.zzi)) {
                        this.zzb.zzl(0);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzn(1);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(1);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzn(1);
                            if (this.zzh || !this.zzg) {
                                j2 = zzd;
                            } else {
                                this.zzb.zzn(4);
                                j2 = zzd;
                                this.zzb.zzn(1);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(1);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzn(1);
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((j2 << 30) | zzd2 | zzd3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i8 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i8);
                        zze(3);
                        i4 = -1;
                        i5 = 2;
                    }
                }
                i2 = i5;
            } else if (zzf(zzdyVar, this.zzb.zza, 9)) {
                this.zzb.zzl(0);
                int zzd6 = this.zzb.zzd(24);
                if (zzd6 != 1) {
                    zzdo.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i4 = -1;
                    this.zzj = -1;
                    i3 = 0;
                    i2 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzdx zzdxVar = this.zzb;
                    int zzd7 = zzdxVar.zzd(16);
                    zzdxVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i2 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                        i4 = -1;
                    } else {
                        int i14 = (zzd7 - 3) - zzd8;
                        this.zzj = i14;
                        if (i14 < 0) {
                            zzdo.zzf("PesReader", "Found negative packet payload size: " + i14);
                            i4 = -1;
                            this.zzj = -1;
                        } else {
                            i4 = -1;
                        }
                    }
                    i3 = 2;
                }
                zze(i3);
            } else {
                i4 = -1;
                i2 = 2;
            }
            i5 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zze = zzefVar;
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
