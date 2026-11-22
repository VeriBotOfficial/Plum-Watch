package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.course.R;
import xyz.doikki.videoplayer.player.VideoView;

/* loaded from: classes2.dex */
public final class LayoutVideoViewBinding implements ViewBinding {
    private final VideoView rootView;

    private LayoutVideoViewBinding(VideoView videoView) {
        this.rootView = videoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public VideoView getRoot() {
        return this.rootView;
    }

    public static LayoutVideoViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVideoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_video_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutVideoViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new LayoutVideoViewBinding((VideoView) view);
    }
}
