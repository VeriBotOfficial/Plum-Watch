package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class PopupSleepMusicBinding implements ViewBinding {
    public final LinearLayoutCompat llDelete;
    public final LinearLayoutCompat llRename;
    private final ConstraintLayout rootView;

    private PopupSleepMusicBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = constraintLayout;
        this.llDelete = linearLayoutCompat;
        this.llRename = linearLayoutCompat2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static PopupSleepMusicBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PopupSleepMusicBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.popup_sleep_music, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PopupSleepMusicBinding bind(View view) {
        int i = R.id.ll_delete;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ll_rename;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                return new PopupSleepMusicBinding((ConstraintLayout) view, linearLayoutCompat, linearLayoutCompat2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
