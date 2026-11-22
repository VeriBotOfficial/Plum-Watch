package com.wakeup.module.glasses.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.glasses.databinding.DialogGlassesBatteryTipBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesBatteryTipDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/wakeup/module/glasses/dialog/GlassesBatteryTipDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/glasses/databinding/DialogGlassesBatteryTipBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "initViews", "", Constants.ON_START_KEY, "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesBatteryTipDialog extends BaseDialog<DialogGlassesBatteryTipBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlassesBatteryTipDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().flClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesBatteryTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesBatteryTipDialog.this.dismiss();
            }
        });
        getMBinding().tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesBatteryTipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesBatteryTipDialog.this.dismiss();
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
