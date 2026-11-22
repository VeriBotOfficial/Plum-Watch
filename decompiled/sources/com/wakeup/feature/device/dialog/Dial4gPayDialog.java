package com.wakeup.feature.device.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.device.databinding.DialogDial4gPayBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dial4gPayDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/device/dialog/Dial4gPayDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/device/databinding/DialogDial4gPayBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initViews", "", Constants.ON_START_KEY, "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Dial4gPayDialog extends BaseDialog<DialogDial4gPayBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dial4gPayDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().tvSuccess.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.Dial4gPayDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dial4gPayDialog.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(17);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
