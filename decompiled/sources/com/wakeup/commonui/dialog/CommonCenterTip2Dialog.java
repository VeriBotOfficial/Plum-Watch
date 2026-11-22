package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCommonBottom2TipBinding;

/* loaded from: classes2.dex */
public class CommonCenterTip2Dialog extends BaseDialog<DialogCommonBottom2TipBinding> {
    private OnCommonBottomTipDialogCallBack callBack;
    private String[] menu;
    private String tip;
    private String title;

    public interface OnCommonBottomTipDialogCallBack {
        void onGreen();

        void onRed();
    }

    public CommonCenterTip2Dialog(Context context, String str, String str2, String[] strArr) {
        super(context, R.style.BaseDialog);
        initData(str, str2, strArr);
    }

    private void initData(String str, String str2, String[] strArr) {
        setCanceledOnTouchOutside(true);
        this.title = str;
        this.tip = str2;
        this.menu = strArr;
        initViews();
        initListener();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        ((DialogCommonBottom2TipBinding) this.mBinding).tvContent.setText(this.tip);
        if (!TextUtils.isEmpty(this.title)) {
            ((DialogCommonBottom2TipBinding) this.mBinding).tvTitle.setVisibility(0);
            ((DialogCommonBottom2TipBinding) this.mBinding).tvTitle.setText(this.title);
        } else {
            ((DialogCommonBottom2TipBinding) this.mBinding).tvTitle.setVisibility(8);
        }
        String[] strArr = this.menu;
        if (strArr != null) {
            if (strArr.length == 1) {
                ((DialogCommonBottom2TipBinding) this.mBinding).btnRight.setText(this.menu[0]);
                ((DialogCommonBottom2TipBinding) this.mBinding).btnLeft.setVisibility(8);
            } else if (strArr.length == 2) {
                ((DialogCommonBottom2TipBinding) this.mBinding).btnLeft.setText(this.menu[0]);
                ((DialogCommonBottom2TipBinding) this.mBinding).btnRight.setText(this.menu[1]);
                ((DialogCommonBottom2TipBinding) this.mBinding).btnLeft.setVisibility(0);
                ((DialogCommonBottom2TipBinding) this.mBinding).btnRight.setVisibility(0);
            }
        }
    }

    protected void initListener() {
        ((DialogCommonBottom2TipBinding) this.mBinding).btnLeft.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonCenterTip2Dialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCenterTip2Dialog.this.lambda$initListener$0(view);
            }
        });
        ((DialogCommonBottom2TipBinding) this.mBinding).btnRight.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonCenterTip2Dialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCenterTip2Dialog.this.lambda$initListener$1(view);
            }
        });
        ((DialogCommonBottom2TipBinding) this.mBinding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonCenterTip2Dialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCenterTip2Dialog.this.lambda$initListener$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        dismiss();
        OnCommonBottomTipDialogCallBack onCommonBottomTipDialogCallBack = this.callBack;
        if (onCommonBottomTipDialogCallBack != null) {
            onCommonBottomTipDialogCallBack.onRed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        dismiss();
        OnCommonBottomTipDialogCallBack onCommonBottomTipDialogCallBack = this.callBack;
        if (onCommonBottomTipDialogCallBack != null) {
            onCommonBottomTipDialogCallBack.onGreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        dismiss();
        OnCommonBottomTipDialogCallBack onCommonBottomTipDialogCallBack = this.callBack;
        if (onCommonBottomTipDialogCallBack != null) {
            onCommonBottomTipDialogCallBack.onRed();
        }
    }

    public void setCallBack(OnCommonBottomTipDialogCallBack onCommonBottomTipDialogCallBack) {
        this.callBack = onCommonBottomTipDialogCallBack;
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
