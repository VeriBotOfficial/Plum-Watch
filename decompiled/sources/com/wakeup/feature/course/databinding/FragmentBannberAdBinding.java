package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.course.R;
import com.youth.banner.Banner;

/* loaded from: classes2.dex */
public final class FragmentBannberAdBinding implements ViewBinding {
    public final Banner banner;
    private final CardView rootView;

    private FragmentBannberAdBinding(CardView cardView, Banner banner) {
        this.rootView = cardView;
        this.banner = banner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static FragmentBannberAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBannberAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bannber_ad, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBannberAdBinding bind(View view) {
        int i = R.id.banner;
        Banner banner = (Banner) ViewBindings.findChildViewById(view, i);
        if (banner != null) {
            return new FragmentBannberAdBinding((CardView) view, banner);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
