package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzfue extends zzfua implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final zzftz zza(CharSequence charSequence) {
        return new zzfud(this.zza.matcher(charSequence));
    }

    zzfue(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
