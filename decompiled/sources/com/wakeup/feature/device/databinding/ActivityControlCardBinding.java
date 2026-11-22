package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.MyTitleBar;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ActivityControlCardBinding implements ViewBinding {
    public final Button btnGenerate;
    public final CheckBox cbOk;
    public final FrameLayout layoutCheck;
    public final LinearLayout llAgreement;
    public final MyTitleBar mTopBar;
    private final LinearLayoutCompat rootView;
    public final TextView text1;
    public final TextView text2;
    public final TextView tvNote;
    public final TextView tvTip;

    private ActivityControlCardBinding(LinearLayoutCompat linearLayoutCompat, Button button, CheckBox checkBox, FrameLayout frameLayout, LinearLayout linearLayout, MyTitleBar myTitleBar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayoutCompat;
        this.btnGenerate = button;
        this.cbOk = checkBox;
        this.layoutCheck = frameLayout;
        this.llAgreement = linearLayout;
        this.mTopBar = myTitleBar;
        this.text1 = textView;
        this.text2 = textView2;
        this.tvNote = textView3;
        this.tvTip = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static ActivityControlCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityControlCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_control_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityControlCardBinding bind(View view) {
        int i = R.id.btnGenerate;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.cbOk;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox != null) {
                i = R.id.layout_check;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.llAgreement;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.mTopBar;
                        MyTitleBar myTitleBar = (MyTitleBar) ViewBindings.findChildViewById(view, i);
                        if (myTitleBar != null) {
                            i = R.id.text1;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = R.id.text2;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.tvNote;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.tvTip;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new ActivityControlCardBinding((LinearLayoutCompat) view, button, checkBox, frameLayout, linearLayout, myTitleBar, textView, textView2, textView3, textView4);
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
