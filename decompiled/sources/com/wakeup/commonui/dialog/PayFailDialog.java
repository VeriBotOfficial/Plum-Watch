package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.databinding.DialogPayfailBinding;

/* loaded from: classes2.dex */
public class PayFailDialog extends BaseDialog<DialogPayfailBinding> {
    private final OnPayFailCallBack callBack;

    public interface OnPayFailCallBack {
        void toSeeOrder();
    }

    public PayFailDialog(Context context, OnPayFailCallBack onPayFailCallBack) {
        super(context, 0);
        this.callBack = onPayFailCallBack;
        ((DialogPayfailBinding) this.mBinding).tvToSeeOrder.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayFailDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayFailDialog.this.lambda$new$0(view);
            }
        });
        ((DialogPayfailBinding) this.mBinding).imClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayFailDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayFailDialog.this.lambda$new$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        this.callBack.toSeeOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(17);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
