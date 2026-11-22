package com.baidu.bbalbscesium.k.d;

import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private c f7429a;

    private a() {
    }

    public static a a() throws NoSuchPaddingException {
        a aVar = new a();
        c cVar = new c();
        aVar.f7429a = cVar;
        cVar.b(c.p);
        return aVar;
    }

    public void a(int i, d dVar) throws InvalidKeyException {
        this.f7429a.a(i, dVar, b.f7430a);
    }

    public final byte[] a(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            return this.f7429a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
