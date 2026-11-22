package com.anythink.core.common.h;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private String f3915a;
    private String b;
    private int c;

    public i(String str, String str2, int i) {
        this.f3915a = str;
        this.b = str2;
        this.c = i;
    }

    private String b() {
        return this.f3915a;
    }

    public final String a() {
        return this.b;
    }

    private int c() {
        return this.c;
    }

    public final boolean a(bv bvVar) {
        if (bvVar != null) {
            int i = bvVar.f3889a;
            if (i != 2) {
                return i == 3 && bvVar.g() == this.c;
            }
            return bvVar.z().equals(this.f3915a);
        }
        return false;
    }
}
