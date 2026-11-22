package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.tv;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class hb0 extends jk {
    private RandomAccessFile e;
    private Uri f;
    private long g;
    private boolean h;

    public static final class b implements tv.a {
        @Override // com.yandex.mobile.ads.impl.tv.a
        public final tv a() {
            return new hb0();
        }
    }

    public static class c extends uv {
        public c(int i, String str, FileNotFoundException fileNotFoundException) {
            super(i, str, fileNotFoundException);
        }

        public c(Exception exc, int i) {
            super(exc, i);
        }
    }

    public hb0() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws c {
        Uri uri = xvVar.f17370a;
        this.f = uri;
        b(xvVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(xvVar.f);
                long j = xvVar.g;
                if (j == -1) {
                    j = this.e.length() - xvVar.f;
                }
                this.g = j;
                if (j >= 0) {
                    this.h = true;
                    c(xvVar);
                    return this.g;
                }
                throw new c(2008, null, null);
            } catch (IOException e) {
                throw new c(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c(e2, (f92.f15466a < 21 || !a.a(e2.getCause())) ? 2005 : 2006);
            }
            throw new c(1004, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2);
        } catch (SecurityException e3) {
            throw new c(e3, 2006);
        } catch (RuntimeException e4) {
            throw new c(e4, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws c {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = f92.f15466a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new c(e, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final void close() throws c {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new c(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                e();
            }
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }
}
