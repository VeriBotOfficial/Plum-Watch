package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public class ThirdPartyNativeExtView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f3431a;
    private TextView b;
    private TextView c;

    public ThirdPartyNativeExtView(Context context) {
        this(context, null);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyNativeExtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void initView(String str, String str2, String str3) {
        setOrientation(0);
        Context context = getContext();
        if (!TextUtils.isEmpty(str)) {
            TextView textView = new TextView(context);
            this.f3431a = textView;
            textView.setText(str);
            a(this.f3431a);
            addView(this.f3431a);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextView textView2 = new TextView(context);
            this.b = textView2;
            textView2.setText(str2);
            a(this.b);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = q.a(context, 10.0f);
                addView(this.b, layoutParams);
            } else {
                addView(this.b);
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            TextView textView3 = new TextView(context);
            this.c = textView3;
            textView3.setText(str3);
            a(this.c);
            if (getChildCount() > 0) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = q.a(context, 10.0f);
                addView(this.c, layoutParams2);
            } else {
                addView(this.c);
            }
        }
        setGravity(16);
    }

    public TextView getDomainView() {
        return this.f3431a;
    }

    public TextView getWarningView() {
        return this.b;
    }

    public TextView getAdFromView() {
        return this.c;
    }

    private static void a(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(Color.parseColor("#A0A0A0"));
        textView.setSelected(true);
        textView.setSingleLine();
        textView.setMarqueeRepeatLimit(-1);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }
}
