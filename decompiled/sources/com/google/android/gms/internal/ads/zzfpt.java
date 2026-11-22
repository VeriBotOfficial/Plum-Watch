package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzfpt extends zzfqa {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfpt(String str, boolean z, int i, zzfpp zzfppVar, zzfpq zzfpqVar, int i2, zzfps zzfpsVar) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqa) {
            zzfqa zzfqaVar = (zzfqa) obj;
            if (this.zzb.equals(zzfqaVar.zzc())) {
                zzfqaVar.zzd();
                int i = this.zzc;
                int zze = zzfqaVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == zze) {
                    zzfqaVar.zza();
                    zzfqaVar.zzb();
                    int i2 = this.zzd;
                    int zzf = zzfqaVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = AbstractJsonLexerKt.NULL;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        return "FileComplianceOptions{fileOwner=" + this.zzb + ", hasDifferentDmaOwner=false, fileChecks=" + str2 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpp zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpq zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zzf() {
        return this.zzd;
    }
}
