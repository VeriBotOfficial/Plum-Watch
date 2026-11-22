package com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* loaded from: classes17.dex */
public class ViewPagerAdapter extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List<View> f13035a;

    public ViewPagerAdapter(List<View> list) {
        this.f13035a = list;
    }

    public View a(int i) {
        return this.f13035a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f13035a.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public View instantiateItem(ViewGroup viewGroup, int i) {
        View view = this.f13035a.get(i);
        viewGroup.addView(view);
        return view;
    }
}
