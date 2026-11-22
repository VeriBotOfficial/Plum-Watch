package com.wakeup.feature.newsdaily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.newsdaily.R;

/* loaded from: classes3.dex */
public final class NewsSheetHistoryBinding implements ViewBinding {
    public final ImageView btnCloseSheet;
    private final LinearLayout rootView;
    public final RecyclerView rvHistory;

    private NewsSheetHistoryBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.btnCloseSheet = imageView;
        this.rvHistory = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NewsSheetHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NewsSheetHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_sheet_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static NewsSheetHistoryBinding bind(View view) {
        int i = R.id.btnCloseSheet;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.rvHistory;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new NewsSheetHistoryBinding((LinearLayout) view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
