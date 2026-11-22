package com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import java.util.Map;

/* loaded from: classes17.dex */
public abstract class a extends FrameLayout {
    public static final int t = 0;
    public static final int u = 1;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0831a {
        Map<String, String> onEasterEggTriggered(a aVar);

        void onNaviGoto(a aVar, String str);
    }

    private static class b extends a {
        private View.OnClickListener A;
        private int B;
        private int C;
        private InterfaceC0831a D;
        private TextView v;
        private com.qumeng.overseas.advlib.__remote__.ui.elements.b w;
        private TextView x;
        private View.OnClickListener y;
        private View.OnClickListener z;

        /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$b$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0832a implements View.OnClickListener {
            ViewOnClickListenerC0832a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.this.w.performClick();
            }
        }

        /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$b$b, reason: collision with other inner class name */
        class ViewOnLongClickListenerC0833b implements View.OnLongClickListener {

            /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$b$b$a, reason: collision with other inner class name */
            class ViewOnClickListenerC0834a implements View.OnClickListener {
                ViewOnClickListenerC0834a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.B = 0;
                    b.this.v.setTextColor(-7829368);
                    b.this.v.setOnClickListener(b.this.y);
                }
            }

            ViewOnLongClickListenerC0833b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                int i = b.this.B;
                if (i == 0) {
                    b.this.B = 1;
                    b.this.v.setTextColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(7643508));
                    return false;
                }
                if (i == 1) {
                    b.this.B = 2;
                    b.this.v.setTextColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(5546301));
                    return false;
                }
                if (i != 2) {
                    return false;
                }
                b.this.B = 3;
                b.this.v.setTextColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(3848766));
                b.this.v.setOnClickListener(new ViewOnClickListenerC0834a());
                return false;
            }
        }

        public b(Context context) {
            super(context);
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = 0;
            this.C = 0;
            this.D = null;
            QukanNaviBarInit();
        }

        public void QukanNaviBarInit() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setNaviBarTitle(String str) {
            this.x.setText(str);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setNaviBarURL(String str) {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnBackPressListener(View.OnClickListener onClickListener) {
            this.z = onClickListener;
            com.qumeng.overseas.advlib.__remote__.ui.elements.b bVar = this.w;
            if (bVar != null) {
                bVar.setOnClickListener(onClickListener);
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnForceClosePressListener(View.OnClickListener onClickListener) {
            this.y = onClickListener;
            TextView textView = this.v;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnNaviGoToListener(InterfaceC0831a interfaceC0831a) {
            this.D = interfaceC0831a;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnTitleClickListener(View.OnClickListener onClickListener) {
            this.A = onClickListener;
            TextView textView = this.x;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(Context context) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setGravity(16);
            this.w = new com.qumeng.overseas.advlib.__remote__.ui.elements.b(getContext());
            FrameLayout frameLayout = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(s.a(getContext(), 16.0f), s.a(getContext(), 16.0f));
            layoutParams.gravity = 17;
            frameLayout.addView(this.w, layoutParams);
            frameLayout.setOnClickListener(new ViewOnClickListenerC0832a());
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(s.a(getContext(), 32.0f), s.a(getContext(), 32.0f)));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 5;
            layoutParams2.topMargin = s.a(getContext(), 11.0f);
            layoutParams2.bottomMargin = s.a(getContext(), 11.0f);
            layoutParams2.rightMargin = s.a(getContext(), 11.0f);
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setText(R.string.qm_oversea_close);
            this.v.setGravity(17);
            this.v.setTextSize(14.0f);
            this.v.setTextColor(-7829368);
            addView(this.v, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
            layoutParams3.leftMargin = 0;
            layoutParams3.gravity = 16;
            addView(linearLayout, layoutParams3);
            TextView textView2 = new TextView(getContext());
            this.x = textView2;
            textView2.setMaxLines(1);
            this.x.setMaxEms(9);
            this.x.setGravity(17);
            this.x.setTextSize(17.0f);
            this.x.setTextColor(-16777216);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 17;
            layoutParams4.topMargin = s.a(getContext(), 11.0f);
            layoutParams4.bottomMargin = s.a(getContext(), 11.0f);
            addView(this.x, layoutParams4);
            this.x.setOnLongClickListener(new ViewOnLongClickListenerC0833b());
            return this;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = 0;
            this.C = 0;
            this.D = null;
            QukanNaviBarInit();
        }

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = 0;
            this.C = 0;
            this.D = null;
            QukanNaviBarInit();
        }
    }

    private static class c extends a {
        private EditText v;
        private Button w;
        private InterfaceC0831a x;

        /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$c$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0835a implements View.OnClickListener {
            ViewOnClickListenerC0835a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.w.getCurrentTextColor() == com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(3848766) && TextUtils.isEmpty(c.this.v.getText().toString())) {
                    c.this.a();
                }
                c.this.a();
            }
        }

        class b implements View.OnLongClickListener {
            b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                int currentTextColor = c.this.w.getCurrentTextColor();
                if (currentTextColor == com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(3848766)) {
                    WebView.setWebContentsDebuggingEnabled(true);
                    c.this.w.setTextColor(-6796288);
                } else if (currentTextColor == -6796288) {
                    WebView.setWebContentsDebuggingEnabled(false);
                    c.this.w.setTextColor(-16777216);
                } else {
                    c.this.w.setTextColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(3848766));
                }
                return true;
            }
        }

        /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a$c$c, reason: collision with other inner class name */
        class C0836c implements TextView.OnEditorActionListener {
            C0836c() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 2 || keyEvent != null) {
                    return false;
                }
                c.this.a();
                return true;
            }
        }

        public c(Context context) {
            super(context);
        }

        public a dressUp() {
            this.v = new EditText(getContext());
            Button button = new Button(getContext());
            this.w = button;
            button.setText("TOUR");
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            int i = getContext().getResources().getDisplayMetrics().widthPixels;
            int i2 = i / 4;
            linearLayout.addView(this.v, new LinearLayout.LayoutParams(i - i2, -1));
            linearLayout.addView(this.w, new LinearLayout.LayoutParams(i2, -1));
            this.w.setOnClickListener(new ViewOnClickListenerC0835a());
            this.w.setOnLongClickListener(new b());
            this.v.setSingleLine();
            this.v.setImeOptions(2);
            this.v.setOnEditorActionListener(new C0836c());
            return this;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setNaviBarTitle(String str) {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setNaviBarURL(String str) {
            EditText editText = this.v;
            if (editText != null) {
                editText.setText(str);
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnBackPressListener(View.OnClickListener onClickListener) {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnForceClosePressListener(View.OnClickListener onClickListener) {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnNaviGoToListener(InterfaceC0831a interfaceC0831a) {
            this.x = interfaceC0831a;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.Ch4omeStyle.a
        public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            InterfaceC0831a interfaceC0831a;
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            String obj = this.v.getText().toString();
            if (!TextUtils.isEmpty(obj) && (interfaceC0831a = this.x) != null) {
                interfaceC0831a.onNaviGoto(this, obj);
            }
            if (inputMethodManager != null) {
                this.v.clearFocus();
                inputMethodManager.hideSoftInputFromWindow(this.v.getWindowToken(), 0);
            }
        }

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public a(Context context) {
        super(context);
    }

    public static a create(Context context, int i) {
        return i != 1 ? new b(context).a(context) : new c(context).dressUp();
    }

    public abstract void setNaviBarTitle(String str);

    public abstract void setNaviBarURL(String str);

    public abstract void setOnBackPressListener(View.OnClickListener onClickListener);

    public abstract void setOnForceClosePressListener(View.OnClickListener onClickListener);

    public abstract void setOnNaviGoToListener(InterfaceC0831a interfaceC0831a);

    public abstract void setOnTitleClickListener(View.OnClickListener onClickListener);

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static a create(Context context) {
        int i = 0;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                i = applicationInfo.metaData.getInt("AICLK_NAVIBAR_STYLE", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(a.class, "exp_NaviBar_create", (Throwable) e);
        }
        return create(context, i);
    }
}
