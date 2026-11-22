package com.qumeng.overseas.advlib.__remote__.ui.dialog;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class e extends RelativeLayout {
    private GestureDetector t;
    private ViewDragHelper u;
    private View v;
    private int w;
    private int x;
    private PopupWindow y;
    private boolean z;

    class a extends ViewDragHelper.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f13095a;

        a(View view) {
            this.f13095a = view;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return Math.min(i, e.this.w);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 0 && e.this.z && e.this.y != null && e.this.y.isShowing()) {
                e.this.y.dismiss();
            }
            super.onViewDragStateChanged(i);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            super.onViewReleased(view, f, f2);
            if (view.getBottom() < e.this.x - s.a(e.this.getContext(), 10.0f)) {
                e.this.a();
            } else {
                e.this.u.settleCapturedViewAt(0, e.this.w);
            }
            e.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            return view == this.f13095a;
        }
    }

    class b implements GestureDetector.OnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    public e(Context context) {
        super(context);
        this.z = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        ViewDragHelper viewDragHelper = this.u;
        if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.u;
        if (viewDragHelper != null) {
            return viewDragHelper.shouldInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w = this.v.getTop();
        this.x = this.v.getBottom();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.t.onTouchEvent(motionEvent)) {
            Object obj = this.y;
            if (!(obj instanceof View.OnClickListener)) {
                return true;
            }
            ((View.OnClickListener) obj).onClick(this);
            return true;
        }
        ViewDragHelper viewDragHelper = this.u;
        if (viewDragHelper == null) {
            return true;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    public void a(View view, PopupWindow popupWindow) {
        this.v = view;
        this.y = popupWindow;
        this.u = ViewDragHelper.create(this, 1.0f, new a(view));
        this.t = new GestureDetector(getContext(), new b());
    }

    public void a() {
        this.z = true;
        this.u.settleCapturedViewAt(0, -this.x);
    }
}
