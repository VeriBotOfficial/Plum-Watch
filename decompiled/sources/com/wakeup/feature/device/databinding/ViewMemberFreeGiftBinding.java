package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ViewMemberFreeGiftBinding implements ViewBinding {
    public final ItemMemberFreeFaceBinding face1;
    public final ItemMemberFreeFaceBinding face2;
    public final ItemMemberFreeFaceBinding face3;
    public final FrameLayout flMemberFreeRoot;
    public final ImageView ivMemberFreeClose;
    public final LinearLayout llMemberFreeFaces;
    private final FrameLayout rootView;
    public final TextView tvMemberFreeCta;
    public final TextView tvMemberFreeSubtitle;
    public final TextView tvMemberFreeTitle;

    private ViewMemberFreeGiftBinding(FrameLayout frameLayout, ItemMemberFreeFaceBinding itemMemberFreeFaceBinding, ItemMemberFreeFaceBinding itemMemberFreeFaceBinding2, ItemMemberFreeFaceBinding itemMemberFreeFaceBinding3, FrameLayout frameLayout2, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.face1 = itemMemberFreeFaceBinding;
        this.face2 = itemMemberFreeFaceBinding2;
        this.face3 = itemMemberFreeFaceBinding3;
        this.flMemberFreeRoot = frameLayout2;
        this.ivMemberFreeClose = imageView;
        this.llMemberFreeFaces = linearLayout;
        this.tvMemberFreeCta = textView;
        this.tvMemberFreeSubtitle = textView2;
        this.tvMemberFreeTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ViewMemberFreeGiftBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewMemberFreeGiftBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_member_free_gift, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewMemberFreeGiftBinding bind(View view) {
        int i = R.id.face_1;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ItemMemberFreeFaceBinding bind = ItemMemberFreeFaceBinding.bind(findChildViewById);
            i = R.id.face_2;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                ItemMemberFreeFaceBinding bind2 = ItemMemberFreeFaceBinding.bind(findChildViewById2);
                i = R.id.face_3;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    ItemMemberFreeFaceBinding bind3 = ItemMemberFreeFaceBinding.bind(findChildViewById3);
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.iv_member_free_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ll_member_free_faces;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.tv_member_free_cta;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_member_free_subtitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_member_free_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new ViewMemberFreeGiftBinding(frameLayout, bind, bind2, bind3, frameLayout, imageView, linearLayout, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
