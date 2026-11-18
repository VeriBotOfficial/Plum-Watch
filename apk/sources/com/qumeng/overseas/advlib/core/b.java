package com.qumeng.overseas.advlib.core;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13264a;

    /* JADX INFO: renamed from: com.qumeng.overseas.advlib.core.b$b, reason: collision with other inner class name */
    public static final class C0951b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13265a;

        public b build() {
            return new b(this);
        }

        public C0951b setDt(int r1) {
            this.f13265a = r1;
            return this;
        }
    }

    public int a() {
        return this.f13264a;
    }

    private b(C0951b c0951b) {
        this.f13264a = c0951b.f13265a;
    }
}
