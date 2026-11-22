package com.qumeng.overseas.advlib.__remote__.ui.elements.twist;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.l;
import com.qumeng.overseas.advlib.__remote__.ui.elements.ExImageView;
import com.qumeng.overseas.advlib.__remote__.ui.incite.video.s;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class c extends FrameLayout implements GestureDetector.OnGestureListener {
    static final float w = 50.0f;
    private GestureDetector t;
    private b u;
    private long v;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            c.this.t.onTouchEvent(motionEvent);
            return true;
        }
    }

    public interface b {
        void onScroll(float f);
    }

    public c(Context context) {
        super(context);
        a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
        n.c("swipe:onScroll", "e1.getX() :" + motionEvent.getX() + "  e2.getX():" + motionEvent2.getX() + " distanceX:" + f, new Object[0]);
        float abs = Math.abs(motionEvent.getX() - motionEvent2.getX());
        if (this.u == null || abs <= 50.0f || System.currentTimeMillis() - this.v <= 2000) {
            return false;
        }
        this.v = System.currentTimeMillis();
        this.u.onScroll(abs);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setListener(b bVar) {
        this.u = bVar;
    }

    protected void a(Context context) {
        n.c(s.J0, "进入新版激励视频滑动界面", new Object[0]);
        this.t = new GestureDetector(context, this);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        ExImageView exImageView = new ExImageView(context);
        l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/newincitevideo_swipe.gif").into(exImageView);
        int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), 269.0f);
        int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), 74.0f);
        exImageView.setOnTouchListener(new a());
        linearLayout.addView(exImageView, new LinearLayout.LayoutParams(a2, a3));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(linearLayout, layoutParams);
    }
}
