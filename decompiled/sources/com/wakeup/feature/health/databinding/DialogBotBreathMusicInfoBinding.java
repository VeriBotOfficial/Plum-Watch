package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogBotBreathMusicInfoBinding implements ViewBinding {
    public final TextView btnKnow;
    public final LinearLayoutCompat llContent;
    private final FrameLayout rootView;
    public final TextView tvName;

    private DialogBotBreathMusicInfoBinding(FrameLayout frameLayout, TextView textView, LinearLayoutCompat linearLayoutCompat, TextView textView2) {
        this.rootView = frameLayout;
        this.btnKnow = textView;
        this.llContent = linearLayoutCompat;
        this.tvName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogBotBreathMusicInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBotBreathMusicInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bot_breath_music_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBotBreathMusicInfoBinding bind(View view) {
        int i = R.id.btnKnow;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.llContent;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = R.id.tvName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new DialogBotBreathMusicInfoBinding((FrameLayout) view, textView, linearLayoutCompat, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
