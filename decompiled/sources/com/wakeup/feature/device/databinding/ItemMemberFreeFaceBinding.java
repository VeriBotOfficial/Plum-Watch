package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemMemberFreeFaceBinding implements ViewBinding {
    public final ShapeableImageView ivFace;
    private final LinearLayout rootView;
    public final TextView tvFaceName;

    private ItemMemberFreeFaceBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, TextView textView) {
        this.rootView = linearLayout;
        this.ivFace = shapeableImageView;
        this.tvFaceName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMemberFreeFaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMemberFreeFaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_member_free_face, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemMemberFreeFaceBinding bind(View view) {
        int i = R.id.iv_face;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.tv_face_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemMemberFreeFaceBinding((LinearLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
