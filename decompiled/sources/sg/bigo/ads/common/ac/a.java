package sg.bigo.ads.common.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import sg.bigo.ads.common.i;

/* loaded from: classes9.dex */
public final class a extends GestureDetector {

    /* renamed from: a, reason: collision with root package name */
    public C1069a f19559a;
    public i b;
    private long c;

    /* renamed from: sg.bigo.ads.common.ac.a$a, reason: collision with other inner class name */
    public static class C1069a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19560a = false;

        C1069a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f19560a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(Context context) {
        this(context, new C1069a());
    }

    private a(Context context, C1069a c1069a) {
        super(context, c1069a);
        this.c = -1L;
        this.b = new i();
        this.f19559a = c1069a;
        setIsLongpressEnabled(false);
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f19559a.f19560a = false;
            this.c = System.currentTimeMillis();
            this.b.f19641a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.b.b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }
}
