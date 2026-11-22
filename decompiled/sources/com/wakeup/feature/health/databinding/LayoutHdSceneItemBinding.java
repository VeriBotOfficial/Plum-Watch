package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class LayoutHdSceneItemBinding implements ViewBinding {
    public final TextView arrow;
    public final TextView badge;
    public final LinearLayout card;
    public final TextView desc;
    public final TextView icon;
    public final TextView name;
    private final FrameLayout rootView;

    private LayoutHdSceneItemBinding(FrameLayout frameLayout, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.arrow = textView;
        this.badge = textView2;
        this.card = linearLayout;
        this.desc = textView3;
        this.icon = textView4;
        this.name = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHdSceneItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHdSceneItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_hd_scene_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHdSceneItemBinding bind(View view) {
        int i = R.id.arrow;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.badge;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.card;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.desc;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.icon;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.name;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                return new LayoutHdSceneItemBinding((FrameLayout) view, textView, textView2, linearLayout, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
