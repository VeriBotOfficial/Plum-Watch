package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3457on implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3158cn f18438a;
    public final T b;
    public final C3514r6 c;
    public final C3181dl d;
    public final C3647we e;
    public final C3672xe f;

    public C3457on() {
        this(new C3158cn(), new T(new Um()), new C3514r6(), new C3181dl(), new C3647we(), new C3672xe());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3241g6 fromModel(C3432nn c3432nn) {
        C3241g6 c3241g6 = new C3241g6();
        C3183dn c3183dn = c3432nn.f18421a;
        if (c3183dn != null) {
            c3241g6.f18285a = this.f18438a.fromModel(c3183dn);
        }
        S s = c3432nn.b;
        if (s != null) {
            c3241g6.b = this.b.fromModel(s);
        }
        List<C3231fl> list = c3432nn.c;
        if (list != null) {
            c3241g6.e = this.d.fromModel(list);
        }
        String str = c3432nn.g;
        if (str != null) {
            c3241g6.c = str;
        }
        c3241g6.d = this.c.a(c3432nn.h);
        if (!TextUtils.isEmpty(c3432nn.d)) {
            c3241g6.h = this.e.fromModel(c3432nn.d);
        }
        if (!TextUtils.isEmpty(c3432nn.e)) {
            c3241g6.i = c3432nn.e.getBytes();
        }
        if (!In.a(c3432nn.f)) {
            c3241g6.j = this.f.fromModel(c3432nn.f);
        }
        return c3241g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3457on(C3158cn c3158cn, T t, C3514r6 c3514r6, C3181dl c3181dl, C3647we c3647we, C3672xe c3672xe) {
        this.b = t;
        this.f18438a = c3158cn;
        this.c = c3514r6;
        this.d = c3181dl;
        this.e = c3647we;
        this.f = c3672xe;
    }

    public final C3432nn a(C3241g6 c3241g6) {
        throw new UnsupportedOperationException();
    }
}
