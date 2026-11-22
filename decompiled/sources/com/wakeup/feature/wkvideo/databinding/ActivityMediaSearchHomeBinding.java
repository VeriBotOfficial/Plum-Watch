package com.wakeup.feature.wkvideo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.wkvideo.R;

/* loaded from: classes3.dex */
public final class ActivityMediaSearchHomeBinding implements ViewBinding {
    public final ImageView back;
    public final View contentBg;
    public final LinearLayout hotSearchList;
    public final TextView hotSearchTabText;
    public final ImageView inputCancelIv;
    public final EditText inputEt;
    private final ConstraintLayout rootView;
    public final View searchBg;
    public final ScrollView searchHistoryAndRedLayout;
    public final FrameLayout searchHistoryContainer;
    public final ImageView searchIcon;
    public final FrameLayout searchResultContainer;
    public final View statusHolderView;

    private ActivityMediaSearchHomeBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, LinearLayout linearLayout, TextView textView, ImageView imageView2, EditText editText, View view2, ScrollView scrollView, FrameLayout frameLayout, ImageView imageView3, FrameLayout frameLayout2, View view3) {
        this.rootView = constraintLayout;
        this.back = imageView;
        this.contentBg = view;
        this.hotSearchList = linearLayout;
        this.hotSearchTabText = textView;
        this.inputCancelIv = imageView2;
        this.inputEt = editText;
        this.searchBg = view2;
        this.searchHistoryAndRedLayout = scrollView;
        this.searchHistoryContainer = frameLayout;
        this.searchIcon = imageView3;
        this.searchResultContainer = frameLayout2;
        this.statusHolderView = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMediaSearchHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMediaSearchHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_media_search_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMediaSearchHomeBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.content_bg))) != null) {
            i = R.id.hot_search_list;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.hot_search_tab_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.input_cancel_iv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.input_et;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.search_bg))) != null) {
                            i = R.id.search_history_and_red_layout;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                            if (scrollView != null) {
                                i = R.id.search_history_container;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.search_icon;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        i = R.id.search_result_container;
                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout2 != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.status_holder_view))) != null) {
                                            return new ActivityMediaSearchHomeBinding((ConstraintLayout) view, imageView, findChildViewById, linearLayout, textView, imageView2, editText, findChildViewById2, scrollView, frameLayout, imageView3, frameLayout2, findChildViewById3);
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
