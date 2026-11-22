package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityBreathTrainBinding implements ViewBinding {
    public final ImageView btnBack;
    public final Button btnFinish;
    public final Button btnShare;
    public final Group groupMusic;
    public final Group groupShare;
    public final ImageView ivCircle;
    public final ImageView ivCover;
    public final ImageView ivSelect;
    public final View line;
    private final ConstraintLayout rootView;
    public final TextView tvDuration;
    public final TextView tvFinish01;
    public final TextView tvFinish02;
    public final TextView tvFinish03;
    public final TextView tvMin;
    public final TextView tvMusicName;
    public final TextView tvNum;
    public final TextView tvRelax;
    public final TextView tvTitle;

    private ActivityBreathTrainBinding(ConstraintLayout constraintLayout, ImageView imageView, Button button, Button button2, Group group, Group group2, ImageView imageView2, ImageView imageView3, ImageView imageView4, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = constraintLayout;
        this.btnBack = imageView;
        this.btnFinish = button;
        this.btnShare = button2;
        this.groupMusic = group;
        this.groupShare = group2;
        this.ivCircle = imageView2;
        this.ivCover = imageView3;
        this.ivSelect = imageView4;
        this.line = view;
        this.tvDuration = textView;
        this.tvFinish01 = textView2;
        this.tvFinish02 = textView3;
        this.tvFinish03 = textView4;
        this.tvMin = textView5;
        this.tvMusicName = textView6;
        this.tvNum = textView7;
        this.tvRelax = textView8;
        this.tvTitle = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBreathTrainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBreathTrainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_breath_train, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityBreathTrainBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnFinish;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.btnShare;
                Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                if (button2 != null) {
                    i = R.id.groupMusic;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = R.id.groupShare;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = R.id.ivCircle;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.ivCover;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.ivSelect;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                                        i = R.id.tvDuration;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = R.id.tvFinish01;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = R.id.tvFinish02;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = R.id.tvFinish03;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        i = R.id.tvMin;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView5 != null) {
                                                            i = R.id.tvMusicName;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView6 != null) {
                                                                i = R.id.tvNum;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView7 != null) {
                                                                    i = R.id.tvRelax;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tvTitle;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView9 != null) {
                                                                            return new ActivityBreathTrainBinding((ConstraintLayout) view, imageView, button, button2, group, group2, imageView2, imageView3, imageView4, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
