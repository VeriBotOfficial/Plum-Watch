package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3369la {
    public static final C3369la d = new C3369la();

    /* renamed from: a, reason: collision with root package name */
    public final C3546sd f18376a = new C3546sd();
    public final ServiceComponentsInitializer b = Mj.a();
    public boolean c = false;

    public final void a(Context context) {
        C3593ua.a(context);
        this.b.onCreate(context);
        this.f18376a.getClass();
        for (String str : C3593ua.E.s.a()) {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                C3593ua.E.o().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new Xj(C3593ua.j().B().b()).a(context);
        C3593ua.E.p().a();
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (!this.c) {
                a(context);
                this.c = true;
            }
        }
    }
}
