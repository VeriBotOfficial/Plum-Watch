package com.wakeup.feature.course.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.course.R;

/* loaded from: classes2.dex */
public final class FragmentCourseIntroduceBinding implements ViewBinding {
    public final TextView introduce1;
    public final TextView introduce2;
    public final TextView introduce3;
    public final TextView introduce4;
    private final NestedScrollView rootView;

    private FragmentCourseIntroduceBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = nestedScrollView;
        this.introduce1 = textView;
        this.introduce2 = textView2;
        this.introduce3 = textView3;
        this.introduce4 = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentCourseIntroduceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCourseIntroduceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_course_introduce, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCourseIntroduceBinding bind(View view) {
        int i = R.id.introduce_1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.introduce_2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.introduce_3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.introduce_4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        return new FragmentCourseIntroduceBinding((NestedScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
