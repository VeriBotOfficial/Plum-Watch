package com.anythink.core.basead.a;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3552a;
    private final boolean b;
    private final String c;

    /* synthetic */ c(a aVar, byte b) {
        this(aVar);
    }

    private c(a aVar) {
        this.f3552a = aVar.f3553a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final String a() {
        return this.f3552a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3553a;
        private boolean b;
        private String c;

        public final a a(String str) {
            this.f3553a = str;
            return this;
        }

        public final a a(boolean z) {
            this.b = z;
            return this;
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final c a() {
            return new c(this, (byte) 0);
        }
    }
}
