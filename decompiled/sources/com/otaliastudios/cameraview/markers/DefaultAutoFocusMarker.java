package com.otaliastudios.cameraview.markers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.otaliastudios.cameraview.R;

/* loaded from: classes17.dex */
public class DefaultAutoFocusMarker implements AutoFocusMarker {
    View mContainer;
    View mFill;

    @Override // com.otaliastudios.cameraview.markers.Marker
    public View onAttach(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_layout_focus_marker, viewGroup, false);
        this.mContainer = inflate.findViewById(R.id.focusMarkerContainer);
        this.mFill = inflate.findViewById(R.id.focusMarkerFill);
        return inflate;
    }

    @Override // com.otaliastudios.cameraview.markers.AutoFocusMarker
    public void onAutoFocusStart(AutoFocusTrigger autoFocusTrigger, PointF pointF) {
        if (autoFocusTrigger == AutoFocusTrigger.METHOD) {
            return;
        }
        this.mContainer.clearAnimation();
        this.mFill.clearAnimation();
        this.mContainer.setScaleX(1.36f);
        this.mContainer.setScaleY(1.36f);
        this.mContainer.setAlpha(1.0f);
        this.mFill.setScaleX(0.0f);
        this.mFill.setScaleY(0.0f);
        this.mFill.setAlpha(1.0f);
        animate(this.mContainer, 1.0f, 1.0f, 300L, 0L, null);
        animate(this.mFill, 1.0f, 1.0f, 300L, 0L, null);
    }

    @Override // com.otaliastudios.cameraview.markers.AutoFocusMarker
    public void onAutoFocusEnd(AutoFocusTrigger autoFocusTrigger, boolean z, PointF pointF) {
        if (autoFocusTrigger == AutoFocusTrigger.METHOD) {
            return;
        }
        if (z) {
            animate(this.mContainer, 1.0f, 0.0f, 500L, 0L, null);
            animate(this.mFill, 1.0f, 0.0f, 500L, 0L, null);
        } else {
            animate(this.mFill, 0.0f, 0.0f, 500L, 0L, null);
            animate(this.mContainer, 1.36f, 1.0f, 500L, 0L, new AnimatorListenerAdapter() { // from class: com.otaliastudios.cameraview.markers.DefaultAutoFocusMarker.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DefaultAutoFocusMarker.animate(DefaultAutoFocusMarker.this.mContainer, 1.36f, 0.0f, 200L, 1000L, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void animate(View view, float f, float f2, long j, long j2, Animator.AnimatorListener animatorListener) {
        view.animate().scaleX(f).scaleY(f).alpha(f2).setDuration(j).setStartDelay(j2).setListener(animatorListener).start();
    }
}
