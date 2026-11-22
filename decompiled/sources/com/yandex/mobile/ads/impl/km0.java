package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class km0 implements lt {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16035a;
    private final ht0 b;
    private final LinkedHashMap c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).i(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).g(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).c(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).b(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).e(videoAd);
        }
    }

    public final void a(go0 videoAd, lt listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16035a) {
            Set set = (Set) this.c.get(videoAd);
            if (set == null) {
                set = new HashSet();
                this.c.put(videoAd, set);
            }
            set.add(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void g(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    km0.c(j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void h(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    km0.a(j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void i(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    km0.b(j, videoAd);
                }
            });
        }
    }

    public /* synthetic */ km0() {
        this(new Object(), new ht0());
    }

    private final HashSet j(go0 go0Var) {
        HashSet hashSet;
        synchronized (this.f16035a) {
            Set set = (Set) this.c.get(go0Var);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    public km0(Object lock, ht0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f16035a = lock;
        this.b = mainThreadExecutor;
        this.c = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void e(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    km0.f(j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void d(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    km0.h(j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void f(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    km0.i(j, videoAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).f(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void b(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    km0.e(j, videoAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).d(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Set set, go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).a(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void c(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    km0.d(j, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(final go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    km0.g(j, videoAd);
                }
            });
        }
    }

    public final void b(go0 videoAd, lt listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f16035a) {
            Set set = (Set) this.c.get(videoAd);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(listener, (lt) it.next())) {
                        it.remove();
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(final go0 videoAd, final xc2 error) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(error, "error");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    km0.a(j, videoAd, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, go0 videoAd, xc2 error) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Intrinsics.checkNotNullParameter(error, "$error");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lt
    public final void a(final go0 videoAd, final float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j = j(videoAd);
        if (j != null) {
            this.b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.km0$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    km0.a(j, videoAd, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, go0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lt) it.next()).a(videoAd, f);
        }
    }

    public final void a() {
        this.b.a();
    }
}
