package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f4319a;
    private Runnable b;

    i() {
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f4319a == null) {
            this.f4319a = new i$$ExternalSyntheticLambda0(this, runnable);
            h.a().execute(this.f4319a);
        } else {
            if (this.b == null) {
                this.b = new i$$ExternalSyntheticLambda0(this, runnable);
            }
        }
    }

    private Runnable a(Runnable runnable) {
        return new i$$ExternalSyntheticLambda0(this, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    private synchronized void a() {
        Runnable runnable = this.b;
        this.f4319a = runnable;
        this.b = null;
        if (runnable != null) {
            h.a().execute(this.f4319a);
        }
    }
}
