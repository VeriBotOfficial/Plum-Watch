package com.wakeup.feature.device.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.device.databinding.DialogDialBuySuccessBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialBuySuccessDialog.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/device/dialog/DialBuySuccessDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/device/databinding/DialogDialBuySuccessBinding;", "context", "Landroid/content/Context;", "onConfirm", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "initViews", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialBuySuccessDialog extends BaseDialog<DialogDialBuySuccessBinding> {
    private final Function0<Unit> onConfirm;

    public /* synthetic */ DialBuySuccessDialog(Context context, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : function0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialBuySuccessDialog(Context context, Function0<Unit> function0) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onConfirm = function0;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        int dimensionPixelSize = getMContext().getResources().getDimensionPixelSize(R.dimen.dp_28);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(getMContext().getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize * 2), -2);
        }
        getMBinding().tvSuccessConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.DialBuySuccessDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialBuySuccessDialog.initViews$lambda$0(DialBuySuccessDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(DialBuySuccessDialog dialBuySuccessDialog, View view) {
        dialBuySuccessDialog.dismiss();
        Function0<Unit> function0 = dialBuySuccessDialog.onConfirm;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
