package com.wakeup.feature.course.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.blankj.utilcode.util.SizeUtils;
import com.wakeup.commonui.R;
import com.wakeup.feature.course.databinding.DialogPlanTipBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlanTipDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB9\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\u000eB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/course/dialog/PlanTipDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "ivTip", "", "tip", "", "cancelText", "sureText", "callBack", "Lcom/wakeup/feature/course/dialog/PlanTipDialog$OnPlanTipCallBack;", "<init>", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/feature/course/dialog/PlanTipDialog$OnPlanTipCallBack;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/feature/course/dialog/PlanTipDialog$OnPlanTipCallBack;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/feature/course/dialog/PlanTipDialog$OnPlanTipCallBack;)V", "mBinding", "Lcom/wakeup/feature/course/databinding/DialogPlanTipBinding;", "setTipIv", "", "id", "initData", Constants.ON_START_KEY, "setWindow", "getDialogWidth", "OnPlanTipCallBack", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlanTipDialog extends Dialog {
    private final OnPlanTipCallBack callBack;
    private final String cancelText;
    private int ivTip;
    private DialogPlanTipBinding mBinding;
    private final String sureText;
    private final String tip;

    /* compiled from: PlanTipDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/course/dialog/PlanTipDialog$OnPlanTipCallBack;", "", "onCancel", "", "onSure", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPlanTipCallBack {

        /* compiled from: PlanTipDialog.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onCancel(OnPlanTipCallBack onPlanTipCallBack) {
            }
        }

        void onCancel();

        void onSure();
    }

    public /* synthetic */ PlanTipDialog(Context context, int i, String str, String str2, String str3, OnPlanTipCallBack onPlanTipCallBack, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? -1 : i, str, str2, str3, onPlanTipCallBack);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanTipDialog(Context context, int i, String str, String str2, String str3, OnPlanTipCallBack onPlanTipCallBack) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ivTip = i;
        this.tip = str;
        this.cancelText = str2;
        this.sureText = str3;
        this.callBack = onPlanTipCallBack;
        initData();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanTipDialog(Context context, String str, String str2, String str3, OnPlanTipCallBack onPlanTipCallBack) {
        this(context, -1, str, str2, str3, onPlanTipCallBack);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlanTipDialog(Context context, String str, String str2, OnPlanTipCallBack onPlanTipCallBack) {
        this(context, -1, str, null, str2, onPlanTipCallBack);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setTipIv(int id2) {
        DialogPlanTipBinding dialogPlanTipBinding = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding);
        dialogPlanTipBinding.ivTip.setImageResource(id2);
    }

    private final void initData() {
        setCanceledOnTouchOutside(true);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        DialogPlanTipBinding inflate = DialogPlanTipBinding.inflate(getLayoutInflater());
        this.mBinding = inflate;
        Intrinsics.checkNotNull(inflate);
        setContentView(inflate.getRoot());
        int i = this.ivTip;
        if (i != -1) {
            setTipIv(i);
        }
        DialogPlanTipBinding dialogPlanTipBinding = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding);
        dialogPlanTipBinding.tvContent.setText(this.tip);
        DialogPlanTipBinding dialogPlanTipBinding2 = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding2);
        dialogPlanTipBinding2.tvSure.setVisibility(TextUtils.isEmpty(this.sureText) ? 8 : 0);
        if (!TextUtils.isEmpty(this.sureText)) {
            DialogPlanTipBinding dialogPlanTipBinding3 = this.mBinding;
            Intrinsics.checkNotNull(dialogPlanTipBinding3);
            dialogPlanTipBinding3.tvSure.setText(this.sureText);
        }
        DialogPlanTipBinding dialogPlanTipBinding4 = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding4);
        dialogPlanTipBinding4.tvCancel.setVisibility(TextUtils.isEmpty(this.cancelText) ? 8 : 0);
        if (!TextUtils.isEmpty(this.cancelText)) {
            DialogPlanTipBinding dialogPlanTipBinding5 = this.mBinding;
            Intrinsics.checkNotNull(dialogPlanTipBinding5);
            dialogPlanTipBinding5.tvCancel.setText(this.cancelText);
        }
        DialogPlanTipBinding dialogPlanTipBinding6 = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding6);
        dialogPlanTipBinding6.tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.course.dialog.PlanTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanTipDialog.initData$lambda$0(PlanTipDialog.this, view);
            }
        });
        DialogPlanTipBinding dialogPlanTipBinding7 = this.mBinding;
        Intrinsics.checkNotNull(dialogPlanTipBinding7);
        dialogPlanTipBinding7.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.course.dialog.PlanTipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanTipDialog.initData$lambda$1(PlanTipDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$0(PlanTipDialog planTipDialog, View view) {
        planTipDialog.dismiss();
        OnPlanTipCallBack onPlanTipCallBack = planTipDialog.callBack;
        if (onPlanTipCallBack != null) {
            onPlanTipCallBack.onSure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(PlanTipDialog planTipDialog, View view) {
        planTipDialog.dismiss();
        OnPlanTipCallBack onPlanTipCallBack = planTipDialog.callBack;
        if (onPlanTipCallBack != null) {
            onPlanTipCallBack.onCancel();
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        setWindow();
    }

    private final void setWindow() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.getDecorView().setPadding(60, 0, 60, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getDialogWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    private final int getDialogWidth() {
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        return SizeUtils.dp2px(320.0f);
    }
}
