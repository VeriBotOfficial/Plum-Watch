package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes15.dex */
final class zze extends zzb {
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zze() {
    }
}
