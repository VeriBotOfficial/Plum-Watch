package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimActivityArtistBinding implements ViewBinding {
    public final LinearLayout btnPlayAll;
    public final LinearLayout introRow;
    public final ImageView ivBack;
    public final ImageView ivBackground;
    private final FrameLayout rootView;
    public final RecyclerView rvSimilar;
    public final RecyclerView rvSongs;
    public final LinearLayout songCard;
    public final TextView tvCount;
    public final TextView tvIntro;
    public final TextView tvName;
    public final TextView tvSimilarTitle;
    public final TextView tvSongTitle;

    private AimActivityArtistBinding(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.btnPlayAll = linearLayout;
        this.introRow = linearLayout2;
        this.ivBack = imageView;
        this.ivBackground = imageView2;
        this.rvSimilar = recyclerView;
        this.rvSongs = recyclerView2;
        this.songCard = linearLayout3;
        this.tvCount = textView;
        this.tvIntro = textView2;
        this.tvName = textView3;
        this.tvSimilarTitle = textView4;
        this.tvSongTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static AimActivityArtistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimActivityArtistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_activity_artist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimActivityArtistBinding bind(View view) {
        int i = R.id.btnPlayAll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.introRow;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivBackground;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.rvSimilar;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.rvSongs;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                i = R.id.songCard;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.tvCount;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tvIntro;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.tvName;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.tvSimilarTitle;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.tvSongTitle;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        return new AimActivityArtistBinding((FrameLayout) view, linearLayout, linearLayout2, imageView, imageView2, recyclerView, recyclerView2, linearLayout3, textView, textView2, textView3, textView4, textView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
