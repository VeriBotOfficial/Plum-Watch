package com.iflytek.cloud.ui.b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

/* loaded from: classes17.dex */
public class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    protected d f11217a;
    private b b;

    class a implements b {
        a() {
        }

        @Override // com.iflytek.cloud.ui.b.c.b
        public void a() {
            c.this.dismiss();
        }
    }

    public interface b {
        void a();
    }

    public c(Context context) {
        super(context);
        this.f11217a = null;
        this.b = new a();
    }

    public boolean destroy() {
        if (isShowing()) {
            return false;
        }
        boolean b2 = this.f11217a.b();
        this.f11217a = null;
        return b2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f11217a.a();
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f11217a);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // android.app.Dialog
    public void show() {
        setCanceledOnTouchOutside(true);
        this.f11217a.setExitCallBack(this.b);
        this.f11217a.e();
        super.show();
    }
}
