package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogHealthReportBinding implements ViewBinding {
    public final Button btGoCheckData;
    public final Button btGoGenerateReport;
    public final ImageView ivImage;
    public final LinearLayout llPair;
    public final RecyclerView mRecyclerView;
    private final LinearLayout rootView;
    public final TextView tvTips;
    public final TextView tvTips2;
    public final ImageView tvTitle;

    private DialogHealthReportBinding(LinearLayout linearLayout, Button button, Button button2, ImageView imageView, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, ImageView imageView2) {
        this.rootView = linearLayout;
        this.btGoCheckData = button;
        this.btGoGenerateReport = button2;
        this.ivImage = imageView;
        this.llPair = linearLayout2;
        this.mRecyclerView = recyclerView;
        this.tvTips = textView;
        this.tvTips2 = textView2;
        this.tvTitle = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogHealthReportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHealthReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_health_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogHealthReportBinding bind(View view) {
        int i = R.id.bt_go_check_data;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.bt_go_generate_report;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
            if (button2 != null) {
                i = R.id.iv_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ll_pair;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.mRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = R.id.tv_tips;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.tv_tips2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tv_title;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        return new DialogHealthReportBinding((LinearLayout) view, button, button2, imageView, linearLayout, recyclerView, textView, textView2, imageView2);
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
