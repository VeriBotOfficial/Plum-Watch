package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes11.dex */
public class ClickToReLoadView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f3023a;
    private TextView b;
    private a c;
    private int d;

    public interface a {
        void a();
    }

    public ClickToReLoadView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        this.d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f3023a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.c));
        int a2 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.d;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", "string")));
        this.b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", "color")));
        this.b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.c));
        int a3 = q.a(context, 9.0f);
        int a4 = q.a(context, 5.0f);
        this.b.setPadding(a3, a4, a3, a4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.d;
        addView(this.f3023a, layoutParams);
        addView(this.b, layoutParams2);
        this.b.setOnClickListener(new AnonymousClass1());
    }

    private void a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.d = q.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f3023a = imageView;
        imageView.setImageResource(q.a(context, "myoffer_webview_reload_icon", k.c));
        int a2 = q.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.d;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setText(getResources().getText(q.a(context, "myoffer_webview_reload", "string")));
        this.b.setTextColor(getResources().getColor(q.a(context, "color_reload_button", "color")));
        this.b.setBackgroundResource(q.a(context, "myoffer_webview_bg_reload_button", k.c));
        int a3 = q.a(context, 9.0f);
        int a4 = q.a(context, 5.0f);
        this.b.setPadding(a3, a4, a3, a4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.d;
        addView(this.f3023a, layoutParams);
        addView(this.b, layoutParams2);
    }

    /* renamed from: com.anythink.basead.ui.ClickToReLoadView$1, reason: invalid class name */
    final class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        long f3024a;

        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f3024a > 1000) {
                this.f3024a = currentTimeMillis;
                if (ClickToReLoadView.this.c != null) {
                    ClickToReLoadView.this.c.a();
                }
            }
        }
    }

    private void a() {
        this.b.setOnClickListener(new AnonymousClass1());
    }

    public void setListener(a aVar) {
        this.c = aVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHeight() < q.a(getContext(), 100.0f)) {
            try {
                this.f3023a.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = 0;
                    this.b.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void b() {
        try {
            this.f3023a.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.b.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }
}
