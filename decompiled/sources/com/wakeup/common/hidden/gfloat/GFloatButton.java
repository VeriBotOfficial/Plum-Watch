package com.wakeup.common.hidden.gfloat;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public class GFloatButton extends RelativeLayout {
    private static final int BUTTOM = 4;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;
    private static final int TOP = 3;
    public static boolean isGFloatShow = false;
    private int dpi;
    private boolean isDrag;
    private boolean isScroll;
    private int lastX;
    private int lastY;
    private float mTouchStartX;
    private float mTouchStartY;
    private int screenHeight;
    private int screenWidth;
    private WindowManager wm;
    private WindowManager.LayoutParams wmParams;
    private float x;
    private float y;

    private int dpi(int densityDpi) {
        if (densityDpi <= 120) {
            return 36;
        }
        if (densityDpi <= 160) {
            return 48;
        }
        if (densityDpi <= 240) {
            return 72;
        }
        return densityDpi <= 320 ? 96 : 108;
    }

    private void init(Activity activity) {
        if (this.wm == null) {
            this.wm = (WindowManager) activity.getSystemService("window");
            LayoutInflater.from(activity).inflate(R.layout.layout_button_gfloat, this);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.dpi = dpi(displayMetrics.densityDpi);
            this.screenWidth = this.wm.getDefaultDisplay().getWidth();
            this.screenHeight = this.wm.getDefaultDisplay().getHeight();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.wmParams = layoutParams;
            layoutParams.type = 2;
            this.wmParams.format = 1;
            this.wmParams.gravity = 8388659;
            this.wmParams.flags = 8;
            this.wmParams.width = this.dpi;
            this.wmParams.height = this.dpi;
            this.wmParams.x = this.screenWidth - this.dpi;
            this.wmParams.y = this.screenHeight - (this.dpi * 6);
            this.wm.addView(this, this.wmParams);
            hide();
        }
    }

    public void show() {
        if (isShown()) {
            return;
        }
        setVisibility(0);
    }

    public void hide() {
        setVisibility(8);
    }

    public void destory() {
        hide();
        this.wm.removeViewImmediate(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        this.x = event.getRawX();
        this.y = event.getRawY();
        int action = event.getAction();
        if (action == 0) {
            setPressed(true);
            this.isDrag = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.lastX = (int) this.x;
            this.lastY = (int) this.y;
            this.mTouchStartX = event.getX();
            this.mTouchStartY = event.getY();
        } else if (action == 1) {
            if (this.isScroll) {
                setPressed(!this.isDrag);
                autoView();
            }
            this.isScroll = false;
            this.mTouchStartY = 0.0f;
            this.mTouchStartX = 0.0f;
        } else if (action == 2) {
            if (this.isScroll) {
                int i = (int) (this.x - this.lastX);
                int i2 = (int) (this.y - this.lastY);
                boolean z = ((int) Math.sqrt((double) ((i * i) + (i2 * i2)))) > 0;
                this.isDrag = z;
                if (z) {
                    updateViewPosition();
                    this.isScroll = true;
                }
            } else if (Math.abs(this.mTouchStartX - event.getX()) > this.dpi / 3.0f || Math.abs(this.mTouchStartY - event.getY()) > this.dpi / 3.0f) {
                updateViewPosition();
                this.isScroll = true;
            }
        }
        return this.isDrag || super.onTouchEvent(event);
    }

    private void autoView() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (iArr[0] < (this.screenWidth / 2) - (getWidth() / 2)) {
            updateViewPosition(0);
        } else {
            updateViewPosition(1);
        }
    }

    private void updateViewPosition(int l) {
        if (l == 0) {
            this.wmParams.x = 0;
        } else if (l == 1) {
            this.wmParams.x = this.screenWidth - this.dpi;
        } else if (l == 3) {
            this.wmParams.y = 0;
        } else if (l == 4) {
            this.wmParams.y = this.screenHeight - this.dpi;
        }
        this.wm.updateViewLayout(this, this.wmParams);
    }

    private void updateViewPosition() {
        this.wmParams.x = (int) (this.x - this.mTouchStartX);
        this.wmParams.y = (int) ((this.y - this.mTouchStartY) - (this.screenHeight / 25));
        this.wm.updateViewLayout(this, this.wmParams);
    }

    public GFloatButton(Activity activity) {
        super(activity);
        init(activity);
    }

    public GFloatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GFloatButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
