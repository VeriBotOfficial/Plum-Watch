package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3668xa extends M2 {
    public final Aa b;

    public C3668xa(int i) {
        this(i, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C3668xa(int i, Aa aa) {
        super(i);
        this.b = aa;
    }

    @Override // io.appmetrica.analytics.impl.M2, io.appmetrica.analytics.impl.Aa
    public final C3332jn a(List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.f17968a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.f17968a) {
                    Aa aa = this.b;
                    if (aa != null) {
                        C3332jn a2 = aa.a(obj);
                        Object obj2 = a2.f18349a;
                        i += a2.b.getBytesTruncated();
                        In.a(obj, a2.f18349a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new C3332jn(list, new E4(i2, i));
    }

    public final Aa b() {
        return this.b;
    }
}
