package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class LayoutSettingsDialogBinding implements ViewBinding {
    public final LinearLayout layoutSettingsDialogContainer;
    private final ScrollView rootView;

    private LayoutSettingsDialogBinding(ScrollView rootView, LinearLayout layoutSettingsDialogContainer) {
        this.rootView = rootView;
        this.layoutSettingsDialogContainer = layoutSettingsDialogContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static LayoutSettingsDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LayoutSettingsDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_settings_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutSettingsDialogBinding bind(View rootView) {
        int i = R.id.layout_settings_dialog_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            return new LayoutSettingsDialogBinding((ScrollView) rootView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
