package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import java.util.List;

/* loaded from: classes12.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    public ToolBar(Context context) {
        super(context);
        a();
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ToolBar(Context context, List<b> list) {
        super(context);
        b(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<b> list) {
        super(context, attributeSet);
        b(list);
    }

    public ToolBar(Context context, a aVar, List<b> list) {
        super(context);
        a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, a aVar, List<b> list) {
        super(context, attributeSet);
        a(list);
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

    public void setTitle(String str, int i) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            textView.setLayoutParams(layoutParams);
            textView.setClickable(true);
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void setTitle(String str) {
        setTitle(str, -16777216);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    private void a(List<b> list) {
        setOrientation(0);
        try {
            int b2 = v.b(getContext(), 10.0f);
            setPadding(0, b2, v.b(getContext(), 20.0f), b2);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.b);
                imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), bVar.c, k.c)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a.c, -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(bVar.e);
                if (!bVar.d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private void b(List<b> list) {
        setOrientation(0);
        try {
            int b2 = v.b(getContext(), 10.0f);
            setPadding(0, b2, 0, b2);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.b);
                imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), bVar.c, k.c)));
                imageView.setOnClickListener(bVar.e);
                if (!bVar.d) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    private void a() {
        setOrientation(0);
        try {
            int b2 = v.b(getContext(), 10.0f);
            setPadding(0, b2, 0, b2);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) b();
            imageView.setTag("backward");
            imageView.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_backward", k.c)));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) b();
            imageView2.setTag("forward");
            imageView2.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_forward", k.c)));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) b();
            imageView3.setTag("refresh");
            imageView3.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_refresh", k.c)));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) b();
            imageView4.setTag("open_by_browser");
            imageView4.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_browser", k.c)));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) b();
            imageView5.setTag("exits");
            imageView5.setImageDrawable(getResources().getDrawable(q.a(getContext(), "cm_exits", k.c)));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    private View c() {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setClickable(true);
        return textView;
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(q.a(getContext(), str2, k.c)));
    }

    public static class a {
        public static int c = 40;
        public static int d = 10;

        /* renamed from: a, reason: collision with root package name */
        public int f4675a;
        public int b;

        private void a(int i) {
            this.f4675a = i;
        }

        private void a() {
            this.b = 40;
        }

        private static void b() {
            c = 80;
        }

        private static void b(int i) {
            d = i;
        }

        private int c() {
            return this.f4675a;
        }

        private int d() {
            return this.b;
        }

        private static int e() {
            return c;
        }

        private static int f() {
            return d;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f4676a;
        public String b;
        public String c;
        public boolean d;
        public View.OnClickListener e;

        private b(String str, String str2, String str3, boolean z, View.OnClickListener onClickListener) {
            this.b = str;
            this.f4676a = str2;
            this.c = str3;
            this.d = z;
            this.e = onClickListener;
        }

        public b(String str) {
            this.d = true;
            this.b = str;
        }

        private b a(View.OnClickListener onClickListener) {
            this.e = onClickListener;
            return this;
        }

        private b a(String str) {
            this.c = str;
            return this;
        }

        private b b(String str) {
            this.b = str;
            return this;
        }

        private b c(String str) {
            this.f4676a = str;
            return this;
        }

        private b a() {
            this.d = false;
            return this;
        }
    }
}
