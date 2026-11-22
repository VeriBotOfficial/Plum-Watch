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
public final class AimItemMyPlaylistBinding implements ViewBinding {
    public final FrameLayout coverBox;
    public final View coverPlaceholder;
    public final ImageView ivCover;
    private final LinearLayout rootView;
    public final TextView tvCount;
    public final TextView tvTitle;

    private AimItemMyPlaylistBinding(LinearLayout linearLayout, FrameLayout frameLayout, View view, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.coverBox = frameLayout;
        this.coverPlaceholder = view;
        this.ivCover = imageView;
        this.tvCount = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemMyPlaylistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemMyPlaylistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_my_playlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemMyPlaylistBinding bind(View view) {
        View findChildViewById;
        int i = R.id.coverBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.coverPlaceholder))) != null) {
            i = R.id.ivCover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvCount;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new AimItemMyPlaylistBinding((LinearLayout) view, frameLayout, findChildViewById, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
