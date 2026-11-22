package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d31 {
    public static final a c = new a(0);
    private static volatile d31 d;

    /* renamed from: a, reason: collision with root package name */
    private final int f15243a;
    private final WeakHashMap<wu0, w21> b;

    public final w21 b(wu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.b.remove(media);
    }

    private d31(int i) {
        this.f15243a = i;
        this.b = new WeakHashMap<>();
    }

    public final boolean a(wu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.b.containsKey(media);
    }

    public /* synthetic */ d31(int i, int i2) {
        this(i);
    }

    public static final class a {
        public final d31 a(Context context) {
            d31 d31Var;
            Intrinsics.checkNotNullParameter(context, "context");
            d31 d31Var2 = d31.d;
            if (d31Var2 != null) {
                return d31Var2;
            }
            synchronized (this) {
                d31Var = d31.d;
                if (d31Var == null) {
                    int i = pw1.l;
                    ju1 a2 = pw1.a.a().a(context);
                    d31 d31Var3 = new d31(a2 != null ? a2.D() : 0, 0);
                    d31.d = d31Var3;
                    d31Var = d31Var3;
                }
            }
            return d31Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public final void a(w21 mraidWebView, wu0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        if (this.b.size() < this.f15243a) {
            this.b.put(media, mraidWebView);
        }
    }

    public final boolean b() {
        return this.b.size() == this.f15243a;
    }
}
