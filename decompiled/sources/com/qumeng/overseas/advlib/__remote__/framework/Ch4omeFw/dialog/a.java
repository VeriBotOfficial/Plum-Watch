package com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes17.dex */
public class a extends Dialog {
    public a(Context context) {
        super(context);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public a(Context context, int i) {
        super(context, i);
    }

    protected a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
