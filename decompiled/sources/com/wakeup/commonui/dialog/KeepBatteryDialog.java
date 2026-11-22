package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogKeepBatteryBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeepBatteryDialog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/commonui/dialog/KeepBatteryDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogKeepBatteryBinding;", "context", "Landroid/content/Context;", "isShowTip2", "", "confirmClick", "Landroid/view/View$OnClickListener;", "<init>", "(Landroid/content/Context;ZLandroid/view/View$OnClickListener;)V", "initViews", "", Constants.ON_START_KEY, "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeepBatteryDialog extends BaseDialog<DialogKeepBatteryBinding> {
    private final View.OnClickListener confirmClick;
    private final boolean isShowTip2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepBatteryDialog(Context context, boolean z, View.OnClickListener confirmClick) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        this.isShowTip2 = z;
        this.confirmClick = confirmClick;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().keepAliveTip2.setVisibility(this.isShowTip2 ? 0 : 8);
        getMBinding().btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.KeepBatteryDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepBatteryDialog.initViews$lambda$0(KeepBatteryDialog.this, view);
            }
        });
        getMBinding().btnCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.KeepBatteryDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepBatteryDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(KeepBatteryDialog keepBatteryDialog, View view) {
        keepBatteryDialog.confirmClick.onClick(view);
        keepBatteryDialog.dismiss();
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
