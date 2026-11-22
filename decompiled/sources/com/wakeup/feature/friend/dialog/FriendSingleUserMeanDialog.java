package com.wakeup.feature.friend.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.friend.databinding.DialogFriendSingleUserBinding;
import com.wakeup.feature.friend.dialog.FriendSingleUserMeanDialog;

/* loaded from: classes3.dex */
public class FriendSingleUserMeanDialog extends BaseDialog<DialogFriendSingleUserBinding> {
    private static FriendSingleUserMeanDialog instance;

    public interface OnItemClickListener {
        void onDeleteMember();

        void onEditUser();
    }

    public FriendSingleUserMeanDialog(Context context, final OnItemClickListener onItemClickListener) {
        super(context, R.style.BaseDialog2);
        ((DialogFriendSingleUserBinding) this.mBinding).tv1.setText(StringUtils.getString(R.string.ke_21_8_25_2));
        ((DialogFriendSingleUserBinding) this.mBinding).tv2.setText(StringUtils.getString(R.string.ke_21_8_25_3));
        ((DialogFriendSingleUserBinding) this.mBinding).rlMain.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendSingleUserMeanDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendSingleUserMeanDialog.dismissMenuDialog();
            }
        });
        ((DialogFriendSingleUserBinding) this.mBinding).llEdit.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendSingleUserMeanDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendSingleUserMeanDialog.lambda$new$1(FriendSingleUserMeanDialog.OnItemClickListener.this, view);
            }
        });
        ((DialogFriendSingleUserBinding) this.mBinding).llDelete.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.friend.dialog.FriendSingleUserMeanDialog$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendSingleUserMeanDialog.lambda$new$2(FriendSingleUserMeanDialog.OnItemClickListener.this, view);
            }
        });
    }

    static /* synthetic */ void lambda$new$1(OnItemClickListener onItemClickListener, View view) {
        onItemClickListener.onEditUser();
        dismissMenuDialog();
    }

    static /* synthetic */ void lambda$new$2(OnItemClickListener onItemClickListener, View view) {
        onItemClickListener.onDeleteMember();
        dismissMenuDialog();
    }

    public static synchronized void showMenuDialog(Activity activity, OnItemClickListener onItemClickListener) {
        synchronized (FriendSingleUserMeanDialog.class) {
            dismissMenuDialog();
            FriendSingleUserMeanDialog friendSingleUserMeanDialog = new FriendSingleUserMeanDialog(activity, onItemClickListener);
            instance = friendSingleUserMeanDialog;
            friendSingleUserMeanDialog.show();
        }
    }

    public static synchronized void dismissMenuDialog() {
        synchronized (FriendSingleUserMeanDialog.class) {
            try {
                FriendSingleUserMeanDialog friendSingleUserMeanDialog = instance;
                if (friendSingleUserMeanDialog != null && friendSingleUserMeanDialog.isShowing()) {
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
