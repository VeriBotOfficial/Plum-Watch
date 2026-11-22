package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class LayoutVideoMultipleWatchEnterViewBinding implements ViewBinding {
    public final LinearLayout layoutViewWatchEnter;
    public final RelativeLayout rlWatchIcon;
    private final LinearLayout rootView;
    public final TextView tvBuy;
    public final TextView tvWatchDesc;
    public final TextView tvWatchName;

    private LayoutVideoMultipleWatchEnterViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.layoutViewWatchEnter = linearLayout2;
        this.rlWatchIcon = relativeLayout;
        this.tvBuy = textView;
        this.tvWatchDesc = textView2;
        this.tvWatchName = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutVideoMultipleWatchEnterViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVideoMultipleWatchEnterViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_video_multiple_watch_enter_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutVideoMultipleWatchEnterViewBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.rl_watch_icon;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.tv_buy;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_watch_desc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.tv_watch_name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new LayoutVideoMultipleWatchEnterViewBinding(linearLayout, linearLayout, relativeLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
