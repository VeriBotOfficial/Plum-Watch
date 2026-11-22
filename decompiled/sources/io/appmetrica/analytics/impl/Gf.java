package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* loaded from: classes6.dex */
public final class Gf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f17873a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;

    public Gf(File file, Function function, Consumer consumer, Consumer consumer2) {
        this.f17873a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17873a.exists()) {
            try {
                Object apply = this.b.apply(this.f17873a);
                if (apply != null) {
                    this.d.consume(apply);
                }
            } catch (Throwable unused) {
            }
            this.c.consume(this.f17873a);
        }
    }
}
