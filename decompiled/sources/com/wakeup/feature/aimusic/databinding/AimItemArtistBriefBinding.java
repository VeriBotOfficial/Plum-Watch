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
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimItemArtistBriefBinding implements ViewBinding {
    public final FrameLayout avatarBox;
    public final ImageView ivAvatar;
    private final LinearLayout rootView;
    public final TextView tvAvatarInitial;
    public final TextView tvName;

    private AimItemArtistBriefBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.avatarBox = frameLayout;
        this.ivAvatar = imageView;
        this.tvAvatarInitial = textView;
        this.tvName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemArtistBriefBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemArtistBriefBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_artist_brief, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemArtistBriefBinding bind(View view) {
        int i = R.id.avatarBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivAvatar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvAvatarInitial;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new AimItemArtistBriefBinding((LinearLayout) view, frameLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
