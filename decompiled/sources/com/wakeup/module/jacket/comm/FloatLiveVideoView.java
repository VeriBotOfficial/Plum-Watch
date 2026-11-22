package com.wakeup.module.jacket.comm;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatLiveVideoView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u00019B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0017J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020&H\u0002J\u0010\u00103\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\b\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\u0010\u00107\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/wakeup/module/jacket/comm/FloatLiveVideoView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "parentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroidx/constraintlayout/widget/ConstraintLayout;)V", "getParentView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "TAG", "", "x", "", "y", "startX", "startY", "initialX", "initialY", "controlledSpace", "isShow", "", "isWindowPermission", "windowManager", "Landroid/view/WindowManager;", "windowManagerParams", "Landroid/view/WindowManager$LayoutParams;", "mClickListener", "Lcom/wakeup/module/jacket/comm/FloatLiveVideoView$FloatClickListener;", "initView", "", "c", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "hide", "show", "mOriginalRawX", "mOriginalRawY", "mOriginalX", "mOriginalY", "mScreenWidth", "mScreenHeight", "mMinY", "mMaxY", "initTouchDown", "ev", "changeOriginalTouchParams", "updateSize", "updateViewPosition", "checkWindowPermission", "setOnFloatClickListener", "l", "FloatClickListener", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FloatLiveVideoView extends CardView {
    private final String TAG;
    private final int controlledSpace;
    private int initialX;
    private int initialY;
    private boolean isShow;
    private boolean isWindowPermission;
    private FloatClickListener mClickListener;
    private float mMaxY;
    private float mMinY;
    private float mOriginalRawX;
    private float mOriginalRawY;
    private float mOriginalX;
    private float mOriginalY;
    private int mScreenHeight;
    private int mScreenWidth;
    private final ConstraintLayout parentView;
    private int startX;
    private int startY;
    private WindowManager windowManager;
    private final WindowManager.LayoutParams windowManagerParams;
    private float x;
    private float y;

    /* compiled from: FloatLiveVideoView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/module/jacket/comm/FloatLiveVideoView$FloatClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FloatClickListener {
        void onClick(View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatLiveVideoView(Context context, AttributeSet attributeSet, ConstraintLayout parentView) {
        this(context, attributeSet, 0, parentView, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatLiveVideoView(Context context, ConstraintLayout parentView) {
        this(context, null, 0, parentView, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
    }

    public /* synthetic */ FloatLiveVideoView(Context context, AttributeSet attributeSet, int i, ConstraintLayout constraintLayout, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i, constraintLayout);
    }

    public final ConstraintLayout getParentView() {
        return this.parentView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatLiveVideoView(Context context, AttributeSet attributeSet, int i, ConstraintLayout parentView) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.parentView = parentView;
        this.TAG = "FloatLiveVideoView";
        this.controlledSpace = 20;
        this.windowManagerParams = new WindowManager.LayoutParams();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        initView(context2);
    }

    private final void initView(Context c) {
        int dp2px = UIHelper.dp2px(125.0f);
        int dp2px2 = UIHelper.dp2px(222.0f);
        boolean checkWindowPermission = checkWindowPermission();
        this.isWindowPermission = checkWindowPermission;
        if (checkWindowPermission) {
            Object systemService = c.getApplicationContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.windowManager = (WindowManager) systemService;
            this.windowManagerParams.type = 2038;
            this.windowManagerParams.format = 1;
            this.windowManagerParams.flags = 40;
            this.windowManagerParams.width = dp2px;
            this.windowManagerParams.height = dp2px2;
            this.windowManagerParams.x = ((UIHelper.getWindowWidth(c) / 2) - (dp2px / 2)) - UIHelper.dp2px(16.0f);
            this.windowManagerParams.y = -((((UIHelper.getWindowHeight(c) / 2) - UIHelper.dp2px(20.0f)) - UIHelper.dp2px(44.0f)) - (dp2px2 / 2));
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(dp2px, dp2px2));
            setX((UIHelper.getWindowWidth(c) - dp2px) - UIHelper.dp2px(16.0f));
            setY(UIHelper.getStatusBarHeight() + UIHelper.dp2px(44.0f) + UIHelper.dp2px(20.0f));
        }
        setCardElevation(UIHelper.dp2px(10.0f));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        FloatClickListener floatClickListener;
        Intrinsics.checkNotNullParameter(event, "event");
        this.x = event.getRawX();
        this.y = event.getRawY();
        int action = event.getAction();
        if (action == 0) {
            this.startX = (int) event.getRawX();
            this.startY = (int) event.getRawY();
            if (this.isWindowPermission) {
                this.initialX = this.windowManagerParams.x;
                this.initialY = this.windowManagerParams.y;
            } else {
                initTouchDown(event);
            }
        } else if (action != 1) {
            if (action == 2) {
                updateViewPosition(event);
            }
        } else if (Math.abs(this.x - this.startX) < this.controlledSpace && Math.abs(this.y - this.startY) < this.controlledSpace && (floatClickListener = this.mClickListener) != null) {
            floatClickListener.onClick(this);
        }
        return true;
    }

    public final void hide() {
        if (this.isShow) {
            if (this.isWindowPermission) {
                WindowManager windowManager = this.windowManager;
                if (windowManager != null) {
                    windowManager.removeView(this);
                }
            } else {
                this.parentView.removeView(this);
            }
            this.isShow = false;
        }
    }

    public final void show() {
        if (this.isShow) {
            return;
        }
        if (this.isWindowPermission) {
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.addView(this, this.windowManagerParams);
            }
        } else {
            this.parentView.addView(this);
        }
        this.isShow = true;
    }

    private final void initTouchDown(MotionEvent ev) {
        changeOriginalTouchParams(ev);
        updateSize();
    }

    private final void changeOriginalTouchParams(MotionEvent event) {
        this.mOriginalX = getX();
        this.mOriginalY = getY();
        this.mOriginalRawX = event.getRawX();
        this.mOriginalRawY = event.getRawY();
    }

    private final void updateSize() {
        this.mScreenWidth = this.parentView.getWidth() - getWidth();
        int height = this.parentView.getHeight();
        this.mScreenHeight = height;
        if (this.mMaxY == 0.0f) {
            this.mMaxY = height;
        }
    }

    private final void updateViewPosition(MotionEvent event) {
        if (this.isWindowPermission) {
            this.windowManagerParams.x = this.initialX + ((int) (this.x - this.startX));
            this.windowManagerParams.y = this.initialY + ((int) (this.y - this.startY));
            WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, this.windowManagerParams);
                return;
            }
            return;
        }
        float rawX = (this.mOriginalX + event.getRawX()) - this.mOriginalRawX;
        if (rawX < 0.0f) {
            rawX = 0.0f;
        }
        int i = this.mScreenWidth;
        if (rawX > i) {
            rawX = i;
        }
        setX(rawX);
        float rawY = (this.mOriginalY + event.getRawY()) - this.mOriginalRawY;
        float f = this.mMinY;
        if (rawY < f) {
            rawY = f;
        }
        float f2 = this.mMaxY;
        if (rawY > f2) {
            rawY = f2;
        }
        setY(rawY);
    }

    private final boolean checkWindowPermission() {
        return Settings.canDrawOverlays(getContext());
    }

    public final void setOnFloatClickListener(FloatClickListener l) {
        this.mClickListener = l;
    }
}
