package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lf2 implements nu {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16112a;
    private final ht0 b;
    private final LinkedHashSet c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(lf2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((nu) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(lf2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((nu) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(lf2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((nu) it.next()).onVideoResumed();
        }
    }

    public final void a(cf2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16112a) {
            this.c.add(listener);
        }
    }

    public /* synthetic */ lf2() {
        this(new Object(), new ht0());
    }

    private final HashSet a() {
        HashSet hashSet;
        synchronized (this.f16112a) {
            hashSet = new HashSet(this.c);
        }
        return hashSet;
    }

    public lf2(Object lock, ht0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f16112a = lock;
        this.b = mainThreadExecutor;
        this.c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lf2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((nu) it.next()).onVideoCompleted();
        }
    }

    public final void b() {
        this.c.clear();
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(lf2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((nu) it.next()).onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoPrepared() {
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lf2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                lf2.d(lf2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoCompleted() {
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lf2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                lf2.a(lf2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoResumed() {
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lf2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                lf2.e(lf2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoPaused() {
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lf2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lf2.c(lf2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.nu
    public final void onVideoError() {
        this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.lf2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                lf2.b(lf2.this);
            }
        });
    }
}
