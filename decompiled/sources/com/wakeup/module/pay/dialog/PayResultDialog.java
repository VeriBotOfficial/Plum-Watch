package com.wakeup.module.pay.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.pay.databinding.DialogPayResultBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayResultDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/pay/dialog/PayResultDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/pay/databinding/DialogPayResultBinding;", "context", "Landroid/content/Context;", "tip", "", "callback", "Lcom/wakeup/module/pay/dialog/OnPaypalResultDialogCallBack;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/wakeup/module/pay/dialog/OnPaypalResultDialogCallBack;)V", "getTip", "()Ljava/lang/String;", "getCallback", "()Lcom/wakeup/module/pay/dialog/OnPaypalResultDialogCallBack;", "initViews", "", "module-pay_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayResultDialog extends BaseDialog<DialogPayResultBinding> {
    private final OnPaypalResultDialogCallBack callback;
    private final String tip;

    public final String getTip() {
        return this.tip;
    }

    public final OnPaypalResultDialogCallBack getCallback() {
        return this.callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayResultDialog(Context context, String str, OnPaypalResultDialogCallBack callback) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.tip = str;
        this.callback = callback;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        TextView textView = getMBinding().tvContent;
        String str = this.tip;
        if (str == null) {
            str = "Pay Fail";
        }
        textView.setText(str);
        getMBinding().tvOut.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.pay.dialog.PayResultDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultDialog.initViews$lambda$0(PayResultDialog.this, view);
            }
        });
        getMBinding().tvQuery.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.pay.dialog.PayResultDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultDialog.initViews$lambda$1(PayResultDialog.this, view);
            }
        });
        getMBinding().tvRestart.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.pay.dialog.PayResultDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultDialog.initViews$lambda$2(PayResultDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(PayResultDialog payResultDialog, View view) {
        payResultDialog.callback.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(PayResultDialog payResultDialog, View view) {
        payResultDialog.callback.checkPayResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PayResultDialog payResultDialog, View view) {
        payResultDialog.callback.gotoPay();
    }
}
