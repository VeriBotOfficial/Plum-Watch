package com.google.android.gms.internal.ads;

import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzaja {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadq zza(zzaco zzacoVar) throws IOException {
        return zzc(zzacoVar, true, false);
    }

    public static zzadq zzb(zzaco zzacoVar, boolean z) throws IOException {
        return zzc(zzacoVar, false, z);
    }

    private static zzadq zzc(zzaco zzacoVar, boolean z, boolean z2) throws IOException {
        zzadq zzadqVar;
        long j;
        zzdy zzdyVar;
        int i;
        int i2;
        int[] iArr;
        long zzd = zzacoVar.zzd();
        long j2 = -1;
        long j3 = 4096;
        if (zzd != -1 && zzd <= 4096) {
            j3 = zzd;
        }
        zzdy zzdyVar2 = new zzdy(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            zzdyVar2.zzI(8);
            boolean z4 = true;
            if (!zzacoVar.zzm(zzdyVar2.zzN(), i4, 8, true)) {
                break;
            }
            long zzu = zzdyVar2.zzu();
            int zzg = zzdyVar2.zzg();
            if (zzu == 1) {
                j = j2;
                zzacoVar.zzh(zzdyVar2.zzN(), 8, 8);
                i = 16;
                zzdyVar2.zzK(16);
                zzu = zzdyVar2.zzt();
                zzdyVar = zzdyVar2;
            } else {
                j = j2;
                if (zzu == 0) {
                    long zzd2 = zzacoVar.zzd();
                    if (zzd2 != j) {
                        zzu = (zzd2 - zzacoVar.zze()) + 8;
                    }
                }
                zzdyVar = zzdyVar2;
                i = 8;
            }
            long j4 = zzu;
            zzadqVar = null;
            long j5 = i;
            if (j4 < j5) {
                return new zzahy(zzg, j4, i);
            }
            i5 += i;
            if (zzg == 1836019574) {
                i3 += (int) j4;
                if (zzd != -1 && i3 > zzd) {
                    i3 = (int) zzd;
                }
                zzdyVar2 = zzdyVar;
                j2 = j;
                i4 = 0;
            } else {
                if (zzg == 1836019558 || zzg == 1836475768) {
                    i4 = 1;
                    break;
                }
                z3 |= !(zzg != 1835295092);
                long j6 = zzd;
                if ((i5 + j4) - j5 >= i3) {
                    i4 = 0;
                    break;
                }
                int i6 = (int) (j4 - j5);
                i5 += i6;
                if (zzg != 1718909296) {
                    i2 = 0;
                    if (i6 != 0) {
                        zzacoVar.zzg(i6);
                    }
                } else {
                    if (i6 < 8) {
                        return new zzahy(Mp4Box.TYPE_ftyp, i6, 8);
                    }
                    zzdyVar.zzI(i6);
                    i2 = 0;
                    zzacoVar.zzh(zzdyVar.zzN(), 0, i6);
                    int zzg2 = zzdyVar.zzg();
                    boolean zzd3 = zzd(zzg2, z2) | z3;
                    zzdyVar.zzM(4);
                    int zzb = zzdyVar.zzb() / 4;
                    if (!zzd3 && zzb > 0) {
                        iArr = new int[zzb];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= zzb) {
                                z4 = zzd3;
                                break;
                            }
                            int zzg3 = zzdyVar.zzg();
                            iArr[i7] = zzg3;
                            if (zzd(zzg3, z2)) {
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z4 = zzd3;
                        iArr = null;
                    }
                    if (!z4) {
                        return new zzajf(zzg2, iArr);
                    }
                    z3 = z4;
                }
                i4 = i2;
                zzdyVar2 = zzdyVar;
                j2 = j;
                zzd = j6;
            }
        }
        zzadqVar = null;
        return !z3 ? zzaiw.zza : z != i4 ? i4 != 0 ? zzair.zza : zzair.zzb : zzadqVar;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
