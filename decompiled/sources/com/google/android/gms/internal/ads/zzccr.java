package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzccr extends zzaqv {
    static final zzccr zzb = new zzccr();

    zzccr() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final zzaqz zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzarb() : "mvhd".equals(str) ? new zzarc() : new zzard(str);
    }
}
