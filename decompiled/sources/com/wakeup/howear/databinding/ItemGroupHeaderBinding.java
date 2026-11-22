package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemGroupHeaderBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextView tvGroupName;
    public final TextView tvGroupReward;
    public final TextView tvGroupStatus;

    private ItemGroupHeaderBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.tvGroupName = textView;
        this.tvGroupReward = textView2;
        this.tvGroupStatus = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemGroupHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGroupHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_group_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGroupHeaderBinding bind(View view) {
        int i = R.id.tvGroupName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tvGroupReward;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tvGroupStatus;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    return new ItemGroupHeaderBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
