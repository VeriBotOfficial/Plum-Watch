package com.wakeup.module.gpt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.module.gpt.R;

/* loaded from: classes4.dex */
public final class ViewTvBinding implements ViewBinding {
    public final TextView itemTagText;
    private final TextView rootView;

    private ViewTvBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.itemTagText = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static ViewTvBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewTvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_tv, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewTvBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new ViewTvBinding(textView, textView);
    }
}
