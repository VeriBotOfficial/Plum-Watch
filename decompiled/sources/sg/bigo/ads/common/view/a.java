package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes9.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f19772a;
    private boolean b;
    private AbstractRunnableC1088a c;

    /* renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    static abstract class AbstractRunnableC1088a implements Runnable {
        boolean b;

        private AbstractRunnableC1088a() {
        }

        /* synthetic */ AbstractRunnableC1088a(byte b) {
            this();
        }

        protected abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.b) {
                return;
            }
            a();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19772a = 3000;
        this.b = false;
    }

    private synchronized void a(boolean z) {
        AbstractRunnableC1088a abstractRunnableC1088a = this.c;
        if (abstractRunnableC1088a != null) {
            abstractRunnableC1088a.b = true;
            this.c = null;
        }
        if (z) {
            AbstractRunnableC1088a abstractRunnableC1088a2 = new AbstractRunnableC1088a() { // from class: sg.bigo.ads.common.view.a.1
                @Override // sg.bigo.ads.common.view.a.AbstractRunnableC1088a
                protected final void a() {
                    if (a.this.b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                        a.this.a();
                    }
                    a.this.postDelayed(this, r0.f19772a);
                }
            };
            this.c = abstractRunnableC1088a2;
            postDelayed(abstractRunnableC1088a2, this.f19772a);
        }
    }

    protected abstract void a();

    protected abstract boolean b();

    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        a(true);
    }

    public final void d() {
        this.b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f19772a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(int i) {
        this.f19772a = i;
    }
}
