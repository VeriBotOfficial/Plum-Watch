package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;

/* loaded from: classes17.dex */
public final class MiniModalDialogBinding implements ViewBinding {
    public final RelativeLayout dlgBtnView;
    public final TextView dlgLeftBtn;
    public final TextView dlgMsg;
    public final ScrollView dlgMsgScroll;
    public final TextView dlgRightBtn;
    public final TextView dlgTitle;
    public final View lineV;
    private final FrameLayout rootView;

    private MiniModalDialogBinding(FrameLayout frameLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, ScrollView scrollView, TextView textView3, TextView textView4, View view) {
        this.rootView = frameLayout;
        this.dlgBtnView = relativeLayout;
        this.dlgLeftBtn = textView;
        this.dlgMsg = textView2;
        this.dlgMsgScroll = scrollView;
        this.dlgRightBtn = textView3;
        this.dlgTitle = textView4;
        this.lineV = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static MiniModalDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniModalDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_modal_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniModalDialogBinding bind(View view) {
        View findChildViewById;
        int i = R.id.dlg_btn_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.dlg_left_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.dlg_msg;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.dlg_msg_scroll;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = R.id.dlg_right_btn;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.dlg_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_v))) != null) {
                                return new MiniModalDialogBinding((FrameLayout) view, relativeLayout, textView, textView2, scrollView, textView3, textView4, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
