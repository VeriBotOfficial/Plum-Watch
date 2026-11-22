package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class DialogEditMetBinding implements ViewBinding {
    public final TextView btnLeft;
    public final TextView btnRight;
    public final AppCompatTextView metData;
    private final LinearLayoutCompat rootView;
    public final SeekBar seekBar;
    public final View space;
    public final AppCompatTextView title;

    private DialogEditMetBinding(LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, SeekBar seekBar, View view, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.btnLeft = textView;
        this.btnRight = textView2;
        this.metData = appCompatTextView;
        this.seekBar = seekBar;
        this.space = view;
        this.title = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static DialogEditMetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogEditMetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_edit_met, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogEditMetBinding bind(View view) {
        View findChildViewById;
        int i = R.id.btn_left;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_right;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.met_data;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = R.id.seek_bar;
                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                    if (seekBar != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.space))) != null) {
                        i = R.id.title;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            return new DialogEditMetBinding((LinearLayoutCompat) view, textView, textView2, appCompatTextView, seekBar, findChildViewById, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
