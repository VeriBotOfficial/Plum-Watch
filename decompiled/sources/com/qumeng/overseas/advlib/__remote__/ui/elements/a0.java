package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.ui.elements.RoundRectButton;

/* loaded from: classes17.dex */
public class a0 extends RelativeLayout {
    private RoundRectButton t;
    private ImageView u;

    public a0(Context context) {
        super(context);
        a();
    }

    private void a() {
        setBackgroundColor(-1);
        Context context = getContext();
        ImageView imageView = new ImageView(context);
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/lp_failure_splash.png").into(imageView);
        imageView.setId(1000);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 290.0f), com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 175.0f));
        layoutParams.addRule(14);
        layoutParams.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 50.0f);
        addView(imageView, layoutParams);
        ExTextView exTextView = new ExTextView(context);
        exTextView.setText(R.string.qm_oversea_local_page_access_failure);
        exTextView.setTextColor(Color.parseColor("#d9d9d9"));
        exTextView.setTextSize(12.0f);
        exTextView.setId(1001);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, 1000);
        layoutParams2.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 10.0f);
        layoutParams2.addRule(14);
        addView(exTextView, layoutParams2);
        int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 60.0f);
        int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 15.0f);
        this.t = new RoundRectButton.b(context).text(getContext().getResources().getString(R.string.qm_oversea_local_reload)).textSize(15.0f).textColor(Color.parseColor("#666666")).strokenColor(Color.parseColor("#d9d9d9")).padding(a2, a3, a2, a3).build();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, 1001);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 35.0f);
        addView(this.t, layoutParams3);
        this.u = new ImageView(context);
        int a4 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 150.0f);
        this.u.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/lp_failure_foot.png").into(this.u);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, a4);
        layoutParams4.addRule(12);
        addView(this.u, layoutParams4);
        setGravity(1);
    }

    public void setAdClickListener(View.OnClickListener onClickListener) {
        this.u.setOnClickListener(onClickListener);
    }

    public void setReoldClickListener(View.OnClickListener onClickListener) {
        this.t.setOnClickListener(onClickListener);
    }

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public a0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
