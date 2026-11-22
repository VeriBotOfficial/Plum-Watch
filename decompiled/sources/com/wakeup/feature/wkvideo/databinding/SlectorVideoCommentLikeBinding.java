package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class SlectorVideoCommentLikeBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private SlectorVideoCommentLikeBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SlectorVideoCommentLikeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SlectorVideoCommentLikeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.slector_video_comment_like, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static SlectorVideoCommentLikeBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new SlectorVideoCommentLikeBinding((ConstraintLayout) view);
    }
}
