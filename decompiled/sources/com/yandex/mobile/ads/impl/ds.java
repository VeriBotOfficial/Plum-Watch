package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
public final class ds extends jk {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    public static class a extends uv {
        public a(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ds(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.tv
    public final long a(xv xvVar) throws a {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = xvVar.f17370a;
                this.f = uri;
                b(xvVar);
                if ("content".equals(xvVar.f17370a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.h = fileInputStream;
                    if (length != -1 && xvVar.f > length) {
                        throw new a(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(xvVar.f + startOffset) - startOffset;
                    if (skip == xvVar.f) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.i = -1L;
                            } else {
                                long position = size - channel.position();
                                this.i = position;
                                if (position < 0) {
                                    throw new a(null, 2008);
                                }
                            }
                        } else {
                            long j = length - skip;
                            this.i = j;
                            if (j < 0) {
                                throw new a(null, 2008);
                            }
                        }
                        long j2 = xvVar.g;
                        if (j2 != -1) {
                            long j3 = this.i;
                            if (j3 != -1) {
                                j2 = Math.min(j3, j2);
                            }
                            this.i = j2;
                        }
                        this.j = true;
                        c(xvVar);
                        long j4 = xvVar.g;
                        return j4 != -1 ? j4 : this.i;
                    }
                    throw new a(null, 2008);
                }
                i = 2000;
                try {
                    throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
                } catch (IOException e) {
                    e = e;
                    throw new a(e, e instanceof FileNotFoundException ? 2005 : i);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (a e3) {
            throw e3;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
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
        FileInputStream fileInputStream = this.h;
        int i3 = f92.f15466a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
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
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            e();
                        }
                    }
                } catch (IOException e) {
                    throw new a(e, 2000);
                }
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        e();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    e();
                }
            }
        }
    }
}
