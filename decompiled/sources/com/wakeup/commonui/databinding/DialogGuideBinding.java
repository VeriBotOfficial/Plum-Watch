package com.wakeup.commonui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.R;

/* loaded from: classes2.dex */
public final class DialogGuideBinding implements ViewBinding {
    public final LinearLayout fifthStep;
    public final LinearLayout firstStep;
    public final LinearLayout fourthStep;
    public final LinearLayout homeTitleSearchContainer;
    public final ImageView iconGuideSeventhTextTipOversize;
    public final ImageView ivGuideFifth;
    public final ImageView ivGuideFirst;
    public final ImageView ivGuideFourth;
    public final ImageView ivGuideImage;
    public final ImageView ivGuideImageText;
    public final ImageView ivGuideSecond;
    public final ImageView ivGuideSeventh;
    public final ImageView ivGuideSeventhTextInterestContent;
    public final ImageView ivGuideSixth;
    public final ImageView ivGuideThird;
    private final RelativeLayout rootView;
    public final LinearLayout secondStep;
    public final LinearLayout secondStep1;
    public final LinearLayout seventhStep;
    public final LinearLayout sixthStep;
    public final LinearLayout thirdStep;
    public final TextView tvGuideSeventhTextTipContent;
    public final View vwGuide;

    private DialogGuideBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView, View view) {
        this.rootView = relativeLayout;
        this.fifthStep = linearLayout;
        this.firstStep = linearLayout2;
        this.fourthStep = linearLayout3;
        this.homeTitleSearchContainer = linearLayout4;
        this.iconGuideSeventhTextTipOversize = imageView;
        this.ivGuideFifth = imageView2;
        this.ivGuideFirst = imageView3;
        this.ivGuideFourth = imageView4;
        this.ivGuideImage = imageView5;
        this.ivGuideImageText = imageView6;
        this.ivGuideSecond = imageView7;
        this.ivGuideSeventh = imageView8;
        this.ivGuideSeventhTextInterestContent = imageView9;
        this.ivGuideSixth = imageView10;
        this.ivGuideThird = imageView11;
        this.secondStep = linearLayout5;
        this.secondStep1 = linearLayout6;
        this.seventhStep = linearLayout7;
        this.sixthStep = linearLayout8;
        this.thirdStep = linearLayout9;
        this.tvGuideSeventhTextTipContent = textView;
        this.vwGuide = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogGuideBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogGuideBinding bind(View view) {
        View findChildViewById;
        int i = R.id.fifth_step;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.first_step;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.fourth_step;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.home_title_search_container;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout4 != null) {
                        i = R.id.icon_guide_seventh_text_tip_oversize;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.iv_guide_fifth;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.iv_guide_first;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.iv_guide_fourth;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.iv_guide_image;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            i = R.id.iv_guide_image_text;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView6 != null) {
                                                i = R.id.iv_guide_second;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView7 != null) {
                                                    i = R.id.iv_guide_seventh;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView8 != null) {
                                                        i = R.id.iv_guide_seventh_text_interest_content;
                                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView9 != null) {
                                                            i = R.id.iv_guide_sixth;
                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView10 != null) {
                                                                i = R.id.iv_guide_third;
                                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView11 != null) {
                                                                    i = R.id.second_step;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout5 != null) {
                                                                        i = R.id.second_step_1;
                                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayout6 != null) {
                                                                            i = R.id.seventh_step;
                                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout7 != null) {
                                                                                i = R.id.sixth_step;
                                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (linearLayout8 != null) {
                                                                                    i = R.id.third_step;
                                                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayout9 != null) {
                                                                                        i = R.id.tv_guide_seventh_text_tip_content;
                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vw_guide))) != null) {
                                                                                            return new DialogGuideBinding((RelativeLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, textView, findChildViewById);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
