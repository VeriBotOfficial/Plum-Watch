package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;

/* loaded from: classes12.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        a();
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    private void a() {
        setOrientation(0);
        int b = v.b(getContext(), 10.0f);
        setPadding(0, b, 0, b);
        ImageView imageView = (ImageView) b();
        imageView.setTag("backward");
        imageView.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_backward", k.c)));
        addView(imageView);
        ImageView imageView2 = (ImageView) b();
        imageView2.setTag("forward");
        imageView2.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_forward", k.c)));
        addView(imageView2);
        ImageView imageView3 = (ImageView) b();
        imageView3.setTag("refresh");
        imageView3.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_refresh", k.c)));
        addView(imageView3);
        ImageView imageView4 = (ImageView) b();
        imageView4.setTag("exits");
        imageView4.setImageDrawable(getResources().getDrawable(k.a(getContext(), "anythink_expressad_exits", k.c)));
        addView(imageView4);
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }
}
