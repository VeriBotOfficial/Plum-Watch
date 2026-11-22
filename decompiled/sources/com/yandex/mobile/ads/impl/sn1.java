package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class sn1 extends jk {
    private final Resources e;
    private final String f;
    private Uri g;
    private AssetFileDescriptor h;
    private FileInputStream i;
    private long j;
    private boolean k;

    public static class a extends uv {
        public a(int i, String str, Exception exc) {
            super(i, str, exc);
        }
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public sn1(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r3.matches("\\d+") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    @Override // com.yandex.mobile.ads.impl.tv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.yandex.mobile.ads.impl.xv r17) throws com.yandex.mobile.ads.impl.sn1.a {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sn1.a(com.yandex.mobile.ads.impl.xv):long");
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(2000, null, e);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = f92.f15466a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        return this.g;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws a {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            e();
                        }
                    }
                } catch (IOException e) {
                    throw new a(2000, null, e);
                }
            } catch (IOException e2) {
                throw new a(2000, null, e2);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        e();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(2000, null, e3);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    e();
                }
            }
        }
    }
}
