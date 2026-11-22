package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes6.dex */
public final class Hf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f17887a;
    public final Consumer b;
    public final C3245ga c;

    public Hf(File file, G1 g1, C3245ga c3245ga) {
        this.f17887a = file;
        this.b = g1;
        this.c = c3245ga;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (this.f17887a.exists() && this.f17887a.isDirectory() && (listFiles = this.f17887a.listFiles()) != null) {
            for (File file : listFiles) {
                D9 a2 = this.c.a(file.getName());
                try {
                    a2.f17811a.lock();
                    a2.b.a();
                    this.b.consume(file);
                    a2.c();
                } catch (Throwable unused) {
                    a2.c();
                }
            }
        }
    }
}
