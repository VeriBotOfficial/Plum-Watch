package com.wakeup.module.jacket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.module.jacket.R;

/* loaded from: classes4.dex */
public final class FragmentMDOldBinding implements ViewBinding {
    public final View blackLine;
    public final ScrollView mROldRv;
    public final AppCompatTextView mSTv;
    public final ScrollView mTransRv;
    public final AppCompatTextView mTransTv;
    private final LinearLayoutCompat rootView;

    private FragmentMDOldBinding(LinearLayoutCompat linearLayoutCompat, View view, ScrollView scrollView, AppCompatTextView appCompatTextView, ScrollView scrollView2, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.blackLine = view;
        this.mROldRv = scrollView;
        this.mSTv = appCompatTextView;
        this.mTransRv = scrollView2;
        this.mTransTv = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static FragmentMDOldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMDOldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_m_d_old, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMDOldBinding bind(View view) {
        int i = R.id.black_line;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.m_r_old_rv;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
            if (scrollView != null) {
                i = R.id.m_s_tv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = R.id.m_trans_rv;
                    ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView2 != null) {
                        i = R.id.m_trans_tv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new FragmentMDOldBinding((LinearLayoutCompat) view, findChildViewById, scrollView, appCompatTextView, scrollView2, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
