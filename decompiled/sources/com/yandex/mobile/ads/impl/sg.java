package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class sg extends jk {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    public static final class a extends uv {
        public a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public sg(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws a {
        try {
            Uri uri = xvVar.f17370a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(xvVar);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(xvVar.f) >= xvVar.f) {
                long j = xvVar.g;
                if (j != -1) {
                    this.h = j;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                c(xvVar);
                return this.h;
            }
            throw new a(null, 2008);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = f92.f15466a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws a {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                e();
            }
        }
    }
}
