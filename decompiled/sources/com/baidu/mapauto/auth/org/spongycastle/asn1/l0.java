package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes13.dex */
public final class l0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f8277a;

    public l0(char[] cArr) {
        this.f8277a = cArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) throws IOException {
        pVar.a(30);
        pVar.b(this.f8277a.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f8277a;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            pVar.a((byte) (c >> '\b'));
            pVar.a((byte) c);
            i++;
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof l0)) {
            return false;
        }
        char[] cArr = this.f8277a;
        char[] cArr2 = ((l0) rVar).f8277a;
        if (cArr == cArr2) {
            return true;
        }
        if (cArr != null && cArr2 != null && cArr.length == cArr2.length) {
            for (int i = 0; i != cArr.length; i++) {
                if (cArr[i] == cArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return (this.f8277a.length * 2) + u1.a(this.f8277a.length * 2) + 1;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        char[] cArr = this.f8277a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return new String(this.f8277a);
    }
}
