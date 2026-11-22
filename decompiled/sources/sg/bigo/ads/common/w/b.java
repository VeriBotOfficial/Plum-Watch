package sg.bigo.ads.common.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.w.c;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19782a = "adview_background_color_animator_tag".hashCode();

    public static class a {
        public long a() {
            return -1L;
        }

        public boolean a(int i) {
            return false;
        }

        public void b(int i) {
        }
    }

    /* renamed from: sg.bigo.ads.common.w.b$b, reason: collision with other inner class name */
    static class C1090b extends d<ColorDrawable> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        private C1090b(View view, ColorDrawable colorDrawable, int i) {
            super(view, colorDrawable, i, 0 == true ? 1 : 0);
            this.d = this.b != 0 ? ((ColorDrawable) this.b).getColor() : 0;
        }

        /* synthetic */ C1090b(View view, ColorDrawable colorDrawable, int i, byte b) {
            this(view, colorDrawable, i);
        }

        @Override // sg.bigo.ads.common.w.b.d
        protected final int a() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i) {
            if (this.f19789a == null || this.b == 0) {
                return;
            }
            ((ColorDrawable) this.b).setColor(i);
            ((ColorDrawable) this.b).invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z) {
            if (this.f19789a == null || this.b == 0) {
                return;
            }
            ((ColorDrawable) this.b).setColor(z ? this.d : this.c);
            ((ColorDrawable) this.b).invalidateSelf();
        }
    }

    static class c extends d<Paint> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, Paint paint, int i) {
            super(view, paint, i, 0 == true ? 1 : 0);
            this.d = this.b != 0 ? ((Paint) this.b).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i) {
            if (this.f19789a == null || this.b == 0) {
                return;
            }
            ((Paint) this.b).setColor(i);
            this.f19789a.getBackground().invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z) {
            if (this.f19789a == null || this.b == 0) {
                return;
            }
            ((Paint) this.b).setColor(z ? this.d : this.c);
            this.f19789a.getBackground().invalidateSelf();
        }
    }

    static abstract class d<T> {

        /* renamed from: a, reason: collision with root package name */
        protected final View f19789a;
        protected final T b;
        protected final int c;

        private d(View view, T t, int i) {
            this.f19789a = view;
            this.b = t;
            this.c = i;
        }

        /* synthetic */ d(View view, Object obj, int i, byte b) {
            this(view, obj, i);
        }

        protected abstract int a();

        public int a(float f) {
            return b.a(f, a(), this.c);
        }

        protected abstract void a(int i);

        public abstract void a(boolean z);
    }

    static class e extends d<Drawable> {
        private Drawable d;
        private final ColorDrawable e;
        private int f;

        public e(View view, int i) {
            super(view, null, i, (byte) 0);
            ColorDrawable colorDrawable = new ColorDrawable(i);
            this.e = colorDrawable;
            if (view != null) {
                Drawable background = view.getBackground();
                this.d = background;
                if (background != null) {
                    view.setBackground(new LayerDrawable(new Drawable[]{this.d, colorDrawable}));
                } else {
                    colorDrawable.setColor(0);
                    view.setBackground(colorDrawable);
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        protected final int a() {
            return 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a(float f) {
            this.f = Math.max((int) ((255.0f - (f * 255.0f)) + 0.5f), 255);
            return super.a(f);
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i) {
            if (this.f19789a != null) {
                ColorDrawable colorDrawable = this.e;
                if (colorDrawable != null) {
                    colorDrawable.setColor(i);
                    this.e.invalidateSelf();
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.setAlpha(this.f);
                    this.d.invalidateSelf();
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z) {
            if (this.f19789a != null) {
                this.f19789a.setBackground(z ? this.d : this.e);
            }
        }
    }

    public static double a(int i) {
        double a2 = a((16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
        double a3 = a(255, 255, 255);
        return (Math.max(a2, a3) + 0.05000000074505806d) / (Math.min(a2, a3) + 0.05000000074505806d);
    }

    private static double a(int i, int i2, int i3) {
        double[] dArr = new double[3];
        dArr[0] = i / 255.0f;
        dArr[1] = i2 / 255.0f;
        dArr[2] = i3 / 255.0f;
        for (int i4 = 0; i4 < 3; i4++) {
            double d2 = dArr[i4];
            dArr[i4] = d2 <= 0.0392800010740757d ? d2 / 12.920000076293945d : Math.pow((d2 + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[0] * 0.2125999927520752d) + (dArr[1] * 0.7152000069618225d) + (dArr[2] * 0.0722000002861023d);
    }

    private static float a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    static /* synthetic */ float a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return 1.0f;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            return ((Float) animatedValue).floatValue();
        }
        return 1.0f;
    }

    public static int a(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float pow5 = pow2 + ((((float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f);
        float pow6 = pow3 + (f * (((float) Math.pow((i2 & 255) / 255.0f, 2.2d)) - pow3));
        return (Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f);
    }

    public static int a(int i, float f) {
        return a(i, (int) (f * 255.0f));
    }

    public static int a(int i, int i2) {
        return (i & 16777215) | ((Math.max(0, Math.min(255, i2)) & 255) << 24);
    }

    public static int a(Bitmap bitmap, int i) {
        Integer a2 = a(bitmap);
        return a2 != null ? a2.intValue() : i;
    }

    public static ValueAnimator a(final View view, final int i, final a aVar) {
        if (view == null) {
            return null;
        }
        final d a2 = a(view, i);
        int i2 = f19782a;
        Object tag = view.getTag(i2);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long a3 = aVar.a();
        if (a3 != -1) {
            ofFloat.setDuration(a3);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int a4 = d.this.a(b.a(valueAnimator));
                a aVar2 = aVar;
                if (aVar2 != null ? aVar2.a(a4) : false) {
                    return;
                }
                d.this.a(a4);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.5
            private boolean e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.b(i);
                }
                a2.a(this.e);
                view.setTag(b.f19782a, null);
            }
        });
        ofFloat.start();
        view.setTag(i2, ofFloat);
        return ofFloat;
    }

    public static ValueAnimator a(final View view, final Drawable drawable, long j) {
        if (view == null) {
            return null;
        }
        int i = f19782a;
        Object tag = view.getTag(i);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        final Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(drawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, drawable}));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j != -1) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int max = Math.max((int) ((b.a(valueAnimator) * 255.0f) + 0.5f), 255);
                drawable.setAlpha(max);
                drawable.invalidateSelf();
                Drawable drawable2 = background;
                if (drawable2 != null) {
                    drawable2.setAlpha(255 - max);
                    background.invalidateSelf();
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.7
            private boolean d = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                view.setBackground(this.d ? background : drawable);
                view.setTag(b.f19782a, null);
            }
        });
        ofFloat.start();
        view.setTag(i, ofFloat);
        return ofFloat;
    }

    public static Integer a(Bitmap bitmap) {
        c.a a2;
        int max;
        if (bitmap == null) {
            return null;
        }
        try {
            a2 = sg.bigo.ads.common.w.c.a(bitmap);
        } catch (Exception unused) {
        }
        if (a2.f19791a == null) {
            throw new AssertionError();
        }
        Bitmap bitmap2 = a2.f19791a;
        double d2 = -1.0d;
        if (a2.d > 0) {
            int width = bitmap2.getWidth() * bitmap2.getHeight();
            if (width > a2.d) {
                d2 = Math.sqrt(a2.d / width);
            }
        } else if (a2.e > 0 && (max = Math.max(bitmap2.getWidth(), bitmap2.getHeight())) > a2.e) {
            d2 = a2.e / max;
        }
        if (d2 > 0.0d) {
            bitmap2 = sg.bigo.ads.common.utils.d.a(bitmap2, (int) Math.ceil(bitmap2.getWidth() * d2), (int) Math.ceil(bitmap2.getHeight() * d2));
        }
        Bitmap bitmap3 = bitmap2;
        int width2 = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        int[] iArr = new int[width2 * height];
        bitmap3.getPixels(iArr, 0, width2, 0, 0, width2, height);
        sg.bigo.ads.common.w.a aVar = new sg.bigo.ads.common.w.a(iArr, a2.c, a2.f.isEmpty() ? null : (c.b[]) a2.f.toArray(new c.b[a2.f.size()]));
        if (bitmap3 != a2.f19791a) {
            bitmap3.recycle();
        }
        sg.bigo.ads.common.w.c cVar = new sg.bigo.ads.common.w.c(aVar.c, a2.b);
        cVar.a();
        c.C1091c c1091c = cVar.f19790a;
        if (c1091c != null) {
            return Integer.valueOf(c1091c.f19792a);
        }
        return null;
    }

    private static d a(View view, int i) {
        Drawable findDrawableByLayerId;
        Drawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(sg.bigo.ads.common.utils.d.f19717a)) != null) {
            background = findDrawableByLayerId;
        }
        byte b = 0;
        int i2 = 0;
        while (i2 < 10 && background != null) {
            i2++;
            Object a2 = sg.bigo.ads.common.r.a.a(background, "getDrawable", Drawable.class);
            if (!(a2 instanceof Drawable)) {
                break;
            }
            background = (Drawable) a2;
        }
        background = null;
        if (background instanceof ColorDrawable) {
            return new C1090b(view, (ColorDrawable) background, i, b);
        }
        if (!(background instanceof ShapeDrawable)) {
            return new e(view, i);
        }
        Paint paint = ((ShapeDrawable) background).getPaint();
        Paint.Style style = paint.getStyle();
        return (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new c(view, paint, i) : new e(view, i);
    }

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = a(f7, 360.0f);
        fArr[1] = a(abs, 1.0f);
        fArr[2] = a(f6, 1.0f);
    }

    public static void a(final int i, final int i2, long j, final TextView... textViewArr) {
        if (k.a(textViewArr)) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j >= 0) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int a2 = b.a(b.a(valueAnimator), i, i2);
                for (TextView textView : textViewArr) {
                    textView.setTextColor(a2);
                }
            }
        });
        ofFloat.start();
    }

    public static void a(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void a(View view) {
        a(view, -1, new a() { // from class: sg.bigo.ads.common.w.b.3
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                return 0L;
            }
        });
    }

    public static void a(Interpolator interpolator, final View view) {
        if (view == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.2

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f19784a = 0;
            final /* synthetic */ int b = -1291845632;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(b.a(b.a(valueAnimator), this.f19784a, this.b));
            }
        });
        ofFloat.start();
    }

    public static int b(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f > 0.3f) {
            fArr[2] = ((f - 1.0f) * 0.6857143f) + 0.93f;
        } else {
            fArr[2] = f * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }
}
