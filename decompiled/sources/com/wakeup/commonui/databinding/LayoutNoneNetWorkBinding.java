package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class LayoutNoneNetWorkBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvTryRefresh;

    private LayoutNoneNetWorkBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.tvTryRefresh = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutNoneNetWorkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutNoneNetWorkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_none_net_work, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutNoneNetWorkBinding bind(View view) {
        int i = R.id.tv_try_refresh;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new LayoutNoneNetWorkBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
