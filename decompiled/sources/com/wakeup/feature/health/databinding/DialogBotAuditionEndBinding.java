package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogBotAuditionEndBinding implements ViewBinding {
    public final TextView btnLeft;
    public final TextView btnRight;
    public final View line;
    private final FrameLayout rootView;
    public final TextView tvTip;
    public final TextView tvTitle;

    private DialogBotAuditionEndBinding(FrameLayout frameLayout, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.btnLeft = textView;
        this.btnRight = textView2;
        this.line = view;
        this.tvTip = textView3;
        this.tvTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogBotAuditionEndBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBotAuditionEndBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bot_audition_end, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBotAuditionEndBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnLeft;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btnRight;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                i = R.id.tvTip;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tvTitle;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        return new DialogBotAuditionEndBinding((FrameLayout) view, textView, textView2, findChildViewById, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
