package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.core.web.FullScreenLayer;
import com.phancy.mini.widget.LoadingIndicator;
import com.phancy.mini.widget.ToastView;

/* loaded from: classes17.dex */
public final class MiniMainActivityBinding implements ViewBinding {
    public final FrameLayout container;
    public final LoadingIndicator loadingIndicator;
    public final RelativeLayout miniContent;
    public final FullScreenLayer miniFullScreenLayer;
    private final RelativeLayout rootView;
    public final FrameLayout tabContainer;
    public final ToastView toastView;

    private MiniMainActivityBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, LoadingIndicator loadingIndicator, RelativeLayout relativeLayout2, FullScreenLayer fullScreenLayer, FrameLayout frameLayout2, ToastView toastView) {
        this.rootView = relativeLayout;
        this.container = frameLayout;
        this.loadingIndicator = loadingIndicator;
        this.miniContent = relativeLayout2;
        this.miniFullScreenLayer = fullScreenLayer;
        this.tabContainer = frameLayout2;
        this.toastView = toastView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MiniMainActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniMainActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_main_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniMainActivityBinding bind(View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.loading_indicator;
            LoadingIndicator loadingIndicator = (LoadingIndicator) ViewBindings.findChildViewById(view, i);
            if (loadingIndicator != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.mini_full_screen_layer;
                FullScreenLayer fullScreenLayer = (FullScreenLayer) ViewBindings.findChildViewById(view, i);
                if (fullScreenLayer != null) {
                    i = R.id.tab_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = R.id.toast_view;
                        ToastView toastView = (ToastView) ViewBindings.findChildViewById(view, i);
                        if (toastView != null) {
                            return new MiniMainActivityBinding(relativeLayout, frameLayout, loadingIndicator, relativeLayout, fullScreenLayer, frameLayout2, toastView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
