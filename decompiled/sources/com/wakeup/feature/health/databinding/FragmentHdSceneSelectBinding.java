package com.wakeup.feature.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.commonui.ad.ScenarioBannerView;
import com.wakeup.feature.health.R;

/* loaded from: classes3.dex */
public final class FragmentHdSceneSelectBinding implements ViewBinding {
    public final TextView desc;
    public final LayoutHdNavBinding nav;
    public final LinearLayout pageRoot;
    private final LinearLayout rootView;
    public final LayoutHdSceneItemBinding sceneExam;
    public final LayoutHdSceneItemBinding sceneFatburn;
    public final LayoutHdSceneItemBinding sceneRecovery;
    public final LayoutHdSceneItemBinding sceneSleep;
    public final NestedScrollView scroll;
    public final ScenarioBannerView viewScenarioBanner;

    private FragmentHdSceneSelectBinding(LinearLayout linearLayout, TextView textView, LayoutHdNavBinding layoutHdNavBinding, LinearLayout linearLayout2, LayoutHdSceneItemBinding layoutHdSceneItemBinding, LayoutHdSceneItemBinding layoutHdSceneItemBinding2, LayoutHdSceneItemBinding layoutHdSceneItemBinding3, LayoutHdSceneItemBinding layoutHdSceneItemBinding4, NestedScrollView nestedScrollView, ScenarioBannerView scenarioBannerView) {
        this.rootView = linearLayout;
        this.desc = textView;
        this.nav = layoutHdNavBinding;
        this.pageRoot = linearLayout2;
        this.sceneExam = layoutHdSceneItemBinding;
        this.sceneFatburn = layoutHdSceneItemBinding2;
        this.sceneRecovery = layoutHdSceneItemBinding3;
        this.sceneSleep = layoutHdSceneItemBinding4;
        this.scroll = nestedScrollView;
        this.viewScenarioBanner = scenarioBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHdSceneSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHdSceneSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_hd_scene_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHdSceneSelectBinding bind(View view) {
        View findChildViewById;
        int i = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.nav))) != null) {
            LayoutHdNavBinding bind = LayoutHdNavBinding.bind(findChildViewById);
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.scene_exam;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                LayoutHdSceneItemBinding bind2 = LayoutHdSceneItemBinding.bind(findChildViewById2);
                i = R.id.scene_fatburn;
                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (findChildViewById3 != null) {
                    LayoutHdSceneItemBinding bind3 = LayoutHdSceneItemBinding.bind(findChildViewById3);
                    i = R.id.scene_recovery;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (findChildViewById4 != null) {
                        LayoutHdSceneItemBinding bind4 = LayoutHdSceneItemBinding.bind(findChildViewById4);
                        i = R.id.scene_sleep;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, i);
                        if (findChildViewById5 != null) {
                            LayoutHdSceneItemBinding bind5 = LayoutHdSceneItemBinding.bind(findChildViewById5);
                            i = R.id.scroll;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.view_scenario_banner;
                                ScenarioBannerView scenarioBannerView = (ScenarioBannerView) ViewBindings.findChildViewById(view, i);
                                if (scenarioBannerView != null) {
                                    return new FragmentHdSceneSelectBinding(linearLayout, textView, bind, linearLayout, bind2, bind3, bind4, bind5, nestedScrollView, scenarioBannerView);
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
