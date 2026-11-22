package com.wakeup.feature.device.white;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.device.databinding.DialogSleepNameBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepNameDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/feature/device/white/SleepNameDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/device/databinding/DialogSleepNameBinding;", "context", "Landroid/content/Context;", "title", "", "default", "onConfirm", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "initViews", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepNameDialog extends BaseDialog<DialogSleepNameBinding> {
    private final String default;
    private final Function1<String, Unit> onConfirm;
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SleepNameDialog(Context context, String title, String str, Function1<? super String, Unit> onConfirm) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(str, "default");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        this.title = title;
        this.default = str;
        this.onConfirm = onConfirm;
        setCanceledOnTouchOutside(true);
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        getMBinding().tvTitle.setText(this.title);
        getMBinding().etName.setText(this.default);
        EditText editText = getMBinding().etName;
        Editable text = getMBinding().etName.getText();
        editText.setSelection(text != null ? text.length() : 0);
        getMBinding().btnLeft.setText(getContext().getString(R.string.btn_cancel));
        getMBinding().btnRight.setText(getContext().getString(R.string.btn_confirm));
        getMBinding().ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.white.SleepNameDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepNameDialog.this.dismiss();
            }
        });
        getMBinding().btnLeft.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.white.SleepNameDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepNameDialog.this.dismiss();
            }
        });
        getMBinding().btnRight.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.white.SleepNameDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepNameDialog.initViews$lambda$2(SleepNameDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(SleepNameDialog sleepNameDialog, View view) {
        Editable text = sleepNameDialog.getMBinding().etName.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        sleepNameDialog.dismiss();
        sleepNameDialog.onConfirm.invoke(obj);
    }
}
