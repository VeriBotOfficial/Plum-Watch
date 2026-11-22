package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimItemStyleBinding implements ViewBinding {
    public final FrameLayout coverBox;
    public final ImageView ivCover;
    private final LinearLayout rootView;
    public final TextView tvCoverInitial;
    public final TextView tvHint;
    public final TextView tvSongCount;
    public final TextView tvStyleName;

    private AimItemStyleBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.coverBox = frameLayout;
        this.ivCover = imageView;
        this.tvCoverInitial = textView;
        this.tvHint = textView2;
        this.tvSongCount = textView3;
        this.tvStyleName = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemStyleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemStyleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_style, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemStyleBinding bind(View view) {
        int i = R.id.coverBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivCover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvCoverInitial;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvHint;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvSongCount;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tvStyleName;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new AimItemStyleBinding((LinearLayout) view, frameLayout, imageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
