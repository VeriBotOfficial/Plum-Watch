package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ItemWeightReferenceLayoutBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tv1;
    public final TextView tv10;
    public final TextView tv11;
    public final TextView tv12;
    public final TextView tv2;
    public final TextView tv3;
    public final TextView tv4;
    public final TextView tv5;
    public final TextView tv6;
    public final TextView tv7;
    public final TextView tv8;
    public final TextView tv9;

    private ItemWeightReferenceLayoutBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = linearLayout;
        this.tv1 = textView;
        this.tv10 = textView2;
        this.tv11 = textView3;
        this.tv12 = textView4;
        this.tv2 = textView5;
        this.tv3 = textView6;
        this.tv4 = textView7;
        this.tv5 = textView8;
        this.tv6 = textView9;
        this.tv7 = textView10;
        this.tv8 = textView11;
        this.tv9 = textView12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemWeightReferenceLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWeightReferenceLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_weight_reference_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemWeightReferenceLayoutBinding bind(View view) {
        int i = R.id.tv1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.tv10;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.tv11;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.tv12;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.tv2;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = R.id.tv3;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = R.id.tv4;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    i = R.id.tv5;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView8 != null) {
                                        i = R.id.tv6;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView9 != null) {
                                            i = R.id.tv7;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView10 != null) {
                                                i = R.id.tv8;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView11 != null) {
                                                    i = R.id.tv9;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView12 != null) {
                                                        return new ItemWeightReferenceLayoutBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
