package com.anythink.expressad.video.dynview.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.anythink.expressad.video.module.AnythinkClickCTAView;
import com.anythink.expressad.video.widget.SoundImageView;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f5265a = "anythink_top_play_bg";
    private String b = "anythink_top_finger_bg";
    private String c = "anythink_bottom_play_bg";
    private String d = "anythink_bottom_finger_bg";
    private String e = "anythink_tv_count";
    private String f = "anythink_sound_switch";
    private String g = "anythink_top_control";
    private String h = "anythink_tv_title";
    private String i = "anythink_tv_desc";
    private String j = "anythink_tv_install";
    private String k = "anythink_sv_starlevel";
    private String l = "anythink_sv_heat_count_level";
    private String m = "anythink_tv_cta";
    private String n = "anythink_native_ec_controller";
    private String o = "anythink_reward_shape_choice_rl";
    private String p = "#FFFFFF";

    /* renamed from: q, reason: collision with root package name */
    private String f5266q = "#FF000000";
    private String r = "#40000000";
    private String s = "#CAEF79";
    private String t = "#2196F3";
    private String u = "#402196F3";
    private String v = "#8FC31F";
    private String w = "#03A9F4";
    private String x = "#FF89C120";
    private String y = "#FF2BAE5D";
    private boolean z = false;

    private static void a() {
    }

    public final void a(View view) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            this.z = false;
            ImageView imageView = (ImageView) view.findViewById(a(this.f5265a));
            ImageView imageView2 = (ImageView) view.findViewById(a(this.b));
            ImageView imageView3 = (ImageView) view.findViewById(a(this.c));
            ImageView imageView4 = (ImageView) view.findViewById(a(this.d));
            ObjectAnimator objectAnimator4 = null;
            if (imageView != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator = com.anythink.expressad.video.dynview.h.b.a(imageView);
            } else {
                objectAnimator = null;
            }
            if (imageView2 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator2 = com.anythink.expressad.video.dynview.h.b.b(imageView2);
            } else {
                objectAnimator2 = null;
            }
            if (imageView3 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator3 = com.anythink.expressad.video.dynview.h.b.a(imageView3);
            } else {
                objectAnimator3 = null;
            }
            if (imageView4 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator4 = com.anythink.expressad.video.dynview.h.b.b(imageView4);
            }
            if (objectAnimator == null || objectAnimator3 == null || objectAnimator2 == null || objectAnimator4 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimator, objectAnimator3, objectAnimator2, objectAnimator4);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r12, com.anythink.expressad.video.dynview.c r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.j.b.a(android.view.View, com.anythink.expressad.video.dynview.c):void");
    }

    private void a(Context context, View view, com.anythink.expressad.video.dynview.c cVar) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(a(this.f));
        int b = v.b(context, 60.0f);
        int b2 = v.b(context, 10.0f);
        if (soundImageView != null) {
            cVar.e();
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(b2, 0, 0, b);
        }
    }

    private void b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.f5226a == 0 && com.anythink.expressad.video.dynview.a.b.b == 0 && com.anythink.expressad.video.dynview.a.b.c == 0 && com.anythink.expressad.video.dynview.a.b.d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    public final void b(View view, com.anythink.expressad.video.dynview.c cVar) {
        Context context;
        int b;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(k.a(context, this.o, k.c)));
            TextView textView = (TextView) view.findViewById(a(this.h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f5266q));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f5266q));
            }
            b = v.b(context, 2.0f);
        } else {
            b = v.b(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int b2 = v.b(context, 8.0f);
        View findViewById = view.findViewById(a(this.j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof AnythinkClickCTAView)) {
                new com.anythink.expressad.video.dynview.h.b();
                ((AnythinkClickCTAView) cVar.f()).setObjectAnimator(com.anythink.expressad.video.dynview.h.b.c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.p));
                textView3.setTextSize(15.0f);
                String str = this.s;
                com.anythink.expressad.video.dynview.i.b.a.a(textView3, 1.0f, 5.0f, str, new String[]{this.v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(b, b, b, b2);
            layoutParams.height = v.b(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void c(View view, com.anythink.expressad.video.dynview.c cVar) {
        if (view == null || cVar == null) {
            return;
        }
        if (view.getContext() != null) {
            this.z = false;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(a(this.k));
            View findViewById = view.findViewById(a(this.m));
            if (linearLayout != null && (linearLayout instanceof AnyThinkLevelLayoutView)) {
                if (cVar.e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.n));
            if (relativeLayout != null) {
                if (cVar.e() == 1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f5226a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                    relativeLayout.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f5226a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            if (findViewById != null) {
                if (findViewById instanceof TextView) {
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(Color.parseColor(this.p));
                    textView.setTextSize(22.0f);
                    com.anythink.expressad.video.dynview.i.b.a.a(findViewById, 1.0f, cVar.i() == 1302 ? 25 : 5, this.s, new String[]{this.x, this.y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                int i = cVar.i();
                if (i == 404 || i == 704 || i == 1402) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    new com.anythink.expressad.video.dynview.h.b();
                    animatorSet.playTogether(com.anythink.expressad.video.dynview.h.b.c(findViewById));
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.j.b.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    if (view instanceof AnyThinkFramLayout) {
                        ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof AnyThinkRelativeLayout) {
                        ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
        }
        new com.anythink.expressad.video.dynview.h.b();
        com.anythink.expressad.video.dynview.h.b.e(view);
    }

    private void d(View view, com.anythink.expressad.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.n));
        if (relativeLayout != null) {
            if (cVar.e() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f5226a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f5226a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g(), str, "id");
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }
}
