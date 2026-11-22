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
public final class AimItemPlaylistBinding implements ViewBinding {
    public final FrameLayout coverBox;
    public final ImageView ivCover;
    private final LinearLayout rootView;
    public final TextView tvArtist;
    public final TextView tvCoverInitial;
    public final TextView tvName;
    public final LinearLayout wave;
    public final View wave0;
    public final View wave1;
    public final View wave2;

    private AimItemPlaylistBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, View view, View view2, View view3) {
        this.rootView = linearLayout;
        this.coverBox = frameLayout;
        this.ivCover = imageView;
        this.tvArtist = textView;
        this.tvCoverInitial = textView2;
        this.tvName = textView3;
        this.wave = linearLayout2;
        this.wave0 = view;
        this.wave1 = view2;
        this.wave2 = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemPlaylistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemPlaylistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_playlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemPlaylistBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.coverBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivCover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvArtist;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvCoverInitial;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.wave;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.wave0))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.wave1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.wave2))) != null) {
                                return new AimItemPlaylistBinding((LinearLayout) view, frameLayout, imageView, textView, textView2, textView3, linearLayout, findChildViewById, findChildViewById2, findChildViewById3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
