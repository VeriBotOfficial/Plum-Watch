package com.wakeup.howear.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.howear.R;

/* loaded from: classes3.dex */
public final class ActivityProtocolBinding implements ViewBinding {
    public final View line1;
    public final View line2;
    public final View lineAuthenProtocal;
    private final LinearLayout rootView;
    public final MyTitleBar topBar;
    public final TextView tvAuthenProtocal;
    public final TextView tvInfoProtocal;
    public final TextView tvPaidVideoProtocal;
    public final TextView tvPrivacy;
    public final TextView tvSdkProtocal;
    public final TextView tvUser;
    public final TextView tvVideoProtocal;

    private ActivityProtocolBinding(LinearLayout linearLayout, View view, View view2, View view3, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = linearLayout;
        this.line1 = view;
        this.line2 = view2;
        this.lineAuthenProtocal = view3;
        this.topBar = myTitleBar;
        this.tvAuthenProtocal = textView;
        this.tvInfoProtocal = textView2;
        this.tvPaidVideoProtocal = textView3;
        this.tvPrivacy = textView4;
        this.tvSdkProtocal = textView5;
        this.tvUser = textView6;
        this.tvVideoProtocal = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProtocolBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProtocolBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_protocol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityProtocolBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.line1;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.lineAuthenProtocal))) != null) {
            i = R.id.topBar;
            MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
            if (myTitleBar != null) {
                i = R.id.tvAuthenProtocal;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tvInfoProtocal;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tvPaidVideoProtocal;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tvPrivacy;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.tvSdkProtocal;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = R.id.tv_user;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = R.id.tvVideoProtocal;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            return new ActivityProtocolBinding((LinearLayout) view, findChildViewById3, findChildViewById, findChildViewById2, myTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                        }
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
