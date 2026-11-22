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

/* compiled from: GlassesTipDialog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/glasses/dialog/GlassesTipDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/module/glasses/databinding/DialogGlassesBatteryTipBinding;", "context", "Landroid/content/Context;", "content", "", "sureStr", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getSureStr", "initViews", "", Constants.ON_START_KEY, "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesTipDialog extends BaseDialog<DialogGlassesBatteryTipBinding> {
    private final String content;
    private final String sureStr;

    public final String getContent() {
        return this.content;
    }

    public final String getSureStr() {
        return this.sureStr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlassesTipDialog(Context context, String content, String sureStr) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(sureStr, "sureStr");
        this.content = content;
        this.sureStr = sureStr;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        setCancelable(false);
        getMBinding().flClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesTipDialog.this.dismiss();
            }
        });
        getMBinding().tvSure.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.module.glasses.dialog.GlassesTipDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GlassesTipDialog.this.dismiss();
            }
        });
        getMBinding().tvDesc.setText(this.content);
        getMBinding().tvSure.setText(this.sureStr);
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
