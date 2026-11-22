package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p;

/* loaded from: classes9.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {
    private static final Interpolator s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private float A;
    private float B;
    private int C;
    private VelocityTracker D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final Runnable J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: a, reason: collision with root package name */
    protected int f19760a;
    protected int b;
    protected int c;
    protected int d;
    protected View e;
    protected View f;
    public boolean g;
    public boolean h;
    protected int i;
    protected int j;
    private final a k;
    private int l;
    private int m;
    private int n;
    private d o;
    private d p;

    /* renamed from: q, reason: collision with root package name */
    private p f19761q;
    private boolean r;
    private Scroller t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private float y;
    private float z;

    static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        c f19765a;
        int b;
        private final ViewFlow c;

        private a(ViewFlow viewFlow) {
            this.b = 0;
            this.c = viewFlow;
        }

        /* synthetic */ a(ViewFlow viewFlow, byte b) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = a.this.b;
                    int i3 = i;
                    if (i2 == i3) {
                        return;
                    }
                    a.this.b = i3;
                    if (a.this.f19765a != null) {
                        a.this.f19765a.a(i);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i, final int i2) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f19765a != null) {
                        a.this.f19765a.a(i, i2);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final View view, final int i) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f19765a != null) {
                        a.this.f19765a.a(view, i);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final View view, final int i, final float f) {
            this.c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f19765a != null) {
                        a.this.f19765a.a(view, i, f);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f19770a;
        public int b;
        public boolean c;
        public int d;
        public int e;

        public b() {
            this((byte) 0);
        }

        private b(byte b) {
            super(-1, -1);
            this.e = 17;
        }
    }

    public interface c {
        void a(int i);

        void a(int i, int i2);

        void a(View view, int i);

        void a(View view, int i, float f);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new a(this, (byte) 0);
        this.f19760a = 0;
        this.b = 0;
        this.l = 0;
        this.c = 3;
        this.r = true;
        this.g = false;
        this.h = false;
        this.C = -1;
        this.I = true;
        this.J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.t = new Scroller(context2, s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.x = viewConfiguration.getScaledPagingTouchSlop();
        this.E = (int) (400.0f * f);
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f);
        this.H = (int) (2.0f * f);
        this.i = (int) (f * 16.0f);
    }

    private void a(int i, int i2) {
        int scrollX;
        if (this.b == 0) {
            return;
        }
        Scroller scroller = this.t;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.u ? this.t.getCurrX() : this.t.getStartX();
            this.t.abortAnimation();
        }
        int i3 = scrollX;
        int scrollY = getScrollY();
        int i4 = i - i3;
        int i5 = 0 - scrollY;
        if (i4 == 0 && i5 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth / 2;
        float b2 = f + (b(Math.min(1.0f, (Math.abs(i4) * 1.0f) / measuredWidth)) * f);
        int abs = Math.abs(i2);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(b2 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / getChildAt(this.f19760a).getWidth()) + 1.0f) * 100.0f), 600);
        this.u = false;
        this.t.startScroll(i3, scrollY, i4, i5, min);
        sg.bigo.ads.common.e.a.a(this);
    }

    private void a(int i, boolean z, int i2) {
        int i3;
        int measuredWidth;
        if (this.b <= 0) {
            return;
        }
        int min = Math.min(Math.max(0, i), this.b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.e) {
            min++;
        }
        View childAt2 = getChildAt(min);
        int left = childAt2 != null ? f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.d, this.m) : 0;
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f != null) {
                i3 = this.n - getMeasuredWidth();
                measuredWidth = this.f.getMeasuredWidth();
            } else {
                i3 = this.n;
                measuredWidth = getMeasuredWidth();
            }
            left = (int) Math.max(0.0f, Math.min(left, i3 - measuredWidth));
        }
        if (left == getScrollX()) {
            return;
        }
        if (z) {
            a(left, i2);
        } else {
            a(false);
            scrollTo(left, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.y = motionEvent.getX(i);
            this.C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.K == 2;
        if (z2 && !this.t.isFinished()) {
            this.t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.t.getCurrX();
            int currY = this.t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z2) {
            if (z) {
                sg.bigo.ads.common.e.a.a(this, this.J);
            } else {
                this.J.run();
            }
        }
    }

    private boolean a(float f) {
        float f2 = this.y - f;
        this.y = f;
        float max = Math.max(0.0f, Math.min(getScrollX() + f2, getScrollRange()));
        sg.bigo.ads.common.t.a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + max);
        int i = (int) max;
        this.y += max - i;
        scrollTo(i, getScrollY());
        return false;
    }

    private static float b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void c(int i) {
        a(i, true, -20);
    }

    private boolean f() {
        int i = this.c;
        return i == 2 || i == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.n - getMeasuredWidth());
    }

    private void h() {
        this.h = false;
        this.v = true;
    }

    private void i() {
        this.v = false;
        this.w = false;
        this.h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public final View a(int i) {
        List<View> items = getItems();
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    @Override // sg.bigo.ads.common.view.a
    protected final void a() {
        int i;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int currentItem = getCurrentItem();
        if (!this.L) {
            if (currentItem != itemCount - 1) {
                View view = this.f;
                int i2 = this.n;
                if (view != null) {
                    i2 -= view.getMeasuredWidth();
                }
                if (getScrollX() + getMeasuredWidth() < i2) {
                    i = currentItem + 1;
                }
            }
            i = currentItem - 1;
            this.L = true;
        } else if (currentItem == 0) {
            i = currentItem + 1;
            this.L = false;
        } else {
            i = currentItem - 1;
        }
        c(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f) {
                i = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.e) {
                i++;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i) {
        this.f19760a = i;
        if (this.I) {
            requestLayout();
        } else {
            c(i);
        }
    }

    @Override // sg.bigo.ads.common.view.a
    protected final boolean b() {
        return !this.v;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.u = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.common.e.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }

    public final boolean e() {
        int i = this.n;
        View view = this.e;
        if (view != null) {
            i -= view.getRight();
        }
        View view2 = this.f;
        if (view2 != null) {
            i -= view2.getMeasuredWidth();
        }
        return getWidth() >= i;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.d;
    }

    public int getCurrentItem() {
        return this.f19760a;
    }

    public int getItemCount() {
        return this.b;
    }

    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.e && childAt != this.f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.k.f19765a;
    }

    public int getViewStyle() {
        return this.c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.J);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.v) {
                return true;
            }
            if (this.w) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.A = x;
            this.y = x;
            float y = motionEvent.getY();
            this.B = y;
            this.z = y;
            this.C = motionEvent.getPointerId(0);
            this.w = false;
            this.u = true;
            this.t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.t.getFinalX() - this.t.getCurrX()) <= this.H) {
                a(false);
                this.v = false;
            } else {
                this.t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.C;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.y;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.B);
                if (f != 0.0f) {
                    float f2 = this.y;
                    if ((f2 >= this.j || f <= 0.0f) && ((f2 <= getWidth() - this.j || f >= 0.0f) && getWidth() < this.n)) {
                        this.y = x2;
                        this.z = y2;
                        this.w = true;
                        return false;
                    }
                }
                int i2 = this.x;
                if (abs > i2 && abs * 0.5f > abs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f3 = this.A;
                    float f4 = this.x;
                    this.y = f > 0.0f ? f3 + f4 : f3 - f4;
                    this.z = y2;
                } else if (abs2 > i2) {
                    this.w = true;
                }
                if (this.v) {
                    a(x2);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        p pVar;
        int i3;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        p a2;
        p pVar2;
        b bVar;
        int i4 = 0;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.j = Math.min(measuredWidth / 10, this.i);
        int measuredWidth2 = getMeasuredWidth() - (this.d * 2);
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt == this.e || childAt == this.f || (bVar = (b) childAt.getLayoutParams()) == null || !bVar.c) {
                i5++;
            } else if (bVar.f19770a > 0 && bVar.b > 0) {
                pVar = p.a(bVar.f19770a, bVar.b, measuredWidth2, measuredHeight);
            }
        }
        pVar = null;
        if (pVar == null && (pVar2 = this.f19761q) != null) {
            pVar = p.a(pVar2.b, this.f19761q.c, measuredWidth2, measuredHeight);
        }
        this.f19760a = Math.min(Math.max(0, this.f19760a), this.b - 1);
        int i6 = 0;
        while (i6 < childCount) {
            View childAt2 = getChildAt(i6);
            if (childAt2 == this.e || childAt2 == this.f) {
                i3 = i4;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i3);
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i3);
            } else {
                b bVar2 = (b) childAt2.getLayoutParams();
                if (bVar2 != null) {
                    int i7 = bVar2.f19770a;
                    int i8 = bVar2.b;
                    if (this.c == Integer.MIN_VALUE) {
                        a2 = p.a(i7, i8, measuredHeight);
                    } else {
                        int i9 = bVar2.d;
                        if (i9 == 1 || i9 == 2) {
                            if (bVar2.d == 2 && pVar != null) {
                                a2 = pVar;
                            } else if (i7 > 0 && i8 > 0) {
                                a2 = p.a(i7, i8, measuredWidth2, measuredHeight);
                            }
                        }
                        a2 = new p(measuredWidth2, measuredHeight);
                    }
                    bVar2.width = a2.b;
                    bVar2.height = a2.c;
                    i3 = 0;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, bVar2.width), 1073741824);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, bVar2.height), 1073741824);
                } else {
                    i3 = i4;
                    i6++;
                    i4 = i3;
                }
            }
            childAt2.measure(makeMeasureSpec, makeMeasureSpec2);
            i6++;
            i4 = i3;
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onScrollChanged(i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.e) {
            i5 = 0;
            i6 = i;
        } else {
            i6 = Math.max(childAt.getRight(), i);
            i5 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f) {
            i6 = Math.min(childAt2.getLeft() - getMeasuredWidth(), i6);
            childCount--;
        }
        float measuredWidth = f() ? i6 + ((getMeasuredWidth() * 1.0f) / 2.0f) : i6 + this.d;
        View childAt3 = getChildAt(this.f19760a + i5);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.d * 2) : childAt3.getMeasuredWidth();
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i7 = i5; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            if (childAt4 != null) {
                float max = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i8 = i7 - i5;
                if (childAt4.getLeft() < measuredWidth && childAt4.getRight() > measuredWidth) {
                    this.l = i8;
                }
                this.k.a(childAt4, i8, max);
                if (max == 0.0f && this.f19760a != i8) {
                    this.f19760a = i8;
                    this.l = i8;
                    this.k.a(childAt4, i8);
                }
            }
        }
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- end -----");
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(i, getScrollRange());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0214, code lost:
    
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0239, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f || view == this.e || view == null) {
            return;
        }
        this.b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f || view == this.e || view == null) {
            return;
        }
        this.b--;
    }

    public void setContentMaxWidthSpace(int i) {
        int max = Math.max(0, i);
        if (this.d != max) {
            this.d = max;
            requestLayout();
        }
    }

    public void setDividerWidth(int i) {
        int max = Math.max(0, i);
        if (this.m != max) {
            this.m = max;
            if (this.c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.f19761q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.k.f19765a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.o = dVar;
    }

    public void setScrollEnabled(boolean z) {
        this.r = z;
    }

    void setScrollState(int i) {
        if (this.K == i) {
            return;
        }
        this.K = i;
    }

    public void setStartView(View view) {
        View view2 = this.e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }
}
