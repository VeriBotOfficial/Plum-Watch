package com.anythink.basead.exoplayer.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes11.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f2635a;
    private final aa<? super e> b;
    private Uri c;
    private AssetFileDescriptor d;
    private FileInputStream e;
    private long f;
    private boolean g;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private e(Context context) {
        this(context, null);
    }

    public e(Context context, aa<? super e> aaVar) {
        this.f2635a = context.getContentResolver();
        this.b = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.c;
            this.c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f2635a.openAssetFileDescriptor(uri, "r");
            this.d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.c);
            }
            this.e = new FileInputStream(this.d.getFileDescriptor());
            long startOffset = this.d.getStartOffset();
            long skip = this.e.skip(kVar.f + startOffset) - startOffset;
            if (skip != kVar.f) {
                throw new EOFException();
            }
            long j = -1;
            if (kVar.g != -1) {
                this.f = kVar.g;
            } else {
                long length = this.d.getLength();
                if (length == -1) {
                    FileChannel channel = this.e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        j = size - channel.position();
                    }
                    this.f = j;
                } else {
                    this.f = length - skip;
                }
            }
            this.g = true;
            aa<? super e> aaVar = this.b;
            if (aaVar != null) {
                aaVar.b();
            }
            return this.f;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int read = this.e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        aa<? super e> aaVar = this.b;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.c;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.c = null;
        try {
            try {
                FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        aa<? super e> aaVar = this.b;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        aa<? super e> aaVar2 = this.b;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    aa<? super e> aaVar3 = this.b;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }
}
