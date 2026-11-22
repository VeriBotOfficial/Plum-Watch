package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d40 implements tl<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final mt1 f15246a;
    private final wl b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f15247a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15247a == aVar.f15247a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + dy1.a(this.d, dy1.a(this.c, dy1.a(this.b, Integer.hashCode(this.f15247a) * 31, 31), 31), 31);
        }

        public final String toString() {
            return "BitmapPixel(color=" + this.f15247a + ", alpha=" + this.b + ", red=" + this.c + ", green=" + this.d + ", blue=" + this.e + Separators.RPAREN;
        }

        public /* synthetic */ a(int i) {
            this(i, Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
        }

        public final int a() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public final int b() {
            return this.e;
        }

        public a(int i, int i2, int i3, int i4, int i5) {
            this.f15247a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public d40(mt1 scaledDrawableBitmapProvider, wl bitmapProvider) {
        Intrinsics.checkNotNullParameter(scaledDrawableBitmapProvider, "scaledDrawableBitmapProvider");
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f15246a = scaledDrawableBitmapProvider;
        this.b = bitmapProvider;
    }

    @Override // com.yandex.mobile.ads.impl.tl
    public final boolean a(Drawable drawable, Bitmap src) {
        Bitmap src2;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(src, "bitmap");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                src2 = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(src2, "getBitmap(...)");
                this.b.getClass();
                Intrinsics.checkNotNullParameter(src2, "src");
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(src2, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                this.b.getClass();
                Intrinsics.checkNotNullParameter(src, "src");
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(src, 1, 1, true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap2, "createScaledBitmap(...)");
                a aVar = new a(createScaledBitmap.getPixel(0, 0));
                a aVar2 = new a(createScaledBitmap2.getPixel(0, 0));
                return Math.abs(aVar.a() - aVar2.a()) <= 20 && Math.abs(aVar.d() - aVar2.d()) <= 20 && Math.abs(aVar.c() - aVar2.c()) <= 20 && Math.abs(aVar.b() - aVar2.b()) <= 20;
            }
        }
        src2 = this.f15246a.a(drawable);
        this.b.getClass();
        Intrinsics.checkNotNullParameter(src2, "src");
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(src2, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap3, "createScaledBitmap(...)");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(src, "src");
        Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(src, 1, 1, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap22, "createScaledBitmap(...)");
        a aVar3 = new a(createScaledBitmap3.getPixel(0, 0));
        a aVar22 = new a(createScaledBitmap22.getPixel(0, 0));
        if (Math.abs(aVar3.a() - aVar22.a()) <= 20) {
        }
    }
}
