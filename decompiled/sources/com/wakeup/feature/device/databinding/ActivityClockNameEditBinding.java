package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityClockNameEditBinding implements ViewBinding {
    public final EditText etName;
    private final LinearLayoutCompat rootView;
    public final MyTitleBar titleBar;

    private ActivityClockNameEditBinding(LinearLayoutCompat linearLayoutCompat, EditText editText, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.etName = editText;
        this.titleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityClockNameEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClockNameEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_clock_name_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityClockNameEditBinding bind(View view) {
        int i = R.id.etName;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.titleBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityClockNameEditBinding((LinearLayoutCompat) view, editText, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
