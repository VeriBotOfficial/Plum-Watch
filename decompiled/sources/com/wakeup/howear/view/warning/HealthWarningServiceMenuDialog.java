package com.wakeup.howear.view.warning;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.howear.databinding.DialogHealthwarningservicemenuBinding;
import com.wakeup.howear.view.warning.HealthWarningServiceMenuDialog;

/* loaded from: classes4.dex */
public class HealthWarningServiceMenuDialog extends BaseDialog<DialogHealthwarningservicemenuBinding> {
    private static HealthWarningServiceMenuDialog instance;

    public interface OnHealthWarningServiceDialogCallBack {
        void onClickAboutService();

        void onClickCloseService();

        void onClickModifyContact();

        void onClickOpenService();
    }

    public static synchronized void showMenuDialog(Context context, int i, OnHealthWarningServiceDialogCallBack onHealthWarningServiceDialogCallBack) {
        synchronized (HealthWarningServiceMenuDialog.class) {
            dismissMenuDialog();
            HealthWarningServiceMenuDialog healthWarningServiceMenuDialog = new HealthWarningServiceMenuDialog(context, i, onHealthWarningServiceDialogCallBack);
            instance = healthWarningServiceMenuDialog;
            healthWarningServiceMenuDialog.show();
        }
    }

    public static synchronized void dismissMenuDialog() {
        synchronized (HealthWarningServiceMenuDialog.class) {
            try {
                HealthWarningServiceMenuDialog healthWarningServiceMenuDialog = instance;
                if (healthWarningServiceMenuDialog != null && healthWarningServiceMenuDialog.isShowing()) {
                    instance.dismiss();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                instance = null;
                throw th;
            }
            instance = null;
        }
    }

    public HealthWarningServiceMenuDialog(Context context, final int i, final OnHealthWarningServiceDialogCallBack onHealthWarningServiceDialogCallBack) {
        super(context, R.style.BaseDialog2);
        ((DialogHealthwarningservicemenuBinding) this.mBinding).tv1.setText(StringUtils.getString(R.string.tip_21_0721_10));
        ((DialogHealthwarningservicemenuBinding) this.mBinding).tv2.setText(StringUtils.getString(R.string.tip_21_0721_11));
        if (i != 0) {
            ((DialogHealthwarningservicemenuBinding) this.mBinding).tv3.setText(StringUtils.getString(R.string.tip_21_0721_12));
        } else {
            ((DialogHealthwarningservicemenuBinding) this.mBinding).tv3.setText(StringUtils.getString(R.string.tip_21_0727_02));
        }
        ((DialogHealthwarningservicemenuBinding) this.mBinding).rlMain.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningServiceMenuDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningServiceMenuDialog.dismissMenuDialog();
            }
        });
        ((DialogHealthwarningservicemenuBinding) this.mBinding).llModifyContact.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningServiceMenuDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningServiceMenuDialog.lambda$new$1(HealthWarningServiceMenuDialog.OnHealthWarningServiceDialogCallBack.this, view);
            }
        });
        ((DialogHealthwarningservicemenuBinding) this.mBinding).llAboutService.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningServiceMenuDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningServiceMenuDialog.lambda$new$2(HealthWarningServiceMenuDialog.OnHealthWarningServiceDialogCallBack.this, view);
            }
        });
        ((DialogHealthwarningservicemenuBinding) this.mBinding).llCloseService.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningServiceMenuDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningServiceMenuDialog.lambda$new$3(i, onHealthWarningServiceDialogCallBack, view);
            }
        });
    }

    static /* synthetic */ void lambda$new$1(OnHealthWarningServiceDialogCallBack onHealthWarningServiceDialogCallBack, View view) {
        onHealthWarningServiceDialogCallBack.onClickModifyContact();
        dismissMenuDialog();
    }

    static /* synthetic */ void lambda$new$2(OnHealthWarningServiceDialogCallBack onHealthWarningServiceDialogCallBack, View view) {
        onHealthWarningServiceDialogCallBack.onClickAboutService();
        dismissMenuDialog();
    }

    static /* synthetic */ void lambda$new$3(int i, OnHealthWarningServiceDialogCallBack onHealthWarningServiceDialogCallBack, View view) {
        if (i != 0) {
            onHealthWarningServiceDialogCallBack.onClickCloseService();
        } else {
            onHealthWarningServiceDialogCallBack.onClickOpenService();
        }
        dismissMenuDialog();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(48);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
