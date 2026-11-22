package com.bytedance.adsdk.ugeno.jq.kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.rlu;
import com.bytedance.adsdk.ugeno.hm;
import java.util.Map;

/* loaded from: classes13.dex */
public class fxn extends FrameLayout {
    private hm fxn;
    private Map<Integer, rlu> kg;

    public fxn(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, rlu> map) {
        this.kg = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        hm hmVar = this.fxn;
        if (hmVar != null) {
            int[] fxn = hmVar.fxn(i, i2);
            super.onMeasure(fxn[0], fxn[1]);
        } else {
            super.onMeasure(i, i2);
        }
        hm hmVar2 = this.fxn;
        if (hmVar2 != null) {
            hmVar2.rb();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.bh();
        }
        super.onLayout(z, i, i2, i3, i4);
        hm hmVar2 = this.fxn;
        if (hmVar2 != null) {
            hmVar2.fxn(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, rlu> map = this.kg;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void fxn(hm hmVar) {
        this.fxn = hmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.sg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.tw();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.kg(i, i2, i3, i4);
        }
    }
}
