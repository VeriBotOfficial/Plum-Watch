package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class ItemCourseCommentBinding implements ViewBinding {
    public final View divider;
    public final ShapeableImageView ivHead;
    private final ConstraintLayout rootView;
    public final TextView tvCommentContent;
    public final TextView tvCommentDate;
    public final TextView tvCommentPraise;
    public final TextView tvCommentTitle;

    private ItemCourseCommentBinding(ConstraintLayout constraintLayout, View view, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.ivHead = shapeableImageView;
        this.tvCommentContent = textView;
        this.tvCommentDate = textView2;
        this.tvCommentPraise = textView3;
        this.tvCommentTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCourseCommentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCourseCommentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_course_comment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCourseCommentBinding bind(View view) {
        int i = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.ivHead;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = R.id.tv_comment_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_comment_date;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_comment_praise;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_comment_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ItemCourseCommentBinding((ConstraintLayout) view, findChildViewById, shapeableImageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
