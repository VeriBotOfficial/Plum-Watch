package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsDailyHomeAudioBarBinding implements ViewBinding {
    public final LinearLayout newsDailyAudioBar;
    public final ImageView newsDailyBarCover;
    public final TextView newsDailyBarDuration;
    public final TextView newsDailyBarRecentLabel;
    public final TextView newsDailyBarSummary;
    public final TextView newsDailyBarTitle;
    private final LinearLayout rootView;

    private NewsDailyHomeAudioBarBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.newsDailyAudioBar = linearLayout2;
        this.newsDailyBarCover = imageView;
        this.newsDailyBarDuration = textView;
        this.newsDailyBarRecentLabel = textView2;
        this.newsDailyBarSummary = textView3;
        this.newsDailyBarTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NewsDailyHomeAudioBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsDailyHomeAudioBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_daily_home_audio_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsDailyHomeAudioBarBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.news_daily_bar_cover;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.news_daily_bar_duration;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.news_daily_bar_recent_label;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.news_daily_bar_summary;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.news_daily_bar_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new NewsDailyHomeAudioBarBinding(linearLayout, linearLayout, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
