package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;

/* loaded from: classes17.dex */
public final class MiniCapsuleLayoutBinding implements ViewBinding {
    public final FrameLayout capsule;
    public final FrameLayout capsuleBar;
    public final View center;
    public final RelativeLayout close;
    public final RelativeLayout more;
    private final FrameLayout rootView;

    private MiniCapsuleLayoutBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, View view, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.rootView = frameLayout;
        this.capsule = frameLayout2;
        this.capsuleBar = frameLayout3;
        this.center = view;
        this.close = relativeLayout;
        this.more = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static MiniCapsuleLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniCapsuleLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_capsule_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniCapsuleLayoutBinding bind(View view) {
        int i = R.id.capsule;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            FrameLayout frameLayout2 = (FrameLayout) view;
            i = R.id.center;
            View findChildViewById = ViewBindings.findChildViewById(view, i);
            if (findChildViewById != null) {
                i = R.id.close;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.more;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        return new MiniCapsuleLayoutBinding(frameLayout2, frameLayout, frameLayout2, findChildViewById, relativeLayout, relativeLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
