package com.google.android.gms.internal.p003firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes15.dex */
final class zzan<E> extends zzaf<E> {
    private final zzal<E> zza;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaf
    protected final E zza(int i) {
        return this.zza.get(i);
    }

    zzan(zzal<E> zzalVar, int i) {
        super(zzalVar.size(), i);
        this.zza = zzalVar;
    }
}
