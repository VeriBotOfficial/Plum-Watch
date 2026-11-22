package com.wakeup.howear.view.dialog;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.howear.databinding.DialogBecomeVipBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeComeVipDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/view/dialog/BeComeVipDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/howear/databinding/DialogBecomeVipBinding;", "context", "Landroid/content/Context;", "callback", "Lcom/wakeup/howear/view/dialog/BeComeVipDialog$OnCallBack;", "<init>", "(Landroid/content/Context;Lcom/wakeup/howear/view/dialog/BeComeVipDialog$OnCallBack;)V", "getCallback", "()Lcom/wakeup/howear/view/dialog/BeComeVipDialog$OnCallBack;", "initViews", "", Constants.ON_START_KEY, "createLinearGradient", "tv", "Landroid/widget/TextView;", "OnCallBack", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BeComeVipDialog extends BaseDialog<DialogBecomeVipBinding> {
    private final OnCallBack callback;

    /* compiled from: BeComeVipDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/wakeup/howear/view/dialog/BeComeVipDialog$OnCallBack;", "", "dismissDialog", "", "btnDialog", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCallBack {

        /* compiled from: BeComeVipDialog.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void btnDialog(OnCallBack onCallBack) {
            }

            public static void dismissDialog(OnCallBack onCallBack) {
            }
        }

        void btnDialog();

        void dismissDialog();
    }

    public final OnCallBack getCallback() {
        return this.callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeComeVipDialog(Context context, OnCallBack callback) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        TextView tvVipDesc = getMBinding().tvVipDesc;
        Intrinsics.checkNotNullExpressionValue(tvVipDesc, "tvVipDesc");
        createLinearGradient(tvVipDesc);
        setCancelable(false);
        getMBinding().ivVipClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.dialog.BeComeVipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeComeVipDialog.initViews$lambda$0(BeComeVipDialog.this, view);
            }
        });
        getMBinding().llBtn.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.view.dialog.BeComeVipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeComeVipDialog.initViews$lambda$1(BeComeVipDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(BeComeVipDialog beComeVipDialog, View view) {
        beComeVipDialog.dismiss();
        beComeVipDialog.callback.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(BeComeVipDialog beComeVipDialog, View view) {
        beComeVipDialog.callback.btnDialog();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(17);
        window.setWindowAnimations(0);
        window.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        window.setLayout((int) (r2.widthPixels * 0.9d), window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    private final void createLinearGradient(TextView tv2) {
        tv2.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, tv2.getTextSize(), new int[]{ContextCompat.getColor(getMContext(), R.color.color_B28C5A), ContextCompat.getColor(getMContext(), R.color.color_764C33)}, (float[]) null, Shader.TileMode.CLAMP));
        tv2.invalidate();
    }
}
