package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzghm extends zzget {
    private final zzghr zza;
    private final zzgvo zzb;

    @Nullable
    private final Integer zzc;

    private zzghm(zzghr zzghrVar, zzgvo zzgvoVar, @Nullable Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgvoVar;
        this.zzc = num;
    }

    public static zzghm zza(zzghr zzghrVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzb;
        if (zzghrVar.zzc() == zzghp.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzgml.zza;
        } else {
            if (zzghrVar.zzc() != zzghp.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(zzghrVar.zzc()))));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzgml.zzb(num.intValue());
        }
        return new zzghm(zzghrVar, zzb, num);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
