package com.vivo.push.i;

import java.util.ArrayList;

/* compiled from: TestManager.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f14101a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test"};
    private ArrayList<String> b;

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0931a.f14102a;
    }

    /* compiled from: TestManager.java */
    /* renamed from: com.vivo.push.i.a$a, reason: collision with other inner class name */
    private static class C0931a {

        /* renamed from: a, reason: collision with root package name */
        private static a f14102a = new a(0);
    }

    private a() {
        this.b = null;
        this.b = new ArrayList<>();
    }

    public final boolean b() {
        ArrayList<String> arrayList = this.b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }
}
