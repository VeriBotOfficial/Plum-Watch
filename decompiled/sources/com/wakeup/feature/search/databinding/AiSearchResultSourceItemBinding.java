package com.wakeup.feature.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.search.R;

/* loaded from: classes3.dex */
public final class AiSearchResultSourceItemBinding implements ViewBinding {
    public final LinearLayout llAiSearchWebSource;
    private final LinearLayout rootView;
    public final AppCompatTextView tvAiSearchSourceItemNum;
    public final AppCompatTextView tvSourceContent;
    public final AppCompatTextView tvSourceTitle;

    private AiSearchResultSourceItemBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = linearLayout;
        this.llAiSearchWebSource = linearLayout2;
        this.tvAiSearchSourceItemNum = appCompatTextView;
        this.tvSourceContent = appCompatTextView2;
        this.tvSourceTitle = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static AiSearchResultSourceItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AiSearchResultSourceItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ai_search_result_source_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AiSearchResultSourceItemBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.tv_ai_search_source_item_num;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R.id.tv_source_content;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R.id.tv_source_title;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    return new AiSearchResultSourceItemBinding(linearLayout, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
