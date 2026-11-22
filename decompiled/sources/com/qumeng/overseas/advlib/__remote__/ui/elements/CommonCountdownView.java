package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util.Background;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class CommonCountdownView extends AppCompatTextView {
    private int t;
    private d u;
    private Runnable v;
    private boolean w;
    private boolean x;

    class a implements View.OnClickListener {
        final /* synthetic */ AdsObject t;
        final /* synthetic */ d u;

        a(AdsObject adsObject, d dVar) {
            this.t = adsObject;
            this.u = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap hashMap = new HashMap();
            hashMap.put("op1", "SPLASH_SKIP_BUTTON_CLOSE");
            com.qumeng.overseas.advlib.__remote__.utils.network.c.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), this.t, oqmh.b.b, hashMap);
            d dVar = this.u;
            if (dVar != null) {
                dVar.onEnd();
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ AdsObject t;
        final /* synthetic */ d u;

        b(AdsObject adsObject, d dVar) {
            this.t = adsObject;
            this.u = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HashMap hashMap = new HashMap();
            hashMap.put("op1", "SPLASH_SKIP_BUTTON_CLOSE");
            com.qumeng.overseas.advlib.__remote__.utils.network.c.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), this.t, oqmh.b.b, hashMap);
            d dVar = this.u;
            if (dVar != null) {
                dVar.onEnd();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CommonCountdownView.this.x) {
                CommonCountdownView.this.setVisibility(0);
                if (CommonCountdownView.this.w) {
                    CommonCountdownView.this.setText("");
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(CommonCountdownView.this.t + " " + com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_skip));
                    int length = String.valueOf(CommonCountdownView.this.t).length();
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF5240")), 0, length, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
                    CommonCountdownView.this.setText(spannableStringBuilder);
                }
            } else {
                CommonCountdownView.this.setVisibility(4);
            }
            if (CommonCountdownView.this.t > 0) {
                CommonCountdownView.d(CommonCountdownView.this);
                CommonCountdownView.this.postDelayed(this, 1000L);
                return;
            }
            if (!CommonCountdownView.this.x) {
                CommonCountdownView.this.setVisibility(0);
            }
            CommonCountdownView.this.setText(R.string.qm_oversea_skip);
            if (CommonCountdownView.this.u != null) {
                CommonCountdownView.this.u.onTimeOver();
            }
        }
    }

    public interface d {
        void onEnd();

        void onTimeOver();
    }

    public CommonCountdownView(Context context) {
        super(context);
        this.x = true;
    }

    static /* synthetic */ int d(CommonCountdownView commonCountdownView) {
        int i = commonCountdownView.t;
        commonCountdownView.t = i - 1;
        return i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.v;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.v);
    }

    public void setIgnoreClick(boolean z) {
        this.w = z;
    }

    public void setListener(d dVar) {
        this.u = dVar;
    }

    public void setShowCountdownSeconds(boolean z) {
        this.x = z;
    }

    public static CommonCountdownView a(Context context, int i, int i2, AdRequestParam adRequestParam, boolean z, d dVar) {
        return a(context, i, i2, adRequestParam, z, null, dVar);
    }

    public CommonCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = true;
    }

    public static CommonCountdownView a(Context context, int i, int i2, AdRequestParam adRequestParam, boolean z, AdsObject adsObject, d dVar) {
        return a(context, i, i2, adRequestParam, z, adsObject, dVar, Color.parseColor("#77000000"));
    }

    public static CommonCountdownView a(Context context, int i, int i2, AdRequestParam adRequestParam, boolean z, AdsObject adsObject, d dVar, int i3) {
        GradientDrawable createBackground;
        CommonCountdownView commonCountdownView = new CommonCountdownView(context);
        if (adRequestParam != null && com.qumeng.overseas.advlib.trdparty.unionset.network.c.f().b(adRequestParam.getAdslotID(), j.N0)) {
            i = -1;
        }
        commonCountdownView.a(i);
        if (adsObject != null && adsObject.hasExpFeature(j.M0)) {
            commonCountdownView.setShowCountdownSeconds(false);
        }
        commonCountdownView.setListener(dVar);
        commonCountdownView.setTextColor(-1);
        commonCountdownView.setTextSize(13.0f);
        if (!z) {
            commonCountdownView.setOnClickListener(new a(adsObject, dVar));
        }
        if (i2 > 0) {
            createBackground = Background.build().radius(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, i2)).color(i3).createBackground();
        } else {
            createBackground = Background.build().radius(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 1000.0f)).color(i3).createBackground();
        }
        commonCountdownView.setBackgroundDrawable(createBackground);
        int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 12.0f);
        int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 6.0f);
        commonCountdownView.setPadding(a2, a3, a2, a3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 39.0f);
        layoutParams.rightMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 12.0f);
        commonCountdownView.setLayoutParams(layoutParams);
        commonCountdownView.setIgnoreClick(z);
        return commonCountdownView;
    }

    public static CommonCountdownView a(Context context, int i, boolean z, AdsObject adsObject, d dVar) {
        CommonCountdownView commonCountdownView = new CommonCountdownView(context);
        commonCountdownView.setText("Continue to App");
        commonCountdownView.setGravity(16);
        commonCountdownView.setListener(dVar);
        commonCountdownView.setTextColor(-1);
        commonCountdownView.setTextSize(14.0f);
        commonCountdownView.setTypeface(commonCountdownView.getTypeface(), 1);
        commonCountdownView.setElevation(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 10.0f));
        if (!z) {
            commonCountdownView.setOnClickListener(new b(adsObject, dVar));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#2363BC"), Color.parseColor("#6053B1")});
        gradientDrawable.setCornerRadius(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 25.0f));
        commonCountdownView.setBackgroundDrawable(gradientDrawable);
        Drawable a2 = com.qumeng.overseas.advlib.__remote__.utils.d.a(context, R.drawable.ic_arrow_forward_white);
        if (a2 != null) {
            commonCountdownView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
            commonCountdownView.setCompoundDrawablePadding(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 4.0f));
        }
        int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 16.0f);
        int a4 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 8.0f);
        commonCountdownView.setPadding(a3, a4, a3, a4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        layoutParams.topMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 39.0f);
        layoutParams.rightMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 12.0f);
        commonCountdownView.setLayoutParams(layoutParams);
        commonCountdownView.setIgnoreClick(z);
        return commonCountdownView;
    }

    public void a(int i) {
        if (i == -1) {
            if (this.w) {
                setVisibility(8);
                return;
            } else {
                setText(R.string.qm_oversea_skip);
                return;
            }
        }
        this.t = i;
        this.v = new c();
    }
}
