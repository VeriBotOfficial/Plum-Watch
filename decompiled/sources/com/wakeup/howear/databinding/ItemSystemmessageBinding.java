package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemSystemmessageBinding implements ViewBinding {
    public final ShapeableImageView ivAvatar;
    public final LinearLayout llMain;
    private final LinearLayout rootView;
    public final TextView tvContent;
    public final TextView tvCount;
    public final TextView tvName;
    public final TextView tvTime;

    private ItemSystemmessageBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.ivAvatar = shapeableImageView;
        this.llMain = linearLayout2;
        this.tvContent = textView;
        this.tvCount = textView2;
        this.tvName = textView3;
        this.tvTime = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemSystemmessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSystemmessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_systemmessage, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSystemmessageBinding bind(View view) {
        int i = R.id.ivAvatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.ll_main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_count;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tvTime;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ItemSystemmessageBinding((LinearLayout) view, shapeableImageView, linearLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
