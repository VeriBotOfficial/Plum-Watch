package com.wakeup.feature.health.valid;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.health.databinding.DialogEditMetBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditMetDialog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/health/valid/EditMetDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/health/databinding/DialogEditMetBinding;", "context", "Landroid/content/Context;", "met", "", "callback", "Lcom/wakeup/common/base/BaseCallback;", "<init>", "(Landroid/content/Context;ILcom/wakeup/common/base/BaseCallback;)V", "getCallback", "()Lcom/wakeup/common/base/BaseCallback;", "mCallback", "initViews", "", Constants.ON_START_KEY, "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditMetDialog extends BaseDialog<DialogEditMetBinding> {
    public static final int $stable = 8;
    private final BaseCallback<Integer> callback;
    private BaseCallback<Integer> mCallback;
    private int met;

    public final BaseCallback<Integer> getCallback() {
        return this.callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMetDialog(Context context, int i, BaseCallback<Integer> callback) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.met = i;
        this.mCallback = callback;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        int i;
        super.initViews();
        getMBinding().metData.setText(String.valueOf(this.met));
        SeekBar seekBar = getMBinding().seekBar;
        int i2 = this.met;
        if (i2 < 400) {
            i = 0;
        } else {
            i = i2 > 1400 ? 100 : (i2 - 400) / 10;
        }
        seekBar.setProgress(i);
        getMBinding().seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.wakeup.feature.health.valid.EditMetDialog$initViews$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
                Intrinsics.checkNotNullParameter(seekBar2, "seekBar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
                Intrinsics.checkNotNullParameter(seekBar2, "seekBar");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                int i3;
                Intrinsics.checkNotNullParameter(seekBar2, "seekBar");
                EditMetDialog.this.met = (progress * 10) + 400;
                AppCompatTextView appCompatTextView = EditMetDialog.this.getMBinding().metData;
                i3 = EditMetDialog.this.met;
                appCompatTextView.setText(String.valueOf(i3));
            }
        });
        getMBinding().btnRight.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.health.valid.EditMetDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMetDialog.initViews$lambda$0(EditMetDialog.this, view);
            }
        });
        getMBinding().btnLeft.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.health.valid.EditMetDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMetDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(EditMetDialog editMetDialog, View view) {
        BaseCallback<Integer> baseCallback = editMetDialog.mCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, Integer.valueOf(editMetDialog.met));
        }
        editMetDialog.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(80);
        window.getDecorView().setPadding(0, 0, 0, 1000);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
