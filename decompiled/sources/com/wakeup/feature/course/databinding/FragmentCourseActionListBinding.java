package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class FragmentCourseActionListBinding implements ViewBinding {
    public final RecyclerView recyclerview;
    private final RecyclerView rootView;

    private FragmentCourseActionListBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerview = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentCourseActionListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCourseActionListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_course_action_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCourseActionListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentCourseActionListBinding(recyclerView, recyclerView);
    }
}
