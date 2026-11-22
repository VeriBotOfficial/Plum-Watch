package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class LayoutQuceFloatBinding implements ViewBinding {
    public final ImageView quCeFloatImage;
    private final View rootView;

    private LayoutQuceFloatBinding(View view, ImageView imageView) {
        this.rootView = view;
        this.quCeFloatImage = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static LayoutQuceFloatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_quce_float, viewGroup);
        return bind(viewGroup);
    }

    public static LayoutQuceFloatBinding bind(View view) {
        int i = R.id.quCeFloatImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new LayoutQuceFloatBinding(view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
