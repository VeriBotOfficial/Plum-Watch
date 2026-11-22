package com.wakeup.feature.friend.dialog;

import android.content.Context;
import android.view.View;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.friend.databinding.DialogFriendshomemenuBinding;

/* loaded from: classes3.dex */
public class FriendsHomeMenuDialog extends BaseDialog<DialogFriendshomemenuBinding> {
    private OnFriendsHomeMenuDialogCallBack callBack;

    public interface OnFriendsHomeMenuDialogCallBack {
        void onClickAbout();

        void onClickAddNewMember();

        void onClickMemberManagement();

        void onClickMyCard();
    }

    public FriendsHomeMenuDialog(Context context, OnFriendsHomeMenuDialogCallBack onFriendsHomeMenuDialogCallBack) {
        super(context, R.style.BaseDialog2);
        setGravity(48);
        this.callBack = onFriendsHomeMenuDialogCallBack;
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        ((DialogFriendshomemenuBinding) this.mBinding).tv1.setText(StringUtils.getString(R.string.ke_21_8_11_2));
        ((DialogFriendshomemenuBinding) this.mBinding).tv2.setText(StringUtils.getString(R.string.ke_21_8_12_1));
        ((DialogFriendshomemenuBinding) this.mBinding).tv3.setText(StringUtils.getString(R.string.qr_wodeerweima));
        ((DialogFriendshomemenuBinding) this.mBinding).tv4.setText(StringUtils.getString(R.string.ke_21_8_11_3));
        ((DialogFriendshomemenuBinding) this.mBinding).rlMain.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendsHomeMenuDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsHomeMenuDialog.this.lambda$initViews$0(view);
            }
        });
        ((DialogFriendshomemenuBinding) this.mBinding).llMemberManagement.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendsHomeMenuDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsHomeMenuDialog.this.lambda$initViews$1(view);
            }
        });
        ((DialogFriendshomemenuBinding) this.mBinding).llAddNewMember.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendsHomeMenuDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsHomeMenuDialog.this.lambda$initViews$2(view);
            }
        });
        ((DialogFriendshomemenuBinding) this.mBinding).llMyCard.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendsHomeMenuDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsHomeMenuDialog.this.lambda$initViews$3(view);
            }
        });
        ((DialogFriendshomemenuBinding) this.mBinding).llAbout.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendsHomeMenuDialog$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsHomeMenuDialog.this.lambda$initViews$4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        dismissMenuDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        this.callBack.onClickMemberManagement();
        dismissMenuDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$2(View view) {
        this.callBack.onClickAddNewMember();
        dismissMenuDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$3(View view) {
        this.callBack.onClickMyCard();
        dismissMenuDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$4(View view) {
        this.callBack.onClickAbout();
        dismissMenuDialog();
    }

    public void showMenuDialog(boolean z) {
        dismissMenuDialog();
        if (z) {
            ((DialogFriendshomemenuBinding) this.mBinding).ivIconManager.setImageResource(com.wakeup.feature.friend.R.drawable.ic_family_follow_me_point);
        } else {
            ((DialogFriendshomemenuBinding) this.mBinding).ivIconManager.setImageResource(com.wakeup.feature.friend.R.drawable.ic_family_follow_me);
        }
        show();
    }

    public synchronized void dismissMenuDialog() {
        if (isShowing()) {
            dismiss();
        }
    }
}
