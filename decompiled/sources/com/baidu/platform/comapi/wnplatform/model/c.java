package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;

/* compiled from: DataModelManager.java */
/* loaded from: classes13.dex */
public class c extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private g f8927a;
    private d b = null;
    private b c = null;
    private i d = null;

    public void a(Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        d().a(bundle, i);
    }

    public b b() {
        if (this.c == null) {
            this.c = new b();
        }
        return this.c;
    }

    public d c() {
        if (this.b == null) {
            this.b = new d();
        }
        return this.b;
    }

    public g d() {
        if (this.f8927a == null) {
            this.f8927a = new g();
        }
        return this.f8927a;
    }

    public i e() {
        if (this.d == null) {
            this.d = new i();
        }
        return this.d;
    }

    public boolean g(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return c().a(bundle);
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        this.f8927a = null;
    }

    public void a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return;
        }
        e().a(bundleArr);
    }

    public boolean a(com.baidu.platform.comapi.wnplatform.e.a aVar) {
        if (aVar == null) {
            return false;
        }
        return d().a(aVar);
    }

    public void c(int i) {
        b().a(i);
    }
}
