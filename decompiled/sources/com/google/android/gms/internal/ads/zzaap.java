package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzaap {
    private final zzzj zza = new zzzj();
    private final zzaan zzb;
    private final zzaao zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    static /* bridge */ /* synthetic */ void zzb(zzaap zzaapVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzaapVar.zzk = refreshRate;
            zzaapVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdo.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaapVar.zzk = -9223372036854775807L;
            zzaapVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaam.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzei.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (zza != f) {
            if (zza != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (Math.abs(zza - this.zzg) < f2) {
                    return;
                }
            } else if (zza == -1.0f && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = zza;
            zzn(false);
        }
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzaam.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j3 = this.zzq + ((long) ((zzc * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzaao zzaaoVar = this.zzc;
        if (zzaaoVar != null && this.zzk != -9223372036854775807L) {
            long j4 = zzaaoVar.zza;
            if (j4 != -9223372036854775807L) {
                long j5 = this.zzk;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    long j7 = j5 + j6;
                    j2 = j6;
                    j6 = j7;
                }
                long j8 = this.zzl;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j8;
            }
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaan zzaanVar = this.zzb;
        if (zzaanVar != null) {
            zzaanVar.zzb();
            zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }

    public zzaap(Context context) {
        DisplayManager displayManager;
        zzaan zzaanVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaan(this, displayManager);
        this.zzb = zzaanVar;
        this.zzc = zzaanVar != null ? zzaao.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }
}
