package com.qumeng.overseas.advlib.trdparty.unionset.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public abstract class b extends FrameLayout {
    private static final long R = 200;
    private static final long S = 1000;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private float H;
    private float I;
    private boolean J;
    private final int K;
    private final long L;
    private g M;
    private int N;
    private int O;
    private boolean P;
    private final Handler Q;
    private String t;
    private int u;
    private long v;
    private f w;
    private d x;
    private e y;
    private Rect z;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int measuredHeight = b.this.getMeasuredHeight();
            int measuredWidth = b.this.getMeasuredWidth();
            if (message.what == b.this.u) {
                b bVar = b.this;
                boolean localVisibleRect = bVar.getLocalVisibleRect(bVar.z);
                if (b.this.isShown() && localVisibleRect) {
                    int abs = Math.abs(b.this.z.right - b.this.z.left);
                    int abs2 = Math.abs(b.this.z.bottom - b.this.z.top);
                    b.b(b.this, 200L);
                    if (b.this.w != null) {
                        if (!b.this.C) {
                            b bVar2 = b.this;
                            if (bVar2.a(abs, abs2, measuredWidth, measuredHeight, bVar2.v)) {
                                b.this.w.onExposed();
                                b.this.C = true;
                            }
                        }
                        if (!b.this.B) {
                            b bVar3 = b.this;
                            if (bVar3.a(abs, abs2, measuredWidth, measuredHeight, bVar3.v)) {
                                b.this.B = true;
                                b.this.w.onOnePixelExposed();
                            }
                        }
                    }
                } else {
                    b.this.v = 0L;
                }
                if (!b.this.A || b.this.a()) {
                    return;
                }
                b.this.Q.sendEmptyMessageDelayed(b.this.u, 200L);
            }
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.common.b$b, reason: collision with other inner class name */
    public static class C0870b extends b {
        public C0870b(Context context) {
            super(context);
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.b
        boolean a(int i, int i2, int i3, int i4, long j) {
            return false;
        }
    }

    public interface c {
        void onClick();
    }

    public interface d {
        void onClickRepeatedly();
    }

    public interface e {
        void onDraw();
    }

    public interface f {
        void onExposed();

        void onOnePixelExposed();
    }

    public interface g {
        void onClick(float f, float f2, int i, int i2);

        void onSlide(float f, float f2, float f3, float f4, int i, int i2);
    }

    public static class h extends b {
        public h(Context context) {
            super(context);
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.b
        boolean a(int i, int i2, int i3, int i4, long j) {
            return i >= 50 && i2 >= 50 && ((((float) i) * 1.0f) * ((float) i2)) / ((float) (i3 * i4)) >= 0.2f;
        }
    }

    public b(Context context) {
        super(context);
        this.t = "ADMonitorView";
        this.z = new Rect();
        this.N = -1;
        this.O = -1;
        this.Q = new a(Looper.getMainLooper());
        this.u = hashCode();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.K = viewConfiguration == null ? 10 : viewConfiguration.getScaledTouchSlop();
        this.L = 300L;
        this.u = hashCode();
    }

    abstract boolean a(int i, int i2, int i3, int i4, long j);

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (this.G || (eVar = this.y) == null) {
            return;
        }
        this.G = true;
        eVar.onDraw();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar;
        n.c(this.t, "MotionEvent = " + motionEvent.getAction(), new Object[0]);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
            this.J = false;
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            long eventTime = motionEvent.getEventTime();
            if (!this.J && eventTime - motionEvent.getDownTime() <= this.L && Math.abs(x - this.H) <= this.K && Math.abs(y - this.I) <= this.K) {
                g gVar2 = this.M;
                if (gVar2 != null) {
                    gVar2.onClick(x, y, this.N, this.O);
                }
            } else if (this.J) {
                g gVar3 = this.M;
                if (gVar3 != null) {
                    gVar3.onSlide(this.H, this.I, x, y, this.N, this.O);
                }
                this.J = false;
            }
            d dVar = this.x;
            if (dVar != null) {
                dVar.onClickRepeatedly();
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX() - this.H;
            float y2 = motionEvent.getY() - this.I;
            if (!this.J && (Math.abs(x2) > this.K || Math.abs(y2) > this.K)) {
                this.J = true;
            }
        } else if (actionMasked == 3) {
            if (this.J && (gVar = this.M) != null) {
                gVar.onSlide(this.H, this.I, motionEvent.getX(), motionEvent.getY(), this.N, this.O);
            }
            this.J = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isVideo() {
        return this.E;
    }

    public boolean isVideoReady() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
        if (a()) {
            return;
        }
        this.Q.sendEmptyMessageDelayed(this.u, 200L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = false;
        this.Q.removeMessages(this.u);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n.c(this.t, "onInterceptTouchEvent = " + motionEvent.getAction(), new Object[0]);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.P) {
            return;
        }
        this.N = i;
        this.O = i2;
        this.P = true;
    }

    public void setIsVideo(boolean z) {
        this.E = z;
    }

    public void setIsVideoReady(boolean z) {
        this.D = z;
    }

    public void setOnDspClickRepeatedListener(d dVar) {
        this.x = dVar;
    }

    public void setOnDspDrawListener(e eVar) {
        this.y = eVar;
    }

    public void setOnDspGestureListener(g gVar) {
        this.M = gVar;
    }

    public void setOnExposedListener(f fVar) {
        this.w = fVar;
    }

    static /* synthetic */ long b(b bVar, long j) {
        long j2 = bVar.v + j;
        bVar.v = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return this.C && this.B;
    }
}
