package com.wakeup.commonui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCommonTipBinding;
import com.wakeup.commonui.utils.ActivityUtils;

/* loaded from: classes2.dex */
public class CommonTipDialog extends BaseDialog<DialogCommonTipBinding> {
    private static CommonTipDialog instance;
    private OnCommonTipDialogCallBack callBack;
    private int[] color;
    private String[] menu;
    private String tip;
    private String title;

    public interface OnCommonTipDialogCallBack {
        default void onFail() {
        }

        void onSuccess();
    }

    public CommonTipDialog(Context context, String str, String str2, String[] strArr) {
        super(context, R.style.BaseDialog);
        this.color = null;
        initData(str, str2, strArr, null);
    }

    public CommonTipDialog(Context context, String str, String str2, String[] strArr, int[] iArr) {
        super(context, R.style.BaseDialog);
        this.color = null;
        initData(str, str2, strArr, iArr);
    }

    public static synchronized void showPermissionsTip(Context context, OnCommonTipDialogCallBack onCommonTipDialogCallBack) {
        synchronized (CommonTipDialog.class) {
            if (ActivityUtils.assertValidRequest(context)) {
                try {
                    CommonTipDialog commonTipDialog = instance;
                    if (commonTipDialog != null) {
                        commonTipDialog.dismiss();
                    }
                } catch (Exception unused) {
                }
                CommonTipDialog commonTipDialog2 = new CommonTipDialog(context, "", context.getString(R.string.tip37), new String[]{context.getString(R.string.tip38)});
                instance = commonTipDialog2;
                commonTipDialog2.setCallBack(onCommonTipDialogCallBack);
                instance.show();
            }
        }
    }

    public static synchronized void showPermissionsTip(Context context, OnCommonTipDialogCallBack onCommonTipDialogCallBack, String str) {
        synchronized (CommonTipDialog.class) {
            CommonTipDialog commonTipDialog = instance;
            if (commonTipDialog != null) {
                commonTipDialog.dismiss();
            }
            CommonTipDialog commonTipDialog2 = new CommonTipDialog(context, "", str, new String[]{context.getString(R.string.tip38)});
            instance = commonTipDialog2;
            commonTipDialog2.setCallBack(onCommonTipDialogCallBack);
            instance.show();
        }
    }

    private void initData(String str, String str2, String[] strArr, int[] iArr) {
        setCanceledOnTouchOutside(true);
        this.title = str;
        this.tip = str2;
        this.menu = strArr;
        this.color = iArr;
        initViews();
        initListener();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        ((DialogCommonTipBinding) this.mBinding).tvContent.setText(this.tip);
        if (!TextUtils.isEmpty(this.title)) {
            ((DialogCommonTipBinding) this.mBinding).rlTitle.setVisibility(0);
            ((DialogCommonTipBinding) this.mBinding).tvTitle.setText(this.title);
        } else {
            ((DialogCommonTipBinding) this.mBinding).rlTitle.setVisibility(8);
        }
        String[] strArr = this.menu;
        if (strArr != null) {
            if (strArr.length == 1) {
                ((DialogCommonTipBinding) this.mBinding).tvBlue.setText(this.menu[0]);
                ((DialogCommonTipBinding) this.mBinding).tvRed.setVisibility(8);
            } else if (strArr.length == 2) {
                ((DialogCommonTipBinding) this.mBinding).tvRed.setText(this.menu[0]);
                ((DialogCommonTipBinding) this.mBinding).tvBlue.setText(this.menu[1]);
                ((DialogCommonTipBinding) this.mBinding).tvRed.setVisibility(0);
            }
        }
        int[] iArr = this.color;
        if (iArr == null || iArr.length != 2) {
            return;
        }
        ((DialogCommonTipBinding) this.mBinding).tvRed.setTextColor(getContext().getResources().getColor(this.color[0]));
        ((DialogCommonTipBinding) this.mBinding).tvBlue.setTextColor(getContext().getResources().getColor(this.color[1]));
    }

    protected void initListener() {
        ((DialogCommonTipBinding) this.mBinding).tvRed.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonTipDialog.this.lambda$initListener$0(view);
            }
        });
        ((DialogCommonTipBinding) this.mBinding).tvBlue.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.CommonTipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonTipDialog.this.lambda$initListener$1(view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.wakeup.commonui.dialog.CommonTipDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LogUtils.i("zhaoyang", "消息通知关闭消息了");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        dismiss();
        OnCommonTipDialogCallBack onCommonTipDialogCallBack = this.callBack;
        if (onCommonTipDialogCallBack != null) {
            onCommonTipDialogCallBack.onFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        dismiss();
        OnCommonTipDialogCallBack onCommonTipDialogCallBack = this.callBack;
        if (onCommonTipDialogCallBack != null) {
            onCommonTipDialogCallBack.onSuccess();
        }
    }

    public void setCallBack(OnCommonTipDialogCallBack onCommonTipDialogCallBack) {
        this.callBack = onCommonTipDialogCallBack;
    }
}
