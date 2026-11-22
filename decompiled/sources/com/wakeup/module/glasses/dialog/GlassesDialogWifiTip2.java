package com.wakeup.module.glasses.dialog;

import android.content.Context;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.glasses.databinding.DialogGlassesWifiTip2Binding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesDialogWifiTip2.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/wakeup/module/glasses/dialog/GlassesDialogWifiTip2;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/glasses/databinding/DialogGlassesWifiTip2Binding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initViews", "", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesDialogWifiTip2 extends BaseDialog<DialogGlassesWifiTip2Binding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlassesDialogWifiTip2(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().flClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesDialogWifiTip2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesDialogWifiTip2.this.dismiss();
            }
        });
        getMBinding().tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesDialogWifiTip2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesDialogWifiTip2.this.dismiss();
            }
        });
    }
}
