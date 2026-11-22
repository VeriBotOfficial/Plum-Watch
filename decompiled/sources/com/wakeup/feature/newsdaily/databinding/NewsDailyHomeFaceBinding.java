package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsDailyHomeFaceBinding implements ViewBinding {
    public final FrameLayout newsDailyEyeLeft;
    public final FrameLayout newsDailyEyeRight;
    public final FrameLayout newsDailyFaceRoot;
    public final FrameLayout newsDailyPupilLeft;
    public final FrameLayout newsDailyPupilRight;
    public final LinearLayout newsDailyToastEyes;
    public final FrameLayout newsDailyToastFaceClip;
    public final FrameLayout newsDailyToastMascot;
    private final FrameLayout rootView;

    private NewsDailyHomeFaceBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, LinearLayout linearLayout, FrameLayout frameLayout7, FrameLayout frameLayout8) {
        this.rootView = frameLayout;
        this.newsDailyEyeLeft = frameLayout2;
        this.newsDailyEyeRight = frameLayout3;
        this.newsDailyFaceRoot = frameLayout4;
        this.newsDailyPupilLeft = frameLayout5;
        this.newsDailyPupilRight = frameLayout6;
        this.newsDailyToastEyes = linearLayout;
        this.newsDailyToastFaceClip = frameLayout7;
        this.newsDailyToastMascot = frameLayout8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static NewsDailyHomeFaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsDailyHomeFaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_daily_home_face, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsDailyHomeFaceBinding bind(View view) {
        int i = R.id.news_daily_eye_left;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.news_daily_eye_right;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                FrameLayout frameLayout3 = (FrameLayout) view;
                i = R.id.news_daily_pupil_left;
                FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout4 != null) {
                    i = R.id.news_daily_pupil_right;
                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout5 != null) {
                        i = R.id.news_daily_toast_eyes;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.news_daily_toast_face_clip;
                            FrameLayout frameLayout6 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout6 != null) {
                                i = R.id.news_daily_toast_mascot;
                                FrameLayout frameLayout7 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout7 != null) {
                                    return new NewsDailyHomeFaceBinding(frameLayout3, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, linearLayout, frameLayout6, frameLayout7);
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
