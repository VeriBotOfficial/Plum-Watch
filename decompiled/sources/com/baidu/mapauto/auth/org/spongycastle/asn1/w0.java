package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public final class w0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public o1 f8299a;

    public w0(o1 o1Var) {
        this.f8299a = o1Var;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() throws IOException {
        return new v0(this.f8299a.c());
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.o
    public final InputStream b() {
        return this.f8299a;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.d
    public final r c() {
        try {
            return a();
        } catch (IOException e) {
            throw new q(com.baidu.mapauto.auth.b.a("IOException converting stream to byte array: ").append(e.getMessage()).toString(), e);
        }
    }
}
