package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3486q2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pl fromModel(C3461p2 c3461p2) {
        Nl nl;
        Pl pl2 = new Pl();
        pl2.f18017a = new Ol[c3461p2.f18442a.size()];
        for (int i = 0; i < c3461p2.f18442a.size(); i++) {
            Ol ol = new Ol();
            Pair pair = (Pair) c3461p2.f18442a.get(i);
            ol.f18003a = (String) pair.first;
            if (pair.second != null) {
                ol.b = new Nl();
                C3436o2 c3436o2 = (C3436o2) pair.second;
                if (c3436o2 == null) {
                    nl = null;
                } else {
                    Nl nl2 = new Nl();
                    nl2.f17988a = c3436o2.f18425a;
                    nl = nl2;
                }
                ol.b = nl;
            }
            pl2.f18017a[i] = ol;
        }
        return pl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3461p2 toModel(Pl pl2) {
        ArrayList arrayList = new ArrayList();
        for (Ol ol : pl2.f18017a) {
            String str = ol.f18003a;
            Nl nl = ol.b;
            arrayList.add(new Pair(str, nl == null ? null : new C3436o2(nl.f17988a)));
        }
        return new C3461p2(arrayList);
    }
}
