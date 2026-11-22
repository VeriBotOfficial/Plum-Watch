package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes5.dex */
public final class rv extends jk {
    private xv e;
    private byte[] f;
    private int g;
    private int h;

    public rv() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws IOException {
        b(xvVar);
        this.e = xvVar;
        Uri uri = xvVar.f17370a;
        String scheme = uri.getScheme();
        hg.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = f92.f15466a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw eg1.a("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f = f92.c(URLDecoder.decode(str, lo.f16153a.name()));
            }
            long j = xvVar.f;
            byte[] bArr = this.f;
            if (j <= bArr.length) {
                int i2 = (int) j;
                this.g = i2;
                int length = bArr.length - i2;
                this.h = length;
                long j2 = xvVar.g;
                if (j2 != -1) {
                    this.h = (int) Math.min(length, j2);
                }
                c(xvVar);
                long j3 = xvVar.g;
                return j3 != -1 ? j3 : this.h;
            }
            this.f = null;
            throw new uv(2008);
        }
        throw eg1.a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = f92.f15466a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        xv xvVar = this.e;
        if (xvVar != null) {
            return xvVar.f17370a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() {
        if (this.f != null) {
            this.f = null;
            e();
        }
        this.e = null;
    }
}
