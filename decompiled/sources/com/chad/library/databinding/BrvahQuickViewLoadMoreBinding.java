package com.chad.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.chad.library.R;

/* loaded from: classes14.dex */
public final class BrvahQuickViewLoadMoreBinding implements ViewBinding {
    public final FrameLayout loadMoreLoadCompleteView;
    public final FrameLayout loadMoreLoadEndView;
    public final FrameLayout loadMoreLoadFailView;
    public final LinearLayout loadMoreLoadingView;
    public final ProgressBar loadingProgress;
    public final TextView loadingText;
    private final FrameLayout rootView;
    public final TextView tvPrompt;

    private BrvahQuickViewLoadMoreBinding(FrameLayout rootView, FrameLayout loadMoreLoadCompleteView, FrameLayout loadMoreLoadEndView, FrameLayout loadMoreLoadFailView, LinearLayout loadMoreLoadingView, ProgressBar loadingProgress, TextView loadingText, TextView tvPrompt) {
        this.rootView = rootView;
        this.loadMoreLoadCompleteView = loadMoreLoadCompleteView;
        this.loadMoreLoadEndView = loadMoreLoadEndView;
        this.loadMoreLoadFailView = loadMoreLoadFailView;
        this.loadMoreLoadingView = loadMoreLoadingView;
        this.loadingProgress = loadingProgress;
        this.loadingText = loadingText;
        this.tvPrompt = tvPrompt;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static BrvahQuickViewLoadMoreBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BrvahQuickViewLoadMoreBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.brvah_quick_view_load_more, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BrvahQuickViewLoadMoreBinding bind(View rootView) {
        int i = R.id.load_more_load_complete_view;
        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(i);
        if (frameLayout != null) {
            i = R.id.load_more_load_end_view;
            FrameLayout frameLayout2 = (FrameLayout) rootView.findViewById(i);
            if (frameLayout2 != null) {
                i = R.id.load_more_load_fail_view;
                FrameLayout frameLayout3 = (FrameLayout) rootView.findViewById(i);
                if (frameLayout3 != null) {
                    i = R.id.load_more_loading_view;
                    LinearLayout linearLayout = (LinearLayout) rootView.findViewById(i);
                    if (linearLayout != null) {
                        i = R.id.loading_progress;
                        ProgressBar progressBar = (ProgressBar) rootView.findViewById(i);
                        if (progressBar != null) {
                            i = R.id.loading_text;
                            TextView textView = (TextView) rootView.findViewById(i);
                            if (textView != null) {
                                i = R.id.tv_prompt;
                                TextView textView2 = (TextView) rootView.findViewById(i);
                                if (textView2 != null) {
                                    return new BrvahQuickViewLoadMoreBinding((FrameLayout) rootView, frameLayout, frameLayout2, frameLayout3, linearLayout, progressBar, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
