package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityDiabetesRiskFormBinding implements ViewBinding {
    public final View barStep1;
    public final View barStep2;
    public final View barStep3;
    public final TextView btnFailedManual;
    public final TextView btnFailedReupload;
    public final TextView btnNext;
    public final TextView btnReselectFile;
    public final TextView btnStartParse;
    public final TextView btnUploadManual;
    public final LinearLayout cardManualMode;
    public final LinearLayout cardUploadMode;
    public final LinearLayout layoutBottom;
    public final LinearLayout layoutProcessing;
    public final LinearLayout layoutProgress;
    public final LinearLayout layoutStep3;
    public final LinearLayout lifestyleFieldsContainer;
    public final LinearLayout manualFieldsContainer;
    public final LinearLayout parsePreviewContainer;
    public final ProgressBar progressParse;
    private final LinearLayout rootView;
    public final ScrollView scrollLifestyle;
    public final ScrollView scrollManual;
    public final ScrollView scrollModeSelect;
    public final ScrollView scrollUpload;
    public final ScrollView scrollUploadFailed;
    public final ScrollView scrollUploadReview;
    public final MyTitleBar titleBar;
    public final TextView tvFileReady;
    public final TextView tvLifestyleSubtitle;
    public final TextView tvParseSuccessTitle;
    public final TextView tvProcessingLabel;
    public final TextView tvProcessingPercent;
    public final TextView tvStep1;
    public final TextView tvStep2;
    public final TextView tvStep3;
    public final FrameLayout uploadEmptyZone;
    public final LinearLayout uploadFileCard;
    public final LinearLayout uploadFilesContainer;

    private ActivityDiabetesRiskFormBinding(LinearLayout linearLayout, View view, View view2, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, ProgressBar progressBar, ScrollView scrollView, ScrollView scrollView2, ScrollView scrollView3, ScrollView scrollView4, ScrollView scrollView5, ScrollView scrollView6, MyTitleBar myTitleBar, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, FrameLayout frameLayout, LinearLayout linearLayout11, LinearLayout linearLayout12) {
        this.rootView = linearLayout;
        this.barStep1 = view;
        this.barStep2 = view2;
        this.barStep3 = view3;
        this.btnFailedManual = textView;
        this.btnFailedReupload = textView2;
        this.btnNext = textView3;
        this.btnReselectFile = textView4;
        this.btnStartParse = textView5;
        this.btnUploadManual = textView6;
        this.cardManualMode = linearLayout2;
        this.cardUploadMode = linearLayout3;
        this.layoutBottom = linearLayout4;
        this.layoutProcessing = linearLayout5;
        this.layoutProgress = linearLayout6;
        this.layoutStep3 = linearLayout7;
        this.lifestyleFieldsContainer = linearLayout8;
        this.manualFieldsContainer = linearLayout9;
        this.parsePreviewContainer = linearLayout10;
        this.progressParse = progressBar;
        this.scrollLifestyle = scrollView;
        this.scrollManual = scrollView2;
        this.scrollModeSelect = scrollView3;
        this.scrollUpload = scrollView4;
        this.scrollUploadFailed = scrollView5;
        this.scrollUploadReview = scrollView6;
        this.titleBar = myTitleBar;
        this.tvFileReady = textView7;
        this.tvLifestyleSubtitle = textView8;
        this.tvParseSuccessTitle = textView9;
        this.tvProcessingLabel = textView10;
        this.tvProcessingPercent = textView11;
        this.tvStep1 = textView12;
        this.tvStep2 = textView13;
        this.tvStep3 = textView14;
        this.uploadEmptyZone = frameLayout;
        this.uploadFileCard = linearLayout11;
        this.uploadFilesContainer = linearLayout12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDiabetesRiskFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDiabetesRiskFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_diabetes_risk_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDiabetesRiskFormBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.bar_step_1;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bar_step_2))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.bar_step_3))) != null) {
            i = R.id.btn_failed_manual;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.btn_failed_reupload;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.btn_next;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.btn_reselect_file;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.btn_start_parse;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.btn_upload_manual;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = R.id.card_manual_mode;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = R.id.card_upload_mode;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.layout_bottom;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout3 != null) {
                                                i = R.id.layout_processing;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout4 != null) {
                                                    i = R.id.layout_progress;
                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.layout_step_3;
                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.lifestyle_fields_container;
                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout7 != null) {
                                                                i = R.id.manual_fields_container;
                                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayout8 != null) {
                                                                    i = R.id.parse_preview_container;
                                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout9 != null) {
                                                                        i = R.id.progress_parse;
                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                                        if (progressBar != null) {
                                                                            i = R.id.scroll_lifestyle;
                                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                            if (scrollView != null) {
                                                                                i = R.id.scroll_manual;
                                                                                ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                if (scrollView2 != null) {
                                                                                    i = R.id.scroll_mode_select;
                                                                                    ScrollView scrollView3 = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                    if (scrollView3 != null) {
                                                                                        i = R.id.scroll_upload;
                                                                                        ScrollView scrollView4 = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                        if (scrollView4 != null) {
                                                                                            i = R.id.scroll_upload_failed;
                                                                                            ScrollView scrollView5 = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                            if (scrollView5 != null) {
                                                                                                i = R.id.scroll_upload_review;
                                                                                                ScrollView scrollView6 = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                if (scrollView6 != null) {
                                                                                                    i = R.id.title_bar;
                                                                                                    MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                                                                                                    if (myTitleBar != null) {
                                                                                                        i = R.id.tv_file_ready;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView7 != null) {
                                                                                                            i = R.id.tv_lifestyle_subtitle;
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView8 != null) {
                                                                                                                i = R.id.tv_parse_success_title;
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = R.id.tv_processing_label;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = R.id.tv_processing_percent;
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i = R.id.tv_step_1;
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i = R.id.tv_step_2;
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i = R.id.tv_step_3;
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = R.id.upload_empty_zone;
                                                                                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (frameLayout != null) {
                                                                                                                                            i = R.id.upload_file_card;
                                                                                                                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                                i = R.id.upload_files_container;
                                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (linearLayout11 != null) {
                                                                                                                                                    return new ActivityDiabetesRiskFormBinding((LinearLayout) view, findChildViewById3, findChildViewById, findChildViewById2, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, progressBar, scrollView, scrollView2, scrollView3, scrollView4, scrollView5, scrollView6, myTitleBar, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, frameLayout, linearLayout10, linearLayout11);
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
