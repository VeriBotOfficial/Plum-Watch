package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsItemHistoryBinding implements ViewBinding {
    public final FrameLayout btnPlay;
    public final LinearLayout contentArea;
    public final LinearLayout itemRoot;
    public final ImageView ivCover;
    public final ImageView ivPlay;
    private final LinearLayout rootView;
    public final TextView tvDateTitle;
    public final TextView tvDuration;
    public final TextView tvSummary;
    public final TextView tvTodayBadge;
    public final LinearLayout wave;
    public final View wave0;
    public final View wave1;
    public final View wave2;

    private NewsItemHistoryBinding(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout4, View view, View view2, View view3) {
        this.rootView = linearLayout;
        this.btnPlay = frameLayout;
        this.contentArea = linearLayout2;
        this.itemRoot = linearLayout3;
        this.ivCover = imageView;
        this.ivPlay = imageView2;
        this.tvDateTitle = textView;
        this.tvDuration = textView2;
        this.tvSummary = textView3;
        this.tvTodayBadge = textView4;
        this.wave = linearLayout4;
        this.wave0 = view;
        this.wave1 = view2;
        this.wave2 = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NewsItemHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsItemHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_item_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsItemHistoryBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.btnPlay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.contentArea;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = R.id.ivCover;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivPlay;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.tvDateTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tvDuration;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tvSummary;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tvTodayBadge;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.wave;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.wave0))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.wave1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.wave2))) != null) {
                                            return new NewsItemHistoryBinding(linearLayout2, frameLayout, linearLayout, linearLayout2, imageView, imageView2, textView, textView2, textView3, textView4, linearLayout3, findChildViewById, findChildViewById2, findChildViewById3);
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
