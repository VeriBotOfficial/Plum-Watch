package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public abstract class ij0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f15823a;

    protected abstract float a(float f);

    public abstract d a(Context context, int i, int i2, int i3);

    public ij0(float f) {
        this.f15823a = a(f);
    }

    protected final float a() {
        return this.f15823a;
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f15824a;
        private final int b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15824a == dVar.f15824a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f15824a) * 31);
        }

        public final String toString() {
            return "Size(width=" + this.f15824a + ", height=" + this.b + Separators.RPAREN;
        }

        public d(int i, int i2) {
            this.f15824a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.f15824a;
        }
    }

    public static final class a extends ij0 {
        @Override // com.yandex.mobile.ads.impl.ij0
        public final d a(Context context, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(context, "context");
            int coerceAtMost = RangesKt.coerceAtMost(wh2.a(context, a()), i);
            return new d(coerceAtMost, MathKt.roundToInt(i3 * (coerceAtMost / i2)));
        }

        public a(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.ij0
        protected final float a(float f) {
            return RangesKt.coerceAtLeast(f, 10.0f);
        }
    }

    public static final class b extends ij0 {
        @Override // com.yandex.mobile.ads.impl.ij0
        public final d a(Context context, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(context, "context");
            int roundToInt = MathKt.roundToInt(i * a());
            return new d(roundToInt, MathKt.roundToInt(i3 * (roundToInt / i2)));
        }

        public b(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.ij0
        protected final float a(float f) {
            return RangesKt.coerceIn(f, 0.01f, 1.0f);
        }
    }

    public static final class c extends ij0 {
        @Override // com.yandex.mobile.ads.impl.ij0
        public final d a(Context context, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(context, "context");
            int a2 = wh2.a(context, 140);
            int roundToInt = MathKt.roundToInt(i * a());
            if (i2 > roundToInt) {
                i3 = MathKt.roundToInt(i3 / (i2 / roundToInt));
                i2 = roundToInt;
            }
            if (i3 > a2) {
                i2 = MathKt.roundToInt(i2 / (i3 / a2));
            } else {
                a2 = i3;
            }
            return new d(i2, a2);
        }

        public c(float f) {
            super(f);
        }

        @Override // com.yandex.mobile.ads.impl.ij0
        protected final float a(float f) {
            return RangesKt.coerceIn(f, 0.01f, 1.0f);
        }
    }
}
