package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogBotPayWaySelectBinding implements ViewBinding {
    public final TextView btnCancel;
    public final LinearLayout llAlipay;
    public final LinearLayout llPaypal;
    public final LinearLayout llWeChat;
    private final FrameLayout rootView;

    private DialogBotPayWaySelectBinding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.rootView = frameLayout;
        this.btnCancel = textView;
        this.llAlipay = linearLayout;
        this.llPaypal = linearLayout2;
        this.llWeChat = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static DialogBotPayWaySelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBotPayWaySelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bot_pay_way_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBotPayWaySelectBinding bind(View view) {
        int i = R.id.btnCancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.llAlipay;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.llPaypal;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.llWeChat;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        return new DialogBotPayWaySelectBinding((FrameLayout) view, textView, linearLayout, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
