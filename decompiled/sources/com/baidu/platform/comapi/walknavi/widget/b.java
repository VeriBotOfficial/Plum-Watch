package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.bikenavi.R;

/* compiled from: WNaviDialog.java */
/* loaded from: classes13.dex */
public class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private TextView f8827a;
    private TextView b;
    private TextView c;
    private TextView d;
    private LinearLayout e;
    private LinearLayout f;
    private c g;
    private c h;
    private boolean i;
    private boolean j;

    /* compiled from: WNaviDialog.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.g != null) {
                b.this.g.a();
            }
            b.this.dismiss();
        }
    }

    /* compiled from: WNaviDialog.java */
    /* renamed from: com.baidu.platform.comapi.walknavi.widget.b$b, reason: collision with other inner class name */
    class ViewOnClickListenerC0416b implements View.OnClickListener {
        ViewOnClickListenerC0416b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.h != null) {
                b.this.h.a();
            }
            b.this.dismiss();
        }
    }

    /* compiled from: WNaviDialog.java */
    public interface c {
        void a();
    }

    public b(Context context, int i) {
        super(context);
    }

    public b c(String str) {
        if (str == null) {
            this.j = false;
            this.d.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.j = true;
            this.d.setText(str, TextView.BufferType.SPANNABLE);
        }
        b();
        return this;
    }

    public b d(String str) {
        if (str == null) {
            this.f8827a.setVisibility(8);
            this.f8827a.setText("", TextView.BufferType.SPANNABLE);
            return this;
        }
        this.f8827a.setVisibility(0);
        this.f8827a.setText(str, TextView.BufferType.SPANNABLE);
        return this;
    }

    public b(Context context) {
        super(context);
    }

    public b a(String str) {
        if (str == null) {
            this.b.setVisibility(8);
            this.b.setText("", TextView.BufferType.SPANNABLE);
            return this;
        }
        this.b.setVisibility(0);
        this.b.setText(str, TextView.BufferType.SPANNABLE);
        return this;
    }

    public b b(String str) {
        if (str == null) {
            this.i = false;
            this.c.setText("", TextView.BufferType.SPANNABLE);
        } else {
            this.i = true;
            this.c.setText(str, TextView.BufferType.SPANNABLE);
        }
        b();
        return this;
    }

    public b(Activity activity) {
        this(activity, R.style.WNaviDialog);
        View a2 = com.baidu.platform.comapi.wnplatform.p.p.a.a(activity, R.layout.wsdk_layout_common_dialog, null);
        requestWindowFeature(1);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(a2);
        this.f8827a = (TextView) a2.findViewById(R.id.title_bar);
        this.b = (TextView) a2.findViewById(R.id.content_message);
        this.c = (TextView) a2.findViewById(R.id.first_btn);
        this.d = (TextView) a2.findViewById(R.id.second_btn);
        this.e = (LinearLayout) a2.findViewById(R.id.left_div);
        this.f = (LinearLayout) a2.findViewById(R.id.right_div);
        this.c.setOnClickListener(new a());
        this.d.setOnClickListener(new ViewOnClickListenerC0416b());
        this.i = false;
        this.j = false;
        this.f8827a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        setCanceledOnTouchOutside(false);
    }

    public b d() {
        this.d.setTextColor(-12352272);
        return this;
    }

    public b a(c cVar) {
        this.g = cVar;
        return this;
    }

    public b a(boolean z) {
        super.setCancelable(z);
        return this;
    }

    public b c() {
        this.c.setTextColor(-12352272);
        return this;
    }

    public TextView a() {
        return this.d;
    }

    public b b(c cVar) {
        this.h = cVar;
        return this;
    }

    private void b() {
        if (!this.i) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            return;
        }
        if (!this.j) {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }
}
