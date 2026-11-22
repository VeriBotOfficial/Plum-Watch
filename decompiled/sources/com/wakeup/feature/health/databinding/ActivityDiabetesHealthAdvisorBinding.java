package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class ActivityDiabetesHealthAdvisorBinding implements ViewBinding {
    public final TextView btnSend;
    public final EditText etInput;
    public final LinearLayout messagesContainer;
    private final LinearLayout rootView;
    public final ScrollView scrollMessages;
    public final MyTitleBar titleBar;
    public final TextView tvAdvisorSubtitle;
    public final TextView tvAdvisorTag;

    private ActivityDiabetesHealthAdvisorBinding(LinearLayout linearLayout, TextView textView, EditText editText, LinearLayout linearLayout2, ScrollView scrollView, MyTitleBar myTitleBar, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnSend = textView;
        this.etInput = editText;
        this.messagesContainer = linearLayout2;
        this.scrollMessages = scrollView;
        this.titleBar = myTitleBar;
        this.tvAdvisorSubtitle = textView2;
        this.tvAdvisorTag = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDiabetesHealthAdvisorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDiabetesHealthAdvisorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_diabetes_health_advisor, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDiabetesHealthAdvisorBinding bind(View view) {
        int i = R.id.btn_send;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.et_input;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.messages_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.scroll_messages;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = R.id.title_bar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.tv_advisor_subtitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_advisor_tag;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new ActivityDiabetesHealthAdvisorBinding((LinearLayout) view, textView, editText, linearLayout, scrollView, myTitleBar, textView2, textView3);
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
