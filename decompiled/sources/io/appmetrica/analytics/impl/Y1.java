package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Y1 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final F2 f18145a;

    public Y1() {
        this(new F2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3112b2 fromModel(X1 x1) {
        C3112b2 c3112b2 = new C3112b2();
        c3112b2.f18192a = new C3087a2[x1.f18129a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : x1.f18129a) {
            C3087a2[] c3087a2Arr = c3112b2.f18192a;
            C3087a2 c3087a2 = new C3087a2();
            c3087a2.f18176a = permissionState.name;
            c3087a2.b = permissionState.granted;
            c3087a2Arr[i2] = c3087a2;
            i2++;
        }
        H2 h2 = x1.b;
        if (h2 != null) {
            c3112b2.b = this.f18145a.fromModel(h2);
        }
        c3112b2.c = new String[x1.c.size()];
        Iterator it = x1.c.iterator();
        while (it.hasNext()) {
            c3112b2.c[i] = (String) it.next();
            i++;
        }
        return c3112b2;
    }

    public Y1(F2 f2) {
        this.f18145a = f2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 toModel(C3112b2 c3112b2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C3087a2[] c3087a2Arr = c3112b2.f18192a;
            if (i2 >= c3087a2Arr.length) {
                break;
            }
            C3087a2 c3087a2 = c3087a2Arr[i2];
            arrayList.add(new PermissionState(c3087a2.f18176a, c3087a2.b));
            i2++;
        }
        Z1 z1 = c3112b2.b;
        H2 model = z1 != null ? this.f18145a.toModel(z1) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c3112b2.c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new X1(arrayList, model, arrayList2);
            }
        }
    }
}
