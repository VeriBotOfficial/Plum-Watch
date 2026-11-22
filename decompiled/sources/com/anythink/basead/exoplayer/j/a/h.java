package com.anythink.basead.exoplayer.j.a;

import android.util.SparseArray;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes11.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2628a = "cached_content_index.exi";
    private static final int b = 2;
    private static final int c = 1;
    private final HashMap<String, g> d;
    private final SparseArray<String> e;
    private final com.anythink.basead.exoplayer.k.b f;
    private final Cipher g;
    private final SecretKeySpec h;
    private final boolean i;
    private boolean j;
    private x k;

    private h(File file) {
        this(file, null);
    }

    private h(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    public h(File file, byte[] bArr, boolean z) {
        this.i = z;
        if (bArr != null) {
            com.anythink.basead.exoplayer.k.a.a(bArr.length == 16);
            try {
                this.g = h();
                this.h = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            com.anythink.basead.exoplayer.k.a.b(!z);
            this.g = null;
            this.h = null;
        }
        this.d = new HashMap<>();
        this.e = new SparseArray<>();
        this.f = new com.anythink.basead.exoplayer.k.b(new File(file, "cached_content_index.exi"));
    }

    public final void a() {
        com.anythink.basead.exoplayer.k.a.b(!this.j);
        if (f()) {
            return;
        }
        this.f.a();
        this.d.clear();
        this.e.clear();
    }

    public final void b() {
        DataOutputStream dataOutputStream;
        if (this.j) {
            Closeable closeable = null;
            try {
                try {
                    OutputStream b2 = this.f.b();
                    x xVar = this.k;
                    if (xVar == null) {
                        this.k = new x(b2);
                    } else {
                        xVar.a(b2);
                    }
                    dataOutputStream = new DataOutputStream(this.k);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.i ? 1 : 0);
                if (this.i) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.g.init(1, this.h, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.k, this.g));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.d.size());
                int i = 0;
                for (g gVar : this.d.values()) {
                    gVar.a(dataOutputStream);
                    i += gVar.a(2);
                }
                dataOutputStream.writeInt(i);
                this.f.a(dataOutputStream);
                af.a((Closeable) null);
                this.j = false;
            } catch (IOException e4) {
                e = e4;
                throw new a.C0150a(e);
            } catch (Throwable th2) {
                th = th2;
                closeable = dataOutputStream;
                af.a(closeable);
                throw th;
            }
        }
    }

    public final g a(String str) {
        g gVar = this.d.get(str);
        if (gVar != null) {
            return gVar;
        }
        SparseArray<String> sparseArray = this.e;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        g gVar2 = new g(keyAt, str);
        a(gVar2);
        this.j = true;
        return gVar2;
    }

    public final g b(String str) {
        return this.d.get(str);
    }

    public final Collection<g> c() {
        return this.d.values();
    }

    public final int c(String str) {
        return a(str).f2627a;
    }

    public final String a(int i) {
        return this.e.get(i);
    }

    public final void d(String str) {
        g gVar = this.d.get(str);
        if (gVar == null || !gVar.d() || gVar.b()) {
            return;
        }
        this.d.remove(str);
        this.e.remove(gVar.f2627a);
        this.j = true;
    }

    public final void d() {
        int size = this.d.size();
        String[] strArr = new String[size];
        this.d.keySet().toArray(strArr);
        for (int i = 0; i < size; i++) {
            d(strArr[i]);
        }
    }

    public final Set<String> e() {
        return this.d.keySet();
    }

    public final void a(String str, k kVar) {
        if (a(str).a(kVar)) {
            this.j = true;
        }
    }

    public final i e(String str) {
        g b2 = b(str);
        return b2 != null ? b2.a() : l.b;
    }

    private boolean f() {
        DataInputStream dataInputStream = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f.c());
            DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
            try {
                int readInt = dataInputStream2.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream2.readInt() & 1) != 0) {
                        if (this.g != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.g.init(2, this.h, new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.g));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else {
                            af.a((Closeable) dataInputStream2);
                            return false;
                        }
                    } else if (this.i) {
                        this.j = true;
                    }
                    int readInt2 = dataInputStream2.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        g a2 = g.a(readInt, dataInputStream2);
                        a(a2);
                        i += a2.a(readInt);
                    }
                    int readInt3 = dataInputStream2.readInt();
                    boolean z = dataInputStream2.read() == -1;
                    if (readInt3 == i && z) {
                        af.a((Closeable) dataInputStream2);
                        return true;
                    }
                    af.a((Closeable) dataInputStream2);
                    return false;
                }
                af.a((Closeable) dataInputStream2);
                return false;
            } catch (IOException unused) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    af.a((Closeable) dataInputStream);
                }
                return false;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    af.a((Closeable) dataInputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void g() {
        DataOutputStream dataOutputStream;
        Closeable closeable = null;
        try {
            try {
                OutputStream b2 = this.f.b();
                x xVar = this.k;
                if (xVar == null) {
                    this.k = new x(b2);
                } else {
                    xVar.a(b2);
                }
                dataOutputStream = new DataOutputStream(this.k);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            dataOutputStream.writeInt(2);
            int i = 0;
            dataOutputStream.writeInt(this.i ? 1 : 0);
            if (this.i) {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.g.init(1, this.h, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(this.k, this.g));
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(this.d.size());
            for (g gVar : this.d.values()) {
                gVar.a(dataOutputStream);
                i += gVar.a(2);
            }
            dataOutputStream.writeInt(i);
            this.f.a(dataOutputStream);
            af.a((Closeable) null);
        } catch (IOException e4) {
            e = e4;
            throw new a.C0150a(e);
        } catch (Throwable th2) {
            th = th2;
            closeable = dataOutputStream;
            af.a(closeable);
            throw th;
        }
    }

    private g f(String str) {
        SparseArray<String> sparseArray = this.e;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        g gVar = new g(keyAt, str);
        a(gVar);
        this.j = true;
        return gVar;
    }

    private void a(g gVar) {
        this.d.put(gVar.b, gVar);
        this.e.put(gVar.f2627a, gVar.b);
    }

    private static Cipher h() {
        if (af.f2668a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", BouncyCastleProvider.PROVIDER_NAME);
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    private static int a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }
}
