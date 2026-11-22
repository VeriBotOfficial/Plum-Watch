package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzarc extends zzhea {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhek zzm;
    private long zzn;

    public zzarc() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhek.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhef.zza(zzaqy.zzf(byteBuffer));
            this.zzh = zzhef.zza(zzaqy.zzf(byteBuffer));
            this.zzi = zzaqy.zze(byteBuffer);
            this.zzj = zzaqy.zzf(byteBuffer);
        } else {
            this.zzg = zzhef.zza(zzaqy.zze(byteBuffer));
            this.zzh = zzhef.zza(zzaqy.zze(byteBuffer));
            this.zzi = zzaqy.zze(byteBuffer);
            this.zzj = zzaqy.zze(byteBuffer);
        }
        this.zzk = zzaqy.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzaqy.zzd(byteBuffer);
        zzaqy.zze(byteBuffer);
        zzaqy.zze(byteBuffer);
        this.zzm = new zzhek(zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer), zzaqy.zza(byteBuffer), zzaqy.zza(byteBuffer), zzaqy.zza(byteBuffer), zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqy.zze(byteBuffer);
    }
}
