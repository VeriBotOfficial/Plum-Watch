package com.wakeup.module.glasses.dialog;

import android.content.Context;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.module.glasses.databinding.DialogGlassesFilmBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesFilmDialog.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000b\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/module/glasses/dialog/GlassesFilmDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/glasses/databinding/DialogGlassesFilmBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "closeCallback", "Lkotlin/Function0;", "", "initViews", "setCloseCall", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesFilmDialog extends BaseDialog<DialogGlassesFilmBinding> {
    private Function0<Unit> closeCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlassesFilmDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesFilmDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesFilmDialog.initViews$lambda$0(GlassesFilmDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(GlassesFilmDialog glassesFilmDialog, View view) {
        glassesFilmDialog.dismiss();
        Function0<Unit> function0 = glassesFilmDialog.closeCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setCloseCall(Function0<Unit> closeCallback) {
        Intrinsics.checkNotNullParameter(closeCallback, "closeCallback");
        this.closeCallback = closeCallback;
    }
}
