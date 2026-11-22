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
public final class AimItemHomeSongCardBinding implements ViewBinding {
    public final SquareFrameLayout coverBox;
    public final View coverPlaceholder;
    public final ImageView ivCover;
    private final LinearLayout rootView;
    public final TextView tvGenre;
    public final TextView tvTitle;

    private AimItemHomeSongCardBinding(LinearLayout linearLayout, SquareFrameLayout squareFrameLayout, View view, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.coverBox = squareFrameLayout;
        this.coverPlaceholder = view;
        this.ivCover = imageView;
        this.tvGenre = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemHomeSongCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemHomeSongCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_home_song_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemHomeSongCardBinding bind(View view) {
        View findChildViewById;
        int i = R.id.coverBox;
        SquareFrameLayout squareFrameLayout = (SquareFrameLayout) ViewBindings.findChildViewById(view, i);
        if (squareFrameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.coverPlaceholder))) != null) {
            i = R.id.ivCover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvGenre;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new AimItemHomeSongCardBinding((LinearLayout) view, squareFrameLayout, findChildViewById, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
