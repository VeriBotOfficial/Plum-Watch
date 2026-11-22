package com.wakeup.module.ai.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.ai.R;

/* loaded from: classes4.dex */
public final class LayoutRecordCallNotifyBinding implements ViewBinding {
    public final ImageView ivRecord;
    private final RelativeLayout rootView;

    private LayoutRecordCallNotifyBinding(RelativeLayout relativeLayout, ImageView imageView) {
        this.rootView = relativeLayout;
        this.ivRecord = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutRecordCallNotifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutRecordCallNotifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_record_call_notify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutRecordCallNotifyBinding bind(View view) {
        int i = R.id.iv_record;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new LayoutRecordCallNotifyBinding((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
