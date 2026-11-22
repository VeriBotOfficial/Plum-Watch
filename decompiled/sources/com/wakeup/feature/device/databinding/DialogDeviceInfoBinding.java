package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class DialogDeviceInfoBinding implements ViewBinding {
    public final View blackLine1;
    public final View blackLine2;
    private final LinearLayout rootView;
    public final AppCompatTextView tvDeviceChangeName;
    public final AppCompatTextView tvDeviceDelete;
    public final AppCompatTextView tvDeviceInfo;
    public final AppCompatTextView tvDeviceInfoCancel;

    private DialogDeviceInfoBinding(LinearLayout linearLayout, View view, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = linearLayout;
        this.blackLine1 = view;
        this.blackLine2 = view2;
        this.tvDeviceChangeName = appCompatTextView;
        this.tvDeviceDelete = appCompatTextView2;
        this.tvDeviceInfo = appCompatTextView3;
        this.tvDeviceInfoCancel = appCompatTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogDeviceInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDeviceInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDeviceInfoBinding bind(View view) {
        View findChildViewById;
        int i = R.id.black_line1;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.black_line2))) != null) {
            i = R.id.tv_device_change_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R.id.tv_device_delete;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = R.id.tv_device_info;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R.id.tv_device_info_cancel;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            return new DialogDeviceInfoBinding((LinearLayout) view, findChildViewById2, findChildViewById, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
