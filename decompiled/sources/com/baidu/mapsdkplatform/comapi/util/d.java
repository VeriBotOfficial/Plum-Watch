package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: MapSDKAdvancedPermission.java */
/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f8400a = Executors.newSingleThreadExecutor();
    private static int b = -1;
    private static int c = -1;
    private final List<IAdvPermissionUpdateListener> d;
    private int e;
    private int f;
    private Context g;

    /* compiled from: MapSDKAdvancedPermission.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8401a;

        a(String str) {
            this.f8401a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int unused = d.b = d.this.g.getSharedPreferences("ad_auth", 0).getInt(this.f8401a, 0);
        }
    }

    /* compiled from: MapSDKAdvancedPermission.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8402a;

        b(String str) {
            this.f8402a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int unused = d.c = d.this.g.getSharedPreferences("ad_auth", 0).getInt(this.f8402a, 0);
        }
    }

    /* compiled from: MapSDKAdvancedPermission.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8403a;
        final /* synthetic */ int b;

        c(String str, int i) {
            this.f8403a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.g.getSharedPreferences("ad_auth", 0).edit().putInt(this.f8403a, this.b).apply();
        }
    }

    /* compiled from: MapSDKAdvancedPermission.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.util.d$d, reason: collision with other inner class name */
    class RunnableC0383d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8404a;
        final /* synthetic */ int b;

        RunnableC0383d(String str, int i) {
            this.f8404a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.g.getSharedPreferences("ad_auth", 0).edit().putInt(this.f8404a, this.b).apply();
        }
    }

    /* compiled from: MapSDKAdvancedPermission.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final d f8405a = new d(null);
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    private void k() {
        synchronized (this.d) {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).onAdvPermissionUpdate(this.e);
            }
        }
    }

    public void c(int i) {
        if (i == -1 && (i = a("ad_key")) == -101) {
            return;
        }
        this.e = i;
        a("ad_key", i);
        k();
    }

    public void d(int i) {
        if (i == -1 && (i = b("ad_key_user")) == -101) {
            return;
        }
        this.f = i;
        b("ad_key_user", i);
    }

    public boolean e() {
        int i = this.e;
        return i >= 0 && (i & 134217728) == 134217728;
    }

    public boolean f() {
        int i = this.e;
        return i >= 0 && (i & 65536) == 65536;
    }

    public boolean g() {
        int i = this.e;
        return i >= 0 && (i & 1073741824) == 1073741824;
    }

    public boolean h() {
        int i = this.e;
        return i >= 0 && (i & 1) == 1;
    }

    public boolean i() {
        int i = this.f;
        return i >= 0 && (i & 268435456) == 268435456;
    }

    public boolean j() {
        int i = this.e;
        return i >= 0 && (i & 1024) == 1024;
    }

    private d() {
        this.d = new CopyOnWriteArrayList();
        this.e = -1;
    }

    public static d b() {
        return e.f8405a;
    }

    private int b(String str) {
        if (this.g == null) {
            return com.anythink.basead.ui.f.d.b;
        }
        if (c == -1) {
            f8400a.execute(new b(str));
        }
        return c;
    }

    public void a(Context context) {
        this.g = context;
    }

    public int a() {
        return this.e;
    }

    private int a(String str) {
        if (this.g == null) {
            return com.anythink.basead.ui.f.d.b;
        }
        if (b == -1) {
            f8400a.execute(new a(str));
        }
        return b;
    }

    public boolean d() {
        int i = this.e;
        return i >= 0 && (i & 67108864) == 67108864;
    }

    public boolean c() {
        int i = this.e;
        return i >= 0 && (i & 33554432) == 33554432;
    }

    private void b(String str, int i) {
        if (this.g == null) {
            return;
        }
        c = i;
        f8400a.execute(new RunnableC0383d(str, i));
    }

    private void a(String str, int i) {
        if (this.g == null) {
            return;
        }
        b = i;
        f8400a.execute(new c(str, i));
    }
}
