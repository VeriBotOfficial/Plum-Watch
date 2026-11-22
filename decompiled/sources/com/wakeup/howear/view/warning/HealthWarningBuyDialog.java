package com.wakeup.howear.view.warning;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.common.network.entity.healthwarning.GuardianPackagePriceModel;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.howear.databinding.DialogHealthwarningbuyBinding;
import com.wakeup.howear.view.warning.HealthWarningBuyDialog;

/* loaded from: classes4.dex */
public class HealthWarningBuyDialog extends BaseDialog<DialogHealthwarningbuyBinding> {
    private static HealthWarningBuyDialog instance;
    private final boolean isVip;
    private final Context mContext;

    public interface OnHealthWarningBuyDialogCallBack {
        void onClickCloseDialog();

        void onClickGeneralToBuyIt();

        void onClickVIPToBuyIt();
    }

    public static synchronized void showHealthWarningBuyDialog(Context context, GuardianPackagePriceModel guardianPackagePriceModel, OnHealthWarningBuyDialogCallBack onHealthWarningBuyDialogCallBack) {
        synchronized (HealthWarningBuyDialog.class) {
            dismissMenuDialog();
            HealthWarningBuyDialog healthWarningBuyDialog = new HealthWarningBuyDialog(context, guardianPackagePriceModel, onHealthWarningBuyDialogCallBack);
            instance = healthWarningBuyDialog;
            healthWarningBuyDialog.show();
        }
    }

    public static synchronized void dismissMenuDialog() {
        synchronized (HealthWarningBuyDialog.class) {
            try {
                HealthWarningBuyDialog healthWarningBuyDialog = instance;
                if (healthWarningBuyDialog != null && healthWarningBuyDialog.isShowing()) {
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

    private void showVip() {
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay.setVisibility(0);
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay1.setVisibility(8);
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount.setTextColor(this.mContext.getResources().getColor(R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setTextColor(this.mContext.getResources().getColor(R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setBackground(this.mContext.getDrawable(com.wakeup.howear.R.drawable.shape_transp_line_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount1.setTextColor(this.mContext.getResources().getColor(R.color.color_ff595959));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setTextColor(this.mContext.getResources().getColor(R.color.color_ff5e5e5e));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setBackground(this.mContext.getDrawable(com.wakeup.howear.R.drawable.shape_transp_line_cdcdcd));
    }

    private void showGeneral() {
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay1.setVisibility(0);
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay.setVisibility(8);
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount.setTextColor(this.mContext.getResources().getColor(R.color.color_ff595959));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setTextColor(this.mContext.getResources().getColor(R.color.color_ff5e5e5e));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setBackground(this.mContext.getDrawable(com.wakeup.howear.R.drawable.shape_transp_line_cdcdcd));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount1.setTextColor(this.mContext.getResources().getColor(R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setTextColor(this.mContext.getResources().getColor(R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setBackground(this.mContext.getDrawable(com.wakeup.howear.R.drawable.shape_transp_line_407bff));
    }

    public HealthWarningBuyDialog(Context context, GuardianPackagePriceModel guardianPackagePriceModel, final OnHealthWarningBuyDialogCallBack onHealthWarningBuyDialogCallBack) {
        super(context, R.style.BaseDialog);
        this.mContext = context;
        boolean isVip = UserDao.isVip();
        this.isVip = isVip;
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay.setVisibility(isVip ? 0 : 8);
        ((DialogHealthwarningbuyBinding) this.mBinding).ivSelectPay1.setVisibility(isVip ? 8 : 0);
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount.setTextColor(context.getResources().getColor(isVip ? R.color.color_407bff : R.color.color_ff595959));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount1.setTextColor(context.getResources().getColor(isVip ? R.color.color_ff595959 : R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setTextColor(context.getResources().getColor(isVip ? R.color.color_407bff : R.color.color_ff5e5e5e));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setTextColor(context.getResources().getColor(isVip ? R.color.color_ff5e5e5e : R.color.color_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setBackground(context.getDrawable(isVip ? com.wakeup.howear.R.drawable.shape_transp_line_407bff : com.wakeup.howear.R.drawable.shape_transp_line_cdcdcd));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setBackground(context.getDrawable(isVip ? com.wakeup.howear.R.drawable.shape_transp_line_cdcdcd : com.wakeup.howear.R.drawable.shape_transp_line_407bff));
        ((DialogHealthwarningbuyBinding) this.mBinding).tv1.setText(StringUtils.getString(R.string.tip_21_0722_01));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvVipUser.setText(StringUtils.getString(R.string.tip_21_0721_13));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvFrequency.setText(guardianPackagePriceModel.getGuardNumbers() + StringUtils.getString(R.string.tip_21_0721_04));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvGeneralUser.setText(StringUtils.getString(R.string.tip_21_0721_14));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvFrequency1.setText(guardianPackagePriceModel.getGuardNumbers() + StringUtils.getString(R.string.tip_21_0721_04));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvFrequency.setText(guardianPackagePriceModel.getGuardNumbers() + StringUtils.getString(R.string.tip_21_0721_04));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount.setText("$" + guardianPackagePriceModel.getAndroidMembersPriceEn());
        ((DialogHealthwarningbuyBinding) this.mBinding).tvAmount1.setText("$" + guardianPackagePriceModel.getAndroidPriceEn());
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setText(StringUtils.getString(R.string.tip_21_0721_15));
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setText(StringUtils.getString(R.string.tip_21_0721_15));
        ((DialogHealthwarningbuyBinding) this.mBinding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningBuyDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningBuyDialog.OnHealthWarningBuyDialogCallBack.this.onClickCloseDialog();
            }
        });
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningBuyDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningBuyDialog.this.lambda$new$1(onHealthWarningBuyDialogCallBack, view);
            }
        });
        ((DialogHealthwarningbuyBinding) this.mBinding).tvBuyNow1.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningBuyDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningBuyDialog.this.lambda$new$2(onHealthWarningBuyDialogCallBack, view);
            }
        });
        ((DialogHealthwarningbuyBinding) this.mBinding).rlVip.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningBuyDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningBuyDialog.this.lambda$new$3(view);
            }
        });
        ((DialogHealthwarningbuyBinding) this.mBinding).rlGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.warning.HealthWarningBuyDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthWarningBuyDialog.this.lambda$new$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(OnHealthWarningBuyDialogCallBack onHealthWarningBuyDialogCallBack, View view) {
        showVip();
        onHealthWarningBuyDialogCallBack.onClickVIPToBuyIt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(OnHealthWarningBuyDialogCallBack onHealthWarningBuyDialogCallBack, View view) {
        showGeneral();
        onHealthWarningBuyDialogCallBack.onClickGeneralToBuyIt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(View view) {
        showVip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        showGeneral();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
