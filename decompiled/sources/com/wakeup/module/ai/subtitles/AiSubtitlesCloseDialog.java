package com.wakeup.module.ai.subtitles;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.ai.databinding.DialogAiSubtitlesCloseBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSubtitlesCloseDialog.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/ai/subtitles/AiSubtitlesCloseDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/ai/databinding/DialogAiSubtitlesCloseBinding;", "context", "Landroid/content/Context;", "onSure", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getOnSure", "()Lkotlin/jvm/functions/Function0;", "initViews", Constants.ON_START_KEY, "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiSubtitlesCloseDialog extends BaseDialog<DialogAiSubtitlesCloseBinding> {
    private final Function0<Unit> onSure;

    public final Function0<Unit> getOnSure() {
        return this.onSure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiSubtitlesCloseDialog(Context context, Function0<Unit> onSure) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSure, "onSure");
        this.onSure = onSure;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.subtitles.AiSubtitlesCloseDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiSubtitlesCloseDialog.this.dismiss();
            }
        });
        getMBinding().tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.ai.subtitles.AiSubtitlesCloseDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiSubtitlesCloseDialog.initViews$lambda$1(AiSubtitlesCloseDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(AiSubtitlesCloseDialog aiSubtitlesCloseDialog, View view) {
        aiSubtitlesCloseDialog.onSure.invoke();
        aiSubtitlesCloseDialog.dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(17);
        window.setWindowAnimations(0);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
