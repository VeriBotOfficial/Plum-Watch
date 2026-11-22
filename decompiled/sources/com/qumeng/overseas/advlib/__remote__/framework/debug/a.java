package com.qumeng.overseas.advlib.__remote__.framework.debug;

import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class a extends ScrollView {
    public static final int D = 1000;
    public static final int E = 1001;
    public static final int F = 1002;
    public static final int G = 1003;
    public static final int H = 1004;
    private Button A;
    private TextView B;
    private InterfaceC0799a C;
    private WindowManager t;
    private WindowManager.LayoutParams u;
    private Context v;
    private boolean w;
    private Button x;
    private Button y;
    private Button z;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.debug.a$a, reason: collision with other inner class name */
    public interface InterfaceC0799a {
        void onPress();
    }

    public a(Context context, WindowManager windowManager) {
        super(context);
        this.t = windowManager;
        this.v = context;
        a(context);
    }

    private void a(Context context) {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#AC000000"));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setPadding(s.a(context, 8.0f), 0, s.a(context, 8.0f), 0);
        addView(relativeLayout);
        Button button = new Button(context);
        this.x = button;
        button.setId(1000);
        this.x.setText("close");
        this.x.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout.addView(this.x);
        Button button2 = new Button(context);
        this.y = button2;
        button2.setId(1001);
        this.y.setText("copy");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = s.a(context, 8.0f);
        layoutParams.addRule(1, 1000);
        this.y.setLayoutParams(layoutParams);
        relativeLayout.addView(this.y);
        Button button3 = new Button(context);
        this.z = button3;
        button3.setId(1003);
        this.z.setText(AMapLocationStaticsEntity.IPV4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = s.a(context, 8.0f);
        layoutParams2.addRule(1, 1001);
        this.z.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.z);
        Button button4 = new Button(context);
        this.A = button4;
        button4.setId(1004);
        this.A.setText("ads");
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = s.a(context, 8.0f);
        layoutParams3.addRule(1, 1003);
        this.A.setLayoutParams(layoutParams3);
        relativeLayout.addView(this.A);
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setId(1002);
        this.B.setTextColor(Color.parseColor("#FFFFFF"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = s.a(context, 10.0f);
        layoutParams4.addRule(3, 1000);
        this.B.setLayoutParams(layoutParams4);
        relativeLayout.addView(this.B);
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b() {
        if (c()) {
            this.w = false;
            WindowManager.LayoutParams layoutParams = this.u;
            layoutParams.alpha = 0.0f;
            layoutParams.flags = 24;
            this.t.updateViewLayout(this, layoutParams);
        }
    }

    public boolean c() {
        return this.w;
    }

    public void d() {
        if (c()) {
            return;
        }
        this.w = true;
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.alpha = 1.0f;
        layoutParams.flags = 131072;
        this.t.updateViewLayout(this, layoutParams);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0799a interfaceC0799a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && (interfaceC0799a = this.C) != null) {
            interfaceC0799a.onPress();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setContentText(CharSequence charSequence) {
        this.B.setText(charSequence);
    }

    public void setOnAdsBtnClickListener(View.OnClickListener onClickListener) {
        this.A.setOnClickListener(onClickListener);
    }

    public void setOnBackPressListener(InterfaceC0799a interfaceC0799a) {
        this.C = interfaceC0799a;
    }

    public void setOnCloseBtnClickListener(View.OnClickListener onClickListener) {
        this.x.setOnClickListener(onClickListener);
    }

    public void setOnCopyBtnClickListener(View.OnClickListener onClickListener) {
        this.y.setOnClickListener(onClickListener);
    }

    public void setOnV4BtnClickListener(View.OnClickListener onClickListener) {
        this.z.setOnClickListener(onClickListener);
    }

    private void a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038);
        this.u = layoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 17;
        layoutParams.flags = 131072;
        this.w = true;
        this.t.addView(this, layoutParams);
    }
}
