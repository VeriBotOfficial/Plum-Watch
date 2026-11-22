package com.mbridge.msdk.mbsignalcommon.mapping;

/* compiled from: Mapping.java */
/* loaded from: classes17.dex */
public class a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f11863a;
    private String b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f11863a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getCause() != null ? getClass().getName() + ": " + getCause() : super.toString();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.b = str;
    }
}
