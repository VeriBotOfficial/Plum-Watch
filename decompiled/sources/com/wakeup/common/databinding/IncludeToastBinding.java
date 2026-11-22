package com.wakeup.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public final class IncludeToastBinding implements ViewBinding {
    public final TextView message;
    private final TextView rootView;

    private IncludeToastBinding(TextView rootView, TextView message) {
        this.rootView = rootView;
        this.message = message;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static IncludeToastBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IncludeToastBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.include_toast, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeToastBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new IncludeToastBinding(textView, textView);
    }
}
