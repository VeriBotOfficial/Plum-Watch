package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.xn2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class oo2 implements xn2 {

    /* renamed from: a, reason: collision with root package name */
    private final xn2 f16473a;

    @Override // com.yandex.mobile.ads.impl.xn2
    public final JSONObject a(View view) {
        return io2.a(0, 0, 0, 0);
    }

    public oo2(so2 so2Var) {
        this.f16473a = so2Var;
    }

    @Override // com.yandex.mobile.ads.impl.xn2
    public final void a(View view, JSONObject jSONObject, xn2.a aVar, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        wn2 a2 = wn2.a();
        if (a2 != null) {
            Collection<vn2> c = a2.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            Iterator<vn2> it = c.iterator();
            while (it.hasNext()) {
                View f = it.next().f();
                if (f != null && ap2.b(f) && (rootView = f.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a3 = ap2.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && ap2.a((View) arrayList.get(size - 1)) > a3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((g72) aVar).a((View) it2.next(), this.f16473a, jSONObject, z2);
        }
    }
}
