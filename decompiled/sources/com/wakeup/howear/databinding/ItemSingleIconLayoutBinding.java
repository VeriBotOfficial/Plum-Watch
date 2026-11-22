package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ItemSingleIconLayoutBinding implements ViewBinding {
    public final ConstraintLayout clMsg;
    public final ShapeableImageView ivMsg;
    private final ConstraintLayout rootView;
    public final TextView tvMsgCenterDate;
    public final TextView tvMsgContent;
    public final TextView tvMsgMore;
    public final TextView tvMsgTitle;

    private ItemSingleIconLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.clMsg = constraintLayout2;
        this.ivMsg = shapeableImageView;
        this.tvMsgCenterDate = textView;
        this.tvMsgContent = textView2;
        this.tvMsgMore = textView3;
        this.tvMsgTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSingleIconLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSingleIconLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_single_icon_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSingleIconLayoutBinding bind(View view) {
        int i = R.id.cl_msg;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.iv_msg;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = R.id.tv_msg_center_date;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_msg_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_msg_more;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_msg_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ItemSingleIconLayoutBinding((ConstraintLayout) view, constraintLayout, shapeableImageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
