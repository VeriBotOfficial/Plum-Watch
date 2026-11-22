package com.wakeup.feature.friend.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.friend.databinding.DialogAddnewmembermenuBinding;
import com.wakeup.feature.friend.dialog.AddNewMemberMenuDialog;

/* loaded from: classes3.dex */
public class AddNewMemberMenuDialog extends BaseDialog<DialogAddnewmembermenuBinding> {
    private static AddNewMemberMenuDialog instance;

    public interface OnFriendsHomeMenuDialogCallBack {
        void onClickMyCard();
    }

    public AddNewMemberMenuDialog(Context context, final OnFriendsHomeMenuDialogCallBack onFriendsHomeMenuDialogCallBack) {
        super(context, R.style.BaseDialog2);
        ((DialogAddnewmembermenuBinding) this.mBinding).tv3.setText(StringUtils.getString(R.string.qr_wodeerweima));
        ((DialogAddnewmembermenuBinding) this.mBinding).rlMain.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.AddNewMemberMenuDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewMemberMenuDialog.dismissMenuDialog();
            }
        });
        ((DialogAddnewmembermenuBinding) this.mBinding).llMyCard.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.AddNewMemberMenuDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddNewMemberMenuDialog.lambda$new$1(AddNewMemberMenuDialog.OnFriendsHomeMenuDialogCallBack.this, view);
            }
        });
    }

    static /* synthetic */ void lambda$new$1(OnFriendsHomeMenuDialogCallBack onFriendsHomeMenuDialogCallBack, View view) {
        onFriendsHomeMenuDialogCallBack.onClickMyCard();
        dismissMenuDialog();
    }

    public static synchronized void showMenuDialog(Context context, OnFriendsHomeMenuDialogCallBack onFriendsHomeMenuDialogCallBack) {
        synchronized (AddNewMemberMenuDialog.class) {
            dismissMenuDialog();
            AddNewMemberMenuDialog addNewMemberMenuDialog = new AddNewMemberMenuDialog(context, onFriendsHomeMenuDialogCallBack);
            instance = addNewMemberMenuDialog;
            addNewMemberMenuDialog.show();
        }
    }

    public static synchronized void dismissMenuDialog() {
        synchronized (AddNewMemberMenuDialog.class) {
            try {
                AddNewMemberMenuDialog addNewMemberMenuDialog = instance;
                if (addNewMemberMenuDialog != null && addNewMemberMenuDialog.isShowing()) {
                    instance.dismiss();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                instance = null;
                throw th;
            }
            instance = null;
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(48);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
