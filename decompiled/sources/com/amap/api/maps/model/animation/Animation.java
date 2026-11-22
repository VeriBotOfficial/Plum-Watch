package com.amap.api.maps.model.animation;

import android.view.animation.Interpolator;
import com.amap.api.col.p0003sl.qc;
import com.amap.api.col.p0003sl.s4;
import com.amap.api.maps.model.BaseOptions;
import com.autonavi.amap.mapcore.animation.GLAnimation;

/* loaded from: classes11.dex */
public abstract class Animation {
    public static final int FILL_MODE_BACKWARDS = 1;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    protected String animationType;
    public GLAnimation glAnimation;
    private AnimationListener mListener;
    private int fillMode = 0;
    private long duration = 500;
    private Interpolator interpolator = null;
    private boolean mFillBefore = true;
    private boolean mFillAfter = false;
    private boolean mFillEnabled = false;
    private int mRepeatCount = 0;
    private int mRepeatMode = 1;
    private AnimationUpdateFlags updateFlags = new AnimationUpdateFlags();

    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    protected static class AnimationUpdateFlags extends BaseOptions.BaseUpdateFlags {
        protected boolean mListenerUpdate = false;
        protected boolean durationUpdate = false;
        protected boolean interpolatorUpdate = false;
        protected boolean fillModeUpdate = false;
        protected boolean mFillEnabledUpdate = false;
        protected boolean mFillAfterUpdate = false;
        protected boolean mFillBeforeUpdate = false;
        protected boolean mRepeatCountUpdate = false;
        protected boolean mRepeatModeUpdate = false;

        protected AnimationUpdateFlags() {
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
            super.reset();
            this.mListenerUpdate = false;
            this.durationUpdate = false;
            this.interpolatorUpdate = false;
            this.fillModeUpdate = false;
            this.mFillEnabledUpdate = false;
            this.mFillAfterUpdate = false;
            this.mFillBeforeUpdate = false;
            this.mRepeatCountUpdate = false;
            this.mRepeatModeUpdate = false;
        }
    }

    private class b implements AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        private final qc f2059a;
        private final qc b;

        class a extends qc {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AnimationListener f2060a;

            a(b bVar, Animation animation, AnimationListener animationListener) {
                this.f2060a = animationListener;
            }

            @Override // com.amap.api.col.p0003sl.qc
            public void runTask() {
                try {
                    AnimationListener animationListener = this.f2060a;
                    if (animationListener != null) {
                        animationListener.onAnimationStart();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: com.amap.api.maps.model.animation.Animation$b$b, reason: collision with other inner class name */
        class C0116b extends qc {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AnimationListener f2061a;

            C0116b(b bVar, Animation animation, AnimationListener animationListener) {
                this.f2061a = animationListener;
            }

            @Override // com.amap.api.col.p0003sl.qc
            public void runTask() {
                try {
                    AnimationListener animationListener = this.f2061a;
                    if (animationListener != null) {
                        animationListener.onAnimationEnd();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationEnd() {
            s4.b().a(this.b);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public void onAnimationStart() {
            s4.b().a(this.f2059a);
        }

        private b(Animation animation, AnimationListener animationListener) {
            this.f2059a = new a(this, animation, animationListener);
            this.b = new C0116b(this, animation, animationListener);
        }
    }

    public Animation() {
        this.animationType = "typeAnimtionBase";
        this.glAnimation = null;
        this.glAnimation = new GLAnimation();
        this.animationType = getAnimationType();
    }

    protected abstract String getAnimationType();

    public int getFillMode() {
        return this.fillMode;
    }

    public int getRepeatCount() {
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            return gLAnimation.getRepeatCount();
        }
        return 0;
    }

    public int getRepeatMode() {
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            return gLAnimation.getRepeatMode();
        }
        return 1;
    }

    public AnimationUpdateFlags getUpdateFlags() {
        return this.updateFlags;
    }

    public void resetUpdateFlags() {
        this.updateFlags.reset();
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mListener = new b(animationListener);
        this.glAnimation.setAnimationListener(animationListener);
        this.updateFlags.mListenerUpdate = true;
    }

    public void setDuration(long j) {
        this.duration = j;
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setDuration(j);
        }
        this.updateFlags.durationUpdate = true;
    }

    public void setFillMode(int i) {
        this.fillMode = i;
        if (i == 0) {
            this.mFillAfter = true;
            GLAnimation gLAnimation = this.glAnimation;
            if (gLAnimation != null) {
                gLAnimation.setFillAfter(true);
            }
            this.updateFlags.mFillAfterUpdate = true;
            this.mFillBefore = false;
            GLAnimation gLAnimation2 = this.glAnimation;
            if (gLAnimation2 != null) {
                gLAnimation2.setFillBefore(false);
            }
            this.updateFlags.mFillBeforeUpdate = true;
            this.mFillEnabled = false;
            GLAnimation gLAnimation3 = this.glAnimation;
            if (gLAnimation3 != null) {
                gLAnimation3.setFillEnabled(false);
            }
            this.updateFlags.mFillEnabledUpdate = true;
        } else {
            this.mFillAfter = false;
            GLAnimation gLAnimation4 = this.glAnimation;
            if (gLAnimation4 != null) {
                gLAnimation4.setFillAfter(false);
            }
            this.updateFlags.mFillAfterUpdate = true;
            this.mFillEnabled = true;
            GLAnimation gLAnimation5 = this.glAnimation;
            if (gLAnimation5 != null) {
                gLAnimation5.setFillEnabled(true);
            }
            this.updateFlags.mFillEnabledUpdate = true;
            this.mFillBefore = true;
            GLAnimation gLAnimation6 = this.glAnimation;
            if (gLAnimation6 != null) {
                gLAnimation6.setFillBefore(true);
            }
            this.updateFlags.mFillBeforeUpdate = true;
        }
        this.updateFlags.fillModeUpdate = true;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setInterpolator(interpolator);
        }
        this.updateFlags.interpolatorUpdate = true;
    }

    public void setRepeatCount(int i) {
        this.mRepeatCount = i;
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setRepeatCount(i);
        }
        this.updateFlags.mRepeatCountUpdate = true;
    }

    public void setRepeatMode(int i) {
        this.mRepeatMode = i;
        GLAnimation gLAnimation = this.glAnimation;
        if (gLAnimation != null) {
            gLAnimation.setRepeatMode(i);
        }
        this.updateFlags.mRepeatModeUpdate = true;
    }
}
