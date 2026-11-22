package com.wakeup.feature.plans.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.plans.R;

/* loaded from: classes3.dex */
public final class PlansCityPickerPopupBinding implements ViewBinding {
    public final TextView btnCitySearchConfirm;
    public final TextView btnWheelConfirm;
    public final LinearLayout cityPickerColumns;
    public final FrameLayout cityPickerWheel;
    public final EditText etCitySearch;
    public final RecyclerView lvCity;
    public final RecyclerView lvRegion;
    private final LinearLayout rootView;
    public final View selectionHighlight;
    public final TextView tvCitySearchHint;

    private PlansCityPickerPopupBinding(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, FrameLayout frameLayout, EditText editText, RecyclerView recyclerView, RecyclerView recyclerView2, View view, TextView textView3) {
        this.rootView = linearLayout;
        this.btnCitySearchConfirm = textView;
        this.btnWheelConfirm = textView2;
        this.cityPickerColumns = linearLayout2;
        this.cityPickerWheel = frameLayout;
        this.etCitySearch = editText;
        this.lvCity = recyclerView;
        this.lvRegion = recyclerView2;
        this.selectionHighlight = view;
        this.tvCitySearchHint = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static PlansCityPickerPopupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlansCityPickerPopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plans_city_picker_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlansCityPickerPopupBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btnCitySearchConfirm;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btnWheelConfirm;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.cityPickerColumns;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.cityPickerWheel;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.etCitySearch;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText != null) {
                            i = R.id.lvCity;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.lvRegion;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.selectionHighlight))) != null) {
                                    i = R.id.tvCitySearchHint;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        return new PlansCityPickerPopupBinding((LinearLayout) view, textView, textView2, linearLayout, frameLayout, editText, recyclerView, recyclerView2, findChildViewById, textView3);
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
