package com.baidu.mapapi.map;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes15.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f7985a;
        final /* synthetic */ int b;

        b(ViewGroup.LayoutParams layoutParams, int r3) {
            this.f7985a = layoutParams;
            this.b = r3;
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.n, 0.0f);
        if (this.g < 2) {
            this.g = this.e.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 0) {
            this.h = motionEvent.getRawX();
            this.i = motionEvent.getRawY();
            if (this.f.canDismiss(this.l)) {
                this.o = false;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.m = velocityTrackerObtain;
                velocityTrackerObtain.addMovement(motionEvent);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.m;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.h;
                    float rawY = motionEvent.getRawY() - this.i;
                    if (Math.abs(rawX) > this.f7983a && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.j = true;
                        this.k = rawX > 0.0f ? this.f7983a : -this.f7983a;
                        this.e.getParent().requestDisallowInterceptTouchEvent(true);
                        if (!this.o) {
                            this.o = true;
                            this.f.onNotify();
                        }
                        if (Math.abs(rawX) <= this.g / 3) {
                            this.p = false;
                        } else if (!this.p) {
                            this.p = true;
                            this.f.onNotify();
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.e.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.j) {
                        this.n = rawX;
                        this.e.setTranslationX(rawX - this.k);
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.m != null) {
                this.e.animate().translationX(0.0f).setDuration(this.d).setListener(null);
                this.m.recycle();
                this.m = null;
                this.n = 0.0f;
                this.h = 0.0f;
                this.i = 0.0f;
                this.j = false;
            }
        } else if (this.m != null) {
            float rawX2 = motionEvent.getRawX() - this.h;
            this.m.addMovement(motionEvent);
            this.m.computeCurrentVelocity(1000);
            float xVelocity = this.m.getXVelocity();
            float fAbs = Math.abs(xVelocity);
            float fAbs2 = Math.abs(this.m.getYVelocity());
            if (Math.abs(rawX2) > this.g / 3 && this.j) {
                z = rawX2 > 0.0f;
            } else if (this.b > fAbs || fAbs > this.c || fAbs2 >= fAbs || fAbs2 >= fAbs || !this.j) {
                z = false;
                z2 = false;
            } else {
                boolean z3 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                if (this.m.getXVelocity() > 0.0f) {
                    z2 = z3;
                    z = true;
                } else {
                    z2 = z3;
                }
            }
            if (z2) {
                this.e.animate().translationX(z ? this.g : -this.g).setDuration(this.d).setListener(new a());
            } else if (this.j) {
                this.e.animate().translationX(0.0f).setDuration(this.d).setListener(null);
            }
            this.m.recycle();
            this.m = null;
            this.n = 0.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = false;
        }
        return false;
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
