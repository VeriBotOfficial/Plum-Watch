package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;

/* loaded from: classes11.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final int f2611a;
    private final Object b;

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j, long j2) {
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return 0;
    }

    public static final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f2612a;
        private final Object b;

        public a() {
            this.f2612a = 0;
            this.b = null;
        }

        private a(int i, Object obj) {
            this.f2612a = i;
            this.b = obj;
        }

        private d b(ae aeVar, int... iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f2612a, this.b);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == 1);
            return new d(aeVar, iArr[0], this.f2612a, this.b);
        }
    }

    public d(ae aeVar, int i) {
        this(aeVar, i, 0, null);
    }

    public d(ae aeVar, int i, int i2, Object obj) {
        super(aeVar, i);
        this.f2611a = i2;
        this.b = obj;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f2611a;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return this.b;
    }
}
