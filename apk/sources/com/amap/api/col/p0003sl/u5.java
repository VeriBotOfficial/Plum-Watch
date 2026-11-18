package com.amap.api.col.p0003sl;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: compiled from: BottomDialogBase.java */
/* JADX INFO: loaded from: classes7.dex */
abstract class u5 extends Dialog {
    public u5(Context context) {
        super(context);
        a();
    }

    protected void a() {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            b();
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                attributes.gravity = 80;
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    protected abstract void b();
}
