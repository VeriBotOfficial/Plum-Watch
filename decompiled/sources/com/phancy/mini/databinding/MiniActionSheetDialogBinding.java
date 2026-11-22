package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;

/* loaded from: classes17.dex */
public final class MiniActionSheetDialogBinding implements ViewBinding {
    public final LinearLayout actionSheet;
    public final TextView cancel;
    public final LinearLayout cancelLayout;
    private final LinearLayout rootView;

    private MiniActionSheetDialogBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.actionSheet = linearLayout2;
        this.cancel = textView;
        this.cancelLayout = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MiniActionSheetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniActionSheetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_action_sheet_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniActionSheetDialogBinding bind(View view) {
        int i = R.id.action_sheet;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.cancel_layout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    return new MiniActionSheetDialogBinding((LinearLayout) view, linearLayout, textView, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
