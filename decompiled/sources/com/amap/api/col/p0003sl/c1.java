package com.amap.api.col.p0003sl;

import android.graphics.Rect;
import android.view.View;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.amap.mapcore.DPoint;

/* compiled from: NativeOverlayWrapper.java */
/* loaded from: classes11.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    private Marker f1575a;
    private volatile int b = 0;
    private volatile int c = 0;
    private volatile int d = 0;
    private volatile int e = 0;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private int i = 0;
    private int j = 0;

    public c1(Marker marker) {
        this.f1575a = marker;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public synchronized int b() {
        return this.e;
    }

    public BaseOverlay c() {
        return this.f1575a;
    }

    public View d() {
        MarkerOptions options = this.f1575a.getOptions();
        if (options == null) {
            return null;
        }
        return options.getIconView();
    }

    public int e() {
        MarkerOptions options = this.f1575a.getOptions();
        if (options == null) {
            return 0;
        }
        View iconView = options.getIconView();
        int width = iconView.getWidth();
        if (width != 0) {
            return width;
        }
        a(iconView);
        return this.i;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.f;
    }

    public void i() {
        View iconView;
        MarkerOptions options = this.f1575a.getOptions();
        if (options == null || (iconView = options.getIconView()) == null) {
            return;
        }
        if (options.isVisible() == (iconView.getVisibility() == 0)) {
            return;
        }
        iconView.setVisibility(options.isVisible() ? 0 : 8);
    }

    private void a(View view) {
        if (this.i == 0 && this.j == 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.i = view.getMeasuredWidth();
            this.j = view.getMeasuredHeight();
        }
    }

    public synchronized void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        MarkerOptions options = this.f1575a.getOptions();
        if (options == null) {
            return;
        }
        float anchorU = options.getAnchorU();
        float anchorV = options.getAnchorV();
        View iconView = options.getIconView();
        int i6 = 0;
        if (iconView != null) {
            i3 = e();
            MarkerOptions options2 = this.f1575a.getOptions();
            if (options2 == null) {
                i4 = 0;
            } else {
                View iconView2 = options2.getIconView();
                i4 = iconView2.getHeight();
                if (i4 == 0) {
                    a(iconView2);
                    i4 = this.j;
                }
            }
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (iconView != null) {
            i6 = (int) (i3 * anchorU);
            i5 = (int) (i4 * anchorV);
        } else {
            i5 = 0;
        }
        if (i6 != 0 && i5 != 0) {
            if (Math.abs(this.b - i) > 2) {
                this.d = i - i6;
                this.f = true;
            }
            if (Math.abs(this.c - i2) > 2) {
                this.e = i2 - i5;
                this.f = true;
            }
        }
    }

    public synchronized int a() {
        return this.d;
    }

    public synchronized void a(int i, int i2) {
        if (this.f) {
            MarkerOptions options = this.f1575a.getOptions();
            if (options == null) {
                return;
            }
            View iconView = options.getIconView();
            if (iconView == null) {
                return;
            }
            iconView.setX(this.d);
            iconView.setY(this.e);
            iconView.setZ(options.getZIndex());
            if (i != -1) {
                this.b = i;
            }
            if (i2 != -1) {
                this.c = i2;
            }
            this.f = false;
        }
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void a(boolean z, int i, int i2) {
        this.f = z;
        this.b = i;
        this.c = i2;
    }

    public boolean a(DPoint dPoint) {
        View iconView = this.f1575a.getOptions().getIconView();
        Rect rect = new Rect();
        if (iconView != null) {
            iconView.getHitRect(rect);
        }
        return rect.contains((int) dPoint.x, (int) dPoint.y);
    }
}
