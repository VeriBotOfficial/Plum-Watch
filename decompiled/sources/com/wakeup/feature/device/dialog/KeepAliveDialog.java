package com.wakeup.feature.device.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.device.databinding.DialogKeepAliveBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeepAliveDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/device/dialog/KeepAliveDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/device/databinding/DialogKeepAliveBinding;", "context", "Landroid/content/Context;", "confirmClick", "Landroid/view/View$OnClickListener;", "<init>", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)V", "initViews", "", Constants.ON_START_KEY, "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeepAliveDialog extends BaseDialog<DialogKeepAliveBinding> {
    private final View.OnClickListener confirmClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepAliveDialog(Context context, View.OnClickListener confirmClick) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        this.confirmClick = confirmClick;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.KeepAliveDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepAliveDialog.initViews$lambda$0(KeepAliveDialog.this, view);
            }
        });
        getMBinding().btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.KeepAliveDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepAliveDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(KeepAliveDialog keepAliveDialog, View view) {
        keepAliveDialog.confirmClick.onClick(view);
        keepAliveDialog.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(80);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
