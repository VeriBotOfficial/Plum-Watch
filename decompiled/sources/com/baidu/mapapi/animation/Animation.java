package com.baidu.mapapi.animation;

import android.view.animation.Interpolator;
import com.baidu.mapsdkplatform.comapi.animation.BDAnimation;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes13.dex */
public abstract class Animation {

    /* renamed from: a, reason: collision with root package name */
    RepeatMode f7814a;
    int b;
    public BDAnimation bdAnimation;
    public BmAnimation bmAnimation;
    long c;

    public interface AnimationListener {
        void onAnimationCancel();

        void onAnimationEnd();

        void onAnimationRepeat();

        void onAnimationStart();
    }

    public enum RepeatMode {
        RESTART,
        REVERSE
    }

    protected Animation() {
    }

    public abstract void cancel();

    public long getDuration() {
        return this.c;
    }

    public int getRepeatCount() {
        return this.b;
    }

    public RepeatMode getRepeatMode() {
        return this.f7814a;
    }

    public abstract void setAnimationListener(AnimationListener animationListener);

    public abstract void setDuration(long j);

    public abstract void setInterpolator(Interpolator interpolator);
}
