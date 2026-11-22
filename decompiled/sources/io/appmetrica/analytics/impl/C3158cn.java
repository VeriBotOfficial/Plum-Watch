package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3158cn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3181dl f18222a;

    public C3158cn() {
        this(new C3181dl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3390m6 fromModel(C3183dn c3183dn) {
        C3390m6 c3390m6 = new C3390m6();
        c3390m6.f18393a = (String) WrapUtils.getOrDefault(c3183dn.f18243a, "");
        c3390m6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c3183dn.b, ""));
        List<C3231fl> list = c3183dn.c;
        if (list != null) {
            c3390m6.c = this.f18222a.fromModel(list);
        }
        C3183dn c3183dn2 = c3183dn.d;
        if (c3183dn2 != null) {
            c3390m6.d = fromModel(c3183dn2);
        }
        List list2 = c3183dn.e;
        int i = 0;
        if (list2 == null) {
            c3390m6.e = new C3390m6[0];
            return c3390m6;
        }
        c3390m6.e = new C3390m6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c3390m6.e[i] = fromModel((C3183dn) it.next());
            i++;
        }
        return c3390m6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3158cn(C3181dl c3181dl) {
        this.f18222a = c3181dl;
    }

    public final C3183dn a(C3390m6 c3390m6) {
        throw new UnsupportedOperationException();
    }
}
