package com.wakeup.feature.aimusic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.aimusic.R;

/* loaded from: classes2.dex */
public final class AimItemKeywordBinding implements ViewBinding {
    private final TextView rootView;

    private AimItemKeywordBinding(TextView textView) {
        this.rootView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static AimItemKeywordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AimItemKeywordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.aim_item_keyword, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AimItemKeywordBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new AimItemKeywordBinding((TextView) view);
    }
}
