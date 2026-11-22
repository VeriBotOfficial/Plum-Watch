package com.iflytek.cloud.ui;

import android.content.Context;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.resource.Resource;
import com.iflytek.cloud.ui.b.c;
import java.util.Locale;

/* loaded from: classes17.dex */
public class RecognizerDialog extends c {
    public RecognizerDialog(Context context, InitListener initListener) {
        super(context);
        this.f11217a = new a(context, initListener);
    }

    @Override // com.iflytek.cloud.ui.b.c, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    public void setListener(RecognizerDialogListener recognizerDialogListener) {
        ((a) this.f11217a).setResultListener(recognizerDialogListener);
    }

    public void setParameter(String str, String str2) {
        ((a) this.f11217a).a(str, str2);
    }

    public void setUILanguage(Locale locale) {
        Resource.setUILanguage(locale);
    }

    @Override // com.iflytek.cloud.ui.b.c, android.app.Dialog
    public void show() {
        super.show();
    }
}
