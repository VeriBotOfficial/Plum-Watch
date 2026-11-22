package com.wakeup.module.jacket.oneTrans;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.wakeup.common.log.LogUtils;
import com.wakeup.module.jacket.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTransFloatView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0017J\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020!J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010\u0019J\b\u0010*\u001a\u00020!H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/wakeup/module/jacket/oneTrans/OneTransFloatView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTouchX", "", "mTouchY", "x", "y", "startX", "startY", "initialX", "initialY", "imgId", "controlledSpace", "screenWidth", "isShow", "", "mClickListener", "Lcom/wakeup/module/jacket/oneTrans/OneTransFloatView$OneTransClickListener;", "windowManager", "Landroid/view/WindowManager;", "windowManagerParams", "Landroid/view/WindowManager$LayoutParams;", "mHandler", "Landroid/os/Handler;", "initView", "", "c", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "hide", "show", "setOnClickListener", "l", "updateViewPosition", "mLongClickRunnable", "Ljava/lang/Runnable;", "OneTransClickListener", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OneTransFloatView extends AppCompatImageView {
    private final int controlledSpace;
    private int imgId;
    private int initialX;
    private int initialY;
    private boolean isShow;
    private OneTransClickListener mClickListener;
    private final Handler mHandler;
    private final Runnable mLongClickRunnable;
    private float mTouchX;
    private float mTouchY;
    private int screenWidth;
    private int startX;
    private int startY;
    private WindowManager windowManager;
    private final WindowManager.LayoutParams windowManagerParams;
    private float x;
    private float y;

    /* compiled from: OneTransFloatView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/wakeup/module/jacket/oneTrans/OneTransFloatView$OneTransClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "onLongClick", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OneTransClickListener {
        void onClick(View view);

        void onLongClick(View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneTransFloatView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneTransFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneTransFloatView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTransFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imgId = R.drawable.ic_one_trans_float;
        this.controlledSpace = 20;
        this.windowManagerParams = new WindowManager.LayoutParams();
        this.mHandler = new Handler(Looper.getMainLooper());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        initView(context2);
        this.mLongClickRunnable = new Runnable() { // from class: com.wakeup.module.jacket.oneTrans.OneTransFloatView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OneTransFloatView.mLongClickRunnable$lambda$0(OneTransFloatView.this);
            }
        };
    }

    private final void initView(Context c) {
        Object systemService = c.getApplicationContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        this.windowManager = windowManager;
        Intrinsics.checkNotNull(windowManager);
        this.screenWidth = windowManager.getDefaultDisplay().getWidth();
        setImageResource(this.imgId);
        this.windowManagerParams.type = 2038;
        this.windowManagerParams.format = 1;
        this.windowManagerParams.flags = 40;
        this.windowManagerParams.gravity = 51;
        this.windowManagerParams.x = 0;
        this.windowManagerParams.y = 200;
        this.windowManagerParams.width = -2;
        this.windowManagerParams.height = -2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        OneTransClickListener oneTransClickListener;
        Intrinsics.checkNotNullParameter(event, "event");
        this.x = event.getRawX();
        this.y = event.getRawY();
        int action = event.getAction();
        if (action == 0) {
            this.initialX = this.windowManagerParams.x;
            this.initialY = this.windowManagerParams.y;
            this.mTouchX = event.getX();
            this.mTouchY = event.getY();
            this.startX = (int) event.getRawX();
            this.startY = (int) event.getRawY();
            this.mHandler.postDelayed(this.mLongClickRunnable, 2000L);
        } else if (action == 1) {
            this.mHandler.removeCallbacks(this.mLongClickRunnable);
            if (Math.abs(this.x - this.startX) < this.controlledSpace && Math.abs(this.y - this.startY) < this.controlledSpace && (oneTransClickListener = this.mClickListener) != null) {
                oneTransClickListener.onClick(this);
            }
            LogUtils.i("tag", "x=" + this.x + " startX+" + this.startX + " y=" + this.y + " startY=" + this.startY);
            float f = this.x;
            int i = this.screenWidth;
            this.x = f <= ((float) (i / 2)) ? 0.0f : i;
            updateViewPosition();
        } else if (action == 2) {
            updateViewPosition();
        }
        return super.onTouchEvent(event);
    }

    public final void hide() {
        if (this.isShow) {
            WindowManager windowManager = this.windowManager;
            Intrinsics.checkNotNull(windowManager);
            windowManager.removeView(this);
            this.isShow = false;
        }
    }

    public final void show() {
        if (this.isShow) {
            return;
        }
        WindowManager windowManager = this.windowManager;
        Intrinsics.checkNotNull(windowManager);
        windowManager.addView(this, this.windowManagerParams);
        this.isShow = true;
    }

    /* renamed from: isShow, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    public final void setOnClickListener(OneTransClickListener l) {
        this.mClickListener = l;
    }

    private final void updateViewPosition() {
        this.windowManagerParams.x = this.initialX + ((int) (this.x - this.startX));
        this.windowManagerParams.y = this.initialY + ((int) (this.y - this.startY));
        WindowManager windowManager = this.windowManager;
        Intrinsics.checkNotNull(windowManager);
        windowManager.updateViewLayout(this, this.windowManagerParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mLongClickRunnable$lambda$0(OneTransFloatView oneTransFloatView) {
        OneTransClickListener oneTransClickListener;
        if (Math.abs(oneTransFloatView.x - oneTransFloatView.startX) >= oneTransFloatView.controlledSpace || Math.abs(oneTransFloatView.y - oneTransFloatView.startY) >= oneTransFloatView.controlledSpace || (oneTransClickListener = oneTransFloatView.mClickListener) == null) {
            return;
        }
        oneTransClickListener.onLongClick(oneTransFloatView);
    }
}
