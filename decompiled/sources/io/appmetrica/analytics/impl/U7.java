package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class U7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18093a;
    public final ProtobufStateStorage b;
    public final W7 c;
    public final InterfaceC3706yn d;
    public final InterfaceC3381lm e;
    public final Ki f;
    public final Ii g;
    public final G6 h;
    public V7 i;

    public U7(Context context, ProtobufStateStorage protobufStateStorage, W7 w7, InterfaceC3706yn interfaceC3706yn, InterfaceC3381lm interfaceC3381lm, Ki ki, Ii ii, G6 g6, V7 v7) {
        this.f18093a = context;
        this.b = protobufStateStorage;
        this.c = w7;
        this.d = interfaceC3706yn;
        this.e = interfaceC3381lm;
        this.f = ki;
        this.g = ii;
        this.h = g6;
        this.i = v7;
    }

    public final synchronized V7 a() {
        return this.i;
    }

    public final synchronized boolean b(Y7 y7) {
        boolean z = false;
        if (y7.a() == X7.b) {
            return false;
        }
        if (Intrinsics.areEqual(y7, this.i.b())) {
            return false;
        }
        List list = (List) this.d.invoke(this.i.a(), y7);
        boolean z2 = list != null;
        if (list == null) {
            list = this.i.a();
        }
        if (this.c.a(y7, this.i.b())) {
            z = true;
        } else {
            y7 = (Y7) this.i.b();
        }
        if (z || z2) {
            V7 v7 = this.i;
            V7 v72 = (V7) this.e.invoke(y7, list);
            this.i = v72;
            this.b.save(v72);
            Vi.a("Update distribution data: %s -> %s", v7, this.i);
        }
        return z;
    }

    public final synchronized Y7 c() {
        if (!this.g.a()) {
            Y7 y7 = (Y7) this.f.invoke();
            this.g.b();
            if (y7 != null) {
                b(y7);
            }
        }
        return (Y7) this.i.b();
    }

    public final Y7 a(Y7 y7) {
        Y7 c;
        this.h.a(this.f18093a);
        synchronized (this) {
            b(y7);
            c = c();
        }
        return c;
    }

    public final Y7 b() {
        this.h.a(this.f18093a);
        return c();
    }
}
