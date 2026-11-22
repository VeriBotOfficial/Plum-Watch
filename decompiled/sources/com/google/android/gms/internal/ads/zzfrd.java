package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
class zzfrd {
    static final String zza = new UUID(0, 0).toString();
    final zzfrc zzb;
    final zzfrb zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    zzfrd(Context context, String str, String str2, String str3) {
        this.zzb = zzfrc.zzb(context);
        this.zzc = zzfrb.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = AbstractJsonLexerKt.NULL;
        sb.append(str2 == null ? AbstractJsonLexerKt.NULL : "not null");
        sb.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }

    final long zza(boolean z) {
        return this.zzb.zza(z ? this.zzg : this.zzf, -1L);
    }

    final zzfra zzb(String str, String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfra();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zza2 = zza(z2);
        if (zza2 != -1) {
            if (currentTimeMillis < zza2) {
                this.zzb.zzd(z2 ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zza2 + j) {
                return zzc(str, str2);
            }
        }
        String zze2 = zze(z2);
        return (zze2 != null || z) ? new zzfra(zze2, zza(z2)) : zzc(str, str2);
    }

    final zzfra zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    final zzfra zzd(String str, boolean z) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z ? this.zzg : this.zzf, Long.valueOf(currentTimeMillis));
        this.zzb.zzd(z ? this.zze : this.zzd, str);
        return new zzfra(str, currentTimeMillis);
    }

    final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    final void zzf(boolean z) throws IOException {
        this.zzb.zze(z ? this.zzg : this.zzf);
        this.zzb.zze(z ? this.zze : this.zzd);
    }

    final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
