package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityBarrageSelectBinding implements ViewBinding {
    public final LinearLayoutCompat emojiBarrageLl;
    public final MyTitleBar mTopBar;
    private final LinearLayoutCompat rootView;
    public final LinearLayoutCompat textBarrageLl;

    private ActivityBarrageSelectBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, MyTitleBar myTitleBar, LinearLayoutCompat linearLayoutCompat3) {
        this.rootView = linearLayoutCompat;
        this.emojiBarrageLl = linearLayoutCompat2;
        this.mTopBar = myTitleBar;
        this.textBarrageLl = linearLayoutCompat3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityBarrageSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBarrageSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_barrage_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBarrageSelectBinding bind(View view) {
        int i = R.id.emoji_barrage_ll;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.mTopBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.text_barrage_ll;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    return new ActivityBarrageSelectBinding((LinearLayoutCompat) view, linearLayoutCompat, myTitleBar, linearLayoutCompat2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
