package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class DialogApproveFollowBinding implements ViewBinding {
    public final Button btFollow;
    public final View contentBg;
    public final ImageView ivClose;
    public final ShapeableImageView ivIcon;
    private final LinearLayout rootView;
    public final TextView tvFollowCount;
    public final TextView tvFollowPlayCount;
    public final TextView tvFollowTip;
    public final TextView tvFollowUpdateCount;
    public final TextView tvPlayTime;
    public final TextView tvTotalTime;

    private DialogApproveFollowBinding(LinearLayout linearLayout, Button button, View view, ImageView imageView, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.btFollow = button;
        this.contentBg = view;
        this.ivClose = imageView;
        this.ivIcon = shapeableImageView;
        this.tvFollowCount = textView;
        this.tvFollowPlayCount = textView2;
        this.tvFollowTip = textView3;
        this.tvFollowUpdateCount = textView4;
        this.tvPlayTime = textView5;
        this.tvTotalTime = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogApproveFollowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogApproveFollowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_approve_follow, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogApproveFollowBinding bind(View view) {
        View findChildViewById;
        int i = R.id.bt_follow;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.content_bg))) != null) {
            i = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.iv_icon;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = R.id.tv_follow_count;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_follow_play_count;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_follow_tip;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.tv_follow_update_count;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R.id.tv_play_time;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R.id.tv_total_time;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new DialogApproveFollowBinding((LinearLayout) view, button, findChildViewById, imageView, shapeableImageView, textView, textView2, textView3, textView4, textView5, textView6);
                                        }
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
