package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCommonBottomTipBinding;

/* loaded from: classes2.dex */
public class CommonCenterTipDialog extends BaseDialog<DialogCommonBottomTipBinding> {
    private OnCommonBottomTipDialogCallBack callBack;
    private String[] menu;
    private String tip;
    private String title;

    public interface OnCommonBottomTipDialogCallBack {
        void onGreen();

        void onRed();
    }

    public CommonCenterTipDialog(Context context, String str, String str2, String[] strArr) {
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
        ((DialogCommonBottomTipBinding) this.mBinding).tvContent.setText(this.tip);
        if (!TextUtils.isEmpty(this.title)) {
            ((DialogCommonBottomTipBinding) this.mBinding).tvTitle.setVisibility(0);
            ((DialogCommonBottomTipBinding) this.mBinding).tvTitle.setText(this.title);
        } else {
            ((DialogCommonBottomTipBinding) this.mBinding).tvTitle.setVisibility(8);
        }
        String[] strArr = this.menu;
        if (strArr != null) {
            if (strArr.length == 1) {
                ((DialogCommonBottomTipBinding) this.mBinding).btnRight.setText(this.menu[0]);
                ((DialogCommonBottomTipBinding) this.mBinding).btnLeft.setVisibility(8);
                ((DialogCommonBottomTipBinding) this.mBinding).space.setVisibility(8);
            } else if (strArr.length == 2) {
                ((DialogCommonBottomTipBinding) this.mBinding).btnLeft.setText(this.menu[0]);
                ((DialogCommonBottomTipBinding) this.mBinding).btnRight.setText(this.menu[1]);
                ((DialogCommonBottomTipBinding) this.mBinding).btnLeft.setVisibility(0);
                ((DialogCommonBottomTipBinding) this.mBinding).btnRight.setVisibility(0);
            }
        }
    }

    protected void initListener() {
        ((DialogCommonBottomTipBinding) this.mBinding).btnLeft.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonCenterTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCenterTipDialog.this.lambda$initListener$0(view);
            }
        });
        ((DialogCommonBottomTipBinding) this.mBinding).btnRight.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonCenterTipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCenterTipDialog.this.lambda$initListener$1(view);
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
