package com.anythink.basead.g;

import com.anythink.core.common.a.b;
import com.anythink.core.common.u.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2789a = "b";
    private Map<String, AbstractC0158b> b;

    /* synthetic */ b(byte b) {
        this();
    }

    private b() {
        this.b = new HashMap(2);
    }

    public static b a() {
        return a.f2790a;
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f2790a = new b(0);

        private a() {
        }
    }

    public final void a(String str, AbstractC0158b abstractC0158b) {
        this.b.put(str, abstractC0158b);
    }

    public final AbstractC0158b a(String str) {
        return this.b.get(str);
    }

    public final void b(String str) {
        this.b.remove(str);
    }

    /* renamed from: com.anythink.basead.g.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0158b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f2791a;
        private int b;
        private volatile boolean c = false;

        public abstract void a();

        public abstract void a(com.anythink.basead.d.f fVar);

        public abstract void a(j jVar);

        public abstract void a(boolean z);

        public abstract void b();

        public abstract void b(j jVar);

        public abstract void c();

        public AbstractC0158b() {
        }

        public AbstractC0158b(Map<String, Object> map, final String str) {
            this.f2791a = map;
            com.anythink.core.common.u.a.a().a(str, new a.InterfaceC0215a() { // from class: com.anythink.basead.g.b.b.1
                @Override // com.anythink.core.common.u.a.InterfaceC0215a
                public final void a(String str2) {
                    if (!str.equals(str2) || AbstractC0158b.this.c) {
                        return;
                    }
                    AbstractC0158b.this.a(3);
                    AbstractC0158b.this.d();
                }
            });
        }

        public void d() {
            if (this.c) {
                return;
            }
            this.c = true;
            Map<String, Object> map = this.f2791a;
            if (map != null) {
                map.put(b.C0190b.f3606a, Integer.valueOf(this.b));
            }
        }

        public final int e() {
            return this.b;
        }

        public final void a(int i) {
            this.b = i;
        }
    }
}
