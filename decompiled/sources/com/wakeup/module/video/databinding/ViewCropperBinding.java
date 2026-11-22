package com.wakeup.module.video.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.canhub.cropper.CropImageView;
import com.wakeup.module.video.R;
import com.wakeup.module.video.view.TimeLineView;

/* loaded from: classes4.dex */
public final class ViewCropperBinding implements ViewBinding {
    public final CropImageView cropFrame;
    public final SeekBar cropSeekbar;
    public final SeekBar handlerTop;
    private final RelativeLayout rootView;
    public final LinearLayout seekerFrame;
    public final FrameLayout timeLineFrame;
    public final TimeLineView timeLineView;

    private ViewCropperBinding(RelativeLayout relativeLayout, CropImageView cropImageView, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, FrameLayout frameLayout, TimeLineView timeLineView) {
        this.rootView = relativeLayout;
        this.cropFrame = cropImageView;
        this.cropSeekbar = seekBar;
        this.handlerTop = seekBar2;
        this.seekerFrame = linearLayout;
        this.timeLineFrame = frameLayout;
        this.timeLineView = timeLineView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ViewCropperBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewCropperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_cropper, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ViewCropperBinding bind(View view) {
        int i = R.id.cropFrame;
        CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(view, i);
        if (cropImageView != null) {
            i = R.id.cropSeekbar;
            SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
            if (seekBar != null) {
                i = R.id.handlerTop;
                SeekBar seekBar2 = (SeekBar) ViewBindings.findChildViewById(view, i);
                if (seekBar2 != null) {
                    i = R.id.seekerFrame;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.timeLineFrame;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.timeLineView;
                            TimeLineView timeLineView = (TimeLineView) ViewBindings.findChildViewById(view, i);
                            if (timeLineView != null) {
                                return new ViewCropperBinding((RelativeLayout) view, cropImageView, seekBar, seekBar2, linearLayout, frameLayout, timeLineView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
