package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class LayoutTextRoundCornerProgressBarBinding implements ViewBinding {
    public final LinearLayout layoutBackground;
    public final LinearLayout layoutProgress;
    public final LinearLayout layoutSecondaryProgress;
    private final LinearLayout rootView;
    public final TextView tvProgress;

    private LayoutTextRoundCornerProgressBarBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView) {
        this.rootView = linearLayout;
        this.layoutBackground = linearLayout2;
        this.layoutProgress = linearLayout3;
        this.layoutSecondaryProgress = linearLayout4;
        this.tvProgress = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutTextRoundCornerProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTextRoundCornerProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_text_round_corner_progress_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutTextRoundCornerProgressBarBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.layout_progress;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout2 != null) {
            i = R.id.layout_secondary_progress;
            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout3 != null) {
                i = R.id.tv_progress;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new LayoutTextRoundCornerProgressBarBinding(linearLayout, linearLayout, linearLayout2, linearLayout3, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
