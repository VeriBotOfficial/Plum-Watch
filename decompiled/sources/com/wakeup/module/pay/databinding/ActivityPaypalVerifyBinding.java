package com.wakeup.module.pay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.wakeup.module.pay.R;

/* loaded from: classes4.dex */
public final class ActivityPaypalVerifyBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;

    private ActivityPaypalVerifyBinding(LinearLayoutCompat linearLayoutCompat) {
        this.rootView = linearLayoutCompat;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityPaypalVerifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaypalVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_paypal_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityPaypalVerifyBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ActivityPaypalVerifyBinding((LinearLayoutCompat) view);
    }
}
