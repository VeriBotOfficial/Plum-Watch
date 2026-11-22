package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimItemLyricsPageBinding implements ViewBinding {
    public final ImageView ivSeek;
    public final LinearLayout lineContainer;
    private final LinearLayout rootView;
    public final LinearLayout seekBox;
    public final TextView tvLine;
    public final TextView tvLineTime;

    private AimItemLyricsPageBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivSeek = imageView;
        this.lineContainer = linearLayout2;
        this.seekBox = linearLayout3;
        this.tvLine = textView;
        this.tvLineTime = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemLyricsPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemLyricsPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_lyrics_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemLyricsPageBinding bind(View view) {
        int i = R.id.ivSeek;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.seekBox;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.tvLine;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvLineTime;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new AimItemLyricsPageBinding(linearLayout, imageView, linearLayout, linearLayout2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
