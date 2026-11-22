package com.wakeup.commonui.dialog;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogDevApWifiSwitchBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevApWifiSwitchDialog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/wakeup/commonui/dialog/DevApWifiSwitchDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogDevApWifiSwitchBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initViews", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DevApWifiSwitchDialog extends BaseDialog<DialogDevApWifiSwitchBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevApWifiSwitchDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().flClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.DevApWifiSwitchDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevApWifiSwitchDialog.this.dismiss();
            }
        });
        getMBinding().tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.DevApWifiSwitchDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevApWifiSwitchDialog.initViews$lambda$1(DevApWifiSwitchDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(DevApWifiSwitchDialog devApWifiSwitchDialog, View view) {
        devApWifiSwitchDialog.getMContext().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        devApWifiSwitchDialog.dismiss();
    }
}
