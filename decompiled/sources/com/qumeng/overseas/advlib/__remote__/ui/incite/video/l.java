package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qumeng.overseas.advlib.R;

/* loaded from: classes17.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static AnimatorSet f13194a;

    public static View a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(Color.parseColor("#4D000000"));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(context);
        imageView.setId(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.e.b().a());
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/icon_qumeng_incite_circle.png").scaleType(ImageView.ScaleType.FIT_CENTER).into(imageView);
        ImageView imageView2 = new ImageView(context);
        com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url("https://cdn.adseye.com/nsdk/res/imgstatic/icon_qumeng_incite_hand.png").scaleType(ImageView.ScaleType.FIT_CENTER).into(imageView2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        relativeLayout.addView(imageView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 30.0f);
        layoutParams2.addRule(5, imageView.getId());
        relativeLayout.addView(imageView2, layoutParams2);
        imageView.setScaleX(0.3f);
        imageView.setScaleY(0.3f);
        imageView.setAlpha(0.0f);
        f13194a = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleX", 0.3f, 1.0f, 0.3f);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.3f, 1.0f, 0.3f);
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "alpha", 0.1f, 1.0f, 0.1f);
        ofFloat3.setRepeatCount(-1);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "rotation", 30.0f, 0.0f, 30.0f);
        ofFloat4.setRepeatCount(-1);
        f13194a.setDuration(800L);
        f13194a.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        f13194a.start();
        TextView textView = new TextView(context);
        textView.setText(R.string.qm_oversea_local_click_download_app_now);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(1, 18.0f);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        linearLayout.addView(relativeLayout, layoutParams3);
        linearLayout.addView(textView, layoutParams4);
        return linearLayout;
    }

    public static void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        AnimatorSet animatorSet = f13194a;
        if (animatorSet != null) {
            animatorSet.cancel();
            f13194a = null;
        }
    }
}
