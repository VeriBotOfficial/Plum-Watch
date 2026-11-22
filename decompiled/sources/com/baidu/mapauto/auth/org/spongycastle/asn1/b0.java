package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes13.dex */
public final class b0 extends n {
    public n[] b;

    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        public int f8258a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f8258a < b0.this.b.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            n[] nVarArr = b0.this.b;
            int i = this.f8258a;
            this.f8258a = i + 1;
            return nVarArr[i];
        }
    }

    public b0(byte[] bArr) {
        super(bArr);
    }

    public b0(n[] nVarArr) {
        super(a(nVarArr));
        this.b = nVarArr;
    }

    public static byte[] a(n[] nVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != nVarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((v0) nVarArr[i]).f8280a);
            } catch (IOException e) {
                throw new IllegalArgumentException(com.baidu.mapauto.auth.b.a("exception converting octets ").append(e.toString()).toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(nVarArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(36);
        pVar.a(128);
        Enumeration j = j();
        while (j.hasMoreElements()) {
            pVar.a((d) j.nextElement());
        }
        pVar.a(0);
        pVar.a(0);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() throws IOException {
        Enumeration j = j();
        int i = 0;
        while (j.hasMoreElements()) {
            i += ((d) j.nextElement()).c().e();
        }
        return i + 4;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.n
    public final byte[] i() {
        return this.f8280a;
    }

    public final Enumeration j() {
        if (this.b != null) {
            return new a();
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f8280a;
            if (i >= bArr.length) {
                return vector.elements();
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new v0(bArr2));
            i = i2;
        }
    }
}
