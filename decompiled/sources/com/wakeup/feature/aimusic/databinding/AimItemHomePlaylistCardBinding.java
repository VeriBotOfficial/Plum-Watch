package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;
import com.wakeup.feature.aimusic.widget.SquareFrameLayout;

/* loaded from: classes2.dex */
public final class AimItemHomePlaylistCardBinding implements ViewBinding {
    public final SquareFrameLayout coverBox;
    public final View coverPlaceholder;
    public final ImageView ivCover;
    public final ImageView ivPlay;
    public final ImageView ivSubscribe;
    private final LinearLayout rootView;
    public final LinearLayout titleRow;
    public final TextView tvTitle;

    private AimItemHomePlaylistCardBinding(LinearLayout linearLayout, SquareFrameLayout squareFrameLayout, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.coverBox = squareFrameLayout;
        this.coverPlaceholder = view;
        this.ivCover = imageView;
        this.ivPlay = imageView2;
        this.ivSubscribe = imageView3;
        this.titleRow = linearLayout2;
        this.tvTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemHomePlaylistCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemHomePlaylistCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_home_playlist_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemHomePlaylistCardBinding bind(View view) {
        View findChildViewById;
        int i = R.id.coverBox;
        SquareFrameLayout squareFrameLayout = (SquareFrameLayout) ViewBindings.findChildViewById(view, i);
        if (squareFrameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.coverPlaceholder))) != null) {
            i = R.id.ivCover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivPlay;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.ivSubscribe;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.titleRow;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.tvTitle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new AimItemHomePlaylistCardBinding((LinearLayout) view, squareFrameLayout, findChildViewById, imageView, imageView2, imageView3, linearLayout, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
