package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oo0 {
    public static final a c = new a(0);
    private static volatile oo0 d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f16472a;
    private final WeakHashMap<mu, ft> b;

    public final void b(mu videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f16472a) {
            this.b.remove(videoPlayer);
        }
    }

    private oo0() {
        this.f16472a = new Object();
        this.b = new WeakHashMap<>();
    }

    public /* synthetic */ oo0(int i) {
        this();
    }

    public final ft a(mu videoPlayer) {
        ft ftVar;
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f16472a) {
            ftVar = this.b.get(videoPlayer);
        }
        return ftVar;
    }

    public final void a(mu videoPlayer, ft adBinder) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f16472a) {
            this.b.put(videoPlayer, adBinder);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class a {
        public final oo0 a() {
            oo0 oo0Var;
            oo0 oo0Var2 = oo0.d;
            if (oo0Var2 != null) {
                return oo0Var2;
            }
            synchronized (this) {
                oo0Var = oo0.d;
                if (oo0Var == null) {
                    oo0Var = new oo0(0);
                    oo0.d = oo0Var;
                }
            }
            return oo0Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
