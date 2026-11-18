package com.anythink.core.common.s.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f4327a = new HashMap();
    private final ReferenceQueue<Object> b = new ReferenceQueue<>();

    m() {
    }

    final synchronized Object a(String str) {
        b();
        a aVar = this.f4327a.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    final synchronized void a(String str, Object obj) {
        a aVar;
        b();
        if (obj != null && ((aVar = this.f4327a.get(str)) == null || aVar.get() != obj)) {
            this.f4327a.put(str, new a(str, obj, this.b));
        }
    }

    final synchronized void b(String str) {
        this.f4327a.remove(str);
    }

    final synchronized void a() {
        this.f4327a.clear();
        b();
    }

    private void b() {
        a aVar = (a) this.b.poll();
        while (aVar != null) {
            a aVar2 = this.f4327a.get(aVar.f4328a);
            if (aVar2 != null && aVar2.get() == null) {
                this.f4327a.remove(aVar.f4328a);
            }
            aVar = (a) this.b.poll();
        }
    }

    private static class a extends WeakReference<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4328a;

        a(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f4328a = str;
        }
    }
}
