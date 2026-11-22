package com.wakeup.module.gpt.view;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commponent.module.data.HealthItem;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/module/gpt/view/DragController;", "", "<init>", "()V", "Builder", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DragController {

    /* compiled from: DragController.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001:\u00015B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010'\u001a\u00020#H\u0002J\u0010\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010)\u001a\u00020#H\u0002J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u0011H\u0002J\u0014\u0010-\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aJ\u000e\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\bJ\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0011J\u0006\u00104\u001a\u00020#R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/wakeup/module/gpt/view/DragController$Builder;", "", "<init>", "()V", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mOriginalRawX", "", "mOriginalRawY", "mOriginalX", "mOriginalY", "mScreenWidth", "", "mScreenHeight", "mPortraitY", "isNearestLeft", "", "mAutoMoveToEdge", "mLastTouchDownTime", "", "delay", "mMoveAnimator", "Lcom/wakeup/module/gpt/view/DragController$Builder$MoveAnimator;", "mView", "mClick", "Lcom/wakeup/common/base/BaseCallback;", "MIN_X", "mMinY", "mMaxY", "DEFAULT_MARGIN", "dragView", "event", "Landroid/view/MotionEvent;", "initTouchDown", "", "ev", "updateSize", "changeOriginalTouchParams", "clearPortraitY", "updateViewPosition", "moveToEdge", "isLeft", "isLandscape", "isOnClickEvent", "dealClickEvent", "click", "setMaxY", HealthItem.TYPE_MAX_Y, "setMinY", HealthItem.TYPE_MIN_Y, "autoMoveToEdge", "destroy", "MoveAnimator", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Builder {
        private final float DEFAULT_MARGIN;
        private final float MIN_X;
        private final long delay;
        private boolean isNearestLeft;
        private boolean mAutoMoveToEdge;
        private BaseCallback<Boolean> mClick;
        private long mLastTouchDownTime;
        private float mMaxY;
        private float mMinY;
        private MoveAnimator mMoveAnimator;
        private float mOriginalRawX;
        private float mOriginalRawY;
        private float mOriginalX;
        private float mOriginalY;
        private float mPortraitY;
        private int mScreenHeight;
        private int mScreenWidth;
        private View mView;

        private Builder() {
            this.isNearestLeft = true;
            this.mAutoMoveToEdge = true;
            this.delay = 150L;
            this.MIN_X = 10.0f;
            this.DEFAULT_MARGIN = 10.0f;
        }

        public Builder(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.isNearestLeft = true;
            this.mAutoMoveToEdge = true;
            this.delay = 150L;
            this.MIN_X = 10.0f;
            this.DEFAULT_MARGIN = 10.0f;
            this.mView = view;
            this.mMoveAnimator = new MoveAnimator();
        }

        public final Builder dragView(MotionEvent event) {
            BaseCallback<Boolean> baseCallback;
            Intrinsics.checkNotNullParameter(event, "event");
            int action = event.getAction();
            if (action == 0) {
                initTouchDown(event);
                return this;
            }
            if (action == 1) {
                clearPortraitY();
                if (this.mAutoMoveToEdge) {
                    moveToEdge();
                }
                if (isOnClickEvent() && (baseCallback = this.mClick) != null) {
                    baseCallback.callback(0, true);
                }
            } else if (action == 2) {
                updateViewPosition(event);
                return this;
            }
            return this;
        }

        private final void initTouchDown(MotionEvent ev) {
            changeOriginalTouchParams(ev);
            updateSize();
            MoveAnimator moveAnimator = this.mMoveAnimator;
            if (moveAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMoveAnimator");
                moveAnimator = null;
            }
            moveAnimator.stop();
        }

        private final void updateSize() {
            View view = this.mView;
            View view2 = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                int width = viewGroup.getWidth();
                View view3 = this.mView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                } else {
                    view2 = view3;
                }
                this.mScreenWidth = width - view2.getWidth();
                int height = viewGroup.getHeight();
                this.mScreenHeight = height;
                if (this.mMaxY == 0.0f) {
                    this.mMaxY = height;
                }
            }
        }

        private final void changeOriginalTouchParams(MotionEvent event) {
            View view = this.mView;
            View view2 = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            this.mOriginalX = view.getX();
            View view3 = this.mView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            } else {
                view2 = view3;
            }
            this.mOriginalY = view2.getY();
            this.mOriginalRawX = event.getRawX();
            this.mOriginalRawY = event.getRawY();
            this.mLastTouchDownTime = System.currentTimeMillis();
        }

        private final void clearPortraitY() {
            this.mPortraitY = 0.0f;
        }

        private final void updateViewPosition(MotionEvent event) {
            float rawX = (this.mOriginalX + event.getRawX()) - this.mOriginalRawX;
            if (rawX < 0.0f) {
                rawX = this.MIN_X;
            }
            int i = this.mScreenWidth;
            if (rawX > i) {
                rawX = i - this.MIN_X;
            }
            View view = this.mView;
            View view2 = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            view.setX(rawX);
            float rawY = (this.mOriginalY + event.getRawY()) - this.mOriginalRawY;
            float f = this.mMinY;
            if (rawY < f) {
                rawY = f;
            }
            float f2 = this.mMaxY;
            if (rawY > f2) {
                rawY = f2;
            }
            View view3 = this.mView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            } else {
                view2 = view3;
            }
            view2.setY(rawY);
        }

        private final boolean isNearestLeft() {
            int i = this.mScreenWidth / 2;
            View view = this.mView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            boolean z = view.getX() < ((float) i);
            this.isNearestLeft = z;
            return z;
        }

        private final void moveToEdge() {
            moveToEdge(isNearestLeft(), false);
        }

        private final void moveToEdge(boolean isLeft, boolean isLandscape) {
            float f = isLeft ? this.DEFAULT_MARGIN : this.mScreenWidth - this.DEFAULT_MARGIN;
            View view = this.mView;
            View view2 = null;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            float y = view.getY();
            if (!isLandscape) {
                float f2 = this.mPortraitY;
                if (f2 != 0.0f) {
                    clearPortraitY();
                    y = f2;
                }
            }
            MoveAnimator moveAnimator = this.mMoveAnimator;
            if (moveAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMoveAnimator");
                moveAnimator = null;
            }
            View view3 = this.mView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view3 = null;
            }
            float max = Math.max(0.0f, y);
            int i = this.mScreenHeight;
            View view4 = this.mView;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            } else {
                view2 = view4;
            }
            moveAnimator.start(view3, f, Math.min(max, i - view2.getHeight()));
        }

        private final boolean isOnClickEvent() {
            return System.currentTimeMillis() - this.mLastTouchDownTime < this.delay;
        }

        public final Builder dealClickEvent(BaseCallback<Boolean> click) {
            Intrinsics.checkNotNullParameter(click, "click");
            this.mClick = click;
            return this;
        }

        public final Builder setMaxY(float maxY) {
            this.mMaxY = maxY;
            return this;
        }

        public final Builder setMinY(float minY) {
            this.mMinY = minY;
            return this;
        }

        public final Builder autoMoveToEdge(boolean autoMoveToEdge) {
            this.mAutoMoveToEdge = autoMoveToEdge;
            return this;
        }

        public final void destroy() {
            MoveAnimator moveAnimator = this.mMoveAnimator;
            if (moveAnimator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMoveAnimator");
                moveAnimator = null;
            }
            moveAnimator.stop();
        }

        /* compiled from: DragController.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/module/gpt/view/DragController$Builder$MoveAnimator;", "Ljava/lang/Runnable;", "<init>", "()V", "handler", "Landroid/os/Handler;", "destinationX", "", "destinationY", "startingTime", "", "mView", "Landroid/view/View;", "start", "", "view", "x", "y", "run", TimerController.STOP_COMMAND, "move", "deltaX", "deltaY", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class MoveAnimator implements Runnable {
            private float destinationX;
            private float destinationY;
            private final Handler handler = new Handler(Looper.getMainLooper());
            private View mView;
            private long startingTime;

            public final void start(View view, float x, float y) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.mView = view;
                this.destinationX = x;
                this.destinationY = y;
                this.startingTime = System.currentTimeMillis();
                this.handler.post(this);
            }

            @Override // java.lang.Runnable
            public void run() {
                View view = this.mView;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    view = null;
                }
                if (view.getRootView() != null) {
                    View view3 = this.mView;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mView");
                        view3 = null;
                    }
                    if (view3.getRootView().getParent() == null) {
                        return;
                    }
                    float min = Math.min(1.0f, (System.currentTimeMillis() - this.startingTime) / 400.0f);
                    float f = this.destinationX;
                    View view4 = this.mView;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mView");
                        view4 = null;
                    }
                    float x = (f - view4.getX()) * min;
                    float f2 = this.destinationY;
                    View view5 = this.mView;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mView");
                    } else {
                        view2 = view5;
                    }
                    move(x, (f2 - view2.getY()) * min);
                    if (min < 1.0f) {
                        this.handler.post(this);
                    }
                }
            }

            public final void stop() {
                this.handler.removeCallbacks(this);
            }

            private final void move(float deltaX, float deltaY) {
                View view = this.mView;
                View view2 = null;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    view = null;
                }
                View view3 = this.mView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    view3 = null;
                }
                view.setX(view3.getX() + deltaX);
                View view4 = this.mView;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                    view4 = null;
                }
                View view5 = this.mView;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                } else {
                    view2 = view5;
                }
                view4.setY(view2.getY() + deltaY);
            }
        }
    }
}
