package com.bykv.vk.openvk.preload.geckox.a.a;

/* compiled from: CacheConfig.java */
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f9172a;
    final c b;
    private final b c;

    /* synthetic */ a(C0450a c0450a, byte b) {
        this(c0450a);
    }

    private a(C0450a c0450a) {
        this.f9172a = c0450a.f9173a;
        this.c = c0450a.b;
        this.b = c0450a.c;
    }

    public final b a() {
        return this.c;
    }

    /* compiled from: CacheConfig.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0450a {

        /* renamed from: a, reason: collision with root package name */
        private int f9173a;
        private b b = b.f9174a;
        private c c;

        public final C0450a a() {
            this.f9173a = 20;
            return this;
        }

        public final C0450a a(b bVar) {
            if (bVar == null) {
                bVar = b.f9174a;
            }
            this.b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }
    }
}
