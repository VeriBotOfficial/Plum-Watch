package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimItemHomeRecoSongsBinding implements ViewBinding {
    public final LinearLayout llRecoExpanded;
    public final FrameLayout recoSong0;
    public final FrameLayout recoSong1;
    public final FrameLayout recoSong2;
    public final FrameLayout recoSong3;
    private final LinearLayout rootView;

    private AimItemHomeRecoSongsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.rootView = linearLayout;
        this.llRecoExpanded = linearLayout2;
        this.recoSong0 = frameLayout;
        this.recoSong1 = frameLayout2;
        this.recoSong2 = frameLayout3;
        this.recoSong3 = frameLayout4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AimItemHomeRecoSongsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemHomeRecoSongsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_home_reco_songs, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemHomeRecoSongsBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.recoSong0;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.recoSong1;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.recoSong2;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout3 != null) {
                    i = R.id.recoSong3;
                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout4 != null) {
                        return new AimItemHomeRecoSongsBinding(linearLayout, linearLayout, frameLayout, frameLayout2, frameLayout3, frameLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
