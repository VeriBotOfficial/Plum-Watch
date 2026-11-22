package com.autonavi.amap.mapcore.animation;

import android.view.animation.Interpolator;
import com.amap.api.maps.model.animation.Animation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class GLAnimationSet extends GLAnimation {
    private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
    private static final int PROPERTY_DURATION_MASK = 32;
    private static final int PROPERTY_FILL_AFTER_MASK = 1;
    private static final int PROPERTY_FILL_BEFORE_MASK = 2;
    private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
    private static final int PROPERTY_REPEAT_MODE_MASK = 4;
    private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
    private static final int PROPERTY_START_OFFSET_MASK = 8;
    private boolean mDirty;
    private boolean mHasAlpha;
    private long mLastEnd;
    private int mFlags = 0;
    private ArrayList<GLAnimation> mAnimations = new ArrayList<>();
    private GLTransformation mTempTransformation = new GLTransformation();

    public GLAnimationSet(boolean z) {
        setFlag(16, z);
        init();
    }

    private void init() {
        this.mStartTime = 0L;
    }

    private void setFlag(int i, boolean z) {
        if (z) {
            this.mFlags = i | this.mFlags;
        } else {
            this.mFlags = (~i) & this.mFlags;
        }
    }

    public void addAnimation(Animation animation) {
        this.mAnimations.add(animation.glAnimation);
        if ((this.mFlags & 64) == 0 && animation.glAnimation.willChangeTransformationMatrix()) {
            this.mFlags |= 64;
        }
        if ((this.mFlags & 128) == 0 && animation.glAnimation.willChangeBounds()) {
            this.mFlags |= 128;
        }
        if ((this.mFlags & 32) == 32) {
            this.mLastEnd = this.mStartOffset + this.mDuration;
        } else if (this.mAnimations.size() == 1) {
            long startOffset = animation.glAnimation.getStartOffset() + animation.glAnimation.getDuration();
            this.mDuration = startOffset;
            this.mLastEnd = this.mStartOffset + startOffset;
        } else {
            long max = Math.max(this.mLastEnd, animation.glAnimation.getStartOffset() + animation.glAnimation.getDuration());
            this.mLastEnd = max;
            this.mDuration = max - this.mStartOffset;
        }
        this.mDirty = true;
    }

    public void cleanAnimation() {
        this.mAnimations.clear();
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long computeDurationHint() {
        int size = this.mAnimations.size();
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        long j = 0;
        for (int i = size - 1; i >= 0; i--) {
            long computeDurationHint = arrayList.get(i).computeDurationHint();
            if (computeDurationHint > j) {
                j = computeDurationHint;
            }
        }
        return j;
    }

    public List<GLAnimation> getAnimations() {
        return this.mAnimations;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long getDuration() {
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        int size = arrayList.size();
        if ((this.mFlags & 32) == 32) {
            return this.mDuration;
        }
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, arrayList.get(i).getDuration());
        }
        return j;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public long getStartTime() {
        int size = this.mAnimations.size();
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.min(j, arrayList.get(i).getStartTime());
        }
        return j;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean getTransformation(long j, GLTransformation gLTransformation) {
        if (!this.mInitialized) {
            initialize();
        }
        int size = this.mAnimations.size();
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        GLTransformation gLTransformation2 = this.mTempTransformation;
        gLTransformation.clear();
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = size - 1; i >= 0; i--) {
            GLAnimation gLAnimation = arrayList.get(i);
            gLTransformation2.clear();
            z3 = gLAnimation.getTransformation(j, gLTransformation, getScaleFactor()) || z3;
            z2 = z2 || gLAnimation.hasStarted();
            z = gLAnimation.hasEnded() && z;
        }
        if (z2) {
            try {
                if (!this.mStarted) {
                    Animation.AnimationListener animationListener = this.mListener;
                    if (animationListener != null) {
                        animationListener.onAnimationStart();
                    }
                    this.mStarted = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (z != this.mEnded) {
            Animation.AnimationListener animationListener2 = this.mListener;
            if (animationListener2 != null) {
                animationListener2.onAnimationEnd();
            }
            this.mEnded = z;
            return z3;
        }
        return z3;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean hasAlpha() {
        if (this.mDirty) {
            int i = 0;
            this.mHasAlpha = false;
            this.mDirty = false;
            int size = this.mAnimations.size();
            ArrayList<GLAnimation> arrayList = this.mAnimations;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (arrayList.get(i).hasAlpha()) {
                    this.mHasAlpha = true;
                    break;
                }
                i++;
            }
        }
        return this.mHasAlpha;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void initialize() {
        ArrayList<GLAnimation> arrayList;
        boolean z;
        super.initialize();
        int i = this.mFlags;
        boolean z2 = (i & 32) == 32;
        boolean z3 = (i & 1) == 1;
        boolean z4 = (i & 2) == 2;
        boolean z5 = (i & 4) == 4;
        boolean z6 = (i & 16) == 16;
        boolean z7 = (i & 8) == 8;
        if (z6) {
            ensureInterpolator();
        }
        ArrayList<GLAnimation> arrayList2 = this.mAnimations;
        int size = arrayList2.size();
        long j = this.mDuration;
        boolean z8 = this.mFillAfter;
        boolean z9 = this.mFillBefore;
        int i2 = this.mRepeatMode;
        Interpolator interpolator = this.mInterpolator;
        boolean z10 = z7;
        long j2 = this.mStartOffset;
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3;
            GLAnimation gLAnimation = arrayList2.get(i3);
            if (z2) {
                gLAnimation.setDuration(j);
            }
            if (z3) {
                gLAnimation.setFillAfter(z8);
            }
            if (z4) {
                gLAnimation.setFillBefore(z9);
            }
            if (z5) {
                gLAnimation.setRepeatMode(i2);
            }
            if (z6) {
                gLAnimation.setInterpolator(interpolator);
            }
            if (z10) {
                arrayList = arrayList2;
                z = z2;
                gLAnimation.setStartOffset(gLAnimation.getStartOffset() + j2);
            } else {
                arrayList = arrayList2;
                z = z2;
            }
            gLAnimation.initialize();
            i3 = i4 + 1;
            z2 = z;
            arrayList2 = arrayList;
        }
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void reset() {
        super.reset();
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void restrictDuration(long j) {
        super.restrictDuration(j);
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).restrictDuration(j);
        }
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void scaleCurrentDuration(float f) {
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).scaleCurrentDuration(f);
        }
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setDuration(long j) {
        this.mFlags |= 32;
        super.setDuration(j);
        this.mLastEnd = this.mStartOffset + this.mDuration;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setFillAfter(boolean z) {
        this.mFlags |= 1;
        super.setFillAfter(z);
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setFillBefore(boolean z) {
        this.mFlags |= 2;
        super.setFillBefore(z);
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setRepeatMode(int i) {
        this.mFlags |= 4;
        super.setRepeatMode(i);
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setStartOffset(long j) {
        this.mFlags |= 8;
        super.setStartOffset(j);
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public void setStartTime(long j) {
        super.setStartTime(j);
        int size = this.mAnimations.size();
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        for (int i = 0; i < size; i++) {
            arrayList.get(i).setStartTime(j);
        }
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean willChangeBounds() {
        return (this.mFlags & 128) == 128;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    public boolean willChangeTransformationMatrix() {
        return (this.mFlags & 64) == 64;
    }

    @Override // com.autonavi.amap.mapcore.animation.GLAnimation
    /* renamed from: clone */
    public GLAnimationSet mo7194clone() throws CloneNotSupportedException {
        GLAnimationSet gLAnimationSet = (GLAnimationSet) super.mo7194clone();
        gLAnimationSet.mTempTransformation = new GLTransformation();
        gLAnimationSet.mAnimations = new ArrayList<>();
        int size = this.mAnimations.size();
        ArrayList<GLAnimation> arrayList = this.mAnimations;
        for (int i = 0; i < size; i++) {
            gLAnimationSet.mAnimations.add(arrayList.get(i).mo7194clone());
        }
        return gLAnimationSet;
    }
}
