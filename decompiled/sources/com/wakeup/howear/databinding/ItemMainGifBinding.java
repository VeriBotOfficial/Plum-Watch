package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.howear.R;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes3.dex */
public final class ItemMainGifBinding implements ViewBinding {
    public final GifImageView icon;
    private final LinearLayoutCompat rootView;

    private ItemMainGifBinding(LinearLayoutCompat linearLayoutCompat, GifImageView gifImageView) {
        this.rootView = linearLayoutCompat;
        this.icon = gifImageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemMainGifBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMainGifBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_main_gif, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMainGifBinding bind(View view) {
        int i = R.id.icon;
        GifImageView gifImageView = (GifImageView) ViewBindings.findChildViewById(view, i);
        if (gifImageView != null) {
            return new ItemMainGifBinding((LinearLayoutCompat) view, gifImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
