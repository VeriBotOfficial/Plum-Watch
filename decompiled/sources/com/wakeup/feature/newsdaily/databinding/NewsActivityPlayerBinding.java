package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsActivityPlayerBinding implements ViewBinding {
    public final ImageView btnNext;
    public final FrameLayout btnPlay;
    public final ImageView btnPrev;
    public final LinearLayout controls;
    public final FrameLayout ivBack;
    public final ImageView ivCover;
    public final ImageView ivPlayIcon;
    private final ConstraintLayout rootView;
    public final SeekBar seekBar;
    public final LinearLayout toolbar;
    public final TextView tvCurrentTime;
    public final TextView tvDuration;
    public final TextView tvSubtitle;
    public final TextView tvTitle;
    public final TextView tvTranscript;

    private NewsActivityPlayerBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, LinearLayout linearLayout, FrameLayout frameLayout2, ImageView imageView3, ImageView imageView4, SeekBar seekBar, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.btnNext = imageView;
        this.btnPlay = frameLayout;
        this.btnPrev = imageView2;
        this.controls = linearLayout;
        this.ivBack = frameLayout2;
        this.ivCover = imageView3;
        this.ivPlayIcon = imageView4;
        this.seekBar = seekBar;
        this.toolbar = linearLayout2;
        this.tvCurrentTime = textView;
        this.tvDuration = textView2;
        this.tvSubtitle = textView3;
        this.tvTitle = textView4;
        this.tvTranscript = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static NewsActivityPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsActivityPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_activity_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsActivityPlayerBinding bind(View view) {
        int i = R.id.btnNext;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnPlay;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.btnPrev;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.controls;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.ivBack;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = R.id.ivCover;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.ivPlayIcon;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.seekBar;
                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                                    if (seekBar != null) {
                                        i = R.id.toolbar;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.tvCurrentTime;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.tvDuration;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.tvSubtitle;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.tvTitle;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = R.id.tvTranscript;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView5 != null) {
                                                                return new NewsActivityPlayerBinding((ConstraintLayout) view, imageView, frameLayout, imageView2, linearLayout, frameLayout2, imageView3, imageView4, seekBar, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
