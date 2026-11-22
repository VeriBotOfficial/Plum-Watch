package com.wakeup.feature.wkvideo.search.history;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.autonavi.aps.amapapi.config.Const;
import com.blankj.utilcode.util.SizeUtils;
import com.wakeup.commonui.R;
import com.wakeup.feature.wkvideo.databinding.DialogMiddleWithTwoBtnLayoutBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteConfirmDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/wkvideo/search/history/DeleteConfirmDialog;", "Landroid/app/Dialog;", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "onConfirmListener", "Lkotlin/Function0;", "", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Landroid/app/Activity;", "binding", "Lcom/wakeup/feature/wkvideo/databinding/DialogMiddleWithTwoBtnLayoutBinding;", "getBinding", "()Lcom/wakeup/feature/wkvideo/databinding/DialogMiddleWithTwoBtnLayoutBinding;", "setBinding", "(Lcom/wakeup/feature/wkvideo/databinding/DialogMiddleWithTwoBtnLayoutBinding;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initView", "show", "dismiss", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteConfirmDialog extends Dialog {
    private final Activity activity;
    private DialogMiddleWithTwoBtnLayoutBinding binding;
    private final Function0<Unit> onConfirmListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteConfirmDialog(Activity activity, Function0<Unit> function0) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.onConfirmListener = function0;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final DialogMiddleWithTwoBtnLayoutBinding getBinding() {
        return this.binding;
    }

    public final void setBinding(DialogMiddleWithTwoBtnLayoutBinding dialogMiddleWithTwoBtnLayoutBinding) {
        this.binding = dialogMiddleWithTwoBtnLayoutBinding;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DialogMiddleWithTwoBtnLayoutBinding inflate = DialogMiddleWithTwoBtnLayoutBinding.inflate(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setContentView(inflate.getRoot());
        this.binding = inflate;
        initView();
    }

    private final void initView() {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        DialogMiddleWithTwoBtnLayoutBinding dialogMiddleWithTwoBtnLayoutBinding = this.binding;
        if (dialogMiddleWithTwoBtnLayoutBinding != null && (textView2 = dialogMiddleWithTwoBtnLayoutBinding.confirm) != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.search.history.DeleteConfirmDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeleteConfirmDialog.initView$lambda$0(DeleteConfirmDialog.this, view);
                }
            });
        }
        DialogMiddleWithTwoBtnLayoutBinding dialogMiddleWithTwoBtnLayoutBinding2 = this.binding;
        if (dialogMiddleWithTwoBtnLayoutBinding2 != null && (textView = dialogMiddleWithTwoBtnLayoutBinding2.cancel) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.search.history.DeleteConfirmDialog$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeleteConfirmDialog.this.dismiss();
                }
            });
        }
        DialogMiddleWithTwoBtnLayoutBinding dialogMiddleWithTwoBtnLayoutBinding3 = this.binding;
        if (dialogMiddleWithTwoBtnLayoutBinding3 == null || (imageView = dialogMiddleWithTwoBtnLayoutBinding3.close) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.search.history.DeleteConfirmDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteConfirmDialog.this.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DeleteConfirmDialog deleteConfirmDialog, View view) {
        deleteConfirmDialog.dismiss();
        Function0<Unit> function0 = deleteConfirmDialog.onConfirmListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.activity.isFinishing()) {
            return;
        }
        super.show();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.width = -1;
        attributes.height = -2;
        window.getDecorView().setPadding(SizeUtils.dp2px(25.0f), 0, SizeUtils.dp2px(25.0f), 0);
        window.setAttributes(attributes);
        window.setDimAmount(0.4f);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            if (!this.activity.isFinishing() && !this.activity.isDestroyed()) {
                super.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
