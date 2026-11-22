package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yk1 implements sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final cn f17431a;
    private final LinkedHashMap b;
    private final LinkedHashMap c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f17432a;
        private final fz1 b;

        public a(String base64, fz1 size) {
            Intrinsics.checkNotNullParameter(base64, "base64");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f17432a = base64;
            this.b = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f17432a, aVar.f17432a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f17432a.hashCode() * 31);
        }

        public final String toString() {
            return "Preview(base64=" + this.f17432a + ", size=" + this.b + Separators.RPAREN;
        }
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final void a(String key, Bitmap value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.put(key, value);
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final Bitmap b(xj0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String f = imageValue.f();
        Bitmap bitmap = (Bitmap) this.b.get(f);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a2 = this.f17431a.a(imageValue);
        if (a2 == null) {
            return null;
        }
        this.b.put(f, a2);
        return a2;
    }

    public /* synthetic */ yk1(Context context) {
        this(context, new cn(context));
    }

    public yk1(Context context, cn cacheImageProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheImageProvider, "cacheImageProvider");
        this.f17431a = cacheImageProvider;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final void a(Map<String, Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.b.putAll(images);
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final void a(Bitmap value, xj0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String c = key.c();
        a aVar = c != null ? new a(c, new fz1(key.g(), key.a())) : null;
        if (aVar != null) {
            this.c.put(aVar, value);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sj0
    public final Bitmap a(xj0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String c = imageValue.c();
        a aVar = c != null ? new a(c, new fz1(imageValue.g(), imageValue.a())) : null;
        if (aVar != null) {
            return (Bitmap) this.c.get(aVar);
        }
        return null;
    }
}
