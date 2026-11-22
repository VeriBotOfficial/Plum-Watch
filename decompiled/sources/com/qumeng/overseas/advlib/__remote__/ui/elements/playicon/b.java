package com.qumeng.overseas.advlib.__remote__.ui.elements.playicon;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.f;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.l;

/* loaded from: classes17.dex */
public class b extends LinearLayout implements a {
    public static final int w = 62;
    private TextView t;
    private ImageView u;
    private CharSequence v;

    public b(Context context) {
        super(context);
        this.v = "0:00";
        b();
        a();
    }

    public void a() {
        this.u = new ImageView(getContext());
        int a2 = s.a(getContext(), 25.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
        this.u.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.u.setLayoutParams(layoutParams);
        l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/ic_play.png").scaleType(ImageView.ScaleType.CENTER_INSIDE).into(this.u);
        addView(this.u);
        this.t = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = s.a(getContext(), 2.0f);
        this.t.setLayoutParams(layoutParams2);
        this.t.setTextColor(-1);
        this.t.setText(this.v);
        this.t.setTextSize(1, 12.0f);
        addView(this.t);
    }

    public void setText(CharSequence charSequence) {
        this.v = charSequence;
        this.t.setText(charSequence);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.playicon.a
    public void setTime(int i) {
        if (i > 0) {
            setText(f.a(i));
        } else {
            setText("");
        }
    }

    private void b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(s.a(getContext(), 24.0f));
        gradientDrawable.setColor(Color.argb(128, 0, 0, 0));
        setBackground(gradientDrawable);
        setOrientation(1);
        setGravity(17);
    }
}
