package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivitySafeBinding implements ViewBinding {
    public final Button btnExit;
    public final TextView btnLogout;
    public final TextView btnModifyPhone;
    public final TextView btnUpdatePwd;
    public final View gapLine;
    private final NestedScrollView rootView;
    public final MyTitleBar topBar;
    public final TextView tvPhone;

    private ActivitySafeBinding(NestedScrollView nestedScrollView, Button button, TextView textView, TextView textView2, TextView textView3, View view, MyTitleBar myTitleBar, TextView textView4) {
        this.rootView = nestedScrollView;
        this.btnExit = button;
        this.btnLogout = textView;
        this.btnModifyPhone = textView2;
        this.btnUpdatePwd = textView3;
        this.gapLine = view;
        this.topBar = myTitleBar;
        this.tvPhone = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static ActivitySafeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySafeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_safe, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySafeBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnExit;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.btnLogout;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.btnModifyPhone;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.btnUpdatePwd;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.gap_line))) != null) {
                        i = R.id.topBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.tvPhone;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ActivitySafeBinding((NestedScrollView) view, button, textView, textView2, textView3, findChildViewById, myTitleBar, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
