package com.wakeup.commonui.dialog;

import android.content.Context;
import android.view.View;
import com.wakeup.common.network.entity.device.DialModel;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogPaytypeBinding;

/* loaded from: classes2.dex */
public class PayTypeDialog extends BaseDialog<DialogPaytypeBinding> {

    public interface OnPayTypeDialogCallBack {
        void aliPay(DialModel dialModel);

        void paypal(DialModel dialModel);

        void redemptionCode(DialModel dialModel);

        default void stripePay(DialModel dialModel) {
        }

        void weChatPay(DialModel dialModel);
    }

    public PayTypeDialog(Context context, final DialModel dialModel, final OnPayTypeDialogCallBack onPayTypeDialogCallBack) {
        super(context, R.style.BaseDialog);
        ((DialogPaytypeBinding) this.mBinding).line1.setVisibility(4);
        ((DialogPaytypeBinding) this.mBinding).line2.setVisibility(0);
        ((DialogPaytypeBinding) this.mBinding).llAlipay.setVisibility(8);
        ((DialogPaytypeBinding) this.mBinding).llWechat.setVisibility(8);
        ((DialogPaytypeBinding) this.mBinding).llPaypal.setVisibility(0);
        ((DialogPaytypeBinding) this.mBinding).llStripe.setVisibility(0);
        if (dialModel == null) {
            ((DialogPaytypeBinding) this.mBinding).llRedemptionCode.setVisibility(8);
            ((DialogPaytypeBinding) this.mBinding).llStripe.setVisibility(8);
        }
        ((DialogPaytypeBinding) this.mBinding).llAlipay.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeDialog.this.lambda$new$0(onPayTypeDialogCallBack, dialModel, view);
            }
        });
        ((DialogPaytypeBinding) this.mBinding).llWechat.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeDialog.this.lambda$new$1(onPayTypeDialogCallBack, dialModel, view);
            }
        });
        ((DialogPaytypeBinding) this.mBinding).llPaypal.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeDialog.this.lambda$new$2(onPayTypeDialogCallBack, dialModel, view);
            }
        });
        ((DialogPaytypeBinding) this.mBinding).llStripe.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeDialog.this.lambda$new$3(onPayTypeDialogCallBack, dialModel, view);
            }
        });
        ((DialogPaytypeBinding) this.mBinding).llRedemptionCode.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeDialog.this.lambda$new$4(onPayTypeDialogCallBack, dialModel, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(OnPayTypeDialogCallBack onPayTypeDialogCallBack, DialModel dialModel, View view) {
        dismiss();
        onPayTypeDialogCallBack.aliPay(dialModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(OnPayTypeDialogCallBack onPayTypeDialogCallBack, DialModel dialModel, View view) {
        dismiss();
        onPayTypeDialogCallBack.weChatPay(dialModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(OnPayTypeDialogCallBack onPayTypeDialogCallBack, DialModel dialModel, View view) {
        dismiss();
        onPayTypeDialogCallBack.paypal(dialModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(OnPayTypeDialogCallBack onPayTypeDialogCallBack, DialModel dialModel, View view) {
        dismiss();
        onPayTypeDialogCallBack.stripePay(dialModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(OnPayTypeDialogCallBack onPayTypeDialogCallBack, DialModel dialModel, View view) {
        dismiss();
        onPayTypeDialogCallBack.redemptionCode(dialModel);
    }
}
