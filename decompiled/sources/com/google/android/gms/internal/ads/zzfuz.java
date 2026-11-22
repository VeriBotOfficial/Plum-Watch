package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzfuz implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvc zzb;

    zzfuz(zzfvc zzfvcVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvcVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzfuf.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
