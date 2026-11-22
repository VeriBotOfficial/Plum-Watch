package com.baidu.platform.comapi.bikenavi.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.baidu.bikenavi.R;
import com.baidu.platform.comapi.wnplatform.p.h;
import java.lang.reflect.Field;

/* loaded from: classes13.dex */
public class CustomScrollView extends ScrollView {
    public static final Object TAG = new Object();

    /* renamed from: a, reason: collision with root package name */
    private VelocityTracker f8522a;
    private int b;
    public int bottom;
    private int c;
    private c d;
    private c e;
    private GestureDetector f;
    private GestureDetector g;
    private int h;
    private int i;
    private LinearLayout j;
    private View k;
    private LinearLayout l;
    private boolean m;
    private com.baidu.platform.comapi.wnplatform.o.c n;
    protected Field scrollerField;

    /* renamed from: top, reason: collision with root package name */
    public int f8523top;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8524a;

        static {
            int[] iArr = new int[com.baidu.platform.comapi.wnplatform.o.c.values().length];
            f8524a = iArr;
            try {
                iArr[com.baidu.platform.comapi.wnplatform.o.c.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8524a[com.baidu.platform.comapi.wnplatform.o.c.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return f2 > 0.0f;
        }
    }

    public interface c {
        void a(int i);

        void a(com.baidu.platform.comapi.wnplatform.o.c cVar, com.baidu.platform.comapi.wnplatform.o.c cVar2);
    }

    class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f2) > Math.abs(f);
        }
    }

    public CustomScrollView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        setTag(TAG);
        this.f = new GestureDetector(context, new d());
        this.g = new GestureDetector(context, new b());
        setFadingEdgeLength(0);
        setVerticalScrollBarEnabled(false);
        this.f8523top = h.b(context) - h.d(context);
        this.bottom = 0;
        this.c = 3;
        com.baidu.platform.comapi.wnplatform.p.p.a.a((Activity) getContext(), R.layout.wsdk_layout_custom_scroll_view, this);
        this.j = (LinearLayout) findViewById(R.id.ll_blank);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_content);
        this.l = linearLayout;
        linearLayout.setMinimumHeight(this.f8523top);
    }

    public static Field getDeclaredField(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void addContentView(View view) {
        this.l.addView(view);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected int computeVerticalScrollRange() {
        int computeVerticalScrollRange = super.computeVerticalScrollRange();
        this.h = computeVerticalScrollRange;
        return computeVerticalScrollRange;
    }

    public com.baidu.platform.comapi.wnplatform.o.c getStatus() {
        return this.n;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent) && this.f.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.i = i4 - i2;
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        c cVar = this.d;
        if (cVar != null) {
            cVar.a(i2);
        }
        c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.a(i2);
        }
        boolean z = this.h - this.i == i2;
        if (i2 == 0 || z) {
            try {
                if (this.scrollerField == null) {
                    this.scrollerField = getDeclaredField(this, "mScroller");
                }
                Object obj = this.scrollerField.get(this);
                if (obj != null && (obj instanceof Scroller)) {
                    ((Scroller) obj).abortAnimation();
                }
                return;
            } catch (Exception unused) {
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewConfiguration.get(getContext());
        this.b = ViewConfiguration.getMaximumFlingVelocity();
        View view = this.k;
        if ((view == null ? false : a(motionEvent, view)) && this.n == com.baidu.platform.comapi.wnplatform.o.c.BOTTOM) {
            return false;
        }
        a(motionEvent);
        if (motionEvent.getAction() == 1) {
            VelocityTracker velocityTracker = this.f8522a;
            velocityTracker.computeCurrentVelocity(1000, this.b);
            com.baidu.platform.comapi.wnplatform.o.c a2 = a((int) velocityTracker.getYVelocity(), getScrollY());
            if (a2 != com.baidu.platform.comapi.wnplatform.o.c.NULL) {
                updateStatus(a2, true);
                return true;
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void removeContentView(View view) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.removeView(view);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 == null || !((view2 instanceof WebView) || (view2 instanceof ListView) || (view2 instanceof ScrollView))) {
            super.requestChildFocus(view, view2);
        }
    }

    public void setBlankHeight(int i) {
        this.j.removeAllViews();
        this.k = new View(getContext());
        this.k.setLayoutParams(new AbsListView.LayoutParams(0, i));
        this.j.addView(this.k);
    }

    public void setCustomOnScrollChangeListener(c cVar) {
        this.e = cVar;
    }

    public void setOnScrollChangeListener(c cVar) {
        this.d = cVar;
    }

    public void setStatusHeight(int i, int i2) {
        this.l.setMinimumHeight(i);
        this.f8523top = i;
        this.bottom = i2;
        this.c = 3;
    }

    public void updateStatus(com.baidu.platform.comapi.wnplatform.o.c cVar, boolean z) {
        c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.a(this.n, cVar);
        }
        c cVar3 = this.e;
        if (cVar3 != null) {
            cVar3.a(this.n, cVar);
        }
        this.n = cVar;
        int i = a.f8524a[cVar.ordinal()];
        if (i == 1) {
            if (z) {
                smoothScrollTo(0, this.bottom);
                return;
            } else {
                scrollTo(0, this.bottom);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        if (z) {
            smoothScrollTo(0, this.f8523top);
        } else {
            scrollTo(0, this.f8523top);
        }
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.i = 0;
        this.m = false;
        this.n = com.baidu.platform.comapi.wnplatform.o.c.BOTTOM;
        a(context);
    }

    private com.baidu.platform.comapi.wnplatform.o.c a(int i, int i2) {
        int i3 = a.f8524a[this.n.ordinal()];
        if (i3 == 1) {
            if ((i < 0 && Math.abs(i) > 1000) || i2 > this.c) {
                return com.baidu.platform.comapi.wnplatform.o.c.TOP;
            }
            return com.baidu.platform.comapi.wnplatform.o.c.BOTTOM;
        }
        if (i3 != 2) {
            return com.baidu.platform.comapi.wnplatform.o.c.BOTTOM;
        }
        if (i <= 1000 && i2 >= this.c) {
            if (i2 > this.f8523top) {
                return com.baidu.platform.comapi.wnplatform.o.c.NULL;
            }
            return com.baidu.platform.comapi.wnplatform.o.c.TOP;
        }
        return com.baidu.platform.comapi.wnplatform.o.c.BOTTOM;
    }

    public CustomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
        this.i = 0;
        this.m = false;
        this.n = com.baidu.platform.comapi.wnplatform.o.c.BOTTOM;
        a(context);
    }

    private void a(MotionEvent motionEvent) {
        if (this.f8522a == null) {
            this.f8522a = VelocityTracker.obtain();
        }
        this.f8522a.addMovement(motionEvent);
    }

    private boolean a(MotionEvent motionEvent, View view) {
        boolean a2 = a(motionEvent.getY(), view);
        if (motionEvent.getAction() == 0) {
            if (a2) {
                this.m = true;
            } else {
                this.m = false;
            }
        }
        if (motionEvent.getAction() == 1) {
            this.m = false;
        }
        return this.m && a2 && motionEvent.getAction() != 1;
    }

    private boolean a(float f, View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        return f > ((float) rect.top) && f < ((float) (rect.bottom - getScrollY()));
    }

    private void a() {
        try {
            if (this.scrollerField == null) {
                this.scrollerField = getDeclaredField(this, "mScroller");
            }
            Object obj = this.scrollerField.get(this);
            if (obj == null) {
                return;
            }
            obj.getClass().getMethod("abortAnimation", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
        }
    }
}
