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
import androidx.viewpager2.widget.ViewPager2;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimActivityFeedBinding implements ViewBinding {
    public final LinearLayout btnMode;
    public final LinearLayout header;
    public final View headerEndBalance;
    public final ImageView ivBack;
    public final ImageView ivMine;
    public final ViewPager2 pager;
    public final LinearLayout playlistHeader;
    private final FrameLayout rootView;
    public final TextView tvEmpty;
    public final TextView tvMode;
    public final TextView tvPlayingLabel;
    public final TextView tvPlaylistName;

    private AimActivityFeedBinding(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, View view, ImageView imageView, ImageView imageView2, ViewPager2 viewPager2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.btnMode = linearLayout;
        this.header = linearLayout2;
        this.headerEndBalance = view;
        this.ivBack = imageView;
        this.ivMine = imageView2;
        this.pager = viewPager2;
        this.playlistHeader = linearLayout3;
        this.tvEmpty = textView;
        this.tvMode = textView2;
        this.tvPlayingLabel = textView3;
        this.tvPlaylistName = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static AimActivityFeedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimActivityFeedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_activity_feed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimActivityFeedBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnMode;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.header;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.headerEndBalance))) != null) {
                i = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivMine;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.pager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            i = R.id.playlistHeader;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = R.id.tvEmpty;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tvMode;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tvPlayingLabel;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tvPlaylistName;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new AimActivityFeedBinding((FrameLayout) view, linearLayout, linearLayout2, findChildViewById, imageView, imageView2, viewPager2, linearLayout3, textView, textView2, textView3, textView4);
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
