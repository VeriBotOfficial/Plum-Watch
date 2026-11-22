package com.qumeng.overseas.advlib.__remote__.ui.refresh;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.qumeng.overseas.advlib.__remote__.ui.refresh.c;

/* loaded from: classes17.dex */
public class b extends FrameLayout {
    private static final String w = "RefreshMonitorView";
    protected Rect t;
    private c u;
    private c.b v;

    class a implements c.b {
        a() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.refresh.c.b
        public void onTick(int i) {
            if (b.this.v != null) {
                b.this.v.onTick(i);
            }
        }
    }

    public b(Context context, View view) {
        super(context);
        this.t = new Rect();
        addView(view);
        this.u = new c();
        a();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            System.err.println("RefreshMonitorView addView banner is null");
        } else {
            addView(view, new ViewGroup.LayoutParams(-2, -2));
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u.f();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.u.e();
        } else {
            this.u.d();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.u.e();
        } else {
            this.u.d();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setCallback(c.b bVar) {
        this.v = bVar;
    }

    private void a() {
        this.u.a(new a());
    }
}
