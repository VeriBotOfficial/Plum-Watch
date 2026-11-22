package com.wakeup.module.ai.simInter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.ai.databinding.DialogSoundShareBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SoundShareDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/ai/simInter/SoundShareDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/ai/databinding/DialogSoundShareBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "callBack", "Lcom/wakeup/module/ai/simInter/SoundShareDialog$OnCommonShareDialogCallBack;", "initViews", "", Constants.ON_START_KEY, "setCallBack", "OnCommonShareDialogCallBack", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoundShareDialog extends BaseDialog<DialogSoundShareBinding> {
    private OnCommonShareDialogCallBack callBack;

    /* compiled from: SoundShareDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/wakeup/module/ai/simInter/SoundShareDialog$OnCommonShareDialogCallBack;", "", "onLeft", "", "onRight", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCommonShareDialogCallBack {
        void onLeft();

        void onRight();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundShareDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        getMBinding().ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.simInter.SoundShareDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundShareDialog.this.dismiss();
            }
        });
        getMBinding().tvShareTxt.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.simInter.SoundShareDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundShareDialog.initViews$lambda$1(SoundShareDialog.this, view);
            }
        });
        getMBinding().tvShareAudio.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.simInter.SoundShareDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SoundShareDialog.initViews$lambda$2(SoundShareDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(SoundShareDialog soundShareDialog, View view) {
        if (soundShareDialog.callBack != null) {
            soundShareDialog.dismiss();
            OnCommonShareDialogCallBack onCommonShareDialogCallBack = soundShareDialog.callBack;
            if (onCommonShareDialogCallBack != null) {
                onCommonShareDialogCallBack.onLeft();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(SoundShareDialog soundShareDialog, View view) {
        if (soundShareDialog.callBack != null) {
            soundShareDialog.dismiss();
            OnCommonShareDialogCallBack onCommonShareDialogCallBack = soundShareDialog.callBack;
            if (onCommonShareDialogCallBack != null) {
                onCommonShareDialogCallBack.onRight();
            }
        }
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

    public final void setCallBack(OnCommonShareDialogCallBack callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.callBack = callBack;
    }
}
