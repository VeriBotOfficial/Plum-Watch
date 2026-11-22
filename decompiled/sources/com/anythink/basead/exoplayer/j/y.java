package com.anythink.basead.exoplayer.j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2659a = "rawresource";
    private final Resources b;
    private final aa<? super y> c;
    private Uri d;
    private AssetFileDescriptor e;
    private InputStream f;
    private long g;
    private boolean h;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    private static Uri a(int i) {
        return Uri.parse("rawresource:///".concat(String.valueOf(i)));
    }

    private y(Context context) {
        this(context, null);
    }

    public y(Context context, aa<? super y> aaVar) {
        this.b = context.getResources();
        this.c = aaVar;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        try {
            Uri uri = kVar.c;
            this.d = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.e = this.b.openRawResourceFd(Integer.parseInt(this.d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.e.getFileDescriptor());
                this.f = fileInputStream;
                fileInputStream.skip(this.e.getStartOffset());
                if (this.f.skip(kVar.f) < kVar.f) {
                    throw new EOFException();
                }
                long j = -1;
                if (kVar.g != -1) {
                    this.g = kVar.g;
                } else {
                    long length = this.e.getLength();
                    if (length != -1) {
                        j = length - kVar.f;
                    }
                    this.g = j;
                }
                this.h = true;
                aa<? super y> aaVar = this.c;
                if (aaVar != null) {
                    aaVar.b();
                }
                return this.g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
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
        int read = this.f.read(bArr, i, i2);
        if (read == -1) {
            if (this.g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.g;
        if (j2 != -1) {
            this.g = j2 - read;
        }
        aa<? super y> aaVar = this.c;
        if (aaVar != null) {
            aaVar.a(read);
        }
        return read;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.d;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.d = null;
        try {
            try {
                InputStream inputStream = this.f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.e = null;
                    if (this.h) {
                        this.h = false;
                        aa<? super y> aaVar = this.c;
                        if (aaVar != null) {
                            aaVar.c();
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.e = null;
                    if (this.h) {
                        this.h = false;
                        aa<? super y> aaVar2 = this.c;
                        if (aaVar2 != null) {
                            aaVar2.c();
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3);
                }
            } finally {
                this.e = null;
                if (this.h) {
                    this.h = false;
                    aa<? super y> aaVar3 = this.c;
                    if (aaVar3 != null) {
                        aaVar3.c();
                    }
                }
            }
        }
    }
}
