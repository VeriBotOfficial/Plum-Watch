package com.wakeup.feature.friend.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.friend.databinding.DialogFriendhomecentertipBinding;

/* loaded from: classes3.dex */
public class FriendHomeCenterTipDialog extends BaseDialog<DialogFriendhomecentertipBinding> {
    private OnFriendHomeCenterTipDialogCallBack callBack;
    private String menu;
    private String tip;
    private String title;

    public interface OnFriendHomeCenterTipDialogCallBack {
        void onGreen();

        void onRed();
    }

    public FriendHomeCenterTipDialog(Context context, String str, String str2, String str3) {
        super(context, R.style.BaseDialog);
        initData(str, str2, str3, null);
    }

    private void initData(String str, String str2, String str3, int[] iArr) {
        setCanceledOnTouchOutside(true);
        this.title = str;
        this.tip = str2;
        this.menu = str3;
        initViews();
        initListener();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        ((DialogFriendhomecentertipBinding) this.mBinding).line1.setVisibility(8);
        ((DialogFriendhomecentertipBinding) this.mBinding).line2.setVisibility(8);
        ((DialogFriendhomecentertipBinding) this.mBinding).tvContent.setText(this.tip);
        if (!TextUtils.isEmpty(this.title)) {
            ((DialogFriendhomecentertipBinding) this.mBinding).rlTitle.setVisibility(0);
            ((DialogFriendhomecentertipBinding) this.mBinding).tvTitle.setText(this.title);
        } else {
            ((DialogFriendhomecentertipBinding) this.mBinding).rlTitle.setVisibility(8);
        }
        if (this.menu != null) {
            ((DialogFriendhomecentertipBinding) this.mBinding).tvBlue.setText(this.menu);
        }
    }

    protected void initListener() {
        ((DialogFriendhomecentertipBinding) this.mBinding).tvBlue.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendHomeCenterTipDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FriendHomeCenterTipDialog.this.dismiss();
                if (FriendHomeCenterTipDialog.this.callBack != null) {
                    FriendHomeCenterTipDialog.this.callBack.onRed();
                }
            }
        });
    }

    public void setCallBack(OnFriendHomeCenterTipDialogCallBack onFriendHomeCenterTipDialogCallBack) {
        this.callBack = onFriendHomeCenterTipDialogCallBack;
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
