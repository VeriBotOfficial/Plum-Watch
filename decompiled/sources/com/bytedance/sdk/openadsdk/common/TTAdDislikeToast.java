package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.bh.gff {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = jz.fxn(com.bytedance.sdk.openadsdk.core.rmu.fxn(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = jz.fxn(com.bytedance.sdk.openadsdk.core.rmu.fxn(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context fxn = com.bytedance.sdk.openadsdk.core.rmu.fxn();
            sDislikeSendTip = jz.fxn(fxn, "tt_feedback_thank_text") + "\n" + jz.fxn(fxn, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static void onResourceUpdated() {
        Context fxn = com.bytedance.sdk.openadsdk.core.rmu.fxn();
        sSkipText = jz.fxn(fxn, "tt_reward_screen_skip_tx");
        sDislikeTip = jz.fxn(fxn, "tt_feedback_submit_text");
        sDislikeSendTip = jz.fxn(fxn, "tt_feedback_thank_text") + "\n" + jz.fxn(fxn, "tt_feedback_experience_text");
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = wc.kg(getContext(), 75.0f);
        int kg = wc.kg(com.bytedance.sdk.openadsdk.core.rmu.fxn(), 16.0f);
        int kg2 = wc.kg(com.bytedance.sdk.openadsdk.core.rmu.fxn(), 12.0f);
        this.mTextView.setPadding(kg, kg2, kg, kg2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(GravityCompat.START);
        Drawable gff = jz.gff(getContext(), "tt_dislike_toast");
        int kg3 = wc.kg(getContext(), 16.0f);
        gff.setBounds(0, 0, kg3, kg3);
        this.mTextView.setCompoundDrawablePadding(kg3 / 2);
        this.mTextView.setCompoundDrawables(gff, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(wc.kg(com.bytedance.sdk.openadsdk.core.rmu.fxn(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
