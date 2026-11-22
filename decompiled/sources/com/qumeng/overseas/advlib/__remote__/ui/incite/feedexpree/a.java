package com.qumeng.overseas.advlib.__remote__.ui.incite.feedexpree;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.Random;

/* loaded from: classes17.dex */
public class a extends FrameLayout {
    private final InterfaceC0841a t;
    private Context u;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.incite.feedexpree.a$a, reason: collision with other inner class name */
    public interface InterfaceC0841a {
        void isInClickArea(boolean z, View view);
    }

    public a(Context context, InterfaceC0841a interfaceC0841a) {
        super(context);
        this.u = context;
        this.t = interfaceC0841a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.t != null) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i = iArr[0];
            if (new Rect(i, iArr[1], getWidth() + i, iArr[1] + getHeight()).contains(rawX, rawY)) {
                n.c("clickarea", "内部", new Object[0]);
                this.t.isInClickArea(true, this);
                long uptimeMillis = SystemClock.uptimeMillis();
                long uptimeMillis2 = SystemClock.uptimeMillis() + 100;
                Random random = new Random();
                float f = rawX;
                float f2 = rawY;
                ((Activity) this.u).dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, f, f2, 0));
                long nextInt = random.nextInt(300) + 200;
                ((Activity) this.u).dispatchTouchEvent(MotionEvent.obtain(uptimeMillis + nextInt, uptimeMillis2 + nextInt, 1, f, f2, 0));
            }
        }
        return true;
    }
}
