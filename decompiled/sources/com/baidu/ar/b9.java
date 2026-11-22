package com.baidu.ar;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes12.dex */
public class b9 {
    public static volatile b9 c;

    /* renamed from: a, reason: collision with root package name */
    public int f6806a = -1;
    public Set<q3> b = new HashSet();

    public static b9 b() {
        if (c == null) {
            synchronized (b9.class) {
                if (c == null) {
                    c = new b9();
                }
            }
        }
        return c;
    }

    public void a() {
        h.a("MultEngineManager", "clearListeners");
        this.b.clear();
    }

    public void a(int i) {
        this.f6806a = i;
        h.a("MultEngineManager", "setupEngine sdkType:" + i + " " + this.b.size());
        Set<q3> set = this.b;
        if (set == null || set.isEmpty()) {
            return;
        }
        for (q3 q3Var : this.b) {
            if (q3Var != null) {
                q3Var.onEngineCreate(i);
            }
        }
    }

    public boolean c() {
        return this.f6806a == 2;
    }

    public void d() {
        h.a("MultEngineManager", "release");
        this.f6806a = -1;
        a();
    }
}
