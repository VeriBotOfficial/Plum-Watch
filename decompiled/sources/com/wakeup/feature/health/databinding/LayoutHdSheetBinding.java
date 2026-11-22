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
public final class LayoutHdSheetBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final TextView sheetCancel;
    public final TextView sheetCurrent;
    public final TextView sheetExit;
    public final FrameLayout sheetMask;
    public final LinearLayout sheetPanel;
    public final LinearLayout sheetSwitch;
    public final TextView sheetSwitchLabel;
    public final TextView sheetTitle;

    private LayoutHdSheetBinding(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.sheetCancel = textView;
        this.sheetCurrent = textView2;
        this.sheetExit = textView3;
        this.sheetMask = frameLayout2;
        this.sheetPanel = linearLayout;
        this.sheetSwitch = linearLayout2;
        this.sheetSwitchLabel = textView4;
        this.sheetTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static LayoutHdSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutHdSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_hd_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutHdSheetBinding bind(View view) {
        int i = R.id.sheet_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.sheet_current;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.sheet_exit;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.sheet_panel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.sheet_switch;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.sheet_switch_label;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.sheet_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    return new LayoutHdSheetBinding(frameLayout, textView, textView2, textView3, frameLayout, linearLayout, linearLayout2, textView4, textView5);
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
