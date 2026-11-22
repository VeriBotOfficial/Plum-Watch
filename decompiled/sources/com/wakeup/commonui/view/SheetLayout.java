package com.wakeup.commonui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SheetLayout.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u000289B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002032\u0006\u0010/\u001a\u000200H\u0002J\u001a\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020'H\u0002J\u001e\u00107\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+¨\u0006:"}, d2 = {"Lcom/wakeup/commonui/view/SheetLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "actionDownY", "dy", "mHeight", "minDy", "state", "getState", "()I", "setState", "(I)V", ViewProps.MAX_HEIGHT, "getMaxHeight", "setMaxHeight", "normalHeight", "getNormalHeight", "setNormalHeight", ViewProps.MIN_HEIGHT, "getMinHeight", "setMinHeight", "listener", "Lcom/wakeup/commonui/view/SheetLayout$OnStatusChangeListener;", "getListener", "()Lcom/wakeup/commonui/view/SheetLayout$OnStatusChangeListener;", "setListener", "(Lcom/wakeup/commonui/view/SheetLayout$OnStatusChangeListener;)V", "isMove", "", "isAniming", "()Z", "setAniming", "(Z)V", "isTouch", "setTouch", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "handleEvent", "", "changeHeight", "h", "isAnim", "initHeight", "Companion", "OnStatusChangeListener", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SheetLayout extends FrameLayout {
    public static final int STATUS_FOLD = 1;
    public static final int STATUS_FULL = 2;
    public static final int STATUS_NORMAL = 0;
    private final String TAG;
    private int actionDownY;
    private int dy;
    private boolean isAniming;
    private boolean isMove;
    private boolean isTouch;
    private OnStatusChangeListener listener;
    private int mHeight;
    private int maxHeight;
    private final int minDy;
    private int minHeight;
    private int normalHeight;
    private int state;

    /* compiled from: SheetLayout.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commonui/view/SheetLayout$OnStatusChangeListener;", "", "onStatusChange", "", "status", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnStatusChangeListener {
        void onStatusChange(int status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SheetLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SheetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SheetLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "SheetLayout";
        this.minDy = 10;
        this.maxHeight = UIHelper.dp2px(600.0f);
        this.normalHeight = UIHelper.dp2px(400.0f);
        this.minHeight = UIHelper.dp2px(160.0f);
        this.isTouch = true;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final int getNormalHeight() {
        return this.normalHeight;
    }

    public final void setNormalHeight(int i) {
        this.normalHeight = i;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final void setMinHeight(int i) {
        this.minHeight = i;
    }

    public final OnStatusChangeListener getListener() {
        return this.listener;
    }

    public final void setListener(OnStatusChangeListener onStatusChangeListener) {
        this.listener = onStatusChangeListener;
    }

    /* renamed from: isAniming, reason: from getter */
    public final boolean getIsAniming() {
        return this.isAniming;
    }

    public final void setAniming(boolean z) {
        this.isAniming = z;
    }

    /* renamed from: isTouch, reason: from getter */
    public final boolean getIsTouch() {
        return this.isTouch;
    }

    public final void setTouch(boolean z) {
        this.isTouch = z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isTouch) {
            handleEvent(event);
            if (this.isMove) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isTouch) {
            return true;
        }
        handleEvent(event);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r4 != 2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L95
            r2 = 1
            r3 = 2
            if (r0 == r2) goto L30
            if (r0 == r3) goto Lf
            goto L94
        Lf:
            boolean r0 = r5.isAniming
            if (r0 != 0) goto L94
            float r6 = r6.getRawY()
            int r6 = (int) r6
            int r0 = r5.actionDownY
            int r6 = r6 - r0
            r5.dy = r6
            int r6 = java.lang.Math.abs(r6)
            r0 = 15
            if (r6 <= r0) goto L27
            r5.isMove = r2
        L27:
            int r6 = r5.mHeight
            int r0 = r5.dy
            int r6 = r6 - r0
            r5.changeHeight(r6, r1)
            return
        L30:
            int r6 = r5.dy
            r0 = 0
            if (r6 >= 0) goto L64
            int r4 = r5.state
            if (r4 == 0) goto L53
            if (r4 == r2) goto L3e
            if (r4 == r3) goto L53
            goto L5a
        L3e:
            int r2 = r5.mHeight
            int r2 = r2 - r6
            int r6 = r5.normalHeight
            if (r2 <= r6) goto L4d
            r5.state = r3
            int r6 = r5.maxHeight
            changeHeight$default(r5, r6, r1, r3, r0)
            goto L5a
        L4d:
            r5.state = r1
            changeHeight$default(r5, r6, r1, r3, r0)
            goto L5a
        L53:
            r5.state = r3
            int r6 = r5.maxHeight
            changeHeight$default(r5, r6, r1, r3, r0)
        L5a:
            com.wakeup.commonui.view.SheetLayout$OnStatusChangeListener r6 = r5.listener
            if (r6 == 0) goto L94
            int r0 = r5.state
            r6.onStatusChange(r0)
            return
        L64:
            if (r6 <= 0) goto L94
            int r4 = r5.state
            if (r4 == 0) goto L84
            if (r4 == r2) goto L84
            if (r4 == r3) goto L6f
            goto L8b
        L6f:
            int r4 = r5.mHeight
            int r4 = r4 - r6
            int r6 = r5.normalHeight
            if (r4 >= r6) goto L7e
            r5.state = r2
            int r6 = r5.minHeight
            changeHeight$default(r5, r6, r1, r3, r0)
            goto L8b
        L7e:
            r5.state = r1
            changeHeight$default(r5, r6, r1, r3, r0)
            goto L8b
        L84:
            r5.state = r2
            int r6 = r5.minHeight
            changeHeight$default(r5, r6, r1, r3, r0)
        L8b:
            com.wakeup.commonui.view.SheetLayout$OnStatusChangeListener r6 = r5.listener
            if (r6 == 0) goto L94
            int r0 = r5.state
            r6.onStatusChange(r0)
        L94:
            return
        L95:
            r5.isMove = r1
            float r6 = r6.getRawY()
            int r6 = (int) r6
            r5.actionDownY = r6
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            int r6 = r6.height
            r5.mHeight = r6
            r5.dy = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.view.SheetLayout.handleEvent(android.view.MotionEvent):void");
    }

    static /* synthetic */ void changeHeight$default(SheetLayout sheetLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        sheetLayout.changeHeight(i, z);
    }

    private final void changeHeight(final int h, boolean isAnim) {
        if (!isAnim) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = h;
            setLayoutParams(layoutParams);
        } else {
            if (this.isAniming) {
                return;
            }
            this.isAniming = true;
            ValueAnimator ofInt = ValueAnimator.ofInt(this.mHeight - this.dy, h);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.view.SheetLayout$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SheetLayout.changeHeight$lambda$0(SheetLayout.this, h, valueAnimator);
                }
            });
            ofInt.start();
            this.mHeight = h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeHeight$lambda$0(SheetLayout sheetLayout, int i, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = sheetLayout.getLayoutParams();
        layoutParams.height = intValue;
        sheetLayout.setLayoutParams(layoutParams);
        if (intValue == i) {
            sheetLayout.isAniming = false;
        }
    }

    public final void initHeight(int minHeight, int normalHeight, int maxHeight) {
        this.minHeight = minHeight;
        this.normalHeight = normalHeight;
        this.maxHeight = maxHeight;
        changeHeight$default(this, normalHeight, false, 2, null);
    }
}
