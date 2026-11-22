package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import android.util.Base64;
import com.anythink.basead.exoplayer.k.af;
import java.net.URLDecoder;

/* loaded from: classes11.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2636a = "data";
    private k b;
    private int c;
    private byte[] d;

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        this.b = kVar;
        Uri uri = kVar.c;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new com.anythink.basead.exoplayer.t("Unsupported scheme: ".concat(String.valueOf(scheme)));
        }
        String[] a2 = af.a(uri.getSchemeSpecificPart(), ",");
        if (a2.length != 2) {
            throw new com.anythink.basead.exoplayer.t("Unexpected URI format: ".concat(String.valueOf(uri)));
        }
        String str = a2[1];
        if (a2[0].contains(";base64")) {
            try {
                this.d = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new com.anythink.basead.exoplayer.t("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.d = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.d.length;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.d.length - this.c;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.d, this.c, bArr, i, min);
        this.c += min;
        return min;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        k kVar = this.b;
        if (kVar != null) {
            return kVar.c;
        }
        return null;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.b = null;
        this.d = null;
    }
}
