package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class PopupMusicDelBinding implements ViewBinding {
    public final LinearLayout llDelete;
    private final LinearLayout rootView;

    private PopupMusicDelBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llDelete = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static PopupMusicDelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PopupMusicDelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.popup_music_del, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PopupMusicDelBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new PopupMusicDelBinding(linearLayout, linearLayout);
    }
}
