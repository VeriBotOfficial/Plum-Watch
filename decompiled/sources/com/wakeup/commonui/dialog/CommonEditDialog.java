package com.wakeup.commonui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCommonEditBinding;

/* loaded from: classes2.dex */
public class CommonEditDialog extends BaseDialog<DialogCommonEditBinding> {
    private OnCommonEditDialogCallBack callBack;
    private int[] color;
    private String hint;
    private String[] menu;
    private String title;

    public interface OnCommonEditDialogCallBack {
        void onCancel();

        void onConfirm(String str);
    }

    public CommonEditDialog(Context context, String str, String str2, String[] strArr) {
        super(context, R.style.BaseDialog);
        this.color = null;
        initData(str, str2, strArr, null);
    }

    private void initData(String str, String str2, String[] strArr, int[] iArr) {
        setCanceledOnTouchOutside(true);
        this.title = str;
        this.hint = str2;
        this.menu = strArr;
        this.color = iArr;
        initViews();
        initListener();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        ((DialogCommonEditBinding) this.mBinding).etContent.setHint(this.hint);
        if (!TextUtils.isEmpty(this.title)) {
            ((DialogCommonEditBinding) this.mBinding).rlTitle.setVisibility(0);
            ((DialogCommonEditBinding) this.mBinding).tvTitle.setText(this.title);
        } else {
            ((DialogCommonEditBinding) this.mBinding).rlTitle.setVisibility(8);
        }
        String[] strArr = this.menu;
        if (strArr != null) {
            if (strArr.length == 1) {
                ((DialogCommonEditBinding) this.mBinding).tvConfirm.setText(this.menu[0]);
                ((DialogCommonEditBinding) this.mBinding).tvCancel.setVisibility(8);
            } else if (strArr.length == 2) {
                ((DialogCommonEditBinding) this.mBinding).tvCancel.setText(this.menu[0]);
                ((DialogCommonEditBinding) this.mBinding).tvConfirm.setText(this.menu[1]);
                ((DialogCommonEditBinding) this.mBinding).tvCancel.setVisibility(0);
            }
        } else {
            ((DialogCommonEditBinding) this.mBinding).tvCancel.setText(StringUtils.getString(R.string.dialog_quxiao));
            ((DialogCommonEditBinding) this.mBinding).tvConfirm.setText(StringUtils.getString(R.string.dialog_queding));
        }
        int[] iArr = this.color;
        if (iArr == null || iArr.length != 2) {
            return;
        }
        ((DialogCommonEditBinding) this.mBinding).tvCancel.setTextColor(getContext().getResources().getColor(this.color[0]));
        ((DialogCommonEditBinding) this.mBinding).tvConfirm.setTextColor(getContext().getResources().getColor(this.color[1]));
    }

    protected void initListener() {
        ((DialogCommonEditBinding) this.mBinding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonEditDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonEditDialog.this.lambda$initListener$0(view);
            }
        });
        ((DialogCommonEditBinding) this.mBinding).tvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonEditDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonEditDialog.this.lambda$initListener$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        dismiss();
        OnCommonEditDialogCallBack onCommonEditDialogCallBack = this.callBack;
        if (onCommonEditDialogCallBack != null) {
            onCommonEditDialogCallBack.onCancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        dismiss();
        OnCommonEditDialogCallBack onCommonEditDialogCallBack = this.callBack;
        if (onCommonEditDialogCallBack != null) {
            onCommonEditDialogCallBack.onConfirm(((DialogCommonEditBinding) this.mBinding).etContent.getText().toString());
        }
    }

    public void setCallBack(OnCommonEditDialogCallBack onCommonEditDialogCallBack) {
        this.callBack = onCommonEditDialogCallBack;
    }
}
