package com.bytedance.adsdk.ugeno.tw;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes13.dex */
public class gff extends ViewGroup {
    private final Runnable afz;
    private int ax;
    private boolean bx;
    private int ci;
    private bh ckl;
    private boolean deg;
    private Parcelable dgx;
    private float dx;
    private int ei;
    private List<hm> fe;
    private int fqt;
    private boolean fsb;
    private int fxn;
    private ArrayList<View> gaw;
    com.bytedance.adsdk.ugeno.tw.kg gff;
    private boolean ggo;
    private List<Object> hb;
    private int hie;
    int hm;
    private float ij;
    private float ils;
    private int iwp;
    private int je;
    private final Rect jq;
    private int jz;
    private boolean ke;
    private int kee;
    private boolean kwc;
    private hm kwn;
    private hm ln;
    private int mve;
    private ClassLoader mvp;
    private EdgeEffect np;
    private EdgeEffect pjf;
    private int ps;
    private int qhf;
    private int qn;
    private Scroller rlu;
    private Drawable rmu;
    private int rns;
    private int rz;

    /* renamed from: sg, reason: collision with root package name */
    private final ArrayList<kg> f9301sg;
    private float swx;
    private final kg tw;
    private int ud;
    private boolean uhw;
    private float ums;
    private int uws;
    private VelocityTracker wc;
    private int xdg;
    private boolean xtn;
    private float yws;
    private int zk;
    private boolean zn;
    private boolean zu;
    private rb zz;
    static final int[] kg = {R.attr.layout_gravity};
    private static final Comparator<kg> rb = new Comparator<kg>() { // from class: com.bytedance.adsdk.ugeno.tw.gff.1
        @Override // java.util.Comparator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int compare(kg kgVar, kg kgVar2) {
            return kgVar.kg - kgVar2.kg;
        }
    };
    private static final Interpolator bh = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.tw.gff.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final tw vts = new tw();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface fxn {
    }

    public interface hm {
        void dgx(int i);

        void fxn(int i, float f, int i2);

        void mvp(int i);
    }

    public interface rb {
        void fxn(View view, float f);
    }

    static class kg {
        Object fxn;
        boolean gff;
        float hm;
        int kg;
        float rb;

        kg() {
        }
    }

    public gff(Context context) {
        super(context);
        this.f9301sg = new ArrayList<>();
        this.tw = new kg();
        this.jq = new Rect();
        this.hie = -1;
        this.dgx = null;
        this.mvp = null;
        this.dx = -3.4028235E38f;
        this.ums = Float.MAX_VALUE;
        this.mve = 1;
        this.qhf = -1;
        this.xtn = true;
        this.fsb = false;
        this.afz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.tw.gff.3
            @Override // java.lang.Runnable
            public void run() {
                gff.this.setScrollState(0);
                gff.this.gff();
            }
        };
        this.rns = 0;
        fxn();
    }

    void fxn() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.rlu = new Scroller(context, bh);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.rz = viewConfiguration.getScaledPagingTouchSlop();
        this.zk = (int) (400.0f * f);
        this.ei = viewConfiguration.getScaledMaximumFlingVelocity();
        this.np = new EdgeEffect(context);
        this.pjf = new EdgeEffect(context);
        this.kee = (int) (25.0f * f);
        this.ps = (int) (2.0f * f);
        this.ax = (int) (f * 16.0f);
    }

    public void setScroller(Scroller scroller) {
        this.rlu = scroller;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.afz);
        Scroller scroller = this.rlu;
        if (scroller != null && !scroller.isFinished()) {
            this.rlu.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.rns == i) {
            return;
        }
        this.rns = i;
        if (this.zz != null) {
            kg(i != 0);
        }
        bh(i);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.tw.kg kgVar) {
        com.bytedance.adsdk.ugeno.tw.kg kgVar2 = this.gff;
        if (kgVar2 != null) {
            kgVar2.fxn((DataSetObserver) null);
            for (int i = 0; i < this.f9301sg.size(); i++) {
                kg kgVar3 = this.f9301sg.get(i);
                this.gff.fxn((ViewGroup) this, kgVar3.kg, kgVar3.fxn);
            }
            this.f9301sg.clear();
            bh();
            this.hm = 0;
            scrollTo(0, 0);
        }
        this.gff = kgVar;
        this.fxn = 0;
        if (kgVar != null) {
            if (this.ckl == null) {
                this.ckl = new bh();
            }
            this.gff.fxn((DataSetObserver) this.ckl);
            this.ke = false;
            boolean z = this.xtn;
            this.xtn = true;
            this.fxn = this.gff.fxn();
            int i2 = this.hie;
            if (i2 >= 0) {
                fxn(i2, false, true);
                this.hie = -1;
                this.dgx = null;
                this.mvp = null;
            } else if (!z) {
                gff();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.hb;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.hb.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.hb.get(i3);
        }
    }

    private void bh() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0464gff) getChildAt(i).getLayoutParams()).fxn) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public com.bytedance.adsdk.ugeno.tw.kg getAdapter() {
        return this.gff;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.ke = false;
        fxn(i, !this.xtn, false);
    }

    public void fxn(int i, boolean z) {
        this.ke = false;
        fxn(i, z, false);
    }

    public int getCurrentItem() {
        return this.hm;
    }

    void fxn(int i, boolean z, boolean z2) {
        fxn(i, z, z2, 0);
    }

    void fxn(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.tw.kg kgVar = this.gff;
        if (kgVar == null || kgVar.fxn() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.hm == i && this.f9301sg.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.gff.fxn()) {
            i = this.gff.fxn() - 1;
        }
        int i3 = this.mve;
        int i4 = this.hm;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f9301sg.size(); i5++) {
                this.f9301sg.get(i5).gff = true;
            }
        }
        boolean z3 = this.hm != i;
        if (this.xtn) {
            this.hm = i;
            if (z3) {
                rb(i);
            }
            requestLayout();
            return;
        }
        fxn(i);
        fxn(i, z, i2, z3);
    }

    private void fxn(int i, boolean z, int i2, boolean z2) {
        kg kg2 = kg(i);
        int clientWidth = kg2 != null ? (int) (getClientWidth() * Math.max(this.dx, Math.min(kg2.rb, this.ums))) : 0;
        if (z) {
            fxn(clientWidth, 0, i2);
            if (z2) {
                rb(i);
                return;
            }
            return;
        }
        if (z2) {
            rb(i);
        }
        fxn(false);
        scrollTo(clientWidth, 0);
        hm(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(hm hmVar) {
        this.ln = hmVar;
    }

    public void fxn(hm hmVar) {
        if (this.fe == null) {
            this.fe = new ArrayList();
        }
        this.fe.add(hmVar);
    }

    public void kg(hm hmVar) {
        List<hm> list = this.fe;
        if (list != null) {
            list.remove(hmVar);
        }
    }

    public void fxn(boolean z, rb rbVar) {
        fxn(z, rbVar, 2);
    }

    public void fxn(boolean z, rb rbVar, int i) {
        boolean z2 = rbVar != null;
        boolean z3 = z2 != (this.zz != null);
        this.zz = rbVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.qn = z ? 2 : 1;
            this.uws = i;
        } else {
            this.qn = 0;
        }
        if (z3) {
            gff();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.qn == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0464gff) this.gaw.get(i2).getLayoutParams()).bh;
    }

    public int getOffscreenPageLimit() {
        return this.mve;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mve) {
            this.mve = i;
            gff();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.xdg;
        this.xdg = i;
        int width = getWidth();
        fxn(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.xdg;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.rmu = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.rmu;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.rmu;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    float fxn(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    void fxn(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.rlu;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.zu ? this.rlu.getCurrX() : this.rlu.getStartX();
            this.rlu.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            fxn(false);
            gff();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fxn2 = f2 + (fxn(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(fxn2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i5) / ((f * this.gff.fxn(this.hm)) + this.xdg)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.zu = false;
        this.rlu.startScroll(i4, scrollY, i5, i6, min);
        postInvalidateOnAnimation();
    }

    kg fxn(int i, int i2) {
        kg kgVar = new kg();
        kgVar.kg = i;
        kgVar.fxn = this.gff.fxn((ViewGroup) this, i);
        kgVar.hm = this.gff.fxn(i);
        if (i2 < 0 || i2 >= this.f9301sg.size()) {
            this.f9301sg.add(kgVar);
            return kgVar;
        }
        this.f9301sg.add(i2, kgVar);
        return kgVar;
    }

    void kg() {
        int fxn2 = this.gff.fxn();
        this.fxn = fxn2;
        boolean z = this.f9301sg.size() < (this.mve * 2) + 1 && this.f9301sg.size() < fxn2;
        int i = this.hm;
        int i2 = 0;
        while (i2 < this.f9301sg.size()) {
            kg kgVar = this.f9301sg.get(i2);
            int fxn3 = this.gff.fxn(kgVar.fxn);
            if (fxn3 != -1) {
                if (fxn3 == -2) {
                    this.f9301sg.remove(i2);
                    i2--;
                    this.gff.fxn((ViewGroup) this, kgVar.kg, kgVar.fxn);
                    if (this.hm == kgVar.kg) {
                        i = Math.max(0, Math.min(this.hm, fxn2 - 1));
                    }
                } else if (kgVar.kg != fxn3) {
                    if (kgVar.kg == this.hm) {
                        i = fxn3;
                    }
                    kgVar.kg = fxn3;
                }
                z = true;
            }
            i2++;
        }
        Collections.sort(this.f9301sg, rb);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C0464gff c0464gff = (C0464gff) getChildAt(i3).getLayoutParams();
                if (!c0464gff.fxn) {
                    c0464gff.gff = 0.0f;
                }
            }
            fxn(i, false, true);
            requestLayout();
        }
    }

    void gff() {
        fxn(this.hm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r8.kg == r17.hm) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void fxn(int r18) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.tw.gff.fxn(int):void");
    }

    private void sg() {
        if (this.qn != 0) {
            ArrayList<View> arrayList = this.gaw;
            if (arrayList == null) {
                this.gaw = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.gaw.add(getChildAt(i));
            }
            Collections.sort(this.gaw, vts);
        }
    }

    private void fxn(kg kgVar, int i, kg kgVar2) {
        kg kgVar3;
        kg kgVar4;
        int fxn2 = this.gff.fxn();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.xdg / clientWidth : 0.0f;
        if (kgVar2 != null) {
            int i2 = kgVar2.kg;
            if (i2 < kgVar.kg) {
                float f2 = kgVar2.rb + kgVar2.hm + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= kgVar.kg && i4 < this.f9301sg.size()) {
                    kg kgVar5 = this.f9301sg.get(i4);
                    while (true) {
                        kgVar4 = kgVar5;
                        if (i3 <= kgVar4.kg || i4 >= this.f9301sg.size() - 1) {
                            break;
                        }
                        i4++;
                        kgVar5 = this.f9301sg.get(i4);
                    }
                    while (i3 < kgVar4.kg) {
                        f2 += this.gff.fxn(i3) + f;
                        i3++;
                    }
                    kgVar4.rb = f2;
                    f2 += kgVar4.hm + f;
                    i3++;
                }
            } else if (i2 > kgVar.kg) {
                int size = this.f9301sg.size() - 1;
                float f3 = kgVar2.rb;
                while (true) {
                    i2--;
                    if (i2 < kgVar.kg || size < 0) {
                        break;
                    }
                    kg kgVar6 = this.f9301sg.get(size);
                    while (true) {
                        kgVar3 = kgVar6;
                        if (i2 >= kgVar3.kg || size <= 0) {
                            break;
                        }
                        size--;
                        kgVar6 = this.f9301sg.get(size);
                    }
                    while (i2 > kgVar3.kg) {
                        f3 -= this.gff.fxn(i2) + f;
                        i2--;
                    }
                    f3 -= kgVar3.hm + f;
                    kgVar3.rb = f3;
                }
            }
        }
        int size2 = this.f9301sg.size();
        float f4 = kgVar.rb;
        int i5 = kgVar.kg - 1;
        this.dx = kgVar.kg == 0 ? kgVar.rb : -3.4028235E38f;
        int i6 = fxn2 - 1;
        this.ums = kgVar.kg == i6 ? (kgVar.rb + kgVar.hm) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            kg kgVar7 = this.f9301sg.get(i7);
            while (i5 > kgVar7.kg) {
                f4 -= this.gff.fxn(i5) + f;
                i5--;
            }
            f4 -= kgVar7.hm + f;
            kgVar7.rb = f4;
            if (kgVar7.kg == 0) {
                this.dx = f4;
            }
            i7--;
            i5--;
        }
        float f5 = kgVar.rb + kgVar.hm + f;
        int i8 = kgVar.kg + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            kg kgVar8 = this.f9301sg.get(i9);
            while (i8 < kgVar8.kg) {
                f5 += this.gff.fxn(i8) + f;
                i8++;
            }
            if (kgVar8.kg == i6) {
                this.ums = (kgVar8.hm + f5) - 1.0f;
            }
            kgVar8.rb = f5;
            f5 += kgVar8.hm + f;
            i9++;
            i8++;
        }
        this.fsb = false;
    }

    public static class sg extends com.bytedance.adsdk.ugeno.tw.fxn {
        public static final Parcelable.Creator<sg> CREATOR = new Parcelable.ClassLoaderCreator<sg>() { // from class: com.bytedance.adsdk.ugeno.tw.gff.sg.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public sg createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new sg(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public sg createFromParcel(Parcel parcel) {
                return new sg(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public sg[] newArray(int i) {
                return new sg[i];
            }
        };
        Parcelable gff;
        ClassLoader hm;
        int kg;

        public sg(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // com.bytedance.adsdk.ugeno.tw.fxn, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.kg);
            parcel.writeParcelable(this.gff, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.kg + "}";
        }

        sg(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.kg = parcel.readInt();
            this.gff = parcel.readParcelable(classLoader);
            this.hm = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        sg sgVar = new sg(super.onSaveInstanceState());
        sgVar.kg = this.hm;
        com.bytedance.adsdk.ugeno.tw.kg kgVar = this.gff;
        if (kgVar != null) {
            sgVar.gff = kgVar.kg();
        }
        return sgVar;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sg sgVar = (sg) parcelable;
        super.onRestoreInstanceState(sgVar.fxn());
        if (this.gff != null) {
            fxn(sgVar.kg, false, true);
            return;
        }
        this.hie = sgVar.kg;
        this.dgx = sgVar.gff;
        this.mvp = sgVar.hm;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0464gff c0464gff = (C0464gff) layoutParams;
        c0464gff.fxn |= gff(view);
        if (this.bx) {
            if (c0464gff != null && c0464gff.fxn) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0464gff.hm = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private static boolean gff(View view) {
        return view.getClass().getAnnotation(fxn.class) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.bx) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    kg fxn(View view) {
        for (int i = 0; i < this.f9301sg.size(); i++) {
            kg kgVar = this.f9301sg.get(i);
            if (this.gff.fxn(view, kgVar.fxn)) {
                return kgVar;
            }
        }
        return null;
    }

    kg kg(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return fxn(view);
            }
        }
    }

    kg kg(int i) {
        for (int i2 = 0; i2 < this.f9301sg.size(); i2++) {
            kg kgVar = this.f9301sg.get(i2);
            if (kgVar.kg == i) {
                return kgVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xtn = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C0464gff c0464gff;
        C0464gff c0464gff2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.ci = Math.min(measuredWidth / 10, this.ax);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0464gff2 = (C0464gff) childAt.getLayoutParams()) != null && c0464gff2.fxn) {
                int i8 = c0464gff2.kg & 7;
                int i9 = c0464gff2.kg & 112;
                boolean z3 = (i9 == 48 || i9 == 80) ? true : z;
                if (i8 != 3 && i8 != 5) {
                    z2 = z;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (c0464gff2.width != -2) {
                    i4 = c0464gff2.width != -1 ? c0464gff2.width : paddingLeft;
                    i10 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (c0464gff2.height != -2) {
                    i5 = c0464gff2.height != -1 ? c0464gff2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i10), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        this.iwp = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.jz = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.bx = true;
        gff();
        this.bx = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((c0464gff = (C0464gff) childAt2.getLayoutParams()) == null || !c0464gff.fxn)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0464gff.gff), 1073741824), this.jz);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.xdg;
            fxn(i, i3, i5, i5);
        }
    }

    private void fxn(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f9301sg.isEmpty()) {
            if (!this.rlu.isFinished()) {
                this.rlu.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        kg kg2 = kg(this.hm);
        int min = (int) ((kg2 != null ? Math.min(kg2.rb, this.ums) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            fxn(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.tw.gff.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        this.zu = true;
        if (!this.rlu.isFinished() && this.rlu.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.rlu.getCurrX();
            int currY = this.rlu.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!hm(currX)) {
                    this.rlu.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        fxn(true);
    }

    private boolean hm(int i) {
        if (this.f9301sg.size() == 0) {
            if (this.xtn) {
                return false;
            }
            this.kwc = false;
            fxn(0, 0.0f, 0);
            if (this.kwc) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        kg jq = jq();
        int clientWidth = getClientWidth();
        int i2 = this.xdg;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = jq.kg;
        float f2 = ((i / f) - jq.rb) / (jq.hm + (i2 / f));
        this.kwc = false;
        fxn(i4, f2, (int) (i3 * f2));
        if (this.kwc) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void fxn(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.fqt
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.tw.gff$gff r9 = (com.bytedance.adsdk.ugeno.tw.gff.C0464gff) r9
            boolean r10 = r9.fxn
            if (r10 == 0) goto L67
            int r9 = r9.kg
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            r12.kg(r13, r14, r15)
            com.bytedance.adsdk.ugeno.tw.gff$rb r13 = r12.zz
            if (r13 == 0) goto L9d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L79:
            if (r1 >= r14) goto L9d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.tw.gff$gff r0 = (com.bytedance.adsdk.ugeno.tw.gff.C0464gff) r0
            boolean r0 = r0.fxn
            if (r0 != 0) goto L9a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.tw.gff$rb r3 = r12.zz
            r3.fxn(r15, r0)
        L9a:
            int r1 = r1 + 1
            goto L79
        L9d:
            r12.kwc = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.tw.gff.fxn(int, float, int):void");
    }

    private void kg(int i, float f, int i2) {
        hm hmVar = this.ln;
        if (hmVar != null) {
            hmVar.fxn(i, f, i2);
        }
        List<hm> list = this.fe;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                hm hmVar2 = this.fe.get(i3);
                if (hmVar2 != null) {
                    hmVar2.fxn(i, f, i2);
                }
            }
        }
        hm hmVar3 = this.kwn;
        if (hmVar3 != null) {
            hmVar3.fxn(i, f, i2);
        }
    }

    private void rb(int i) {
        hm hmVar = this.ln;
        if (hmVar != null) {
            hmVar.dgx(i);
        }
        List<hm> list = this.fe;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                hm hmVar2 = this.fe.get(i2);
                if (hmVar2 != null) {
                    hmVar2.dgx(i);
                }
            }
        }
        hm hmVar3 = this.kwn;
        if (hmVar3 != null) {
            hmVar3.dgx(i);
        }
    }

    private void bh(int i) {
        hm hmVar = this.ln;
        if (hmVar != null) {
            hmVar.mvp(i);
        }
        List<hm> list = this.fe;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                hm hmVar2 = this.fe.get(i2);
                if (hmVar2 != null) {
                    hmVar2.mvp(i);
                }
            }
        }
        hm hmVar3 = this.kwn;
        if (hmVar3 != null) {
            hmVar3.mvp(i);
        }
    }

    private void fxn(boolean z) {
        boolean z2 = this.rns == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.rlu.isFinished()) {
                this.rlu.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.rlu.getCurrX();
                int currY = this.rlu.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        hm(currX);
                    }
                }
            }
        }
        this.ke = false;
        for (int i = 0; i < this.f9301sg.size(); i++) {
            kg kgVar = this.f9301sg.get(i);
            if (kgVar.gff) {
                kgVar.gff = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.afz);
            } else {
                this.afz.run();
            }
        }
    }

    private boolean fxn(float f, float f2) {
        if (f >= this.ci || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.ci)) && f2 < 0.0f;
        }
        return true;
    }

    private void kg(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.uws : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            tw();
            return false;
        }
        if (action != 0) {
            if (this.zn) {
                return true;
            }
            if (this.ggo) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.yws = x;
            this.ils = x;
            float y = motionEvent.getY();
            this.swx = y;
            this.ij = y;
            this.qhf = motionEvent.getPointerId(0);
            this.ggo = false;
            this.zu = true;
            this.rlu.computeScrollOffset();
            if (this.rns == 2 && Math.abs(this.rlu.getFinalX() - this.rlu.getCurrX()) > this.ps) {
                this.rlu.abortAnimation();
                this.ke = false;
                gff();
                this.zn = true;
                gff(true);
                setScrollState(1);
            } else {
                fxn(false);
                this.zn = false;
            }
        } else if (action == 2) {
            int i = this.qhf;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.ils;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.swx);
                if (f != 0.0f && !fxn(this.ils, f) && fxn(this, false, (int) f, (int) x2, (int) y2)) {
                    this.ils = x2;
                    this.ij = y2;
                    this.ggo = true;
                    return false;
                }
                int i2 = this.rz;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.zn = true;
                    gff(true);
                    setScrollState(1);
                    this.ils = f > 0.0f ? this.yws + this.rz : this.yws - this.rz;
                    this.ij = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.ggo = true;
                }
                if (this.zn && kg(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            fxn(motionEvent);
        }
        if (this.wc == null) {
            this.wc = VelocityTracker.obtain();
        }
        this.wc.addMovement(motionEvent);
        return this.zn;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.tw.kg kgVar;
        int findPointerIndex;
        if (this.deg) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (kgVar = this.gff) == null || kgVar.fxn() == 0) {
            return false;
        }
        if (this.wc == null) {
            this.wc = VelocityTracker.obtain();
        }
        this.wc.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.rlu.abortAnimation();
            this.ke = false;
            gff();
            float x = motionEvent.getX();
            this.yws = x;
            this.ils = x;
            float y = motionEvent.getY();
            this.swx = y;
            this.ij = y;
            this.qhf = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.zn) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.qhf);
                    if (findPointerIndex2 == -1) {
                        z = tw();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex2);
                        float abs = Math.abs(x2 - this.ils);
                        float y2 = motionEvent.getY(findPointerIndex2);
                        float abs2 = Math.abs(y2 - this.ij);
                        if (abs > this.rz && abs > abs2) {
                            this.zn = true;
                            gff(true);
                            float f = this.yws;
                            this.ils = x2 - f > 0.0f ? f + this.rz : f - this.rz;
                            this.ij = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.zn && (findPointerIndex = motionEvent.findPointerIndex(this.qhf)) != -1) {
                    z = kg(motionEvent.getX(findPointerIndex));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex != -1) {
                        this.ils = motionEvent.getX(actionIndex);
                        this.qhf = motionEvent.getPointerId(actionIndex);
                    }
                } else if (action == 6) {
                    fxn(motionEvent);
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.qhf);
                    if (findPointerIndex3 != -1) {
                        this.ils = motionEvent.getX(findPointerIndex3);
                    }
                }
            } else if (this.zn) {
                fxn(this.hm, true, 0, false);
                z = tw();
            }
        } else if (this.zn) {
            VelocityTracker velocityTracker = this.wc;
            velocityTracker.computeCurrentVelocity(1000, this.ei);
            int xVelocity = (int) velocityTracker.getXVelocity(this.qhf);
            this.ke = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            kg jq = jq();
            float f2 = clientWidth;
            int i = jq.kg;
            float f3 = ((scrollX / f2) - jq.rb) / (jq.hm + (this.xdg / f2));
            int findPointerIndex4 = motionEvent.findPointerIndex(this.qhf);
            if (findPointerIndex4 != -1) {
                fxn(fxn(i, f3, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.yws)), true, true, xVelocity);
                z = tw();
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    private boolean tw() {
        this.qhf = -1;
        hie();
        this.np.onRelease();
        this.pjf.onRelease();
        return this.np.isFinished() || this.pjf.isFinished();
    }

    private void gff(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean kg(float f) {
        boolean z;
        boolean z2;
        float f2 = this.ils - f;
        this.ils = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.dx * clientWidth;
        float f4 = this.ums * clientWidth;
        boolean z3 = false;
        kg kgVar = this.f9301sg.get(0);
        ArrayList<kg> arrayList = this.f9301sg;
        kg kgVar2 = arrayList.get(arrayList.size() - 1);
        if (kgVar.kg != 0) {
            f3 = kgVar.rb * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (kgVar2.kg != this.gff.fxn() - 1) {
            f4 = kgVar2.rb * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.np.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.pjf.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.ils += scrollX - i;
        scrollTo(i, getScrollY());
        hm(i);
        return z3;
    }

    private kg jq() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.xdg / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        kg kgVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.f9301sg.size()) {
            kg kgVar2 = this.f9301sg.get(i2);
            if (!z && kgVar2.kg != (i = i3 + 1)) {
                kgVar2 = this.tw;
                kgVar2.rb = f + f3 + f2;
                kgVar2.kg = i;
                kgVar2.hm = this.gff.fxn(kgVar2.kg);
                i2--;
            }
            kg kgVar3 = kgVar2;
            f = kgVar3.rb;
            float f4 = kgVar3.hm + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.f9301sg.size() - 1) {
                return kgVar3;
            }
            int i4 = kgVar3.kg;
            float f5 = kgVar3.hm;
            i2++;
            i3 = i4;
            f3 = f5;
            kgVar = kgVar3;
            z = false;
        }
        return kgVar;
    }

    private int fxn(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.kee || Math.abs(i2) <= this.zk) {
            i += (int) (f + (i >= this.hm ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f9301sg.size() <= 0) {
            return i;
        }
        return Math.max(this.f9301sg.get(0).kg, Math.min(i, this.f9301sg.get(r4.size() - 1).kg));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.tw.kg kgVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (kgVar = this.gff) != null && kgVar.fxn() > 1)) {
            if (!this.np.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.dx * width);
                this.np.setSize(height, width);
                z = this.np.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.pjf.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.ums + 1.0f)) * width2);
                this.pjf.setSize(height2, width2);
                z |= this.pjf.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.np.finish();
            this.pjf.finish();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        super.onDraw(canvas);
        if (this.xdg <= 0 || this.rmu == null || this.f9301sg.size() <= 0 || this.gff == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.xdg / width;
        int i2 = 0;
        kg kgVar = this.f9301sg.get(0);
        float f4 = kgVar.rb;
        int size = this.f9301sg.size();
        int i3 = kgVar.kg;
        int i4 = this.f9301sg.get(size - 1).kg;
        while (i3 < i4) {
            while (i3 > kgVar.kg && i2 < size) {
                i2++;
                kgVar = this.f9301sg.get(i2);
            }
            if (i3 == kgVar.kg) {
                f2 = (kgVar.rb + kgVar.hm) * width;
                f = kgVar.rb + kgVar.hm + f3;
            } else {
                float fxn2 = this.gff.fxn(i3);
                float f5 = (f4 + fxn2) * width;
                f = f4 + fxn2 + f3;
                f2 = f5;
            }
            if (this.xdg + f2 > scrollX) {
                i = scrollX;
                this.rmu.setBounds(Math.round(f2), this.je, Math.round(this.xdg + f2), this.ud);
                this.rmu.draw(canvas);
            } else {
                i = scrollX;
            }
            if (f2 > i + r2) {
                return;
            }
            i3++;
            f4 = f;
            scrollX = i;
        }
    }

    private void fxn(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.qhf) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ils = motionEvent.getX(i);
            this.qhf = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.wc;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void hie() {
        this.zn = false;
        this.ggo = false;
        VelocityTracker velocityTracker = this.wc;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.wc = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.uhw != z) {
            this.uhw = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.gff == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.dx)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.ums));
    }

    protected boolean fxn(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && fxn(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || fxn(keyEvent);
    }

    public boolean fxn(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return hm();
            }
            return gff(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return rb();
            }
            return gff(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return gff(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return gff(1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r6 != 2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gff(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L62
        L9:
            if (r0 == 0) goto L62
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L62
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L49
            java.lang.String r3 = " => "
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L49:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L62:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lad
            if (r1 == r0) goto Lad
            if (r6 != r3) goto L92
            android.graphics.Rect r2 = r5.jq
            android.graphics.Rect r2 = r5.fxn(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.jq
            android.graphics.Rect r3 = r5.fxn(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8d
            if (r2 < r3) goto L8d
            boolean r0 = r5.hm()
            goto Lc4
        L8d:
            boolean r0 = r1.requestFocus()
            goto Lc4
        L92:
            if (r6 != r2) goto Lb9
            android.graphics.Rect r2 = r5.jq
            android.graphics.Rect r2 = r5.fxn(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.jq
            android.graphics.Rect r3 = r5.fxn(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La8
            if (r2 <= r3) goto Lbb
        La8:
            boolean r0 = r1.requestFocus()
            goto Lc4
        Lad:
            if (r6 == r3) goto Lc0
            r0 = 1
            if (r6 != r0) goto Lb3
            goto Lc0
        Lb3:
            if (r6 == r2) goto Lbb
            r0 = 2
            if (r6 != r0) goto Lb9
            goto Lbb
        Lb9:
            r0 = 0
            goto Lc4
        Lbb:
            boolean r0 = r5.rb()
            goto Lc4
        Lc0:
            boolean r0 = r5.hm()
        Lc4:
            if (r0 == 0) goto Lcd
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.tw.gff.gff(int):boolean");
    }

    private Rect fxn(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean hm() {
        int i = this.hm;
        if (i <= 0) {
            return false;
        }
        fxn(i - 1, true);
        return true;
    }

    boolean rb() {
        com.bytedance.adsdk.ugeno.tw.kg kgVar = this.gff;
        if (kgVar == null || this.hm >= kgVar.fxn() - 1) {
            return false;
        }
        fxn(this.hm + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        kg fxn2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (fxn2 = fxn(childAt)) != null && fxn2.kg == this.hm) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        kg fxn2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (fxn2 = fxn(childAt)) != null && fxn2.kg == this.hm) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        kg fxn2;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fxn2 = fxn(childAt)) != null && fxn2.kg == this.hm && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        kg fxn2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (fxn2 = fxn(childAt)) != null && fxn2.kg == this.hm && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0464gff();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0464gff) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0464gff(getContext(), attributeSet);
    }

    private class bh extends DataSetObserver {
        bh() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            gff.this.kg();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            gff.this.kg();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.tw.gff$gff, reason: collision with other inner class name */
    public static class C0464gff extends ViewGroup.LayoutParams {
        int bh;
        public boolean fxn;
        float gff;
        boolean hm;
        public int kg;
        int rb;

        public C0464gff() {
            super(-1, -1);
            this.gff = 0.0f;
        }

        public C0464gff(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gff = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gff.kg);
            this.kg = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    static class tw implements Comparator<View> {
        tw() {
        }

        @Override // java.util.Comparator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0464gff c0464gff = (C0464gff) view.getLayoutParams();
            C0464gff c0464gff2 = (C0464gff) view2.getLayoutParams();
            if (c0464gff.fxn != c0464gff2.fxn) {
                return c0464gff.fxn ? 1 : -1;
            }
            return c0464gff.rb - c0464gff2.rb;
        }
    }
}
