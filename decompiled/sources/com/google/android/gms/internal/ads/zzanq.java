package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzanq {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzef zza = new zzef(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdy zzb = new zzdy();

    zzanq(int i) {
    }

    private final int zze(zzaco zzacoVar) {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacoVar.zzj();
        return 0;
    }

    public final int zza(zzaco zzacoVar, zzadj zzadjVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacoVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacoVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzacoVar);
                    return 0;
                }
                zzef zzefVar = this.zza;
                this.zzh = zzefVar.zzc(this.zzg) - zzefVar.zzb(j2);
                zze(zzacoVar);
                return 0;
            }
            int min = (int) Math.min(112800L, zzacoVar.zzd());
            if (zzacoVar.zzf() != 0) {
                zzadjVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(min);
            zzacoVar.zzj();
            zzacoVar.zzh(this.zzb.zzN(), 0, min);
            zzdy zzdyVar = this.zzb;
            int zzd = zzdyVar.zzd();
            int zze = zzdyVar.zze();
            while (true) {
                if (zzd >= zze) {
                    break;
                }
                if (zzdyVar.zzN()[zzd] == 71) {
                    long zzb = zzanz.zzb(zzdyVar, zzd, i);
                    if (zzb != -9223372036854775807L) {
                        j = zzb;
                        break;
                    }
                }
                zzd++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long zzd2 = zzacoVar.zzd();
        int min2 = (int) Math.min(112800L, zzd2);
        long j3 = zzd2 - min2;
        if (zzacoVar.zzf() != j3) {
            zzadjVar.zza = j3;
            return 1;
        }
        this.zzb.zzI(min2);
        zzacoVar.zzj();
        zzacoVar.zzh(this.zzb.zzN(), 0, min2);
        zzdy zzdyVar2 = this.zzb;
        int zzd3 = zzdyVar2.zzd();
        int zze2 = zzdyVar2.zze();
        int i2 = zze2 - 188;
        while (true) {
            if (i2 < zzd3) {
                break;
            }
            byte[] zzN = zzdyVar2.zzN();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * 188) + i2;
                if (i5 < zzd3 || i5 >= zze2 || zzN[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long zzb2 = zzanz.zzb(zzdyVar2, i2, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                }
                i3++;
            }
            i2--;
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
