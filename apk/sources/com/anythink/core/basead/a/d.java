package com.anythink.core.basead.a;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3554a;
    private final String b;

    /* synthetic */ d(a aVar, byte b) {
        this(aVar);
    }

    private d(a aVar) {
        this.f3554a = aVar.f3555a;
        this.b = aVar.b;
    }

    public final int a() {
        return this.f3554a;
    }

    public final String b() {
        return this.b;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3555a;
        private String b;

        public final a a(int r1) {
            this.f3555a = r1;
            return this;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final d a() {
            return new d(this, (byte) 0);
        }
    }
}
