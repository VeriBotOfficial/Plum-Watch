package com.phancy.mini.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phancy.mini.R;
import com.phancy.mini.widget.TitleBar;

/* loaded from: classes17.dex */
public final class MiniSettingAuthPanelBinding implements ViewBinding {
    public final RelativeLayout acceptBackgroundButton;
    public final TextView acceptBackgroundText;
    public final RelativeLayout acceptButton;
    public final TextView acceptText;
    public final TextView authDesc;
    public final RelativeLayout rejectButton;
    public final TextView rejectText;
    private final LinearLayout rootView;
    public final View scopeBluetoothLine;
    public final TitleBar titleBar;

    private MiniSettingAuthPanelBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, RelativeLayout relativeLayout3, TextView textView4, View view, TitleBar titleBar) {
        this.rootView = linearLayout;
        this.acceptBackgroundButton = relativeLayout;
        this.acceptBackgroundText = textView;
        this.acceptButton = relativeLayout2;
        this.acceptText = textView2;
        this.authDesc = textView3;
        this.rejectButton = relativeLayout3;
        this.rejectText = textView4;
        this.scopeBluetoothLine = view;
        this.titleBar = titleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MiniSettingAuthPanelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MiniSettingAuthPanelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mini_setting_auth_panel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MiniSettingAuthPanelBinding bind(View view) {
        View findChildViewById;
        int i = R.id.accept_background_button;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.accept_background_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.accept_button;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.accept_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.auth_desc;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.reject_button;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout3 != null) {
                                i = R.id.reject_text;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.scope_bluetooth_line))) != null) {
                                    i = R.id.title_bar;
                                    TitleBar titleBar = (TitleBar) ViewBindings.findChildViewById(view, i);
                                    if (titleBar != null) {
                                        return new MiniSettingAuthPanelBinding((LinearLayout) view, relativeLayout, textView, relativeLayout2, textView2, textView3, relativeLayout3, textView4, findChildViewById, titleBar);
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
