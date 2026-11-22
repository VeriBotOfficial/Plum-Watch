package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes11.dex */
public class ShakeThumbView extends BaseShakeView {
    private FrameLayout l;
    private TextView m;

    public ShakeThumbView(Context context) {
        super(context);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    final void a() {
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(getContext(), 80.0f), q.a(getContext(), 80.0f));
        layoutParams.gravity = 49;
        imageView.setLayoutParams(layoutParams);
        int a2 = q.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a2);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f3000a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(q.a(getContext(), 48.0f), q.a(getContext(), 48.0f));
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = q.a(getContext(), 16.0f);
        this.f3000a.setLayoutParams(layoutParams2);
        this.m = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        this.m.setGravity(1);
        this.m.setMaxWidth(q.a(getContext(), 124.0f));
        this.m.setMaxLines(2);
        this.m.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = q.a(getContext(), 86.0f);
        this.m.setLayoutParams(layoutParams3);
        this.m.setText(q.a(t.b().g(), "myoffer_shake_full_title", "string"));
        this.m.setTextSize(1, 12.0f);
        this.m.setTextColor(-1);
        this.m.setBackgroundResource(q.a(t.b().g(), "myoffer_bg_shake_thumb_hint", k.c));
        int a3 = q.a(getContext(), 6.0f);
        int a4 = q.a(getContext(), 12.0f);
        this.m.setPadding(a4, a3, a4, a3);
        this.l = new FrameLayout(getContext());
        this.l.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.l.addView(imageView);
        this.l.addView(this.f3000a);
        this.l.addView(this.m);
        addView(this.l);
    }

    private void a(View view) {
        int a2 = q.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99262626");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a2);
        view.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (this.m != null) {
            if (!TextUtils.isEmpty(this.g)) {
                this.m.setText(this.g);
            } else {
                this.m.setText(e.a(getContext(), i));
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            FrameLayout frameLayout = this.l;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(onClickListener);
            }
        } catch (Throwable unused) {
        }
    }
}
