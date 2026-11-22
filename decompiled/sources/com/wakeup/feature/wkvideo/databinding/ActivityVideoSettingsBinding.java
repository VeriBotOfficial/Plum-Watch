package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class ActivityVideoSettingsBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final Switch switch1;
    public final Switch switch2;
    public final MyTitleBar titleBar;

    private ActivityVideoSettingsBinding(LinearLayoutCompat linearLayoutCompat, Switch r2, Switch r3, MyTitleBar myTitleBar) {
        this.rootView = linearLayoutCompat;
        this.switch1 = r2;
        this.switch2 = r3;
        this.titleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityVideoSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVideoSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityVideoSettingsBinding bind(View view) {
        int i = R.id.switch_1;
        Switch r1 = (Switch) ViewBindings.findChildViewById(view, i);
        if (r1 != null) {
            i = R.id.switch_2;
            Switch r2 = (Switch) ViewBindings.findChildViewById(view, i);
            if (r2 != null) {
                i = R.id.title_bar;
                MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                if (myTitleBar != null) {
                    return new ActivityVideoSettingsBinding((LinearLayoutCompat) view, r1, r2, myTitleBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
