package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzaoh {
    public static Pair zza(zzaco zzacoVar) throws IOException {
        zzacoVar.zzj();
        zzaog zzd = zzd(1684108385, zzacoVar, new zzdy(8));
        zzacoVar.zzk(8);
        return Pair.create(Long.valueOf(zzacoVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaof zzb(zzaco zzacoVar) throws IOException {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzaog zzd = zzd(WavUtil.FMT_FOURCC, zzacoVar, zzdyVar);
        zzcw.zzf(zzd.zzb >= 16);
        zzacoVar.zzh(zzdyVar.zzN(), 0, 16);
        zzdyVar.zzL(0);
        int zzk = zzdyVar.zzk();
        int zzk2 = zzdyVar.zzk();
        int zzj = zzdyVar.zzj();
        int zzj2 = zzdyVar.zzj();
        int zzk3 = zzdyVar.zzk();
        int zzk4 = zzdyVar.zzk();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzacoVar.zzh(bArr, 0, i);
        } else {
            bArr = zzei.zzf;
        }
        zzacoVar.zzk((int) (zzacoVar.zze() - zzacoVar.zzf()));
        return new zzaof(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzaco zzacoVar) throws IOException {
        zzdy zzdyVar = new zzdy(8);
        int i = zzaog.zza(zzacoVar, zzdyVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacoVar.zzh(zzdyVar.zzN(), 0, 4);
        zzdyVar.zzL(0);
        int zzg = zzdyVar.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzdo.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaog zzd(int i, zzaco zzacoVar, zzdy zzdyVar) throws IOException {
        zzaog zza = zzaog.zza(zzacoVar, zzdyVar);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzdo.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = j + 9;
            }
            if (j2 > 2147483647L) {
                throw zzbc.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            zzacoVar.zzk((int) j2);
            zza = zzaog.zza(zzacoVar, zzdyVar);
        }
    }
}
