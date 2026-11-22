package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.yandex.mobile.ads.impl.g40;
import com.yandex.mobile.ads.impl.h40;
import com.yandex.mobile.ads.impl.i40;

/* loaded from: classes5.dex */
public interface i40 {

    /* renamed from: a, reason: collision with root package name */
    public static final i40 f15774a = new a();

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15775a = new b() { // from class: com.yandex.mobile.ads.impl.i40$b$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.i40.b
            public final void release() {
                i40.b.lambda$static$0();
            }
        };

        static /* synthetic */ void lambda$static$0() {
        }

        void release();
    }

    int a(jc0 jc0Var);

    default b a(h40.a aVar, jc0 jc0Var) {
        return b.f15775a;
    }

    void a(Looper looper, mi1 mi1Var);

    g40 b(h40.a aVar, jc0 jc0Var);

    default void prepare() {
    }

    default void release() {
    }

    final class a implements i40 {
        @Override // com.yandex.mobile.ads.impl.i40
        public final void a(Looper looper, mi1 mi1Var) {
        }

        a() {
        }

        @Override // com.yandex.mobile.ads.impl.i40
        public final g40 b(h40.a aVar, jc0 jc0Var) {
            if (jc0Var.p == null) {
                return null;
            }
            return new u50(new g40.a(new l82(), 6001));
        }

        @Override // com.yandex.mobile.ads.impl.i40
        public final int a(jc0 jc0Var) {
            return jc0Var.p != null ? 1 : 0;
        }
    }
}
