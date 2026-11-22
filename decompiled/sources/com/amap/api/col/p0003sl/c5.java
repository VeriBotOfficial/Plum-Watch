package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndoorFloorSwitchView.java */
/* loaded from: classes11.dex */
public class c5 extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private Context f1582a;
    private LinearLayout b;
    private int c;
    private List<String> d;
    private int e;
    private Bitmap f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    int l;
    private int m;
    private Runnable n;
    private int o;
    private d p;

    /* compiled from: IndoorFloorSwitchView.java */
    class a implements Runnable {

        /* compiled from: IndoorFloorSwitchView.java */
        /* renamed from: com.amap.api.col.3sl.c5$a$a, reason: collision with other inner class name */
        class RunnableC0108a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1584a;
            final /* synthetic */ int b;

            RunnableC0108a(int i, int i2) {
                this.f1584a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c5 c5Var = c5.this;
                c5Var.smoothScrollTo(0, (c5Var.m - this.f1584a) + c5.this.c);
                c5 c5Var2 = c5.this;
                c5Var2.l = this.b + c5Var2.j + 1;
                c5.f(c5.this);
            }
        }

        /* compiled from: IndoorFloorSwitchView.java */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1585a;
            final /* synthetic */ int b;

            b(int i, int i2) {
                this.f1585a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c5 c5Var = c5.this;
                c5Var.smoothScrollTo(0, c5Var.m - this.f1585a);
                c5 c5Var2 = c5.this;
                c5Var2.l = this.b + c5Var2.j;
                c5.f(c5.this);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c5.this.m - c5.this.getScrollY() != 0) {
                c5 c5Var = c5.this;
                c5Var.m = c5Var.getScrollY();
                c5 c5Var2 = c5.this;
                c5Var2.postDelayed(c5Var2.n, c5.this.o);
                return;
            }
            if (c5.this.c == 0) {
                return;
            }
            int i = c5.this.m % c5.this.c;
            int i2 = c5.this.m / c5.this.c;
            if (i == 0) {
                c5 c5Var3 = c5.this;
                c5Var3.l = i2 + c5Var3.j;
                c5.f(c5.this);
            } else if (i > c5.this.c / 2) {
                c5.this.post(new RunnableC0108a(i, i2));
            } else {
                c5.this.post(new b(i, i2));
            }
        }
    }

    /* compiled from: IndoorFloorSwitchView.java */
    class b extends Drawable {
        b() {
        }

        private void a(Canvas canvas) {
            Paint paint = new Paint();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            rect.left = 0;
            rect.top = 0;
            rect.right = c5.this.f.getWidth();
            rect.bottom = c5.this.f.getHeight();
            rect2.left = 0;
            rect2.top = c5.k(c5.this)[0];
            rect2.right = c5.this.e;
            rect2.bottom = c5.k(c5.this)[1];
            canvas.drawBitmap(c5.this.f, rect, rect2, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            try {
                canvas.drawColor(c5.this.g);
                a(canvas);
                Paint paint = new Paint();
                Rect clipBounds = canvas.getClipBounds();
                paint.setColor(c5.this.h);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(c5.this.i);
                canvas.drawRect(clipBounds, paint);
            } catch (Throwable unused) {
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* compiled from: IndoorFloorSwitchView.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1587a;

        c(int i) {
            this.f1587a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            c5 c5Var = c5.this;
            c5Var.smoothScrollTo(0, this.f1587a * c5Var.c);
        }
    }

    /* compiled from: IndoorFloorSwitchView.java */
    public interface d {
        void a(int i);
    }

    public c5(Context context) {
        super(context);
        this.c = 0;
        this.f = null;
        this.g = Color.parseColor("#eeffffff");
        this.h = Color.parseColor("#44383838");
        this.i = 4;
        this.j = 1;
        this.l = 1;
        this.o = 50;
        a(context);
    }

    static void f(c5 c5Var) {
        d dVar = c5Var.p;
        if (dVar != null) {
            try {
                List<String> list = c5Var.d;
                int i = 0;
                if (list != null && list.size() != 0) {
                    i = Math.min(c5Var.d.size() - (c5Var.j * 2), Math.max(0, ((c5Var.d.size() - 1) - c5Var.l) - c5Var.j));
                }
                dVar.a(i);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        super.fling(i / 3);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a(i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e = i;
        try {
            setBackgroundDrawable(null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.m = getScrollY();
            postDelayed(this.n, this.o);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.g = i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.e == 0) {
            try {
                WindowManager windowManager = (WindowManager) this.f1582a.getSystemService("window");
                if (windowManager != null) {
                    this.e = windowManager.getDefaultDisplay().getWidth();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.setBackgroundDrawable(new b());
    }

    static int[] k(c5 c5Var) {
        int i = c5Var.c;
        int i2 = c5Var.j;
        return new int[]{i * i2, i * (i2 + 1)};
    }

    public boolean b() {
        return getVisibility() == 0;
    }

    private void a(Context context) {
        this.f1582a = context;
        setVerticalScrollBarEnabled(false);
        try {
            if (this.f == null) {
                this.f = m4.b(context, "map_indoor_select.png");
            }
        } catch (Throwable unused) {
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.b);
        this.n = new a();
    }

    private void a(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return;
        }
        int i3 = (i / i2) + this.j;
        int i4 = i % i2;
        if (i4 != 0 && i4 > i2 / 2) {
            i3++;
        }
        int childCount = this.b.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            TextView textView = (TextView) this.b.getChildAt(i5);
            if (textView == null) {
                return;
            }
            if (i3 == i5) {
                textView.setTextColor(Color.parseColor("#0288ce"));
            } else {
                textView.setTextColor(Color.parseColor("#bbbbbb"));
            }
        }
    }

    public void a(String[] strArr) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.clear();
        for (String str : strArr) {
            this.d.add(str);
        }
        for (int i = 0; i < this.j; i++) {
            this.d.add(0, "");
            this.d.add("");
        }
        List<String> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        this.b.removeAllViews();
        this.k = (this.j * 2) + 1;
        for (int size = this.d.size() - 1; size >= 0; size--) {
            LinearLayout linearLayout = this.b;
            String str2 = this.d.get(size);
            TextView textView = new TextView(this.f1582a);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            textView.setSingleLine(true);
            textView.setTextSize(2, 16.0f);
            textView.setText(str2);
            textView.setGravity(17);
            textView.getPaint().setFakeBoldText(true);
            int i2 = (int) ((this.f1582a.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
            int i3 = (int) ((this.f1582a.getResources().getDisplayMetrics().density * 6.0f) + 0.5f);
            textView.setPadding(i2, i3, i2, i3);
            if (this.c == 0) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
                this.c = textView.getMeasuredHeight();
                this.b.setLayoutParams(new FrameLayout.LayoutParams(-2, this.c * this.k));
                setLayoutParams(new LinearLayout.LayoutParams(-2, this.c * this.k));
            }
            linearLayout.addView(textView);
        }
        a(0);
    }

    public void a() {
        Bitmap bitmap = this.f;
        if (bitmap != null && !bitmap.isRecycled()) {
            t4.a(this.f);
            this.f = null;
        }
        if (this.p != null) {
            this.p = null;
        }
    }

    public void a(String str) {
        List<String> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        int indexOf = this.d.indexOf(str);
        int size = this.d.size();
        int i = ((size - r1) - 1) - indexOf;
        this.l = this.j + i;
        post(new c(i));
    }

    public void a(d dVar) {
        this.p = dVar;
    }

    public void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
