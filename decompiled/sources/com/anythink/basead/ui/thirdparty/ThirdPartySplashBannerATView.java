package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.thirdparty.a;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes11.dex */
public class ThirdPartySplashBannerATView extends RelativeLayout implements com.anythink.core.common.l.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f3436a;
    private a b;

    public ThirdPartySplashBannerATView(Context context) {
        this(context, null);
    }

    public ThirdPartySplashBannerATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartySplashBannerATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3436a = context;
        TextView textView = new TextView(this.f3436a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a2 = q.a(this.f3436a, 5.0f);
        layoutParams.leftMargin = a2;
        layoutParams.topMargin = a2;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f3436a, "myoffer_splash_ad_label_bg", k.c));
        int a3 = q.a(this.f3436a, 2.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(q.a(this.f3436a, "basead_ad_text", "string"));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    public void addCountDownView(int i, a.InterfaceC0181a interfaceC0181a) {
        a aVar = new a(this.f3436a, this, i * 1000, interfaceC0181a);
        this.b = aVar;
        View a2 = aVar.a();
        if (a2 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, q.a(this.f3436a, 32.0f), q.a(this.f3436a, 18.0f), 0);
        addView(a2, layoutParams);
        this.b.b();
    }

    public void addBannerView(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        addView(view, layoutParams);
    }

    private void b() {
        TextView textView = new TextView(this.f3436a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a2 = q.a(this.f3436a, 5.0f);
        layoutParams.leftMargin = a2;
        layoutParams.topMargin = a2;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f3436a, "myoffer_splash_ad_label_bg", k.c));
        int a3 = q.a(this.f3436a, 2.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(q.a(this.f3436a, "basead_ad_text", "string"));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }

    private void a() {
        TextView textView = new TextView(this.f3436a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int a2 = q.a(this.f3436a, 5.0f);
        layoutParams.leftMargin = a2;
        layoutParams.topMargin = a2;
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        textView.setBackgroundResource(q.a(this.f3436a, "myoffer_splash_ad_label_bg", k.c));
        int a3 = q.a(this.f3436a, 2.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(q.a(this.f3436a, "basead_ad_text", "string"));
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(2, 11.0f);
        textView.setGravity(17);
        addView(textView, layoutParams);
    }
}
