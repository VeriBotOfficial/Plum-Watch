package com.wakeup.feature.user.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.user.R;

/* loaded from: classes3.dex */
public final class ItemInterestLabelBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final AppCompatTextView tvILItem;

    private ItemInterestLabelBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.tvILItem = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemInterestLabelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemInterestLabelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_interest_label, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemInterestLabelBinding bind(View view) {
        int i = R.id.tv_i_l_item;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            return new ItemInterestLabelBinding((LinearLayoutCompat) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
