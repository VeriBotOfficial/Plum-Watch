package com.wakeup.commonui.dialog;

import android.content.Context;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogPaytypeBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayTypeNewDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/wakeup/commonui/dialog/PayTypeNewDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogPaytypeBinding;", "context", "Landroid/content/Context;", "callBack", "Lcom/wakeup/commonui/dialog/PayTypeNewDialog$OnCallBack;", "<init>", "(Landroid/content/Context;Lcom/wakeup/commonui/dialog/PayTypeNewDialog$OnCallBack;)V", "getCallBack", "()Lcom/wakeup/commonui/dialog/PayTypeNewDialog$OnCallBack;", "initViews", "", "showBuyVip", "showBuyDial", "showBuyMenuWallpaper", "OnCallBack", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayTypeNewDialog extends BaseDialog<DialogPaytypeBinding> {
    private final OnCallBack callBack;

    /* compiled from: PayTypeNewDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/wakeup/commonui/dialog/PayTypeNewDialog$OnCallBack;", "", "aliPay", "", "weChatPay", "paypal", "redemptionCode", "stripePay", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCallBack {

        /* compiled from: PayTypeNewDialog.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void aliPay(OnCallBack onCallBack) {
            }

            public static void paypal(OnCallBack onCallBack) {
            }

            public static void redemptionCode(OnCallBack onCallBack) {
            }

            public static void stripePay(OnCallBack onCallBack) {
            }

            public static void weChatPay(OnCallBack onCallBack) {
            }
        }

        void aliPay();

        void paypal();

        void redemptionCode();

        void stripePay();

        void weChatPay();
    }

    public final OnCallBack getCallBack() {
        return this.callBack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTypeNewDialog(Context context, OnCallBack callBack) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.callBack = callBack;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().llAlipay.setVisibility(8);
        getMBinding().llWechat.setVisibility(8);
        getMBinding().llPaypal.setVisibility(0);
        getMBinding().llStripe.setVisibility(0);
        getMBinding().line1.setVisibility(4);
        getMBinding().line2.setVisibility(0);
        getMBinding().llAlipay.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeNewDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeNewDialog.initViews$lambda$0(PayTypeNewDialog.this, view);
            }
        });
        getMBinding().llWechat.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeNewDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeNewDialog.initViews$lambda$1(PayTypeNewDialog.this, view);
            }
        });
        getMBinding().llPaypal.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeNewDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeNewDialog.initViews$lambda$2(PayTypeNewDialog.this, view);
            }
        });
        getMBinding().llStripe.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeNewDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeNewDialog.initViews$lambda$3(PayTypeNewDialog.this, view);
            }
        });
        getMBinding().llRedemptionCode.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.PayTypeNewDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayTypeNewDialog.initViews$lambda$4(PayTypeNewDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(PayTypeNewDialog payTypeNewDialog, View view) {
        payTypeNewDialog.dismiss();
        payTypeNewDialog.callBack.aliPay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(PayTypeNewDialog payTypeNewDialog, View view) {
        payTypeNewDialog.dismiss();
        payTypeNewDialog.callBack.weChatPay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PayTypeNewDialog payTypeNewDialog, View view) {
        payTypeNewDialog.dismiss();
        payTypeNewDialog.callBack.paypal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(PayTypeNewDialog payTypeNewDialog, View view) {
        payTypeNewDialog.dismiss();
        payTypeNewDialog.callBack.stripePay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(PayTypeNewDialog payTypeNewDialog, View view) {
        payTypeNewDialog.dismiss();
        payTypeNewDialog.callBack.redemptionCode();
    }

    public final void showBuyVip() {
        getMBinding().llRedemptionCode.setVisibility(8);
        getMBinding().llStripe.setVisibility(8);
        show();
    }

    public final void showBuyDial() {
        getMBinding().llRedemptionCode.setVisibility(0);
        getMBinding().llStripe.setVisibility(0);
        show();
    }

    public final void showBuyMenuWallpaper() {
        getMBinding().llRedemptionCode.setVisibility(8);
        getMBinding().llStripe.setVisibility(0);
        show();
    }
}
