package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogBaseShareBinding implements ViewBinding {
    public final ImageView ivBaseShareDialogClose;
    public final LinearLayoutCompat layoutBaseShareDialogFirst;
    public final LinearLayoutCompat layoutBaseShareDialogSecond;
    private final LinearLayoutCompat rootView;
    public final View viewBaseShareDialogDivide;

    private DialogBaseShareBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, View view) {
        this.rootView = linearLayoutCompat;
        this.ivBaseShareDialogClose = imageView;
        this.layoutBaseShareDialogFirst = linearLayoutCompat2;
        this.layoutBaseShareDialogSecond = linearLayoutCompat3;
        this.viewBaseShareDialogDivide = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogBaseShareBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBaseShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_base_share, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBaseShareBinding bind(View view) {
        View findChildViewById;
        int i = R.id.iv_base_share_dialog_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.layout_base_share_dialog_first;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.layout_base_share_dialog_second;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_base_share_dialog_divide))) != null) {
                    return new DialogBaseShareBinding((LinearLayoutCompat) view, imageView, linearLayoutCompat, linearLayoutCompat2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
