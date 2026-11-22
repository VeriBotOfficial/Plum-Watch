package com.qumeng.overseas.advlib.__remote__.core.component;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.component.ApplovinComponentFactory;
import com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.component.TopOnComponentFactory;
import com.qumeng.overseas.advlib.trdparty.unionset.component.DspComponentFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class c {
    private static final List<Class<? extends com.qumeng.overseas.advlib.__remote__.core.component.a>> b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private List<d> f12823a = new ArrayList();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f12824a = new c();

        private b() {
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.core.component.c$c, reason: collision with other inner class name */
    private class C0784c implements com.qumeng.overseas.advlib.__remote__.core.component.b {
        private C0784c() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.component.b
        public com.qumeng.overseas.advlib.__remote__.core.component.a loadFactory(Class<? extends com.qumeng.overseas.advlib.__remote__.core.component.a> cls) throws ClassNotFoundException {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public c() {
        b(new C0784c());
    }

    public static c a() {
        return b.f12824a;
    }

    private void b(com.qumeng.overseas.advlib.__remote__.core.component.b bVar) {
        b();
        n.a("ComponentManager", "initOtherComponentFactories --->> start", new Object[0]);
        c();
        n.a("ComponentManager", "initOtherComponentFactories --->> end = " + b.size(), new Object[0]);
        a(bVar);
    }

    private void c() {
        List<Class<? extends com.qumeng.overseas.advlib.__remote__.core.component.a>> list = b;
        list.add(ApplovinComponentFactory.class);
        list.add(TopOnComponentFactory.class);
    }

    private void a(com.qumeng.overseas.advlib.__remote__.core.component.b bVar) {
        int i = 0;
        while (true) {
            List<Class<? extends com.qumeng.overseas.advlib.__remote__.core.component.a>> list = b;
            if (i >= list.size()) {
                return;
            }
            try {
                n.a("ComponentManager", "component cls --->> " + list.get(i), new Object[0]);
                com.qumeng.overseas.advlib.__remote__.core.component.a loadFactory = bVar.loadFactory(list.get(i));
                if (loadFactory != null) {
                    this.f12823a.add(loadFactory.a());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public void c(QMConfig qMConfig) {
        if (this.f12823a.isEmpty()) {
            return;
        }
        for (int size = this.f12823a.size() - 1; size >= 0; size--) {
            try {
                this.f12823a.get(size).a(qMConfig);
            } catch (Throwable unused) {
            }
        }
    }

    private void b() {
        this.f12823a.add(new DspComponentFactory().a());
    }

    public void b(QMConfig qMConfig) {
        if (this.f12823a.isEmpty()) {
            return;
        }
        for (int size = this.f12823a.size() - 1; size >= 0; size--) {
            try {
                this.f12823a.get(size).c(qMConfig);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(String str) {
        try {
            b.add(Class.forName(str));
        } catch (Throwable th) {
            n.a("ComponentManager", "initOtherComponentFactories error --->> " + th.getMessage(), new Object[0]);
        }
    }

    public void a(QMConfig qMConfig) {
        if (this.f12823a.isEmpty()) {
            return;
        }
        for (int size = this.f12823a.size() - 1; size >= 0; size--) {
            try {
                this.f12823a.get(size).b(qMConfig);
            } catch (Throwable unused) {
            }
        }
    }
}
