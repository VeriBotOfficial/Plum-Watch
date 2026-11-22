package com.baidu.mapapi.map;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private int f7983a;
    private int b;
    private int c;
    private long d;
    private View e;
    private DismissCallbacks f;
    private int g = 1;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private Object l;
    private VelocityTracker m;
    private float n;
    private boolean o;
    private boolean p;

    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);

        void onNotify();
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeDismissTouchListener.this.a();
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f7985a;
        final /* synthetic */ int b;

        b(ViewGroup.LayoutParams layoutParams, int i) {
            this.f7985a = layoutParams;
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeDismissTouchListener.this.f.onDismiss(SwipeDismissTouchListener.this.e, SwipeDismissTouchListener.this.l);
            SwipeDismissTouchListener.this.e.setTranslationX(0.0f);
            this.f7985a.height = this.b;
            SwipeDismissTouchListener.this.e.setLayoutParams(this.f7985a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f7986a;

        c(ViewGroup.LayoutParams layoutParams) {
            this.f7986a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7986a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            SwipeDismissTouchListener.this.e.setLayoutParams(this.f7986a);
        }
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f7983a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.e = view;
        view.getContext();
        this.l = obj;
        this.f = dismissCallbacks;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.SwipeDismissTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        int height = this.e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.d);
        duration.addListener(new b(layoutParams, height));
        duration.addUpdateListener(new c(layoutParams));
        duration.start();
    }
}
