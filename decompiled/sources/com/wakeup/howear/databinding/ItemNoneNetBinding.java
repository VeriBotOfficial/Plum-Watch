package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemNoneNetBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;

    private ItemNoneNetBinding(LinearLayoutCompat linearLayoutCompat) {
        this.rootView = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemNoneNetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemNoneNetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_none_net, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemNoneNetBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ItemNoneNetBinding((LinearLayoutCompat) view);
    }
}
