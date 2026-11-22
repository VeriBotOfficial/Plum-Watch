package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzcj {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcj(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.zzb * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, zzl, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzr;
        int i4 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i5 = i4 + ((int) (((((((i2 - i3) / (f / f2)) + i3) + this.zzw) + this.zzo) / (this.zze * f2)) + 0.5d));
        this.zzw = 0.0d;
        int i6 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i6 + i6 + i2);
        int i7 = 0;
        while (true) {
            int i8 = this.zzh;
            int i9 = this.zzb;
            i = i8 + i8;
            if (i7 >= i * i9) {
                break;
            }
            this.zzj[(i9 * i2) + i7] = 0;
            i7++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i5) {
            this.zzm = i5;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzk() {
        int i;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        double d2 = this.zzc / this.zzd;
        int i9 = this.zzm;
        int i10 = 0;
        int i11 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i12 = this.zzk;
            if (i12 >= this.zzh) {
                int i13 = 0;
                while (true) {
                    int i14 = this.zzr;
                    if (i14 > 0) {
                        int min = Math.min(this.zzh, i14);
                        zzh(this.zzj, i13, min);
                        this.zzr -= min;
                        i13 += min;
                        d = d2;
                        i2 = i11;
                    } else {
                        short[] sArr = this.zzj;
                        int i15 = this.zza;
                        int i16 = i15 > 4000 ? i15 / 4000 : i11;
                        if (this.zzb == i11 && i16 == i11) {
                            i = zzg(sArr, i13, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i13, i16);
                            int zzg = zzg(this.zzi, i10, this.zzf / i16, this.zzg / i16);
                            if (i16 != i11) {
                                int i17 = zzg * i16;
                                int i18 = i16 * 4;
                                int i19 = this.zzf;
                                int i20 = i17 - i18;
                                if (i20 >= i19) {
                                    i19 = i20;
                                }
                                int i21 = i17 + i18;
                                int i22 = this.zzg;
                                if (i21 > i22) {
                                    i21 = i22;
                                }
                                if (this.zzb == i11) {
                                    i = zzg(sArr, i13, i19, i21);
                                } else {
                                    zzi(sArr, i13, i11);
                                    i = zzg(this.zzi, i10, i19, i21);
                                }
                            } else {
                                i = zzg;
                            }
                        }
                        int i23 = this.zzu;
                        int i24 = (i23 == 0 || (i5 = this.zzs) == 0 || this.zzv > i23 * 3 || i23 + i23 <= this.zzt * 3) ? i : i5;
                        int i25 = i13 + i24;
                        this.zzt = i23;
                        this.zzs = i;
                        double d3 = i24;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d4 = d2 - 1.0d;
                            if (d2 >= 2.0d) {
                                double d5 = (d3 / d4) + this.zzw;
                                int round = (int) Math.round(d5);
                                i2 = i11;
                                this.zzw = d5 - round;
                                i4 = round;
                            } else {
                                i2 = i11;
                                double d6 = (((2.0d - d2) * d3) / d4) + this.zzw;
                                int round2 = (int) Math.round(d6);
                                this.zzr = round2;
                                this.zzw = d6 - round2;
                                i4 = i24;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i4);
                            this.zzl = zzl;
                            int i26 = i13;
                            zzj(i4, this.zzb, zzl, this.zzm, sArr2, i26, sArr2, i25);
                            this.zzm += i4;
                            i13 = i26 + i24 + i4;
                            d = d2;
                        } else {
                            i2 = i11;
                            int i27 = i24;
                            short[] sArr3 = this.zzj;
                            double d7 = 1.0d - d2;
                            if (d2 < 0.5d) {
                                d = d2;
                                double d8 = ((d3 * d2) / d7) + this.zzw;
                                int round3 = (int) Math.round(d8);
                                this.zzw = d8 - round3;
                                i3 = round3;
                            } else {
                                d = d2;
                                double d9 = ((d3 * ((d + d) - 1.0d)) / d7) + this.zzw;
                                int round4 = (int) Math.round(d9);
                                this.zzr = round4;
                                this.zzw = d9 - round4;
                                i3 = i27;
                            }
                            int i28 = i27 + i3;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i28);
                            this.zzl = zzl2;
                            int i29 = this.zzb;
                            System.arraycopy(sArr3, i13 * i29, zzl2, this.zzm * i29, i29 * i27);
                            zzj(i3, this.zzb, this.zzl, this.zzm + i27, sArr3, i25, sArr3, i13);
                            this.zzm += i28;
                            i13 += i3;
                        }
                    }
                    if (this.zzh + i13 > i12) {
                        break;
                    }
                    i11 = i2;
                    d2 = d;
                    i10 = 0;
                }
                int i30 = this.zzk - i13;
                short[] sArr4 = this.zzj;
                int i31 = this.zzb;
                System.arraycopy(sArr4, i13 * i31, sArr4, 0, i31 * i30);
                this.zzk = i30;
                f = this.zze * this.zzd;
                if (f != 1.0f || this.zzm == i9) {
                }
                int i32 = this.zza;
                float f2 = i32 / f;
                long j3 = i32;
                long j4 = (long) f2;
                while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                    j4 /= 2;
                    j3 /= 2;
                }
                int i33 = this.zzm - i9;
                short[] zzl3 = zzl(this.zzn, this.zzo, i33);
                this.zzn = zzl3;
                short[] sArr5 = this.zzl;
                int i34 = this.zzb;
                System.arraycopy(sArr5, i9 * i34, zzl3, this.zzo * i34, i34 * i33);
                this.zzm = i9;
                this.zzo += i33;
                int i35 = 0;
                while (true) {
                    i6 = this.zzo;
                    i7 = i6 - 1;
                    if (i35 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.zzp + 1;
                        j = i8;
                        long j5 = j * j4;
                        j2 = this.zzq;
                        if (j5 <= j2 * j3) {
                            break;
                        }
                        this.zzl = zzl(this.zzl, this.zzm, i2);
                        int i36 = 0;
                        while (true) {
                            int i37 = this.zzb;
                            if (i36 < i37) {
                                short[] sArr6 = this.zzl;
                                int i38 = this.zzm * i37;
                                short[] sArr7 = this.zzn;
                                int i39 = (i35 * i37) + i36;
                                short s = sArr7[i39];
                                short s2 = sArr7[i39 + i37];
                                long j6 = this.zzq * j3;
                                long j7 = j3;
                                long j8 = (r13 + 1) * j4;
                                long j9 = j8 - (this.zzp * j4);
                                long j10 = j8 - j6;
                                sArr6[i38 + i36] = (short) (((j10 * s) + ((j9 - j10) * s2)) / j9);
                                i36++;
                                j3 = j7;
                            }
                        }
                        i2 = 1;
                        this.zzq++;
                        this.zzm++;
                        j3 = j3;
                    }
                    long j11 = j3;
                    this.zzp = i8;
                    if (j == j11) {
                        this.zzp = 0;
                        zzcw.zzf(j2 == j4 ? i2 : 0);
                        this.zzq = 0;
                    }
                    i35++;
                    j3 = j11;
                }
                if (i7 != 0) {
                    short[] sArr8 = this.zzn;
                    int i40 = this.zzb;
                    System.arraycopy(sArr8, i7 * i40, sArr8, 0, (i6 - i7) * i40);
                    this.zzo -= i7;
                    return;
                }
                return;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        i2 = 1;
        f = this.zze * this.zzd;
        if (f != 1.0f) {
        }
    }
}
