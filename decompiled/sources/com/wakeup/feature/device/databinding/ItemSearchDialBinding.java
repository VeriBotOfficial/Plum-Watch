package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.view.SquareImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemSearchDialBinding implements ViewBinding {
    public final SquareImageView ivImage;
    private final LinearLayout rootView;
    public final TextView tvPrice;
    public final TextView tvTitle;

    private ItemSearchDialBinding(LinearLayout linearLayout, SquareImageView squareImageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.ivImage = squareImageView;
        this.tvPrice = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSearchDialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSearchDialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_search_dial, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSearchDialBinding bind(View view) {
        int i = R.id.iv_image;
        SquareImageView squareImageView = (SquareImageView) ViewBindings.findChildViewById(view, i);
        if (squareImageView != null) {
            i = R.id.tv_price;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new ItemSearchDialBinding((LinearLayout) view, squareImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
