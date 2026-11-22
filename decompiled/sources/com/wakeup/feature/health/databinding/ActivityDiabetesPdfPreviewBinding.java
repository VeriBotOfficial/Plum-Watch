package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityDiabetesPdfPreviewBinding implements ViewBinding {
    public final LinearLayout pdfPagesContainer;
    private final LinearLayout rootView;
    public final MyTitleBar titleBar;

    private ActivityDiabetesPdfPreviewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MyTitleBar myTitleBar) {
        this.rootView = linearLayout;
        this.pdfPagesContainer = linearLayout2;
        this.titleBar = myTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDiabetesPdfPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDiabetesPdfPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_diabetes_pdf_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDiabetesPdfPreviewBinding bind(View view) {
        int i = R.id.pdf_pages_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.title_bar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                return new ActivityDiabetesPdfPreviewBinding((LinearLayout) view, linearLayout, myTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
