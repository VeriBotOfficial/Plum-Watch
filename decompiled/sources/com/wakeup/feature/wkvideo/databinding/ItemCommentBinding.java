package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class ItemCommentBinding implements ViewBinding {
    public final ShapeableImageView ivCommentAvatar;
    public final ImageView ivCommentLike;
    public final LinearLayout layoutCommentContent;
    public final LinearLayout layoutSubComments;
    private final ConstraintLayout rootView;
    public final TextView tvCommentContent;
    public final TextView tvCommentLikeCount;
    public final TextView tvCommentReplyBtn;
    public final TextView tvCommentTime;
    public final TextView tvCommentUserName;
    public final TextView tvViewMoreReplies;

    private ItemCommentBinding(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.ivCommentAvatar = shapeableImageView;
        this.ivCommentLike = imageView;
        this.layoutCommentContent = linearLayout;
        this.layoutSubComments = linearLayout2;
        this.tvCommentContent = textView;
        this.tvCommentLikeCount = textView2;
        this.tvCommentReplyBtn = textView3;
        this.tvCommentTime = textView4;
        this.tvCommentUserName = textView5;
        this.tvViewMoreReplies = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCommentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCommentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_comment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCommentBinding bind(View view) {
        int i = R.id.iv_comment_avatar;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = R.id.iv_comment_like;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layout_comment_content;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.layout_sub_comments;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.tv_comment_content;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_comment_like_count;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_comment_reply_btn;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.tv_comment_time;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R.id.tv_comment_user_name;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = R.id.tv_view_more_replies;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                return new ItemCommentBinding((ConstraintLayout) view, shapeableImageView, imageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6);
                                            }
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
