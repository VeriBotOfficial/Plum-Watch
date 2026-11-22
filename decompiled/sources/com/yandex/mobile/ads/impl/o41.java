package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a81;
import com.yandex.mobile.ads.impl.n92;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class o41 implements a81 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ig<?>> f16407a;
    private final w71 b;
    private String c;
    private g71 d;

    /* JADX WARN: Multi-variable type inference failed */
    public o41(List<? extends ig<?>> assets, w71 nativeAdsConfiguration) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        this.f16407a = assets;
        this.b = nativeAdsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(o41 this$0, List assets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj : assets) {
            if (((ig) obj).f()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ig<?> igVar = (ig) it.next();
            g71 g71Var = this$0.d;
            jg<?> a2 = g71Var != null ? g71Var.a(igVar) : null;
            if (a2 != null && a2.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(o41 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((ig) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ig<?> igVar = (ig) obj;
            g71 g71Var = this$0.d;
            jg<?> a2 = g71Var != null ? g71Var.a(igVar) : null;
            if (!(a2 instanceof jg)) {
                a2 = null;
            }
            if (a2 == null || !a2.a(igVar.d())) {
                break;
            }
        }
        ig igVar2 = (ig) obj;
        this$0.c = igVar2 != null ? igVar2.b() : null;
        return igVar2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(o41 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((ig) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ig<?> igVar = (ig) obj;
            g71 g71Var = this$0.d;
            jg<?> a2 = g71Var != null ? g71Var.a(igVar) : null;
            if (a2 == null || !a2.e()) {
                break;
            }
        }
        ig igVar2 = (ig) obj;
        this$0.c = igVar2 != null ? igVar2.b() : null;
        return igVar2 == null;
    }

    public final boolean e() {
        return !a(new a81.a() { // from class: com.yandex.mobile.ads.impl.o41$$ExternalSyntheticLambda3
            @Override // com.yandex.mobile.ads.impl.a81.a
            public final boolean a(List list) {
                boolean c;
                c = o41.c(o41.this, list);
                return c;
            }
        });
    }

    public final boolean d() {
        return !a(new a81.a() { // from class: com.yandex.mobile.ads.impl.o41$$ExternalSyntheticLambda1
            @Override // com.yandex.mobile.ads.impl.a81.a
            public final boolean a(List list) {
                boolean b;
                b = o41.b(o41.this, list);
                return b;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(o41 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((ig) obj2).f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ig<?> igVar = (ig) obj;
            g71 g71Var = this$0.d;
            jg<?> a2 = g71Var != null ? g71Var.a(igVar) : null;
            if (a2 == null || !a2.b()) {
                break;
            }
        }
        ig igVar2 = (ig) obj;
        this$0.c = igVar2 != null ? igVar2.b() : null;
        return igVar2 == null;
    }

    public boolean a(a81.a validator, List<? extends ig<?>> assets) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.b.c();
        return validator.a(assets);
    }

    public final w71 b() {
        return this.b;
    }

    public final boolean c() {
        return !a(new a81.a() { // from class: com.yandex.mobile.ads.impl.o41$$ExternalSyntheticLambda2
            @Override // com.yandex.mobile.ads.impl.a81.a
            public final boolean a(List list) {
                boolean a2;
                a2 = o41.a(o41.this, list);
                return a2;
            }
        });
    }

    private final boolean a(a81.a aVar) {
        return this.d != null && a(aVar, this.f16407a);
    }

    @Override // com.yandex.mobile.ads.impl.a81
    public final void a(g71 g71Var) {
        this.d = g71Var;
    }

    @Override // com.yandex.mobile.ads.impl.a81
    public final qq1 a() {
        return new qq1(this.c, a(new a81.a() { // from class: com.yandex.mobile.ads.impl.o41$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.a81.a
            public final boolean a(List list) {
                boolean d;
                d = o41.d(o41.this, list);
                return d;
            }
        }));
    }

    @Override // com.yandex.mobile.ads.impl.a81
    public final z71 a(boolean z) {
        n92.a aVar;
        List<ig<?>> list = this.f16407a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((ig) it.next()).f() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            if (i >= 2 && c() && !z) {
                aVar = n92.a.h;
                return new z71(aVar, this.c);
            }
        }
        if (e()) {
            aVar = n92.a.k;
        } else {
            aVar = d() ? n92.a.e : n92.a.c;
        }
        return new z71(aVar, this.c);
    }
}
