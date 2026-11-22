package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class id1 {
    public static final a c = new a(0);
    private static volatile id1 d;

    /* renamed from: a, reason: collision with root package name */
    private final jz1 f15803a;
    private final o82 b;

    public interface c {
        void a(String str, Bitmap bitmap);
    }

    /* synthetic */ id1(Context context) {
        this(context, new hj0());
    }

    private static iq1 b(Context context) {
        int i;
        Integer y;
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        if (a2 != null && (y = a2.y()) != null) {
            if (y.intValue() == 0) {
                y = null;
            }
            if (y != null) {
                i = y.intValue();
                iq1 a3 = jq1.a(context, i);
                a3.a();
                return a3;
            }
        }
        i = 4;
        iq1 a32 = jq1.a(context, i);
        a32.a();
        return a32;
    }

    public final o82 c() {
        return this.b;
    }

    private static jd1 a(Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            i = RangesKt.coerceAtMost(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8, ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            Object[] args = new Object[0];
            int i2 = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            i = 5120;
        }
        return new jd1(RangesKt.coerceAtLeast(i, BmLocated.HALF_LEFT_TOP));
    }

    private id1(Context context, hj0 hj0Var) {
        jd1 a2 = a(context);
        iq1 b2 = b(context);
        b bVar = new b(a2);
        this.b = new o82(a2, hj0Var);
        this.f15803a = new jz1(b2, bVar, hj0Var);
    }

    public final jz1 b() {
        return this.f15803a;
    }

    public static final class b implements oj0.b {

        /* renamed from: a, reason: collision with root package name */
        private final LruCache<String, Bitmap> f15804a;

        public b(jd1 imageCache) {
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            this.f15804a = imageCache;
        }

        @Override // com.yandex.mobile.ads.impl.oj0.b
        public final Bitmap a(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.f15804a.get(key);
        }

        @Override // com.yandex.mobile.ads.impl.oj0.b
        public final void a(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f15804a.put(key, bitmap);
        }
    }

    public static final class a {
        @JvmStatic
        public final id1 a(Context context) {
            id1 id1Var;
            Intrinsics.checkNotNullParameter(context, "context");
            id1 id1Var2 = id1.d;
            if (id1Var2 != null) {
                return id1Var2;
            }
            synchronized (this) {
                id1Var = id1.d;
                if (id1Var == null) {
                    id1Var = new id1(context);
                    id1.d = id1Var;
                }
            }
            return id1Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
