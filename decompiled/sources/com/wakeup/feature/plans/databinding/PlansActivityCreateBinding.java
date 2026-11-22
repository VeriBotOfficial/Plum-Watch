package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansActivityCreateBinding implements ViewBinding {
    public final TextView btnCreate;
    public final EditText etPrompt;
    public final EditText etTitle;
    public final ImageView ivBack;
    public final ImageView ivTimeDropdown;
    public final LinearLayout plansHeader;
    private final LinearLayout rootView;
    public final LinearLayout rowCategory;
    public final LinearLayout rowCategorySection;
    public final LinearLayout rowCity;
    public final LinearLayout rowCitySection;
    public final LinearLayout rowFrequency;
    public final LinearLayout rowPromptSection;
    public final LinearLayout rowTime;
    public final NestedScrollView scrollContent;
    public final Spinner spTemplate;
    public final LinearLayout timeValueArea;
    public final TextView tvCategory;
    public final TextView tvCity;
    public final TextView tvCityError;
    public final TextView tvFrequency;
    public final TextView tvPageTitle;
    public final TextView tvPromptError;
    public final TextView tvPromptLabel;
    public final TextView tvTemplateSummary;
    public final TextView tvTime;
    public final TextView tvTitleError;

    private PlansActivityCreateBinding(LinearLayout linearLayout, TextView textView, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, NestedScrollView nestedScrollView, Spinner spinner, LinearLayout linearLayout10, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = linearLayout;
        this.btnCreate = textView;
        this.etPrompt = editText;
        this.etTitle = editText2;
        this.ivBack = imageView;
        this.ivTimeDropdown = imageView2;
        this.plansHeader = linearLayout2;
        this.rowCategory = linearLayout3;
        this.rowCategorySection = linearLayout4;
        this.rowCity = linearLayout5;
        this.rowCitySection = linearLayout6;
        this.rowFrequency = linearLayout7;
        this.rowPromptSection = linearLayout8;
        this.rowTime = linearLayout9;
        this.scrollContent = nestedScrollView;
        this.spTemplate = spinner;
        this.timeValueArea = linearLayout10;
        this.tvCategory = textView2;
        this.tvCity = textView3;
        this.tvCityError = textView4;
        this.tvFrequency = textView5;
        this.tvPageTitle = textView6;
        this.tvPromptError = textView7;
        this.tvPromptLabel = textView8;
        this.tvTemplateSummary = textView9;
        this.tvTime = textView10;
        this.tvTitleError = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static PlansActivityCreateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansActivityCreateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_activity_create, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansActivityCreateBinding bind(View view) {
        int i = R.id.btnCreate;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.etPrompt;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.etTitle;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText2 != null) {
                    i = R.id.ivBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivTimeDropdown;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.plans_header;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.rowCategory;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.rowCategorySection;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.rowCity;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout4 != null) {
                                            i = R.id.rowCitySection;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout5 != null) {
                                                i = R.id.rowFrequency;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout6 != null) {
                                                    i = R.id.rowPromptSection;
                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout7 != null) {
                                                        i = R.id.rowTime;
                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout8 != null) {
                                                            i = R.id.scrollContent;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                            if (nestedScrollView != null) {
                                                                i = R.id.spTemplate;
                                                                Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, i);
                                                                if (spinner != null) {
                                                                    i = R.id.timeValueArea;
                                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayout9 != null) {
                                                                        i = R.id.tvCategory;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tvCity;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tvCityError;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tvFrequency;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.tvPageTitle;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.tvPromptError;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.tvPromptLabel;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.tvTemplateSummary;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.tvTime;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.tvTitleError;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView11 != null) {
                                                                                                                return new PlansActivityCreateBinding((LinearLayout) view, textView, editText, editText2, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, nestedScrollView, spinner, linearLayout9, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
