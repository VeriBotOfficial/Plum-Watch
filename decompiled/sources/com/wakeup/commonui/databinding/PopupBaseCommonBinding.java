package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class PopupBaseCommonBinding implements ViewBinding {
    public final LinearLayoutCompat commonContentArea;
    private final LinearLayoutCompat rootView;

    private PopupBaseCommonBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.commonContentArea = linearLayoutCompat2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static PopupBaseCommonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PopupBaseCommonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.popup_base_common, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PopupBaseCommonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        return new PopupBaseCommonBinding(linearLayoutCompat, linearLayoutCompat);
    }
}
