package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private a f4842a;
    private String b;
    private e c;
    private List<e> d;

    public final a a() {
        return this.f4842a;
    }

    public final void a(a aVar) {
        this.f4842a = aVar;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final e c() {
        return this.c;
    }

    private void a(e eVar) {
        this.c = eVar;
    }

    public final List<e> d() {
        return this.d;
    }

    private void b(e eVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        eVar.c = this;
        this.d.add(eVar);
    }

    public final void a(a aVar, String str) {
        e eVar = new e();
        eVar.f4842a = aVar;
        eVar.b = str;
        b(eVar);
    }

    public final void a(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
