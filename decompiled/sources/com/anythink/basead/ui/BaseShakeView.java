package com.anythink.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.basead.d.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes11.dex */
public abstract class BaseShakeView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected ImageView f3000a;
    protected ImageView b;
    ValueAnimator c;
    protected int d;
    protected String e;
    protected String f;
    protected String g;
    protected String h;
    protected Bitmap i;
    protected int j;
    protected a k;
    private int l;
    private i m;

    public interface a {
        boolean a();
    }

    abstract void a();

    static /* synthetic */ int a(BaseShakeView baseShakeView) {
        int i = baseShakeView.l;
        baseShakeView.l = i + 1;
        return i;
    }

    public BaseShakeView(Context context) {
        super(context);
        this.l = 0;
        this.m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && BaseShakeView.this.k != null) {
                    return BaseShakeView.this.k.a();
                }
                return false;
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 0;
        this.m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && BaseShakeView.this.k != null) {
                    return BaseShakeView.this.k.a();
                }
                return false;
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 0;
        this.m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && BaseShakeView.this.k != null) {
                    return BaseShakeView.this.k.a();
                }
                return false;
            }
        };
        a();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.l = 0;
        this.m = new i() { // from class: com.anythink.basead.ui.BaseShakeView.1
            @Override // com.anythink.basead.d.i
            public final boolean a() {
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && BaseShakeView.this.k != null) {
                    return BaseShakeView.this.k.a();
                }
                return false;
            }
        };
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startShakeIconAnimation();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            b();
        } else {
            c();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (z) {
            b();
        } else {
            c();
        }
    }

    public void startShakeIconAnimation() {
        ValueAnimator ofFloat;
        if (this.f3000a != null) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i = this.d;
            if (i == 1) {
                ofFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass10());
                ofFloat.addListener(new AnonymousClass11());
                ofFloat.setInterpolator(new AnonymousClass12());
                this.f3000a.post(new AnonymousClass13());
            } else if (i == 2) {
                int a2 = q.a(getContext(), 8.0f);
                float f = a2;
                float f2 = -a2;
                ofFloat = ValueAnimator.ofFloat(0.0f, f, f2, f, f2, a2 / 2, r6 / 2, a2 / 4, r6 / 4, 0.0f);
                ofFloat.setDuration(1000L);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass7());
                ofFloat.addListener(new AnonymousClass8());
                ofFloat.setInterpolator(new AnonymousClass9());
            } else {
                ofFloat = ValueAnimator.ofFloat(-10.0f, 10.0f);
                ofFloat.setDuration(150L);
                ofFloat.setRepeatMode(2);
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new AnonymousClass14());
                ofFloat.addListener(new AnonymousClass2());
                ofFloat.setInterpolator(new AnonymousClass3());
                this.f3000a.post(new AnonymousClass4());
            }
            this.c = ofFloat;
            if (ofFloat != null) {
                ofFloat.start();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$7, reason: invalid class name */
    final class AnonymousClass7 implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass7() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f3000a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$8, reason: invalid class name */
    final class AnonymousClass8 extends AnimatorListenerAdapter {
        AnonymousClass8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$9, reason: invalid class name */
    final class AnonymousClass9 implements Interpolator {
        AnonymousClass9() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.l % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$10, reason: invalid class name */
    final class AnonymousClass10 implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass10() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f3000a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$11, reason: invalid class name */
    final class AnonymousClass11 extends AnimatorListenerAdapter {
        AnonymousClass11() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$12, reason: invalid class name */
    final class AnonymousClass12 implements Interpolator {
        AnonymousClass12() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.l % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$13, reason: invalid class name */
    final class AnonymousClass13 implements Runnable {
        AnonymousClass13() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseShakeView.this.f3000a.setPivotX((int) (BaseShakeView.this.f3000a.getWidth() * 0.5d));
            BaseShakeView.this.f3000a.setPivotY((int) (BaseShakeView.this.f3000a.getHeight() * 0.5d));
        }
    }

    private ValueAnimator a(int i) {
        if (i == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new AnonymousClass10());
            ofFloat.addListener(new AnonymousClass11());
            ofFloat.setInterpolator(new AnonymousClass12());
            this.f3000a.post(new AnonymousClass13());
            return ofFloat;
        }
        if (i == 2) {
            int a2 = q.a(getContext(), 8.0f);
            float f = a2;
            float f2 = -a2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, f, f2, f, f2, a2 / 2, r5 / 2, a2 / 4, r5 / 4, 0.0f);
            ofFloat2.setDuration(1000L);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new AnonymousClass7());
            ofFloat2.addListener(new AnonymousClass8());
            ofFloat2.setInterpolator(new AnonymousClass9());
            return ofFloat2;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(-10.0f, 10.0f);
        ofFloat3.setDuration(150L);
        ofFloat3.setRepeatMode(2);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.addUpdateListener(new AnonymousClass14());
        ofFloat3.addListener(new AnonymousClass2());
        ofFloat3.setInterpolator(new AnonymousClass3());
        this.f3000a.post(new AnonymousClass4());
        return ofFloat3;
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$14, reason: invalid class name */
    final class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        AnonymousClass14() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.f3000a.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$2, reason: invalid class name */
    final class AnonymousClass2 extends AnimatorListenerAdapter {
        AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.a(BaseShakeView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$3, reason: invalid class name */
    final class AnonymousClass3 implements Interpolator {
        AnonymousClass3() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if ((BaseShakeView.this.l / 2) % 3 == 0) {
                return 0.0f;
            }
            return f;
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseShakeView$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (BaseShakeView.this.f3000a == null || BaseShakeView.this.f3000a.getWidth() <= 0 || BaseShakeView.this.f3000a.getHeight() <= 0) {
                return;
            }
            BaseShakeView.this.f3000a.setPivotX((int) (BaseShakeView.this.f3000a.getWidth() * 0.8d));
            BaseShakeView.this.f3000a.setPivotY((int) (BaseShakeView.this.f3000a.getHeight() * 0.8d));
        }
    }

    public void setOnShakeListener(a aVar, y yVar) {
        this.m.a(yVar);
        this.k = aVar;
    }

    public void setShakeSetting(y yVar, int i) {
        if (yVar != null) {
            this.d = yVar.e();
            this.e = yVar.f();
            this.f = yVar.g();
            this.g = yVar.h();
            this.h = yVar.i();
            this.j = i;
            if (TextUtils.isEmpty(this.e)) {
                d();
            } else {
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2;
                        try {
                            i2 = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                        } catch (Throwable unused) {
                            i2 = 0;
                        }
                        BaseShakeView baseShakeView = BaseShakeView.this;
                        baseShakeView.i = com.anythink.core.common.res.b.a(baseShakeView.getContext()).b(new e(3, BaseShakeView.this.e), i2, i2);
                        BaseShakeView.this.d();
                    }
                }, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseShakeView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseShakeView.this.f3000a != null) {
                    if (BaseShakeView.this.i != null) {
                        BaseShakeView.this.f3000a.setImageBitmap(BaseShakeView.this.i);
                    } else {
                        BaseShakeView.this.f3000a.setImageResource(q.a(BaseShakeView.this.getContext(), "myoffer_shake_icon", k.c));
                    }
                }
                if (BaseShakeView.this.b != null) {
                    if (BaseShakeView.this.i != null) {
                        BaseShakeView.this.b.setImageBitmap(BaseShakeView.this.i);
                    } else {
                        BaseShakeView.this.b.setImageResource(q.a(BaseShakeView.this.getContext(), "myoffer_shake_icon", k.c));
                    }
                }
            }
        });
    }

    protected void b() {
        com.anythink.core.express.c.a.a().a(this.m);
    }

    protected void c() {
        com.anythink.core.express.c.a.a().b(this.m);
    }
}
