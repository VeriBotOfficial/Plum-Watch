package com.anythink.expressad.e.a;

/* loaded from: classes12.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4745a = "AppletSchemeCallBack";

    protected abstract void a();

    protected abstract void a(int i, String str, String str2);

    protected abstract void a(String str);

    @Override // com.anythink.expressad.e.a.d
    public final void b() {
        try {
            a();
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void b(String str) {
        try {
            a(str);
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void b(int i, String str, String str2) {
        try {
            a(i, str, str2);
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.e.a.d
    public final void c(int i, String str, String str2) {
        try {
            a(i, str, str2);
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.getMessage();
            }
        }
    }
}
