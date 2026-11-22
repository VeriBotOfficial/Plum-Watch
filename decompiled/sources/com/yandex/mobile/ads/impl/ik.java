package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public abstract class ik implements uh {
    protected uh.a b;
    protected uh.a c;
    private uh.a d;
    private uh.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    protected abstract uh.a b(uh.a aVar) throws uh.b;

    protected void f() {
    }

    protected void g() {
    }

    protected void h() {
    }

    public ik() {
        ByteBuffer byteBuffer = uh.f17051a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        uh.a aVar = uh.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final uh.a a(uh.a aVar) throws uh.b {
        this.d = aVar;
        this.e = b(aVar);
        return isActive() ? this.e : uh.a.e;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public boolean isActive() {
        return this.e != uh.a.e;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void d() {
        this.h = true;
        g();
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = uh.f17051a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void flush() {
        this.g = uh.f17051a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        f();
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public final void b() {
        flush();
        this.f = uh.f17051a;
        uh.a aVar = uh.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        h();
    }

    protected final boolean e() {
        return this.g.hasRemaining();
    }

    @Override // com.yandex.mobile.ads.impl.uh
    public boolean a() {
        return this.h && this.g == uh.f17051a;
    }

    protected final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
