package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimBlockHomeRecentBinding implements ViewBinding {
    public final LinearLayout cardRecent;
    public final LinearLayout llRecentSongs;
    private final LinearLayout rootView;
    public final TextView tvRecentTitle;

    private AimBlockHomeRecentBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.rootView = linearLayout;
        this.cardRecent = linearLayout2;
        this.llRecentSongs = linearLayout3;
        this.tvRecentTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimBlockHomeRecentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimBlockHomeRecentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_block_home_recent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimBlockHomeRecentBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.llRecentSongs;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout2 != null) {
            i = R.id.tvRecentTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new AimBlockHomeRecentBinding(linearLayout, linearLayout, linearLayout2, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
