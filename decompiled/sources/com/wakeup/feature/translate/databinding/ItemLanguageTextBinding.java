package com.wakeup.feature.translate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.translate.R;

/* loaded from: classes3.dex */
public final class ItemLanguageTextBinding implements ViewBinding {
    private final LinearLayoutCompat rootView;
    public final TextView tvLanguage;

    private ItemLanguageTextBinding(LinearLayoutCompat linearLayoutCompat, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.tvLanguage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ItemLanguageTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemLanguageTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_language_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemLanguageTextBinding bind(View view) {
        int i = R.id.tv_language;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new ItemLanguageTextBinding((LinearLayoutCompat) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
