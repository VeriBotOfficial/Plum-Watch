package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogWatchConnectTipBinding;
import com.wakeup.commonui.utils.ImageTextFormatter;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes2.dex */
public class WatchConnectTipDialog extends BaseDialog<DialogWatchConnectTipBinding> {
    public WatchConnectTipDialog(Context context) {
        super(context, 0);
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        super.initViews();
        ((DialogWatchConnectTipBinding) this.mBinding).btn.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.dialog.WatchConnectTipDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatchConnectTipDialog.this.lambda$initViews$0(view);
            }
        });
        ((DialogWatchConnectTipBinding) this.mBinding).tvTip.setText(ImageTextFormatter.INSTANCE.formatWithIcon(getContext(), R.string.string_watch_connect_dialog_tip, R.drawable.icon_watch_connect_confirm, Integer.valueOf(UIHelper.dp2px(16.0f)), UIHelper.dp2px(4.0f), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(17);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
