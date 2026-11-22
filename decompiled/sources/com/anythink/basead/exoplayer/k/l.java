package com.anythink.basead.exoplayer.k;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f2682a;
    private boolean b;
    private boolean c;

    private l(String... strArr) {
        this.f2682a = strArr;
    }

    private void a(String... strArr) {
        a.b(!this.b, "Cannot set libraries after loading");
        this.f2682a = strArr;
    }

    private boolean a() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        try {
            for (String str : this.f2682a) {
                System.loadLibrary(str);
            }
            this.c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.c;
    }
}
