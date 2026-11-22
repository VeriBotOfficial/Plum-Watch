package com.wakeup.feature.wkvideo.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.blankj.utilcode.util.ScreenUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.wkvideo.databinding.DialogMoreSettingBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoreSettingDialog.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/wkvideo/dialog/MoreSettingDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/wkvideo/databinding/DialogMoreSettingBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onMoreDialogCallback", "Lcom/wakeup/feature/wkvideo/dialog/MoreSettingDialog$OnMoreDialogCallback;", "getOnMoreDialogCallback", "()Lcom/wakeup/feature/wkvideo/dialog/MoreSettingDialog$OnMoreDialogCallback;", "setOnMoreDialogCallback", "(Lcom/wakeup/feature/wkvideo/dialog/MoreSettingDialog$OnMoreDialogCallback;)V", "initViews", "", "initData", "initWindowParams", "OnMoreDialogCallback", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreSettingDialog extends BaseDialog<DialogMoreSettingBinding> {
    private OnMoreDialogCallback onMoreDialogCallback;

    /* compiled from: MoreSettingDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/wakeup/feature/wkvideo/dialog/MoreSettingDialog$OnMoreDialogCallback;", "", "onPermissionClick", "", "onDeleteClick", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnMoreDialogCallback {
        void onDeleteClick();

        void onPermissionClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreSettingDialog(Context context) {
        super(context, R.style.DialogStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }

    public final OnMoreDialogCallback getOnMoreDialogCallback() {
        return this.onMoreDialogCallback;
    }

    public final void setOnMoreDialogCallback(OnMoreDialogCallback onMoreDialogCallback) {
        this.onMoreDialogCallback = onMoreDialogCallback;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        initWindowParams();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initData() {
        getMBinding().llPermission.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.dialog.MoreSettingDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingDialog.initData$lambda$0(MoreSettingDialog.this, view);
            }
        });
        getMBinding().llDelete.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.dialog.MoreSettingDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingDialog.initData$lambda$1(MoreSettingDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$0(MoreSettingDialog moreSettingDialog, View view) {
        moreSettingDialog.dismiss();
        OnMoreDialogCallback onMoreDialogCallback = moreSettingDialog.onMoreDialogCallback;
        if (onMoreDialogCallback != null) {
            onMoreDialogCallback.onPermissionClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(MoreSettingDialog moreSettingDialog, View view) {
        moreSettingDialog.dismiss();
        OnMoreDialogCallback onMoreDialogCallback = moreSettingDialog.onMoreDialogCallback;
        if (onMoreDialogCallback != null) {
            onMoreDialogCallback.onDeleteClick();
        }
    }

    private final void initWindowParams() {
        ScreenUtils.getScreenWidth();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(R.style.dialogAnim);
        }
    }
}
