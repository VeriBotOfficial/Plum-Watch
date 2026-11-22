package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class StatusBarBinding implements ViewBinding {
    private final View rootView;
    public final View statusBar;

    private StatusBarBinding(View view, View view2) {
        this.rootView = view;
        this.statusBar = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StatusBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StatusBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.status_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static StatusBarBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new StatusBarBinding(view, view);
    }
}
