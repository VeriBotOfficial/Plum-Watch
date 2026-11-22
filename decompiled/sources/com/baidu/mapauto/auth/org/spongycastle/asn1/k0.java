package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes13.dex */
public final class k0 extends a {
    public k0(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.a, com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        int i = this.f8254a ? 96 : 64;
        int i2 = this.b;
        byte[] bArr = this.c;
        pVar.a(i, i2);
        pVar.b(bArr.length);
        pVar.f8283a.write(bArr);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        if (this.f8254a) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(this.b));
        stringBuffer.append("]");
        if (this.c != null) {
            stringBuffer.append(" #");
            byte[] bArr = this.c;
            com.baidu.mapauto.auth.org.spongycastle.util.encoders.e eVar = com.baidu.mapauto.auth.org.spongycastle.util.encoders.d.f8312a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                eVar.getClass();
                for (byte b : bArr) {
                    byteArrayOutputStream.write(eVar.f8313a[(b & 255) >>> 4]);
                    byteArrayOutputStream.write(eVar.f8313a[b & 15]);
                }
                stringBuffer.append(com.baidu.mapauto.auth.org.spongycastle.util.d.a(byteArrayOutputStream.toByteArray()));
            } catch (Exception e) {
                throw new com.baidu.mapauto.auth.org.spongycastle.util.encoders.c(com.baidu.mapauto.auth.b.a("exception encoding Hex string: ").append(e.getMessage()).toString(), e);
            }
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
