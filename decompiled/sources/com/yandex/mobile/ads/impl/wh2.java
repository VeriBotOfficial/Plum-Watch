package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class wh2 {

    /* renamed from: a, reason: collision with root package name */
    private static final hi2 f17251a = new hi2(new sf1(), new ii2());
    public static final /* synthetic */ int b = 0;

    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnPreDrawListener f17252a;
        final /* synthetic */ View b;

        a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f17252a = onPreDrawListener;
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f17252a.onPreDraw();
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @JvmStatic
    public static final float b(int i, float f) {
        return ((i + 0.0f) / f) + 0.5f;
    }

    @JvmStatic
    public static final boolean d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isShown()) {
            if (!(view.getAlpha() == 0.0f)) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean e(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    @JvmStatic
    public static final int b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.isShown()) {
            return f17251a.a(view);
        }
        return 0;
    }

    @JvmStatic
    public static final boolean c(View view) {
        if (view == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int width = view.getWidth() + i;
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, width, view.getHeight() + i2);
        Rect rect2 = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect2);
        } catch (NullPointerException unused) {
        }
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    @JvmStatic
    public static final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, eb0.a(context, "context").density);
    }

    @JvmStatic
    public static final int a(int i, float f) {
        return Color.argb(RangesKt.coerceAtLeast(0, RangesKt.coerceAtMost(255, (int) ((255 * (100 - f)) / 100.0f))), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final int a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    @JvmStatic
    public static final void a(View view, ViewTreeObserver.OnPreDrawListener callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, callback));
    }

    @JvmStatic
    public static final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) b(context.getResources().getDisplayMetrics().heightPixels, eb0.a(context, "context").density);
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final int a(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return MathKt.roundToInt(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    @JvmStatic
    public static final int a(View view) {
        int b2;
        if (view == null || !view.isShown() || (b2 = b(view)) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (b2 * 100) / (height * width);
    }

    @JvmStatic
    public static final boolean a(View view, int i) {
        return a(view) >= i;
    }

    @JvmStatic
    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    @JvmStatic
    public static final int a(Context context) {
        return eb0.a(context, "context").densityDpi;
    }

    @JvmStatic
    public static final int a(Context context, kf1 requestedOrientation) {
        kf1 kf1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestedOrientation, "requestedOrientation");
        kf1 a2 = ks.a(context);
        if (a2 != requestedOrientation && a2 != (kf1Var = kf1.e) && (requestedOrientation != kf1Var || a2 == kf1.c)) {
            return c(context);
        }
        return b(context);
    }
}
